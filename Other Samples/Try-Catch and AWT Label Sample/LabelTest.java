import java.awt.*;
import java.applet.*;
public class LabelTest extends Applet
{
	public void init()
	{
		setFont(new Font("Helvetica",Font.BOLD,14));
		Label lblLeft = new Label("aligned left",Label.LEFT);
		Label lblRight = new Label("aligned right",Label.RIGHT);
		Label lblCenter = new Label("aligned center",Label.CENTER);
		add(lblLeft);
		add(lblRight);
		add(lblCenter);
	}
}