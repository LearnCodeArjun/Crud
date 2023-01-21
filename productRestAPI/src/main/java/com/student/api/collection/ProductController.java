package com.student.api.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.api.entity.Product;
import com.student.api.services.ProductServices;

@RestController
public class ProductController {
	
	@Autowired ProductServices productServices;
	
	@PostMapping("/singleData")
	public Product singleDataSave(@RequestBody Product product)
	{
		return productServices.singleDataSave(product);
	}
	
	@PostMapping("/multipleSave")
	public List<Product> multipleDataSave(@RequestBody List<Product> products)
	{
		return productServices.multipleDataSave(products);
	}
	
	@GetMapping("/dataFetch")
	public List<Product> dataFetch()
	{
		return productServices.dataFetch();
	}
	
	//fetch single data
	@GetMapping("/getId/{id}")
	public Product findById(@PathVariable int id)
	{
		return productServices.getById(id);
	}
	
	//fetch by name
	@GetMapping("/getName/{name}")
	public Product findByName(@PathVariable String name)
	{
		return productServices.findByName(name);
	}
	
	//delete by id
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id)
	{
		return productServices.deletById(id);
	}

	//update
	@PutMapping("/update")
	public Product dataUpdate(@RequestBody Product product)
	{
		return productServices.dataUpdate(product);
	}
}
