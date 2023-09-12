package entities;

import account.exceptions.DomainException;

public class Account {

		private Integer number;
	    private String holder;
	    private Double balance;
	    private Double withdrawLimit;
	    
	    public Account() {
	    }
	    
	    public Account(final Integer number, final String holder, final Double balance, final Double withdrawLimit) {
	        this.number = number;
	        this.holder = holder;
	        this.balance = balance;
	        this.withdrawLimit = withdrawLimit;
	    }
	    
	    public Integer getNumber() {
	        return this.number;
	    }
	    
	    public void setNumber(final Integer number) {
	        this.number = number;
	    }
	    
	    public String getHolder() {
	        return this.holder;
	    }
	    
	    public void setHolder(final String holder) {
	        this.holder = holder;
	    }
	    
	    public Double getBalance() {
	        return this.balance;
	    }
	    
	    public Double getWithdrawLimit() {
	        return this.withdrawLimit;
	    }
	    
	    public void Deposit(final double amount) {
	        this.balance += amount;
	    }
	    
	    public void Withdraw(final double amount) {
	        if (amount > this.withdrawLimit) {
	            throw new DomainException("The amount exceeds withdraw limit");
	        }
	        if (amount > this.balance) {
	            throw new DomainException("Not enough balance");
	        }
	        this.balance -= amount;
	    }
	}

