package com.anshul.cci.callcenter.contorllers;

import com.anshul.cci.callcenter.model.Caller;
import com.anshul.cci.callcenter.model.Employee;
import com.anshul.cci.callcenter.service.CallHandleService;
/**
 * I need all methods syncronized because multiple instances of
 * the same call object should not initiate or end the call 
 * without insync.
 * @author explorer
 *
 */
public class Call {

	// caller on call
	private final Caller caller;
	private Employee employee;
	private final CallHandleService callHandler;

	public Call(Caller caller, CallHandleService callHandler) {
		this.caller = caller;
		this.callHandler = callHandler;
	}

	public synchronized Caller getCaller() {
		return caller;
	}

	public synchronized void startCall() {
		callHandler.dispatchCall(this);
	}

	public synchronized void endCall() {
		callHandler.endCall(this);
	}

	public synchronized CallHandleService getCallHandler() {
		return callHandler;
	}

	public synchronized Employee getEmployee() {
		return employee;
	}


}
