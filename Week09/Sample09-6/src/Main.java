void main() {
    final int START = 1;   // 1원
    final int TARGET = 1000000000;
    int total = 0;

    int day = 1;
    for (int i = START; true; i *= 2) {
        total += i;
        System.out.printf("오늘의 저축 금액 = %,11d 원, %3d 일 = %,11d 원\n", i, day, total);

        if (total >= TARGET)
            break;
        day++;
    }
    System.out.printf("%d 일에 %,d 원이 됩니다.", day, total);
}