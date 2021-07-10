package damain.neon.lights.registry;

import damain.neon.lights.NeonLights;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item NEON_FRAGMENT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(NeonLights.MOD_ID, "neon_fragment"), NEON_FRAGMENT);
    }

}