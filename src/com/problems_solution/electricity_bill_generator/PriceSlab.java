package com.problems_solution.electricity_bill_generator;

import java.util.HashMap;

public class PriceSlab {
	HashMap<String, Integer> slabs = new HashMap<>();
	public int calculateBill(int units) {
		slabs.put("A", ApplienceConstants.slab1);
		slabs.put("B", ApplienceConstants.slab2);
		slabs.put("C", ApplienceConstants.slab3);
		slabs.put("D", ApplienceConstants.slab4);
		return calculateBillTotal(units);
	}
	private int calculateBillTotal(int units) {
		int total = 0;
		if (units <= 1000) {
			total = units * slabs.get("A");
		}else if (units <= 3000) {
			total = 1000 * slabs.get("A") + (units - 1000) * slabs.get("B") ;
		}else if (units <= 6000){
            total = 1000*slabs.get("A") + 2000*slabs.get("B") +(units-3000)*slabs.get("C");
        }
        else{
            total = 1000*slabs.get("A") + 2000*slabs.get("B") + 3000*slabs.get("D")
                +(units-6000)*slabs.get("C");
        }
		return total;
	}

}
