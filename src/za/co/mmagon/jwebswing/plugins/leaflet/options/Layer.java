package za.co.mmagon.jwebswing.plugins.leaflet.options;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * Defines a layer available for the leaflet map
 *
 * @param <J>
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public abstract class Layer<J extends Layer> extends JavaScriptPart
{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * String to be shown in the attribution control, describes the layer data, e.g. "© Mapbox".
	 */
	private String attribution;
	
	/**
	 * COnstructs a new layer object
	 */
	public Layer()
	{
		//Nothing needed
	}
	
	/**
	 * String to be shown in the attribution control, describes the layer data, e.g. "© Mapbox".
	 *
	 * @return
	 */
	public String getAttribution()
	{
		return attribution;
	}
	
	/**
	 * String to be shown in the attribution control, describes the layer data, e.g. "© Mapbox".
	 *
	 * @param attribution
	 *
	 * @return
	 */
	public J setAttribution(String attribution)
	{
		this.attribution = attribution;
		return (J) this;
	}
	
}
