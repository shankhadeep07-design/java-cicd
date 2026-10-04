package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_ngo")
public class Ngo {

    @Id
    @Column(name = "tngo_id", length = 50, nullable = false)
    private String tngoId;

    @Column(name = "tngo_name", length = 255)
    private String tngoName;

    @Column(name = "tngo_csr_one_res_org", length = 255)
    private String tngoCsrOneResOrg;

    @Column(name = "tngo_res_certificate_org", length = 255)
    private String tngoResCertificateOrg;

    @Column(name = "tngo_register_id", length = 255)
    private String tngoRegisterId;

    @Column(name = "tngo_pan_card_org", length = 255)
    private String tngoPanCardOrg;

    @Column(name = "tngo_twelve_aa_certificate", length = 255)
    private String tngoTwelveAaCertificate;

    @Column(name = "tngo_eighty_g_certificate_org", length = 255)
    private String tngoEightyGCertificateOrg;

    @Column(name = "tngo_list_of_exist_gov_body_members", length = 255)
    private String tngoListOfExistGovBodyMembers;

    @Column(name = "tngo_details_of_office_bearers", length = 255)
    private String tngoDetailsOfOfficeBearers;

    @Column(name = "tngo_audit_report_org_with_income_tax_return", length = 255)
    private String tngoAuditReportOrgWithIncomeTaxReturn;

    @Column(name = "tngo_bank_account_no", length = 255)
    private String tngoBankAccountNo;

    @Column(name = "tngo_bank_account_name", length = 255)
    private String tngoBankAccountName;

    @Column(name = "tngo_bank_name", length = 255)
    private String tngoBankName;

    @Column(name = "tngo_bank_ifsc_code", length = 255)
    private String tngoBankIfscCode;

    @Column(name = "tngo_bank_address_of_the_bank", columnDefinition = "text")
    private String tngoBankAddressOfTheBank;

    @Column(name = "tngo_fcra_reg_certificate", length = 255)
    private String tngoFcraRegCertificate;

    @Column(name = "tngo_niti_aayog_darpan_reg", length = 255)
    private String tngoNitiAayogDarpanReg;

    @Column(name = "tngo_complete_address_reg_doc_org", columnDefinition = "text")
    private String tngoCompleteAddressRegDocOrg;

    @Column(name = "tngo_contact_name", length = 255)
    private String tngoContactName;

    @Column(name = "tngo_contact_phone_no", length = 255)
    private String tngoContactPhoneNo;

    @Column(name = "tngo_contact_email", length = 255)
    private String tngoContactEmail;

    @Column(name = "tngo_contact_office_address", length = 255)
    private String tngoContactOfficeAddress;

    @Column(name = "tngo_key_person_name", length = 255)
    private String tngoKeyPersonName;

    @Column(name = "tngo_key_person_phone_no", length = 255)
    private String tngoKeyPersonPhoneNo;

    @Column(name = "tngo_key_person_email", length = 255)
    private String tngoKeyPersonEmail;

    @Column(name = "tngo_key_person_office_address", length = 255)
    private String tngoKeyPersonOfficeAddress;

    @Column(name = "tngo_user_id")
    private Long tngoUserId;

    @Column(name = "tngo_status", length = 100)
    private String tngoStatus = "pending";

    @Column(name = "tngo_created_by")
    private Long tngoCreatedBy;

    @Column(name = "tngo_created_at")
    private LocalDateTime tngoCreatedAt;

    @Column(name = "tngo_updated_by")
    private Long tngoUpdatedBy;

    @Column(name = "tngo_updated_at")
    private LocalDateTime tngoUpdatedAt;

    @Column(name = "tngo_deleted_at")
    private LocalDateTime tngoDeletedAt;

    @Column(name = "tngo_fl_archive", length = 1)
    private String tngoFlArchive = "N";

    @Column(name = "tngo_approval_order")
    private Integer tngoApprovalOrder;

    @Column(name = "tngo_register_status")
    private String tngoRegisterStatus;

    @Column(name = "tngo_date")
    private LocalDate tngoDate;

    @Column(name = "tngo_amount_received")
    private Double tngoAmountReceived;

    @Column(name = "tngo_amount_spent")
    private Double tngoAmountSpent;

