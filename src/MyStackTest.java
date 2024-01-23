import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {


	@Test 
	public void testPush()
	   {
		MyStack<String> stack = new MyStack<String>();
	      stack.push ("hello");
	      stack.push ("world");
	      assertEquals (stack.peek(), "world");
	   }
	
	@Test
	public void testSize()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push ("test");
		stack.push ("string");
		assertEquals (stack.size(), 2);
	}
	
	@Test
	public void testPop()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push ("test");
		stack.push ("string");
		assertEquals (stack.size(), 2);
		stack.pop();
		assertEquals (stack.size(), 1);
	}
	
	@Test
	public void testEmpty()
	{
		MyStack<String> stack = new MyStack<String>();
		assertEquals (stack.empty(), true);
	}
	
	@Test
	public void testPeek()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push ("test");
		stack.push ("string");
		assertEquals (stack.peek().toString(), "string");
	}
	
	@Test
	public void testClear()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push ("test");
		stack.push ("string");
		stack.clear();
		assertEquals (stack.empty(), true);
	}
	
	@Test
	public void testToString()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push ("test");
		assertEquals (stack.toString(), "[test]");
	}
	
	@Test
	public void testPopTilEmpty()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push ("test");
		stack.push ("string");
		stack.push ("again");
		stack.pop();
		assertEquals (stack.size(), 2);
		stack.pop();
		assertEquals (stack.size(), 1);
		stack.pop();
		assertEquals (stack.empty(), true);
	}
	
	@Test
	public void testClearWhenEmpty()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.clear();
		assertEquals (stack.empty(), true);
		stack.clear();
		assertEquals(stack.empty(), true);
	}
	
	@Test
	public void testEmptySize()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push ("test");
		stack.clear();
		assertEquals (stack.size(), 0);
	}
	
	@Test
	public void testNotEmpty()
	{
		MyStack<String> stack = new MyStack<String>();
		stack.push ("test");
		assertEquals (stack.empty(), false);
	}

}
