
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paperdrawermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.paperdrawermod.block.PaperblockNetherBlock;
import net.mcreator.paperdrawermod.block.PaperTheEndPortalBlock;
import net.mcreator.paperdrawermod.block.PaperHellPortalBlock;
import net.mcreator.paperdrawermod.block.PaperDimensionPortalBlock;
import net.mcreator.paperdrawermod.block.PaperBlockEndBlock;
import net.mcreator.paperdrawermod.block.PaperBlockBlock;
import net.mcreator.paperdrawermod.block.AutoBlock;
import net.mcreator.paperdrawermod.PaperdrawermodMod;

public class PaperdrawermodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PaperdrawermodMod.MODID);
	public static final RegistryObject<Block> AUTO = REGISTRY.register("auto", () -> new AutoBlock());
	public static final RegistryObject<Block> PAPER_BLOCK = REGISTRY.register("paper_block", () -> new PaperBlockBlock());
	public static final RegistryObject<Block> PAPER_DIMENSION_PORTAL = REGISTRY.register("paper_dimension_portal",
			() -> new PaperDimensionPortalBlock());
	public static final RegistryObject<Block> PAPERBLOCK_NETHER = REGISTRY.register("paperblock_nether", () -> new PaperblockNetherBlock());
	public static final RegistryObject<Block> PAPER_BLOCK_END = REGISTRY.register("paper_block_end", () -> new PaperBlockEndBlock());
	public static final RegistryObject<Block> PAPER_HELL_PORTAL = REGISTRY.register("paper_hell_portal", () -> new PaperHellPortalBlock());
	public static final RegistryObject<Block> PAPER_THE_END_PORTAL = REGISTRY.register("paper_the_end_portal", () -> new PaperTheEndPortalBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AutoBlock.registerRenderLayer();
		}
	}
}
