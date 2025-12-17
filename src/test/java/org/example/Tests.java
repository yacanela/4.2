package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticSolverExtTest {

    @Test
    void testGetMaxRootSuccess() {
        Quadratic qt = new Quadratic(1, -5, 4);
        QuadraticSolver solver = new QuadraticSolver(qt);

        double maxRoot = solver.getMaxRoot();
        assertEquals(4.0, maxRoot, 0.0001);
    }

    @Test
    void testGetMaxRootSingle() {
        Quadratic qt = new Quadratic(1, -10, 25);
        QuadraticSolver solver = new QuadraticSolver(qt);

        assertEquals(5.0, solver.getMaxRoot(), 0.0001);
    }

    @Test
    void testGetMaxRootWithBothNegativeRoots() {
        Quadratic qt = new Quadratic(1, 5, 6);
        QuadraticSolver solver = new QuadraticSolver(qt);

        assertEquals(-2.0, solver.getMaxRoot(), 0.0001);
    }

    @Test
    void testGetMaxRootWithZero() {
        Quadratic qt = new Quadratic(1, -1, 0);
        QuadraticSolver solver = new QuadraticSolver(qt);

        assertEquals(1.0, solver.getMaxRoot(), 0.0001);
    }

    @Test
    void testGetMaxRootIrrational() {
        Quadratic qt = new Quadratic(1, 0, -2);
        QuadraticSolver solver = new QuadraticSolver(qt);

        assertEquals(Math.sqrt(2), solver.getMaxRoot(), 0.0001);
    }
}