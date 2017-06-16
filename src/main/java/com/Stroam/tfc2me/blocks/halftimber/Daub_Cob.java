package com.Stroam.tfc2me.blocks.halftimber;

import com.bioxx.tfc2.Core;
import com.bioxx.tfc2.api.interfaces.IGravityBlock;
import com.bioxx.tfc2.api.interfaces.ISupportBlock;
import com.bioxx.tfc2.api.types.StoneType;
import com.bioxx.tfc2.blocks.terrain.BlockCollapsible;
import com.bioxx.tfc2.core.TFCTabs;
import com.bioxx.tfc2.core.TFC_Sounds;
import com.bioxx.tfc2.entity.EntityFallingBlockTFC;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Daub_Cob extends BlockCollapsible implements IGravityBlock{
	public static PropertyEnum META_PROPERTY = PropertyEnum.create("stone", StoneType.class);

	public Daub_Cob()
	{
		super(Material.GROUND, META_PROPERTY);
		this.setCreativeTab(TFCTabs.TFCBuilding);
		setSoundType(SoundType.STONE);
		this.collapseType = CollapsibleType.Nature;
	}

	/*******************************************************************************
	 * 1. Content
	 *******************************************************************************/

	@Override
	public void onStartFalling(EntityFallingBlockTFC fallingEntity) 
	{
		Core.playSoundAtEntity(fallingEntity, TFC_Sounds.FALLININGDIRTSHORT, 0.2f, 1.0f);
	}

	@Override
	public int getSlideHeight()
	{
		return 1;
	}

	@Override
	public float getSlideChance()
	{
		return 0.75f;
	}

	@Override
	public void onEndFalling(World worldIn, BlockPos pos) 
	{

	}

	@Override
	public boolean canFallInto(World worldIn, BlockPos pos) 
	{
		return false;
	}

	@Override
	public int getNaturalSupportRange(IBlockAccess world, BlockPos pos,IBlockState myState)
	{
		return 3;
	}

	@Override
	public boolean canBeSupportedBy(IBlockState myState, IBlockState otherState)
	{
		return (Core.isTerrain(otherState) && !Core.isSand(otherState)) || otherState.getBlock() instanceof ISupportBlock;
	}

	/*******************************************************************************
	 * 2. Rendering
	 *******************************************************************************/



	/*******************************************************************************
	 * 3. Blockstate 
	 *******************************************************************************/

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, META_PROPERTY);
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(META_PROPERTY, StoneType.getStoneTypeFromMeta(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((StoneType)state.getValue(META_PROPERTY)).getMeta();
	}
}
