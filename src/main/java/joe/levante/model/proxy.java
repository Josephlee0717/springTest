package joe.levante.model;

import java.util.Date;

public class proxy {
    private Integer id;

    private Integer proxyid;

    private String area;

    private Double proxyshare;

    private Integer areausernumber;

    private Integer areashopnumber;

    private Double monthtransac;

    private Double monthlypayment;

    private String whetherproxy;

    private Date verifytime;

    private String checkpeople;

    private String undonecause;

    private Byte verifystatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProxyid() {
        return proxyid;
    }

    public void setProxyid(Integer proxyid) {
        this.proxyid = proxyid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public Double getProxyshare() {
        return proxyshare;
    }

    public void setProxyshare(Double proxyshare) {
        this.proxyshare = proxyshare;
    }

    public Integer getAreausernumber() {
        return areausernumber;
    }

    public void setAreausernumber(Integer areausernumber) {
        this.areausernumber = areausernumber;
    }

    public Integer getAreashopnumber() {
        return areashopnumber;
    }

    public void setAreashopnumber(Integer areashopnumber) {
        this.areashopnumber = areashopnumber;
    }

    public Double getMonthtransac() {
        return monthtransac;
    }

    public void setMonthtransac(Double monthtransac) {
        this.monthtransac = monthtransac;
    }

    public Double getMonthlypayment() {
        return monthlypayment;
    }

    public void setMonthlypayment(Double monthlypayment) {
        this.monthlypayment = monthlypayment;
    }

    public String getWhetherproxy() {
        return whetherproxy;
    }

    public void setWhetherproxy(String whetherproxy) {
        this.whetherproxy = whetherproxy == null ? null : whetherproxy.trim();
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

    public Byte getVerifystatus() {
        return verifystatus;
    }

    public void setVerifystatus(Byte verifystatus) {
        this.verifystatus = verifystatus;
    }
}