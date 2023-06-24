package me.wyzebb.enderupdate.item;

import me.wyzebb.enderupdate.EnderUpdate;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup ENDER = Registry.register(Registries.ITEM_GROUP, new Identifier(EnderUpdate.MOD_ID, "ender"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.ender"))
                    .icon(() -> new ItemStack(ModItems.DRAGON_SCALE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DRAGON_SCALE);
                    }).build());

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.DRAGON_SCALE);
        });
    }
}