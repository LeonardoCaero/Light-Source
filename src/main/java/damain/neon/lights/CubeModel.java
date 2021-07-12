package damain.neon.lights;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;

public class CubeModel extends AnimalModel<CubeEntity> {

  private final ModelPart body;

  public static TexturedModelData getTexturedModelData() {
    ModelData modelData = new ModelData();
    ModelPartData modelPartData = modelData.getRoot();
    modelPartData.addChild(
      EntityModelPartNames.BODY,
      ModelPartBuilder.create().uv(0, 0).cuboid(-4, -4, -4, 8, 8, 8),
      ModelTransform.pivot(0, 20, 0)
    );
    return TexturedModelData.of(modelData, 32, 16);
  }

  public CubeModel(ModelPart root) {
    this.body = root.getChild(EntityModelPartNames.BODY);
  }

  @Override
  protected Iterable<ModelPart> getHeadParts() {
    return ImmutableList.of();
  }

  @Override
  protected Iterable<ModelPart> getBodyParts() {
    return ImmutableList.of(body);
  }

  @Override
  public void setAngles(
    CubeEntity entity,
    float limbAngle,
    float limbDistance,
    float animationProgress,
    float headYaw,
    float headPitch
  ) {}
}
