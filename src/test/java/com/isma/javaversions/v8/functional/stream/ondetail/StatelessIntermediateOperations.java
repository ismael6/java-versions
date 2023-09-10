package com.isma.javaversions.v8.functional.stream.ondetail;

/*
    Stream<T>	filter(Predicate<? super T> predicate)

    <R> Stream<R>	flatMap(Function<? super T,? extends Stream<? extends R>> mapper)

    DoubleStream	flatMapToDouble(Function<? super T,? extends DoubleStream> mapper)

    IntStream	flatMapToInt(Function<? super T,? extends IntStream> mapper)

    LongStream	flatMapToLong(Function<? super T,? extends LongStream> mapper)

    <R> Stream<R>	map(Function<? super T,? extends R> mapper)

    DoubleStream	mapToDouble(ToDoubleFunction<? super T> mapper)

    IntStream	mapToInt(ToIntFunction<? super T> mapper)

    LongStream	mapToLong(ToLongFunction<? super T> mapper)

    Stream<T>	peek(Consumer<? super T> action)


* */
public class StatelessIntermediateOperations {


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