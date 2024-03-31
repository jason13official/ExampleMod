package com.example.examplemod.core.registry;

import com.example.examplemod.ExampleModConstants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ExampleModItemsFabric {
	
	public static final Item XENITH = registerItem("xenith", new Item(new Item.Properties()));
	
	public static Item registerItem(String name, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ExampleModConstants.MOD_ID, name), item);
	}
	
	public static void register() {}
}
