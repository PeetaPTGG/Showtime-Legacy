package com.peeta.peetas_custom_fnaf;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {

    // ── Creative Tab ───────────────────────────────────────────────────────────
    public static final ItemGroup FNAF_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(PeetasFnafMod.MOD_ID, "fnaf_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.peetas_custom_fnaf.fnaf_group"))
                    .icon(() -> new ItemStack(ModBlocks.FNAF_1_WALL))
                    .entries((context, entries) -> {
                        // Original blocks
                        entries.add(ModBlocks.FNAF_1_WALL);
                        entries.add(ModBlocks.FNAF_1_BLUE_WALL_TRIM);
                        entries.add(ModBlocks.FNAF_1_WALL_TRIM);
                        entries.add(ModBlocks.FNAF_1_BOTTOM_WALL);
                        // New blocks
                        entries.add(ModBlocks.FNAF_1_WALL_NEW);
                        entries.add(ModBlocks.FNAF_1_WALL_TRIM_NEW);
                        entries.add(ModBlocks.SHOWBIZ_PIZZA_TRIM);
                    
                        // Props
                        entries.add(ModBlocks.CUPCAKE_PROP);
                    })
                    .build()
    );

    // ── Original Block Items ───────────────────────────────────────────────────
    public static final Item FNAF_1_WALL_ITEM             = registerBlockItem("fnaf_1_wall",             ModBlocks.FNAF_1_WALL);
    public static final Item FNAF_1_BLUE_WALL_TRIM_ITEM   = registerBlockItem("fnaf_1_blue_wall_trim",   ModBlocks.FNAF_1_BLUE_WALL_TRIM);
    public static final Item FNAF_1_WALL_TRIM_ITEM        = registerBlockItem("fnaf_1_wall_trim",        ModBlocks.FNAF_1_WALL_TRIM);
    public static final Item FNAF_1_BOTTOM_WALL_ITEM      = registerBlockItem("fnaf_1_bottom_wall",      ModBlocks.FNAF_1_BOTTOM_WALL);

    // ── New Block Items ────────────────────────────────────────────────────────
    public static final Item FNAF_1_WALL_NEW_ITEM          = registerBlockItem("fnaf_1_wall_new",          ModBlocks.FNAF_1_WALL_NEW);
    public static final Item FNAF_1_WALL_TRIM_NEW_ITEM     = registerBlockItem("fnaf_1_wall_trim_new",     ModBlocks.FNAF_1_WALL_TRIM_NEW);
    public static final Item SHOWBIZ_PIZZA_TRIM_ITEM = registerBlockItem("showbiz_pizza_trim", ModBlocks.SHOWBIZ_PIZZA_TRIM);

    // ── Props ──────────────────────────────────────────────────────────────────
    public static final Item CUPCAKE_PROP_ITEM            = registerBlockItem("cupcake_prop",            ModBlocks.CUPCAKE_PROP);

    // ── Helpers ────────────────────────────────────────────────────────────────
    private static Item registerBlockItem(String name, net.minecraft.block.Block block) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(PeetasFnafMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void register() {
        PeetasFnafMod.LOGGER.info("Registering items for " + PeetasFnafMod.MOD_ID);
    }
}
