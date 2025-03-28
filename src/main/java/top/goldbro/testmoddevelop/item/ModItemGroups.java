package top.goldbro.testmoddevelop.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import top.goldbro.testmoddevelop.TestModDevelop;
import top.goldbro.testmoddevelop.block.ModBlocks;

public class ModItemGroups {
    // register Items Groups Keys
    public static final RegistryKey <ItemGroup> MOD_INGREDIENTS = register("mod_ingredients");
    public static final RegistryKey <ItemGroup> MOD_BLOCKS = register("mod_blocks");

    // register Items Groups Method
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TestModDevelop.MOD_ID, id));
    }

    // register Items Groups
    public static void registerItemGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                MOD_INGREDIENTS,
                ItemGroup.create(null, -1)
                        // Mod Items Menu
                        .displayName(Text.translatable("itemGroup.mod_ingredients"))
                        .icon(() -> new ItemStack(ModItems.titanium_ingot))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.titanium_ingot);
                            entries.add(ModItems.raw_titanium_ingot);
                        })
                        .build()
                );
        Registry.register(
                Registries.ITEM_GROUP,
                MOD_BLOCKS,
                ItemGroup.create(null, -1)
                        // Mod Blocks Menu
                        .displayName(Text.translatable("itemGroup.mod_blocks"))
                        .icon(() -> new ItemStack(ModBlocks.titanium_block) )
                        .entries((displayContext, entries) -> {
                            entries.add(ModBlocks.titanium_block);
                            entries.add(ModBlocks.titanium_ore);
                        })
                        .build()
                );
        }
}
