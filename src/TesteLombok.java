public class TesteLombok {
  public static void main(String[] args) {
    var p = new Pessoa(1, "Ana", "Ver filme", 17);
    // p.setNome("Ana");
    System.out.println(p.getNome());  
  }
}
