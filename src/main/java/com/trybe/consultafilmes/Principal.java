package com.trybe.consultafilmes;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {

  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   */
  public static void main(String[] args) {
    Consultas consultas = new Consultas(Filmes.todos());

    Set<String> resultados = consultas.atoresQueInterpretaramSiProprios();
    System.out.println(resultados);

    List<String> atores =
        consultas.atoresQueAtuaramEmFilmesDoDiretorEmOrdemAlfabetica("Sylvester Stallone");
    System.out.println(atores);

    List<Filme> diretoresAtores =
        consultas.filmesEmQuePeloMenosUmDiretorAtuouMaisRecentesPrimeiro();
    System.out.println(diretoresAtores);

    Map<String, Set<Filme>> filmeCategoria =
        consultas.filmesLancadosNoAnoAgrupadosPorCategoria(1979);
    System.out.println(filmeCategoria);
  }
}
