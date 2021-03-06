package yayes.toolblox.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import yayes.toolblox.Toolblox;
import yayes.toolblox.init.tools.CustomPickaxe;

public class ToolInit 
{
	public static final ToolMaterial tutorial = EnumHelper.addToolMaterial("tutorial", 4, 5800, 12.0F, 8.5F, 10);
	
	public static Item tutorial_pickaxe;
	
	public static void init()
	{
		tutorial_pickaxe = new CustomPickaxe("tutorial_pickaxe", tutorial);
	}
	
	public static void register()
	{
		registerItem(tutorial_pickaxe);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(Toolblox.toolbloxtab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
