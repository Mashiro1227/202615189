void main() {
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    double height;
    float weight;

    System.out.print("당신의 이름은 ? ");
    name = keyboard.nextLine();
    System.out.printf("%s님의 나이는(예:20) ? ", name);
    age = keyboard.nextInt();
    System.out.printf("%s님의 키는(예:170.5) ? ", name);
    height = keyboard.nextDouble();
    System.out.printf("%s님의 몸무게는(예:78.6) ? ", name);
    weight = keyboard.nextFloat();

    System.out.printf("%s 님의 나이는 %d 세", name, age);
    System.out.printf("%s 님의 키는 %.1f cm", name, height);
    System.out.printf("%s 님의 몸무게는 %.1f kg", name, weight);
}