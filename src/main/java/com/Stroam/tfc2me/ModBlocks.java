package com.Stroam.tfc2me;

import com.bioxx.tfc2.blocks.terrain.BlockDirt;
import com.bioxx.tfc2.items.itemblocks.ItemSoil;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {
	//public static ArrayList<Block> stairsList;
	//public static Block Dirt;
	
	public static Block rammed_earth;
	

	public static void LoadBlocks()
	{
		TFC2ME.log.info(new StringBuilder().append("[TFC2ME] Loading Blocks").toString());

		// Unlocalized names should be lowercase, and separated by underscores. "this_is_an_example"
		//Dirt = new BlockDirt().setHardness(2F).setUnlocalizedName("dirt");
		//StairsAsh = new BlockStairsTFC(Planks.getDefaultState().withProperty(BlockPlanks.META_PROPERTY, WoodType.Ash)).setUnlocalizedName("stairs_ash");
	
		rammed_earth = new BlockDirt().setHardness(2F).setUnlocalizedName("rammed_earth");
	}

	public static void RegisterBlocks()
	{
		TFC2ME.log.info(new StringBuilder().append("[TFC2ME] Registering Blocks").toString());

		// Block registration strings should be lowercase, and separated by underscores. "this_is_an_example"
		// Preferably these strings should be identical to the corresponding unlocalized name.
		
		//register(Dirt, ItemSoil.class);
		register(rammed_earth, ItemSoil.class);
		//stairsList = new ArrayList<Block>();
		//stairsList.add(register(StairsAsh, ItemStair.class));

		//StoneBrick.setHarvestLevel("pickaxe", 1);

		/*************************************
		       Set Block Flammability
		 *************************************/
		//for(Block b : stairsList)
		//	Blocks.FIRE.setFireInfo(b, 5, 20);
		//Blocks.FIRE.setFireInfo(LogNatural, 5, 5);

	}

	/**
	 * This version of register should be used to add a block to the ore dictionary
	 */
	private static Block register(Block b, Class<? extends ItemBlock> i, String oreDictName)
	{
		OreDictionary.registerOre(oreDictName, new ItemStack(b, 1, Short.MAX_VALUE));
		return register(b, i);
	}

	private static Block register(Block b, Class<? extends ItemBlock> i)
	{
		try 
		{
			GameRegistry.register(b);
			ItemBlock ib = i.getDeclaredConstructor(Block.class).newInstance(b);
			GameRegistry.register(ib, b.getRegistryName());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return b;
	}

	private static Block register(Block b)
	{
		return GameRegistry.register(b);
	}

	public static void RegisterTileEntites()
	{
		//registerTileEntity(TileCrop.class, "crop");
	}

	private static void registerTileEntity(Class<? extends TileEntity> c, String id)
	{
		GameRegistry.registerTileEntity(c, Reference.ModID+":"+id);
	}
/*
	public static Block getStairsForWood(WoodType wood)
	{
		switch(wood)
		{
		case Acacia:
			return TFCBlocks.StairsAcacia;
		case Ash:
			return TFCBlocks.StairsAsh;
		case Aspen:
			return TFCBlocks.StairsAspen;
		case Birch:
			return TFCBlocks.StairsBirch;
		case Blackwood:
			return TFCBlocks.StairsBlackwood;
		case Chestnut:
			return TFCBlocks.StairsChestnut;
		case DouglasFir:
			return TFCBlocks.StairsDouglasFir;
		case Hickory:
			return TFCBlocks.StairsHickory;
		case Kapok:
			return TFCBlocks.StairsKapok;
		case Maple:
			return TFCBlocks.StairsMaple;
		case Oak:
			return TFCBlocks.StairsOak;
		case Palm:
			return TFCBlocks.StairsPalm;
		case Pine:
			return TFCBlocks.StairsPine;
		case Rosewood:
			return TFCBlocks.StairsRosewood;
		case Sequoia:
			return TFCBlocks.StairsSequoia;
		case Spruce:
			return TFCBlocks.StairsSpruce;
		case Sycamore:
			return TFCBlocks.StairsSycamore;
		case WhiteCedar:
			return TFCBlocks.StairsWhiteCedar;
		case Willow:
			return TFCBlocks.StairsWillow;
		default:
			return TFCBlocks.StairsOak;

		}
	}*/
}
