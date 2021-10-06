package com.zzd.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * wx_xx_xsjb
 * @author 
 */
@Entity
@Table(name="wx_xx_xsjb")
public class Student implements Serializable {

    @Id
    private Integer id;

    private String xm;

    private String xh;

    private String xb;

    private Integer age;

    /**
     * 联系方式
     */
    private String lxfs;

    private String remark;

    private String salt;

    private String picpath;

    private Integer orgcode;

    /**
     * 班级id
     */
    private Integer bjid;

    private String bjidCh;

    private String bh;

    private String birthday;

    private String address;

    private String fileid;

    private Boolean payment;

    private String phonenum;

    private String hj;

    private String idcard;

    private String serialnumber;

    private Integer campusid;

    private String rxny;

    private String xmpy;

    private String xslx;

    private String zjlx;

    private String csd;

    private String mz;

    private String gj;

    private String jkzk;

    private String txdz;

    private String yzbm;

    private String fkxz;

    private String jjlxr;

    private String jjdh;

    private String email;

    private String hkszd;

    private String publishdate;

    private String content;

    /**
     * 学生的昵称
     */
    private String nickname;

    /**
     * 籍贯
     */
    private String jg;

    /**
     * 血型
     */
    private String bloodType;

    /**
     * 健康饮食
     */
    private String healthyDiet;

    /**
     * 兴趣爱好
     */
    private String hobby;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 学籍主号
     */
    private String mainSchoolNumber;

    /**
     * 学籍副号
     */
    private String secondarySchoolNumber;

    private String bjids;

    private String phonenumbak;

    private String idcardbak;

    private String saltidcardbak;

    private String oauthid;

    private Date updateTime;

    private String loginName;

    private String password;

    private String attendanceGroup;

    private String picpath1;

    private String picpath2;

    private String qualityLevel;

    private String datapath;

    private Date dataTime;

    private String school;

    private Integer bandingCount;

    private String facedataPath;

    /**
     * 是否毕业(1：毕业，0：未毕业)
     */
    private Byte isGraduation;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLxfs() {
        return lxfs;
    }

    public void setLxfs(String lxfs) {
        this.lxfs = lxfs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath;
    }

    public Integer getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(Integer orgcode) {
        this.orgcode = orgcode;
    }

    public Integer getBjid() {
        return bjid;
    }

    public void setBjid(Integer bjid) {
        this.bjid = bjid;
    }

    public String getBjidCh() {
        return bjidCh;
    }

