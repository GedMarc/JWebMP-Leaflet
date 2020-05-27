module com.jwebmp.plugins.leaflet {

	exports com.jwebmp.plugins.leaflet;
	exports com.jwebmp.plugins.leaflet.options;
	exports com.jwebmp.plugins.leaflet.options.layers;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires java.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.leaflet.LeafletPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.leaflet.implementations.LeafletExclusionsModule;

	opens com.jwebmp.plugins.leaflet to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.leaflet.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.leaflet.options.layers to com.fasterxml.jackson.databind, com.jwebmp.core;
}
