/*    */ package com.ikkerens.flatworld;
/*    */ 
/*    */ import com.mbserver.api.dynamic.WorldGenerator;
/*    */ import com.mbserver.api.game.Chunk;
/*    */ import com.mbserver.api.game.Location;
/*    */ import com.mbserver.api.game.Material;
/*    */ 
/*    */ public class FlatGenerator extends WorldGenerator
/*    */ {
/*    */   private final short bedrock;
/*    */   private final short dirt;
/*    */   private final short grass;
/*    */ 
/*    */   public FlatGenerator()
/*    */   {
/* 11 */     this.bedrock = Material.BEDROCK.getID();
/* 12 */     this.dirt = Material.DIRT.getID();
/* 13 */     this.grass = Material.GRASS.getID();
/*    */   }
/*    */ 
/*    */   public void setSeed(long seed)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void fillChunk(Chunk chunk)
/*    */   {
/* 22 */     if (chunk.getLocation().getBlockY() != 0) {
/* 23 */       return;
/*    */     }
/* 25 */     for (int x = 0; x < 16; x++)
/* 26 */       for (int z = 0; z < 16; z++) {
/* 27 */         chunk.set(x, 0, z, this.bedrock);
/* 28 */         for (int y = 1; y <= 3; y++)
/* 29 */           chunk.set(x, y, z, this.dirt);
/* 30 */         chunk.set(x, 4, z, this.grass);
/*    */       }
/*    */   }
/*    */ }

/* Location:           C:\Users\Rens\Downloads\FlatWorld.jar
 * Qualified Name:     com.ikkerens.flatworld.FlatGenerator
 * JD-Core Version:    0.6.0
 */