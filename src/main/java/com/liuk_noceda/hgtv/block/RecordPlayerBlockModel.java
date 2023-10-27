package com.liuk_noceda.hgtv.block;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.RenderType;

public class RecordPlayerBlockModel extends Model {
    private final ModelPart root;
    private final ModelPart coperchio;
    private final ModelPart disco;
    private final ModelPart puntina;
    private final ModelPart corpo;

    public RecordPlayerBlockModel(ModelPart root) {
        super(RenderType::entityTranslucent);
        this.root=root;
        this.coperchio=root.getChild("coperchio");
        this.disco=root.getChild("disco");
        this.puntina=root.getChild("puntina");
        this.corpo=root.getChild("corpo");
    }
    public static LayerDefinition createModel(){
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition coperchio = partdefinition.addOrReplaceChild("coperchio", CubeListBuilder.create().texOffs(37, 23).addBox(-4.0F, -7.0F, 14.0F, 2.0F, 2.0F, 0.5F, new CubeDeformation(0.0F))
                .texOffs(36, 26).addBox(-14.0F, -7.0F, 14.0F, 2.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 24.0F, -8.0F));

        PartDefinition cube_r1 = coperchio.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -12.0F, 17.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 26).addBox(0.0F, -3.0F, 15.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(27, 22).addBox(0.0F, -14.0F, 15.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(7, 18).addBox(-16.0F, -12.0F, 17.0F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 28).addBox(-16.0F, -3.0F, 15.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(32, 30).addBox(-16.0F, -14.0F, 15.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 29).addBox(-16.0F, -14.0F, 18.0F, 16.0F, 13.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(26, 21).addBox(-15.0F, -14.0F, 16.0F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(25, 23).addBox(-6.0F, -14.0F, 15.0F, 4.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 19).addBox(-14.0F, -14.0F, 17.0F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 19).addBox(-16.0F, -14.0F, 15.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(6, 6).addBox(-2.0F, -14.0F, 15.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(26, 22).addBox(-13.0F, -1.0F, 16.0F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(31, 25).addBox(-5.0F, -1.0F, 15.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 20).addBox(-14.0F, -1.0F, 17.0F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(-16.0F, -1.0F, 15.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).addBox(-2.0F, -1.0F, 15.0F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(3, 0).addBox(-14.0F, -1.0F, 13.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(5, 0).addBox(-3.0F, -1.0F, 13.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition disco = partdefinition.addOrReplaceChild("disco", CubeListBuilder.create().texOffs(0, 19).addBox(-6.0F, 0.0F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

        PartDefinition puntina = partdefinition.addOrReplaceChild("puntina", CubeListBuilder.create().texOffs(0, 6).addBox(4.0F, -1.5F, 1.0F, 3.0F, 2.5F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(5.0F, -1.5F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(3, 0).addBox(5.4F, -0.5F, -3.5F, 0.3F, 0.3F, 0.3F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));

        PartDefinition corpo = partdefinition.addOrReplaceChild("corpo", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -7.0F, 1.0F, 16.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(32, 35).addBox(-4.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 29).addBox(-2.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 37).addBox(-2.0F, -1.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 34).addBox(-15.0F, -1.0F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 2).addBox(-15.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 24.0F, -8.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void setupAnim(float time){

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packetOverlay, float r, float g, float b, float a) {
        this.root.render(poseStack, buffer, packedLight, packetOverlay, r, g, b, a);
    }
}
