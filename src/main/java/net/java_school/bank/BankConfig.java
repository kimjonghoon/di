package net.java_school.bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

	@Bean
	public BankDao shinhanBankDao() {
		return new MyBankDao();
	}

	@Bean
	public Bank shinhanBank() {
		Bank bank = new MyBank();
		bank.setDao(shinhanBankDao());
		return bank;
	}

	@Bean
	public BankUi bankUi() {
		BankUi ui = new BankUi();
		ui.setBank(shinhanBank());
		ui.setStream(System.out);
		return ui;
	}

}