package ru.betterend.mixin.common;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;

@Mixin(ComposterBlock.class)
public interface ComposterBlockAccessor {
	@Invoker
	static void callRegisterCompostableItem(float levelIncreaseChance, ItemConvertible item) {
		throw new AssertionError("@Invoker dummy body called");
	}
}
