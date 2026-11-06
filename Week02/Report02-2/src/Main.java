void main() {
    Scanner keyboard = new Scanner(System.in);
    int 변의길이;

    System.out.print("정사각형의 한 변의 길이 : ");
    변의길이 = keyboard.nextInt();

    double boxArea = 변의길이 * 변의길이;
    double radius = 변의길이 / 2.0;
    double circleArea = 3.141592 * radius * radius;

    double result = boxArea - circleArea;

    System.out.printf("정사각형 면적 : %.1f\u33A0\n", boxArea);
    System.out.printf("원의 면적 : %.2f\u33A0\n", circleArea);
    System.out.printf("구하는 면적 : %.2f\u33A0\n", result);
}