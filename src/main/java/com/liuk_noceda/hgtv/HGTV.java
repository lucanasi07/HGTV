package com.liuk_noceda.hgtv;

import com.liuk_noceda.hgtv.block.RegisterBlockEntity;
import com.liuk_noceda.hgtv.block.RegisterBlocks;
import com.liuk_noceda.hgtv.item.RegisterCreativeModTabs;
import com.liuk_noceda.hgtv.item.RegisterItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HGTV.MOD_ID)
public class HGTV {
    public static final String MOD_ID = "hgtv"; // ID Della mod

    public HGTV() { // Constructor della mod
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegisterCreativeModTabs.register(eventBus);

        RegisterItems.register(eventBus);
        RegisterBlocks.register(eventBus);
        RegisterBlockEntity.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(Common::init);
        eventBus.addListener(this::addCreative);
    }

    private void addCreative (BuildCreativeModeTabContentsEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            Client.init(event);
        } // Client side
    }
}
