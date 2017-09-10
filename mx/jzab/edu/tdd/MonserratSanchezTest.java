package mx.jzab.edu.tdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MonserratSanchezTest {
	
	@Test
	public void testPutItem(){
		MonserratSanchezMap<String, Integer> map = new MonserratSanchezMap<String, Integer>();
		map.put("Monserrat", 24);
		map.put("Alejandro", 60);
		map.put("Eduardo", 33);
		
		Assert.assertEquals(3, map.size());
	}
	
	@Test
	public void testClearItems(){
		MonserratSanchezMap<String, Integer> map = new MonserratSanchezMap<String, Integer>();
		map.put("Monserrat", 24);
		map.put("Alejandro", 60);
		map.put("Eduardo", 33);
		
		map.clear();
		
		Assert.assertEquals(0, map.size());
		
	}
	
	
	@Test
	public void testContainsKey(){
		MonserratSanchezMap<String, Integer> map = new MonserratSanchezMap<String, Integer>();
		map.put("Monserrat", 24);
		map.put("Alejandro", 60);
		
		Assert.assertTrue(map.containsKey("Monserrat"));
		Assert.assertFalse(map.containsKey("Eduardo"));
		
	}
	
	@Test
	public void testContainsValue(){
		MonserratSanchezMap<String, Object> map = new MonserratSanchezMap<String, Object>();
		map.put("Monserrat", 90);
		map.put("Alejandra", "180-126");
		
		Assert.assertTrue(map.containsValue(90));
		Assert.assertTrue(map.containsValue("180-126"));
		
		Assert.assertFalse(map.containsValue(80));
		
		
	}
	
	@Test
	public void testGet(){
		MonserratSanchezMap<Object, Object> map = new MonserratSanchezMap<Object, Object>();
		map.put("Monserrat", 29);
		
		Assert.assertEquals(29, map.get("Monserrat"));
		
	}
	@Test
	private void testGetDef() {
		MonserratSanchezMap<Object, Object> map = new MonserratSanchezMap<Object, Object>();
		map.put("Monserrat", 29);
		Assert.assertEquals("Monserrat", map.getOrDefault(29, "Monserrat"));

	}
	
	@Test
	public void testRemove(){
		MonserratSanchezMap<Object, Object> map = new MonserratSanchezMap<Object, Object>();
		map.put("Carlos", 5912);
		
		
		Assert.assertEquals(5912, map.remove("Carlos"));
		Assert.assertEquals(0, map.size());
		
	}
	
	
	@Test
	public void testReplace(){
		MonserratSanchezMap<Object, Object> map = new MonserratSanchezMap<Object, Object>();
		
		map.put("Carlos", 25);
		map.replace("Carlos", 89);
		
		Assert.assertEquals(89, map.get("Carlos"));
		
	}
	@Test void testSize(){
		MonserratSanchezMap<Object, Object> map = new MonserratSanchezMap<Object,Object>();
		map.put("Carlos", 25);
		Assert.assertEquals(1, map.size());
	}
	@Test
	public void testIsEmpty(){
		MonserratSanchezMap<Object, Object> map = new MonserratSanchezMap<Object,Object>();
		map.put("Carlos", 25);
		Assert.assertFalse(map.isEmpty());
	}

	public void testValues(){
		MonserratSanchezMap<Object, Object> map = new MonserratSanchezMap<Object, Object>();
		
		map.put("Monserrat", 24);
		map.put("Eduardo", 60);
		map.put("Carlos", 33);
		map.put("Alejandra", 33);
		map.put("Brenda", 70);
		map.put("Sofia", 10);
		
	
		for(Object i:map.values())
			System.out.println(i);
		Assert.assertEquals(6, map.size());
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