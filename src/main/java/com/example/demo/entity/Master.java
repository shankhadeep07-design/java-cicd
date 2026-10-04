// src/main/java/com/example/demo/entity/Master.java
package com.example.demo.entity;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

import java.time.OffsetDateTime;

@Entity
@Table(name = "t_master_list")
public class Master {

    @Column(name = "wkb_geometry", columnDefinition = "geometry(Point,4326)")
    private Point wkbGeometry;

    @Id
    @Column(name = "tml_id", length = 255, nullable = false)
    private String tmlId;

    @Column(name = "tml_master_list_name", length = 255)
    private String tmlMasterListName;

    @Column(name = "tml_master_list_desc", length = 255)
    private String tmlMasterListDesc;

    @Column(name = "tml_master_list_slug", length = 255)
    private String tmlMasterListSlug;

    @Column(name = "tml_is_active")
    private Boolean tmlIsActive = true;

    @Column(name = "tml_created_by", length = 100)
    private String tmlCreatedBy;

    @Column(name = "tml_updated_by", length = 100)
    private String tmlUpdatedBy;

    @Column(name = "tml_created_at", nullable = false)
    private OffsetDateTime tmlCreatedAt;

    @Column(name = "tml_updated_at", nullable = false)
    private OffsetDateTime tmlUpdatedAt;

    @Column(name = "tml_deleted_at")
    private OffsetDateTime tmlDeletedAt;

    // Getters and Setters

    public Point getWkbGeometry() { return wkbGeometry; }
    public void setWkbGeometry(Point wkbGeometry) { this.wkbGeometry = wkbGeometry; }

    public String getTmlId() { return tmlId; }
    public void setTmlId(String tmlId) { this.tmlId = tmlId; }

    public String getTmlMasterListName() { return tmlMasterListName; }
    public void setTmlMasterListName(String tmlMasterListName) { this.tmlMasterListName = tmlMasterListName; }

    public String getTmlMasterListDesc() { return tmlMasterListDesc; }
    public void setTmlMasterListDesc(String tmlMasterListDesc) { this.tmlMasterListDesc = tmlMasterListDesc; }

    public String getTmlMasterListSlug() { return tmlMasterListSlug; }
    public void setTmlMasterListSlug(String tmlMasterListSlug) { this.tmlMasterListSlug = tmlMasterListSlug; }

    public Boolean getTmlIsActive() { return tmlIsActive; }
    public void setTmlIsActive(Boolean tmlIsActive) { this.tmlIsActive = tmlIsActive; }

    public String getTmlCreatedBy() { return tmlCreatedBy; }
    public void setTmlCreatedBy(String tmlCreatedBy) { this.tmlCreatedBy = tmlCreatedBy; }

    public String getTmlUpdatedBy() { return tmlUpdatedBy; }
    public void setTmlUpdatedBy(String tmlUpdatedBy) { this.tmlUpdatedBy = tmlUpdatedBy; }

    public OffsetDateTime getTmlCreatedAt() { return tmlCreatedAt; }
    public void setTmlCreatedAt(OffsetDateTime tmlCreatedAt) { this.tmlCreatedAt = tmlCreatedAt; }

    public OffsetDateTime getTmlUpdatedAt() { return tmlUpdatedAt; }
    public void setTmlUpdatedAt(OffsetDateTime tmlUpdatedAt) { this.tmlUpdatedAt = tmlUpdatedAt; }

    public OffsetDateTime getTmlDeletedAt() { return tmlDeletedAt; }
    public void setTmlDeletedAt(OffsetDateTime tmlDeletedAt) { this.tmlDeletedAt = tmlDeletedAt; }
}