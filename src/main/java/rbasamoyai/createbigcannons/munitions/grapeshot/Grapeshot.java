package rbasamoyai.createbigcannons.munitions.grapeshot;

import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import rbasamoyai.createbigcannons.CBCTags;
import rbasamoyai.createbigcannons.CreateBigCannons;
import rbasamoyai.createbigcannons.munitions.shrapnel.Shrapnel;

public class Grapeshot extends Shrapnel {

	public Grapeshot(EntityType<? extends Grapeshot> type, Level level) {
		super(type, level);
	}
	
	@Override
	protected TagKey<Block> getDestroyBlockTag() {
		return CBCTags.BlockCBC.GRAPESHOT_DESTROYS;
	}
	
	private static final DamageSource GRAPESHOT = new DamageSource(CreateBigCannons.MOD_ID + ".grapeshot");
	@Override protected DamageSource getDamageSource() { return GRAPESHOT; }
	@Override protected float getDamage() { return 19.0f; }

}