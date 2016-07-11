package com.project.shark;


public class classLoaderUtil {
	public static void main(String[] args) {
		java.net.URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();  
		for (int i = 0; i < urls.length; i++) {  
		    System.out.println(urls[i].toExternalForm());  
		} 	
		
		System.out.println("   ");
		System.out.println("   ");
		System.out.println(" -----------------000000-------------------------  ");
		System.out.println("   ");
		
		System.out.println(System.getProperty("sun.boot.class.path"));  
	}
	
	
}