    @Column(name = "tngo_name_of_entity")
    private String tngoNameOfEntity;

    @Column(name = "tngo_status_of_entity_id")
    private String tngoStatusOfEntityId;

    @Column(name = "tngo_registered_off_address")
    private String tngoRegisteredOffAddress;

    @Column(name = "tngo_corporate_off_address")
    private String tngoCorporateOffAddress;

    @Column(name = "tngo_branches")
    private String tngoBranches;

    @Column(name = "tngo_name_of_group")
    private String tngoNameOfGroup;

    @Column(name = "tngo_pan")
    private String tngoPan;

    @Column(name = "tngo_gst")
    private String tngoGst;

    @Column(name = "tngo_website")
    private String tngoWebsite;

    @Column(name = "tngo_is_gst_available", length = 10)
    private String tngoIsGstAvailable;

    public String getTngoId() {
        return tngoId;
    }

    public void setTngoId(String tngoId) {
        this.tngoId = tngoId;
    }

    public String getTngoName() {
        return tngoName;
    }

    public void setTngoName(String tngoName) {
        this.tngoName = tngoName;
    }

    public String getTngoCsrOneResOrg() {
        return tngoCsrOneResOrg;
    }

    public void setTngoCsrOneResOrg(String tngoCsrOneResOrg) {
        this.tngoCsrOneResOrg = tngoCsrOneResOrg;
    }

    public String getTngoResCertificateOrg() {
        return tngoResCertificateOrg;
    }

    public void setTngoResCertificateOrg(String tngoResCertificateOrg) {
        this.tngoResCertificateOrg = tngoResCertificateOrg;
    }

    public String getTngoRegisterId() {
        return tngoRegisterId;
    }

    public void setTngoRegisterId(String tngoRegisterId) {
        this.tngoRegisterId = tngoRegisterId;
    }

    public String getTngoPanCardOrg() {
        return tngoPanCardOrg;
    }

    public void setTngoPanCardOrg(String tngoPanCardOrg) {
        this.tngoPanCardOrg = tngoPanCardOrg;
    }

    public String getTngoTwelveAaCertificate() {
        return tngoTwelveAaCertificate;
    }

    public void setTngoTwelveAaCertificate(String tngoTwelveAaCertificate) {
        this.tngoTwelveAaCertificate = tngoTwelveAaCertificate;
    }

    public String getTngoEightyGCertificateOrg() {
        return tngoEightyGCertificateOrg;
    }

    public void setTngoEightyGCertificateOrg(String tngoEightyGCertificateOrg) {
        this.tngoEightyGCertificateOrg = tngoEightyGCertificateOrg;
    }

    public String getTngoListOfExistGovBodyMembers() {
        return tngoListOfExistGovBodyMembers;
    }

    public void setTngoListOfExistGovBodyMembers(String tngoListOfExistGovBodyMembers) {
        this.tngoListOfExistGovBodyMembers = tngoListOfExistGovBodyMembers;
    }

    public String getTngoDetailsOfOfficeBearers() {
        return tngoDetailsOfOfficeBearers;
    }

    public void setTngoDetailsOfOfficeBearers(String tngoDetailsOfOfficeBearers) {
        this.tngoDetailsOfOfficeBearers = tngoDetailsOfOfficeBearers;
    }

    public String getTngoAuditReportOrgWithIncomeTaxReturn() {
        return tngoAuditReportOrgWithIncomeTaxReturn;
    }

    public void setTngoAuditReportOrgWithIncomeTaxReturn(String tngoAuditReportOrgWithIncomeTaxReturn) {
        this.tngoAuditReportOrgWithIncomeTaxReturn = tngoAuditReportOrgWithIncomeTaxReturn;
    }

    public String getTngoBankAccountNo() {
        return tngoBankAccountNo;
    }

    public void setTngoBankAccountNo(String tngoBankAccountNo) {
        this.tngoBankAccountNo = tngoBankAccountNo;
    }

    public String getTngoBankAccountName() {
        return tngoBankAccountName;
    }

    public void setTngoBankAccountName(String tngoBankAccountName) {
        this.tngoBankAccountName = tngoBankAccountName;
    }

    public String getTngoBankName() {
        return tngoBankName;
    }

    public void setTngoBankName(String tngoBankName) {
        this.tngoBankName = tngoBankName;
    }

