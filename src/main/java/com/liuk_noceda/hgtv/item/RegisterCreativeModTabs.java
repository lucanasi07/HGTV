package com.liuk_noceda.hgtv.item;

import com.liuk_noceda.hgtv.HGTV;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class RegisterCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HGTV.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HGTV_MAIN_TAB = CREATIVE_MODE_TABS.register("hgtv_main_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(RegisterItems.CREATIVE_COVER.get()))
                    .title(Component.translatable("creative.hgtv_main_tab"))
                    .displayItems((p_270258_, p_259752_) -> {
                        p_259752_.accept(RegisterItems.CREATIVE_COVER.get());





                    })
                    .build());


public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
    }
}
