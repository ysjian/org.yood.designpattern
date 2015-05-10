package org.yood.dp.singleton;

public class LazyUnsafeSingleton {

	private volatile static LazyUnsafeSingleton instance;

	private LazyUnsafeSingleton() {
	}

	public static LazyUnsafeSingleton getInstance() {
		if (null == instance) {
			instance = new LazyUnsafeSingleton();
		}
		return instance;
	}
}
