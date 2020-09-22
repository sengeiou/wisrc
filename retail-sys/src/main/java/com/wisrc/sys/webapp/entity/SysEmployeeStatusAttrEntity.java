package com.wisrc.sys.webapp.entity;

import java.util.Objects;

public class SysEmployeeStatusAttrEntity {
    private int statusCd;
    private String statusDesc;

    public int getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(int statusCd) {
        this.statusCd = statusCd;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysEmployeeStatusAttrEntity that = (SysEmployeeStatusAttrEntity) o;
        return statusCd == that.statusCd &&
                Objects.equals(statusDesc, that.statusDesc);
    }

    @Override
    public int hashCode() {

        return Objects.hash(statusCd, statusDesc);
    }
}
