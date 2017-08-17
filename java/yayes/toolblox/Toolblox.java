package yayes.toolblox;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import yayes.toolblox.proxy.CommonProxy;
import yayes.toolblox.tabs.ToolbloxTab;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Toolblox 
{
	public static final CreativeTabs toolbloxtab = new ToolbloxTab("toolbloxtab");
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		// preInit is used for initializing items, blocks, etc
		proxy.preInit(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		// init is used for renders (textures, etc)
		proxy.init(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		// postInit is for... Umm... dunno... Harry doesn't use it.
		proxy.postInit(event);
	}
}
