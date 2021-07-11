package damain.neon.lights.registry;

import damain.neon.lights.NeonLights;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items
    public static final Item NEON_FRAGMENT = new Item(new Item.Settings().group(NeonLights.ITEM_GROUP));

    // Block Items
    public static final BlockItem NEON_BLOCK = new BlockItem(ModBlocks.NEON_BLOCK,
            new Item.Settings().group(NeonLights.ITEM_GROUP));

    public static final BlockItem NEON_BAR = new BlockItem(ModBlocks.NEON_BAR,
            new Item.Settings().group(NeonLights.ITEM_GROUP));

    public static final BlockItem PRO_BUILD = new BlockItem(ModBlocks.PRO_BUILD,
            new Item.Settings().group(NeonLights.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(NeonLights.MOD_ID, "neon_fragment"), NEON_FRAGMENT);
        Registry.register(Registry.ITEM, new Identifier(NeonLights.MOD_ID, "neon_block"), NEON_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(NeonLights.MOD_ID, "neon_bar"), NEON_BAR);
        Registry.register(Registry.ITEM, new Identifier(NeonLights.MOD_ID, "pro_build"), PRO_BUILD);
    }

}