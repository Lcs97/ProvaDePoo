package org.serratec.poo.classs;

public abstract class Artista {
    protected String nome;
    protected GeneroMusical genero;
    protected double cache;
    
    

    public Artista(String nome, GeneroMusical genero, double cache) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.cache = cache;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

}
