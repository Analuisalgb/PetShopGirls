import java.util.*;
public class FilaDeBanho {
    private Pet[] fila;

    private int ocupado;

    private int banhados;

    private int valorTotal;

    private int max = 20;

    private int quantidadeDeBanhos;

    public FilaDeBanho() {
        this.fila = new Pet[max];
        ocupado = 0;
    }
    public String adicionaAFila(Pet pet){
        if (ocupado < max){
            fila[ocupado] = pet;
            return pet +" está adicionado na fila de banho!";
        }
        return "A fila ja está cheia! Tente novamente amanhã";
    }
    public String terminaBanho(Pet pet) {
        if (fila.temPet()) {
            int preco = pet.calculaValor();
            return pet + " já está pronto! O valor do banho do seu doguinho foi de: R$" + preco;
            valorTotal += preco;
        }
    }
    @Override
    public String toString() {
        return "De "+ ocupado + "pets, " +banhados+" já tomaram banho!";
    }

}