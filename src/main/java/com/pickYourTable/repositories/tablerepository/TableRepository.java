package com.pickYourTable.repositories.tablerepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends CrudRepository<TableEnt, Long> {
}
