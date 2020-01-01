package im.mrtunnel.transportation.client.renders;

import im.mrtunnel.transportation.TunnelTransportationRegistries;
import im.mrtunnel.transportation.entities.WeigangCow;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

@OnlyIn(Dist.CLIENT)
public class WeigangCowRender extends LivingRenderer<WeigangCow, im.mrtunnel.transportation.client.models.WeigangCowModel>
{
	public WeigangCowRender(EntityRendererManager manager)
	{
		super(manager, new im.mrtunnel.transportation.client.models.WeigangCowModel(), 0f);
	}

	@Override
	public ResourceLocation getEntityTexture(WeigangCow entity)
	{
		return TunnelTransportationRegistries.location("textures/entity/weigangcow_entity.png");
	}

	public static class RenderFactory implements IRenderFactory<WeigangCow>
	{
		@Override
		public EntityRenderer<? super WeigangCow> createRenderFor(EntityRendererManager manager)
		{
			return new im.mrtunnel.transportation.client.renders.WeigangCowRender(manager);
		}
		
	}
}
