public class Main {
    public static void main(String[] args) {
        GenericClass<Integer, Float, String> genericClass = new GenericClass<>(10, 10.5f , "Hello");
        genericClass.printClassNames();

        Integer[] array = {5, 3, 8, 1, 2};
        MinMax<Integer> minMax = new MinMax<>(array);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());

        System.out.println("Sum: " + Calculator.sum(5, 3.5));
        System.out.println("Multiply: " + Calculator.multiply(5, 3.5));
        System.out.println("Divide: " + Calculator.divide(5, 3.5));
        System.out.println("Subtraction: " + Calculator.subtraction(5, 3.5));

        Integer[][] matrix1 = {{1, 2}, {3, 4}};
        Integer[][] matrix2 = {{5, 6}, {7, 8}};
        Matrix<Integer> matrixA = new Matrix<>(matrix1);
        Matrix<Integer> matrixB = new Matrix<>(matrix2);
        Matrix<Integer> matrixC = matrixA.add(matrixB);
        System.out.println("Matrix C:");
        for (int i = 0; i < matrixC.getLenght(); i++) {
            for (int j = 0; j < matrixC.getLenght(); j++) {
                System.out.print(matrixC.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }
}