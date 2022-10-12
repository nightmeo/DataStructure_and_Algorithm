package compare;

import java.util.Arrays;

public class Vector implements Comparable<Vector> {
    final double[] CV;

    private Vector(double[] componentVector) {
        this.CV = componentVector;
    }

    public Vector(int dimension) {
        this.CV = new double[dimension];
    }

    public void setV(int dimension, double value) {
        CV[dimension] = value;
    }

    public void setCV(double[] values) {
        System.arraycopy(values, 0, CV, 0, CV.length);
    }

    public double[] getCV() {
        return CV;
    }

    public int getDimension() {
        return CV.length;
    }

    public double getModule() {
        double module2 = 0.0;
        for (double c : CV) module2 += c * c;
        return Math.sqrt(module2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector vector)) return false;

        return Arrays.equals(getCV(), vector.getCV());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getCV());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return Arrays.toString(CV);
    }

    @Override
    public int compareTo(Vector anotherVector) {
        return Double.compare(this.getModule(), anotherVector.getModule());
    }
}
