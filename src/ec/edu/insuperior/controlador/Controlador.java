/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.insuperior.controlador;

import ec.edu.insuperior.vista.FrmAdministrativo;
import ec.edu.insuperior.vista.FrmEstudiante;
import ec.edu.insuperior.vista.FrmLoggin;
import ec.edu.insuperior.vista.FrmProfesor;



/**
 *
 * @author Administrador
 */
public class Controlador {
    FrmAdministrativo frmadministrativo=new FrmAdministrativo(this);
    FrmEstudiante frmestudiante=new FrmEstudiante(this);
    FrmLoggin frmloggin=new FrmLoggin(this);
    FrmProfesor frmprofesor=new  FrmProfesor(this);

    public void mostarFrmAdministrativo(){
        frmadministrativo.setVisible(true);
        }
    public void mostarFrmEstudiante(){
        frmestudiante.setVisible(true);
    }
    public void mostrarFrmLoggin(){
        frmloggin.setVisible(true);
    }
    public void mostarFrmProfesor(){
        frmprofesor.setVisible(true);
    }
}
