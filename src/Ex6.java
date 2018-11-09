public class Ex6 {
    public static void main(String[] args) {
        int[] x = {1, 1, 1, 4, 5};
        int t = 2;
        //TODO przetestować różne kombinacje
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] + x[j] == t) {
                    int[] newArr = new int[x.length - 1];
                    int bonus = 0;
                    for (int l = 0; l < x.length - 1; l++) {
                        if (l == j) {
                            System.out.println("do wywalenia " + x[j]);
                            bonus = 1;
                        }
                        System.out.println("dodaje do nowej tablicy " + x[l + bonus]);
                        newArr[l] = x[l + bonus];
                    }
                    x = newArr;
                }
            }
            System.out.println("Tablica");
            for (int m = 0; m < x.length; m++) {
                System.out.print(x[m] + " ");
            }
            System.out.println();
        }
    }
}