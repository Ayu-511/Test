package com.redis.test_redis.domain.entity;

import java.util.Date;

public class MerchantEntity {

    /**
     * 主键id
     */
//    @AutoId
    private String id;

    /**
     * 账号名称
     */
    private String accountName;

    /**
     * 登录手机账号和能开平台保持一致
     */
    private String mobile;
    /**
     * 登录email账号和能开平台保持一致
     */
    private String email;

    /**
     * 账号名称
     */
    private String salt;

    /**
     * 账号名称
     */
    private String password;

    /**
     * 商户类型
     */
    private String companyType;

    /**
     * 企业名称
     */
    private String companyName;

    /**
     * 企业性质
     */
    private String companyNature;

    /**
     * 注册资金
     */
    private String registerCapital;

    /**
     * 注册币种
     */
    private String registerCurrency;

    /**
     * 公司上市情况
     */
    private String listedSituation;

    /**
     * 是否分公司
     */
    private String isBranchCompany;

    /**
     * 是否三证合一
     */
    private String isThreeCertificates;

    /**
     * 开户银行证明材料
     */
    private String bankAccountEvidence;

    /**
     * 公司承诺函
     */
    private String companyCommitmentLetter;

    /**
     * APID
     */
    private String apid;

    /**
     * AP名称
     */
    private String apName;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人手机号码
     */
    private String contactPhone;

    /**
     * 联系人身份证
     */
    private String contactIdCard;

    /**
     * 联系人邮箱
     */
    private String contactEmail;

    /**
     * 统一社会信用代码
     */
    private String creditCode;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 有效开始日期
     */
    private Date validStartDate;

    /**
     * 有效结束日期
     */
    private Date validEndDate;

    /**
     * 纳税人类型
     */
    private String taxpayerType;

    /**
     * 增值税一般纳税人证明
     */
    private String taxpayerCertification;

    /**
     * 备注
     */
    private String remark;

    /**
     * 逻辑删除，默认0（false）：正常未删除，1（true）：已逻辑删除
     */
    private Boolean logicDelete;

    /**
     * 能开平台uid
     */
    private String uid;

    /**
     * 能开平台用户状态
     * pending待激活
     * activated 已激活
     * invalid 已注销
     */
    private String custStatus;

    /**
     * 创建人id
     */
    private String userId;

    /**
     * 部门id(所属分省公司)
     */
    private String deptId;

    /**
     * 工单日志Id
     */
    private String issueFlowId;

    private String issueCondition;

    private String ut;

    /**
     * 身份校验状态
     */
    private Boolean contactIdCardStatus;

    /**
     * 企业校验状态
     */
    private Boolean companyStatus;

    /**
     * 法人姓名
     */
    private String legalPersonName;

    /**
     * 法人身份证号码
     */
    private String legalPersonCertId;

    /**
     * 被授权人
     */
    private String authorizationGrantedName;

    /**
     * 法人身份证复印件
     */
    private String legalPersonIdCardCopy;

    /**
     * 被授权人身份证复印件
     */
    private String authorizationGrantedIdCardCopy;

    /**
     * 合同签订: true(已签订)，false(未签订)
     */
    private Boolean contractSign;

    /**
     * 是否开户: true(已开户)，false(未开户)
     */
    private Boolean openAccount;


    /**
     * 分公司名称
     */
    private String headOffice;

    /**
     * 法人授权书
     */
    private String legalPersonAuthorization;

    /**
     * 长期: true(长期),  false(非长期)
     */
    private Boolean longTerm;

    /**
     * 所属经销商/代理商
     */
    private String belongDealer;

    /**
     * 一级客户 是/否
     */
    private Boolean integratedCustomer;

    /**
     * 合作产品
     */
    private String cooperativeProduct;

//    /*
//    <result column="create_time" jdbcType="TIMESTAMP" property="createTime"/>
//        <result column="create_by" jdbcType="VARCHAR" property="createBy"/>
//        <result column="update_time" jdbcType="TIMESTAMP" property="updateTime"/>
//        <result column="update_by" jdbcType="VARCHAR" property="updateBy"/>
//    */
    private Date createTime;
    private String createBy;
    private Date updateTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    private String updateBy;

