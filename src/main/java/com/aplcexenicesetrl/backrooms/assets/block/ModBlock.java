package com.aplcexenicesetrl.backrooms.assets.block;

import com.aplcexenicesetrl.backrooms.assets.item.ModItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.aplcexenicesetrl.backrooms.UnderTheBackrooms.MOD_ID;

public class ModBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> Block) {
        RegistryObject<T> Ret = BLOCKS.register(name, Block);
        registerBlockItem(name, Ret);
        return Ret;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> Block) {
        return ModItem.ITEMS.register(name, ()->new BlockItem(Block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    // Building
    /// Level block
    //// Level 0
    public static final RegistryObject<Block> LEVEL0_WALL = registerBlock("level0_wall",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).strength(255f, 255f)));

    public static final RegistryObject<Block> LEVEL0_CARPET = registerBlock("level0_carpet",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CARPET).strength(255f, 255f)));

    public static final RegistryObject<Block> LEVEL0_CEILING = registerBlock("level0_ceiling",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(255f, 255f)));

    public static final RegistryObject<Block> LEVEL0_LIGHT = registerBlock("level0_light",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN).strength(255f, 255f)));

    //// Level 1
    public static final RegistryObject<Block> LEVEL1_WALL = registerBlock("level1_wall",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).strength(255f, 255f)));

    public static final RegistryObject<Block> LEVEL1_FLOOR = registerBlock("level1_floor",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CARPET).strength(255f, 255f)));

    public static final RegistryObject<Block> LEVEL1_CEILING = registerBlock("level1_ceiling",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(255f, 255f)));
}
