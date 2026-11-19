import java.util.List;

public class ImprimirLista {

    public static <T> void imprimirLista(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            System.out.println("(Lista vacía)");
            return;
        }
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 20, 30, 40);
        System.out.println("=== Lista de enteros ===");
        imprimirLista(numeros);

        List<String> palabras = List.of("Java", "Genéricos", "Programación III");
        System.out.println("\n=== Lista de cadenas ===");
        imprimirLista(palabras);
    }
}