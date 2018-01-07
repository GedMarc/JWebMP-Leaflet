package za.co.mmagon.jwebswing.plugins.leaflet;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Creates the leaflet JavaScripts required for options via the options tag
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
public class LeafletFeature extends Feature<LeafletOptions, LeafletFeature>
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new LeafletFeature
	 */
	public LeafletFeature(ComponentHierarchyBase component)
	{
		super("LeafletFeature", component);
		component.addVariable("map_" + getID());
	}


	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery("map_" + getComponent().getID() + " = L.map(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	/**
	 * Returns the options
	 *
	 * @return
	 */
	@Override
	public LeafletOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			setOptions(new LeafletOptions());
		}
		return super.getOptions();
	}

}
