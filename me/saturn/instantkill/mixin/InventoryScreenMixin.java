/*    */ package me.saturn.instantkill.mixin;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import me.saturn.instantkill.InstantKill;
/*    */ import net.minecraft.class_1657;
/*    */ import net.minecraft.class_2561;
/*    */ import net.minecraft.class_364;
/*    */ import net.minecraft.class_4185;
/*    */ import net.minecraft.class_437;
/*    */ import net.minecraft.class_4587;
/*    */ import net.minecraft.class_490;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ 
/*    */ @Mixin({class_490.class})
/*    */ public class InventoryScreenMixin
/*    */   extends class_437
/*    */ {
/*    */   protected InventoryScreenMixin(class_2561 title) {
/* 23 */     super(title);
/*    */   }
/*    */   
/*    */   @Inject(method = {"init"}, at = {@At("HEAD")})
/*    */   public void onInit(CallbackInfo ci) {
/* 28 */     class_4185 toggle = new class_4185(1, 1, 100, 20, class_2561.method_30163("InstantKill: " + (InstantKill.shouldAddVelocity ? "On" : "Off")), b -> {
/*    */           InstantKill.shouldAddVelocity = !InstantKill.shouldAddVelocity;
/*    */           InstantKill.mc.method_1507((class_437)new class_490((class_1657)InstantKill.mc.field_1724));
/*    */         });
/* 32 */     method_37063((class_364)toggle);
/*    */   }
/*    */   
/*    */   @Inject(method = {"render"}, at = {@At("HEAD")})
/*    */   public void onRender(class_4587 matrices, int a, int b, float d, CallbackInfo ci) {
/* 37 */     int pp = this.field_22793.method_1727("Made by Saturn5Vfive <3") / 2;
/* 38 */     method_27534(matrices, this.field_22793, class_2561.method_30163("Made by Saturn5Vfive <3"), pp + 5, InstantKill.mc.method_22683().method_4502() - 10, (new Color(255, 255, 255, 255)).getRGB());
/*    */   }
/*    */ }


/* Location:              C:\Users\Rohit Chowdhary\Downloads\instakill\instantkill-1.0.0.jar!\me\saturn\instantkill\mixin\InventoryScreenMixin.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */