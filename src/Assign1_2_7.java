public class Assign1_2_7 {
  public static void main(String[] args) {
    ThunderDuck thunderDuck = new ThunderDuck();
    thunderDuck.fly();
    // 출력 : 오리가 날개로 날아갑니다.

    WhiteDuck whiteDuck = new WhiteDuck();
    whiteDuck.fly();
    // 출력 : 오리가 날개로 날아갑니다.

    RubberDuck rubberDuck = new RubberDuck();
    rubberDuck.fly();
    // 출력 : 저는 날 수 없어요. ㅜㅠ

    RubberDuck rubberDuck2 = new RubberDuck();
    rubberDuck2.fly();
    // 출력 : 저는 날 수 없어요. ㅜㅠ

    rubberDuck2.flyItem = new Rocket();
    rubberDuck2.fly();
    // 출력 : 러버덕이 로켓으로 날아갑니다.
    rubberDuck2.flyItem = new ExtendWing();
    rubberDuck2.fly();
    // 출력 : 러버덕이 확장날개로 날아갑니다.
    rubberDuck2.flyItem = new Magic();
    rubberDuck2.fly();
    // 출력 : 러버덕이 마법으로 날아갑니다.

  }
}

abstract class Duck {

  FlyItem flyItem;

  Duck() { flyItem = new Fly(); }

  void fly() {
    flyItem.Action();
  }
}

class ThunderDuck extends Duck {

}

class WhiteDuck extends Duck {

}

class RubberDuck extends Duck {

  RubberDuck() { flyItem = new NotFly(); }
}


abstract class FlyItem {
  //void Action() {System.out.println("러버덕이 " + item + "으로 날아갑니다.");}
  abstract void Action();
}

class Fly extends FlyItem {

  @Override
  void Action() {
    System.out.println("오리가 날개로 날아갑니다.");
  }
}

class NotFly extends FlyItem {

  @Override
  void Action() {
    System.out.println("저는 날 수 없어요. ㅜㅠ");
  }
}

class Rocket extends FlyItem {

  @Override
  void Action() {
    System.out.println("러버덕이 로켓으로 날아갑니다.");
  }
}

class ExtendWing extends FlyItem {

  @Override
  void Action() {
    System.out.println("러버덕이 확장날개로 날아갑니다.");
  }
}

class Magic extends FlyItem {

  @Override
  void Action() {
    System.out.println("러버덕이 마법으로 날아갑니다.");
  }
}