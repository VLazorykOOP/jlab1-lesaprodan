public class Main {

    public static void main(String[] args) {
	// write your code here
	    public static double function1(double a, double b) {
        double result = (1 / (a * Math.pow(b, 2)) - 2 * b) + (1 / (Math.pow(3 * a, 2)) + 2) * b;
        return result;
    }

    public static double function2(int a, int b) {
        double result = (1 / (a * Math.pow(b, 2)) - 2 * b) + (1 / (Math.pow(3 * a, 2)) + 2) * b;
        return result;
    }

    public static int function3(double a, double b) {
        int result = (int) ((1 / (a * Math.pow(b, 2)) - 2 * b) + (1 / (Math.pow(3 * a, 2)) + 2) * b);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First Example");
        System.out.print("Input a: ");

        while (!scan.hasNextDouble()){
            System.out.println("Please input a number!");
            scan.next();
        }
        double a = scan.nextDouble();

        System.out.print("Input b: ");
        while (!scan.hasNextDouble()){
            System.out.println("Please input a number!");
            scan.next();
        }
        double b = scan.nextDouble();

        while (a * b == 0 || (a - b == 0 && b != 0)) {
            System.out.println("The denominator cannot be 0. Please input new values.");

            if (a * b == 0) {
                System.out.println("At least one of the values should not be 0.");
            }
           
            System.out.print("Input new a: ");
            while (!scan.hasNextDouble()) {
                System.out.println("Please input a number.");
                scan.next();
            }
            a = scan.nextDouble();

            System.out.print("Input new b: ");
            while (!scan.hasNextDouble()) {
                System.out.println("Please input a number.");
                scan.next();
            }
            b = scan.nextDouble();
        }

        System.out.println("Example 1 result: " + function1(a, b));
        System.out.println("Example 2 result: " + function2((int) a, (int) b));
        System.out.println("Example 3 result: " + function3(a, b));
    }
	    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ввід розмірів масивів
        System.out.print("Введіть розмір масиву A (<=400): ");
        int n = input.nextInt();
        
        System.out.print("Введіть розмір масиву B (<=200): ");
        int m = input.nextInt();
        
        // Створення масивів A та B
        int[] a = new int[n];
        int[] b = new int[m];
        
        // Ввід елементів масивів A та B
        System.out.println("Введіть елементи масиву A:");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        
        System.out.println("Введіть елементи масиву B:");
        for (int i = 0; i < m; i++) {
            b[i] = input.nextInt();
        }
        
        // Обчислення симетричної різниці
        Set<Integer> aSet = new HashSet<Integer>();
        Set<Integer> bSet = new HashSet<Integer>();
        Set<Integer> symmetricDiff = new HashSet<Integer>();
        
        for (int i : a) {
            aSet.add(i);
        }
        
        for (int i : b) {
            bSet.add(i);
        }
        
        for (int i : aSet) {
            if (!bSet.contains(i)) {
                symmetricDiff.add(i);
            }
        }
        
        for (int i : bSet) {
            if (!aSet.contains(i)) {
                symmetricDiff.add(i);
            }
        }
        
        // Запис симетричної різниці в масив C
        int[] c = new int[symmetricDiff.size()];
        int index = 0;
        for (int i : symmetricDiff) {
            c[index++] = i;
        }
        
        // Вивід результату
        System.out.print("Симетрична різниця A\\B ∪ B\\A: ");
        for (int i : c) {
            System.out.print(i + " ");
        }
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the matrix (n <= 20): ");
        int n = scanner.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix you entered is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < A.length; i++) {
            if (isSymmetric(A[i])) {
                System.out.println("Row " + (i+1) + " contains a symmetric sequence.");
            }
        }

        scanner.close();
    }

    public static boolean isSymmetric(int[] row) {
        int mid = row.length / 2;
        for (int i = 0; i < mid; i++) {
            if (row[i] != row[row.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
	    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] words = text.split("[\\s,.!?]+"); // розділення тексту на слова

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (!hasRepeatingLetters(word)) { // перевірка, чи слово містить повторювані літери
                result.add(word);
            }
        }

        System.out.println("Result: " + result); // виведення результату
    }

    private static boolean hasRepeatingLetters(String word) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (seen.contains(c)) {
                return true;
            }
            seen.add(c);
        }
        return false;
    }
        System.out.println("Lab 1 Java");
    }
}
