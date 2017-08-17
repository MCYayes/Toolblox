package yayes.toolblox.handlers;

import yayes.toolblox.init.ArmorInit;
import yayes.toolblox.init.BlockInit;
import yayes.toolblox.init.ItemInit;
import yayes.toolblox.init.ToolInit;

// Handles the registration of things into the game
public class RegistryHandler 
{
	public static void Client()
	{
		ItemInit.register();
		ToolInit.register();
		ArmorInit.register();
		BlockInit.registerRenders();
	}
	
	public static void Common()
	{
		ItemInit.init();
		BlockInit.init();
		ToolInit.init();
		ArmorInit.init();
		BlockInit.register();
	}
}