    public String getTngoBankIfscCode() {
        return tngoBankIfscCode;
    }

    public void setTngoBankIfscCode(String tngoBankIfscCode) {
        this.tngoBankIfscCode = tngoBankIfscCode;
    }

    public String getTngoBankAddressOfTheBank() {
        return tngoBankAddressOfTheBank;
    }

    public void setTngoBankAddressOfTheBank(String tngoBankAddressOfTheBank) {
        this.tngoBankAddressOfTheBank = tngoBankAddressOfTheBank;
    }

    public String getTngoFcraRegCertificate() {
        return tngoFcraRegCertificate;
    }

    public void setTngoFcraRegCertificate(String tngoFcraRegCertificate) {
        this.tngoFcraRegCertificate = tngoFcraRegCertificate;
    }

    public String getTngoNitiAayogDarpanReg() {
        return tngoNitiAayogDarpanReg;
    }

    public void setTngoNitiAayogDarpanReg(String tngoNitiAayogDarpanReg) {
        this.tngoNitiAayogDarpanReg = tngoNitiAayogDarpanReg;
    }

    public String getTngoCompleteAddressRegDocOrg() {
        return tngoCompleteAddressRegDocOrg;
    }

    public void setTngoCompleteAddressRegDocOrg(String tngoCompleteAddressRegDocOrg) {
        this.tngoCompleteAddressRegDocOrg = tngoCompleteAddressRegDocOrg;
    }

    public String getTngoContactName() {
        return tngoContactName;
    }

    public void setTngoContactName(String tngoContactName) {
        this.tngoContactName = tngoContactName;
    }

    public String getTngoContactPhoneNo() {
        return tngoContactPhoneNo;
    }

    public void setTngoContactPhoneNo(String tngoContactPhoneNo) {
        this.tngoContactPhoneNo = tngoContactPhoneNo;
    }

    public String getTngoContactEmail() {
        return tngoContactEmail;
    }

    public void setTngoContactEmail(String tngoContactEmail) {
        this.tngoContactEmail = tngoContactEmail;
    }

    public String getTngoContactOfficeAddress() {
        return tngoContactOfficeAddress;
    }

    public void setTngoContactOfficeAddress(String tngoContactOfficeAddress) {
        this.tngoContactOfficeAddress = tngoContactOfficeAddress;
    }

    public String getTngoKeyPersonName() {
        return tngoKeyPersonName;
    }

    public void setTngoKeyPersonName(String tngoKeyPersonName) {
        this.tngoKeyPersonName = tngoKeyPersonName;
    }

    public String getTngoKeyPersonPhoneNo() {
        return tngoKeyPersonPhoneNo;
    }

    public void setTngoKeyPersonPhoneNo(String tngoKeyPersonPhoneNo) {
        this.tngoKeyPersonPhoneNo = tngoKeyPersonPhoneNo;
    }

    public String getTngoKeyPersonEmail() {
        return tngoKeyPersonEmail;
    }

    public void setTngoKeyPersonEmail(String tngoKeyPersonEmail) {
        this.tngoKeyPersonEmail = tngoKeyPersonEmail;
    }

    public String getTngoKeyPersonOfficeAddress() {
        return tngoKeyPersonOfficeAddress;
    }

    public void setTngoKeyPersonOfficeAddress(String tngoKeyPersonOfficeAddress) {
        this.tngoKeyPersonOfficeAddress = tngoKeyPersonOfficeAddress;
    }

    public Long getTngoUserId() {
        return tngoUserId;
    }

    public void setTngoUserId(Long tngoUserId) {
        this.tngoUserId = tngoUserId;
    }

    public String getTngoStatus() {
        return tngoStatus;
    }

    public void setTngoStatus(String tngoStatus) {
        this.tngoStatus = tngoStatus;
    }

    public Long getTngoCreatedBy() {
        return tngoCreatedBy;
    }

    public void setTngoCreatedBy(Long tngoCreatedBy) {
        this.tngoCreatedBy = tngoCreatedBy;
    }

    public LocalDateTime getTngoCreatedAt() {
        return tngoCreatedAt;
    }

    public void setTngoCreatedAt(LocalDateTime tngoCreatedAt) {
        this.tngoCreatedAt = tngoCreatedAt;
    }

