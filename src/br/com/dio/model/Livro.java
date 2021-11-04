package br.com.dio.model;

import java.util.Objects;

public class Livro {
        private final String nome;
        private final Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString () {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas =" + numPaginas +
                    '}';

        }
    }

