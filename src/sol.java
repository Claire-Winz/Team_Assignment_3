class sol {
  public static void main(String[] args) {
    청둥오리 a청둥오리 = new 청둥오리();
    a청둥오리.날다();
    // 출력 : 오리가 날개로 날아갑니다.

    흰오리 a흰오리 = new 흰오리();
    a흰오리.날다();
    // 출력 : 오리가 날개로 날아갑니다.

    고무오리 a고무오리 = new 고무오리();
    a고무오리.날다();
    // 출력 : 저는 날 수 없어요. ㅜㅠ

    고무2오리 a고무2오리 = new 고무2오리();
    a고무2오리.날다();
    // 출력 : 저는 날 수 없어요. ㅜㅠ

    a고무2오리.a비행아이템 = new 로켓비행아이템();
    a고무2오리.날다();
    // 출력 : 로켓파워로 날아갑니다.

    // 이런것도 가능합니다.
    a고무2오리.a비행아이템 = new 염력비행아이템();
    a고무2오리.날다();
    // 출력 : 오리가 염력으로 날아갑니다.
  }
}

abstract class 오리 {
  비행아이템 a비행아이템;

  오리() {
    a비행아이템 = new 날개비행아이템();
  }

  void 날다() {
    a비행아이템.작동();
  }
}

class 흰오리 extends 오리 {

}

class 청둥오리 extends 오리 {

}

class 고무오리 extends 오리 {
  고무오리() {
    a비행아이템 = new 못나는비행아이템();
  }
}

class 고무2오리 extends 오리 {
  고무2오리() {
    a비행아이템 = new 못나는비행아이템();
  }
}

abstract class 비행아이템 {
  abstract void 작동();
}

class 날개비행아이템 extends 비행아이템 {
  void 작동() {
    System.out.println("날개로 날아갑니다.");
  }
}

class 못나는비행아이템 extends 비행아이템 {
  void 작동() {
    System.out.println("저는 못 날아요 ㅠㅠ");
  }
}

class 로켓비행아이템 extends 비행아이템 {
  void 작동() {
    System.out.println("로켓파워로 날아갑니다.");
  }
}

class 염력비행아이템 extends 비행아이템 {
  void 작동() {
    System.out.println("염력으로 날아갑니다.");
  }
}
