package jdk8_Features;

import java.util.stream.*;

public class stream1 {
	public static void main(String[] args) {
		Stream.iterate(1, ele->ele+1)
		.filter(ele->ele%5==0)
		.limit(5)
		.forEach(System.out::println);
	}
}