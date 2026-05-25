import java.util.ArrayList;
import java.util.Scanner;

class Aresta {

    String origem;
    String destino;

    public Aresta(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> vertices = new ArrayList<>();

        ArrayList<Aresta> arestas = new ArrayList<>();

        ArrayList<String> cobertura = new ArrayList<>();

        System.out.println("=== Simulação de War Room com Grafos ===");

        System.out.print("Quantidade de vértices: ");
        int qtdVertices = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < qtdVertices; i++) {

            System.out.print("Vértice " + (i + 1) + ": ");
            String vertice = scanner.nextLine();

            vertices.add(vertice);
        }

        System.out.print("\nQuantidade de arestas: ");
        int qtdArestas = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < qtdArestas; i++) {

            System.out.println("\nAresta " + (i + 1));

            System.out.print("Origem: ");
            String origem = scanner.nextLine();

            System.out.print("Destino: ");
            String destino = scanner.nextLine();

            arestas.add(new Aresta(origem, destino));
        }

        while (!arestas.isEmpty()) {

            String melhorVertice = "";
            int maiorFrequencia = 0;

            for (String vertice : vertices) {

                int frequencia = 0;

                for (Aresta aresta : arestas) {

                    if (aresta.origem.equals(vertice)
                            || aresta.destino.equals(vertice)) {

                        frequencia++;
                    }
                }

                if (frequencia > maiorFrequencia) {

                    maiorFrequencia = frequencia;
                    melhorVertice = vertice;
                }
            }

            cobertura.add(melhorVertice);
          
            arestas.removeIf(aresta ->
                    aresta.origem.equals(melhorVertice)
                            || aresta.destino.equals(melhorVertice)
            );
        }

        System.out.println("\n=== Vertex Cover ===");

        System.out.println("Vértices escolhidos:");

        for (String vertice : cobertura) {
            System.out.println(vertice);
        }

        System.out.println("\nTamanho da cobertura: "
                + cobertura.size());

        System.out.println("\nComplexidade aproximada: O(V * E)");

        scanner.close();
    }
}
