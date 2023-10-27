package com.liuk_noceda.hgtv.block;

import com.liuk_noceda.hgtv.HGTV;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.JukeboxBlockEntity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegisterBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCKENTITYTIPE =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HGTV.MOD_ID);

    public static final RegistryObject<BlockEntityType<JukeboxBlockEntity>> RECORD_PLAYER_BLOCK_ENTITY = BLOCKENTITYTIPE.register("record_player_block_entity",
            () -> BlockEntityType.Builder.of(JukeboxBlockEntity::new, RegisterBlocks.RECORD_PLAYER_DARK.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCKENTITYTIPE.register(eventBus);
    }
}
