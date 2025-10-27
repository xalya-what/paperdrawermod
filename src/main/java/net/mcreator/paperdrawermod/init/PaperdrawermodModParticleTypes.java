
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paperdrawermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.paperdrawermod.PaperdrawermodMod;

public class PaperdrawermodModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, PaperdrawermodMod.MODID);
	public static final RegistryObject<ParticleType<?>> PAPERSHREDS = REGISTRY.register("papershreds", () -> new SimpleParticleType(false));
}