    public Long getTngoUpdatedBy() {
        return tngoUpdatedBy;
    }

    public void setTngoUpdatedBy(Long tngoUpdatedBy) {
        this.tngoUpdatedBy = tngoUpdatedBy;
    }

    public LocalDateTime getTngoUpdatedAt() {
        return tngoUpdatedAt;
    }

    public void setTngoUpdatedAt(LocalDateTime tngoUpdatedAt) {
        this.tngoUpdatedAt = tngoUpdatedAt;
    }

    public LocalDateTime getTngoDeletedAt() {
        return tngoDeletedAt;
    }

    public void setTngoDeletedAt(LocalDateTime tngoDeletedAt) {
        this.tngoDeletedAt = tngoDeletedAt;
    }

    public String getTngoFlArchive() {
        return tngoFlArchive;
    }

    public void setTngoFlArchive(String tngoFlArchive) {
        this.tngoFlArchive = tngoFlArchive;
    }

    public Integer getTngoApprovalOrder() {
        return tngoApprovalOrder;
    }

    public void setTngoApprovalOrder(Integer tngoApprovalOrder) {
        this.tngoApprovalOrder = tngoApprovalOrder;
    }

    public String getTngoRegisterStatus() {
        return tngoRegisterStatus;
    }

    public void setTngoRegisterStatus(String tngoRegisterStatus) {
        this.tngoRegisterStatus = tngoRegisterStatus;
    }

    public LocalDate getTngoDate() {
        return tngoDate;
    }

    public void setTngoDate(LocalDate tngoDate) {
        this.tngoDate = tngoDate;
    }

    public Double getTngoAmountReceived() {
        return tngoAmountReceived;
    }

    public void setTngoAmountReceived(Double tngoAmountReceived) {
        this.tngoAmountReceived = tngoAmountReceived;
    }

    public Double getTngoAmountSpent() {
        return tngoAmountSpent;
    }

    public void setTngoAmountSpent(Double tngoAmountSpent) {
        this.tngoAmountSpent = tngoAmountSpent;
    }

    public String getTngoNameOfEntity() {
        return tngoNameOfEntity;
    }

    public void setTngoNameOfEntity(String tngoNameOfEntity) {
        this.tngoNameOfEntity = tngoNameOfEntity;
    }

    public String getTngoStatusOfEntityId() {
        return tngoStatusOfEntityId;
    }

    public void setTngoStatusOfEntityId(String tngoStatusOfEntityId) {
        this.tngoStatusOfEntityId = tngoStatusOfEntityId;
    }

    public String getTngoRegisteredOffAddress() {
        return tngoRegisteredOffAddress;
    }

    public void setTngoRegisteredOffAddress(String tngoRegisteredOffAddress) {
        this.tngoRegisteredOffAddress = tngoRegisteredOffAddress;
    }

    public String getTngoCorporateOffAddress() {
        return tngoCorporateOffAddress;
    }

    public void setTngoCorporateOffAddress(String tngoCorporateOffAddress) {
        this.tngoCorporateOffAddress = tngoCorporateOffAddress;
    }

    public String getTngoBranches() {
        return tngoBranches;
    }

    public void setTngoBranches(String tngoBranches) {
        this.tngoBranches = tngoBranches;
    }

    public String getTngoNameOfGroup() {
        return tngoNameOfGroup;
    }

    public void setTngoNameOfGroup(String tngoNameOfGroup) {
        this.tngoNameOfGroup = tngoNameOfGroup;
    }

    public String getTngoPan() {
        return tngoPan;
    }

    public void setTngoPan(String tngoPan) {
        this.tngoPan = tngoPan;
    }

    public String getTngoGst() {
        return tngoGst;
    }

    public void setTngoGst(String tngoGst) {
        this.tngoGst = tngoGst;
    }

    public String getTngoWebsite() {
        return tngoWebsite;
    }

    public void setTngoWebsite(String tngoWebsite) {
        this.tngoWebsite = tngoWebsite;
    }

    public String getTngoIsGstAvailable() {
        return tngoIsGstAvailable;
    }

    public void setTngoIsGstAvailable(String tngoIsGstAvailable) {
        this.tngoIsGstAvailable = tngoIsGstAvailable;
    }
}