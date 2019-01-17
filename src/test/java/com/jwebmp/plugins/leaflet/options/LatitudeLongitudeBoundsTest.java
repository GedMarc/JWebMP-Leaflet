package com.jwebmp.plugins.leaflet.options;

import com.jwebmp.core.generics.LatitudeLongitueArray;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class LatitudeLongitudeBoundsTest
{

	public LatitudeLongitudeBoundsTest()
	{
	}

	@Test
	public void testRender()
	{
		LatitudeLongitudeBounds b = new LatitudeLongitudeBounds();
		b.getRectangleBounds()
		 .add(new LatitudeLongitueArray(51.0, 68.0));
		b.getRectangleBounds()
		 .add(new LatitudeLongitueArray(152.0, 598.0));
		System.out.println(b);
	}

}
