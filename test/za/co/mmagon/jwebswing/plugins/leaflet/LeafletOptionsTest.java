package za.co.mmagon.jwebswing.plugins.leaflet;

import org.junit.Test;
import za.co.mmagon.jwebswing.plugins.leaflet.LeafletOptions;

/**
 *
 * @author Marc Magon
 */
public class LeafletOptionsTest
{

    public LeafletOptionsTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        LeafletOptions bso = new LeafletOptions();
        bso.setDragging(true);
        System.out.println(bso);
    }

}
