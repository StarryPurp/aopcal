package kr.hs.emirim.bstar128.aopcal.main;

import kr.hs.emirim.bstar128.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.bstar128.aopcal.cal.ImpCalculator;

public class MainProxy {
	
	public static void main(String[] args) {
		int num=20;
		ExeTimeCalculator ttCal1=new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttCal1.factorial(num));
		
		ExeTimeCalculator ttCal2=new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttCal2.factorial(num));
	}

}
