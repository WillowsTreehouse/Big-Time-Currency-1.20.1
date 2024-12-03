package net.willow.bigtimecurrency.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.willow.bigtimecurrency.BigtimeCurrency;
import net.willow.bigtimecurrency.item.custom.BigHornItem;

public class ModItems {
    public static final Item SPECK = registerItem("speck", new Item(new FabricItemSettings()));
    public static final Item CLUMP = registerItem("clump", new Item(new FabricItemSettings()));
    public static final Item CLUSTER = registerItem("cluster", new Item(new FabricItemSettings()));

    public static final Item YOUGETASTAR = registerItem("yougetastar", new Item(new FabricItemSettings().maxCount(27)));
    public static final Item BIGHORN = registerItem("bighorn",
            new BigHornItem(new FabricItemSettings().maxCount(1)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BigtimeCurrency.MOD_ID, name), item);
    }

    public static void registerModItems()  {
        BigtimeCurrency.LOGGER.info("Registering Big Time Items for " + BigtimeCurrency.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
                //10:00 in the tutorial. Get your homework done Willow
    }
}
