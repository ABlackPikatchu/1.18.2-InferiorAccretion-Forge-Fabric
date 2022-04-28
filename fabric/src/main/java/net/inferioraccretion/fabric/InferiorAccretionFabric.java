package net.inferioraccretion.fabric;

import net.fabricmc.api.ModInitializer;
import net.inferioraccretion.InferiorAccretion;

public class InferiorAccretionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        InferiorAccretion.init();
    }
}
