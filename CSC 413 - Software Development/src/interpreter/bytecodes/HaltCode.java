/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter.bytecodes;

import interpreter.VirtualMachine;
import java.util.*;

/**
 *
 * @author Parker
 */
public class HaltCode extends ByteCode {
    public void init(ArrayList<String> args) {}
    
    public void execute(VirtualMachine vm) {
        vm.setRunning(false);
    }
    
    public String toString() {
        return "HALT";
    }
}
