import java.io.FileInputStream;
import java.util.Properties;

public class TesteProperties {
  public static void main(String[] args) throws Exception {
    var properties = new Properties();
    properties.load(new FileInputStream("src/app.properties"));
    String url = properties.getProperty("URL");
    System.out.println(url);
  }
}
