package com.zccpro.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_accounts_logs")
public class TAccountsLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer accountid;

    private String orderid;

    private String userid;

    private String username;

    private String companycode;

    private String statetypename;
    private String statesummary;

    private BigDecimal statements;

    private Date createtime;
    
    private String ext1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    public String getStatetypename() {
        return statetypename;
    }

    public void setStatetypename(String statetypename) {
        this.statetypename = statetypename;
    }

    public String getStatesummary() {
        return statesummary;
    }

    public void setStatesummary(String statesummary) {
        this.statesummary = statesummary;
    }

    public BigDecimal getStatements() {
        return statements;
    }

    public void setStatements(BigDecimal statements) {
        this.statements = statements;
    }

    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}
}