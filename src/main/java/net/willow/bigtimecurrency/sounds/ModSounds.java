package net.willow.bigtimecurrency.sounds;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.willow.bigtimecurrency.BigtimeCurrency;

public class ModSounds {

    public static final SoundEvent BIGHORN_HONK = registerSoundEvent("bighorn_honk");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(BigtimeCurrency.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        BigtimeCurrency.LOGGER.info("Registering Sounds for" + BigtimeCurrency.MOD_ID);
    }
}
