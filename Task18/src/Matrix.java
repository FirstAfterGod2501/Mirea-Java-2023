public class Matrix<T> {
    private T[][] matrix;

    public int getLenght(){
        return matrix.length;
    }

    public T getElement(int i, int j){
        return this.matrix[i][j];
    }

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (matrix.length != other.matrix.length || matrix[0].length != other.matrix[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        T[][] result = (T[][]) new Object[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = (T) addElements(matrix[i][j], other.matrix[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    private T addElements(T element1, T element2) {
        if (element1 instanceof Integer) {
            return (T) Integer.valueOf((Integer) element1 + (Integer) element2);
        } else if (element1 instanceof Double) {
            return (T) Double.valueOf((Double) element1 + (Double) element2);
        } else {
            throw new IllegalArgumentException("Unsupported element type");
        }
    }
}