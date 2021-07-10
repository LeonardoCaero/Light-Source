package damain.neon.lights;

import damain.neon.lights.registry.*;
import net.fabricmc.api.ModInitializer;

public class NeonLights implements ModInitializer {

	public static final String MOD_ID = "neonlights";

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
}
