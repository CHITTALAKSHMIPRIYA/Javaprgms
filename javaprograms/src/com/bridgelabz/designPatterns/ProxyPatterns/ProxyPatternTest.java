
package com.bridgelabz.designPatterns.ProxyPatterns;


public class ProxyPatternTest {

	public static void main(String[] args) {
		CommandExecutor executor =new CommandExecutorProxy("lakshmi", "vasu");
		try {
			executor.runCommand("mkdir");
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
