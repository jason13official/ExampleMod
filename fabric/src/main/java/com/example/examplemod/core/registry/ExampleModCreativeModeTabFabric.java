package com.example.examplemod.core.registry;

import com.example.examplemod.ExampleModConstants;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ExampleModCreativeModeTabFabric {
	
	public static final CreativeModeTab EXAMPLEMOD_TAB = FabricItemGroup.builder()
		.title(Component.translatable("itemGroup.exampleMod"))
		.icon(() -> new ItemStack(ExampleModItemsFabric.XENITH))
		.displayItems((params, output) -> {
			
			output.accept(ExampleModItemsFabric.XENITH);
			output.accept(ExampleModBlocksFabric.XENITH_BLOCK);
			
		})
		.build();
	
	public static void register() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(ExampleModConstants.MOD_ID, "examplemod_tab"), EXAMPLEMOD_TAB);
	}
}
