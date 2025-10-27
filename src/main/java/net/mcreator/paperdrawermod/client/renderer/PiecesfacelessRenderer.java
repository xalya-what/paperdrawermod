
package net.mcreator.paperdrawermod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.paperdrawermod.entity.PiecesfacelessEntity;
import net.mcreator.paperdrawermod.client.model.Modelpieces;

public class PiecesfacelessRenderer extends MobRenderer<PiecesfacelessEntity, Modelpieces<PiecesfacelessEntity>> {
	public PiecesfacelessRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpieces(context.bakeLayer(Modelpieces.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<PiecesfacelessEntity, Modelpieces<PiecesfacelessEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("paperdrawermod:textures/entities/facelessshreeddedpaperdrawer.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PiecesfacelessEntity entity) {
		return new ResourceLocation("paperdrawermod:textures/entities/faceshreddedpaperdrawer.png");
	}
}
