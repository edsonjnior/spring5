package spring5.spring5webapp.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Publisher implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @EqualsAndHashCode.Include
    private Long id;

    private String name;

    private String address;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
