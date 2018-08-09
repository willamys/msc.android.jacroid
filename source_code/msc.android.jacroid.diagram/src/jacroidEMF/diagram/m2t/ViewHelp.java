package jacroidEMF.diagram.m2t;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ViewHelp extends ViewPart {

	public static final String ID = "jacroidEMF.diagram.m2t.ViewHelp";
	private Text text;

	public ViewHelp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		text = new Text(parent, SWT.BORDER | SWT.V_SCROLL);
		text.setText("");
	}

	@Override
	public void setFocus() {
		if(text != null) // NEW
			text.setFocus();
	}
	public void setInput(String parameter){
		  text.setText(parameter);
		 }

}
