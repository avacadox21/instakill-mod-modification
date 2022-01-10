/*    */ package me.saturn.instantkill;
/*    */ import net.fabricmc.api.ModInitializer;
/*    */ import net.minecraft.class_1297;
/*    */ import net.minecraft.class_2596;
/*    */ import net.minecraft.class_2828;
/*    */ import net.minecraft.class_2848;
/*    */ import net.minecraft.class_310;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ public class InstantKill implements ModInitializer {
/* 12 */   public static final Logger LOGGER = LogManager.getLogger("instantkill");
/*    */   
/* 14 */   public static final class_310 mc = class_310.method_1551();
/*    */   
/*    */   public static boolean shouldAddVelocity = true;
/*    */ 
/*    */   
/*    */   public void onInitialize() {
/* 20 */     LOGGER.info("the bow instant kill is real working");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void addVelocityToPlayer() {
/* 26 */     if (shouldAddVelocity) {
/* 27 */       mc.field_1724.field_3944.method_2883((class_2596)new class_2848((class_1297)mc.field_1724, class_2848.class_2849.field_12981));
/* 28 */       for (int i = 0; i < 100; i++) {
/* 29 */         mc.field_1724.field_3944.method_2883((class_2596)new class_2828.class_2829(mc.field_1724.method_23317(), mc.field_1724.method_23318() - 1.0E-9D, mc.field_1724.method_23321(), true));
/* 30 */         mc.field_1724.field_3944.method_2883((class_2596)new class_2828.class_2829(mc.field_1724.method_23317(), mc.field_1724.method_23318() + 1.0E-9D, mc.field_1724.method_23321(), false));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Rohit Chowdhary\Downloads\instakill\instantkill-1.0.0.jar!\me\saturn\instantkill\InstantKill.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */