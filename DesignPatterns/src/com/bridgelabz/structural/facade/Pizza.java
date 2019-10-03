/******************************************************************************
 *  Purpose: Class is going to tell what is required to creating the food 
 *  		 pizza
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   30-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.structural.facade;

public class Pizza implements Food {

	public String preparedItems;

	@Override
	public void prepareFood(String itemsRequired) {

		preparedItems = "thin crust pizza  with ingredients " + itemsRequired;

	}

	@Override
	public String deliverFood() {

		return preparedItems;
	}

}