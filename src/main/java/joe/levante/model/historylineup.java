package joe.levante.model;

import java.util.Date;

public class historylineup {
    private Integer id;

    private String paytimecalc;

    private String lineupnumber;

    private Double lineupmoney;

    private Date outlineuptime;

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

    public Date getOutlineuptime() {
        return outlineuptime;
    }

    public void setOutlineuptime(Date outlineuptime) {
        this.outlineuptime = outlineuptime;
    }
}