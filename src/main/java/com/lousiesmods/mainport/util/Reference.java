package com.lousiesmods.mainport.util;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Reference
{
    public static final String MOD_ID = "mainport";

    public static final ItemGroup CREATIVE_TAB_BLOCKS = new ItemGroup("creativeTabBlocks")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(Blocks.DIAMOND_BLOCK);
        }
    };

    public static final ItemGroup CREATIVE_TAB_ITEMS = new ItemGroup("creativeTabItems")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(Items.DIAMOND);
        }
    };


}
