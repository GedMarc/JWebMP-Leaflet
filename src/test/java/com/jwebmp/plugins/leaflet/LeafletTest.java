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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.leaflet;

import com.jwebmp.core.Page;
import com.jwebmp.core.generics.LatitudeLongitueArray;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class LeafletTest
{

	public LeafletTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		Leaflet leaflet = new Leaflet();
		leaflet.getOptions()
		       .setCenter(new LatitudeLongitueArray(51.505, -0.09));
		leaflet.getOptions()
		       .setDragging(true);
		System.out.println(leaflet.toString(true));
	}

	@Test
	public void testSomeMethod2()
	{
		Leaflet bs = new Leaflet();
		bs.getOptions()
		  .setEaseLinearity(8);
		System.out.println(bs.renderJavascript());
	}

	@Test
	public void testJavaScript()
	{
		Leaflet bs = new Leaflet();
		System.out.println(bs.renderJavascript());
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testHtml()
	{
		Page p = new Page();
		Leaflet bs = new Leaflet();
		p.getOptions()
		 .setDynamicRender(false);
		p.getBody()
		 .add(bs);
		System.out.println(p.toString(true));
	}
}
