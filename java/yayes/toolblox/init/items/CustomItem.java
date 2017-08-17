package yayes.toolblox.init.items;

import net.minecraft.item.Item;
import yayes.toolblox.Toolblox;

public class CustomItem extends Item
{
	public CustomItem(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Toolblox.toolbloxtab);
	}
}
