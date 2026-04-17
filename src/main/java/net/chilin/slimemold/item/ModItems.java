package net.chilin.slimemold.item;

import net.chilin.slimemold.SlimeMoldDimension;
import net.chilin.slimemold.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CRAB_APPLE = registerItem("crab_apple", new Item(new Item.Settings().food(ModFoodComponents.CRAB_APPLE)));

    public static final Item BLUE_BERRY= registerItem("blue_berry", new AliasedBlockItem(ModBlocks.BLUE_BERRY_BUSH, new Item.Settings().food(ModFoodComponents.BLUE_BERRY)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SlimeMoldDimension.MOD_ID, name), item);
    }

    public static void registerModItmes() {
        SlimeMoldDimension.LOGGER.info("Registering Mod Items for " + SlimeMoldDimension.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {

            entries.add(ModItems.CRAB_APPLE);
            entries.add(ModItems.BLUE_BERRY);

        });
    }
}
