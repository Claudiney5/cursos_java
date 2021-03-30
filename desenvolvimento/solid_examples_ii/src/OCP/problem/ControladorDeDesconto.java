package OCP.problem;

public class ControladorDeDesconto {

    public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil) {
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }

    public void adicionaDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda) {
        descontoLivroAutoAjuda.valorDescontoLivroAutoAjuda();
    }

    public void adicionaDescontoLivroFiccao(DescontoLivroFiccao descontoLivroDeFiccao) {
        descontoLivroDeFiccao.valorDescontoLivroFiccao();
    }

    /*Sempre que tivermos que adicionar novo tipo de desconto teremos
    * que adicionar novo método, alterando a classe!!
    */
}
