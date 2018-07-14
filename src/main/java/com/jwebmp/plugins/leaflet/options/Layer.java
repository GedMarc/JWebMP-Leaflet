/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.leaflet.options;

import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

/**
 * Defines a layer available for the leaflet map
 *
 * @param <J>
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public abstract class Layer<J extends Layer>
		extends JavaScriptPart
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
	@SuppressWarnings("unchecked")
	public J setAttribution(String attribution)
	{
		this.attribution = attribution;
		return (J) this;
	}

}
