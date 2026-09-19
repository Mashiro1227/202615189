void main() {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("당신의 이름은 ? ");
    String name = keyboard.next();

    System.out.printf("%s님의 가족은 몇 명입니까 ? ", name);
    int family = keyboard.nextInt();

    keyboard.nextLine();

    System.out.printf("%s님의 가족은 어디에서 살지요 ? ", name);
    String region = keyboard.nextLine();

    System.out.printf("%s님의 가족은 %d명입니다. %s님의 가족은 %s에서 살고 있습니다.", name, family, name, region);
}