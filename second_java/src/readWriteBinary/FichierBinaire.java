package readWriteBinary;

import java.io.*;

public class FichierBinaire 
{
	private String pathFic;
	private FileOutputStream fichier_out;
	private ObjectOutputStream flux_out;
	private FileInputStream fichier_in;
	private ObjectInputStream flux_in;
	
	public FichierBinaire(String pathFic)
	{
		this.pathFic = pathFic;
	}
	
	public void ouvertureEcriture() throws FileNotFoundException,IOException
	{	
		this.fichier_out = new FileOutputStream(this.pathFic);
		this.flux_out = new ObjectOutputStream(this.fichier_out);
	}
	
	public void ouvertureLecture() throws FileNotFoundException,IOException
	{	
		this.fichier_in = new FileInputStream(this.pathFic);
		this.flux_in = new ObjectInputStream(this.fichier_in);
	}
	
	public void ecrireObjet(Object o) throws IOException
	{
		this.flux_out.writeObject(o);
	}
	
	public Object lireObjet() throws IOException,ClassNotFoundException
	{
		return this.flux_in.readObject();
	}

	public void fermetureEcriture() throws IOException
	{	
		this.flux_out.close();
		this.fichier_out.close();
	}
	
	public void fermetureLecture() throws IOException
	{	
		this.flux_in.close();
		this.fichier_in.close();
	}
}