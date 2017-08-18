package yayes.toolblox.handlers;

import yayes.toolblox.init.ArmorInit;
import yayes.toolblox.init.BlockInit;
import yayes.toolblox.init.ItemInit;
// import yayes.toolblox.init.ToolInit;

// Handles the registration of things into the game
public class RegistryHandler 
{
	public static void Client()
	{
		
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
		// ToolInit.init();
		// ToolInit.register();
		
		ArmorInit.init();
		ArmorInit.register();
	}
}
