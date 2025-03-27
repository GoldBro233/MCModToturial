package top.goldbro.testmoddevelop.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import top.goldbro.testmoddevelop.TestModDevelop;

public class ModItemGroups {
    public static final RegistryKey <ItemGroup> MOD_INGREDIENTS = register("mod_ingredients");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(TestModDevelop.MOD_ID, id));
    }

    public static void registerItemGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                MOD_INGREDIENTS,
                ItemGroup.create(null, -1).
                        displayName(Text.translatable("itemGroup.mod_ingredients"))
                        .icon(() -> new ItemStack(ModItems.titanium_ingot))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.titanium_ingot);
                        })
                        .build()
                );
    }
}
