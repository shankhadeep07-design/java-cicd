package com.example.demo.dto;

import java.time.LocalDateTime;

public class ProposalAuditResponse {

    private Long eventId;
    private String schemaName;
    private String tableName;
    private Long relid;
    private String sessionUserName;
    private LocalDateTime actionTstampTx;
    private LocalDateTime actionTstampStm;
    private LocalDateTime actionTstampClk;
    private Long transactionId;
    private String applicationName;
    private String clientAddr;
    private Integer clientPort;
    private String clientQuery;
    private String action;
    private String rowData;
    private String changedFields;
    private Boolean statementOnly;

    public ProposalAuditResponse(
            Long eventId,
            String schemaName,
            String tableName,
            Long relid,
            String sessionUserName,
            LocalDateTime actionTstampTx,
            LocalDateTime actionTstampStm,
            LocalDateTime actionTstampClk,
            Long transactionId,
            String applicationName,
            String clientAddr,
            Integer clientPort,
            String clientQuery,
            String action,
            String rowData,
            String changedFields,
            Boolean statementOnly) {

        this.eventId = eventId;
        this.schemaName = schemaName;
        this.tableName = tableName;
        this.relid = relid;
        this.sessionUserName = sessionUserName;
        this.actionTstampTx = actionTstampTx;
        this.actionTstampStm = actionTstampStm;
        this.actionTstampClk = actionTstampClk;
        this.transactionId = transactionId;
        this.applicationName = applicationName;
        this.clientAddr = clientAddr;
        this.clientPort = clientPort;
        this.clientQuery = clientQuery;
        this.action = action;
        this.rowData = rowData;
        this.changedFields = changedFields;
        this.statementOnly = statementOnly;
    }

    public Long getEventId() {
        return eventId;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public String getTableName() {
        return tableName;
    }

    public Long getRelid() {
        return relid;
    }

    public String getSessionUserName() {
        return sessionUserName;
    }

    public LocalDateTime getActionTstampTx() {
        return actionTstampTx;
    }

    public LocalDateTime getActionTstampStm() {
        return actionTstampStm;
    }

    public LocalDateTime getActionTstampClk() {
        return actionTstampClk;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getClientAddr() {
        return clientAddr;
    }

    public Integer getClientPort() {
        return clientPort;
    }

    public String getClientQuery() {
        return clientQuery;
    }

    public String getAction() {
        return action;
    }

    public String getRowData() {
        return rowData;
    }

    public String getChangedFields() {
        return changedFields;
    }

    public Boolean getStatementOnly() {
        return statementOnly;
    }
}