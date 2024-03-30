package com.example.examplemod.mixin;

import com.example.examplemod.ExampleModConstants;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftCommonMixin {
    
    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        
        ExampleModConstants.LOG.info("This line is printed by an example mod common mixin!");
        ExampleModConstants.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
}