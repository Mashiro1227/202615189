void main() {
    short value1 = 32677;
    short value2 = 200;
    int result = value1 + value2;
    short result1 = (short) (value1 + value2);

    System.out.printf("%d + %d = %d (%d)\n", value1, value2, result, result1);
}