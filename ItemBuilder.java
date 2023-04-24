import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class ItemBuilder {

    private ItemStack itemStack;
    private ItemMeta itemMeta;

    public ItemBuilder(Material material) {
        itemStack = new ItemStack(material);
        itemMeta = itemStack.getItemMeta();
    }

    public ItemBuilder setDisplayname(String displayname) {
        itemMeta.setDisplayName(displayname);
        return this;
    }
    public ItemBuilder addLore(String... lore) {
        itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    public ItemBuilder addEnchant(Enchantment enchantment, int level, boolean ignoreLevelRestriction) {
        itemMeta.addEnchant(enchantment, level ,ignoreLevelRestriction);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable) {
        itemMeta.setUnbreakable(unbreakable);
        return this;
    }

    public ItemBuilder setLocalizedName(String localizedName) {
        itemMeta.setLocalizedName(localizedName);
        return this;
    }

    public ItemBuilder addItemFlags(ItemFlag... itemFlags) {
        itemMeta.addItemFlags(itemFlags);
        return this;
    }

    public ItemStack build() {
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
