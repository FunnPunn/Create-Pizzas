package com.funnpunn.pizzas.BlockRenderer;

import com.funnpunn.pizzas.Blocks.PizzaPie;

import com.funnpunn.pizzas.ModBlockEntities.PizzaPieBlockEntity;

import com.mojang.blaze3d.vertex.PoseStack;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;

@Environment(EnvType.CLIENT)
public class PizzaPieRenderer implements BlockEntityRenderer<PizzaPieBlockEntity> {
	public PizzaPieRenderer(BlockEntityRendererProvider.Context ctx) {

	}

	@Override
	public void render(PizzaPieBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {

	}
}
