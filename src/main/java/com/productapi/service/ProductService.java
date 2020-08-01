package com.productapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapi.model.Product;
import com.productapi.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> listAll(){
		return productRepo.findAll();
		
	}
	public void save(Product product) {
		productRepo.save(product);
		
	}
	
	public Product get(Integer id) {
		return productRepo.findById(id).get();
	}
	public void delete(Integer id) {
		productRepo.deleteById(id);
	}
	
	

}
