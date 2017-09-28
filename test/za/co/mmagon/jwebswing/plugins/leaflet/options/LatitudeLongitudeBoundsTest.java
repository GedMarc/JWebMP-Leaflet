package za.co.mmagon.jwebswing.plugins.leaflet.options;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.generics.LatitudeLongitueArray;

/**
 * @author Marc Magon
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
		b.getRectangleBounds().add(new LatitudeLongitueArray(51.0, 68.0));
		b.getRectangleBounds().add(new LatitudeLongitueArray(152.0, 598.0));
		System.out.println(b);
	}

}
