package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	private T[] aL;

	public ArrayList() {
		aL = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return aL[loc];

	}

	public void add(T val) {
		T[] tempAL;

		tempAL = (T[]) new Object[aL.length + 1];

		for (int i = 0; i < aL.length; i++) {

			tempAL[i] = aL[i];
		}

		tempAL[tempAL.length - 1] = val;

		aL = tempAL;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] tempAL;
		tempAL = (T[]) new Object[aL.length + 1];

		if (loc == 0) {

			tempAL[0] = val;

			for (int i = 1; i < tempAL.length; i++) {

				tempAL[i] = aL[i - 1];

			}

		} else if (loc > 0 && loc < aL.length) {

			for (int i = 0; i < loc; i++) {

				tempAL[i] = aL[i];
			}
			tempAL[loc] = val;

			for (int i = loc + 1; i < tempAL.length; i++) {

				tempAL[i] = aL[i - 1];
			}

		}

		else {
			for (int i = 1; i < tempAL.length; i++) {

				tempAL[i] = aL[i];

			}
			tempAL[tempAL.length - 1] = val;
		}
		tempAL[loc] = val;
		aL = tempAL;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] tempAL;
		tempAL = (T[]) new Object[aL.length + 1];

		for (int i = 0; i < aL.length; i++) {

			tempAL[i] = aL[i];
		}
		aL[loc] = val;

	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] tempAL;
		tempAL = (T[]) new Object[aL.length - 1];

		if (loc == 0) {

			for (int i = 0; i < tempAL.length; i++) {

				tempAL[i] = aL[i + 1];
			}

		} else if (loc > 0 && loc < aL.length) {

			for (int i = 0; i < loc; i++) {

				tempAL[i] = aL[i];
			}

			for (int i = loc + 1; i < tempAL.length; i++) {

				tempAL[i] = aL[i - 1];
			}

		}

		else {
			for (int i = 1; i < tempAL.length; i++) {

				tempAL[i] = aL[i - 1];

			}
		}
		aL = tempAL;
	}

	public int size() throws IndexOutOfBoundsException {
		return aL.length;

	}

	public boolean contains(T val) {
		boolean toReturn = false;
		for (int j = 0; j < aL.length; j++) {

			if (aL[j] == val) {
				toReturn = true;
			}
		}

		return toReturn;

	}
}