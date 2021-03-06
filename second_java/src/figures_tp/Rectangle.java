package figures_tp;

public class Rectangle extends Figure
{
    /* variable de classe */
	static int nb_instances=0; 
        
    /* variables d'instance */
	protected double largeur;

	private double hauteur;
	
    public Rectangle ()
    {
    }
   
    /*
     * Constructeur
     * @param l largeur
     * @param h hauteur
     */
	public Rectangle(double largeur,double hauteur)
	{
		this.largeur = largeur;
		this.hauteur = hauteur;
		nb_instances ++;
	}

	/*
	 * Constructeur depuis les coins sup�rieur gauche et inf�rieur droit
	 * @param XG abscisse du coin sup�rieur gauche
	 * @param YG ordonn�e du coin sup�rieur gauche
	 * @param XD abscisse du coin inferieur droit 
	 * @param YD ordonn�e du coin inferieur droit
	 */
	public Rectangle(double XG,double YG,double XD,double YD)
	{
		this.largeur = Math.abs(XG-XD);
		this.hauteur = Math.abs(YG-YD);
		nb_instances ++;
	}

	
	/*
	 * Hauteur
	 * @return hauteur
	 */
	public double hauteur()
	{
		return this.hauteur;
	}

	/*
	 * Largeur
	 * @return largeur
	 */
	public double largeur()
	{
		return this.largeur;
	}

	/*
	 * P�rimetre
	 * @return p�rim�tre
	 */
	public double perimetre()
	{
		return 2*(this.largeur+this.hauteur);
	}

	/*
	 * Surface
	 * @return surface
	 */
	public double surface()
	{
		return this.largeur*this.hauteur;
	}

	/*
	 * Zoom
	 * @param e �chelle
	 */
	public void zoom(double e)
	{
		this.largeur = this.largeur*e;
		this.hauteur = this.hauteur*e;
	}

	/*
	 * Diagonale
	 * @return diagonale
	 */
	public double diagonale()
	{
		return Math.sqrt(Math.pow(this.largeur,2)+Math.pow(this.hauteur,2));
	}
	
	/**********************************************************************************
	 * 
	 *                              Methodes de classe
	 *                              
	 *********************************************************************************/
	/*
	 * Nombre d'instances
	 * @return nombre d'instances
	 */
	static public int nb_instances()
	{
		return nb_instances;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	
}
