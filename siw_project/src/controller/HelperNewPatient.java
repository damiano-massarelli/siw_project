package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelperNewPatient {
	public boolean validate(HttpServletRequest request, HttpServletResponse response) {
		String nome, cognome, email, password;
		String nomeError, cognomeError, emailError, passwordError;
		boolean corretto = true;
		
		
		nome = request.getParameter("nome");
		cognome = request.getParameter("cognome");
		email = request.getParameter("email");
		password = request.getParameter("password");
		
		if (nome == null || nome.equals("")) {
			corretto = false;
			nomeError = "Nome: campo obbligatorio";
			request.setAttribute("nomeError", nomeError);
		}
		
		if (cognome == null || cognome.equals("")) {
			corretto = false;
			cognomeError = "Cognome: campo obbligatorio";
			request.setAttribute("cognomeError", cognomeError);
		}
		
		if (email == null || email.equals("")) {
			corretto = false;
			emailError = "Email: campo obbligatorio";
			request.setAttribute("emailError", emailError);
		} else if (email.indexOf('@') == -1) {
			corretto = false;
			emailError = "Email: deve contenere \"@\"";
			request.setAttribute("emailError", emailError);
			}
		
		if (password == null || password.equals("")) {
			corretto = false;
			passwordError = "Password: campo obbligatorio";
			request.setAttribute("passwordError", passwordError);
		}
		if (!corretto) {
			request.setAttribute("success", false);
		}
		else request.setAttribute("success", true);
		
		return corretto;
	}
}
