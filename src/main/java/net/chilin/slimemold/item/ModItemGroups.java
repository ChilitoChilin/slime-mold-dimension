package net.chilin.slimemold.item;

import net.chilin.slimemold.SlimeMoldDimension;
import net.chilin.slimemold.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SLIME_MOLD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SlimeMoldDimension.MOD_ID, "test_items"),
            FabricItemGroup.builder().icon(() ->new ItemStack(ModItems.CRAB_APPLE))
                    .displayName(Text.translatable("itemgroup.slimemold.test_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CRAB_APPLE);
                        entries.add(ModItems.BLUE_BERRY);
                    }).build());
    public static final ItemGroup SLIME_MOLD_BlOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SlimeMoldDimension.MOD_ID, "test_blocks"),
            FabricItemGroup.builder().icon(() ->new ItemStack(ModBlocks.GREEN_BIRCH_LOG))
                    .displayName(Text.translatable("itemgroup.slimemold.test_blocks"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.GREEN_BIRCH_LOG);
                        entries.add(ModBlocks.GREEN_BIRCH_WOOD);
                        entries.add(ModBlocks.STRIPPED_GREEN_BIRCH_LOG);
                        entries.add(ModBlocks.STRIPPED_GREEN_BIRCH_WOOD);
                        entries.add(ModBlocks.GREEN_BIRCH_PLANKS);
                        entries.add(ModBlocks.GREEN_BIRCH_LEAVES);
                        entries.add(ModBlocks.GREEN_BIRCH_SAPLING);

                        entries.add(ModBlocks.RED_BIRCH_LOG);
                        entries.add(ModBlocks.RED_BIRCH_WOOD);
                        entries.add(ModBlocks.STRIPPED_RED_BIRCH_LOG);
                        entries.add(ModBlocks.STRIPPED_RED_BIRCH_WOOD);
                        entries.add(ModBlocks.RED_BIRCH_PLANKS);
                        entries.add(ModBlocks.RED_BIRCH_LEAVES);

                        entries.add(ModBlocks.YELLOW_BIRCH_LOG);
                        entries.add(ModBlocks.YELLOW_BIRCH_WOOD);
                        entries.add(ModBlocks.STRIPPED_YELLOW_BIRCH_LOG);
                        entries.add(ModBlocks.STRIPPED_YELLOW_BIRCH_WOOD);
                        entries.add(ModBlocks.YELLOW_BIRCH_PLANKS);
                        entries.add(ModBlocks.YELLOW_BIRCH_LEAVES);

                        entries.add(ModBlocks.VERDANT_MOSS);

                    }).build());

    public static void registerItemGroups() {
        SlimeMoldDimension.LOGGER.info("Registering Item Groups for " + SlimeMoldDimension.MOD_ID);
    }
}
