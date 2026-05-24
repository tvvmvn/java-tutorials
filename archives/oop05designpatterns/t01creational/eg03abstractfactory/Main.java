package oop05designpatterns.t01creational.eg03abstractfactory;

// =============================================================================
// 1. 추상 제품들 (Abstract Products) - 상호작용하는 제품 군의 규격
// =============================================================================

// 제품 A: 버튼 인터페이스
interface Button {
  void render();

  void onClick();
}

// 제품 B: 텍스트 필드 인터페이스
interface TextField {
  void display();

  void handleInput(String text);
}

// =============================================================================
// 2. 구체적인 제품들 - Windows 제품군 (Concrete Products - Windows Family)
// =============================================================================

class WinButton implements Button {
  @Override
  public void render() {
    System.out.println("[Windows] 사각형 모양의 회색 스타일 버튼을 화면에 그립니다.");
  }

  @Override
  public void onClick() {
    System.out.println("[Windows] 더블 클릭 이벤트를 캡처하여 처리합니다.");
  }
}

class WinTextField implements TextField {
  @Override
  public void display() {
    System.out.println("[Windows] 클래식 폰트가 적용된 입력창을 표시합니다.");
  }

  @Override
  public void handleInput(String text) {
    System.out.println("[Windows] 입력창에 '" + text + "' 문자열이 버퍼에 기록되었습니다.");
  }
}

// =============================================================================
// 2-2. 구체적인 제품들 - Mac 제품군 (Concrete Products - Mac Family)
// =============================================================================

class MacButton implements Button {
  @Override
  public void render() {
    System.out.println("[Mac] 둥근 모서리와 그라데이션이 들어간 스페이스 그레이 버튼을 화면에 그립니다.");
  }

  @Override
  public void onClick() {
    System.out.println("[Mac] 부드러운 햅틱 피드백 애니메이션과 함께 클릭 이벤트를 처리합니다.");
  }
}

class MacTextField implements TextField {
  @Override
  public void display() {
    System.out.println("[Mac] 샌프란시스코 폰트와 그림자 효과가 적용된 입력창을 표시합니다.");
  }

  @Override
  public void handleInput(String text) {
    System.out.println("[Mac] 보안 키보드 모듈을 거쳐 '" + text + "' 텍스트를 안전하게 입력받았습니다.");
  }
}

// =============================================================================
// 3. 추상 팩토리 인터페이스 (Abstract Factory Interface)
// - 연관된 모든 추상 제품들을 생성하는 메서드들의 집합
// =============================================================================
interface GUIFactory {
  Button createButton();

  TextField createTextField();
}

// =============================================================================
// 4. 구체적인 팩토리들 (Concrete Factories)
// - 특정 제품군(Family)의 부품들을 책임지고 한꺼번에 일관성 있게 생산함
// =============================================================================

// Windows 전용 부품 공장
class WinFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new WinButton(); // Windows 전용 버튼 생산
  }

  @Override
  public TextField createTextField() {
    return new WinTextField(); // Windows 전용 텍스트필드 생산
  }
}

// Mac 전용 부품 공장
class MacFactory implements GUIFactory {
  @Override
  public Button createButton() {
    return new MacButton(); // Mac 전용 버튼 생산
  }

  @Override
  public TextField createTextField() {
    return new MacTextField(); // Mac 전용 텍스트필드 생산
  }
}

// =============================================================================
// 5. 클라이언트 어플리케이션 (Client Application)
// - 구체적인 클래스에 의존하지 않고 오직 추상 팩토리와 추상 제품 인터페이스로만 소통
// =============================================================================
class Application {
  private final Button button;
  private final TextField textField;

  // 생성자 주입을 통해 어떤 팩토리든 다 수용 가능함 (느슨한 결합)
  public Application(GUIFactory factory) {
    // 공장에서 세트로 구성된 부품들을 납품받음
    this.button = factory.createButton();
    this.textField = factory.createTextField();
  }

  // 시스템 실행 (조립된 부품들의 상호작용)
  public void createUI() {
    System.out.println("[시스템] UI 렌더링 파이프라인 가동...");
    button.render();
    textField.display();
  }

  public void simulateUserAction() {
    System.out.println("\n[시스템] 사용자 시뮬레이션 가동...");
    textField.handleInput("Hello Functional Design Patterns");
    button.onClick();
  }
}

// =============================================================================
// 6. 메인 실행 클래스
// =============================================================================
public class Main {
  public static void main(String[] args) {
    System.out.println("=== 추상 팩토리 패턴 시스템 가동 ===\n");

    // 운영체제 환경 감지 시뮬레이션 (여기선 동적으로 설정을 바꾼다고 가정)
    String osName = "MAC"; // 또는 "WINDOWS"
    GUIFactory currentOSFactory;

    // 1. 런타임 시점에 환경 설정에 맞는 공장을 동적으로 딱 한 번 결정함
    if (osName.equalsIgnoreCase("WINDOWS")) {
      currentOSFactory = new WinFactory();
    } else if (osName.equalsIgnoreCase("MAC")) {
      currentOSFactory = new MacFactory();
    } else {
      throw new IllegalArgumentException("지원하지 않는 운영체제 환경입니다.");
    }

    // 2. 어플리케이션은 공장이 Windows용인지 Mac용인지 알 필요 없이 주입만 받아서 작동함
    Application app = new Application(currentOSFactory);

    // 3. 실행 결과 확인
    app.createUI();
    app.simulateUserAction();
  }
}