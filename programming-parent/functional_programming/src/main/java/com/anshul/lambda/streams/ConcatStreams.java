package com.anshul.lambda.streams;

import java.util.stream.Stream;

public class ConcatStreams {
  public static void main(String[] args) {
    Stream<String> stream1 = Stream.of("Anshul", "Mohil", "Anukul", "Mohil");
    Stream<String> stream2 = Stream.of("Manpreet", "Kaur", "Ricky", "Cheema");

    Stream<String> concatStream = Stream.concat(stream1, stream2);

    concatStream.forEach(s -> System.out.println(s + " "));


    //  concatStream.forEach(s -> System.out.println(s + " "));

    Stream<String> distinctStream = Stream.concat(stream1, stream2).distinct();

    distinctStream.forEach(s -> System.out.println(s + " "));
  }
}