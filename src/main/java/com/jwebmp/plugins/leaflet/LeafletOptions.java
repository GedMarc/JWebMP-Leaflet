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

package com.jwebmp.plugins.leaflet;

import com.jwebmp.core.generics.LatitudeLongitueArray;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.leaflet.options.CRS;
import com.jwebmp.plugins.leaflet.options.LatitudeLongitudeBounds;
import com.jwebmp.plugins.leaflet.options.Layer;

/**
 * The central class of the API — it is used to create a map on a page and manipulate it.
 *
 * @author GedMarc
 * @since 09 Jun 2017
 */
public class LeafletOptions
		extends JavaScriptPart<LeafletOptions>
{


	/**
	 * Whether Paths should be rendered on a Canvas renderer. By default, all Paths are rendered in a SVG renderer.*
	 */
	private Boolean preferCanvas;
	/**
	 * Whether a attribution control is added to the map by default.*
	 */
	private Boolean attributionControl;
	/**
	 * Whether a zoom control is added to the map by default.*
	 */
	private Boolean zoomControl;
	/**
	 * Set it to false if you don't want popups to close when user clicks the map.*
	 */
	private Boolean closePopupOnClick;
	/**
	 * Forces the map's zoom level to always be a multiple of this, particularly right after a fitBounds() or a pinch-zoom. By default, the zoom level snaps to the nearest integer;
	 * lower values (e.g.
	 * 0.5 or 0.1) allow for greater granularity. A value of 0 means the zoom level will not be snapped after fitBounds or a pinch-zoom.*
	 */
	private Integer zoomSnap;
	/**
	 * Controls how much the map's zoom level will change after a zoomIn(), zoomOut(), pressing + or - on the keyboard, or using the zoom controls. Values smaller than 1 (e.g. 0.5)
	 * allow for greater
	 * granularity.*
	 */
	private Integer zoomDelta;
	/**
	 * Whether the map automatically handles browser window resize to update itself.*
	 */
	private Boolean trackResize;
	/**
	 * Whether the map can be zoomed to a rectangular area specified by dragging the mouse while pressing the shift key.*
	 */
	private Boolean boxZoom;
	/**
	 * Whether the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift. If passed 'center', double-click zoom will zoom to the
	 * center of the view
	 * regardless of where the mouse was.*
	 */
	private Boolean doubleClickZoom;
	/**
	 * Whether the map be draggable with mouse/touch or not.*
	 */
	private Boolean dragging;
	/**
	 * The Coordinate Reference System to use. Don't change this if you're not sure what it means.*
	 */
	private CRS crs;
	/**
	 * Initial geographic center of the map*
	 */
	private LatitudeLongitueArray center;
	/**
	 * Initial map zoom level*
	 */
	private Integer zoom;
	/**
	 * Minimum zoom level of the map. Overrides any minZoom option set on map layers.*
	 */
	private Integer minZoom;
	/**
	 * Maximum zoom level of the map. Overrides any maxZoom option set on map layers.*
	 */
	private Integer maxZoom;
	/**
	 * Array of layers that will be added to the map initially*
	 */
	private Layer[] layers;
	/**
	 * When this option is set, the map restricts the view to the given geographical bounds, bouncing the user back if the user tries to pan outside the view. To set the
	 * restriction dynamically, use
	 * setMaxBounds method.*
	 */
	private LatitudeLongitudeBounds maxBounds;
	/**
	 * Whether the map zoom animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.*
	 */
	private Boolean zoomAnimation;
	/**
	 * Won't animate zoom if the zoom difference exceeds this value.*
	 */
	private Integer zoomAnimationThreshold;
	/**
	 * Whether the tile fade animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.*
	 */
	private Boolean fadeAnimation;
	/**
	 * Whether markers animate their zoom with the zoom animation, if disabled they will disappear for the length of the animation. By default it's enabled in all browsers that
	 * support CSS3
	 * Transitions except Android.*
	 */
	private Boolean markerZoomAnimation;
	/**
	 * Defines the maximum size of a CSS translation transform. The default value should not be changed unless a web browser positions layers in the wrong place after doing a large
	 * panBy.*
	 */
	private Integer transform3DLimit;
	/**
	 * If enabled, panning of the map will have an inertia effect where the map builds momentum while dragging and continues moving in the same direction for some time. Feels
	 * especially nice on touch
	 * devices. Enabled by default unless running on old Android devices.*
	 */
	private Boolean inertia;
	/**
	 * The rate with which the inertial movement slows down, in pixels/second².*
	 */
	private Integer inertiaDeceleration;
	/**
	 * Max speed of the inertial movement, in pixels/second.*
	 */
	private Integer inertiaMaxSpeed;
	/**
	 * *
	 */
	private Integer easeLinearity;
	/**
	 * With this option enabled, the map tracks when you pan to another "copy" of the world and seamlessly jumps to the original one so that all overlays like markers and vector
	 * layers are still
	 * visible.*
	 */
	private Boolean worldCopyJump;
	/**
	 * If maxBounds is set, this option will control how solid the bounds are when dragging the map around. The default value of 0.0 allows the user to drag outside the bounds at
	 * normal speed, higher
	 * values will slow down map dragging outside bounds, and 1.0 makes the bounds fully solid, preventing the user from dragging outside the bounds.*
	 */
	private Integer maxBoundsViscosity;
	/**
	 * Makes the map focusable and allows users to navigate the map with keyboard arrows and +/- keys.*
	 */
	private Boolean keyboard;
	/**
	 * Amount of pixels to pan when pressing an arrow key.*
	 */
	private Integer keyboardPanDelta;
	/**
	 * Whether the map can be zoomed by using the mouse wheel. If passed 'center', it will zoom to the center of the view regardless of where the mouse was.*
	 */
	private Boolean scrollWheelZoom;
	/**
	 * Limits the rate at which a wheel can fire (in milliseconds). By default user can't zoom via wheel more often than once per 40 ms.*
	 */
	private Integer wheelDebounceTime;
	/**
	 * How many scroll pixels (as reported by L.DomEvent.getWheelDelta) mean a change of one full zoom level. Smaller values will make wheel-zooming faster (and vice versa).*
	 */
	private Integer wheelPxPerZoomLevel;
	/**
	 * Enables mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events).*
	 */
	private Boolean tap;
	/**
	 * The max number of pixels a user can shift his finger during touch for it to be considered a valid tap.*
	 */
	private Integer tapTolerance;
	/**
	 * Whether the map can be zoomed by touch-dragging with two fingers. If passed 'center', it will zoom to the center of the view regardless of where the touch events (fingers)
	 * were. Enabled for
	 * touch-capable web browsers except for old Androids.*
	 */
	private Boolean touchZoom;
	/**
	 * Set it to false if you don't want the map to zoom beyond min/max zoom and then bounce back when pinch-zooming.*
	 */
	private Boolean bounceAtZoomLimits;

	/**
	 * Constructs a new leaflet options
	 */
	public LeafletOptions()
	{
		//Nothing needed here
	}

	/**
	 * Whether Paths should be rendered on a Canvas renderer. By default, all Paths are rendered in a SVG renderer.
	 *
	 * @return
	 */
	public Boolean getPreferCanvas()
	{
		return preferCanvas;
	}

	/**
	 * Whether Paths should be rendered on a Canvas renderer. By default, all Paths are rendered in a SVG renderer.
	 *
	 * @param preferCanvas
	 *
	 * @return
	 */
	public LeafletOptions setPreferCanvas(Boolean preferCanvas)
	{
		this.preferCanvas = preferCanvas;
		return this;
	}

	/**
	 * Whether a attribution control is added to the map by default.
	 *
	 * @return
	 */
	public Boolean getAttributionControl()
	{
		return attributionControl;
	}

	/**
	 * Whether a attribution control is added to the map by default.
	 *
	 * @param attributionControl
	 *
	 * @return
	 */
	public LeafletOptions setAttributionControl(Boolean attributionControl)
	{
		this.attributionControl = attributionControl;
		return this;
	}

	/**
	 * Whether a zoom control is added to the map by default.
	 *
	 * @return
	 */
	public Boolean getZoomControl()
	{
		return zoomControl;
	}

	/**
	 * Whether a zoom control is added to the map by default.
	 *
	 * @param zoomControl
	 *
	 * @return
	 */
	public LeafletOptions setZoomControl(Boolean zoomControl)
	{
		this.zoomControl = zoomControl;
		return this;
	}

	/**
	 * Set it to false if you don't want popups to close when user clicks the map.
	 *
	 * @return
	 */
	public Boolean getClosePopupOnClick()
	{
		return closePopupOnClick;
	}

	/**
	 * Set it to false if you don't want popups to close when user clicks the map.
	 *
	 * @param closePopupOnClick
	 *
	 * @return
	 */
	public LeafletOptions setClosePopupOnClick(Boolean closePopupOnClick)
	{
		this.closePopupOnClick = closePopupOnClick;
		return this;
	}

	/**
	 * Forces the map's zoom level to always be a multiple of this, particularly right after a fitBounds() or a pinch-zoom. By default, the zoom level snaps to the nearest integer;
	 * lower values (e.g.
	 * 0.5 or 0.1) allow for greater granularity. A value of 0 means the zoom level will not be snapped after fitBounds or a pinch-zoom.
	 *
	 * @return
	 */
	public Integer getZoomSnap()
	{
		return zoomSnap;
	}

	/**
	 * Forces the map's zoom level to always be a multiple of this, particularly right after a fitBounds() or a pinch-zoom. By default, the zoom level snaps to the nearest integer;
	 * lower values (e.g.
	 * 0.5 or 0.1) allow for greater granularity. A value of 0 means the zoom level will not be snapped after fitBounds or a pinch-zoom.
	 *
	 * @param zoomSnap
	 *
	 * @return
	 */
	public LeafletOptions setZoomSnap(Integer zoomSnap)
	{
		this.zoomSnap = zoomSnap;
		return this;
	}

	/**
	 * Controls how much the map's zoom level will change after a zoomIn(), zoomOut(), pressing + or - on the keyboard, or using the zoom controls. Values smaller than 1 (e.g. 0.5)
	 * allow for greater
	 * granularity.
	 *
	 * @return
	 */
	public Integer getZoomDelta()
	{
		return zoomDelta;
	}

	/**
	 * Controls how much the map's zoom level will change after a zoomIn(), zoomOut(), pressing + or - on the keyboard, or using the zoom controls. Values smaller than 1 (e.g. 0.5)
	 * allow for greater
	 * granularity.
	 *
	 * @param zoomDelta
	 *
	 * @return
	 */
	public LeafletOptions setZoomDelta(Integer zoomDelta)
	{
		this.zoomDelta = zoomDelta;
		return this;
	}

	/**
	 * Whether the map automatically handles browser window resize to update itself.
	 *
	 * @return
	 */
	public Boolean getTrackResize()
	{
		return trackResize;
	}

	/**
	 * Whether the map automatically handles browser window resize to update itself.
	 *
	 * @param trackResize
	 *
	 * @return
	 */
	public LeafletOptions setTrackResize(Boolean trackResize)
	{
		this.trackResize = trackResize;
		return this;
	}

	/**
	 * Whether the map can be zoomed to a rectangular area specified by dragging the mouse while pressing the shift key.
	 *
	 * @return
	 */
	public Boolean getBoxZoom()
	{
		return boxZoom;
	}

	/**
	 * Whether the map can be zoomed to a rectangular area specified by dragging the mouse while pressing the shift key.
	 *
	 * @param boxZoom
	 *
	 * @return
	 */
	public LeafletOptions setBoxZoom(Boolean boxZoom)
	{
		this.boxZoom = boxZoom;
		return this;
	}

	/**
	 * Whether the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift. If passed 'center', double-click zoom will zoom to the
	 * center of the view
	 * regardless of where the mouse was.
	 *
	 * @return
	 */
	public Boolean getDoubleClickZoom()
	{
		return doubleClickZoom;
	}

	/**
	 * Whether the map can be zoomed in by double clicking on it and zoomed out by double clicking while holding shift. If passed 'center', double-click zoom will zoom to the
	 * center of the view
	 * regardless of where the mouse was.
	 *
	 * @param doubleClickZoom
	 *
	 * @return
	 */
	public LeafletOptions setDoubleClickZoom(Boolean doubleClickZoom)
	{
		this.doubleClickZoom = doubleClickZoom;
		return this;
	}

	/**
	 * Whether the map be draggable with mouse/touch or not.
	 *
	 * @return
	 */
	public Boolean getDragging()
	{
		return dragging;
	}

	/**
	 * Whether the map be draggable with mouse/touch or not.
	 *
	 * @param dragging
	 *
	 * @return
	 */
	public LeafletOptions setDragging(Boolean dragging)
	{
		this.dragging = dragging;
		return this;
	}

	/**
	 * The Coordinate Reference System to use. Don't change this if you're not sure what it means.
	 *
	 * @return
	 */
	public CRS getCrs()
	{
		return crs;
	}

	/**
	 * The Coordinate Reference System to use. Don't change this if you're not sure what it means.
	 *
	 * @param crs
	 *
	 * @return
	 */
	public LeafletOptions setCrs(CRS crs)
	{
		this.crs = crs;
		return this;
	}

	/**
	 * Initial geographic center of the map
	 *
	 * @return
	 */
	public LatitudeLongitueArray getCenter()
	{
		return center;
	}

	/**
	 * Initial geographic center of the map
	 *
	 * @param center
	 *
	 * @return
	 */
	public LeafletOptions setCenter(LatitudeLongitueArray center)
	{
		this.center = center;
		return this;
	}

	/**
	 * Initial map zoom level
	 *
	 * @return
	 */
	public Integer getZoom()
	{
		return zoom;
	}

	/**
	 * Initial map zoom level
	 *
	 * @param zoom
	 *
	 * @return
	 */
	public LeafletOptions setZoom(Integer zoom)
	{
		this.zoom = zoom;
		return this;
	}

	/**
	 * Minimum zoom level of the map. Overrides any minZoom option set on map layers.
	 *
	 * @return
	 */
	public Integer getMinZoom()
	{
		return minZoom;
	}

	/**
	 * Minimum zoom level of the map. Overrides any minZoom option set on map layers.
	 *
	 * @param minZoom
	 *
	 * @return
	 */
	public LeafletOptions setMinZoom(Integer minZoom)
	{
		this.minZoom = minZoom;
		return this;
	}

	/**
	 * Maximum zoom level of the map. Overrides any maxZoom option set on map layers.
	 *
	 * @return
	 */
	public Integer getMaxZoom()
	{
		return maxZoom;
	}

	/**
	 * Maximum zoom level of the map. Overrides any maxZoom option set on map layers.
	 *
	 * @param maxZoom
	 *
	 * @return
	 */
	public LeafletOptions setMaxZoom(Integer maxZoom)
	{
		this.maxZoom = maxZoom;
		return this;
	}

	/**
	 * Array of layers that will be added to the map initially
	 *
	 * @return
	 */
	public Layer[] getLayers()
	{
		return layers;
	}

	/**
	 * Array of layers that will be added to the map initially
	 *
	 * @param layers
	 *
	 * @return
	 */
	public LeafletOptions setLayers(Layer[] layers)
	{
		this.layers = layers;
		return this;
	}

	/**
	 * When this option is set, the map restricts the view to the given geographical bounds, bouncing the user back if the user tries to pan outside the view. To set the
	 * restriction dynamically, use
	 * setMaxBounds method.
	 *
	 * @return
	 */
	public LatitudeLongitudeBounds getMaxBounds()
	{
		return maxBounds;
	}

	/**
	 * When this option is set, the map restricts the view to the given geographical bounds, bouncing the user back if the user tries to pan outside the view. To set the
	 * restriction dynamically, use
	 * setMaxBounds method.
	 *
	 * @param maxBounds
	 *
	 * @return
	 */
	public LeafletOptions setMaxBounds(LatitudeLongitudeBounds maxBounds)
	{
		this.maxBounds = maxBounds;
		return this;
	}

	/**
	 * Whether the map zoom animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
	 *
	 * @return
	 */
	public Boolean getZoomAnimation()
	{
		return zoomAnimation;
	}

	/**
	 * Whether the map zoom animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
	 *
	 * @param zoomAnimation
	 *
	 * @return
	 */
	public LeafletOptions setZoomAnimation(Boolean zoomAnimation)
	{
		this.zoomAnimation = zoomAnimation;
		return this;
	}

	/**
	 * Won't animate zoom if the zoom difference exceeds this value.
	 *
	 * @return
	 */
	public Integer getZoomAnimationThreshold()
	{
		return zoomAnimationThreshold;
	}

	/**
	 * Won't animate zoom if the zoom difference exceeds this value.
	 *
	 * @param zoomAnimationThreshold
	 *
	 * @return
	 */
	public LeafletOptions setZoomAnimationThreshold(Integer zoomAnimationThreshold)
	{
		this.zoomAnimationThreshold = zoomAnimationThreshold;
		return this;
	}

	/**
	 * Whether the tile fade animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
	 *
	 * @return
	 */
	public Boolean getFadeAnimation()
	{
		return fadeAnimation;
	}

	/**
	 * Whether the tile fade animation is enabled. By default it's enabled in all browsers that support CSS3 Transitions except Android.
	 *
	 * @param fadeAnimation
	 *
	 * @return
	 */
	public LeafletOptions setFadeAnimation(Boolean fadeAnimation)
	{
		this.fadeAnimation = fadeAnimation;
		return this;
	}

	/**
	 * Whether markers animate their zoom with the zoom animation, if disabled they will disappear for the length of the animation. By default it's enabled in all browsers that
	 * support CSS3
	 * Transitions except Android.
	 *
	 * @return
	 */
	public Boolean getMarkerZoomAnimation()
	{
		return markerZoomAnimation;
	}

	/**
	 * Whether markers animate their zoom with the zoom animation, if disabled they will disappear for the length of the animation. By default it's enabled in all browsers that
	 * support CSS3
	 * Transitions except Android.
	 *
	 * @param markerZoomAnimation
	 *
	 * @return
	 */
	public LeafletOptions setMarkerZoomAnimation(Boolean markerZoomAnimation)
	{
		this.markerZoomAnimation = markerZoomAnimation;
		return this;
	}

	/**
	 * Defines the maximum size of a CSS translation transform. The default value should not be changed unless a web browser positions layers in the wrong place after doing a large
	 * panBy.
	 *
	 * @return
	 */
	public Integer getTransform3DLimit()
	{
		return transform3DLimit;
	}

	/**
	 * Defines the maximum size of a CSS translation transform. The default value should not be changed unless a web browser positions layers in the wrong place after doing a large
	 * panBy.
	 *
	 * @param transform3DLimit
	 *
	 * @return
	 */
	public LeafletOptions setTransform3DLimit(Integer transform3DLimit)
	{
		this.transform3DLimit = transform3DLimit;
		return this;
	}

	/**
	 * If enabled, panning of the map will have an inertia effect where the map builds momentum while dragging and continues moving in the same direction for some time. Feels
	 * especially nice on touch
	 * devices. Enabled by default unless running on old Android devices.
	 *
	 * @return
	 */
	public Boolean getInertia()
	{
		return inertia;
	}

	/**
	 * If enabled, panning of the map will have an inertia effect where the map builds momentum while dragging and continues moving in the same direction for some time. Feels
	 * especially nice on touch
	 * devices. Enabled by default unless running on old Android devices.
	 *
	 * @param inertia
	 *
	 * @return
	 */
	public LeafletOptions setInertia(Boolean inertia)
	{
		this.inertia = inertia;
		return this;
	}

	/**
	 * The rate with which the inertial movement slows down, in pixels/second².
	 *
	 * @return
	 */
	public Integer getInertiaDeceleration()
	{
		return inertiaDeceleration;
	}

	/**
	 * The rate with which the inertial movement slows down, in pixels/second².
	 *
	 * @param inertiaDeceleration
	 *
	 * @return
	 */
	public LeafletOptions setInertiaDeceleration(Integer inertiaDeceleration)
	{
		this.inertiaDeceleration = inertiaDeceleration;
		return this;
	}

	/**
	 * Max speed of the inertial movement, in pixels/second.
	 *
	 * @return
	 */
	public Integer getInertiaMaxSpeed()
	{
		return inertiaMaxSpeed;
	}

	/**
	 * Max speed of the inertial movement, in pixels/second.
	 *
	 * @param inertiaMaxSpeed
	 *
	 * @return
	 */
	public LeafletOptions setInertiaMaxSpeed(Integer inertiaMaxSpeed)
	{
		this.inertiaMaxSpeed = inertiaMaxSpeed;
		return this;
	}

	/**
	 * Max speed of the inertial movement, in pixels/second.
	 *
	 * @return
	 */
	public Integer getEaseLinearity()
	{
		return easeLinearity;
	}

	/**
	 * Max speed of the inertial movement, in pixels/second.
	 *
	 * @param easeLinearity
	 *
	 * @return
	 */
	public LeafletOptions setEaseLinearity(Integer easeLinearity)
	{
		this.easeLinearity = easeLinearity;
		return this;
	}

	/**
	 * With this option enabled, the map tracks when you pan to another "copy" of the world and seamlessly jumps to the original one so that all overlays like markers and vector
	 * layers are still
	 * visible.
	 *
	 * @return
	 */
	public Boolean getWorldCopyJump()
	{
		return worldCopyJump;
	}

	/**
	 * With this option enabled, the map tracks when you pan to another "copy" of the world and seamlessly jumps to the original one so that all overlays like markers and vector
	 * layers are still
	 * visible.
	 *
	 * @param worldCopyJump
	 *
	 * @return
	 */
	public LeafletOptions setWorldCopyJump(Boolean worldCopyJump)
	{
		this.worldCopyJump = worldCopyJump;
		return this;
	}

	/**
	 * If maxBounds is set, this option will control how solid the bounds are when dragging the map around. The default value of 0.0 allows the user to drag outside the bounds at
	 * normal speed, higher
	 * values will slow down map dragging outside bounds, and 1.0 makes the bounds fully solid, preventing the user from dragging outside the bounds.
	 *
	 * @return
	 */
	public Integer getMaxBoundsViscosity()
	{
		return maxBoundsViscosity;
	}

	/**
	 * If maxBounds is set, this option will control how solid the bounds are when dragging the map around. The default value of 0.0 allows the user to drag outside the bounds at
	 * normal speed, higher
	 * values will slow down map dragging outside bounds, and 1.0 makes the bounds fully solid, preventing the user from dragging outside the bounds.
	 *
	 * @param maxBoundsViscosity
	 *
	 * @return
	 */
	public LeafletOptions setMaxBoundsViscosity(Integer maxBoundsViscosity)
	{
		this.maxBoundsViscosity = maxBoundsViscosity;
		return this;
	}

	/**
	 * Makes the map focusable and allows users to navigate the map with keyboard arrows and +/- keys.
	 *
	 * @return
	 */
	public Boolean getKeyboard()
	{
		return keyboard;
	}

	/**
	 * Makes the map focusable and allows users to navigate the map with keyboard arrows and +/- keys.
	 *
	 * @param keyboard
	 *
	 * @return
	 */
	public LeafletOptions setKeyboard(Boolean keyboard)
	{
		this.keyboard = keyboard;
		return this;
	}

	/**
	 * Amount of pixels to pan when pressing an arrow key.
	 *
	 * @return
	 */
	public Integer getKeyboardPanDelta()
	{
		return keyboardPanDelta;
	}

	/**
	 * Amount of pixels to pan when pressing an arrow key.
	 *
	 * @param keyboardPanDelta
	 *
	 * @return
	 */
	public LeafletOptions setKeyboardPanDelta(Integer keyboardPanDelta)
	{
		this.keyboardPanDelta = keyboardPanDelta;
		return this;
	}

	/**
	 * Whether the map can be zoomed by using the mouse wheel. If passed 'center', it will zoom to the center of the view regardless of where the mouse was.
	 *
	 * @return
	 */
	public Boolean getScrollWheelZoom()
	{
		return scrollWheelZoom;
	}

	/**
	 * Whether the map can be zoomed by using the mouse wheel. If passed 'center', it will zoom to the center of the view regardless of where the mouse was.
	 *
	 * @param scrollWheelZoom
	 *
	 * @return
	 */
	public LeafletOptions setScrollWheelZoom(Boolean scrollWheelZoom)
	{
		this.scrollWheelZoom = scrollWheelZoom;
		return this;
	}

	/**
	 * Limits the rate at which a wheel can fire (in milliseconds). By default user can't zoom via wheel more often than once per 40 ms.
	 *
	 * @return
	 */
	public Integer getWheelDebounceTime()
	{
		return wheelDebounceTime;
	}

	/**
	 * Limits the rate at which a wheel can fire (in milliseconds). By default user can't zoom via wheel more often than once per 40 ms.
	 *
	 * @param wheelDebounceTime
	 *
	 * @return
	 */
	public LeafletOptions setWheelDebounceTime(Integer wheelDebounceTime)
	{
		this.wheelDebounceTime = wheelDebounceTime;
		return this;
	}

	/**
	 * How many scroll pixels (as reported by L.DomEvent.getWheelDelta) mean a change of one full zoom level. Smaller values will make wheel-zooming faster (and vice versa).
	 *
	 * @return
	 */
	public Integer getWheelPxPerZoomLevel()
	{
		return wheelPxPerZoomLevel;
	}

	/**
	 * How many scroll pixels (as reported by L.DomEvent.getWheelDelta) mean a change of one full zoom level. Smaller values will make wheel-zooming faster (and vice versa).
	 *
	 * @param wheelPxPerZoomLevel
	 *
	 * @return
	 */
	public LeafletOptions setWheelPxPerZoomLevel(Integer wheelPxPerZoomLevel)
	{
		this.wheelPxPerZoomLevel = wheelPxPerZoomLevel;
		return this;
	}

	/**
	 * Enables mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events).
	 *
	 * @return
	 */
	public Boolean getTap()
	{
		return tap;
	}

	/**
	 * Enables mobile hacks for supporting instant taps (fixing 200ms click delay on iOS/Android) and touch holds (fired as contextmenu events).
	 *
	 * @param tap
	 *
	 * @return
	 */
	public LeafletOptions setTap(Boolean tap)
	{
		this.tap = tap;
		return this;
	}

	/**
	 * The max number of pixels a user can shift his finger during touch for it to be considered a valid tap.
	 *
	 * @return
	 */
	public Integer getTapTolerance()
	{
		return tapTolerance;
	}

	/**
	 * The max number of pixels a user can shift his finger during touch for it to be considered a valid tap.
	 *
	 * @param tapTolerance
	 *
	 * @return
	 */
	public LeafletOptions setTapTolerance(Integer tapTolerance)
	{
		this.tapTolerance = tapTolerance;
		return this;
	}

	/**
	 * Whether the map can be zoomed by touch-dragging with two fingers. If passed 'center', it will zoom to the center of the view regardless of where the touch events (fingers)
	 * were. Enabled for
	 * touch-capable web browsers except for old Androids.
	 *
	 * @return
	 */
	public Boolean getTouchZoom()
	{
		return touchZoom;
	}

	/**
	 * Whether the map can be zoomed by touch-dragging with two fingers. If passed 'center', it will zoom to the center of the view regardless of where the touch events (fingers)
	 * were. Enabled for
	 * touch-capable web browsers except for old Androids.
	 *
	 * @param touchZoom
	 *
	 * @return
	 */
	public LeafletOptions setTouchZoom(Boolean touchZoom)
	{
		this.touchZoom = touchZoom;
		return this;
	}

	/**
	 * Set it to false if you don't want the map to zoom beyond min/max zoom and then bounce back when pinch-zooming.
	 *
	 * @return
	 */
	public Boolean getBounceAtZoomLimits()
	{
		return bounceAtZoomLimits;
	}

	/**
	 * Set it to false if you don't want the map to zoom beyond min/max zoom and then bounce back when pinch-zooming.
	 *
	 * @param bounceAtZoomLimits
	 *
	 * @return
	 */
	public LeafletOptions setBounceAtZoomLimits(Boolean bounceAtZoomLimits)
	{
		this.bounceAtZoomLimits = bounceAtZoomLimits;
		return this;
	}

}
