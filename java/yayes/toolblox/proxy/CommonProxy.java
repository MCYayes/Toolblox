package yayes.toolblox.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import yayes.toolblox.handlers.RegistryHandler;

public class CommonProxy 
{
	// Common Proxy is general stuff for servers and Multiplayer
	
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.Common();
	}
		
	public void init(FMLInitializationEvent event)
	{
		
	}
		
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
