void main(){
    Scanner keyboard = new Scanner(System.in);
    int age;
    final int HEART = 65;         // Symbolic Constant (기호적 상수)
    final int DayofYear = 365;

    System.out.print("몇년동안 사셨습니까 ? ");
    age = keyboard.nextInt();

    int day = age * DayofYear;
    int hour = day * 24;
    int minute = hour * 60;

    int count = minute * HEART;

    System.out.printf("사람은 평균 분당 %d회 심장이 박동 합니다.\n", HEART);
    System.out.printf("%d년 동안 박동한 심장 횟수는 %,d 입니다.\n", age, count);
}