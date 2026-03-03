package controller;

import model.Libreria;
import model.Libro;
import model.Personaje;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Gestor {
    public void exportarXML(){
        Libreria libreria=new Libreria();
        Libro libro1=new Libro(1994,123123,100,"Libro1","Escritor1","Ciencia Ficion");
            libro1.getPersonajes().add(new Personaje("PLibro1","Principal"));
            libro1.getPersonajes().add(new Personaje("PLibro1","Principal"));
            libro1.getPersonajes().add(new Personaje("PLibro1","Secundario"));

        Libro libro2=new Libro(2000,234234,200,"Libro2","Escritor2","Narrativa");
            libro2.getPersonajes().add(new Personaje("PLibro2","Principal"));
            libro2.getPersonajes().add(new Personaje("PLibro2","Principal"));

        Libro libro3=new Libro(2020,345345,300,"Libro3","Escritor3","Humor");
            libro1.getPersonajes().add(new Personaje("PLibro1","Principal"));
        libreria.getBooks().add(libro1);
        libreria.getBooks().add(libro2);
        libreria.getBooks().add(libro3);

        try {
            JAXBContext context=JAXBContext.newInstance(Libreria.class);
            //la forma en la que se hace el xml
            Marshaller marshaller=context.createMarshaller();
            marshaller.marshal(libreria,new File("src/main/java/ficherossrc/main/java/ficheros/libreria.xml"));
        } catch (JAXBException e) {
            System.out.println("Herror en los atributos del xml");
        } catch (Exception e) {
            System.out.println("Error en la gestio del fichero");
        }
    }
}
