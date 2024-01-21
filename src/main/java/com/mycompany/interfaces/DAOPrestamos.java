package com.mycompany.interfaces;

import com.mycompany.models.Libros;
import com.mycompany.models.Prestamos;
import com.mycompany.models.Usuarios;
import java.util.List;

public interface DAOPrestamos {
    public void registrar(Prestamos lending) throws Exception;
    public void modificar(Prestamos lending) throws Exception;
    public Prestamos getLending(Usuarios user, Libros book) throws Exception;
    // public void eliminar(Lendings user) throws Exception;
    public List<Prestamos> listar() throws Exception;
}
