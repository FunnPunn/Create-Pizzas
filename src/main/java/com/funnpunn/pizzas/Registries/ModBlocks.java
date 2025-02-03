package com.funnpunn.pizzas.Registries;

import com.funnpunn.pizzas.Blocks.PizzaPie;
import com.funnpunn.pizzas.Pizzas;

import com.funnpunn.pizzas.ModBlockEntities.PizzaPieBlockEntity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
	public static void initialize() {}

	public static Block register(Block block, String name, boolean shouldRegister) {
		ResourceLocation id = ResourceLocation.tryBuild(Pizzas.ID, name);

		if (shouldRegister) {
			BlockItem blockItem = new BlockItem(block, new Item.Properties());
			Registry.register(BuiltInRegistries.ITEM, id, blockItem);
		}
		Pizzas.LOGGER.info("Registered " + id.toString());
		return Registry.register(BuiltInRegistries.BLOCK, id, block);
	}
	public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(
			String name,
			FabricBlockEntityTypeBuilder.Factory<? extends T> entityFactory,
			Block... blocks)
	{
		ResourceLocation id = ResourceLocation.tryBuild(Pizzas.ID, name);
		return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, id, FabricBlockEntityTypeBuilder.<T>create(entityFactory, blocks).build());
	}

	// Block registries (Block -> BlockEntity)
	public static final Block PIZZA_PIE = register(
			new PizzaPie(BlockBehaviour.Properties.of()),
			"pizza_pie",
			true
	);

	public static final BlockEntityType<PizzaPieBlockEntity> PIZZA_PIE_BLOCK_ENTITY = registerBlockEntity(
			"pizza_pie",
			PizzaPieBlockEntity::new,
			PIZZA_PIE
	);


}
