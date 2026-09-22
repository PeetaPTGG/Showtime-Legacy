package com.peeta.peetas_custom_fnaf;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // ── Original Wall Blocks ───────────────────────────────────────────────────
    public static final Block FNAF_1_WALL = registerBlock("fnaf_1_wall",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).strength(1.5f)));

    public static final Block FNAF_1_BLUE_WALL_TRIM = registerBlock("fnaf_1_blue_wall_trim",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).strength(1.5f)));

    public static final Block FNAF_1_WALL_TRIM = registerBlock("fnaf_1_wall_trim",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).strength(1.5f)));

    public static final Block FNAF_1_BOTTOM_WALL = registerBlock("fnaf_1_bottom_wall",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).strength(1.5f)));

    // ── New Wall Blocks ────────────────────────────────────────────────────────
    public static final Block FNAF_1_WALL_NEW = registerBlock("fnaf_1_wall_new",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).strength(1.5f)));

    public static final Block FNAF_1_WALL_TRIM_NEW = registerBlock("fnaf_1_wall_trim_new",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).strength(1.5f)));

    public static final Block SHOWBIZ_PIZZA_TRIM = registerBlock("showbiz_pizza_trim",
            new Block(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).strength(1.5f)));


    // ── Props ──────────────────────────────────────────────────────────────────
    public static final Block CUPCAKE_PROP = registerBlock("cupcake_prop",
            new Block(AbstractBlock.Settings.copy(Blocks.CAKE).strength(0.5f).nonOpaque()));

    // ── Helpers ────────────────────────────────────────────────────────────────
    private static Block registerBlock(String name, Block block) {
        return Registry.register(
                Registries.BLOCK,
                Identifier.of(PeetasFnafMod.MOD_ID, name),
                block
        );
    }

    public static void register() {
        PeetasFnafMod.LOGGER.info("Registering blocks for " + PeetasFnafMod.MOD_ID);
    }
}
