package movie.version3;

import java.util.Arrays;

public class MyArrayList {
	private Object[] objects = new Object[1];
	private int index = 0;// ��¼��ЧԪ��

	// �����������Ԫ�أ�ÿ�ζ���������һ����Чλ��
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
	 * ͨ�������±��ȡ����
	 * @param index
	 * @return
	 */
	public Object get(int index) {
		if (index < 0 || index > objects.length) // ���ܳ�����Ч��Χ
			throw new ArrayIndexOutOfBoundsException();

		return objects[index];
	}

	/**
	 * ��ȡĳ��������±�
	 * @param object
	 *            �������
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
	 * �ж϶����Ƿ�������������
	 * @param object����Ķ���
	 * @return �ǻ��߷�
	 */
	public boolean contain(Object object) {
		for (int i = 0; i < index; i++) {
			if (object.equals(objects[i]))
				return true;
		}
		return false;
	}

}
