package com.example.jatuncar.notesapp.repositories;

import com.example.jatuncar.notesapp.models.Notes;
import com.orm.SugarRecord;

import java.util.List;

public class NotesRepository {

    public static List<Notes> list(){
        List<Notes> notes = SugarRecord.listAll(Notes.class);
        return notes;
    }
    public static Notes read (Long id){
        Notes notes = SugarRecord.findById(Notes.class,id);
        return notes;
    }
    public static void create( Long id_user, String titulo, String contenido)
    {
        Notes user = new Notes(id_user,titulo,contenido);
        SugarRecord.save(user);
    }
    public static void update(Long id, Long id_user, String titulo, String contenido)
    {
        Notes notes = read(id);
       notes.setId_user(id_user);
       notes.setTitulo(titulo);
       notes.setContenido(contenido);
        SugarRecord.save(notes);
    }
    public static void delete (Long id)
    {
        Notes notes = read(id);
        SugarRecord.delete(notes);
    }
}
