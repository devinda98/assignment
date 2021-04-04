package com.nsbm.dea.assignment.service;

import com.nsbm.dea.assignment.model.Lend;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LendService {

    //@Query("SELECT b. FROM Book b WHERE b.name LIKE %?1%" + " OR b.isbn LIKE %?1%" + " OR b.serialName LIKE %?1%")
    public List<Lend> isBookAvailable(String keyword);

    //@Query("SELECT count() FROM Lend b WHERE b.name LIKE %?1%" + " OR b.isbn LIKE %?1%" + " OR b.serialName LIKE %?1%")
    public void getStatusByUser(Long uid);
    public List<Lend> findAllLend();

    public Lend findLendById(Long id);

    public void createLend(Lend lend);

    public void updateLend(Lend lend);

    public void deleteLend(Long id);

}
