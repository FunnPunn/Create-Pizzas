package com.funnpunn.pizzas.ModBlockEntities;

import com.funnpunn.pizzas.Registries.ModBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class PizzaPieBlockEntity extends BlockEntity {
	public PizzaPieBlockEntity(BlockPos pos, BlockState state) {
		super(ModBlocks.PIZZA_PIE_BLOCK_ENTITY, pos, state);
	}
}
