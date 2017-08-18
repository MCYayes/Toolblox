package yayes.toolblox.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import yayes.toolblox.Toolblox;
import yayes.toolblox.init.items.CustomItem;

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
		item.setCreativeTab(Toolblox.toolbloxtab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
