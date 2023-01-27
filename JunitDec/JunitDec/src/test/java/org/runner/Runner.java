package org.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.pageexe.HomePageExe;
import org.pageexe.LoginPageExe;

@RunWith(Suite.class)
@SuiteClasses({ HomePageExe.class, LoginPageExe.class })
public class Runner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(HomePageExe.class, LoginPageExe.class);
		System.out.println(result.getFailureCount());
		System.out.println(result.getRunCount());
		System.out.println(result.getIgnoreCount());
		System.out.println(result.getRunTime());
	}
}
