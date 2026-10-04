package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class NgoResponse {

    private String id;
    private String name;
    private String csrOneResOrg;
    private String resCertificateOrg;
    private String registerId;
    private String panCardOrg;
    private String twelveAaCertificate;
    private String eightyGCertificateOrg;
    private String listOfExistGovBodyMembers;
    private String detailsOfOfficeBearers;
    private String auditReportOrgWithIncomeTaxReturn;
    private String bankAccountNo;
    private String bankAccountName;
    private String bankName;
    private String bankIfscCode;
    private String bankAddressOfTheBank;
    private String fcraRegCertificate;
    private String nitiAayogDarpanReg;
    private String completeAddressRegDocOrg;
    private String contactName;
    private String contactPhoneNo;
    private String contactEmail;
    private String contactOfficeAddress;
    private String keyPersonName;
    private String keyPersonPhoneNo;
    private String keyPersonEmail;
    private String keyPersonOfficeAddress;
    private Long userId;
    private String status;
    private Long createdBy;
    private LocalDateTime createdAt;
    private Long updatedBy;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String flArchive;
    private Integer approvalOrder;
    private String registerStatus;
    private LocalDate date;
    private Double amountReceived;
    private Double amountSpent;
    private String nameOfEntity;
    private String statusOfEntityId;
    private String registeredOffAddress;
    private String corporateOffAddress;
    private String branches;
    private String nameOfGroup;
    private String pan;
    private String gst;
    private String website;
    private String isGstAvailable;

    public NgoResponse(
            String id,
            String name,
            String csrOneResOrg,
            String resCertificateOrg,
            String registerId,
            String panCardOrg,
            String twelveAaCertificate,
            String eightyGCertificateOrg,
            String listOfExistGovBodyMembers,
            String detailsOfOfficeBearers,
            String auditReportOrgWithIncomeTaxReturn,
            String bankAccountNo,
            String bankAccountName,
            String bankName,
            String bankIfscCode,
            String bankAddressOfTheBank,
            String fcraRegCertificate,
            String nitiAayogDarpanReg,
            String completeAddressRegDocOrg,
            String contactName,
            String contactPhoneNo,
            String contactEmail,
            String contactOfficeAddress,
            String keyPersonName,
            String keyPersonPhoneNo,
            String keyPersonEmail,
            String keyPersonOfficeAddress,
            Long userId,
            String status,
            Long createdBy,
            LocalDateTime createdAt,
            Long updatedBy,
            LocalDateTime updatedAt,
            LocalDateTime deletedAt,
            String flArchive,
            Integer approvalOrder,
            String registerStatus,
            LocalDate date,
            Double amountReceived,
            Double amountSpent,
            String nameOfEntity,
            String statusOfEntityId,
            String registeredOffAddress,
            String corporateOffAddress,
            String branches,
            String nameOfGroup,
            String pan,
            String gst,
            String website,
            String isGstAvailable
    ) {
        this.id = id;
        this.name = name;
        this.csrOneResOrg = csrOneResOrg;
        this.resCertificateOrg = resCertificateOrg;
        this.registerId = registerId;
        this.panCardOrg = panCardOrg;
        this.twelveAaCertificate = twelveAaCertificate;
        this.eightyGCertificateOrg = eightyGCertificateOrg;
        this.listOfExistGovBodyMembers = listOfExistGovBodyMembers;
        this.detailsOfOfficeBearers = detailsOfOfficeBearers;
        this.auditReportOrgWithIncomeTaxReturn = auditReportOrgWithIncomeTaxReturn;
        this.bankAccountNo = bankAccountNo;
        this.bankAccountName = bankAccountName;
        this.bankName = bankName;
        this.bankIfscCode = bankIfscCode;
        this.bankAddressOfTheBank = bankAddressOfTheBank;
        this.fcraRegCertificate = fcraRegCertificate;
        this.nitiAayogDarpanReg = nitiAayogDarpanReg;
        this.completeAddressRegDocOrg = completeAddressRegDocOrg;
        this.contactName = contactName;
        this.contactPhoneNo = contactPhoneNo;
        this.contactEmail = contactEmail;
        this.contactOfficeAddress = contactOfficeAddress;
        this.keyPersonName = keyPersonName;
        this.keyPersonPhoneNo = keyPersonPhoneNo;
        this.keyPersonEmail = keyPersonEmail;
        this.keyPersonOfficeAddress = keyPersonOfficeAddress;
        this.userId = userId;
        this.status = status;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.flArchive = flArchive;
        this.approvalOrder = approvalOrder;
        this.registerStatus = registerStatus;
        this.date = date;
        this.amountReceived = amountReceived;
        this.amountSpent = amountSpent;
        this.nameOfEntity = nameOfEntity;
        this.statusOfEntityId = statusOfEntityId;
        this.registeredOffAddress = registeredOffAddress;
        this.corporateOffAddress = corporateOffAddress;
        this.branches = branches;
        this.nameOfGroup = nameOfGroup;
        this.pan = pan;
        this.gst = gst;
        this.website = website;
        this.isGstAvailable = isGstAvailable;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCsrOneResOrg() {
        return csrOneResOrg;
    }

    public String getResCertificateOrg() {
        return resCertificateOrg;
    }

    public String getRegisterId() {
        return registerId;
    }

    public String getPanCardOrg() {
        return panCardOrg;
    }

    public String getTwelveAaCertificate() {
        return twelveAaCertificate;
    }

    public String getEightyGCertificateOrg() {
        return eightyGCertificateOrg;
    }

    public String getListOfExistGovBodyMembers() {
        return listOfExistGovBodyMembers;
    }

    public String getDetailsOfOfficeBearers() {
        return detailsOfOfficeBearers;
    }

    public String getAuditReportOrgWithIncomeTaxReturn() {
        return auditReportOrgWithIncomeTaxReturn;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankIfscCode() {
        return bankIfscCode;
    }

    public String getBankAddressOfTheBank() {
        return bankAddressOfTheBank;
    }

    public String getFcraRegCertificate() {
        return fcraRegCertificate;
    }

    public String getNitiAayogDarpanReg() {
        return nitiAayogDarpanReg;
    }

    public String getCompleteAddressRegDocOrg() {
        return completeAddressRegDocOrg;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactOfficeAddress() {
        return contactOfficeAddress;
    }

    public String getKeyPersonName() {
        return keyPersonName;
    }

    public String getKeyPersonPhoneNo() {
        return keyPersonPhoneNo;
    }

    public String getKeyPersonEmail() {
        return keyPersonEmail;
    }

    public String getKeyPersonOfficeAddress() {
        return keyPersonOfficeAddress;
    }

    public Long getUserId() {
        return userId;
    }

    public String getStatus() {
        return status;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public String getFlArchive() {
        return flArchive;
    }

    public Integer getApprovalOrder() {
        return approvalOrder;
    }

    public String getRegisterStatus() {
        return registerStatus;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getAmountReceived() {
        return amountReceived;
    }

    public Double getAmountSpent() {
        return amountSpent;
    }

    public String getNameOfEntity() {
        return nameOfEntity;
    }

    public String getStatusOfEntityId() {
        return statusOfEntityId;
    }

    public String getRegisteredOffAddress() {
        return registeredOffAddress;
    }

    public String getCorporateOffAddress() {
        return corporateOffAddress;
    }

    public String getBranches() {
        return branches;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public String getPan() {
        return pan;
    }

    public String getGst() {
        return gst;
    }

    public String getWebsite() {
        return website;
    }

    public String getIsGstAvailable() {
        return isGstAvailable;
    }
}