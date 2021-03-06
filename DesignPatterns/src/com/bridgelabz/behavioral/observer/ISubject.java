/******************************************************************************
 *  Purpose: Interface for Subject
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   30-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.behavioral.observer;


public interface ISubject {
	// methods to register and unregister observers
	public void register(IObserver obj);

	public void unregister(IObserver obj);

	// method to notify observers of change
	public void notifyObservers();

	// method to get updates from subject
	public Object getUpdate(IObserver obj);
}
