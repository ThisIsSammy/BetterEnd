package ru.betterend.world.biome;

import net.minecraft.entity.EntityType;
import ru.betterend.registry.EndBlocks;
import ru.betterend.registry.EndFeatures;
import ru.betterend.registry.EndSounds;

public class CapsacisForestBiome extends EndBiome {
	public CapsacisForestBiome() {
		super(new BiomeDefinition("capsacis_forest")
				.setSurface(EndBlocks.SHADOW_GRASS, EndBlocks.CHORUS_NYLIUM)
				.setMusic(EndSounds.MUSIC_FOREST)
				.setWaterAndFogColor(84, 61, 127)
				.setFoliageColor(71, 45, 120)
				.setFogColor(78, 71, 92)
				.setFogDensity(1.5F)
				.addFeature(EndFeatures.CAPSACIS)
				.addMobSpawn(EntityType.ENDERMAN, 50, 1, 4));
	}
}
