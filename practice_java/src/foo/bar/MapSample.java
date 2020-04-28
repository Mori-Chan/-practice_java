package foo.bar;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;




public class MapSample {
	public static void main(String[] arg) {
		Map<String,String> map = new HashMap<String,String>();
		map.put("sunday", "日曜日");
		map.put("monday", "月曜日");
		map.put("tuesday", "火曜日");
		map.put("wednesday", "水曜日");
		map.put("thursday", "木曜日");
		map.put("friday", "金曜日");
		map.put("saturday", "土曜日");

//		Map<String,String> map = new LinkedHashMap<String,String>();
//		map.put("sunday", "日曜日");
//		map.put("monday", "月曜日");
//		map.put("tuesday", "火曜日");
//		map.put("wednesday", "水曜日");
//		map.put("thursday", "木曜日");
//		map.put("friday", "金曜日");
//		map.put("saturday", "土曜日");

		Set<Entry<String,String>> entryList = map.entrySet();



		for(Map.Entry<String, String> set : entryList) {
			System.out.println(set.getKey() + ":" + set.getValue());
		}

		for(Map.Entry<String, String> set : entryList) {
			if(set.getKey().equals("sunday")) {
				System.out.println(set.getValue());
			}
		}

	}
}
