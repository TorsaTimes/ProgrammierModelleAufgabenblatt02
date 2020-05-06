package ctr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Before;

class Test {

	private LineReader lines;
	private StringReader sr;
	String s1 = "";
	String s2 = "Willkommen das ist ein Satz";
	String filename = "C:\\Users\\SamueleTortomasi\\Dropbox\\Semester4\\Programmiermodelle\\Praktikum\\A2\\read.me";
	File file =  new File(filename);
	
	@org.junit.jupiter.api.Test
	void test() {
		
		String filename = "C:\\Users\\SamueleTortomasi\\Dropbox\\Semester4\\Programmiermodelle\\Praktikum\\A2\\read.me";
		File file = new File(filename);
		Reader reader = null; 
		try {
			reader = new FileReader(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		for(String line : lines) {
			assertSame(lines, lines);
			assertNotNull(null,lines);
		}
	}
	
	@org.junit.jupiter.api.Test
	void testEmpty() {
		sr =  new StringReader(s1);
		LineReader lines = new LineReader(sr);
		
		for(String line : lines) {
			System.out.println(line);
		}
		for(String line : lines) {
			System.out.println(line);
		}
	}
	
	@org.junit.jupiter.api.Test
	void testS2() {
		sr =  new StringReader(s2);
		LineReader lines = new LineReader(sr);
		
		for(String line : lines) {
			System.out.println(line);
		}
		for(String line : lines) {
			System.out.println(line);
		}
	}
	
	@org.junit.jupiter.api.Test
	void testFile() {
		try {
			Reader reader = new FileReader(file);
			LineReader lines = new LineReader(reader);
			for(String line : lines) {
				System.out.println(line);
			}
			for(String line : lines) {
				System.out.println(line);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		}
	}
	
	
	
	
	
	
	
	

