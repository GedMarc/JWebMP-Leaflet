/*
 * Copyright (C) 2017 GedMarc
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

package com.jwebmp.plugins.leaflet;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * Bootstrap-select is a jQuery plugin that utilizes Bootstrap's dropdown.js to style and bring additional functionality to standard select elements.
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Leaflet JS Maps",
		description = "Leaflet is the leading open-source JavaScript library for mobile-friendly interactive maps. Weighing just about 38 KB of JS, it has all the mapping features most developers ever need.",
		url = "http://leafletjs.com/index.html")
public class Leaflet
		extends DivSimple<Leaflet>
{


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

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof Leaflet))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		Leaflet leaflet = (Leaflet) o;

		return getFeature().equals(leaflet.getFeature());
	}
}
