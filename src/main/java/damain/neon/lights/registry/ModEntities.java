package damain.neon.lights.registry;

import damain.neon.lights.NeonLights;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

  public static final EntityType<CubeEntity> CUBE = Registry.register(
    Registry.ENTITY_TYPE,
    new Identifier(NeonLights.MOD_ID, "ENTITY1"),
    FabricEntityTypeBuilder
      .create(SpawnGroup.CREATURE, CubeEntity::new)
      .dimensions(EntityDimensions.fixed(1f, 2f))
      .build()
  );

  public static void RegisterEntities(){
      EntityRendererRegistry.INSTANCE.register(ModEntities.CUBE,(dispatcher, context) -> (return new CubeEntityRenderer()))
  }
}
    