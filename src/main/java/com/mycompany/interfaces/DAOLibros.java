package com.mycompany.interfaces;

import com.mycompany.models.Libros;
import java.util.List;

public interface DAOLibros {
    public void registrar(Libros book) throws Exception;
    public void modificar(Libros book) throws Exception;
    public void eliminar(int bookId) throws Exception;
    public List<Libros> listar(String title) throws Exception;
    public Libros getBookById(int bookId) throws Exception;
}
