package damain.neon.lights;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class CubeEntity extends PathAwareEntity{

    public CubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);   
    }

    // Stats
    public static DefaultAttributeContainer.Builder createCubeAttributes(){
        return PathAwareEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE,30.0)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.0)
            .add(EntityAttributes.GENERIC_ARMOR, 2.0);
    }
    
    public void tick(){
        super.tick();
    }
}