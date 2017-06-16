package com.Stroam.tfc2me;

import com.bioxx.tfc2.core.RegistryItemQueue;
import net.minecraft.item.Item;

public class ModItems {
	//public static Item StoneAxe;

	public static void Load()
	{
		TFC2ME.log.info(new StringBuilder().append("[TFC2ME] Loading Items").toString());

		//Plank = registerItemOnly(new ItemPlank().setUnlocalizedName("plank"));

		//StoneAxe = registerItem(new ItemAxe(ToolMaterial.STONE, 30).setUnlocalizedName("stone_axe"));

		//PotteryFireBrick = registerItemOnly(new ItemPotteryFireBrick().setUnlocalizedName("fire_brick"));
	}

	public static void SetupCreativeTabs()
	{
		//((TFCTabs) TFCTabs.TFCBuilding).setTabIconItemStack(new ItemStack(TFCBlocks.StoneBrick));
	}
	public static void Register()
	{
		TFC2ME.log.info(new StringBuilder().append("[TFC2ME] Registering Items").toString());
		RegistryItemQueue.getInstance().registerItems();

		SetupHarvestLevels();
	}

	/**
	 * Registers the item with the game registry and also registers a single ItemMeshDefinition for this item.
	 */
	private static Item registerItem(Item i)
	{
		RegistryItemQueue.getInstance().addFull(i);
		return i;
	}

	/**
	 * Registers the item with the game registry.<br>
	 * <br>
	 * Should be used for items that have multiple variants where we need to manually create a MeshDef
	 */
	private static Item registerItemOnly(Item i)
	{
		RegistryItemQueue.getInstance().addItemOnly(i);

		return i;
	}

	private static void SetupHarvestLevels()
	{
		//StoneAxe.setHarvestLevel("axe", 1);
	}
	
}
