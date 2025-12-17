package org.example;
import java.util.Arrays;

public class QuadraticSolver {
    private final Quadratic trinomial;

    public QuadraticSolver(Quadratic trinomial) {
        this.trinomial = trinomial;
    }

    public double getMaxRoot() {
        double[] roots = trinomial.solve();
        if (roots.length == 0) {
            throw new RuntimeException("Корней нет");
        }
        return Arrays.stream(roots).max().getAsDouble();
    }
}