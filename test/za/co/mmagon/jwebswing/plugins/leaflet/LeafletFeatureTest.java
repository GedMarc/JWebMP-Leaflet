/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.leaflet;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;

/**
 * @author Marc Magon
 */
public class LeafletFeatureTest extends BaseTestClass
{

	public LeafletFeatureTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		LeafletFeature leafletFeature = new LeafletFeature(getInstance().getBody());
		leafletFeature.getOptions().setBoxZoom(true);
		System.out.println(leafletFeature.renderJavascript());
	}

}
