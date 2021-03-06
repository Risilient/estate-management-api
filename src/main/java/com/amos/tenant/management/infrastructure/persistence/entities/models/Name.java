package com.amos.tenant.management.infrastructure.persistence.entities.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@Data
public class Name {
    String firstName;
    String lastName;
    String middleName;

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
}
