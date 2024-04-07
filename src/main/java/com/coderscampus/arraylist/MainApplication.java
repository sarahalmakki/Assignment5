package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

	public static void main(String[] args) {
		

List<String> elements = new ArrayList<>();         
elements.add("Apple");
elements.add("Orange");
elements.add("Lime");
elements.add("Blackberry");
elements.add("Kiwi");
elements.add("Strawberry");
elements.add("Granberry");
elements.add("Grape");
elements.add("Banana");
for(String element : elements) {
	System.out.println(element);
}
	}

}
