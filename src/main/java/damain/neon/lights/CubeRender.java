package damain.neon.lights;

import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CubeRender extends MobEntityRenderer<CubeEntity, AnimalModel<CubeEntity>> {

    private static final Identifier TEXTURE = new Identifier(NeonLights.MOD_ID,"textures/entities/zombie/radioactive.png");

    public CubeRender(Context context, AnimalModel<CubeEntity> entityModel, float f){
        super(context, entityModel, f);
    }
    
    @Override
    public void render(CubeEntity entity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i){
        super.render(entity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(CubeEntity entity){
        return TEXTURE;
    }
}
