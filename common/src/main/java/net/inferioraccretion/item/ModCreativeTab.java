package net.inferioraccretion.item;

import dev.architectury.registry.CreativeTabRegistry;
import net.inferioraccretion.InferiorAccretion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab EXAMPLE_TAB = CreativeTabRegistry.create(new ResourceLocation(InferiorAccretion.MOD_ID, "example_tab"), () ->
            new ItemStack(ModItems.EXAMPLE_ITEM.get()));
}
