package top.goldbro.testmoddevelop.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import top.goldbro.testmoddevelop.TestModDevelop;

public class ModItems {

    public static final Item titanium_ingot = registerItem("material/titanium_ingot", new Item(new Item.Settings()));

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(TestModDevelop.MOD_ID, id)), item);
    }

    public static void registerItems() {

    }
}
