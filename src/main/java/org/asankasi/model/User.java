package org.asankasi.model;

import javax.persistence.*;

@Entity
@Table(name = "login_user")
public class User {
    @Id
    @Column(name = "user_id")
    private long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_password")
    private String password;
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    UserRole role;

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getRole() {
        return role;
    }

    public Boolean getActive() {
        return active;
    }
}
