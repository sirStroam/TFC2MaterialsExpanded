package com.Stroam.tfc2me;

import com.Stroam.tfc2me.core.Recipes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event)
	{

		//registerCrops();
		ModBlocks.LoadBlocks();
		ModBlocks.RegisterBlocks();
		//ModBlocks.RegisterTileEntites();
		ModItems.Load();
		ModItems.SetupCreativeTabs();
		ModItems.Register();
		
	}

	public void init(FMLInitializationEvent event)
	{
		
	}

	public void postInit(FMLPostInitializationEvent event)
	{
		Recipes.RegisterNormalRecipes();
		Recipes.RegisterKnappingRecipes();
		Recipes.RegisterKilnRecipes();
		registerFuel();
	}

	protected void registerCrops()
	{
		/*
		Crop.registerCrop(Crop.Corn);
		Crop.registerCrop(Crop.Cabbage);
		Crop.registerCrop(Crop.Tomato);
		Crop.registerCrop(Crop.Wheat);
		Crop.registerCrop(Crop.Barley);
		Crop.registerCrop(Crop.Rye);
		Crop.registerCrop(Crop.Oat);
		Crop.registerCrop(Crop.Rice);
		*/
	}

	protected void registerCropProduce()
	{
		/*FoodRegistry.getInstance().registerCropProduce(Crop.Corn, new ItemStack(TFCItems.FoodCornWhole, 1, 0));
		FoodRegistry.getInstance().registerCropProduce(Crop.Cabbage, new ItemStack(TFCItems.FoodCabbage, 1, 0));
		FoodRegistry.getInstance().registerCropProduce(Crop.Tomato, new ItemStack(TFCItems.FoodTomato, 1, 0));
		FoodRegistry.getInstance().registerCropProduce(Crop.Wheat, new ItemStack(TFCItems.FoodWheatWhole, 1, 0));
		FoodRegistry.getInstance().registerCropProduce(Crop.Barley, new ItemStack(TFCItems.FoodBarleyWhole, 1, 0));
		FoodRegistry.getInstance().registerCropProduce(Crop.Rye, new ItemStack(TFCItems.FoodRyeWhole, 1, 0));
		FoodRegistry.getInstance().registerCropProduce(Crop.Oat, new ItemStack(TFCItems.FoodOatWhole, 1, 0));
		FoodRegistry.getInstance().registerCropProduce(Crop.Rice, new ItemStack(TFCItems.FoodRiceWhole, 1, 0));*/
	}

	protected void registerFuel()
	{
		/*
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical2, 1, WoodType.Rosewood.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical2, 1, WoodType.Blackwood.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical2, 1, WoodType.Palm.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Acacia.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Ash.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Aspen.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Birch.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Chestnut.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.DouglasFir.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Hickory.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Kapok.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Maple.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Oak.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Pine.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Sequoia.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Spruce.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Sycamore.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.WhiteCedar.getMeta()), 2000);
		Global.AddFirepitFuel(new ItemStack(TFCBlocks.LogVertical, 1, WoodType.Willow.getMeta()), 2000);
		*/
	}

	protected void registerOreDictionary()
	{
		/*
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.LogVertical, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.LogVertical2, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.LogHorizontal, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.LogHorizontal2, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.LogHorizontal3, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.LogNatural, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.LogNatural2, 1, OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("logWood", new ItemStack(TFCBlocks.LogNaturalPalm, 1, OreDictionary.WILDCARD_VALUE));
		*/
	}

	//public File getMinecraftDir()
	//{
	//	return FMLCommonHandler.instance().getMinecraftServerInstance().getFile("");/*new File(".");*/
	//}

	public void registerKeys()
	{

	}

	public void registerKeyBindingHandler()
	{

	}

	public void uploadKeyBindingsToGame()
	{

	}

	public EntityPlayer getPlayer()
	{
		return null;
	}

	public boolean isClientSide() 
	{
		return false;
	}

	
}
