/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nic;

/**
 *
 * @author Vinojan
 */
public class Interpreter {
    private final String birthday;
    private final String gender;
    private final String isVoter;
    Interpreter(String birthday,String gender,String isVoter){
        this.birthday=birthday;
        this.gender=gender;
        this.isVoter=isVoter;
    }
    
    public String getBirthday() {
		return birthday;
	}

	public String getGender() {
		return gender;
	}
        public String getIsVoter() {
		return isVoter;
	}
	
}
