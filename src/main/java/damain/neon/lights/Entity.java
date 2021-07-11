package damain.neon.lights;

import damain.neon.lights.registry.ModEntities;
import net.fabricmc.api.*;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class Entity{

  public void registerEntities(){
	EntityRendererRegistry.INSTANCE.register(
		ModEntities.CUBE,
		context -> {
		  return new CubeEntityRenderer(context);
		}
	  );

  }
}
