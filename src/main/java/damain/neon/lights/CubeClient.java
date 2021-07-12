package damain.neon.lights;


import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CubeClient {
    
    public static final EntityType<CubeEntity> CUBE = FabricEntityTypeBuilder
        .create(SpawnGroup.MONSTER, CubeEntity::new)
        .dimensions(EntityDimensions.fixed(1.1f, 1.1f))
        .build();

    public static void registerEntities(){
        Registry.register(Registry.ENTITY_TYPE, new Identifier(NeonLights.MOD_ID,"cube"), CUBE);
        FabricDefaultAttributeRegistry.register(CUBE, CubeEntity.createCubeAttributes());
    }

    public static final EntityModelLayer CUBE_MODEL_LAYER = new  EntityModelLayer(new Identifier(NeonLights.MOD_ID,"cube_model_layer"), "main");

    @SuppressWarnings("deprecation")
    public static void initClientSide(){
        registerRenderer(null, CubeRender.class);
        EntityModelLayerRegistry.registerModelLayer(CUBE_MODEL_LAYER, CubeModel::getTexturedModelData);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static void registerRenderer(EntityType<?> entity, Class <? extends EntityRenderer<?>> renderer){
        EntityRendererRegistry.INSTANCE.register(entity, (context) -> {
            EntityRenderer render = null;
            try{
                render = renderer.getConstructor(context.getClass()).newInstance(context);
            } catch (Exception ex){
                ex.printStackTrace();
            }
            return render;
        });
    }


}
