package com.example.examplemod.core.registry;

import com.example.examplemod.ExampleModConstants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class ExampleModBlocksFabric {
	
	public static final Block XENITH_BLOCK = registerBlock("xenith_block", new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	
	// registration methods
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ExampleModConstants.MOD_ID, name), block);
	}
	
	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ExampleModConstants.MOD_ID, name), new BlockItem(block, new Item.Properties()));
	}
	
	public static void register() {}
}
