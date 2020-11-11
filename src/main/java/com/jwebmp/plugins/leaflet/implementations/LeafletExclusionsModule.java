package com.jwebmp.plugins.leaflet.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class LeafletExclusionsModule
		implements IGuiceScanModuleExclusions<LeafletExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.leaflet");
		return strings;
	}
}
