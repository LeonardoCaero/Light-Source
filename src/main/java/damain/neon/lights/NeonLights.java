package damain.neon.lights;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NeonLights implements ModInitializer {

	public static final Item NEON_FRAGMENT = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("neonlights","test_fragment"), NEON_FRAGMENT);
	}
}
