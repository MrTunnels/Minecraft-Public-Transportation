package im.mrtunnel.transportation;

import im.mrtunnel.transportation.init.TransportationBlocks;
import im.mrtunnel.transportation.init.TransportationItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class TunnelTransportationRegistries {
    public static final ItemGroup TunnelTransportation = TunnelTransportationMod.TunnelTransportation;
    public static final Logger LOGGER = TunnelTransportationMod.LOGGER;
    public static final String MODID = TunnelTransportationMod.MODID;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (
                        TransportationItems.Tunnel_item = new Item(new Item.Properties().group(TunnelTransportation)).setRegistryName("tunnel_item"),
                        TransportationItems.Tunnel_Logo_Block = new BlockItem( TransportationBlocks.Tunnel_Logo_Block, new Item.Properties().group(TunnelTransportation)).setRegistryName(TransportationBlocks.Tunnel_Logo_Block.getRegistryName()),
                        TransportationItems.Transportation_Logo_Block =  new BlockItem( TransportationBlocks.Transportation_Logo_Block, new Item.Properties().group(TunnelTransportation)).setRegistryName(TransportationBlocks.Transportation_Logo_Block.getRegistryName())
                );
        LOGGER.info("Items registered.");
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll
                (
                        TransportationBlocks.Tunnel_Logo_Block = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 3.0f).lightValue(5).sound(SoundType.METAL)).setRegistryName("tunnel_logo_block"),
                        TransportationBlocks.Transportation_Logo_Block = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).lightValue(5).sound(SoundType.METAL)).setRegistryName("transportation_logo_block")
                );

        LOGGER.info("Blocks registered.");
    }
}
