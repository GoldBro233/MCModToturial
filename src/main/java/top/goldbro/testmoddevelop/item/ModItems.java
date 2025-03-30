package top.goldbro.testmoddevelop.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import top.goldbro.testmoddevelop.TestModDevelop;

public class ModItems {

    // Register New Item in Mod
    public static final Item titanium_ingot = registerItem("material/titanium_ingot", new Item(new Item.Settings()));
    public static final Item raw_titanium_ingot = registerItem("material/raw_titanium", new Item(new Item.Settings()));

    // RegisterItem Method
    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), new Identifier(TestModDevelop.MOD_ID, id)), item);
    }

    // Use Fabric API to add Item to ItemGroup
    private static void addItemToItemGroup (FabricItemGroupEntries entries) {
        entries.add(titanium_ingot);
    }

    public static void registerItems() {
        // ItemGroupEvents
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems::addItemToItemGroup);
    }
}
