package yayes.toolblox.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlock extends Block
{
	public CustomBlock(String name, float hardness, float resistance)
	{
		super(Material.ROCK);
		// "this.blockMaterial = Material.<name of material>" to change material
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
	}
}
