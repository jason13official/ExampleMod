package com.example.examplemod.core.registry;

import com.example.examplemod.ExampleModConstants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExampleModItemsNeoForge {
	
	public static final DeferredRegister<Item> ITEM = DeferredRegister.create(BuiltInRegistries.ITEM, ExampleModConstants.MOD_ID);
	
	public static final DeferredHolder<Item, Item> XENITH = registerItem("xenith", () -> new Item(new Item.Properties()));
	
	// registration methods
	public static <T extends Item> DeferredHolder<Item, Item> registerItem(String name, Supplier<T> item) {
		return ITEM.register(name, item);
	}
	
	public static void register(IEventBus bus) {
		ITEM.register(bus);
	}
}
