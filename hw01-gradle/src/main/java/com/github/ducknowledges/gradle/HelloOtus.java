package com.github.ducknowledges.gradle;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Stream;

public class HelloOtus {
    public String makeReversedHello() {
        String hello = "Hello, Otus";
        List<String> example = Stream.of(hello.split("")).toList();
        return String.join("", Lists.reverse(example));
    }
}
