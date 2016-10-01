package com.blob.util;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GidGenerator {

	private static final String CHAR_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String NUMERIC_LIST = "0123456789";
	
	private static final int RANDOM_CHAR_STRING_LENGTH = 2;
	private static final int RANDOM_NUMERIC_STRING_LENGTH = 4;

	/**
	 * Get new 6 char Gid (first 2 characters and next 4 numbers)
	 */
	public String generateGid(){
		StringBuffer resp = new StringBuffer();
		resp.append(generateRandomCharString());
		resp.append(generateRandomNumericString());
		return resp.toString();
	}
	
	/**
	 * This method generates random character string
	 */
	public String generateRandomCharString() {

		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < RANDOM_CHAR_STRING_LENGTH; i++) {
			int number = getRandomCharIndex();
			char ch = CHAR_LIST.charAt(number);
			randStr.append(ch);
		}
		return randStr.toString();
	}

	/**
	 * This method generates random numeric string
	 */
	public String generateRandomNumericString() {

		StringBuffer randStr = new StringBuffer();
		for (int i = 0; i < RANDOM_NUMERIC_STRING_LENGTH; i++) {
			int number = getRandomNumericIndex();
			char ch = NUMERIC_LIST.charAt(number);
			randStr.append(ch);
		}
		return randStr.toString();
	}
	
	/**
	 * This method generates random numbers for char string
	 */
	private int getRandomCharIndex() {
		
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(CHAR_LIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}
	
	/**
	 * This method generates random numbers for numeric string
	 */
	private int getRandomNumericIndex() {
		
		int randomInt = 0;
		Random randomGenerator = new Random();
		randomInt = randomGenerator.nextInt(NUMERIC_LIST.length());
		if (randomInt - 1 == -1) {
			return randomInt;
		} else {
			return randomInt - 1;
		}
	}
}
