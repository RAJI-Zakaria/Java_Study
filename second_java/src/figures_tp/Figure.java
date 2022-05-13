package figures_tp;


/**
 *
 * @author RAJI Zakaria
 */

abstract class Figure
{
	/* variables de classe */
	static final double pi=3.14159;

        /* methodes */
	abstract double perimetre();
	abstract double surface();
	abstract void zoom(double e);
}
    