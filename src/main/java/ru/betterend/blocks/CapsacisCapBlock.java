package ru.betterend.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import ru.betterend.blocks.basis.BaseBlock;
import ru.betterend.noise.OpenSimplexNoise;
import ru.betterend.util.MHelper;

public class CapsacisCapBlock extends BaseBlock {
	public static final IntProperty COLOR = IntProperty.of("color", 0, 7);
	private static final OpenSimplexNoise NOISE = new OpenSimplexNoise(0);
	
	public CapsacisCapBlock(MaterialColor color) {
		super(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK).materialColor(color));
	}
	
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		double px = ctx.getBlockPos().getX() * 0.1;
		double py = ctx.getBlockPos().getY() * 0.1;
		double pz = ctx.getBlockPos().getZ() * 0.1;
		return this.getDefaultState().with(COLOR, MHelper.floor(NOISE.eval(px, py, pz) * 3.5 + 4));
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(COLOR);
	}
}
