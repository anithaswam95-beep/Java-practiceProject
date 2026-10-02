package methoddemo;

class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 - same name, 3 parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 - same name, different data type
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10.5, 20.5));
    }
}

