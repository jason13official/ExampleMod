package com.example.examplemod.core.registry;

import com.example.examplemod.ExampleModConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ExampleModCreativeModeTabNeoForge {
	
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleModConstants.MOD_ID);
	
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLEMOD_TAB = CREATIVE_MODE_TAB.register("examplemod_tab", () -> CreativeModeTab.builder()
		.withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
		.title(Component.translatable("itemGroup.exampleMod"))
		.icon(() -> new ItemStack(ExampleModItemsNeoForge.XENITH.get()))
		.displayItems((parameters, output) -> {
			
			output.accept(ExampleModItemsNeoForge.XENITH.get());
			output.accept(ExampleModBlocksNeoForge.XENITH_BLOCK.get());
			
		}).build());
	
	public static void register(IEventBus bus) {
		CREATIVE_MODE_TAB.register(bus);
	}
	
}
