import java.util.function.Consumer;

class Test {
  void foo(String s) {
    if (true) {
        Consumer<String> stringConsumer = new Consumer<String>() {
            public void accept(String s) {
                System.out.println("Hello, world " + s);
            }
        };
        stringConsumer.accept(s);
    }
  }
}