package in.co.javacoder.oca.casting;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class RefType {
	
	public static void main(String... arg) {
		
		Object test = null;
		
		String teststr = (String) test;
		
		System.out.println(teststr);
		
		String date1 = "2020/02/14";
		String date2 = "2020-02-14";
		String date3 = "2020.02.14";
		
		//Pattern datePattern = Pattern.compile("^[0-9]{4}-[0-9]{2}-[0-9]{2}$");
		
		//System.out.println(.test(date1));
	//	System.out.println(datePattern.matcher(date2));
		//System.out.println(datePattern.matcher(date3));
		
		//LocalDate.parse(date1);
		//System.out.println(LocalDate.parse(date2));
		//LocalDate.parse(date3);
		
		Set<String> constantSet = new HashSet<String>(Arrays.asList("OMT1", "OMT2", "RWJB", "INSP", "JFK", "TRNT", "HMIC"));
		Set<String> availableNetworkCodesInData = new HashSet<String>(Arrays.asList("DSNP",  "OMT1"));   // "OMT1",  "HMIC"
		Set<String> varSet2 = new HashSet<String>(Arrays.asList("MGCN", "HPN", "DSNP", "MCGL", "OEX", "ATL", "ACF"));
		Set<String> varSet3 = new HashSet<String>(Arrays.asList("OMT1", "OMT2", "RWJB", "INSP", "JFK", "TRNT", "HMIC"));
		Set<String> varSet4 = new HashSet<String>(Arrays.asList("OMT1", "OMT2", "RWJB", "INSP", "JFK", "TRNT", "HMIC1"));
		
		System.out.println("constantSet Vs varSet4 : " + constantSet.equals(varSet4));
		System.out.println("constantSet Vs varSet3 : " + constantSet.equals(varSet3));
		System.out.println("constantSet Vs varSet2 : " + constantSet.equals(varSet2));
		System.out.println("constantSet Vs availableNetworkCodesInData : " + constantSet.equals(availableNetworkCodesInData));
		
		System.out.println(" varSet3 : " + varSet3);
		
		for(String networkCode : availableNetworkCodesInData ) {
			for(String network : varSet3 ) {
				 System.out.println(networkCode + " : " + network + " = " + network.equals(networkCode));
			}
			System.out.println();
		}
		
	}

}
