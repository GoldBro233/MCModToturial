package top.goldbro.testmoddevelop.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import top.goldbro.testmoddevelop.TestModDevelop;

public class ModBlocks {
    // register mod block
    public static final Block titanium_block = register("titanium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block titanium_ore = register("titanium_ore", new Block(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));

    // register block method
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(TestModDevelop.MOD_ID, id), block);
    }

    // register block in item
    public static void registerBlockItems (String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(TestModDevelop.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks () {}
}