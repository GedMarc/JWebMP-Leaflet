/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.leaflet;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.generics.LatitudeLongitueArray;

/**
 * @author Marc Magon
 */
public class LeafletTest extends BaseTestClass
{

	public LeafletTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		Leaflet leaflet = new Leaflet();
		leaflet.getOptions().setCenter(new LatitudeLongitueArray(51.505, -0.09));
		leaflet.getOptions().setDragging(true);
		System.out.println(leaflet.toString(true));
	}

	@Test
	public void testSomeMethod2()
	{
		Leaflet bs = new Leaflet();
		bs.getOptions().setEaseLinearity(8);
		System.out.println(bs.renderJavascript());
	}

	@Test
	public void testJavaScript()
	{
		Leaflet bs = new Leaflet();
		System.out.println(bs.renderJavascript());
	}

	@Test
	public void testHtml()
	{
		Page p = getInstance();
		Leaflet bs = new Leaflet();
		p.getOptions().setDynamicRender(false);
		p.getBody().add(bs);
		System.out.println(p.toString(true));
	}
}
