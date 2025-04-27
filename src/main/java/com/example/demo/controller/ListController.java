package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.mapper.EarningsMapper;
import com.example.demo.model.Earnings;

@Controller
public class ListController {

    @Autowired
    private EarningsMapper earningsMapper;

    @GetMapping("/list")
    public String showList(Model model) {
        List<Earnings> earningsList = earningsMapper.findAll();
        model.addAttribute("earningsList", earningsList);
        return "list";
    }
}