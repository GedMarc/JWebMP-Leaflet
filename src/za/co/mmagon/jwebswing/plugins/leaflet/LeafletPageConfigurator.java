package za.co.mmagon.jwebswing.plugins.leaflet;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * Configures the Bootstrap Page Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Leaflet JS",
        pluginDescription = "Leaflet is the leading open-source JavaScript library for mobile-friendly interactive maps. Weighing just about 38 KB of JS, it has all the mapping features most developers ever need.",
        pluginUniqueName = "jwebswing-leaflet",
        pluginVersion = "1.0.3",
        pluginCategories = "mapping,mobile, interactive, layers, heatmaps, pinpoints,ui,web ui, framework",
        pluginSubtitle = "Leaflet is designed with simplicity, performance and usability in mind. It works efficiently across all major desktop and mobile platforms, can be extended with lots of plugins, has a beautiful, easy to use and well-documented API and a simple, readable source code that is a joy to contribute to.",
        pluginSourceUrl = "http://leafletjs.com/index.html",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Leaflet/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwingLeaflet",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "http://leafletjs.com/index.html",
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/Leaflet.jar/download"
)
class LeafletPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new LeafletPageConfigurator
     */
    public LeafletPageConfigurator()
    {
        //Nothing needed
    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            page.getBody().addJavaScriptReference(LeafletReferencePool.LeafletJS.getJavaScriptReference());
            page.getBody().addCssReference(LeafletReferencePool.LeafletJS.getCssReference());
        }
        return page;
    }
}
