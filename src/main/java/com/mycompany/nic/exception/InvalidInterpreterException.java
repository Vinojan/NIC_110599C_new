/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nic.exception;

/**
 *
 * @author Vinojan
 */
public class InvalidInterpreterException extends Exception {
    private static final long serialVersionUID = 1L;

	public InvalidInterpreterException() {
		super("Invalid NIC number is entered.");
	}
}
