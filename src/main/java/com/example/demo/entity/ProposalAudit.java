package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "proposal_data_logged_actions", schema = "audit")
public class ProposalAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id", nullable = false)
    private Long eventId;

    @Column(name = "schema_name", nullable = false)
    private String schemaName;

    @Column(name = "table_name", nullable = false)
    private String tableName;

    @Column(name = "relid", nullable = false)
    private Long relid;

    @Column(name = "session_user_name")
    private String sessionUserName;

    @Column(name = "action_tstamp_tx", nullable = false)
    private LocalDateTime actionTstampTx;

    @Column(name = "action_tstamp_stm", nullable = false)
    private LocalDateTime actionTstampStm;

    @Column(name = "action_tstamp_clk", nullable = false)
    private LocalDateTime actionTstampClk;

    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "application_name")
    private String applicationName;

    @Column(name = "client_addr")
    private String clientAddr;

    @Column(name = "client_port")
    private Integer clientPort;

    @Column(name = "client_query", nullable = false, columnDefinition = "text")
    private String clientQuery;

    @Column(name = "action", nullable = false, length = 1)
    private String action;

    @Column(name = "row_data", columnDefinition = "hstore")
    private String rowData;

    @Column(name = "changed_fields", columnDefinition = "hstore")
    private String changedFields;

    @Column(name = "statement_only", nullable = false)
    private Boolean statementOnly;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getRelid() {
        return relid;
    }

    public void setRelid(Long relid) {
        this.relid = relid;
    }

    public String getSessionUserName() {
        return sessionUserName;
    }

    public void setSessionUserName(String sessionUserName) {
        this.sessionUserName = sessionUserName;
    }

    public LocalDateTime getActionTstampTx() {
        return actionTstampTx;
    }

    public void setActionTstampTx(LocalDateTime actionTstampTx) {
        this.actionTstampTx = actionTstampTx;
    }

    public LocalDateTime getActionTstampStm() {
        return actionTstampStm;
    }

    public void setActionTstampStm(LocalDateTime actionTstampStm) {
        this.actionTstampStm = actionTstampStm;
    }

    public LocalDateTime getActionTstampClk() {
        return actionTstampClk;
    }

    public void setActionTstampClk(LocalDateTime actionTstampClk) {
        this.actionTstampClk = actionTstampClk;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public String getClientQuery() {
        return clientQuery;
    }

    public void setClientQuery(String clientQuery) {
        this.clientQuery = clientQuery;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRowData() {
        return rowData;
    }

    public void setRowData(String rowData) {
        this.rowData = rowData;
    }

    public String getChangedFields() {
        return changedFields;
    }

    public void setChangedFields(String changedFields) {
        this.changedFields = changedFields;
    }

    public Boolean getStatementOnly() {
        return statementOnly;
    }

    public void setStatementOnly(Boolean statementOnly) {
        this.statementOnly = statementOnly;
    }
}