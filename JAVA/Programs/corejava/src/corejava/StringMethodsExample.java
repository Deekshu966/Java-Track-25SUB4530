package corejava;

import java.util.Optional;

public class StringMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		String str1 = "Hello World";
		System.out.println(str == str1); // true
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		str1 = "Hai "+str1;
		System.out.println(str1.hashCode());
		System.out.println(str.hashCode());
		
		String s1 = new String("Hello");
		String s2 = new String("hEllo");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2); // false
		
		System.out.println(s1.equals(s2)); // it will consider the case ie casesensitive comparison
		
		System.out.println("The length of str is "+str.length());
		//System.out.println("Character at index 4 is "+str.charAt(49));
		System.out.println("Index of World is "+str.indexOf("World"));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s5 = "Apple";
		String s6 = "Mango";
		String s7 = "Drum";
		String s8 = "Carroms";
		String s9 = "carroms";
		System.out.println(s5.compareTo(s6)); // -ve value 65 - 66 = -1
		System.out.println(s7.compareTo(s8)); // +ve value 68 - 67 = +1
		System.out.println(s8.compareTo(s9)); // 0
		System.out.println(s8.compareToIgnoreCase(s9)); // 0
		
		System.out.println("The lower case of HELLO is "+ "HELLO".toLowerCase());
		System.out.println("The upper case of hello is "+ "hello".toUpperCase());
		
		String sentence = "  Today is a rainy day  ";
		System.out.println(sentence.contains("Rainy"));
		
		String string = "Java is best object-oriented programming-language";
		//String s10 = string.substring(5);
		String s10= string.substring(5,15);
		System.out.println(s10);
		
		String words[] = string.split("-");
		for (String w : words) {
			System.out.println(w);
		}
		
		// join() -- is to concatenate the strings with a delimiter
		String joinString = String.join("-", words);
		System.out.println("Joined String: " + joinString);
		
		//String data = null;  // jdk8 we don't have any solution for null pointer exception
		//System.out.println(data.equals("test"));
		
		Optional<String> result = Optional.ofNullable(null);
		
		System.out.println(result.orElse("")); 

		

	}

}
