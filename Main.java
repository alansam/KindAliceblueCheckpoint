
public class Main {
  public static int classScope = 10;

	public static void main(String[] args) {
		System.out.println("classScope: " + classScope);
    Main lm = new Main();
    classScope *= 10;
    lm.fun1();
		System.out.println("classScope: " + classScope);
    classScope *= 10;
    lm.fun1();
		System.out.println("classScope: " + classScope);

		return;
	}

  public void fun1() {
		System.out.println("classScope: " + classScope);
    classScope = 42;
		System.out.println("classScope: " + classScope);

    return;
  }
}