    /**
     * 商户资质来源
     */
    private String qualificationSource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature;
    }

    public String getRegisterCapital() {
        return registerCapital;
    }

    public void setRegisterCapital(String registerCapital) {
        this.registerCapital = registerCapital;
    }

    public String getRegisterCurrency() {
        return registerCurrency;
    }

    public void setRegisterCurrency(String registerCurrency) {
        this.registerCurrency = registerCurrency;
    }

    public String getListedSituation() {
        return listedSituation;
    }

    public void setListedSituation(String listedSituation) {
        this.listedSituation = listedSituation;
    }

    public String getIsBranchCompany() {
        return isBranchCompany;
    }

    public void setIsBranchCompany(String isBranchCompany) {
        this.isBranchCompany = isBranchCompany;
    }

    public String getIsThreeCertificates() {
        return isThreeCertificates;
    }

    public void setIsThreeCertificates(String isThreeCertificates) {
        this.isThreeCertificates = isThreeCertificates;
    }

    public String getBankAccountEvidence() {
        return bankAccountEvidence;
    }

    public void setBankAccountEvidence(String bankAccountEvidence) {
        this.bankAccountEvidence = bankAccountEvidence;
    }

    public String getCompanyCommitmentLetter() {
        return companyCommitmentLetter;
    }

    public void setCompanyCommitmentLetter(String companyCommitmentLetter) {
        this.companyCommitmentLetter = companyCommitmentLetter;
    }

    public String getApid() {
        return apid;
    }

    public void setApid(String apid) {
        this.apid = apid;
    }

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactIdCard() {
        return contactIdCard;
    }

    public void setContactIdCard(String contactIdCard) {
        this.contactIdCard = contactIdCard;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public Date getValidStartDate() {
        return validStartDate;
    }

    public void setValidStartDate(Date validStartDate) {
        this.validStartDate = validStartDate;
    }

    public Date getValidEndDate() {
        return validEndDate;
    }

    public void setValidEndDate(Date validEndDate) {
        this.validEndDate = validEndDate;
    }

    public String getTaxpayerType() {
        return taxpayerType;
    }

    public void setTaxpayerType(String taxpayerType) {
        this.taxpayerType = taxpayerType;
    }

    public String getTaxpayerCertification() {
        return taxpayerCertification;
    }

    public void setTaxpayerCertification(String taxpayerCertification) {
        this.taxpayerCertification = taxpayerCertification;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getLogicDelete() {
        return logicDelete;
    }

    public void setLogicDelete(Boolean logicDelete) {
        this.logicDelete = logicDelete;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getIssueFlowId() {
        return issueFlowId;
    }

    public void setIssueFlowId(String issueFlowId) {
        this.issueFlowId = issueFlowId;
    }

    public String getIssueCondition() {
        return issueCondition;
    }

    public void setIssueCondition(String issueCondition) {
        this.issueCondition = issueCondition;
    }

    public String getUt() {
        return ut;
    }

    public void setUt(String ut) {
        this.ut = ut;
    }

    public Boolean getContactIdCardStatus() {
        return contactIdCardStatus;
    }

    public void setContactIdCardStatus(Boolean contactIdCardStatus) {
        this.contactIdCardStatus = contactIdCardStatus;
    }

    public Boolean getCompanyStatus() {
        return companyStatus;
    }

    public void setCompanyStatus(Boolean companyStatus) {
        this.companyStatus = companyStatus;
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public String getLegalPersonCertId() {
        return legalPersonCertId;
    }

    public void setLegalPersonCertId(String legalPersonCertId) {
        this.legalPersonCertId = legalPersonCertId;
    }

    public String getAuthorizationGrantedName() {
        return authorizationGrantedName;
    }

    public void setAuthorizationGrantedName(String authorizationGrantedName) {
        this.authorizationGrantedName = authorizationGrantedName;
    }

    public String getLegalPersonIdCardCopy() {
        return legalPersonIdCardCopy;
    }

    public void setLegalPersonIdCardCopy(String legalPersonIdCardCopy) {
        this.legalPersonIdCardCopy = legalPersonIdCardCopy;
    }

    public String getAuthorizationGrantedIdCardCopy() {
        return authorizationGrantedIdCardCopy;
    }

    public void setAuthorizationGrantedIdCardCopy(String authorizationGrantedIdCardCopy) {
        this.authorizationGrantedIdCardCopy = authorizationGrantedIdCardCopy;
    }

    public Boolean getContractSign() {
        return contractSign;
    }

    public void setContractSign(Boolean contractSign) {
        this.contractSign = contractSign;
    }

    public Boolean getOpenAccount() {
        return openAccount;
    }

    public void setOpenAccount(Boolean openAccount) {
        this.openAccount = openAccount;
    }

    public String getHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
    }

    public String getLegalPersonAuthorization() {
        return legalPersonAuthorization;
    }

    public void setLegalPersonAuthorization(String legalPersonAuthorization) {
        this.legalPersonAuthorization = legalPersonAuthorization;
    }

    public Boolean getLongTerm() {
        return longTerm;
    }

    public void setLongTerm(Boolean longTerm) {
        this.longTerm = longTerm;
    }

    public String getBelongDealer() {
        return belongDealer;
    }

    public void setBelongDealer(String belongDealer) {
        this.belongDealer = belongDealer;
    }

    public Boolean getIntegratedCustomer() {
        return integratedCustomer;
    }

    public void setIntegratedCustomer(Boolean integratedCustomer) {
        this.integratedCustomer = integratedCustomer;
    }

    public String getCooperativeProduct() {
        return cooperativeProduct;
    }

    public void setCooperativeProduct(String cooperativeProduct) {
        this.cooperativeProduct = cooperativeProduct;
    }

    public String getQualificationSource() {
        return qualificationSource;
    }

    public void setQualificationSource(String qualificationSource) {
        this.qualificationSource = qualificationSource;
    }
}
