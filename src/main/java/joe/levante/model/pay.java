package joe.levante.model;

import java.util.Date;

public class pay {
    private Integer id;

    private Integer userid;

    private Integer shopid;

    private Date paytime;

    private Double paynumber;

    private String shopname;

    private String paytimecalc;

    private String paytype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Double getPaynumber() {
        return paynumber;
    }

    public void setPaynumber(Double paynumber) {
        this.paynumber = paynumber;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getPaytimecalc() {
        return paytimecalc;
    }

    public void setPaytimecalc(String paytimecalc) {
        this.paytimecalc = paytimecalc == null ? null : paytimecalc.trim();
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype == null ? null : paytype.trim();
    }
}