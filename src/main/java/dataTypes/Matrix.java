package dataTypes;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.stream.Collectors;

public class Matrix<V> extends ArrayDeque<Vector<V>> {

    private static final String ILLEGAL_VECTOR_EXCEPTION_MSG = "Vector must be the same length as the matrix for operations.";

    public Matrix(Collection collection) {
        super(collection);
    }

    public Vector<V> mulByVector(Vector<V> v) {
        checkIfVectorValid(this, v);
        this.stream()
                .forEach(e -> System.out.println());
        return this.stream()
                .map(wv -> wv.mul(v).getSum())
                .collect(Collectors.toCollection(Vector::new));
    }

    private void checkIfVectorValid(Matrix<V> m, Vector<V> v) throws IllegalArgumentException{
        if(m.size() != v.size())
            throw new IllegalArgumentException(ILLEGAL_VECTOR_EXCEPTION_MSG);
    }
}
