package chapter15.exampleException;

import chapter15.exampleException.entities.CartaoDeCredito;
import chapter15.exampleException.entities.Usuario;

import java.time.LocalDate;

public class application {
    public static void main(String[] args) {
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito("Mário E Alvial", "5152877727714129", "317", LocalDate.of(2019, 6, 9));
        Usuario usuario = new Usuario("Mário Sérgio Esteves Alvial", "75475962820");
        System.out.println(cartaoExistente(cartaoDeCredito, usuario));
    }
    public static boolean cartaoExistente(CartaoDeCredito cartaoDeCredito, Usuario usuario){
       if(usuario.getCartoes() != null){
           for (CartaoDeCredito cartao : usuario.getCartoes()) {
               if(cartaoDeCredito.getNumero().equals(cartao.getNumero())){
                   return false;
               }
           }
       }
        return true;
    }
}
