package yayes.toolblox.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import yayes.toolblox.Toolblox;

public class CustomTool extends Item 
{
	public CustomTool(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Toolblox.toolbloxtab);
	}
}
