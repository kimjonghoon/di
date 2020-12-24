package net.java_school.bank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {

	@Bean
	public BankDao myBankDao() {
		return new MyBankDao();
	}

	@Bean
	public Bank myBank() {
		Bank bank = new MyBank();
		bank.setDao(myBankDao());
		return bank;
	}

	@Bean
	public BankUi bankUi() {
		BankUi ui = new BankUi();
		ui.setBank(myBank());
		ui.setStream(System.out);
		return ui;
	}

}
