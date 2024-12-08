package org.mountblue;

import javax.persistence.*; 


@Entity
@Table(name="AdminInfo")
public class AdminPojo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;
    private String name;
    private String email;
    private String password;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email) {
        this.email= email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
}
