package com.ssafy.pcgg.domain.recommend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;

@Entity
@Table(name="part_mainboard")
public class MainboardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

    @Getter
    private Integer price;

    @Column(name="image_source", length=100)
    private String imageSource;

    private Boolean extinct;

    @CreationTimestamp
    //@Column(name="changed_date", columnDefinition="DATE DEFAULT CURRENT_DATE")
    @Column(name="changed_date", nullable = false)
    private LocalDate changedDate;

    @Column(length=20, name="socket_info")
    private String grade;

    @Column(name="memory_spec", length=10)
    private String memorySpec;

    @Column(length=30)
    private String size;

    private Boolean pcie3;
    private Boolean pcie4;
    private Boolean pcie5;

    @Column(name = "m2_count")
    private Integer m2Count;

    @Column(name = "`class`", columnDefinition = "tinyint")
    private Integer classColumn;
}
