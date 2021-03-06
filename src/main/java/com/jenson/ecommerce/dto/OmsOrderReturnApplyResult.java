package com.jenson.ecommerce.dto;

import com.jenson.ecommerce.model.OmsCompanyAddress;
import com.jenson.ecommerce.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 *
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
