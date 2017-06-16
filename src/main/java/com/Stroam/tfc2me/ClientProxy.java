package com.Stroam.tfc2me;

import com.Stroam.tfc2me.core.TimberRegistry;
import com.bioxx.tfc2.Core;
import com.bioxx.tfc2.api.Global;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		TimberRegistry.initModels();
		setupBlockMeshes();

	}

	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);
	}

	@Override
	public boolean isClientSide()
	{
		return true;
	}

	//Keep at the bottom of the file so its not a nuisence
	private void setupBlockMeshes() 
	{
		
		OBJLoader.INSTANCE.addDomain(Reference.ModID);
		
		registerVariantModel(Item.getItemFromBlock(ModBlocks.rammed_earth), "rammed_earth/", Global.STONE_ALL, 0, 16);
		
/*
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TFCBlocks.LooseRocks), 0, new ModelResourceLocation(Reference.ModID + ":loose_rock", "inventory"));

		ModelLoader.setCustomStateMapper(TFCBlocks.Leaves2, ignoreState);
		registerVariantModel(Item.getItemFromBlock(TFCBlocks.Dirt), "Dirt/", Global.STONE_ALL, 0, 16);
		registerVariantModel(Item.getItemFromBlock(TFCBlocks.Planks), "Wood/Planks/", WoodType.getNamesArray(), 0, 16);
		registerVariantModel(Item.getItemFromBlock(TFCBlocks.Planks2), "Wood/Planks/", WoodType.getNamesArray(), 16, 19);
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TFCBlocks.Leaves2), 18, new ModelResourceLocation(Reference.ModID + ":leaves_palm", "inventory"));
		registerVariantModel(Item.getItemFromBlock(TFCBlocks.StoneBrick), "StoneBrick/", Global.STONE_ALL, 0, 16);
		{
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(b),0,new ModelResourceLocation(Reference.ModID + ":Wood/Stairs/"+Core.getUnlocalized(b.getUnlocalizedName()), "inventory"));
		}
		RegistryItemQueue.getInstance().registerMeshes();
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TFCBlocks.Thatch), 0, new ModelResourceLocation(Reference.ModID + ":thatch", "inventory"));
		*/
	}

	private void registerVariantModel(Item item, String path, String[] variantNames, int metaStart, int metaEnd)
	{
		for(int meta = metaStart; meta < metaEnd; meta++)
		{
			String vName = Core.textConvert(variantNames[meta]);
			ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(Reference.ModID + ":" + path + vName, "inventory");
			ModelLoader.setCustomModelResourceLocation(item, meta, itemModelResourceLocation);
		}
	}

	@Override
	public EntityPlayer getPlayer()
	{
		return Minecraft.getMinecraft().player;
	}
}
