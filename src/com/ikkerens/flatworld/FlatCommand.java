/*    */ package com.ikkerens.flatworld;
/*    */ 
/*    */ import com.mbserver.api.CommandExecutor;
/*    */ import com.mbserver.api.CommandSender;
/*    */ import com.mbserver.api.Server;
/*    */ 
/*    */ public class FlatCommand
/*    */   implements CommandExecutor
/*    */ {
/*    */   private final Server server;
/*    */ 
/*    */   public FlatCommand(Server server)
/*    */   {
/* 11 */     this.server = server;
/*    */   }
/*    */ 
/*    */   public void execute(String command, CommandSender sender, String[] args, String label)
/*    */   {
/* 16 */     if (!sender.hasPermission("flatworld.create")) {
/* 17 */       sender.sendMessage("You do not have permission to use /" + label);
/* 18 */       return;
/*    */     }
/*    */ 
/* 21 */     if (args.length != 1) {
/* 22 */       sender.sendMessage("Usage: /" + label + " <worldname>");
/* 23 */       return;
/*    */     }
/*    */ 
/* 26 */     sender.sendMessage("Creating new flat world...");
/* 27 */     new Thread(args, sender)
/*    */     {
/*    */       public void run() {
/* 30 */         FlatCommand.this.server.createWorld(this.val$args[0], 0L, new FlatGenerator());
/* 31 */         this.val$sender.sendMessage("Finished creating flat world.");
/*    */       }
/*    */     }
/* 33 */     .start();
/*    */   }
/*    */ }

/* Location:           C:\Users\Rens\Downloads\FlatWorld.jar
 * Qualified Name:     com.ikkerens.flatworld.FlatCommand
 * JD-Core Version:    0.6.0
 */