package com.lucanasi.hgtv;

import com.lucanasi.hgtv.item.RegisterItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.IModBusEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HGTV.MOD_ID)
public class HGTV {
    public static final String MOD_ID = "hgtv"; // ID Della mod

    public HGTV() { // Constructor della mod
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegisterItems.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(Common::init);
        eventBus.addListener(this::addCreative);
    }

    private void addCreative (BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(RegisterItems.CREATIVE_COVER);
        }
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
