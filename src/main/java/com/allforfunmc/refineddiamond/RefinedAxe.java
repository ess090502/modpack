package com.allforfunmc.refineddiamond;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class RefinedAxe extends ItemAxe{
	
	public RefinedAxe(ToolMaterial mat){
		super(mat);
		this.setCreativeTab(CreativeTabs.tabTools);
		setCreativeTab(Code.AllForFunTab);
		this.setTextureName("refineddiamondmod:refinedaxe");
		this.setMaxStackSize(1);
		this.setUnlocalizedName("refinedaxe");
	}

}