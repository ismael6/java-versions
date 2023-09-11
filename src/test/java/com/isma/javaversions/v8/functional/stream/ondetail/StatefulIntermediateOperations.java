package com.isma.javaversions.v8.functional.stream.ondetail;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class StatefulIntermediateOperations {

    @Test
    public void truncateOps(){
        Stream.of(1,2,3,4,5)
                .limit(2)
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5)
                .skip(3)
                .forEach(System.out::println);
    }

    @Test
    public void comparableOps(){
        Stream.of(1,2,3,4,5,3,4)
                .distinct()
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5,3,4)
                .sorted()
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5,3,4)
                .sorted((a,b) -> b-a)
                .forEach(System.out::println);
    }

    @Test
    public void appendableOps(){
        Stream.concat(
                Stream.of(1,2,3),
                Stream.of(4,5,6))
                .forEach(System.out::println);
    }
}



/*



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

* */