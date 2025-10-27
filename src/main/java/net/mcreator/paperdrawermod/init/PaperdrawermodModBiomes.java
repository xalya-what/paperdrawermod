
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paperdrawermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.paperdrawermod.world.biome.PaperNetherBiome;
import net.mcreator.paperdrawermod.world.biome.PaperEndBiome;
import net.mcreator.paperdrawermod.world.biome.PaperBiomeBiome;
import net.mcreator.paperdrawermod.PaperdrawermodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PaperdrawermodModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, PaperdrawermodMod.MODID);
	public static final RegistryObject<Biome> PAPER_BIOME = REGISTRY.register("paper_biome", () -> PaperBiomeBiome.createBiome());
	public static final RegistryObject<Biome> PAPER_NETHER = REGISTRY.register("paper_nether", () -> PaperNetherBiome.createBiome());
	public static final RegistryObject<Biome> PAPER_END = REGISTRY.register("paper_end", () -> PaperEndBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PaperBiomeBiome.init();
			PaperNetherBiome.init();
			PaperEndBiome.init();
		});
	}
}
