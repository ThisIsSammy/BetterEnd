package ru.betterend.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import ru.betterend.blocks.basis.BaseBlock;

public class AeterniumBlock extends BaseBlock {

	public AeterniumBlock() {
		super(FabricBlockSettings.of(Material.METAL, MaterialColor.GRAY)
				.hardness(65F)
				.resistance(1200F)
				.requiresTool()
				.sounds(BlockSoundGroup.NETHERITE));
	}

	@Environment(EnvType.CLIENT)
	public int getColor(BlockState state, BlockView world, BlockPos pos) {
		return 0xFF657A7A;
	}
}
