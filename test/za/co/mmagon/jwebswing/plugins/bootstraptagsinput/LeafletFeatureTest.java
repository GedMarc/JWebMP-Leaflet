/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.bootstraptagsinput;

import org.junit.Test;
import za.co.mmagon.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.leaflet.LeafletFeature;

/**
 *
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
        LeafletFeature bsf = new LeafletFeature(getInstance().getBody());
        bsf.getOptions().setBoxZoom(true);
        System.out.println(bsf.renderJavascript());
    }

}
