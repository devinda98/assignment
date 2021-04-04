package com.nsbm.dea.assignment.service;

import com.nsbm.dea.assignment.model.Publisher;
import javassist.NotFoundException;

import java.util.List;


public interface PublisherService {

	public List<Publisher> findAllPublishers();

	public Publisher findPublisherById(Long id) throws NotFoundException;

	public void createPublisher(Publisher publisher);

	public void updatePublisher(Publisher publisher);

	public void deletePublisher(Long id) throws NotFoundException;

}
