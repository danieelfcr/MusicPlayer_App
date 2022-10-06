/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class AdminData {
    private static String user, name, lastname, password, role, birthDate, email, phone, photoPath, status;
    private static AdminData admindata;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private AdminData(String user, String name, String lastname, String password, String role, String birthDate, String email, String phone, String photoPath, String status) {
        this.user = user;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.role = role;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.photoPath = photoPath;
        this.status = status;
    }

    public static AdminData Instance(String user, String name, String lastname, String password, String role, String birthDate, String email, String phone, String photoPath, String status) {
            admindata = new AdminData(user, name, lastname, password, role, birthDate, email, phone, photoPath, status);
            return admindata;
    }
    
    // metodos getter y setter
    public static String getUser()
    {
        return user;
    }
    public static String getName()
    {
        return name;
    }
    public static String getLastName()
    {
        return lastname;
    }
    public static String getPassword()
    {
        return password;
    }
    public static String getRole()
    {
        return role;
    }
    public static String getBirthDate()
    {
        return birthDate;
    }
    public static String getEmail()
    {
        return email;
    }
    public static String getPhone()
    {
        return phone;
    }
    public static String getPhotoPath()
    {
        return photoPath;
    }
    public static String getStatus()
    {
        return status;
    }
}
