
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paperdrawermod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.paperdrawermod.item.PaperspawnerItem;
import net.mcreator.paperdrawermod.item.PaperTheEndItem;
import net.mcreator.paperdrawermod.item.PaperHellItem;
import net.mcreator.paperdrawermod.item.PaperDimensionItem;
import net.mcreator.paperdrawermod.item.O5GritItem;
import net.mcreator.paperdrawermod.item.FacelesspaperspawnerItem;
import net.mcreator.paperdrawermod.PaperdrawermodMod;

public class PaperdrawermodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PaperdrawermodMod.MODID);
	public static final RegistryObject<Item> PAPERSPAWNER = REGISTRY.register("paperspawner", () -> new PaperspawnerItem());
	public static final RegistryObject<Item> FACELESSPAPERSPAWNER = REGISTRY.register("facelesspaperspawner", () -> new FacelesspaperspawnerItem());
	public static final RegistryObject<Item> AUTO = block(PaperdrawermodModBlocks.AUTO, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> PAPER_BLOCK = block(PaperdrawermodModBlocks.PAPER_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PAPER_DIMENSION = REGISTRY.register("paper_dimension", () -> new PaperDimensionItem());
	public static final RegistryObject<Item> O_5_GRIT = REGISTRY.register("o_5_grit", () -> new O5GritItem());
	public static final RegistryObject<Item> PAPERBLOCK_NETHER = block(PaperdrawermodModBlocks.PAPERBLOCK_NETHER,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PAPER_BLOCK_END = block(PaperdrawermodModBlocks.PAPER_BLOCK_END, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PAPER_HELL = REGISTRY.register("paper_hell", () -> new PaperHellItem());
	public static final RegistryObject<Item> PAPER_THE_END = REGISTRY.register("paper_the_end", () -> new PaperTheEndItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
