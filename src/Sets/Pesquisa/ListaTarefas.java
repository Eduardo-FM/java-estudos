package sets.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    private void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    private void removerTarefa(String descricao){
        Tarefa tarefaRemovida = null;
        for(Tarefa t: tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemovida = t;
                break;
            }
        }
        tarefaSet.remove(tarefaRemovida);
    }

    private void exibirTarefa(){
        System.out.println(tarefaSet);
    }

    private int contarTarefas(){
        return tarefaSet.size();
    }

    private Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isFoiConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    private Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isFoiConcluida()) {
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
    }

    private void marcarTarefaConcluida(String descricao){
        for (Tarefa t: tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setFoiConcluida(true);
            }
        }
    }

    private void marcarTarefaPendente(String descricao){
        for (Tarefa t: tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setFoiConcluida(false);
            }
        }
    }

    private void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefa();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefa();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefa();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefa();
    }
}
