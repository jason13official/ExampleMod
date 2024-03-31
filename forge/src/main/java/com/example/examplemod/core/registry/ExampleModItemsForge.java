package com.example.examplemod.core.registry;

import com.example.examplemod.ExampleModConstants;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ExampleModItemsForge {
	
	public static final DeferredRegister<Item> ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleModConstants.MOD_ID);
	
	public static final RegistryObject<Item> XENITH = registerItem("xenith", () -> new Item(new Item.Properties()));
	
	public static <T extends Item> RegistryObject<Item> registerItem(String name, Supplier<T> item) {
		return ITEM.register(name, item::get);
	}
	
	public static void register(IEventBus bus) {
		ITEM.register(bus);
	}
}
