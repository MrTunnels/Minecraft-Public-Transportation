package im.mrtunnel.transportation.client.renders;

import im.mrtunnel.transportation.TunnelTransportationRegistries;
import im.mrtunnel.transportation.entities.WeigangCow;
import im.mrtunnel.transportation.init.TransportationEntities;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import static im.mrtunnel.transportation.TunnelTransportationMod.LOGGER;

@OnlyIn(Dist.CLIENT)
public class TransportationRendersRegistry
{
	//public static EntityType<WeigangCow> WeigangCow = (EntityType<im.mrtunnel.transportation.entities.WeigangCow>) EntityType.Builder.create(WeigangCow::new, EntityClassification.CREATURE).build("tunnels_public_transportation:weigangcow_entity").setRegistryName("tunnels_public_transportation","weigangcow_entity");
	public static void registryEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler((EntityType<WeigangCow>)TransportationEntities.WeigangCow_entity, new WeigangCowRender.RenderFactory());
		LOGGER.info("WeigangCow Render registered.");
	}
}
