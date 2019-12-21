package im.mrtunnel.transportation;

import im.mrtunnel.transportation.init.TransportationItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TunnelItemGroup extends ItemGroup {
    public TunnelItemGroup()
    {
        super("tunnel_transportation_mod");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(TransportationItems.Tunnel_item);
    }
}
