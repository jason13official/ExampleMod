package com.example.examplemod.core.registry;

import com.example.examplemod.ExampleModConstants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExampleModBlocksNeoForge {
	
	public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(BuiltInRegistries.BLOCK, ExampleModConstants.MOD_ID);
	
	public static final DeferredHolder<Block, Block> XENITH_BLOCK = registerBlock("xenith_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
	
	// registration methods
	private static <T extends Block> DeferredHolder<Block, T> registerBlock(String name, Supplier<T> block) {
		DeferredHolder<Block, T> toReturn = BLOCK.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}
	
	private static <T extends Block> DeferredHolder<Item, Item> registerBlockItem(String name, Supplier<T> block) {
		return ExampleModItemsNeoForge.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}
	
	public static void register(IEventBus bus) {
		BLOCK.register(bus);
	}
}
