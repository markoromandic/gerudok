package action;

import java.awt.Image;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import constants.ViewConstants;
/**
 * Produbljuje AbstractAction. Podloga svim akcijama
 * @author Nemanja
 */
public abstract class AbstractEditorAction extends AbstractAction implements ViewConstants
{
	/**
	 * Ucitavanje ikone
	 * @author Nemanja
	 * @return
	 */
	public Icon loadIcon(String imageURL)
	{
		Icon icon = null;
		
		if (imageURL != null) 
		{       
			ImageIcon iconNotResized = new ImageIcon(imageURL);
			
			Image imgResizing =	iconNotResized.getImage();
			imgResizing = imgResizing.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
			icon = new ImageIcon(imgResizing);
	    } 
		else 
	    {                                     
	        System.err.println(RESOURCE_NOT_FOUND_SYSTEM + imageURL);
	    }

		return icon;
	}
}
