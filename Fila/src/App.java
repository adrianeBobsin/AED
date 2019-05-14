public class App {
    public static void main(String args[]) {
        Fila fila = new Fila();

        //Insere elementos na fila:
        fila.add(10);
        fila.add(20);
        fila.add(30);
        fila.add(40);
        fila.add(50);

        //Exibe os elementos da fila:
        System.out.println("Elementos da fila: "+ fila.toString());

        //Enquanto houverem elementos, permanece excluindo:
        while(!fila.isEmpty()) {
            System.out.println("Elemento excluído: "+fila.remove());
        }

    }
}
