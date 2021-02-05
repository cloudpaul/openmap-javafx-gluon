package uk.co.cloudswing.openmap;

public class Main {


	// Can't have a main class which extends javafx.application.Application
    public static void main(final String[] args) {
    	String libpath = System.getProperty("java.library.path");
		System.out.printf("java.library.path=\"%s\"%n", libpath);
    	
		if (!libpath.contains("javafx")) {
			System.setProperty("java.library.path", libpath + ":/home/paul/tools/javafx-sdk-15.0.1/lib");
			System.out.printf("updated java.library.path=\"%s\"%n", libpath);
		}
    	
    	Loader.main(args);
    }


}
