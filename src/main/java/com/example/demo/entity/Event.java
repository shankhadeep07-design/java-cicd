package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "t_event")
public class Event {

    @Id
    @Column(name = "tevent_id", length = 255, nullable = false)
    private String teventId;

    @Column(name = "tevent_domain", length = 100)
    private String teventDomain;

    @Column(name = "tevent_activity_title", length = 255)
    private String teventActivityTitle;

    @Column(name = "tevent_activity_description", columnDefinition = "text")
    private String teventActivityDescription;

    @Column(name = "tevent_expected_impact", columnDefinition = "text")
    private String teventExpectedImpact;

    @Column(name = "tevent_ngo_id", length = 255)
    private String teventNgoId;

    @Column(name = "tevent_mode", length = 50)
    private String teventMode;

    @Column(name = "tevent_event_link", columnDefinition = "text")
    private String teventEventLink;

    @Column(name = "tevent_schedule_vii", length = 255)
    private String teventScheduleVii;

    @Column(name = "tevent_sub_schedule", length = 255)
    private String teventSubSchedule;

    @Column(name = "tevent_sdgs_id", columnDefinition = "text")
    private String teventSdgsId;

    @Column(name = "tevent_volunteer_roles", columnDefinition = "text")
    private String teventVolunteerRoles;

    @Column(name = "tevent_state_id", length = 255)
    private String teventStateId;

    @Column(name = "tevent_district_id", length = 255)
    private String teventDistrictId;

    @Column(name = "tevent_block_id", length = 255)
    private String teventBlockId;

    @Column(name = "tevent_village", length = 255)
    private String teventVillage;

    @Column(name = "tevent_location", columnDefinition = "text")
    private String teventLocation;

    @Column(name = "tevent_map_location", columnDefinition = "text")
    private String teventMapLocation;

    @Column(name = "tevent_org_type", length = 100)
    private String teventOrgType;

    @Column(name = "tevent_bu", length = 100)
    private String teventBu;

    @Column(name = "tevent_start_date")
    private LocalDate teventStartDate;

    @Column(name = "tevent_end_date")
    private LocalDate teventEndDate;

    @Column(name = "tevent_start_time")
    private LocalTime teventStartTime;

    @Column(name = "tevent_end_time")
    private LocalTime teventEndTime;

    @Column(name = "tevent_volunteers_needed")
    private Integer teventVolunteersNeeded;

    @Column(name = "tevent_family_participation", length = 10)
    private String teventFamilyParticipation;

    @Column(name = "tevent_family_members_count")
    private Integer teventFamilyMembersCount;

    @Column(name = "tevent_partner_contact", columnDefinition = "text")
    private String teventPartnerContact;

    @Column(name = "tevent_contact_person", length = 255)
    private String teventContactPerson;

    @Column(name = "tevent_contact_details", columnDefinition = "text")
    private String teventContactDetails;

    @Column(name = "tevent_vehicle_arrangement", length = 10)
    private String teventVehicleArrangement;

    @Column(name = "tevent_status", length = 50)
    private String teventStatus = "draft";

    @Column(name = "tevent_is_active")
    private Boolean teventIsActive = true;

    @Column(name = "tevent_approval_order")
    private Integer teventApprovalOrder;

    @Column(name = "tevent_created_by")
    private Long teventCreatedBy;

    @Column(name = "tevent_updated_by")
    private Long teventUpdatedBy;

    @Column(name = "tevent_created_at")
    private LocalDateTime teventCreatedAt;

    @Column(name = "tevent_updated_at")
    private LocalDateTime teventUpdatedAt;

    @Column(name = "tevent_deleted_at")
    private LocalDateTime teventDeletedAt;

    @Column(name = "tevent_type")
    private String teventType;

    @Column(name = "tevent_approval_channel_id")
    private String teventApprovalChannelId;

    @Column(name = "tevent_approval_role_id")
    private String teventApprovalRoleId;

    @Column(name = "tevent_gps_latitude")
    private Double teventGpsLatitude;

    @Column(name = "tevent_gps_longitude")
    private Double teventGpsLongitude;

    @Column(name = "tevent_virtual_location_type")
    private String teventVirtualLocationType;

    @Column(name = "tevent_implemented_by", length = 50)
    private String teventImplementedBy;

    public String getTeventId() {
        return teventId;
    }

    public void setTeventId(String teventId) {
        this.teventId = teventId;
    }

    public String getTeventDomain() {
        return teventDomain;
    }

