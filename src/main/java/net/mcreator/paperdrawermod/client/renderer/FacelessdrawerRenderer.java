
package net.mcreator.paperdrawermod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.paperdrawermod.entity.FacelessdrawerEntity;
import net.mcreator.paperdrawermod.client.model.Modelpaperdrawer;

public class FacelessdrawerRenderer extends MobRenderer<FacelessdrawerEntity, Modelpaperdrawer<FacelessdrawerEntity>> {
	public FacelessdrawerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpaperdrawer(context.bakeLayer(Modelpaperdrawer.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<FacelessdrawerEntity, Modelpaperdrawer<FacelessdrawerEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("paperdrawermod:textures/entities/faceless.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(FacelessdrawerEntity entity) {
		return new ResourceLocation("paperdrawermod:textures/entities/faceless.png");
	}
}
