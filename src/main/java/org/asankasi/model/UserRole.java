package org.asankasi.model;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole {
    @Id
    @Column(name = "role_id")
    private long id;
    @Column(name = "role_name")
    private String roleName;

    public long getId() {
        return id;
    }

    public String getRoleName() {
        return roleName;
    }
}
