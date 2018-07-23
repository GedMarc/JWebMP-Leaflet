import com.jwebmp.core.services.IPageConfigurator;
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

	provides IPageConfigurator with LeafletPageConfigurator;
}
