package com.decorator.design;

public class ExampleOne {

	public static class iphone {

		public String name() {
			return "Iphone 11";
		}

		int getCamera() {
			return 2;
		}
	}

	public static class iphoneXlm {
		public String name() {
			return "Iphone 11 xlm";
		}

		int getCamera() {
			return 3;
		}
	}

	public static class iphonePro {
		public String name() {
			return "Iphone 11 pro";
		}

		int getCamera() {
			return 3;
		}
	}
}