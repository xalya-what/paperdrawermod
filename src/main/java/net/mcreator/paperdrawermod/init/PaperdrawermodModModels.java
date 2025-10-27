
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paperdrawermod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.paperdrawermod.client.model.Modelpieces;
import net.mcreator.paperdrawermod.client.model.Modelpaperdrawer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PaperdrawermodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpaperdrawer.LAYER_LOCATION, Modelpaperdrawer::createBodyLayer);
		event.registerLayerDefinition(Modelpieces.LAYER_LOCATION, Modelpieces::createBodyLayer);
	}
}
