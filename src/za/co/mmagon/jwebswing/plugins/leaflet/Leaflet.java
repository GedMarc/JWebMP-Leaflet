package za.co.mmagon.jwebswing.plugins.leaflet;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Leaflet JS Maps", description = "Leaflet is the leading open-source JavaScript library for mobile-friendly interactive maps. Weighing just about 38 KB of JS, it has all the mapping features most developers ever need.",
		url = "http://leafletjs.com/index.html")
public class Leaflet extends Div
{

	private static final long serialVersionUID = 1L;
	/**
	 * The feature for this select
	 */
	private LeafletFeature feature;

	/*
	 * Constructs a new Leaflet
	 */
	public Leaflet()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the feature for this component
	 *
	 * @return
	 */
	public LeafletFeature getFeature()
	{
		if (feature == null)
		{
			feature = new LeafletFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature for this bootstrap drop down
	 *
	 * @param feature
	 */
	public void setFeature(LeafletFeature feature)
	{
		this.feature = feature;
	}

	@Override
	public LeafletOptions getOptions()
	{
		return getFeature().getOptions();
	}

}
