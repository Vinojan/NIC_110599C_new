/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nic;

import com.mycompany.nic.exception.InvalidInterpreterException;

/**
 *
 * @author Vinojan
 */
public class NICInterpreter {
          int months[]={31,29,31,30,31,30,31,31,30,31,30,31};
   	public Interpreter createInterpreter(String nicno) throws InvalidInterpreterException {
		try {
                        String gender;
                        String days=nicno.substring(2,5);
                        int day=Integer.parseInt(days);
                        if(day<500){
                            gender="MALE";
                        }
                        else{
                            gender="FEMALE";
                        }
                        
                        String byear=nicno.substring(0,2);
                        byear="19"+byear;
                        try{
                             int year=Integer.parseInt(byear);
                        }
                         catch(NumberFormatException f){
                                System.out.println("Invalid year");
                         }
                        String voter=nicno.substring(9);
                        String isVoter;
                        if(voter.equalsIgnoreCase("v")){
                            isVoter="true";
                        }
                        else{
                            isVoter="false";
                        }
                        int temp=0;
                        int month=0;
                        int date=0;
                        if (day>500){
                            day=day-500;
                        
                        }
                        String birthday;
                         if(day<=366){ 
                                for(int i=0;i<12;i++){
                          
                                 temp=months[i];
                                 if(day<=temp){
                               month++;
                               date=day;
                               break;
                           }
                           else{
                               month++;
                               day-=months[i];
                           }
                    
                           }
                               birthday="Birthday[year="+byear+", month="+month+", date="+date+"],";
                         }
                           else{
                            birthday="can not find..   "  ; 
                            gender="can not find..   ";
                            throw new InvalidInterpreterException();
                           }
                        
                        
			return new Interpreter(birthday,gender,isVoter);
		} catch(Exception ex) {
			throw new InvalidInterpreterException();
		}
	}
	
	
	
	
}
