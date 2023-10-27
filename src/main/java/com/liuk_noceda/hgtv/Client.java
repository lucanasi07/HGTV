package com.liuk_noceda.hgtv;

import com.google.common.eventbus.Subscribe;
import com.liuk_noceda.hgtv.block.RecordPlayerBlockRenderer;
import com.liuk_noceda.hgtv.block.RegisterBlockEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = HGTV.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Client {

    // Qui siamo su lato client
    public static void init(FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {

        event.registerBlockEntityRenderer(RegisterBlockEntity.RECORD_PLAYER_BLOCK_ENTITY.get(), RecordPlayerBlockRenderer::new);

    }
}
