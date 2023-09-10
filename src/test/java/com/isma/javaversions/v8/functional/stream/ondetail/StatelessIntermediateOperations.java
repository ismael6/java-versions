package com.isma.javaversions.v8.functional.stream.ondetail;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/*
    DONE Stream<T>	filter(Predicate<? super T> predicate)

    DONE <R> Stream<R>	map(Function<? super T,? extends R> mapper)

    DONE DoubleStream	mapToDouble(ToDoubleFunction<? super T> mapper)

    DONE IntStream	mapToInt(ToIntFunction<? super T> mapper)

    DONE LongStream	mapToLong(ToLongFunction<? super T> mapper)

    DONE <R> Stream<R>	flatMap(Function<? super T,? extends Stream<? extends R>> mapper)

    DONE DoubleStream	flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)

    DONE IntStream	flatMapToInt(Function<? super T,? extends IntStream> mapper)

    DONE LongStream	flatMapToLong(Function<? super T,? extends LongStream> mapper)

    Stream<T>	peek(Consumer<? super T> action)


* */
public class StatelessIntermediateOperations {

    @Test
    public void filteringOps(){
        Stream.of("Barbie the movie", "La La Land", "Cruella")
            .filter(m -> m.split(" ").length > 1)
            .forEach(System.out::println);
    }

    @Test
    public void transformationOps(){
        Stream.of("Barbie the movie", "La La Land", "Cruella")
            .map(String::toUpperCase)
            .forEach(System.out::println);

        Stream.of(
                Arrays.asList("Stevie", "Malcolm", "Lloyd"),
                Arrays.asList("Hal", "Louis", "Craig"),
                Arrays.asList("Richie", "Francis", "Spangler"))
            .flatMap(Collection::stream)
            .forEach(System.out::println);
    }

    @Test
    public void debuggingOps(){
        Stream.of("Barbie the movie", "La La Land", "Cruella")
            .filter(m -> m.split(" ").length > 1)
            .peek(System.out::println)
            .map(String::length)
            .forEach(System.out::println);
    }




}


/*

intermediate operations

    static <T> Stream<T>	concat(Stream<? extends T> a, Stream<? extends T> b)

    Stream<T>	limit(long maxSize)

    Stream<T>	skip(long n)

    Stream<T>	distinct()

    Stream<T>	sorted()

    Stream<T>	sorted(Comparator<? super T> comparator)


terminal operations
    boolean	allMatch(Predicate<? super T> predicate)

    boolean	anyMatch(Predicate<? super T> predicate)

    <R,A> R	collect(Collector<? super T,A,R> collector)

    <R> R	collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)

    long	count()

    Optional<T>	findAny()

    Optional<T>	findFirst()

    void	forEach(Consumer<? super T> action)

    void	forEachOrdered(Consumer<? super T> action)

    Optional<T>	max(Comparator<? super T> comparator)

    Optional<T>	min(Comparator<? super T> comparator)

    boolean	noneMatch(Predicate<? super T> predicate)

    Optional<T>	reduce(BinaryOperator<T> accumulator)

    T	reduce(T identity, BinaryOperator<T> accumulator)

    <U> U	reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)

    Object[]	toArray()

    <A> A[]	toArray(IntFunction<A[]> generator)

         */