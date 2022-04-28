package net.inferioraccretion.item;

import dev.architectury.registry.CreativeTabRegistry;
import net.inferioraccretion.InferiorAccretion;
import net.inferioraccretion.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab INFERIOR_ACCRETION_TAB = CreativeTabRegistry.create(new ResourceLocation(InferiorAccretion.MOD_ID, "inferior_accretion_tab"), () ->
            new ItemStack(ModBlocks.ALABASTER.get()));
}
