package collection;

import java.util.ArrayList;
import java.util.List;

public class StreamInterface {
    public static void main(String[] args) {
		List<String> languages = new ArrayList<String>();
		languages.add("Kannada");
		languages.add("Hindi");
		languages.add("Tamil");
	
//		for(String lang:languages) {
//			System.out.println(lang);
//		}
		languages.stream().sorted().forEach(System.out::println);
	}
}
