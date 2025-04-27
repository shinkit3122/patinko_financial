package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.mapper.EarningsMapper;
import com.example.demo.model.Earnings;
import com.example.demo.model.EarningsForm;

@Controller
public class InputController {
	// 画面表示
	@GetMapping("/form")
	public String showForm() {
		return "form";
	}
	
	@Autowired
	private EarningsMapper earningsMapper;

	// フォーム送信処理（今回はまだ保存しない）
	@PostMapping("/form")
	public String submitForm(@ModelAttribute EarningsForm form) {
		
		Earnings earnings = new Earnings();
	
        System.out.println("日付: " + form.getDate());
        System.out.println("店舗名: " + form.getShop());
        System.out.println("投資: " + form.getInvestment());
        System.out.println("回収: " + form.getReturnMoney());
        System.out.println("メモ: " + form.getMemo());
        
        earnings.setDate(LocalDate.parse(form.getDate()));
        earnings.setShop(form.getShop());
        earnings.setInvestment(form.getInvestment());
        earnings.setReturnMoney(form.getReturnMoney());
        earnings.setMemo(form.getMemo());
        
        earningsMapper.insert(earnings);
		
		return "redirect:/";
	}
}
