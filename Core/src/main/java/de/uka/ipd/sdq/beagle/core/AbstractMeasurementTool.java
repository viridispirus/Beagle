package de.uka.ipd.sdq.beagle.core;

import de.uka.ipd.sdq.beagle.core.measurement.MeasurementOrder;

/**
* Implements MeasurementTool interface.
*
* @author Michael Vogt
* @see MeasurementController
*/
public abstract class AbstractMeasurementTool implements MeasurementTool {
		
		/**
		* 
		*
		*
		*
		*/
		public void measure(MeasurementOrder measurements);
}