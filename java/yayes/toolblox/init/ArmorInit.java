package yayes.toolblox.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import yayes.toolblox.Reference;
import yayes.toolblox.Toolblox;
import yayes.toolblox.init.armor.CustomArmor;

public class ArmorInit 
{
	public static final ArmorMaterial toolblox_armor = EnumHelper.addArmorMaterial("monocle", Reference.MODID + ":monocle", 50, new int[]{5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5F);
	
	public static Item toolblox_monocle;
	
	public static void init()
	{
		// Format = Name, Material, Render layer (Helmet, Chestplate, & Boots = 1, Leggings = 2), Equipment slot)
		toolblox_monocle = new CustomArmor("toolblox_monocle", toolblox_armor, 1, EntityEquipmentSlot.HEAD);
	}
	
	public static void register()
	{
		registerItem(toolblox_monocle);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(Toolblox.toolbloxtab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
