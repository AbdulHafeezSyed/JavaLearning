package com.psoft.strings;

public class StringFirst {

	public static void main(String[] args) {
//		String s1 = "virat";
//		String s2= "java";
//s2.concat("syed");
//System.out.println(s2);
//System.out.println(s1);
//System.out.println(s2);
//s1=s1.concat(s2);
//System.out.println(s1);
//System.out.println(s2.length());
		//System.out.println( s2.toLowerCase()); 
//	System.out.println(s2.compareTo(s1));
	//System.out.println(s1.charAt(1));
	 String s = "  Hello, Java!  ";
		
	        System.out.println("Original          : >" + s + "<");
	        System.out.println("length()          : " + s.length());
	        System.out.println("trim()            : >" + s.trim() + "<");
	        System.out.println("toUpperCase()     : " + s.toUpperCase());
	        System.out.println("toLowerCase()     : " + s.toLowerCase());
	        System.out.println("charAt(2)         : " + s.charAt(2));
	        System.out.println("substring(2,7)    : " + s.substring(2, 7));
	        System.out.println("indexOf(\"Java\")  : " + s.indexOf("Java"));
        System.out.println("lastIndexOf('a')  : " + s.lastIndexOf('l'));
	        System.out.println("replace(\"Java\",\"World\"): " + s.replace("Java", "World"));
		    System.out.println("equals(...)       : " + "Test".equals("test"));
	        System.out.println("equalsIgnoreCase(): " + "TeSt".equalsIgnoreCase("test"));
	        System.out.println("compareTo(...)    : " + "abc".compareTo("abe")); // negative => less
	        System.out.println("split(\", \")      : " + java.util.Arrays.toString("a, b, c".split(", ")));
	        System.out.println("String.join(...)  : " + String.join(".", "2025", "07", "30"));
	        System.out.println("valueOf(123)      : " + String.valueOf("1234"));
//	        // Concatenation note: + creates new objects repeatedly; avoid in large loops.
	        String concat = "Hi" + " " + "there";
	        System.out.println("Concatenation (+) : " + concat);
	        System.out.println(s.intern());
    }

		
	}

