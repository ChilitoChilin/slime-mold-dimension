package net.chilin.slimemold.block;

import net.chilin.slimemold.SlimeMoldDimension;
import net.chilin.slimemold.block.custom.BlueBerryBushBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Green
    public static final  Block GREEN_BIRCH_LOG = registerBlock("green_birch_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG)));

    public static final  Block GREEN_BIRCH_WOOD = registerBlock("green_birch_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));

    public static final Block STRIPPED_GREEN_BIRCH_LOG = registerBlock("stripped_green_birch_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG)));

    public static final  Block STRIPPED_GREEN_BIRCH_WOOD = registerBlock("stripped_green_birch_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final  Block GREEN_BIRCH_LEAVES = registerBlock("green_birch_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES)));

    public static final  Block GREEN_BIRCH_PLANKS = registerBlock("green_birch_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));

    public static final  Block GREEN_BIRCH_SAPLING = registerBlock("green_birch_sapling",
            new SaplingBlock(SaplingGenerator.BIRCH, AbstractBlock.Settings.copy(Blocks.BIRCH_SAPLING)));
    //Red
    public static final  Block RED_BIRCH_LOG = registerBlock("red_birch_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG)));

    public static final  Block RED_BIRCH_WOOD = registerBlock("red_birch_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));

    public static final Block STRIPPED_RED_BIRCH_LOG = registerBlock("stripped_red_birch_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG)));

    public static final  Block STRIPPED_RED_BIRCH_WOOD = registerBlock("stripped_red_birch_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final  Block RED_BIRCH_LEAVES = registerBlock("red_birch_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES)));

    public static final  Block RED_BIRCH_PLANKS = registerBlock("red_birch_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    //Yellow
    public static final  Block YELLOW_BIRCH_LOG = registerBlock("yellow_birch_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG)));

    public static final  Block YELLOW_BIRCH_WOOD = registerBlock("yellow_birch_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));

    public static final Block STRIPPED_YELLOW_BIRCH_LOG = registerBlock("stripped_yellow_birch_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG)));

    public static final  Block STRIPPED_YELLOW_BIRCH_WOOD = registerBlock("stripped_yellow_birch_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final  Block YELLOW_BIRCH_LEAVES = registerBlock("yellow_birch_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES)));

    public static final  Block YELLOW_BIRCH_PLANKS = registerBlock("yellow_birch_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));
    //Other stuff
    public static final  Block VERDANT_MOSS = registerBlock("verdant_moss",
            new Block(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));

    public static final  Block BLUE_BERRY_BUSH = registerBlock("blue_berry_bush",
            new BlueBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SlimeMoldDimension.MOD_ID, name), block);
    }

    private static void  registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SlimeMoldDimension.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SlimeMoldDimension.LOGGER.info("Registering Mod Blocks for " + SlimeMoldDimension.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.GREEN_BIRCH_LOG);
            entries.add(ModBlocks.GREEN_BIRCH_WOOD);
            entries.add(ModBlocks.STRIPPED_GREEN_BIRCH_LOG);
            entries.add(ModBlocks.STRIPPED_GREEN_BIRCH_WOOD);
            entries.add(ModBlocks.GREEN_BIRCH_PLANKS);
            entries.add(ModBlocks.GREEN_BIRCH_LEAVES);

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

        });
    }
}
