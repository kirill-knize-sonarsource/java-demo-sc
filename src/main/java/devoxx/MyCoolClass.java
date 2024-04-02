package devoxx;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MyCoolClass {

  public static void main(String[] args) throws IOException {
    URL url = new URL("https://repox.jfrog.io/ui/native/sonarsource/org/sonarsource/sonarlint/core/sonarlint-core/9.8.0.76880/sonarlint-core-9.8.0.76880.pom");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    System.out.println(con.getResponseCode());
  }

  void foo () {
    String fileContent = "" +
      "public class Foo {\n" +
      "  public static final String KEY = \"AKIAIGKECZXA7AEIJLMQ\"\n" +
      "}";
    int i = 0;
    // TODO do stuff
    System.out.println(fileContent);
  }

}
