
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
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.paperdrawermod.entity.PiecesfacelessEntity;
import net.mcreator.paperdrawermod.entity.PiecesEntity;
import net.mcreator.paperdrawermod.entity.PaperdrawerEntity;
import net.mcreator.paperdrawermod.entity.FacelessdrawerEntity;
import net.mcreator.paperdrawermod.PaperdrawermodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PaperdrawermodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PaperdrawermodMod.MODID);
	public static final RegistryObject<EntityType<PaperdrawerEntity>> PAPERDRAWER = register("paperdrawer",
			EntityType.Builder.<PaperdrawerEntity>of(PaperdrawerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PaperdrawerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FacelessdrawerEntity>> FACELESSDRAWER = register("facelessdrawer",
			EntityType.Builder.<FacelessdrawerEntity>of(FacelessdrawerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FacelessdrawerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PiecesEntity>> PIECES = register("pieces",
			EntityType.Builder.<PiecesEntity>of(PiecesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PiecesEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PiecesfacelessEntity>> FACELESSPIECES = register("facelesspieces",
			EntityType.Builder.<PiecesfacelessEntity>of(PiecesfacelessEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PiecesfacelessEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PaperdrawerEntity.init();
			FacelessdrawerEntity.init();
			PiecesEntity.init();
			PiecesfacelessEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PAPERDRAWER.get(), PaperdrawerEntity.createAttributes().build());
		event.put(FACELESSDRAWER.get(), FacelessdrawerEntity.createAttributes().build());
		event.put(PIECES.get(), PiecesEntity.createAttributes().build());
		event.put(FACELESSPIECES.get(), PiecesfacelessEntity.createAttributes().build());
	}
}
