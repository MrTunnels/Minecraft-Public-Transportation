package im.mrtunnel.transportation.entities;

import im.mrtunnel.transportation.init.TransportationEntities;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;

public class WeigangCow extends CreatureEntity{
    @SuppressWarnings("unchecked")
    public WeigangCow(EntityType<? extends CreatureEntity> type, World worldIn)
    {
        super((EntityType<? extends CreatureEntity>) TransportationEntities.WeigangCow_entity, worldIn);
    }

    @Override
    protected void registerGoals()
    {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new RandomWalkingGoal(this, 1.2d));
        this.goalSelector.addGoal(2, new LookRandomlyGoal(this));
    }

    @Override
    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0d);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.2d);
    }
}