    public void setTeventDomain(String teventDomain) {
        this.teventDomain = teventDomain;
    }

    public String getTeventActivityTitle() {
        return teventActivityTitle;
    }

    public void setTeventActivityTitle(String teventActivityTitle) {
        this.teventActivityTitle = teventActivityTitle;
    }

    public String getTeventActivityDescription() {
        return teventActivityDescription;
    }

    public void setTeventActivityDescription(String teventActivityDescription) {
        this.teventActivityDescription = teventActivityDescription;
    }

    public String getTeventExpectedImpact() {
        return teventExpectedImpact;
    }

    public void setTeventExpectedImpact(String teventExpectedImpact) {
        this.teventExpectedImpact = teventExpectedImpact;
    }

    public String getTeventNgoId() {
        return teventNgoId;
    }

    public void setTeventNgoId(String teventNgoId) {
        this.teventNgoId = teventNgoId;
    }

    public String getTeventMode() {
        return teventMode;
    }

    public void setTeventMode(String teventMode) {
        this.teventMode = teventMode;
    }

    public String getTeventEventLink() {
        return teventEventLink;
    }

    public void setTeventEventLink(String teventEventLink) {
        this.teventEventLink = teventEventLink;
    }

    public String getTeventScheduleVii() {
        return teventScheduleVii;
    }

    public void setTeventScheduleVii(String teventScheduleVii) {
        this.teventScheduleVii = teventScheduleVii;
    }

    public String getTeventSubSchedule() {
        return teventSubSchedule;
    }

    public void setTeventSubSchedule(String teventSubSchedule) {
        this.teventSubSchedule = teventSubSchedule;
    }

    public String getTeventSdgsId() {
        return teventSdgsId;
    }

    public void setTeventSdgsId(String teventSdgsId) {
        this.teventSdgsId = teventSdgsId;
    }

    public String getTeventVolunteerRoles() {
        return teventVolunteerRoles;
    }

    public void setTeventVolunteerRoles(String teventVolunteerRoles) {
        this.teventVolunteerRoles = teventVolunteerRoles;
    }

    public String getTeventStateId() {
        return teventStateId;
    }

    public void setTeventStateId(String teventStateId) {
        this.teventStateId = teventStateId;
    }

    public String getTeventDistrictId() {
        return teventDistrictId;
    }

    public void setTeventDistrictId(String teventDistrictId) {
        this.teventDistrictId = teventDistrictId;
    }

    public String getTeventBlockId() {
        return teventBlockId;
    }

    public void setTeventBlockId(String teventBlockId) {
        this.teventBlockId = teventBlockId;
    }

    public String getTeventVillage() {
        return teventVillage;
    }

    public void setTeventVillage(String teventVillage) {
        this.teventVillage = teventVillage;
    }

    public String getTeventLocation() {
        return teventLocation;
    }

    public void setTeventLocation(String teventLocation) {
        this.teventLocation = teventLocation;
    }

    public String getTeventMapLocation() {
        return teventMapLocation;
    }

    public void setTeventMapLocation(String teventMapLocation) {
        this.teventMapLocation = teventMapLocation;
    }

    public String getTeventOrgType() {
        return teventOrgType;
    }

    public void setTeventOrgType(String teventOrgType) {
        this.teventOrgType = teventOrgType;
    }

    public String getTeventBu() {
        return teventBu;
    }

    public void setTeventBu(String teventBu) {
        this.teventBu = teventBu;
    }

    public LocalDate getTeventStartDate() {
        return teventStartDate;
    }

    public void setTeventStartDate(LocalDate teventStartDate) {
        this.teventStartDate = teventStartDate;
    }

    public LocalDate getTeventEndDate() {
        return teventEndDate;
    }

    public void setTeventEndDate(LocalDate teventEndDate) {
        this.teventEndDate = teventEndDate;
    }

    public LocalTime getTeventStartTime() {
        return teventStartTime;
    }

    public void setTeventStartTime(LocalTime teventStartTime) {
        this.teventStartTime = teventStartTime;
    }

    public LocalTime getTeventEndTime() {
        return teventEndTime;
    }

    public void setTeventEndTime(LocalTime teventEndTime) {
        this.teventEndTime = teventEndTime;
    }

    public Integer getTeventVolunteersNeeded() {
        return teventVolunteersNeeded;
    }

    public void setTeventVolunteersNeeded(Integer teventVolunteersNeeded) {
        this.teventVolunteersNeeded = teventVolunteersNeeded;
    }

    public String getTeventFamilyParticipation() {
        return teventFamilyParticipation;
    }

