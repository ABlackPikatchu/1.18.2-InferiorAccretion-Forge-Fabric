package net.inferioraccretion.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.inferioraccretion.InferiorAccretion;
import net.inferioraccretion.item.ModCreativeTab;
import net.inferioraccretion.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(InferiorAccretion.MOD_ID, Registry.BLOCK_REGISTRY);

    public static final RegistrySupplier<Block> ALABASTER = registerBlock("alabaster",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ)
                    .requiresCorrectToolForDrops()
                    .strength(1.5F, 6.0F)), ModCreativeTab.INFERIOR_ACCRETION_TAB);



    private static <T extends Block> RegistrySupplier<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistrySupplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistrySupplier<Item> registerBlockItem(String name, RegistrySupplier<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

}
