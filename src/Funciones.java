import java.util.*;

public class Funciones {

    public int devolverInt(String numCadena) {

        String corregido = numCadena.trim().toLowerCase().replaceAll("(.)\\1", "$1");
        numCadena = corregido.trim().toLowerCase().replaceAll("(.)\\1", "$1");
        
        if (numCadena.equals("uno")) return 1;

        if (numCadena.equals("dos")) return 2;

        if (numCadena.equals("tres")) return 3;

        if (numCadena.equals("cuatro")) return 4;
        
        if (numCadena.equals("cinco")) return 5;

        if (numCadena.equals("seis")) return 6;

        if (numCadena.equals("siete")) return 7;

        if (numCadena.equals("ocho")) return 8;

        if (numCadena.equals("nueve")) return 9;

        return 0;

    }

    public ArrayList<Integer> devolverArrayList(String numCadena) {

        ArrayList<Integer> valores = new ArrayList<Integer>();

        String corregido = numCadena.trim().toLowerCase().replaceAll("(.)\\1", "$1");
        numCadena = corregido.trim().toLowerCase().replaceAll("(.)\\1", "$1");

        String[] palabras = numCadena.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {

            if (palabras[i].equals("cero") || palabras[i].equals("0")) valores.add(0);
            
            if (palabras[i].equals("uno") || palabras[i].equals("1")) valores.add(1);

            if (palabras[i].equals("dos") || palabras[i].equals("2")) valores.add(2);

            if (palabras[i].equals("tres") || palabras[i].equals("3")) valores.add(3);

            if (palabras[i].equals("cuatro") || palabras[i].equals("4")) valores.add(4);

            if (palabras[i].equals("cinco") || palabras[i].equals("5")) valores.add(5);

            if (palabras[i].equals("seis") || palabras[i].equals("6")) valores.add(6);

            if (palabras[i].equals("siete") || palabras[i].equals("7")) valores.add(7);

            if (palabras[i].equals("ocho") || palabras[i].equals("8")) valores.add(8);

            if (palabras[i].equals("nueve") || palabras[i].equals("9")) valores.add(9);

        }

        return valores;

    }
    
    public List<Double> valoresProporcionales(List<Integer> array, int num) {

        double suma = 0;
        double proporcional;
    
        List<Double> resultado = new ArrayList<Double>();;

        for (int i = 0; i < array.size(); i++) {

            suma = suma + array.get(i);

        }

        for (int i = 0; i < array.size(); i++) {

            proporcional = (array.get(i) * num) /  suma;
            
            double decimales = decimales(proporcional);

            resultado.add(decimales);

        }
        
        return resultado;
        
    }

    public double decimales (double valor) {

        return Math.floor(valor * 100) / 100d;

    }

    public List<Double> cadenaProporcionalidad(String cadena, int num) {

        ArrayList<Integer> valores = devolverArrayList(cadena);

        List<Double> resultado = valoresProporcionales(valores, num);

        return resultado;

    }

}
