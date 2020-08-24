/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inter;

/**
 *
 * @author alfon
 */
 import Simbolos.*;
 public class If extends Instr {
 Expr expr; Instr instr;
 public If(Expr x, Instr s) {
 expr = x; instr = s;
 if( expr.tipo != Tipo.Bool ) expr.error("se requiere booleano en if");
 }
 public void gen(int b, int a) {
 int etiqueta = nuevaEtiqueta(); // etiqueta para el codigo de instr
 expr.salto(0, a); // pasa por alto en true, va hacia a en false
 emitirEtiqueta(etiqueta); instr.gen(etiqueta, a);
 }
} 