    public void setBjidCh(String bjidCh) {
        this.bjidCh = bjidCh;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public Boolean getPayment() {
        return payment;
    }

    public void setPayment(Boolean payment) {
        this.payment = payment;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getHj() {
        return hj;
    }

    public void setHj(String hj) {
        this.hj = hj;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Integer getCampusid() {
        return campusid;
    }

    public void setCampusid(Integer campusid) {
        this.campusid = campusid;
    }

    public String getRxny() {
        return rxny;
    }

    public void setRxny(String rxny) {
        this.rxny = rxny;
    }

    public String getXmpy() {
        return xmpy;
    }

    public void setXmpy(String xmpy) {
        this.xmpy = xmpy;
    }

    public String getXslx() {
        return xslx;
    }

    public void setXslx(String xslx) {
        this.xslx = xslx;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getCsd() {
        return csd;
    }

    public void setCsd(String csd) {
        this.csd = csd;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getJkzk() {
        return jkzk;
    }

    public void setJkzk(String jkzk) {
        this.jkzk = jkzk;
    }

    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    public String getFkxz() {
        return fkxz;
    }

    public void setFkxz(String fkxz) {
        this.fkxz = fkxz;
    }

    public String getJjlxr() {
        return jjlxr;
    }

    public void setJjlxr(String jjlxr) {
        this.jjlxr = jjlxr;
    }

    public String getJjdh() {
        return jjdh;
    }

    public void setJjdh(String jjdh) {
        this.jjdh = jjdh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHkszd() {
        return hkszd;
    }

    public void setHkszd(String hkszd) {
        this.hkszd = hkszd;
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getHealthyDiet() {
        return healthyDiet;
    }

    public void setHealthyDiet(String healthyDiet) {
        this.healthyDiet = healthyDiet;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getMainSchoolNumber() {
        return mainSchoolNumber;
    }

    public void setMainSchoolNumber(String mainSchoolNumber) {
        this.mainSchoolNumber = mainSchoolNumber;
    }

    public String getSecondarySchoolNumber() {
        return secondarySchoolNumber;
    }

    public void setSecondarySchoolNumber(String secondarySchoolNumber) {
        this.secondarySchoolNumber = secondarySchoolNumber;
    }

    public String getBjids() {
        return bjids;
    }

    public void setBjids(String bjids) {
        this.bjids = bjids;
    }

    public String getPhonenumbak() {
        return phonenumbak;
    }

    public void setPhonenumbak(String phonenumbak) {
        this.phonenumbak = phonenumbak;
    }

    public String getIdcardbak() {
        return idcardbak;
    }

    public void setIdcardbak(String idcardbak) {
        this.idcardbak = idcardbak;
    }

    public String getSaltidcardbak() {
        return saltidcardbak;
    }

    public void setSaltidcardbak(String saltidcardbak) {
        this.saltidcardbak = saltidcardbak;
    }

    public String getOauthid() {
        return oauthid;
    }

    public void setOauthid(String oauthid) {
        this.oauthid = oauthid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAttendanceGroup() {
        return attendanceGroup;
    }

    public void setAttendanceGroup(String attendanceGroup) {
        this.attendanceGroup = attendanceGroup;
    }

    public String getPicpath1() {
        return picpath1;
    }

    public void setPicpath1(String picpath1) {
        this.picpath1 = picpath1;
    }

    public String getPicpath2() {
        return picpath2;
    }

    public void setPicpath2(String picpath2) {
        this.picpath2 = picpath2;
    }

    public String getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public String getDatapath() {
        return datapath;
    }

    public void setDatapath(String datapath) {
        this.datapath = datapath;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getBandingCount() {
        return bandingCount;
    }

    public void setBandingCount(Integer bandingCount) {
        this.bandingCount = bandingCount;
    }

    public String getFacedataPath() {
        return facedataPath;
    }

    public void setFacedataPath(String facedataPath) {
        this.facedataPath = facedataPath;
    }

    public Byte getIsGraduation() {
        return isGraduation;
    }

    public void setIsGraduation(Byte isGraduation) {
        this.isGraduation = isGraduation;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Student other = (Student) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getXm() == null ? other.getXm() == null : this.getXm().equals(other.getXm()))
            && (this.getXh() == null ? other.getXh() == null : this.getXh().equals(other.getXh()))
            && (this.getXb() == null ? other.getXb() == null : this.getXb().equals(other.getXb()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getLxfs() == null ? other.getLxfs() == null : this.getLxfs().equals(other.getLxfs()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getPicpath() == null ? other.getPicpath() == null : this.getPicpath().equals(other.getPicpath()))
            && (this.getOrgcode() == null ? other.getOrgcode() == null : this.getOrgcode().equals(other.getOrgcode()))
            && (this.getBjid() == null ? other.getBjid() == null : this.getBjid().equals(other.getBjid()))
            && (this.getBjidCh() == null ? other.getBjidCh() == null : this.getBjidCh().equals(other.getBjidCh()))
            && (this.getBh() == null ? other.getBh() == null : this.getBh().equals(other.getBh()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getFileid() == null ? other.getFileid() == null : this.getFileid().equals(other.getFileid()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getPhonenum() == null ? other.getPhonenum() == null : this.getPhonenum().equals(other.getPhonenum()))
            && (this.getHj() == null ? other.getHj() == null : this.getHj().equals(other.getHj()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getSerialnumber() == null ? other.getSerialnumber() == null : this.getSerialnumber().equals(other.getSerialnumber()))
            && (this.getCampusid() == null ? other.getCampusid() == null : this.getCampusid().equals(other.getCampusid()))
            && (this.getRxny() == null ? other.getRxny() == null : this.getRxny().equals(other.getRxny()))
            && (this.getXmpy() == null ? other.getXmpy() == null : this.getXmpy().equals(other.getXmpy()))
            && (this.getXslx() == null ? other.getXslx() == null : this.getXslx().equals(other.getXslx()))
            && (this.getZjlx() == null ? other.getZjlx() == null : this.getZjlx().equals(other.getZjlx()))
            && (this.getCsd() == null ? other.getCsd() == null : this.getCsd().equals(other.getCsd()))
            && (this.getMz() == null ? other.getMz() == null : this.getMz().equals(other.getMz()))
            && (this.getGj() == null ? other.getGj() == null : this.getGj().equals(other.getGj()))
            && (this.getJkzk() == null ? other.getJkzk() == null : this.getJkzk().equals(other.getJkzk()))
            && (this.getTxdz() == null ? other.getTxdz() == null : this.getTxdz().equals(other.getTxdz()))
            && (this.getYzbm() == null ? other.getYzbm() == null : this.getYzbm().equals(other.getYzbm()))
            && (this.getFkxz() == null ? other.getFkxz() == null : this.getFkxz().equals(other.getFkxz()))
            && (this.getJjlxr() == null ? other.getJjlxr() == null : this.getJjlxr().equals(other.getJjlxr()))
            && (this.getJjdh() == null ? other.getJjdh() == null : this.getJjdh().equals(other.getJjdh()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getHkszd() == null ? other.getHkszd() == null : this.getHkszd().equals(other.getHkszd()))
            && (this.getPublishdate() == null ? other.getPublishdate() == null : this.getPublishdate().equals(other.getPublishdate()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getJg() == null ? other.getJg() == null : this.getJg().equals(other.getJg()))
            && (this.getBloodType() == null ? other.getBloodType() == null : this.getBloodType().equals(other.getBloodType()))
            && (this.getHealthyDiet() == null ? other.getHealthyDiet() == null : this.getHealthyDiet().equals(other.getHealthyDiet()))
            && (this.getHobby() == null ? other.getHobby() == null : this.getHobby().equals(other.getHobby()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getMainSchoolNumber() == null ? other.getMainSchoolNumber() == null : this.getMainSchoolNumber().equals(other.getMainSchoolNumber()))
            && (this.getSecondarySchoolNumber() == null ? other.getSecondarySchoolNumber() == null : this.getSecondarySchoolNumber().equals(other.getSecondarySchoolNumber()))
            && (this.getBjids() == null ? other.getBjids() == null : this.getBjids().equals(other.getBjids()))
            && (this.getPhonenumbak() == null ? other.getPhonenumbak() == null : this.getPhonenumbak().equals(other.getPhonenumbak()))
            && (this.getIdcardbak() == null ? other.getIdcardbak() == null : this.getIdcardbak().equals(other.getIdcardbak()))
            && (this.getSaltidcardbak() == null ? other.getSaltidcardbak() == null : this.getSaltidcardbak().equals(other.getSaltidcardbak()))
            && (this.getOauthid() == null ? other.getOauthid() == null : this.getOauthid().equals(other.getOauthid()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getAttendanceGroup() == null ? other.getAttendanceGroup() == null : this.getAttendanceGroup().equals(other.getAttendanceGroup()))
            && (this.getPicpath1() == null ? other.getPicpath1() == null : this.getPicpath1().equals(other.getPicpath1()))
            && (this.getPicpath2() == null ? other.getPicpath2() == null : this.getPicpath2().equals(other.getPicpath2()))
            && (this.getQualityLevel() == null ? other.getQualityLevel() == null : this.getQualityLevel().equals(other.getQualityLevel()))
            && (this.getDatapath() == null ? other.getDatapath() == null : this.getDatapath().equals(other.getDatapath()))
            && (this.getDataTime() == null ? other.getDataTime() == null : this.getDataTime().equals(other.getDataTime()))
            && (this.getSchool() == null ? other.getSchool() == null : this.getSchool().equals(other.getSchool()))
            && (this.getBandingCount() == null ? other.getBandingCount() == null : this.getBandingCount().equals(other.getBandingCount()))
            && (this.getFacedataPath() == null ? other.getFacedataPath() == null : this.getFacedataPath().equals(other.getFacedataPath()))
            && (this.getIsGraduation() == null ? other.getIsGraduation() == null : this.getIsGraduation().equals(other.getIsGraduation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getXm() == null) ? 0 : getXm().hashCode());
        result = prime * result + ((getXh() == null) ? 0 : getXh().hashCode());
        result = prime * result + ((getXb() == null) ? 0 : getXb().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getLxfs() == null) ? 0 : getLxfs().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getPicpath() == null) ? 0 : getPicpath().hashCode());
        result = prime * result + ((getOrgcode() == null) ? 0 : getOrgcode().hashCode());
        result = prime * result + ((getBjid() == null) ? 0 : getBjid().hashCode());
        result = prime * result + ((getBjidCh() == null) ? 0 : getBjidCh().hashCode());
        result = prime * result + ((getBh() == null) ? 0 : getBh().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getFileid() == null) ? 0 : getFileid().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getPhonenum() == null) ? 0 : getPhonenum().hashCode());
        result = prime * result + ((getHj() == null) ? 0 : getHj().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getSerialnumber() == null) ? 0 : getSerialnumber().hashCode());
        result = prime * result + ((getCampusid() == null) ? 0 : getCampusid().hashCode());
        result = prime * result + ((getRxny() == null) ? 0 : getRxny().hashCode());
        result = prime * result + ((getXmpy() == null) ? 0 : getXmpy().hashCode());
        result = prime * result + ((getXslx() == null) ? 0 : getXslx().hashCode());
        result = prime * result + ((getZjlx() == null) ? 0 : getZjlx().hashCode());
        result = prime * result + ((getCsd() == null) ? 0 : getCsd().hashCode());
        result = prime * result + ((getMz() == null) ? 0 : getMz().hashCode());
        result = prime * result + ((getGj() == null) ? 0 : getGj().hashCode());
        result = prime * result + ((getJkzk() == null) ? 0 : getJkzk().hashCode());
        result = prime * result + ((getTxdz() == null) ? 0 : getTxdz().hashCode());
        result = prime * result + ((getYzbm() == null) ? 0 : getYzbm().hashCode());
        result = prime * result + ((getFkxz() == null) ? 0 : getFkxz().hashCode());
        result = prime * result + ((getJjlxr() == null) ? 0 : getJjlxr().hashCode());
        result = prime * result + ((getJjdh() == null) ? 0 : getJjdh().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getHkszd() == null) ? 0 : getHkszd().hashCode());
        result = prime * result + ((getPublishdate() == null) ? 0 : getPublishdate().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getJg() == null) ? 0 : getJg().hashCode());
        result = prime * result + ((getBloodType() == null) ? 0 : getBloodType().hashCode());
        result = prime * result + ((getHealthyDiet() == null) ? 0 : getHealthyDiet().hashCode());
        result = prime * result + ((getHobby() == null) ? 0 : getHobby().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getMainSchoolNumber() == null) ? 0 : getMainSchoolNumber().hashCode());
        result = prime * result + ((getSecondarySchoolNumber() == null) ? 0 : getSecondarySchoolNumber().hashCode());
        result = prime * result + ((getBjids() == null) ? 0 : getBjids().hashCode());
        result = prime * result + ((getPhonenumbak() == null) ? 0 : getPhonenumbak().hashCode());
        result = prime * result + ((getIdcardbak() == null) ? 0 : getIdcardbak().hashCode());
        result = prime * result + ((getSaltidcardbak() == null) ? 0 : getSaltidcardbak().hashCode());
        result = prime * result + ((getOauthid() == null) ? 0 : getOauthid().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAttendanceGroup() == null) ? 0 : getAttendanceGroup().hashCode());
        result = prime * result + ((getPicpath1() == null) ? 0 : getPicpath1().hashCode());
        result = prime * result + ((getPicpath2() == null) ? 0 : getPicpath2().hashCode());
        result = prime * result + ((getQualityLevel() == null) ? 0 : getQualityLevel().hashCode());
        result = prime * result + ((getDatapath() == null) ? 0 : getDatapath().hashCode());
        result = prime * result + ((getDataTime() == null) ? 0 : getDataTime().hashCode());
        result = prime * result + ((getSchool() == null) ? 0 : getSchool().hashCode());
        result = prime * result + ((getBandingCount() == null) ? 0 : getBandingCount().hashCode());
        result = prime * result + ((getFacedataPath() == null) ? 0 : getFacedataPath().hashCode());
        result = prime * result + ((getIsGraduation() == null) ? 0 : getIsGraduation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", xm=").append(xm);
        sb.append(", xh=").append(xh);
        sb.append(", xb=").append(xb);
        sb.append(", age=").append(age);
        sb.append(", lxfs=").append(lxfs);
        sb.append(", remark=").append(remark);
        sb.append(", salt=").append(salt);
        sb.append(", picpath=").append(picpath);
        sb.append(", orgcode=").append(orgcode);
        sb.append(", bjid=").append(bjid);
        sb.append(", bjidCh=").append(bjidCh);
        sb.append(", bh=").append(bh);
        sb.append(", birthday=").append(birthday);
        sb.append(", address=").append(address);
        sb.append(", fileid=").append(fileid);
        sb.append(", payment=").append(payment);
        sb.append(", phonenum=").append(phonenum);
        sb.append(", hj=").append(hj);
        sb.append(", idcard=").append(idcard);
        sb.append(", serialnumber=").append(serialnumber);
        sb.append(", campusid=").append(campusid);
        sb.append(", rxny=").append(rxny);
        sb.append(", xmpy=").append(xmpy);
        sb.append(", xslx=").append(xslx);
        sb.append(", zjlx=").append(zjlx);
        sb.append(", csd=").append(csd);
        sb.append(", mz=").append(mz);
        sb.append(", gj=").append(gj);
        sb.append(", jkzk=").append(jkzk);
        sb.append(", txdz=").append(txdz);
        sb.append(", yzbm=").append(yzbm);
        sb.append(", fkxz=").append(fkxz);
        sb.append(", jjlxr=").append(jjlxr);
        sb.append(", jjdh=").append(jjdh);
        sb.append(", email=").append(email);
        sb.append(", hkszd=").append(hkszd);
        sb.append(", publishdate=").append(publishdate);
        sb.append(", content=").append(content);
        sb.append(", nickname=").append(nickname);
        sb.append(", jg=").append(jg);
        sb.append(", bloodType=").append(bloodType);
        sb.append(", healthyDiet=").append(healthyDiet);
        sb.append(", hobby=").append(hobby);
        sb.append(", signature=").append(signature);
        sb.append(", mainSchoolNumber=").append(mainSchoolNumber);
        sb.append(", secondarySchoolNumber=").append(secondarySchoolNumber);
        sb.append(", bjids=").append(bjids);
        sb.append(", phonenumbak=").append(phonenumbak);
        sb.append(", idcardbak=").append(idcardbak);
        sb.append(", saltidcardbak=").append(saltidcardbak);
        sb.append(", oauthid=").append(oauthid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", attendanceGroup=").append(attendanceGroup);
        sb.append(", picpath1=").append(picpath1);
        sb.append(", picpath2=").append(picpath2);
        sb.append(", qualityLevel=").append(qualityLevel);
        sb.append(", datapath=").append(datapath);
        sb.append(", dataTime=").append(dataTime);
        sb.append(", school=").append(school);
        sb.append(", bandingCount=").append(bandingCount);
        sb.append(", facedataPath=").append(facedataPath);
        sb.append(", isGraduation=").append(isGraduation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}