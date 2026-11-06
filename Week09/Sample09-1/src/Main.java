void main() throws IOException{
    Scanner keyboard = new Scanner(System.in);
    final int SIZE = 30;
    char answer;
    String result;

    for (int i = 1; i <= SIZE; i++) {
        while (true) {
            System.out.printf("%d번 학생 출석했나요 ? (Y/N) ", i);
            answer = keyboard.nextLine().charAt(0);
            if (answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n')
                break;
            else {
                System.err.print("ERROR : 입력 오류");
                System.in.read();
            }
        }

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%s번 학생은 %s 입니다.\n", i, result);
    }
}