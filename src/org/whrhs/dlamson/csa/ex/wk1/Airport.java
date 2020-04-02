package org.whrhs.dlamson.csa.ex.wk1;

import java.util.List;
import java.util.ArrayList;

public class Airport {

	private Airplane[] airplanes;
	
	
	// PART B
	
	public List<Airplane> carrierMaintenance(String carrier, int currMonth, int currYear){
		ArrayList<Airplane> maintenanceList = new ArrayList<>();
		for(Airplane airplane: airplanes) {
			if(airplane.getCarrier().equals(carrier) && airplane.maintenanceNeeded(currMonth, currYear)) {
				maintenanceList.add(airplane);
			}
		}
		return maintenanceList;
	}
}
