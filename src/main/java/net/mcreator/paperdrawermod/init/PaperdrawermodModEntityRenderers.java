
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paperdrawermod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.paperdrawermod.client.renderer.PiecesfacelessRenderer;
import net.mcreator.paperdrawermod.client.renderer.PiecesRenderer;
import net.mcreator.paperdrawermod.client.renderer.PaperdrawerRenderer;
import net.mcreator.paperdrawermod.client.renderer.FacelessdrawerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PaperdrawermodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PaperdrawermodModEntities.PAPERDRAWER.get(), PaperdrawerRenderer::new);
		event.registerEntityRenderer(PaperdrawermodModEntities.FACELESSDRAWER.get(), FacelessdrawerRenderer::new);
		event.registerEntityRenderer(PaperdrawermodModEntities.PIECES.get(), PiecesRenderer::new);
		event.registerEntityRenderer(PaperdrawermodModEntities.FACELESSPIECES.get(), PiecesfacelessRenderer::new);
	}
}
