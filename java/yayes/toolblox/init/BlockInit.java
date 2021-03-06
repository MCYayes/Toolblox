package yayes.toolblox.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import yayes.toolblox.Reference;
import yayes.toolblox.Toolblox;
import yayes.toolblox.init.blocks.CustomBox;
import yayes.toolblox.init.blocks.CustomOre;

public class BlockInit 
{
	public static Block tewlblock;
	public static Block puzzlebox;
	
	public static void init()
	{
		// Name = new Custom<block>("name", hardness, blast resist, harvest lvl);
		// Harvest levels = 1-wood, 2-stone, 3-diamond, 4-uber!
		tewlblock = new CustomOre("tewlblock", 2.0F, 4.0F, 4);
		puzzlebox = new CustomBox("puzzlebox", 2.0F, 4.0F, 4);
	}
	
	public static void register()
	{
		registerBlock(tewlblock);
		registerBlock(puzzlebox);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(Toolblox.toolbloxtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
