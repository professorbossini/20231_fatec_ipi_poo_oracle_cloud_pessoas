import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PessoaService {
  private HttpClient client = HttpClient.newHttpClient();
  private final String url;

  public void listar() throws Exception{
    var req = 
      HttpRequest.newBuilder()
      .uri(URI.create(url))
      .build();
    var res = client.send(req, BodyHandlers.ofString());
    System.out.println(res.body());
    
  }

}
