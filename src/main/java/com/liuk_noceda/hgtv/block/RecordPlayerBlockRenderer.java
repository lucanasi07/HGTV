package com.liuk_noceda.hgtv.block;

import com.liuk_noceda.hgtv.HGTV;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.JukeboxBlockEntity;

public class RecordPlayerBlockRenderer implements BlockEntityRenderer<JukeboxBlockEntity> {
    private final RecordPlayerBlockModel model;
    private static final ResourceLocation TEXTURE=new ResourceLocation(HGTV.MOD_ID, "textures/entity/record_player_dark.png");
    private static final LayerDefinition LAYER = RecordPlayerBlockModel.createModel();
    public RecordPlayerBlockRenderer(BlockEntityRendererProvider.Context ctx) {
        this.model=new RecordPlayerBlockModel(LAYER.bakeRoot());

    }

    @Override
    public void render(JukeboxBlockEntity blockEntity, float time, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        poseStack.pushPose();
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.translate(-0.5, 0, 0.5f);
        VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityTranslucent(TEXTURE));
        model.setupAnim(time);
        model.renderToBuffer(poseStack, vertexConsumer, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        poseStack.popPose();
    }

}
