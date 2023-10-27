/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Error;

/**
 *
 * @author Administrator
 */
public class LoginInsertError {
    private String invalid;

    public LoginInsertError() {
    
    }
    
    public LoginInsertError(String invalid) {
        this.invalid = invalid;
    }

    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }
    
    
}
