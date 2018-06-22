package kr.hs.emirim.bstar128.aopcal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import kr.hs.emirim.bstar128.aopcal.aspect.*;
import kr.hs.emirim.bstar128.aopcal.cal.*;
@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {

	@Bean
	public ExeTimeAspect2 exeTimeAspect() {
		return new ExeTimeAspect2();
	}

	@Bean
	public Calculator impCal() {
		return new ImpCalculator();
	}
	
	@Bean
	public Calculator recCal() {
		return new RecCalculator();
	}
}