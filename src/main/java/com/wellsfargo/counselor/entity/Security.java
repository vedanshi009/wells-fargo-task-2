package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private long portfolioId;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private int quantity;

    protected Security() {
    }

    public Security(long portfolioId, String purchaseDate, double purchasePrice, int quantity) {
        this.portfolioId = portfolioId;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getSecurityId() { return securityId; }
    public long getPortfolioId() { return portfolioId; }
    public String getPurchaseDate() { return purchaseDate; }
    public double getPurchasePrice() { return purchasePrice; }
    public int getQuantity() { return quantity; }

    public void setPortfolioId(long portfolioId) { this.portfolioId = portfolioId; }
    public void setPurchaseDate(String purchaseDate) { this.purchaseDate = purchaseDate; }
    public void setPurchasePrice(double purchasePrice) { this.purchasePrice = purchasePrice; }
    public void setQuantity(int quantity) { this.quantity = quantity; }


}
