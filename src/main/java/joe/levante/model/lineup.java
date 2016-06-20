package joe.levante.model;

import java.util.Date;

public class lineup {
    private Integer id;

    private String paytimecalc;

    private String lineupnumber;

    private Double lineupmoney;

    private Date lineuptime;

    private Boolean flag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaytimecalc() {
        return paytimecalc;
    }

    public void setPaytimecalc(String paytimecalc) {
        this.paytimecalc = paytimecalc == null ? null : paytimecalc.trim();
    }

    public String getLineupnumber() {
        return lineupnumber;
    }

    public void setLineupnumber(String lineupnumber) {
        this.lineupnumber = lineupnumber == null ? null : lineupnumber.trim();
    }

    public Double getLineupmoney() {
        return lineupmoney;
    }

    public void setLineupmoney(Double lineupmoney) {
        this.lineupmoney = lineupmoney;
    }

    public Date getLineuptime() {
        return lineuptime;
    }

    public void setLineuptime(Date lineuptime) {
        this.lineuptime = lineuptime;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }
}