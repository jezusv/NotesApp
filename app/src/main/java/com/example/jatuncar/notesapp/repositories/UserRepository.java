package com.example.jatuncar.notesapp.repositories;

import android.util.Log;

import com.example.jatuncar.notesapp.models.User;
import com.orm.SugarRecord;

import java.util.List;

public class UserRepository {

    public static List<User> list(){
        List<User> users = SugarRecord.listAll(User.class);
        return users;
    }

    public static User devuelve_user (String usuario, String contrasena){
      List<User> users =  SugarRecord.find(User.class,"usuario = ? and contrasena = ?",usuario,contrasena);

      for(User user :users)
      {
            Log.d("USERREPOSITORY", user.getId().toString());
          return  user;
      }
      return  null;
    }

    public static User read (Long id){
        User user = SugarRecord.findById(User.class,id);
        return user;
    }
    public static void create( String usuario,String nombres_completos,String correo_electronico,String contraseña)
    {
        User user = new User(usuario,nombres_completos,correo_electronico,contraseña);
        SugarRecord.save(user);
    }
    public static void update( Long id, String usuario,String nombres_completos,String correo_electronico,String contraseña)
    {
        User user = read(id);
        user.setUsuario(usuario);
        user.setNombres_completos(nombres_completos);
        user.setCorreo_electronico(correo_electronico);
        user.setContraseña(contraseña);
        SugarRecord.save(user);
    }
    public static void delete (Long id)
    {
        User user = read(id);
        SugarRecord.delete(user);
    }
}
