import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.leaflet.LeafletPageConfigurator;

module com.jwebmp.plugins.leaflet {

	exports com.jwebmp.plugins.leaflet;
	exports com.jwebmp.plugins.leaflet.options;
	exports com.jwebmp.plugins.leaflet.options.layers;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with LeafletPageConfigurator;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.leaflet.implementations.LeafletExclusionsModule;
	provides IGuiceScanJarExclusions with com.jwebmp.plugins.leaflet.implementations.LeafletExclusionsModule;

	opens com.jwebmp.plugins.leaflet to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.leaflet.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.leaflet.options.layers to com.fasterxml.jackson.databind, com.jwebmp.core;
}
