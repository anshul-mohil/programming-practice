package com.anshul.cci.callcenter.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.anshul.cci.callcenter.contorllers.Call;
import com.anshul.cci.callcenter.model.Employee;
import com.anshul.cci.callcenter.model.Rank;

public class CallHandleService {

	private final Map<Rank, Queue<Employee>> callQueue;
	private final Map<Rank, List<Employee>> employee;

	public CallHandleService(Map<Rank, List<Employee>> emplList) {
		this.employee = emplList;
		this.callQueue = new HashMap<>();
		this.setup();
	}


	public void dispatchCall(Call call) {

		
	}

	public void endCall(Call call) {

	}

	public Map<Rank, List<Employee>> getEmployee() {
		return employee;
	}
	
	

	public Map<Rank, Queue<Employee>> getListOfEmployees() {
		return callQueue;
	}

	private void setup() {
		// need to use put and take methods on this
		// considering i have 4 rank_0, 2 rank_1, and 1 rank_2 employee
		BlockingQueue<Employee> level1Queue = new ArrayBlockingQueue<>(4, true);
		BlockingQueue<Employee> managerQueue = new ArrayBlockingQueue<>(2, true);
		BlockingQueue<Employee> directorQueue = new ArrayBlockingQueue<>(1, true);

		callQueue.put(new Rank(0), level1Queue);
		callQueue.put(new Rank(1), managerQueue);
		callQueue.put(new Rank(2), directorQueue);
	}
}
