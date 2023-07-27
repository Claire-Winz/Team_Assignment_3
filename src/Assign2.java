import java.util.ArrayList;
import java.util.Scanner;

public class Assign2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<String> list = new ArrayList<>();

    boolean run = true;
    int count = 1;

    System.out.println("======  명언 메모 앱  ======");
    System.out.println("------  명령어 리스트  ------");
    System.out.println(" *등록* *목록* *수정* *종료*");


    while (run) {

      System.out.print("명령을 입력해주세요 > ");

      switch (sc.nextLine()) {

        case "종료" :
          run = false;
          break;

        case "등록" :
          System.out.print("명언 : ");
          String A = sc.nextLine();

          System.out.print("작가 : ");
          String B = sc.nextLine();

          list.add(count + " / " + B + " / " + A);

          System.out.println(count + "번 명언이 등록되었습니다.");
          count++;
          break;

        case "목록" :
          System.out.println("================================");
          System.out.println("번호 / 작가 /  명언");
          for (String s : list) {
            System.out.println(s);
          }
          System.out.println("================================");
          break;

        case "삭제" :
          System.out.print("삭제할 명언의 번호를 입력해주세요 : ");
          String num = sc.nextLine();
          boolean check = false;

          for (int i = 0; i < list.size(); i++) {
            String del = list.get(i);
            if (del.contains(num + " / ")) {
              list.remove(i);
              System.out.println(num + "번 명언이 삭제되었습니다.");
              check = true;
            }
          }

          if (check == false) {
            System.out.println(num + "번 명언은 존재하지 않습니다.");
          }
          break;

        case "수정" :
          System.out.print("수정할 명언의 번호를 입력해주세요 : ");
          String num1 = sc.nextLine();
          boolean check1 = false;

          for (int i = 0; i < list.size(); i++) {
            String mod = list.get(i);
            if (mod.contains(num1 + " / ")) {
              System.out.print("수정할 명언 : ");
              String modInput1 = sc.nextLine();

              System.out.print("수정할 작가 : ");
              String modInput2 = sc.nextLine();

              list.set(i, num1 + " / " + modInput2 + " / " + modInput1);
              System.out.println(num1 + "번 명언이 수정되었습니다.");
              check1 = true;
            }
          }

          if (check1 == false) {
            System.out.println(num1 + "번 명언은 존재하지 않습니다.");
          }
          break;
      }
    }
  }
}
