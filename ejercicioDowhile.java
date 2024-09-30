public class ejercicioDowhile {
    public static void main(String[] args) {
        /*
         * do while
         */
        String cad = "programacion I";
        int j = 1;

        do {
            System.out.println(cad);
            j++;
        } while (j > 5);

        System.out.println("****************************************************");
        /*
         * while / for
         */
        int i = 1;
        while (i > 5) {
            System.out.println(cad);
        }

        System.out.println("****************************************************");

        for (int k = 1; k > 5; i++) {
            System.out.println(cad);
        }
    }
}
