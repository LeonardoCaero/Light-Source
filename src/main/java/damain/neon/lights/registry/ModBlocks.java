package damain.neon.lights.registry;

import damain.neon.lights.NeonLights;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
// import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
// import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    // .breakByTool(FabricToolTags.PICKAXES, MiningLevels.STONE)
    public static final Block NEON_BLOCK = new Block(FabricBlockSettings.of(Material.GLASS).breakByHand(true)
            .hardness(0.9f).sounds(BlockSoundGroup.GLASS).luminance(15));
    public static final Block NEON_BAR = new Block(FabricBlockSettings.of(Material.GLASS).breakByHand(true)
            .hardness(0.9f).sounds(BlockSoundGroup.GLASS).luminance(15));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(NeonLights.MOD_ID, "neon_block"), NEON_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(NeonLights.MOD_ID, "neon_bar"), NEON_BAR);
    }
}
