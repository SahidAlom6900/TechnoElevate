package com.technoelevate.stream;

import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		streamIterated.forEach(i->System.out.println(i));
	}

}
