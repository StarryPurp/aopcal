package kr.hs.emirim.bstar128.aopcal.main;

import kr.hs.emirim.bstar128.aopcal.cal.Calculator;
import kr.hs.emirim.bstar128.aopcal.cal.ImpCalculator;
import kr.hs.emirim.bstar128.aopcal.cal.RecCalculator;

public class MainCallNano {

	public static void main(String[] args) {
		long num=1000;
		long start1=System.nanoTime();
		Calculator call=new ImpCalculator();
		long f1=call.factorial(num);
		long end1=System.nanoTime();
		System.out.printf("Imp factorial{%d}: 실행시간: -> %d",num,(end1-start1));
		
		System.out.println();
		
		long start2=System.nanoTime();
		Calculator call1=new RecCalculator();
		long f2=call.factorial(num);
		long end2=System.nanoTime();
		System.out.printf("Rec factorial{%d}: 실행시간: -> %d",num,(end2-start2));

	}

}
