
public class AbstractFactory {

    public static void main(String[] args) {

        Abstrato fabrica1 = new Concreta1();
        Cliente cliente1 = new Cliente(fabrica1);
        cliente1.executar();

        Abstrato fabrica2 = new Concreta2();
        Cliente cliente2 = new Cliente(fabrica2);
        cliente2.executar();
    }
}

class Cliente {
    private ProdutoAbstratoA produtoA;
    private ProdutoAbstratoB produtoB;

    Cliente(Abstrato fabrica) {
        produtoA = fabrica.createProdutoA();
        produtoB = fabrica.createProdutoB();
    }

    void executar() {
        produtoB.interagir(produtoA);
    }
}

interface Abstrato {
    ProdutoAbstratoA createProdutoA();
    ProdutoAbstratoB createProdutoB();
}

interface ProdutoAbstratoA {

}

interface ProdutoAbstratoB {
    void interagir(ProdutoAbstratoA a);
}

class Concreta1 implements Abstrato {

    @Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA1();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB1();
    }
}

class Concreta2 implements Abstrato {

    @Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA2();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB2();
    }
}

class ProdutoA1 implements ProdutoAbstratoA {

}

class ProdutoB1 implements ProdutoAbstratoB {

    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass()+ " interage com " + a.getClass());
    }

}

class ProdutoA2 implements ProdutoAbstratoA {

}

class ProdutoB2 implements ProdutoAbstratoB {

    @Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass() + " interage com " + a.getClass());
    }

}