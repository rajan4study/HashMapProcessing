/**
 * 
 */
package com.study.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author
 *
 */
public class SortingMap {
	
	public void sort(List<String> list) {
		
		list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).
				entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
						Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
								(e1,e2)->e1,LinkedHashMap::new)).forEach((k,v)->System.out.println(k+" "+v));
		
		
		/* Map<String, Long> mapSort = */ /*
											 * map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
											 * Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
											 * (e1,e2)->e1,LinkedHashMap::new)).forEach((k,v)->System.out.println(k+" "
											 * +v));
											 */
		
		//mapSort.forEach((k,v)->System.out.println(k+" "+v));
	}

}
class MainClass{
	public static void main(String[]arg) {
		SortingMap sortingMap= new SortingMap();
		List<String> list= new ArrayList<String>(Arrays.asList(new String[] {"abcd","abcd","ab","cd","cd","abc","abc","abc","abc"}));
		sortingMap.sort(list);
	}
}
