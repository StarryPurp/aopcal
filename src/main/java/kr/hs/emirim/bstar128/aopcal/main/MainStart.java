package kr.hs.emirim.bstar128.aopcal.main;

import kr.hs.emirim.bstar128.aopcal.cal.Calculator;
import kr.hs.emirim.bstar128.aopcal.cal.ImpCalculator;
import kr.hs.emirim.bstar128.aopcal.cal.RecCalculator;

public class MainStart {

	public static void main(String[] args) {
		
		Calculator call=new ImpCalculator();
		long f1=call.factorial(4);
		System.out.println("Imp 4:"+f1);
		
		Calculator cal2=new RecCalculator();
		long f2=cal2.factorial(4);
		System.out.println("Rec 4 :"+ f2);

	}

}
