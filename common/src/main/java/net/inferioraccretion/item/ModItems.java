package net.inferioraccretion.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.inferioraccretion.InferiorAccretion;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(InferiorAccretion.MOD_ID, Registry.ITEM_REGISTRY);

    /*public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().tab(ModCreativeTab.INFERIOR_ACCRETION_TAB)));
    */
}
