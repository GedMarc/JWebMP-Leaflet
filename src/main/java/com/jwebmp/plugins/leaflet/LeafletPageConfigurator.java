package com.jwebmp.plugins.leaflet;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Leaflet JS",
		pluginDescription = "Leaflet is the leading open-source JavaScript library for mobile-friendly interactive maps. Weighing just about 38 KB of JS, it has all the mapping features most developers ever need.",
		pluginUniqueName = "leaflet-js",
		pluginVersion = "1.7.1",
		pluginCategories = "mapping,mobile, interactive, layers, heatmaps, pinpoints,ui,web ui, framework",
		pluginSubtitle = "Leaflet is designed with simplicity, performance and usability in mind. It works efficiently across all major desktop and mobile platforms, can be extended with lots of plugins, has a beautiful, easy to use and well-documented API and a simple, readable source code that is a joy to contribute to.",
		pluginSourceUrl = "http://leafletjs.com/index.html",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Leaflet/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMPLeaflet",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://leafletjs.com/index.html",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.forms/jwebmp-leafletjs",
		pluginGroupId = "com.jwebmp.plugins.forms",
		pluginArtifactId = "jwebmp-leafletjs",
		pluginModuleName = "com.jwebmp.plugins.leaflet",
		pluginStatus = PluginStatus.BaseCompleted
)
public class LeafletPageConfigurator
		implements IPageConfigurator<LeafletPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	
	/*
	 * Constructs a new LeafletPageConfigurator
	 */
	public LeafletPageConfigurator()
	{
		//Nothing needed
	}
	
	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return LeafletPageConfigurator.enabled;
	}
	
	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		LeafletPageConfigurator.enabled = mustEnable;
	}
	
	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(LeafletReferencePool.LeafletJS.getJavaScriptReference());
			page.getBody()
			    .addCssReference(LeafletReferencePool.LeafletJS.getCssReference());
		}
		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return LeafletPageConfigurator.enabled;
	}
}
