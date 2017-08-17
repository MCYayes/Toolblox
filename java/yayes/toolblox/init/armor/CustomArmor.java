package yayes.toolblox.init.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import yayes.toolblox.Toolblox;

public class CustomArmor extends ItemArmor 
{
	public CustomArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Toolblox.toolbloxtab);
	}

}
