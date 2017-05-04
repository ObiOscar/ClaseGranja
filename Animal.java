
public abstract class Animal
{

    protected int vida;    
    protected int peso;
    private static final int PUNTOS_DE_VIDA = 100;
    
    public Animal(int peso)
    {
        this.vida = PUNTOS_DE_VIDA;
        this.peso = peso;
    }

    abstract void comer();
    
    abstract void emitirSonidoCaracteristico();
    
    public int getPeso()
    {
        return peso;
    }
    
    public int getPuntosDeVida()
    {
        return vida;
    }
    
}
