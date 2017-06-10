/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.leaflet.options.layers;

import za.co.mmagon.jwebswing.plugins.leaflet.options.Layer;

/**
 *
 * @author Marc Magon
 * @param <J>
 *
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
