package com.isma.javaversions.v9.process;

import org.junit.jupiter.api.Test;

public class ProcessApi {

    @Test
    public void getAllProcess() {
        ProcessHandle.allProcesses()
            .map(ProcessHandle::info)
            .forEach(System.out::println);
    }

    @Test
    public void processInfo() {
        ProcessHandle self = ProcessHandle.current();
        ProcessHandle.Info procInfo = self.info();
        System.out.println(self.pid());
        System.out.println(procInfo.arguments());
        System.out.println(procInfo.commandLine());
        System.out.println(procInfo.startInstant());
        System.out.println(procInfo.totalCpuDuration());
    }

    @Test
    public void parentProcess() {
        ProcessHandle process = ProcessHandle.current();
        do{
            System.out.println(process.info());
            process = process.parent().orElse(null);
        } while (process != null);
    }
}
