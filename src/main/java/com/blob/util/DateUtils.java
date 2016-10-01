package com.blob.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class DateUtils {

	private final static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private final static DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("h:m a");
	
	public static LocalDateTime toLocalDateTime(Date date){
		if(date != null){
			Instant instant = Instant.ofEpochMilli(date.getTime());
			return 	LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		}else{
			return null;
		}
	}
	
	public static LocalDate toLocalDate(Date date){
		if(date != null){
			Instant instant = Instant.ofEpochMilli(date.getTime());
			return 	LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
		}else{
			return null;
		}
	}
	
	public static LocalTime toLocalTime(Date date){
		if(date != null){
			Instant instant = Instant.ofEpochMilli(date.getTime());
			return 	LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalTime();
		}else{
			return null;
		}
	}
	
	public static Date toDate(LocalDateTime localDateTime){
		if(localDateTime != null){
			Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
			return Date.from(instant);
		}else{
			return null;
		}	
	}
	
	public static Date toDate(LocalDate localDate){
		if(localDate != null){
			Instant instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
			return Date.from(instant);
		}else{
			return null;
		}
	}
	
	public static Date toDate(LocalTime localTime){
		if(localTime != null){
			Instant instant = localTime.atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant();
			return Date.from(instant);
		}else{
			return null;
		}
	}
	
	public static String toDDMMYYYY(LocalDate d){
		String resp = new String();
		if(d != null){
			resp = d.format(DateTimeFormatter.ofPattern("d/M/y"));
		}
		return resp;
	}
	
	public static String toDDMMMYYYY(LocalDate d){
		String resp = new String();
		if(d != null){
			resp = d.format(DateTimeFormatter.ofPattern("dd MMM uuuu"));
		}
		return resp;
	}
	
	public static String toHHMM_AMPM(LocalTime d){
		String resp = new String();
		if(d != null){
			resp = d.format(DateTimeFormatter.ofPattern("h:m a"));
		}
		return resp;
	}
	
	/**
	 * Input pattern: dd/MM/yyyy
	 * @param date
	 * @return
	 */
	public static LocalDate toLocalDate(String date){
		LocalDate ld = null;
		if(StringUtils.isNotBlank(date)){
			ld = LocalDate.parse(date, DATE_FORMAT);
		}
		return ld;
	}
	
	/**
	 * Input pattern: hh:mm a
	 * @param date
	 * @return
	 */
	public static LocalTime toLocalTime(String time){
		LocalTime lt = null;
		if(StringUtils.isNotBlank(time)){
			lt = LocalTime.parse(time, TIME_FORMAT);
		}
		return lt;
	}
	
	public static Date now(){
		return toDate(LocalDateTime.now());
	}
	
	public static String getYearMonthDayBetweenDates(LocalDate d1, LocalDate d2){
		StringBuffer resp = new StringBuffer();
		if(d1 != null && d2 != null){
			Period p = Period.between(d1, d2);
			if(p.getYears() > 0){
				if(p.getYears() == 1){
					resp.append(p.getYears()+" year ");
				}else{
					resp.append(p.getYears()+" years ");
				}
			}
			if(p.getMonths() > 0){
				if(p.getMonths() == 1){
					resp.append(p.getMonths()+" month ");
				}else{
					resp.append(p.getMonths()+" months ");
				}
			}
			if(p.getDays() > 0){
				if(p.getDays() == 1){
					resp.append(p.getDays()+" day ");
				}else{
					resp.append(p.getDays()+" days ");
				}
			}
		}
		return resp.toString().trim();
	}
	
	public static Integer getAgeInYears(LocalDate date){
		Period p = Period.between(date, toLocalDate(now()));
		return p.getYears();
	}
	
	/*public static String getAMPM(LocalTime d){
		String resp = new String();
		if(d != null){
			resp = d.
		}
		return resp;
	}*/
	
	/*public java.util.Date toSQLDate(LocalDate localDateTime){
		if(localDateTime != null){
			Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
			return java.util.Date.valueOf(localDateTime);
		}else{
			return null;
		}	
	}*/
	
	/*public static java.sql.Date toSQLDate(LocalDate localDate){
		if(localDate != null){
			return java.sql.Date.valueOf(localDate);
		}else{
			return null;
		}
	}*/
	
	/*public java.util.Date toSQLDate(LocalTime localTime){
		if(localTime != null){
			Instant instant = localTime.atDate(LocalDate.of(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonth(), LocalDate.now().getYear())).atZone(ZoneId.systemDefault()).toInstant();
			return java.util.Date.valueOf(date)
		}else{
			return null;
		}
	}*/
	
	public static void main(String[] args) {
		/*System.out.println(" date in DD/MM/YYYY  "+toDDMMYYYY(LocalDate.now()));
		System.out.println(" date in DD/MM/YYYY  "+toHHMM_AMPM(LocalTime.now()));
		System.out.println(" DD/MM/YYYY to Date "+toDate(toLocalDate("12/08/2013")));*/
		//Date d = toDate(toLocalTime("08:30 AM"));
//		System.out.println(" DD/MM/YYYY to Date "+toDate(toLocalTime("8:30 AM")));
		System.out.println(" >>  "+getYearMonthDayBetweenDates(toLocalDate("14/01/2015"), toLocalDate(new Date())));
	}
}
