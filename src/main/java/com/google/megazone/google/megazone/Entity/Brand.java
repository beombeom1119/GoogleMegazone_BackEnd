package com.google.megazone.google.megazone.Entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@Table(name="whatbrand")        ///TABLE 명과 Entity 이름이 다를때
public class Brand {

    @GeneratedValue
    @Id
    private Long no1;

    @Column
    private String name;

    @Column
    private Long count;

    public Brand()
    {

    }

    @Override
    public String toString() {
        return "Brand{" +
                "no1=" + no1 +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public Brand(Long id, String name, Long count) {
        this.no1 = id;
        this.name = name;
        this.count = count;
    }
}
