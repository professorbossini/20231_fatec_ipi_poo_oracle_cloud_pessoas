import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.JSONArray;
import org.json.JSONObject;

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
    JSONObject raiz = new JSONObject(res.body());
    JSONArray items = raiz.getJSONArray("items");
    for (int i = 0; i < items.length(); ++i){
      JSONObject pessoa = items.getJSONObject(i);
      //exibir o nome da pessoa
      //a cahve é nome
      //o valor é uma string
      String nome = pessoa.getString("nome");
      System.out.println(nome);  
    }
    
  }

}
