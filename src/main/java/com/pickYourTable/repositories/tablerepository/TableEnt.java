package com.pickYourTable.repositories.tablerepository;

import com.pickYourTable.repositories.restaurantrepository.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TABLES")
public class TableEnt {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @JoinColumn(name="restaurantId")
    private Restaurant restaurantId;

    @Column(name = "NUMBER_OF_PEOPLE")
    private Integer numberOfPeople;

    @Column(name = "NUMBER_OF_TABLES")
    private Integer numberOfTables;
}
