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
 * Abstract class that defines coordinate reference systems for projecting geographical points into pixel (screen) coordinates and back (and to coordinates in other units for WMS
 * services). See
 * spatial reference system. Leaflet defines the most usual CRSs by default. If you want to use a CRS not defined by default, take a look at the Proj4Leaflet plugin.
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public class CRS
		extends JavaScriptPart
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
