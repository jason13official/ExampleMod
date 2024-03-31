package com.example.examplemod.core.registry;

import com.example.examplemod.ExampleModConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ExampleModCreativeModeTabForge {
	
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleModConstants.MOD_ID);
	
	public static final RegistryObject<CreativeModeTab> EXAMPLEMOD_TAB = CREATIVE_MODE_TAB.register("examplemod_tab", () -> CreativeModeTab.builder()
		.withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
		.title(Component.translatable("itemGroup.exampleMod"))
		.icon(() -> new ItemStack(ExampleModItemsForge.XENITH.get()))
		.displayItems((parameters, output) -> {
			
			output.accept(ExampleModItemsForge.XENITH.get());
			output.accept(ExampleModBlocksForge.XENITH_BLOCK.get());
			
		}).build());
	
	public static void register(IEventBus bus) {
		CREATIVE_MODE_TAB.register(bus);
	}
	
}
