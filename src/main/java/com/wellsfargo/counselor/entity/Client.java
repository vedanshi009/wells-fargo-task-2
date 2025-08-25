package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String objective;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phone;

    protected Client() {
    }

    public Client(String name, String objective, String email, String phone) {
        this.name = name;
        this.objective = objective;
        this.email = email;
        this.phone = phone;
    }

    public Long getClientId() { return clientId; }

    public String getName() { return name; }
    public String getObjective() { return objective; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public void setName(String name) { this.name = name; }
    public void setObjective(String objective) { this.objective = objective; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }


}
