package joe.levante.model;

import java.util.Date;

public class transfer {
    private Integer id;

    private Integer transferid;

    private Date transfertime;

    private Double transfermoney;

    private String transactionnum;

    private String account;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTransferid() {
        return transferid;
    }

    public void setTransferid(Integer transferid) {
        this.transferid = transferid;
    }

    public Date getTransfertime() {
        return transfertime;
    }

    public void setTransfertime(Date transfertime) {
        this.transfertime = transfertime;
    }

    public Double getTransfermoney() {
        return transfermoney;
    }

    public void setTransfermoney(Double transfermoney) {
        this.transfermoney = transfermoney;
    }

    public String getTransactionnum() {
        return transactionnum;
    }

    public void setTransactionnum(String transactionnum) {
        this.transactionnum = transactionnum == null ? null : transactionnum.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }
}