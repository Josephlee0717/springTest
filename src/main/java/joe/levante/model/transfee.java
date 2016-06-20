package joe.levante.model;

import java.util.Date;

public class transfee {
    private Integer id;

    private String userid;

    private Date transtime;

    private Long fee;

    private String pid;

    private String transtype;

    private String account;

    private String zfbtransnum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Date getTranstime() {
        return transtime;
    }

    public void setTranstime(Date transtime) {
        this.transtime = transtime;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype == null ? null : transtype.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getZfbtransnum() {
        return zfbtransnum;
    }

    public void setZfbtransnum(String zfbtransnum) {
        this.zfbtransnum = zfbtransnum == null ? null : zfbtransnum.trim();
    }
}