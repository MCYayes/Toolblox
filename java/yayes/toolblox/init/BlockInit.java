package yayes.toolblox.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import yayes.toolblox.Reference;
import yayes.toolblox.Toolblox;
import yayes.toolblox.init.blocks.CustomOre;

public class BlockInit 
{
	public static Block tewlblock;
	
	public static void init()
	{
		// Name = new Custom<block>("name", hardness, blast resist, harvest lvl);
		// Harvest levels = 1-wood, 2-stone, 3-diamond, 4-uber!
		tewlblock = new CustomOre("tewlblock", 2.0F, 4.0F, 4);
	}
	
	public static void register()
	{
		registerBlock(tewlblock);
	}
	
	public static void registerBlock(Block block)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(Toolblox.toolbloxtab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(tewlblock);
	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MODID + ":" + block.getUnlocalizedName().substring(5)));
	}
}
