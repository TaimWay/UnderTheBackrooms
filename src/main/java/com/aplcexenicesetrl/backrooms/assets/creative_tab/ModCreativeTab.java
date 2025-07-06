package com.aplcexenicesetrl.backrooms.assets.creative_tab;

import com.aplcexenicesetrl.backrooms.assets.block.ModBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.aplcexenicesetrl.backrooms.UnderTheBackrooms.MOD_ID;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_BACKROOMS_BUILDING = CREATIVE_MODE_TABS.register("backrooms_block", () -> CreativeModeTab.builder()
            .title(Component.translatable("creative_tab.backrooms_block"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> new ItemStack(ModBlock.LEVEL0_WALL.get()))
            .displayItems((parameters, output) -> {
                output.accept(ModBlock.LEVEL0_WALL.get());
                output.accept(ModBlock.LEVEL0_CARPET.get());
                output.accept(ModBlock.LEVEL0_CEILING.get());
                output.accept(ModBlock.LEVEL0_LIGHT.get());

                output.accept(ModBlock.LEVEL1_WALL.get());
                output.accept(ModBlock.LEVEL1_FLOOR.get());
                output.accept(ModBlock.LEVEL1_CEILING.get());
            }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
