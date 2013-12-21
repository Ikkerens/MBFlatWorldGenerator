/*    */ package com.ikkerens.flatworld;
/*    */ 
/*    */ import com.mbserver.api.MBServerPlugin;
/*    */ import com.mbserver.api.Manifest;
/*    */ import com.mbserver.api.PluginManager;
/*    */ 
/*    */ @Manifest(name="FlatWorld")
/*    */ public class Plugin extends MBServerPlugin
/*    */ {
/*    */   public void onEnable()
/*    */   {
/* 10 */     getPluginManager().registerCommand("flatworld", new String[] { "fw" }, new FlatCommand(getServer()));
/*    */   }
/*    */ }

/* Location:           C:\Users\Rens\Downloads\FlatWorld.jar
 * Qualified Name:     com.ikkerens.flatworld.Plugin
 * JD-Core Version:    0.6.0
 */