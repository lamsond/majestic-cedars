package org.whrhs.dlamson.csa.ex.wk1;

import java.util.List;
import java.util.ArrayList;

public class Airport {

	private Airplane[] airplanes;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// PART B
	
	public List<Airplane> carrierMaintenance(String carrier, int currMonth, int currYear){
		
		ArrayList<Airplane> planesNeedingMaint = new ArrayList<>();
		for(Airplane plane: airplanes) {
			if(carrier.equals(plane.getCarrier())) {
				if(plane.maintenanceNeeded(currMonth, currYear)) {
					planesNeedingMaint.add(plane);
				}
			}
		}
		
		return planesNeedingMaint;
	}

}















