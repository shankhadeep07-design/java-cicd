// src/main/java/com/example/demo/entity/ApprovalPathEntity.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_approval_channel")
public class ApprovalPathEntity {

    @Id
    @Column(name = "tac_id", length = 100, nullable = false)
    private String tacId;

    @Column(name = "tac_intemator_id")
    private String tacIntematorId;

    @Column(name = "tac_status")
    private String tacStatus;

    @Column(name = "tac_initiator_role_id")
    private String tacInitiatorRoleId;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "tac_approval_json", columnDefinition = "jsonb")
    private String tacApprovalJson;

    @Column(name = "tac_module_id")
    private String tacModuleId;

    @Column(name = "tac_approval_master_id")
    private String tacApprovalMasterId;

    @Column(name = "tac_bu_id")
    private String tacBuId;

    @Column(name = "tac_module_name")
    private String tacModuleName;

    @Column(name = "tac_from_amount")
    private BigDecimal tacFromAmount;

    @Column(name = "tac_to_amount")
    private BigDecimal tacToAmount;

    @Column(name = "tac_fl_archive")
    private String tacFlArchive = "N";

    @Column(name = "tac_created_by", length = 100)
    private String tacCreatedBy;

    @Column(name = "tac_updated_by", length = 100)
    private String tacUpdatedBy;

    @Column(name = "tac_created_at")
    private LocalDateTime tacCreatedAt;

    @Column(name = "tac_updated_at")
    private LocalDateTime tacUpdatedAt;

    @Column(name = "tac_published_date")
    private LocalDateTime tacPublishedDate;

    @Column(name = "tac_factory_id")
    private String tacFactoryId;

    // Getters and Setters

    public String getTacId() { return tacId; }
    public void setTacId(String tacId) { this.tacId = tacId; }

    public String getTacIntematorId() { return tacIntematorId; }
    public void setTacIntematorId(String tacIntematorId) { this.tacIntematorId = tacIntematorId; }

    public String getTacStatus() { return tacStatus; }
    public void setTacStatus(String tacStatus) { this.tacStatus = tacStatus; }

    public String getTacInitiatorRoleId() { return tacInitiatorRoleId; }
    public void setTacInitiatorRoleId(String tacInitiatorRoleId) { this.tacInitiatorRoleId = tacInitiatorRoleId; }

    public String getTacApprovalJson() { return tacApprovalJson; }
    public void setTacApprovalJson(String tacApprovalJson) { this.tacApprovalJson = tacApprovalJson; }

    public String getTacModuleId() { return tacModuleId; }
    public void setTacModuleId(String tacModuleId) { this.tacModuleId = tacModuleId; }

    public String getTacApprovalMasterId() { return tacApprovalMasterId; }
    public void setTacApprovalMasterId(String tacApprovalMasterId) { this.tacApprovalMasterId = tacApprovalMasterId; }

    public String getTacBuId() { return tacBuId; }
    public void setTacBuId(String tacBuId) { this.tacBuId = tacBuId; }

    public String getTacModuleName() { return tacModuleName; }
    public void setTacModuleName(String tacModuleName) { this.tacModuleName = tacModuleName; }

    public BigDecimal getTacFromAmount() { return tacFromAmount; }
    public void setTacFromAmount(BigDecimal tacFromAmount) { this.tacFromAmount = tacFromAmount; }

    public BigDecimal getTacToAmount() { return tacToAmount; }
    public void setTacToAmount(BigDecimal tacToAmount) { this.tacToAmount = tacToAmount; }

    public String getTacFlArchive() { return tacFlArchive; }
    public void setTacFlArchive(String tacFlArchive) { this.tacFlArchive = tacFlArchive; }

    public String getTacCreatedBy() { return tacCreatedBy; }
    public void setTacCreatedBy(String tacCreatedBy) { this.tacCreatedBy = tacCreatedBy; }

    public String getTacUpdatedBy() { return tacUpdatedBy; }
    public void setTacUpdatedBy(String tacUpdatedBy) { this.tacUpdatedBy = tacUpdatedBy; }

    public LocalDateTime getTacCreatedAt() { return tacCreatedAt; }
    public void setTacCreatedAt(LocalDateTime tacCreatedAt) { this.tacCreatedAt = tacCreatedAt; }

    public LocalDateTime getTacUpdatedAt() { return tacUpdatedAt; }
    public void setTacUpdatedAt(LocalDateTime tacUpdatedAt) { this.tacUpdatedAt = tacUpdatedAt; }

    public LocalDateTime getTacPublishedDate() { return tacPublishedDate; }
    public void setTacPublishedDate(LocalDateTime tacPublishedDate) { this.tacPublishedDate = tacPublishedDate; }

    public String getTacFactoryId() { return tacFactoryId; }
    public void setTacFactoryId(String tacFactoryId) { this.tacFactoryId = tacFactoryId; }
}