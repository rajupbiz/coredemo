package com.blob.util;

import org.springframework.stereotype.Service;

@Service
public class GConverter {

	public static String convertCmsToFoot(Integer cms){
		StringBuffer foot = new StringBuffer();
		if(cms != null){
			Integer feet = (int)(cms/30.48);
			Long inches = Math.round(cms/2.54) - (feet * 12);
			if(feet > 0)
				foot.append(feet+" ft");
			if(inches > 0)
				foot.append(" "+inches+" in");
		}
		return foot.toString();
	}
	
	public static Integer convertFootToCms(Integer foot, Integer inches){
		Integer cms = null;
		if(foot != null){
			cms = new Integer(0);
			cms = (int)Math.round(((foot * 12) + inches) * 2.54);
		}
		return cms;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(" foot "+convertCmsToFoot(180));
		System.out.println(" cms "+convertFootToCms(5, 11));
		//System.out.println(" today "+convertDateToDDMMYYYY(LocalDate.now()));
	}
}

