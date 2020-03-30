package Strategy;

public enum TipoFilme{
    COMUM{
        public Filme precoFilme(){
            return new FilmeComum();
        }
    },
    RECENTE{
        public Filme precoFilme(){
            return new FilmeRecente();
        }
    },
    LANCAMENTO{
        public Filme precoFilme(){
            return new FilmeLancamento();
        }
    };

    public abstract Filme precoFilme();

}