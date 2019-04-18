package com.amos.tenant.management.infrastructure.persistence.entities.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;
import java.util.Objects;

@MappedSuperclass
@Getter
@Setter
public  abstract class JpaEntityAbstract<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private T id;

    @JsonIgnore
    @CreatedDate
    private LocalDate createdDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JpaEntityAbstract)) return false;
        JpaEntityAbstract<?> that = (JpaEntityAbstract<?>) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCreatedDate());
    }
}
