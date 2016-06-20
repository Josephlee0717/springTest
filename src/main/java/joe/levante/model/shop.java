package joe.levante.model;

import java.math.BigDecimal;
import java.util.Date;

public class shop {
    private Integer id;

    private Integer userid;

    private String area;

    private String shopaddress;

    private String shopbrand;

    private Date applytime;

    private String shopname;

    private String orgnumber;

    private String incorporator;

    private String phone;

    private Date verifytime;

    private String checkpeople;

    private String undonecause;

    private Integer verifystatus;

    private BigDecimal reducepoint;

    private String shoptype;

    private String image;

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress == null ? null : shopaddress.trim();
    }

    public String getShopbrand() {
        return shopbrand;
    }

    public void setShopbrand(String shopbrand) {
        this.shopbrand = shopbrand == null ? null : shopbrand.trim();
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getOrgnumber() {
        return orgnumber;
    }

    public void setOrgnumber(String orgnumber) {
        this.orgnumber = orgnumber == null ? null : orgnumber.trim();
    }

    public String getIncorporator() {
        return incorporator;
    }

    public void setIncorporator(String incorporator) {
        this.incorporator = incorporator == null ? null : incorporator.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(Date verifytime) {
        this.verifytime = verifytime;
    }

    public String getCheckpeople() {
        return checkpeople;
    }

    public void setCheckpeople(String checkpeople) {
        this.checkpeople = checkpeople == null ? null : checkpeople.trim();
    }

    public String getUndonecause() {
        return undonecause;
    }

    public void setUndonecause(String undonecause) {
        this.undonecause = undonecause == null ? null : undonecause.trim();
    }

    public Integer getVerifystatus() {
        return verifystatus;
    }

    public void setVerifystatus(Integer verifystatus) {
        this.verifystatus = verifystatus;
    }

    public BigDecimal getReducepoint() {
        return reducepoint;
    }

    public void setReducepoint(BigDecimal reducepoint) {
        this.reducepoint = reducepoint;
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype == null ? null : shoptype.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}