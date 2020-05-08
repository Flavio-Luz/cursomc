package com.flavioluz.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.flavioluz.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
