package common;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author jlombardo
 */
public class LineItem {

    private long id;
    private String prodId;
    private String prodName;
    private double unitCost;
    private double qty;
    private double extPrice;
    private static final double MAX_UNIT_PRICE = 9999.99;

    public LineItem() {
    }

    public LineItem(String prodId, String prodName, double unitCost, double qty) {
        id = new Random((new Date()).getTime()).nextLong();
        this.prodId = prodId;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.qty = qty;
        extPrice = unitCost * qty;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LineItem other = (LineItem) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    public double getExtPrice() {
        return extPrice;
    }

    public void setExtPrice(double extPrice) {
        this.extPrice = extPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        if (unitCost <= 0 || unitCost > MAX_UNIT_PRICE) {
            throw new IllegalArgumentException("Unit cost "
                    + "must be between .01 and " + MAX_UNIT_PRICE);
        }

        this.unitCost = unitCost;
    }

    public String toString() {
        return prodName + ", " + qty + ", " + extPrice;
    }
}
