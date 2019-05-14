public class Fila {

    private int[] vet;
    private int head;
    private int tail;
    private int count;

    //Contrutor iniciando a fila:
    public Fila() {
        //Define tamanho da fila:
        vet = new int[5];
        //Inicia fila com nenhum elemento:
        head = 0;
        tail = 0;
        count = 0;
    }

    //Adiciona um elemento na fila:
    public void add(int element) {
        //Exceção para o caso de o vetor estar cheio:
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        }

        //Insere o elemento na última posição;
        vet[tail] = element;
        // Atualiza a ref. da última posição com o resto da divição da nova última posição pelo tamanho total do vetor
        tail = (tail + 1) % vet.length;
        // Atualiza o total de elementos para mais um:
        count++;
    }

    //Remove sempre a primeira posição
    public int remove() {
        //Se a fila estiver vazia, exibe erro em tela
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        // variável element recebe o elemento da primeira posição
        int element = vet[head];
        // atualiza a posição do primeiro elemento de forma que ele se reinicie toda vez que chegar ao fim do vetor
        head = (head + 1) % vet.length;
        //Retira um elemento do count
        count--;
        //Retorna o elemento que foi removido:
        return element;
    }

    public boolean isEmpty() {
        //Return com mesma funcionalidade condicional:
        return count == 0;
    }

    //Retorna verdade se o count (nº de elementos no vet) for igual ao tamanho total deste vetor
    public boolean isFull() {
        return count == vet.length;
    }


    public String toString() {
        String msg = " ";
        for (int i = head; i<count; i++) {
            msg += " "+vet[i];
        }
        return msg;
    }

}
