void main() {
    Scanner keyboard = new Scanner(System.in);
    int width;  // 가로 길이
    int height; // 세로 길이
    char type;  // 직, 정사각형
    int area;   // 면적
    boolean flag;

    System.out.print("사각형의 가로 길이 입력 (예 5) : ");
    width = keyboard.nextInt();
    System.out.print("사각형의 세로 길이 입력 (예 5) : ");
    height = keyboard.nextInt();

    flag = (width > 0 && height > 0) ? true : false;

    type = (width == height) ? '정' : '직';
    area = width * height;

    String result = flag == true ? String.format("**** %c사각형 넓이 ****\n\t가로 길이 %,d Cm\n\t세로 길이 : %,d Cm\n\t넓   이 : %,d \u33a0\n", type, width, height, area) : "Data 오류입니다.";

    System.out.println(result);
}