package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.util.JsonUtil;

public class test {

	public static void main(String[] args) {
		List<String> o=new ArrayList<String>();
		o.add("1");
		o.add("2");
		o.add("3");
		o.add("4");
		Map<String, Object> a=new HashMap<String, Object>();
		a.put("hehe", o);
		System.out.println(a);
		
		String json="{aa:aa}";
		
		Map<String, Object> jsonToMap = JsonUtil.jsonToMap(json);
	}

}
