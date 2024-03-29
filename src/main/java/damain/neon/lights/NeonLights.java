package damain.neon.lights;

import damain.neon.lights.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class NeonLights implements ModInitializer {
	

	public static final String MOD_ID = "neonlights"; 

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.NEON_FRAGMENT));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		CubeClient.registerEntities();
		CubeClient.initClientSide();
	}
}
