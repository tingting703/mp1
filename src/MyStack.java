import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

	// generic ArrayList stack
	private ArrayList<E> list;

	// Constructor
	public MyStack() {
		list = new ArrayList<E>();
	}

	// Test if stack is empty
	public boolean empty() {
		// Return whether list is empty
		return list.isEmpty();
		
	}

	// Empty the stack
	public void clear() {
		list = new ArrayList<E>();
	}

	// Push an element to the stack
	public E push(E elt) {
		list.add(elt);
		return elt;
	}

	// Pop an element off the stack
	public E pop() {
		//Remove the last element off of the stack and return this element
		try
		{
			if(empty())
			{
				throw new EmptyStackException();
			}
			else
				return list.remove(list.size()-1);
		}
		catch (EmptyStackException e)
		{
			System.err.println("\nError: \'pop\' attempted on an empty stack - exception caught!");
			e.printStackTrace();
		}
		return null;
	}

	// Peek at top of the stack
	public E peek() {
		try {
			if (empty()) {
				throw new EmptyStackException();
			}
			return list.get(list.size() - 1);
		} catch (EmptyStackException e) {
			System.err.println("\nError: \'peek\' attempted on an empty stack - exception caught!");
			e.printStackTrace();
		}
		return null;

	}

	// Return the size of stack
	public int size() {
		return list.size();
	}

	// toString override method
	@Override
	public String toString() {
		return list.toString();
	}

}