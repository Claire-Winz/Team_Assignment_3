public class Assign1_1 {

  public static void main(String[] args) {
    Man man = new Man();
    man.breath();
  }
}


  class Animal {

    void breath() {
      System.out.println("숨쉬다.");
    }
  }

  class Man extends Animal {

  }
