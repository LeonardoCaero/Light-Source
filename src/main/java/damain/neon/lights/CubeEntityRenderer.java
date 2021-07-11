package damain.neon.lights;

import net.minecraft.client.render.entity.*;
import net.minecraft.util.Identifier;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

  public CubeEntityRenderer(EntityRendererFactory.Context context) {
    super(context, new CubeEntityModel(), 0.5f);
  }

  @Override
  public Identifier getTexture(CubeEntity entity) {
      return new Identifier(NeonLights.MOD_ID,"textures/entity/cube/cube.png");
  }
}
