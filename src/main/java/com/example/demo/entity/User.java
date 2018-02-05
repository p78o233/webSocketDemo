package com.example.demo.entity;

/**
 * Created by p78o2 on 2018-2-1.
 */
public class User {
    private String userId;
    private String tel;
    private String nickName;
    private String departmentId;//部门id
    private String positionId;//职位id
    private String pwd;
    private String power;//权限
    private String jpush;//极光推送账号
    private String tokenSession;
    private String isdel;//是否删除0没有1删除了
    private String isfrozen;//是否冻结 0没有 1已经冻结
    private double longitude;//经度
    private double latitude;//纬度
    private String islooklocate;//是否开启查看定位0关闭1开启
    private String islocate;//是否开启实时定位0关闭1开启

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getJpush() {
        return jpush;
    }

    public void setJpush(String jpush) {
        this.jpush = jpush;
    }

    public String getTokenSession() {
        return tokenSession;
    }

    public void setTokenSession(String tokenSession) {
        this.tokenSession = tokenSession;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    public String getIsfrozen() {
        return isfrozen;
    }

    public void setIsfrozen(String isfrozen) {
        this.isfrozen = isfrozen;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getIslooklocate() {
        return islooklocate;
    }

    public void setIslooklocate(String islooklocate) {
        this.islooklocate = islooklocate;
    }

    public String getIslocate() {
        return islocate;
    }

    public void setIslocate(String islocate) {
        this.islocate = islocate;
    }
}
