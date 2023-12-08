package com.isma.javaversions.v19.preview.threads;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.StructuredTaskScope;
import java.util.concurrent.StructuredTaskScope.Subtask;

public class StructuredConcurrency {

    void before() throws ExecutionException, InterruptedException {
        try (var ex = new ScheduledThreadPoolExecutor(2)) {
            Future<Integer> items = ex.submit(() -> updateStock());
            Future<Integer> cep = ex.submit(() -> performBankTransaction());

            Integer stockResult = items.get();
            Integer paymentResult = cep.get();

            System.out.println("Result is stock = " + stockResult + " payment = " + paymentResult);
        }
    }


    void usingStructuredConcurrencyOnFailure() throws ExecutionException, InterruptedException {
        try (var transaction = new StructuredTaskScope.ShutdownOnFailure()) {
            Subtask<Integer> items = transaction.fork(() -> updateStock());
            Subtask<Integer> cep = transaction.fork(() -> performBankTransaction());

            transaction.join();
            transaction.throwIfFailed();

            System.out.println("Result is inv = " + items.get() + " ord = " + cep.get());
        }
    }

    void usingStructuredConcurrencyOnSuccess() throws ExecutionException, InterruptedException {
        try (var transaction = new StructuredTaskScope.ShutdownOnSuccess<Integer>()) {
            Subtask<Integer> items = transaction.fork(() -> updateStock());
            Subtask<Integer> cep = transaction.fork(() -> performBankTransaction());

            transaction.join();
            System.out.println(transaction.result());

        }
    }

    Integer updateStock(){
        throw new ArithmeticException();
//        return 1;

    }

    Integer performBankTransaction() throws InterruptedException{
        Thread.sleep(7_000);
        return 2;
    }

    @Test
    public void test() throws ExecutionException, InterruptedException {
        try {
            before();
        } catch (InterruptedException e) {
            System.out.println("---");
        }
    }
}
