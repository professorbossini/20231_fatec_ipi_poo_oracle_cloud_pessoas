import java.util.Properties;

import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        var properties = new Properties();
        properties.load(new FileInputStream("src/app.properties"));
        var service = 
            new PessoaService(properties.getProperty("URL"));
        service.listar();
    }
}
