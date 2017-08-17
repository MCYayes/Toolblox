package yayes.toolblox.init.tools;

import net.minecraft.item.ItemPickaxe;
import yayes.toolblox.Toolblox;

public class CustomPickaxe extends ItemPickaxe 
{

	public CustomPickaxe(String name, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Toolblox.toolbloxtab);
	}
	
}
