package mtest;

import java.util.ArrayList;
import java.util.List;

public class initarray {
	public static void main(String [] args){
		List<String> list = new ArrayList<String>() {{
		    add("A");
		    add("B");
		    add("C");
		    add("myname");
		}};
	
	String argue = "-Dfile.encoding=UTF-8,  -Xmx477626368, -jar, org.eclipse.equinox.launcher_1.3.201.v20161025-1711.jar, -nl, en_US, -nosplash, -application, com.informatica.tools.cli.application.application, exportObjects, dn1021, inw1pc0ej716.informatica.com:32893, myadmin, myadmin, Native, mproject, ms1021,  true,";
	String arr[] = argue.split(",");
	for(int i = 0 ; i < arr.length ; i++){
		System.out.println("add("+"\""+arr[i]+"\""+")");
	}

	}
}
