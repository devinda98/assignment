package com.nsbm.dea.assignment.service.Impl;

import com.nsbm.dea.assignment.model.Lend;
import com.nsbm.dea.assignment.persitence.LendRepository;
import com.nsbm.dea.assignment.service.LendService;

import java.util.List;

public class LendServiceImpl implements LendService {
    private final LendRepository lendRepository;

    public LendServiceImpl(LendRepository lendRepository) {

        this.lendRepository = lendRepository;
    }
    @Override
    public List<Lend> isBookAvailable(String isbn) {
        return null;
    }

    @Override
    public void getStatusByUser(Long uid) {

    }

    @Override
    public List<Lend> findAllLend() {

        return null;
    }

    @Override
    public Lend findLendById(Long id) {

        return null;
    }

    @Override
    public void createLend(Lend lend) {

    }

    @Override
    public void updateLend(Lend lend) {

    }

    @Override
    public void deleteLend(Long id) {

    }

}
