package com.student.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.entity.Product;
import com.student.api.repository.ProductInterface;
@Service
public class ProductServices {
	
	@Autowired private ProductInterface productInterface;
	//Single Data Save
	public Product singleDataSave(Product product)
	{
		return productInterface.save(product);
	}

	//multiple Data save
	public List<Product> multipleDataSave(List<Product> products)
	{
		return productInterface.saveAll(products);
	}
	
	//All Data Fetch
	public List<Product> dataFetch()
	{
		return productInterface.findAll();
	}
	//Fetch one id
	public Product getById(int id)
	{
		return productInterface.findById(id).orElse(null);
	}
	
	//Fetch by name
	public Product findByName(String name)
	{
		return productInterface.findByName(name);
	}
	//delete by id
	public String deletById(int id)
	{
	 	productInterface.deleteById(id);
		return "Product id delete"+id;
	}
	
	//update
	public Product dataUpdate(Product product)
	{
		Product p = productInterface.findById(product.getId()).orElse(null);
		p.setName(product.getName());
		p.setPrice(product.getPrice());
		p.setProduct(product.getProduct());
		return p;
		
	}
}
