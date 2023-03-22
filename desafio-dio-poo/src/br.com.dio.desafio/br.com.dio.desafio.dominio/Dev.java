
public class Dev {

    private String nome;
    //Set NÃO PERMITE ELEMENTOS DUPLICADOS
    private Set<Conteudo> conteudosInscristos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudoInscritos() {
        return conteudosInscristos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudosInscristos) {
        this.conteudosInscristos = conteudosInscristos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootCamp(Bootcamp bootcamp) {
        //addAll adiciona todos os elementos de uma coleção em outra coleção
        this.getConteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.getConteudoInscritos().stream().findFirst();
        if (conteudo.isPresent()) {
            this.getConteudoConcluidos.add(conteudo.get());
            this.getConteudoInscritos.remove(conteudo.get());
        }
        else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.getConteudoConcluidos().stream().mapToDouble(conteduo::calcularXp).sum();
    }

    //CRIAR E EQUALS E HASHCODE

}