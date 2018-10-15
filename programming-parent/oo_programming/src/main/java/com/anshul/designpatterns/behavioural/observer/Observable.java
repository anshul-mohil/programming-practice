package com.anshul.designpatterns;

import java.util.Vector;
/**
 * Anything which has to do with the state has to be syncronized
 * @author explorer
 *
 */
public class Observable {
	
	private boolean changed = false;
	private Vector<Observer> observerList;

	public Observable() {
		observerList = new Vector<Observer>();
	}

	public synchronized void addObserver(Observer o) {
		if (o == null)
			throw new NullPointerException();
		if (!observerList.contains(o)) {
			observerList.add(o);
		}
	}

	public synchronized void deleteObserver(Observer o) {
		observerList.remove(o);
	}

	public void notifyObservers() {
		notifyObservers(null);
	}

	public void notifyObservers(Object arg) {
		/*
		 * a temporary array buffer, used as a snapshot of the state of current
		 * Observers.
		 */
		Object[] arrLocal;

		synchronized (this) {
			/*
			 * We don't want the Observer doing callbacks into arbitrary code
			 * while holding its own Monitor. The code where we extract each
			 * Observable from the List and store the state of the Observer
			 * needs synchronization, but notifying observers does not (should
			 * not). The worst result of any potential race-condition here is
			 * that: 1) a newly-added Observer will miss a notification in
			 * progress 2) a recently unregistered Observer will be wrongly
			 * notified when it doesn't care
			 */
			if (!changed)
				return;
			arrLocal = observerList.toArray();
			clearChanged();
		}

		for (int i = arrLocal.length - 1; i >= 0; i--)
			((Observer) arrLocal[i]).update(this, arg);
	}

	public synchronized void deleteObservers() {
		observerList.removeAll(observerList);
	}

	protected synchronized void setChanged() {
		changed = true;
	}

	protected synchronized void clearChanged() {
		changed = false;
	}

	public synchronized boolean hasChanged() {
		return changed;
	}

	public synchronized int countObservers() {
		return observerList.size();
	}
}
