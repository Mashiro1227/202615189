void main() {
    final int LINE = 5;
    final int STAR = 25;

    // =========================================================
    System.out.println("*************************");
    System.out.println("*************************");
    System.out.println("*************************");
    System.out.println("*************************");
    System.out.println("*************************");
    System.out.println();

    // =========================================================
    for (int i = 1; i <= LINE; i++) {
        for (int j = 1; j <= STAR; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println();

    // =========================================================
    int i = 1;
    while (i <= LINE) {
        int j = 1;
        while (j <= STAR) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
    System.out.println();

    // =========================================================
    i = 1;
    do {
        int j = 1;
        do {
            System.out.print("*");
            j++;
        } while (j <= STAR);

        System.out.println(); // 25개 별을 찍은 후 줄바꿈
        i++;
    } while (i <= LINE);
}