package com.example.demo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EventResponse {

    private String id;
    private String domain;
    private String activityTitle;
    private String activityDescription;
    private String expectedImpact;
    private String ngoId;
    private String mode;
    private String eventLink;
    private String scheduleVii;
    private String subSchedule;
    private String sdgsId;
    private String volunteerRoles;
    private String stateId;
    private String districtId;
    private String blockId;
    private String village;
    private String location;
    private String mapLocation;
    private String orgType;
    private String bu;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer volunteersNeeded;
    private String familyParticipation;
    private Integer familyMembersCount;
    private String partnerContact;
    private String contactPerson;
    private String contactDetails;
    private String vehicleArrangement;
    private String status;
    private Boolean isActive;
    private Integer approvalOrder;
    private Long createdBy;
    private Long updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String type;
    private String approvalChannelId;
    private String approvalRoleId;
    private Double gpsLatitude;
    private Double gpsLongitude;
    private String virtualLocationType;
    private String implementedBy;

    public EventResponse(
            String id,
            String domain,
            String activityTitle,
            String activityDescription,
            String expectedImpact,
            String ngoId,
            String mode,
            String eventLink,
            String scheduleVii,
            String subSchedule,
            String sdgsId,
            String volunteerRoles,
            String stateId,
            String districtId,
            String blockId,
            String village,
            String location,
            String mapLocation,
            String orgType,
            String bu,
            LocalDate startDate,
            LocalDate endDate,
            LocalTime startTime,
            LocalTime endTime,
            Integer volunteersNeeded,
            String familyParticipation,
            Integer familyMembersCount,
            String partnerContact,
            String contactPerson,
            String contactDetails,
            String vehicleArrangement,
            String status,
            Boolean isActive,
            Integer approvalOrder,
            Long createdBy,
            Long updatedBy,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime deletedAt,
            String type,
            String approvalChannelId,
            String approvalRoleId,
            Double gpsLatitude,
            Double gpsLongitude,
            String virtualLocationType,
            String implementedBy
    ) {
        this.id = id;
        this.domain = domain;
        this.activityTitle = activityTitle;
        this.activityDescription = activityDescription;
        this.expectedImpact = expectedImpact;
        this.ngoId = ngoId;
        this.mode = mode;
        this.eventLink = eventLink;
        this.scheduleVii = scheduleVii;
        this.subSchedule = subSchedule;
        this.sdgsId = sdgsId;
        this.volunteerRoles = volunteerRoles;
        this.stateId = stateId;
        this.districtId = districtId;
        this.blockId = blockId;
        this.village = village;
        this.location = location;
        this.mapLocation = mapLocation;
        this.orgType = orgType;
        this.bu = bu;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.volunteersNeeded = volunteersNeeded;
        this.familyParticipation = familyParticipation;
        this.familyMembersCount = familyMembersCount;
        this.partnerContact = partnerContact;
        this.contactPerson = contactPerson;
        this.contactDetails = contactDetails;
        this.vehicleArrangement = vehicleArrangement;
        this.status = status;
        this.isActive = isActive;
        this.approvalOrder = approvalOrder;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.type = type;
        this.approvalChannelId = approvalChannelId;
        this.approvalRoleId = approvalRoleId;
        this.gpsLatitude = gpsLatitude;
        this.gpsLongitude = gpsLongitude;
        this.virtualLocationType = virtualLocationType;
        this.implementedBy = implementedBy;
    }

    public String getId() {
        return id;
    }

    public String getDomain() {
        return domain;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public String getExpectedImpact() {
        return expectedImpact;
    }

    public String getNgoId() {
        return ngoId;
    }

    public String getMode() {
        return mode;
    }

    public String getEventLink() {
        return eventLink;
    }

    public String getScheduleVii() {
        return scheduleVii;
    }

    public String getSubSchedule() {
        return subSchedule;
    }

    public String getSdgsId() {
        return sdgsId;
    }

    public String getVolunteerRoles() {
        return volunteerRoles;
    }

    public String getStateId() {
        return stateId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public String getBlockId() {
        return blockId;
    }

    public String getVillage() {
        return village;
    }

    public String getLocation() {
        return location;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public String getOrgType() {
        return orgType;
    }

    public String getBu() {
        return bu;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public Integer getVolunteersNeeded() {
        return volunteersNeeded;
    }

    public String getFamilyParticipation() {
        return familyParticipation;
    }

    public Integer getFamilyMembersCount() {
        return familyMembersCount;
    }

    public String getPartnerContact() {
        return partnerContact;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public String getVehicleArrangement() {
        return vehicleArrangement;
    }

    public String getStatus() {
        return status;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Integer getApprovalOrder() {
        return approvalOrder;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public String getType() {
        return type;
    }

    public String getApprovalChannelId() {
        return approvalChannelId;
    }

    public String getApprovalRoleId() {
        return approvalRoleId;
    }

    public Double getGpsLatitude() {
        return gpsLatitude;
    }

    public Double getGpsLongitude() {
        return gpsLongitude;
    }

    public String getVirtualLocationType() {
        return virtualLocationType;
    }

    public String getImplementedBy() {
        return implementedBy;
    }
}