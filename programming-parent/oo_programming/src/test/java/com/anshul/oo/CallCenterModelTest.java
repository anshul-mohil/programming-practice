package com.anshul.oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.anshul.cci.callcenter.model.Employee;
import com.anshul.cci.callcenter.model.Rank;
import com.anshul.cci.callcenter.service.CallHandleService;

public class CallCenterModelTest {

	private List<Rank> rankList = null;
	private CallHandleService service =  null;

	@Test
	public void CallHandlerServiceTest() {
//service.
	}

	@Before
	public void setup() {
		
		setupRank();
		setupCallHandleService();
		
	}

	private void setupCaller(){
		
	}
	private void setupCallHandleService(){
		service = new CallHandleService(callHandleServiceTestHelper());
	}
	private Map<Rank, List<Employee>> callHandleServiceTestHelper() {
		Map<Rank, List<Employee>> map = new HashMap<>();

		Employee empl1 = new Employee(new Rank(0));
		Employee empl2 = new Employee(new Rank(0));
		Employee empl3 = new Employee(new Rank(0));
		Employee empl4 = new Employee(new Rank(0));

		List<Employee> emplList = new ArrayList<>();
		emplList.add(empl1);
		emplList.add(empl2);
		emplList.add(empl3);
		emplList.add(empl4);

		Employee empl5 = new Employee(new Rank(1));
		Employee empl6 = new Employee(new Rank(1));

		List<Employee> managerlList = new ArrayList<>();
		managerlList.add(empl5);
		managerlList.add(empl6);

		Employee empl7 = new Employee(new Rank(2));
		List<Employee> directorlList = new ArrayList<>();
		directorlList.add(empl7);
		map.put(new Rank(0), emplList);
		map.put(new Rank(1), managerlList);
		map.put(new Rank(2), directorlList);
		return map;
	}

	private void setupRank() {
		rankList = new ArrayList<>();
		Rank r1 = new Rank(10);
		Rank r2 = new Rank(20);
		Rank r3 = new Rank(10);
		rankList.add(r1);
		rankList.add(r2);
		rankList.add(r3);
	}

	@Test
	public void RankTest() {
		// System.out.println(rankList.get(0));
		// System.out.println(rankList.get(1));
		// System.out.println(rankList.get(2));

		// System.out.println("is r1 is equal to r2 " +
		// rankList.get(0).equals(rankList.get(1)));
		Assert.assertFalse(rankList.get(0).equals(rankList.get(1)));

		// System.out.println("is r1 is equal to r3 " +
		// rankList.get(0).equals(rankList.get(2)));
		Assert.assertTrue(rankList.get(0).equals(rankList.get(2)));
	}
}
