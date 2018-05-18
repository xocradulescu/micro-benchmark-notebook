package org.costa;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 5, time = 1)
@Fork(1)
@State(Scope.Benchmark)
public class StringBenchmark {

    @Param({"a", "abcdefg",
            "abcdfegjhadkqiuryqiury!@#$!%#!%#!aksjdfaslkjdasldj1341304919as0doasj;daksjdlahfasldgjhalgkha8q2q958725872laSJFlJKHfljhzcv,mcnvJHFLKEHFIEUrywjkfhlksdjhfliuwyet13857"})
    private String stringA;

    @Param({"a", "abcdefg",
            "abcdfegjhadkqiuryqiury!@#$!%#!%#!aksjdfaslkjdasldj1341304919as0doasj;daksjdlahfasldgjhalgkha8q2q958725872laSJFlJKHfljhzcv,mcnvJHFLKEHFIEUrywjkfhlksdjhfliuwyet13857"})
    private String stringB;


    @Benchmark
    public boolean simpleEquals() {
        return StringEquals.simpleEquals(stringA, stringB);
    }

    @Benchmark
    public boolean shortCircuitEquals() {
        return StringEquals.shortCircuitEquals(stringA, stringB);
    }

}
