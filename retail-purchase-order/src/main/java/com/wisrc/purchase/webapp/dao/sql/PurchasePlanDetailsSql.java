package com.wisrc.purchase.webapp.dao.sql;

import com.wisrc.purchase.webapp.utils.SQLUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class PurchasePlanDetailsSql {
    public static String deletePurchasePlanDetails(@Param("uuids") List uuids) {
        return new SQL() {{
            DELETE_FROM("purchase_plan_details");
            WHERE(SQLUtil.forUtil("uuid", uuids));
        }}.toString();
    }
}