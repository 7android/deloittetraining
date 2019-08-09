package com.hms.deloitte.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import com.hms.deloitte.model.Payment;
import com.hms.deloitte.model.Transaction;
import com.hms.deloitte.service.PaymentService;
import com.hms.deloitte.service.TransactionService;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	private TransactionService transactionService;
	
	@RequestMapping (value = "/payment" , method = RequestMethod.GET)
	public String listPayment(Model model)
	{
		model.addAttribute("payment", new Payment());
		return "payments";
	}
	
	@RequestMapping (value = "/confirmation" , method = RequestMethod.GET)
	public String confirmPayment(Model model )
	{
		model.addAttribute("transaction", new Transaction());
		return "confirmation";
	}
	
	@RequestMapping (value = "/thank" , method = RequestMethod.GET)
	public String thank ()
	{
		return "thank";
	}
	
	@RequestMapping (value = "/trans", method = RequestMethod.POST)
	public String trans ( @ModelAttribute ("transaction") Transaction tr, HttpSession session)
	{
		    Payment payment = (Payment) session.getAttribute("payment");
			this.transactionService.addTransaction(tr.getFeedback(), payment.getCardNumber());
			return "redirect:/thank";	
	}
	
	@RequestMapping (value = "/verifyPayment", method = RequestMethod.POST)
	public String verifyPayment (@ModelAttribute ("payment") Payment payment ,HttpSession session)
	{
		System.out.println("Verifying...");
		session.setAttribute("payment", payment);
		if(this.paymentService.verify(payment))
			return "redirect:/confirmation";
		else 
			return "redirect:/payment";	
	}
	
	
}
