/*
 * Copyright (c) Tarek Hosni El Alaoui 2017
 */

package de.dytanic.cloudnet.bridge.internal.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tareko on 26.08.2017.
 */
public class ItemStackBuilder {

    protected ItemMeta itemMeta;
    protected ItemStack itemStack;

    public ItemStackBuilder(Material material)
    {
        this.itemStack = new ItemStack(material);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemStackBuilder(int material)
    {
        this.itemStack = new ItemStack(material);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemStackBuilder(Material material, int amount)
    {
        this.itemStack = new ItemStack(material, amount);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemStackBuilder(int material, int amount)
    {
        this.itemStack = new ItemStack(material, amount);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemStackBuilder(Material material, int amount, int sub)
    {
        this.itemStack = new ItemStack(material, amount, (short) sub);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemStackBuilder(int material, int amount, int sub)
    {
        this.itemStack = new ItemStack(material, amount, (short) sub);
        this.itemMeta = itemStack.getItemMeta();
    }

    public static ItemStackBuilder builder(Material material)
    {
        return new ItemStackBuilder(material);
    }

    public static ItemStackBuilder builder(Material material, int amount)
    {
        return new ItemStackBuilder(material, amount);
    }

    public static ItemStackBuilder builder(Material material, int amount, int sub)
    {
        return new ItemStackBuilder(material, amount, sub);
    }

    public static ItemStackBuilder builder(int material)
    {
        return new ItemStackBuilder(material);
    }

    public static ItemStackBuilder builder(int material, int amount)
    {
        return new ItemStackBuilder(material, amount);
    }

    public static ItemStackBuilder builder(int material, int amount, int sub)
    {
        return new ItemStackBuilder(material, amount, sub);
    }

    public ItemStackBuilder enchantment(Enchantment enchantment, int value)
    {
        itemMeta.addEnchant(enchantment, value, true);
        return this;
    }

    public ItemStackBuilder displayName(String name)
    {
        itemMeta.setDisplayName(name);
        return this;
    }

    public ItemStackBuilder lore(String... lore)
    {
        itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    public ItemStackBuilder lore(List<String> lore)
    {
        itemMeta.setLore(lore);
        return this;
    }

    public ItemStack build()
    {
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

}