    public void setTeventFamilyParticipation(String teventFamilyParticipation) {
        this.teventFamilyParticipation = teventFamilyParticipation;
    }

    public Integer getTeventFamilyMembersCount() {
        return teventFamilyMembersCount;
    }

    public void setTeventFamilyMembersCount(Integer teventFamilyMembersCount) {
        this.teventFamilyMembersCount = teventFamilyMembersCount;
    }

    public String getTeventPartnerContact() {
        return teventPartnerContact;
    }

    public void setTeventPartnerContact(String teventPartnerContact) {
        this.teventPartnerContact = teventPartnerContact;
    }

    public String getTeventContactPerson() {
        return teventContactPerson;
    }

    public void setTeventContactPerson(String teventContactPerson) {
        this.teventContactPerson = teventContactPerson;
    }

    public String getTeventContactDetails() {
        return teventContactDetails;
    }

    public void setTeventContactDetails(String teventContactDetails) {
        this.teventContactDetails = teventContactDetails;
    }

    public String getTeventVehicleArrangement() {
        return teventVehicleArrangement;
    }

    public void setTeventVehicleArrangement(String teventVehicleArrangement) {
        this.teventVehicleArrangement = teventVehicleArrangement;
    }

    public String getTeventStatus() {
        return teventStatus;
    }

    public void setTeventStatus(String teventStatus) {
        this.teventStatus = teventStatus;
    }

    public Boolean getTeventIsActive() {
        return teventIsActive;
    }

    public void setTeventIsActive(Boolean teventIsActive) {
        this.teventIsActive = teventIsActive;
    }

    public Integer getTeventApprovalOrder() {
        return teventApprovalOrder;
    }

    public void setTeventApprovalOrder(Integer teventApprovalOrder) {
        this.teventApprovalOrder = teventApprovalOrder;
    }

    public Long getTeventCreatedBy() {
        return teventCreatedBy;
    }

    public void setTeventCreatedBy(Long teventCreatedBy) {
        this.teventCreatedBy = teventCreatedBy;
    }

    public Long getTeventUpdatedBy() {
        return teventUpdatedBy;
    }

    public void setTeventUpdatedBy(Long teventUpdatedBy) {
        this.teventUpdatedBy = teventUpdatedBy;
    }

    public LocalDateTime getTeventCreatedAt() {
        return teventCreatedAt;
    }

    public void setTeventCreatedAt(LocalDateTime teventCreatedAt) {
        this.teventCreatedAt = teventCreatedAt;
    }

    public LocalDateTime getTeventUpdatedAt() {
        return teventUpdatedAt;
    }

    public void setTeventUpdatedAt(LocalDateTime teventUpdatedAt) {
        this.teventUpdatedAt = teventUpdatedAt;
    }

    public LocalDateTime getTeventDeletedAt() {
        return teventDeletedAt;
    }

    public void setTeventDeletedAt(LocalDateTime teventDeletedAt) {
        this.teventDeletedAt = teventDeletedAt;
    }

    public String getTeventType() {
        return teventType;
    }

    public void setTeventType(String teventType) {
        this.teventType = teventType;
    }

    public String getTeventApprovalChannelId() {
        return teventApprovalChannelId;
    }

    public void setTeventApprovalChannelId(String teventApprovalChannelId) {
        this.teventApprovalChannelId = teventApprovalChannelId;
    }

    public String getTeventApprovalRoleId() {
        return teventApprovalRoleId;
    }

    public void setTeventApprovalRoleId(String teventApprovalRoleId) {
        this.teventApprovalRoleId = teventApprovalRoleId;
    }

    public Double getTeventGpsLatitude() {
        return teventGpsLatitude;
    }

    public void setTeventGpsLatitude(Double teventGpsLatitude) {
        this.teventGpsLatitude = teventGpsLatitude;
    }

    public Double getTeventGpsLongitude() {
        return teventGpsLongitude;
    }

    public void setTeventGpsLongitude(Double teventGpsLongitude) {
        this.teventGpsLongitude = teventGpsLongitude;
    }

    public String getTeventVirtualLocationType() {
        return teventVirtualLocationType;
    }

    public void setTeventVirtualLocationType(String teventVirtualLocationType) {
        this.teventVirtualLocationType = teventVirtualLocationType;
    }

    public String getTeventImplementedBy() {
        return teventImplementedBy;
    }

    public void setTeventImplementedBy(String teventImplementedBy) {
        this.teventImplementedBy = teventImplementedBy;
    }
}