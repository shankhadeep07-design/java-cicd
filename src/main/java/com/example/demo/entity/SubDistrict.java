// src/main/java/com/example/demo/entity/Block.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

@Entity
@Table(name = "t_block")
public class SubDistrict


{

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tbl_block_id", length = 100, nullable = false)
    private String tblBlockId;

    @Column(name = "tbl_block_name", length = 100)
    private String tblBlockName;

    @Column(name = "tbl_district_id", length = 100)
    private String tblDistrictId;

    @Column(name = "tbl_is_active")
    private Boolean tblIsActive = true;

    @Column(name = "tbl_created_by", length = 100)
    private String tblCreatedBy;

    @Column(name = "tbl_updated_by", length = 100)
    private String tblUpdatedBy;

    @Column(name = "tbl_created_at", nullable = false)
    private OffsetDateTime tblCreatedAt;

    @Column(name = "tbl_updated_at", nullable = false)
    private OffsetDateTime tblUpdatedAt;

    @Column(name = "tbl_state_id", length = 100)
    private String tblStateId;

    @Column(name = "tbl_deleted_at")
    private OffsetTime tblDeletedAt;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTblBlockId() { return tblBlockId; }
    public void setTblBlockId(String tblBlockId) { this.tblBlockId = tblBlockId; }

    public String getTblBlockName() { return tblBlockName; }
    public void setTblBlockName(String tblBlockName) { this.tblBlockName = tblBlockName; }

    public String getTblDistrictId() { return tblDistrictId; }
    public void setTblDistrictId(String tblDistrictId) { this.tblDistrictId = tblDistrictId; }

    public Boolean getTblIsActive() { return tblIsActive; }
    public void setTblIsActive(Boolean tblIsActive) { this.tblIsActive = tblIsActive; }

    public String getTblCreatedBy() { return tblCreatedBy; }
    public void setTblCreatedBy(String tblCreatedBy) { this.tblCreatedBy = tblCreatedBy; }

    public String getTblUpdatedBy() { return tblUpdatedBy; }
    public void setTblUpdatedBy(String tblUpdatedBy) { this.tblUpdatedBy = tblUpdatedBy; }

    public OffsetDateTime getTblCreatedAt() { return tblCreatedAt; }
    public void setTblCreatedAt(OffsetDateTime tblCreatedAt) { this.tblCreatedAt = tblCreatedAt; }

    public OffsetDateTime getTblUpdatedAt() { return tblUpdatedAt; }
    public void setTblUpdatedAt(OffsetDateTime tblUpdatedAt) { this.tblUpdatedAt = tblUpdatedAt; }

    public String getTblStateId() { return tblStateId; }
    public void setTblStateId(String tblStateId) { this.tblStateId = tblStateId; }

    public OffsetTime getTblDeletedAt() { return tblDeletedAt; }
    public void setTblDeletedAt(OffsetTime tblDeletedAt) { this.tblDeletedAt = tblDeletedAt; }
}