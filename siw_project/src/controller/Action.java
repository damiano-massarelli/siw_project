package controller;

import javax.servlet.http.HttpServletRequest;

public interface Action {
	public String execute(HttpServletRequest request);
}
