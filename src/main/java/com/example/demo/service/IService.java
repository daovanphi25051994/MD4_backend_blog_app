package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;

public interface IService<T> {
    T getById(Long id);
    List<T> getAll();
    T save(T customer);
    void deleteById(Long id);
}
