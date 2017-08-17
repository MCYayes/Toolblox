package yayes.toolblox.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import yayes.toolblox.Reference;
import yayes.toolblox.init.items.CustomItem;
import yayes.toolblox.init.items.CustomTool;

// Here be Items!
public class ItemInit 
{
	public static Item toolblox_keeper;
	
	public static void init()
	{
		toolblox_keeper = new CustomItem("toolblox_keeper");
	}
	
	public static void register()
	{
		registerItem(toolblox_keeper);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
		// format is> item.<name here>.name
	}
}
