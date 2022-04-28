package net.inferioraccretion;

import static net.inferioraccretion.block.ModBlocks.BLOCKS;
import static net.inferioraccretion.item.ModItems.ITEMS;

public class InferiorAccretion {
    public static final String MOD_ID = "inferioraccretion";

    public static void init() {
        BLOCKS.register();
        ITEMS.register();

    }
}
