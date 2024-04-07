package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] elements = new Object[10];
int itemCount = 0;
	@Override
	public boolean add(T item) {
		if(itemCount==elements.length){
		growCapcityArray();	
		}
		elements[itemCount] = item;
		itemCount++;
		System.out.println(elements.length);

		
//		if statment if your item count = items.length 
//		creating anew object array and use item.length *2
//		transfer all the old object to a new object
//		add another for loop , i = 0 , i< item.length , i++ 
//		items = updated items
//		print the (item.lenghth) capcity of the array)
//		 rsuse to itemCount by using the if statment 
//	new u
//	copyof method to read through	
		return true;
	}
	
		private void growCapcityArray() {
		// TODO Auto-generated method stub
		int newCapcity = elements.length*2;
	     Object[] newItems = new Object[newCapcity];
		System.arraycopy(elements, 0, newItems, 0, itemCount);
		elements = newItems;
	}
		//
	

	@Override
	public int getSize() {
		System.out.println( itemCount);
		return itemCount;
		// TODO Auto-generated method stub
		
	}
	@Override
	public T get(int index) {
		if (index < 0 || index >= itemCount) {
			   throw new IndexOutOfBoundsException("Index: " + index + ", itemCount: " + itemCount);
		}
	
		// TODO Auto-generated method stub
		return (T) elements[index];
	}
	
}
