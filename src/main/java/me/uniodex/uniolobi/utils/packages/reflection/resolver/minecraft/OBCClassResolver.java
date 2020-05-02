package me.uniodex.uniolobi.utils.packages.reflection.resolver.minecraft;

import me.uniodex.uniolobi.utils.packages.reflection.minecraft.Minecraft;
import me.uniodex.uniolobi.utils.packages.reflection.resolver.ClassResolver;

/**
 * {@link ClassResolver} for <code>org.bukkit.craftbukkit.*</code> classes
 */
public class OBCClassResolver extends ClassResolver {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Class resolve(String... names) throws ClassNotFoundException {
		for (int i = 0; i < names.length; i++) {
			if (!names[i].startsWith("org.bukkit.craftbukkit")) {
				names[i] = "org.bukkit.craftbukkit." + Minecraft.getVersion() + names[i];
			}
		}
		return super.resolve(names);
	}
}
