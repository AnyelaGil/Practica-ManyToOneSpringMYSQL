package com.OneToMany.services;

import com.OneToMany.models.ClassCategory;
import com.OneToMany.models.ClassProduct;
import com.OneToMany.repository.CategoryRepository;
import com.OneToMany.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@Service
public class ClassService {

    @Autowired
    private CategoryRepository repoCategory;
    @Autowired
    private ProductRepository repoProduct;

    //**  PRODUCT  **
    //SHOW ALL
    public List<ClassProduct> showAllProducts(){
        return repoProduct.findAll();
    }
    //FIND BY ID
    public Optional<ClassProduct> findProdById(Long id){
        return repoProduct.findById(id);
    }
    //DELETE
    public void deleProduById(Long id){
         repoProduct.deleteById(id);
    }



    //**   CATEGORY  **
    //SHOW ALL
    public List<ClassCategory> showAllCategorys(){
        return repoCategory.findAll();
    }
    //FIND BY ID
    public Optional<ClassCategory> findCategById(Long id){
        return repoCategory.findById(id);
    }
    //DELETE
    public void deleCateById(Long id){
        repoCategory.deleteById(id);
    }

}
