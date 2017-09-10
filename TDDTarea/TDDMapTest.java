package TDDTarea;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TDDMapTest {
	
	@Test
	public void testPutItem(){
		TDDMap<String, Integer> map = new TDDMap<String, Integer>();
		map.put("Monserrat", 24);
		map.put("Alejandro", 60);
		map.put("Eduardo", 33);
		
		Assert.assertEquals(3, map.size());
	}
	
	@Test
	public void testClearItems(){
		TDDMap<String, Integer> map = new TDDMap<String, Integer>();
		map.put("Monserrat", 24);
		map.put("Alejandro", 60);
		map.put("Eduardo", 33);
		
		map.clear();
		
		Assert.assertEquals(0, map.size());
		
	}
	
	
	@Test
	public void testContainsKey(){
		TDDMap<String, Integer> map = new TDDMap<String, Integer>();
		map.put("Monserrat", 24);
		map.put("Alejandro", 60);
		
		Assert.assertTrue(map.containsKey("Monserrat"));
		Assert.assertFalse(map.containsKey("Eduardo"));
		
	}
	
	@Test
	public void testContainsValue(){
		TDDMap<String, Object> map = new TDDMap<String, Object>();
		map.put("Monserrat", 90);
		map.put("Alejandra", "180-126");
		
		Assert.assertTrue(map.containsValue(90));
		Assert.assertTrue(map.containsValue("180-126"));
		
		Assert.assertFalse(map.containsValue(80));
		
		
	}
	
	@Test
	public void testGet(){
		TDDMap<Object, Object> map = new TDDMap<Object, Object>();
		map.put("Monserrat", 29);
		
		Assert.assertEquals(29, map.get("Monserrat"));
		
	}
	
	@Test
	public void testRemove(){
		TDDMap<Object, Object> map = new TDDMap<Object, Object>();
		map.put("Carlos", 5912);
		
		
		Assert.assertEquals(5912, map.remove("Carlos"));
		Assert.assertEquals(0, map.size());
		
	}
	
	
	@Test
	public void testReplace(){
		TDDMap<Object, Object> map = new TDDMap<Object, Object>();
		
		map.put("Carlos", 25);
		map.replace("Carlos", 89);
		
		Assert.assertEquals(89, map.get("Carlos"));
		
	}
	@Test void testSize(){
		TDDMap<Object, Object> map = new TDDMap<Object,Object>();
		map.put("Carlos", 25);
		Assert.assertEquals(1, map.size());
	}
	@Test
	public void testIsEmpty(){
		TDDMap<Object, Object> map = new TDDMap<Object,Object>();
		map.put("Carlos", 25);
		Assert.assertFalse(map.isEmpty());
	}

	public void testValues(){
		TDDMap<Object, Object> map = new TDDMap<Object, Object>();
		
		map.put("Sagnelly", 24);
		map.put("Wilson", 60);
		map.put("Guevara", 33);
		map.put("Abby", 33);
		map.put("Patel", 70);
		map.put("Smith", 10);
		
	
		for(Object i:map.values())
			System.out.println(i);
		
	}
	
	
	public static void main(String[] args){
		TDDMapTest map = new TDDMapTest();
		
		map.testPutItem();
		map.testClearItems();
		map.testContainsKey();
		map.testContainsValue();
		map.testRemove();
		map.testReplace();
		map.testValues();
		
	}

}
