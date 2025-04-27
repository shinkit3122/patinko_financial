package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Earnings;

@Mapper
public interface EarningsMapper {
    void insert(Earnings earnings);
    List<Earnings> findAll();
}