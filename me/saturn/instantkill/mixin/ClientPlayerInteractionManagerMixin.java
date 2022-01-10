/*    */ package me.saturn.instantkill.mixin;
/*    */ 
/*    */ import me.saturn.instantkill.InstantKill;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_1802;
/*    */ import net.minecraft.class_636;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({class_636.class})
/*    */ public class ClientPlayerInteractionManagerMixin
/*    */ {
/*    */   @Inject(at = {@At("HEAD")}, method = {"stopUsingItem"})
/*    */   private void onStopUsingItem(class_1657 player, CallbackInfo ci) {
/* 17 */     if (player.method_31548().method_7391().method_7909().equals(class_1802.field_8102))
/* 18 */       InstantKill.addVelocityToPlayer(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Rohit Chowdhary\Downloads\instakill\instantkill-1.0.0.jar!\me\saturn\instantkill\mixin\ClientPlayerInteractionManagerMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */