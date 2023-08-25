package aaa.model;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class ClassMain {
	
	HashMap<String, HashMap<Integer, Std>>totmap;
	ClassName cn;
	
	public ClassMain() {
		cn = new ClassName();
		totmap = new HashMap<>();
		
		totmap.put("1반", cn.getMap1());
		totmap.put("2반", cn.getMap2());
		totmap.put("3반", cn.getMap3());
		
	}

    public HashMap<Integer, Std> getMap(String map) {
        return totmap.get(map);
    }

	
}
