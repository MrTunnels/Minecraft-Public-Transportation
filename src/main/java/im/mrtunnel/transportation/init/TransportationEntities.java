package im.mrtunnel.transportation.init;


import im.mrtunnel.transportation.TunnelTransportationRegistries;
import im.mrtunnel.transportation.entities.WeigangCow;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.event.RegistryEvent;

public class TransportationEntities {
    public static EntityType<?> WeigangCow_entity = EntityType.Builder.create(WeigangCow::new, EntityClassification.CREATURE).build(TunnelTransportationRegistries.MODID + ":weigangcow_entity").setRegistryName("weigangcow_entity");

    public static void registerEntitySpawnEggs(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll
                (
                        TransportationItems.Transportation_Entity_WeigangCowEgg = registerEntitySpawnEgg(WeigangCow_entity, 0x2f5882, 0x6f1499, "weigangcow_entity_egg")
                );

    }


   /*public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(tutorial_entity, Biomes.PLAINS, Biomes.BEACH, Biomes.JUNGLE);
    }
    */

    public static Item registerEntitySpawnEgg(EntityType<?> type, int color1, int color2, String name)
    {
        SpawnEggItem item = new SpawnEggItem(type, color1, color2, new Item.Properties().group(TunnelTransportationRegistries.TunnelTransportation));
        item.setRegistryName(name);
        return item;
    }

    /*public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
    {
        for(Biome biome : biomes)
        {
            if(biome != null)
            {
                biome.getSpawns(entity.getClassification()).add(new Biome.SpawnListEntry(entity, 10, 1, 10));
            }
        }
    }*/
}
