import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Funciones fn = new Funciones();

        System.out.println(" unnO es igual a " + fn.devolverInt(" unnO "));

        System.out.println(" uUno  DoOS es igual a " + fn.devolverArrayList(" uUno  DoOS "));

        List<Integer> array = new ArrayList<Integer>(List.of(1, 2, 3));
        System.out.println(fn.valoresProporcionales(array, 60) + " es proporcional a [1, 2, 3]");

        System.out.println(fn.cadenaProporcionalidad(" Doos   1  TrRes   CUAaaaTRO  ", 100) + " es proporcional a Doos 1 TrRes CUAaaaTRO");

    }
}
