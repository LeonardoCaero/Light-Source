package damain.neon.lights;


import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class CubeEntityModel extends EntityModel<CubeEntity> {

    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart body;

  public CubeEntityModel(ModelPart root) {
    this.root = root;
    this.head = root.getChild("head");
    this.body = root.getChild("body");
}

  public static TexturedModelData getTexturedModelData() {
    ModelData modelData = new ModelData();
    ModelPartData root = modelData.getRoot();
    root.addChild("body", ModelPartBuilder.create().uv(0,0).cuboid(-8.0f, 8.0f, -8.0f, 16.0f, 16.0f, 16.0f), ModelTransform.NONE);
        root.addChild("head", ModelPartBuilder.create().uv(0, 32).cuboid(-4.0f, 0.0f, -4.0f, 8.0f, 8.0f, 8.0f), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 64, 64);
	  
	}
	
    @Override
    public void setAngles(CubeEntityModel entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        head.render(matrices, vertices, light, overlay);
        body.render(matrices, vertices, light, overlay);
    }
}
