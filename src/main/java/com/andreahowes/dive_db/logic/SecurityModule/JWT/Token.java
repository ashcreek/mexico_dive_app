package com.andreahowes.dive_db.logic.SecurityModule.JWT;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "token")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
