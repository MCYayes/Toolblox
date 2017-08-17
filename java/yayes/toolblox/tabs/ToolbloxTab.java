package yayes.toolblox.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import yayes.toolblox.init.ArmorInit;

public class ToolbloxTab extends CreativeTabs
{
	public ToolbloxTab(String label)
	{
		// This is the name of the tab
		super("toolbloxtab");
		// This is the background image (which will be named "tab_toolblox.png")
		// since the script will automatically add "tab_" to the file named here
		this.setBackgroundImageName("toolblox.png");
	}
	
	public ItemStack getTabIconItem() 
	{
		// This is the image on the Creative tab for the mod tab
		//      For an Item =
        //           ItemStack(ItemInit.<name of item>);
		//      For a Block =
		//           ItemStack(Item.getItemFromBlock(BlockInit.<name of block>);
		return new ItemStack(ArmorInit.toolblox_monocle);
	}
}
