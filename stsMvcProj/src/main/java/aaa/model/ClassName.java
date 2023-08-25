package aaa.model;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ClassName {
	
	HashMap<Integer, Std>map1;
	HashMap<Integer, Std>map2;
	HashMap<Integer, Std>map3;
	
	public ClassName() {
		map1 = new HashMap<>();
		map2 = new HashMap<>();
		map3 = new HashMap<>();
		
		map1.put(1, new Std("학생1", new int[]{45, 68, 38}));
		map1.put(2, new Std("학생2", new int[]{55, 62, 44}));
		map1.put(3, new Std("학생3", new int[]{77, 86, 98}));
		
		map2.put(1, new Std("학생4", new int[]{32, 27, 41}));
		map2.put(2, new Std("학생5", new int[]{77, 88, 99}));
		map2.put(3, new Std("학생6", new int[]{65, 45, 84}));
		
		map3.put(1, new Std("학생7", new int[]{70, 68, 96}));
		map3.put(2, new Std("학생8", new int[]{60, 75, 67}));
		map3.put(3, new Std("학생9", new int[]{95, 84, 95}));

	}
	
}
