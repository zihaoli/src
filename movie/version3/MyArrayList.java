package movie.version3;

import java.util.Arrays;

public class MyArrayList {
	private Object[] objects = new Object[1];
	private int index = 0;// 记录有效元素

	// 往数组中添加元素，每次都添加在最后一个有效位置
	public void add(Object object) {
		if (this.contain(object)) {
			return;
		}else
		if (index == objects.length)
			expand();
		objects[index++] = object;
	}
	

	private void expand() {
		objects = Arrays.copyOf(objects, objects.length * 2);

	}

	public Object[] getObjects() {
		return objects;
	}

	public int getIndex() {
		return index;
	}
//==================================
	public Iterator iterator(){
		return new MyIterator();
	}
	
	private class MyIterator implements Iterator{
		private int size =0 ;
		public Object getCurrent() {
			return objects[size];
		}
		public boolean isDone() {
			if (size==index) {
				return true;
			}
			return false;
		}
		public void next() {
			size++;	
		}
	}

	/**
	 * 通过索引下标获取对象
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		if (index < 0 || index > objects.length) // 不能超出有效范围
			throw new ArrayIndexOutOfBoundsException();

		return objects[index];
	}

	/**
	 * 获取某个对象的下标
	 * @param object
	 *            传入对象
	 * @return
	 */
	public int getDataIndex(Object object) {
		for (int i = 0; i < index; i++) {
			if (object.equals(objects[i]))
				return i;
		}
		return -1;
	}
	/**
	 * 判断对象是否存在这个容器中
	 * @param object传入的对象
	 * @return 是或者否
	 */
	public boolean contain(Object object) {
		for (int i = 0; i < index; i++) {
			if (object.equals(objects[i]))
				return true;
		}
		return false;
	}

}
