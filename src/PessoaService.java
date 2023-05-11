import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class PessoaService {
  private HttpClient client = HttpClient.newHttpClient();
  private String url = "https://g7b6e620787d151-s2204lud7dpmx4b7.adb.us-ashburn-1.oraclecloudapps.com/ords/admin/tb_pessoa/";

  public void listar() throws Exception{
    var req = 
      HttpRequest.newBuilder()
      .uri(URI.create(url))
      .build();
    var res = client.send(req, BodyHandlers.ofString());
    System.out.println(res.body());
    
  }

}
