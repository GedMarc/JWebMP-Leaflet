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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.leaflet.options.layers;

import com.jwebmp.plugins.leaflet.options.Layer;

/**
 * @param <J>
 *
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public class InteractiveLayer<J extends InteractiveLayer> extends Layer<J>
{

	private static final long serialVersionUID = 1L;
	/**
	 * If false, the layer will not emit mouse events and will act as a part of the underlying map.
	 */
	private Boolean interactive;

	/*
	 * Constructs a new InteractiveLayer
	 */
	public InteractiveLayer()
	{
		//Nothing needed
	}

	/**
	 * If false, the layer will not emit mouse events and will act as a part of the underlying map.
	 *
	 * @return
	 */
	public Boolean getInteractive()
	{
		return interactive;
	}

	/**
	 * If false, the layer will not emit mouse events and will act as a part of the underlying map.
	 *
	 * @param interactive
	 *
	 * @return
	 */
	public J setInteractive(Boolean interactive)
	{
		this.interactive = interactive;
		return (J) this;
	}

}
