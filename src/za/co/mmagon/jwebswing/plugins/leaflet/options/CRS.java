package za.co.mmagon.jwebswing.plugins.leaflet.options;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * Abstract class that defines coordinate reference systems for projecting geographical points into pixel (screen) coordinates and back (and to coordinates in other units for WMS services). See
 * spatial reference system. Leaflet defines the most usual CRSs by default. If you want to use a CRS not defined by default, take a look at the Proj4Leaflet plugin.
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public class CRS extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new CRS
	 */
	public CRS()
	{
		//Nothing needed
	}
}
