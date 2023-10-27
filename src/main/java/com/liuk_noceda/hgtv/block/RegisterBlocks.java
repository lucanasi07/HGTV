package com.liuk_noceda.hgtv.block;

import com.liuk_noceda.hgtv.HGTV;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.JukeboxBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegisterBlocks {
    public static final DeferredRegister<Block> BLOCK =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HGTV.MOD_ID);

    public static final RegistryObject<Block> RECORD_PLAYER_DARK = BLOCK.register("record_player_dark",
            () -> new JukeboxBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX)));

    public static void register(IEventBus eventBus) {
        BLOCK.register(eventBus);
    }

}
