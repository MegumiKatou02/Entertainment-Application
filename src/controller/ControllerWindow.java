package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import view.SuperWindow;

public class ControllerWindow implements KeyListener{
	
	private SuperWindow superWindow;
	
	public ControllerWindow(SuperWindow superWindow) {
		this.superWindow = superWindow;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {

		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		String str = this.superWindow.textField.getText();
		if(code == KeyEvent.VK_ENTER) {
			if (str.matches("\\d+")) {
				int num = Integer.parseInt(str);
				if(num >= 100) {
					this.superWindow.answerLabel.setText("Bạn sắp chết rồi :)");
				}
				else if(num < 18) {
					this.superWindow.answerLabel.setText(num + " tuổi còn non trẻ");
				}
				
				else this.superWindow.answerLabel.setText("Siêu máy tính tính toán \nsố tuổi của bạn là " + str);
			}
			else {
				 this.superWindow.answerLabel.setText("Nhập ngu");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
