package lesson5.labsolns.prob3.callback.control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;

import lesson5.labsolns.prob3.callback.data.*;
import lesson5.labsolns.prob3.callback.ui.*;

public enum Control {
	INSTANCE;
	Start start;
	Grades grades;
	Login login;
	String username;
	Remarks remarks;
	private boolean isLoggedIn = false;
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean b) {
		isLoggedIn = b;
	}
	
	public void setStart(Start st) {
		this.start = st;
	}
	public void backToStart(JFrame frame) {
		frame.setVisible(false);
		start.setMessage("");
		start.setVisible(true);
	}
	
	class LoginListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			login = new Login();
			start.setVisible(false);
			login.setVisible(true);
		}
	}
	class RemarksListener implements ActionListener, Callback {
		public void performAction() {
			remarks = new Remarks();
			
			HashMap<String, String> rem 
				= Data.dataMap.get(username).getTeacherRemarks();
			StringBuilder sb = new StringBuilder();
			for(String key : rem.keySet()) {
				sb.append(key + " : " + rem.get(key) + "\n");
			}
			remarks.setRemarks(sb.toString());
			remarks.setTitle("Teacher Remarks for " + username);
			remarks.setHeading("Teacher Remarks for " + username);
			Control.INSTANCE.start.setMessage("");
			Control.INSTANCE.start.setVisible(false);
			remarks.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt) {
			if(isLoggedIn) {
				performAction();
			} else {
				login = new Login(this);
				start.setVisible(false);
				login.setVisible(true);
			}
		}

	}
	class GradesListener implements ActionListener, Callback {
		public void performAction() {
			grades = new Grades();
			HashMap<String, String> gr 
				= Data.dataMap.get(username).getGrades();
			StringBuilder sb = new StringBuilder();
			for(String key : gr.keySet()) {
				sb.append(key + " : " + gr.get(key) + "\n");
			}
			grades.setGrades(sb.toString());
			grades.setTitle("Grades for " + username);
			grades.setHeading("Grades for " + username);
			Control.INSTANCE.start.setMessage("");
			Control.INSTANCE.start.setVisible(false);
			grades.setVisible(true);
		}
		public void actionPerformed(ActionEvent evt) {
			if(isLoggedIn) {
				performAction();
			} else {
				login = new Login(this);
				start.setVisible(false);
				login.setVisible(true);
			}
		}

	}
	class SubmitLoginListener implements ActionListener {
		SubmitLoginListener(Callback handler) {
			this.callbackHandler = handler;
		}
		private Callback callbackHandler;
		public void actionPerformed(ActionEvent evt) {
			String username = login.getUserName();
			String password = login.getPassword();
			if(!Logins.foundUserNamePwd(username, password)) {
				login.setMessage("Login failed.");
			} else {
				Control.this.username = username;
				Control.this.isLoggedIn = true;
				if(callbackHandler == null) { //no callback behavior needed
					login.setMessage("Successful login");
				} else { //invoke callbackHandler
					login.setVisible(false);
					callbackHandler.performAction();
				}
			}
		}
	}
	
	class LogoutListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			Control.this.username = null;
			Control.this.isLoggedIn = false;
			start.setMessage("Successfully logged out");
		}
	}
	public LogoutListener getLogoutListener() {
		return new LogoutListener();
	}
	public SubmitLoginListener getSubmitLoginListener(Callback callback) {
		return new SubmitLoginListener(callback);
	}
	public LoginListener getLoginListener() {
		return new LoginListener();
	}
	public RemarksListener getRemarksListener() {
		return new RemarksListener();
	}
	public GradesListener getGradesListener() {
		return new GradesListener();
	}
}
