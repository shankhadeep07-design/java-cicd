// src/main/java/com/example/demo/entity/ProfitCenter.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.MultiPolygon;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_profit_center_master")
public class ProfitCenter {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(MultiPolygon,4326)")
    private MultiPolygon wkbGeometry;

    @Id
    @Column(name = "tprofc_id", length = 255, nullable = false)
    private String tprofcId;

    @Column(name = "tprofc_corporate", length = 255)
    private String tprofcCorporate;

    @Column(name = "tprofc_bu", length = 255)
    private String tprofcBu;

    @Column(name = "tprofc_gl_account", length = 255)
    private String tprofcGlAccount;

    @Column(name = "tprofc_profit_centre", length = 255)
    private String tprofcProfitCentre;

    @Column(name = "tprofc_cost_centre", length = 255)
    private String tprofcCostCentre;

    @Column(name = "tprofc_state_id", length = 255)
    private String tprofcStateId;

    @Column(name = "tprofc_district_id", length = 255)
    private String tprofcDistrictId;

    @Column(name = "tprofc_location_id", length = 255)
    private String tprofcLocationId;

    @Column(name = "tprofc_is_active")
    private Boolean tprofcIsActive = true;

    @Column(name = "tprofc_created_by")
    private Long tprofcCreatedBy;

    @Column(name = "tprofc_updated_by")
    private Long tprofcUpdatedBy;

    @Column(name = "tprofc_created_at", nullable = false)
    private OffsetDateTime tprofcCreatedAt;

    @Column(name = "tprofc_updated_at", nullable = false)
    private OffsetDateTime tprofcUpdatedAt;

    @Column(name = "tprofc_deleted_at")
    private OffsetDateTime tprofcDeletedAt;

    // Getters and Setters

    public MultiPolygon getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(MultiPolygon wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTprofcId() { return tprofcId; }
    public void setTprofcId(String tprofcId) { this.tprofcId = tprofcId; }

    public String getTprofcCorporate() { return tprofcCorporate; }
    public void setTprofcCorporate(String tprofcCorporate) { this.tprofcCorporate = tprofcCorporate; }

    public String getTprofcBu() { return tprofcBu; }
    public void setTprofcBu(String tprofcBu) { this.tprofcBu = tprofcBu; }

    public String getTprofcGlAccount() { return tprofcGlAccount; }
    public void setTprofcGlAccount(String tprofcGlAccount) { this.tprofcGlAccount = tprofcGlAccount; }

    public String getTprofcProfitCentre() { return tprofcProfitCentre; }
    public void setTprofcProfitCentre(String tprofcProfitCentre) { this.tprofcProfitCentre = tprofcProfitCentre; }

    public String getTprofcCostCentre() { return tprofcCostCentre; }
    public void setTprofcCostCentre(String tprofcCostCentre) { this.tprofcCostCentre = tprofcCostCentre; }

    public String getTprofcStateId() { return tprofcStateId; }
    public void setTprofcStateId(String tprofcStateId) { this.tprofcStateId = tprofcStateId; }

    public String getTprofcDistrictId() { return tprofcDistrictId; }
    public void setTprofcDistrictId(String tprofcDistrictId) { this.tprofcDistrictId = tprofcDistrictId; }

    public String getTprofcLocationId() { return tprofcLocationId; }
    public void setTprofcLocationId(String tprofcLocationId) { this.tprofcLocationId = tprofcLocationId; }

    public Boolean getTprofcIsActive() { return tprofcIsActive; }
    public void setTprofcIsActive(Boolean tprofcIsActive) { this.tprofcIsActive = tprofcIsActive; }

    public Long getTprofcCreatedBy() { return tprofcCreatedBy; }
    public void setTprofcCreatedBy(Long tprofcCreatedBy) { this.tprofcCreatedBy = tprofcCreatedBy; }

    public Long getTprofcUpdatedBy() { return tprofcUpdatedBy; }
    public void setTprofcUpdatedBy(Long tprofcUpdatedBy) { this.tprofcUpdatedBy = tprofcUpdatedBy; }

    public OffsetDateTime getTprofcCreatedAt() { return tprofcCreatedAt; }
    public void setTprofcCreatedAt(OffsetDateTime tprofcCreatedAt) { this.tprofcCreatedAt = tprofcCreatedAt; }

    public OffsetDateTime getTprofcUpdatedAt() { return tprofcUpdatedAt; }
    public void setTprofcUpdatedAt(OffsetDateTime tprofcUpdatedAt) { this.tprofcUpdatedAt = tprofcUpdatedAt; }

    public OffsetDateTime getTprofcDeletedAt() { return tprofcDeletedAt; }
    public void setTprofcDeletedAt(OffsetDateTime tprofcDeletedAt) { this.tprofcDeletedAt = tprofcDeletedAt; }
}