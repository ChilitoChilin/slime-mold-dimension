package net.chilin.slimemold.item;

import net.chilin.slimemold.SlimeMoldDimension;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_TEST = registerItem("pink_test", new Item(new Item.Settings()));
    public static final Item GREEN_TEST = registerItem("green_test", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SlimeMoldDimension.MOD_ID, name), item);
    }

    public static void registerModItmes() {
        SlimeMoldDimension.LOGGER.info("Registering Mod Items for " + SlimeMoldDimension.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_TEST);
            entries.add(GREEN_TEST);
        });
    }
}
