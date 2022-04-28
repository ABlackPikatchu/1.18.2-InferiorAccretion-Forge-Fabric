package net.inferioraccretion.forge;

import dev.architectury.platform.forge.EventBuses;
import net.inferioraccretion.InferiorAccretion;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(InferiorAccretion.MOD_ID)
public class InferiorAccretionForge {
    public InferiorAccretionForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(InferiorAccretion.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        InferiorAccretion.init();
    }
}
