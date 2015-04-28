package mediator;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BtnView extends JButton implements Command{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Mediator med;
	
	BtnView(ActionListener al,Mediator m){
		super("View");
		addActionListener(al);
		this.med = m;
		med.registerView(this);
	}
	@Override
	public void execute() {
		med.view();
	}

}
