package damain.neon.lights.registry;

import damain.neon.lights.NeonLights;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

  // .breakByTool(FabricToolTags.PICKAXES, MiningLevels.STONE)
  public static final Block NEON_BLOCK = new Block(
    FabricBlockSettings
      .of(Material.GLASS)
      .breakByHand(true)
      .hardness(0.9f)
      .sounds(BlockSoundGroup.GLASS)
      .luminance(15)
  );

  public static final Block NEON_BAR = new Block(
    FabricBlockSettings
      .of(Material.GLASS)
      .breakByHand(true)
      .hardness(0.9f)
      .sounds(BlockSoundGroup.GLASS)
      .luminance(15)
      .nonOpaque()
  );

  public static final Block PRO_BUILD = new Block(
    FabricBlockSettings
      .of(Material.GLASS)
      .breakByHand(true)
      .hardness(0.9f)
      .sounds(BlockSoundGroup.GLASS)
      .luminance(15)
      .nonOpaque()
  );

  public static void registerBlocks() {
    Registry.register(
      Registry.BLOCK,
      new Identifier(NeonLights.MOD_ID, "neon_block"),
      NEON_BLOCK
    );
    Registry.register(
      Registry.BLOCK,
      new Identifier(NeonLights.MOD_ID, "neon_bar"),
      NEON_BAR
    );
    Registry.register(
      Registry.BLOCK,
      new Identifier(NeonLights.MOD_ID, "pro_build"),
      PRO_BUILD
    );
  }
}
