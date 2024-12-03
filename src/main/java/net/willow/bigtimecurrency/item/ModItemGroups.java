package net.willow.bigtimecurrency.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.willow.bigtimecurrency.BigtimeCurrency;
import net.willow.bigtimecurrency.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MONEY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BigtimeCurrency.MOD_ID, "money"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.money"))
                    .icon(() -> new ItemStack(ModItems.CLUSTER)).entries((displayContext, entries) -> {

                    entries.add(ModItems.SPECK);
                    entries.add(ModItems.CLUMP);
                    entries.add(ModItems.CLUSTER);

                    entries.add(ModBlocks.BIGCOIN_BLOCK);
                    entries.add(ModItems.YOUGETASTAR);
                    entries.add(ModItems.BIGHORN);

                    }).build());
    public static void registerItemGroups() {
        BigtimeCurrency.LOGGER.info("Loading Item Groups for " + BigtimeCurrency.MOD_ID);
    }
}
