package com.Stroam.tfc2me.blocks;

import com.bioxx.tfc2.Core;
import com.bioxx.tfc2.api.interfaces.IGravityBlock;
import com.bioxx.tfc2.api.interfaces.ISupportBlock;
import com.bioxx.tfc2.blocks.terrain.BlockCollapsible;
import com.bioxx.tfc2.core.TFCTabs;
import com.bioxx.tfc2.core.TFC_Sounds;
import com.bioxx.tfc2.entity.EntityFallingBlockTFC;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlockFacing extends BlockCollapsible implements IGravityBlock {

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public ModBlockFacing(String name, Material material, SoundType sound, Float hardness, Float resistance) {
        super(material, null);
        this.setSoundType(sound);
        setHardness(hardness);
        setResistance(resistance);

        setUnlocalizedName(name);//(Reference.ModID + "." + name);
        //setRegistryName(name);
        setCreativeTab(TFCTabs.TFCBuilding);
        this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.getFront(meta);

        if(facing.getAxis()==EnumFacing.Axis.Y) {
            facing=EnumFacing.NORTH;
        }

        return getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getIndex();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public int getSlideHeight() {
        return 1;
    }

    @Override
    public float getSlideChance() {
        return 0.75f;
    }

    @Override
    public void onStartFalling(EntityFallingBlockTFC entityFallingBlockTFC) {
        Core.playSoundAtEntity(entityFallingBlockTFC, TFC_Sounds.FALLININGDIRTSHORT, 0.2f, 1.0f);
    }

    @Override
    public void onEndFalling(World world, BlockPos blockPos) {

    }

    @Override
    public boolean canFallInto(World world, BlockPos blockPos) {
        return false;
    }

    @Override
    public int getNaturalSupportRange(IBlockAccess world, BlockPos pos, IBlockState myState)
    {
        return 3;
    }

    @Override
    public boolean canBeSupportedBy(IBlockState myState, IBlockState otherState)
    {
        return (Core.isTerrain(otherState) && !Core.isSand(otherState)) || otherState.getBlock() instanceof ISupportBlock;
    }
}
