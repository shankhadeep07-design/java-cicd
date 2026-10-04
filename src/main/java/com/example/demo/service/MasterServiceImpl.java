// src/main/java/com/example/demo/service/MasterServiceImpl.java
package com.example.demo.service;

import com.example.demo.dto.*;
import com.example.demo.entity.*;
import com.example.demo.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.demo.exception.ResourceNotFoundException;  // <-- new import needed

import java.text.Normalizer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


import com.example.demo.dto.response.ThemeResponse;     // <-- DTO (building the response)
import com.example.demo.dto.response.PagedResponse;     // <-- wrapper (building the paginated result)


import com.example.demo.dto.response.MasterListResponse;
import com.example.demo.dto.response.PagedResponse;


import com.example.demo.dto.response.PagedResponse;

import com.example.demo.dto.response.SubScheduleResponse;
import com.example.demo.dto.response.PagedResponse;

import com.example.demo.dto.response.PagedResponse;



import org.springframework.transaction.annotation.Transactional;
import com.example.demo.security.CurrentUser;
@Service
public class MasterServiceImpl implements MasterService {

    @Autowired
    private MasterRepository masterRepository;

    @Override
    public List<MasterResponse> getAllDepartments() {
        return masterRepository.findAllDepartments()
                .stream()
                .map(dept -> new MasterResponse(dept.getTdId(), dept.getTdDepartmentName()))
                .collect(Collectors.toList());
    }

    @Override
    public List<MasterResponse> getAllRoles() {
        return masterRepository.findAllRoles()
                .stream()
                .map(role -> new MasterResponse(role.getRoleId(), role.getRoleName()))
                .collect(Collectors.toList());
    }

    @Override
    public List<MasterResponse> getAllApprovals() {
        List<ApprovalPathEntity> entities = masterRepository.getAllApprovals();

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No approval paths configured");
        }

        return entities.stream()
                .map(approval -> new MasterResponse(approval.getTacId(), approval.getTacModuleName()))
                .collect(Collectors.toList());
    }


    @Override
    public List<MasterResponse> getAllStates() {
        List<State> entities = masterRepository.getAllStates();

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No states configured");
        }

        return entities.stream()
                .map(state -> new MasterResponse(state.getTslStateId(), state.getTslStateName()))
                .collect(Collectors.toList());
    }



    @Override
    public List<MasterResponse> getAllDistricts() {
        List<District> entities = masterRepository.getAllDistricts();

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No districts configured");
        }

        return entities.stream()
                .map(district -> new MasterResponse(district.getTdlDistrictId(), district.getTdlDistrictName()))
                .collect(Collectors.toList());
    }


    // MasterServiceImpl
    @Override
    public List<MasterResponse> getAllSubDistrict() {
        List<SubDistrict> entities = masterRepository.getAllSubDistrict();

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No sub-districts configured");
        }

        return entities.stream()
                .map(sd -> new MasterResponse(sd.getTblBlockId(), sd.getTblBlockName()))
                .collect(Collectors.toList());
    }


    @Override
    public List<FactoryResponse> getAllFactory() {
        List<Factory> entities = masterRepository.getAllFactory();

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No factories configured");
        }

        return entities.stream()
                .map(factory -> new FactoryResponse(
                        factory.getTfactFactoryId(),
                        factory.getTfactFactoryName(),
                        factory.getTfactStateId(),
                        factory.getTfactDistrictId(),
                        factory.getTfactBlockId(),
                        factory.getTfactLocationId(),
                        factory.getTfactIsActive(),
                        factory.getTfactCreatedBy(),
                        factory.getTfactUpdatedBy(),
                        factory.getTfactCreatedAt(),
                        factory.getTfactUpdatedAt(),
                        factory.getTfactDeletedAt(),
                        factory.getTfactBusinessAreaId()
                ))
                .collect(Collectors.toList());
    }




    @Override
    public List<ProfitCenterResponse> getAllProfitCenters() {
        List<ProfitCenter> entities = masterRepository.getAllProfitCenters();

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No profit centers configured");
        }

        return entities.stream()
                .map(pc -> new ProfitCenterResponse(
                        pc.getTprofcId(),
                        pc.getTprofcCorporate(),
                        pc.getTprofcBu(),
                        pc.getTprofcGlAccount(),
                        pc.getTprofcProfitCentre(),
                        pc.getTprofcCostCentre(),
                        pc.getTprofcStateId(),
                        pc.getTprofcDistrictId(),
                        pc.getTprofcLocationId(),
                        pc.getTprofcIsActive(),
                        pc.getTprofcCreatedBy(),
                        pc.getTprofcUpdatedBy(),
                        pc.getTprofcCreatedAt(),
                        pc.getTprofcUpdatedAt(),
                        pc.getTprofcDeletedAt()
                ))
                .collect(Collectors.toList());
    }


    @Override
    public List<DomainResponse> getAllDomains() {
        List<Domain> entities = masterRepository.getAllDomains();

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No domains configured");
        }

        return entities.stream()
                .map(domain -> new DomainResponse(
                        domain.getTdnDomainId(),
                        domain.getTdnDomainName(),
                        domain.getTdnIsActive(),
                        domain.getTdnCreatedBy(),
                        domain.getTdnUpdatedBy(),
                        domain.getTdnCreatedAt(),
                        domain.getTdnUpdatedAt(),
                        domain.getTdnDeletedAt(),
                        domain.getTdnSlug()
                ))
                .collect(Collectors.toList());
    }




    @Override
    public PagedResponse<ThemeResponse> getAllThemes(int page, int size) {
        List<ThemeMaster> entities = masterRepository.getThemesPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No themes configured");
        }

        List<ThemeResponse> themes = entities.stream()
                .map(theme -> new ThemeResponse(
                        theme.getTthmThemeId(),
                        theme.getTthmThemeName(),
                        theme.getTthmIsActive(),
                        theme.getTthmCreatedBy(),
                        theme.getTthmUpdatedBy(),
                        theme.getTthmCreatedAt(),
                        theme.getTthmUpdatedAt(),
                        theme.getTthmDeletedAt(),
                        theme.getTthmDomainId()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countThemes();

        return new PagedResponse<>(themes, page, size, totalElements);
    }



    @Override
    public PagedResponse<MasterListResponse> getAllMasterList(int page, int size) {
        List<Master> entities = masterRepository.getMasterListPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No master list entries configured");
        }

        List<MasterListResponse> masterList = entities.stream()
                .map(m -> new MasterListResponse(
                        m.getTmlId(),
                        m.getTmlMasterListName(),
                        m.getTmlMasterListDesc(),
                        m.getTmlMasterListSlug(),
                        m.getTmlIsActive(),
                        m.getTmlCreatedBy(),
                        m.getTmlUpdatedBy(),
                        m.getTmlCreatedAt(),
                        m.getTmlUpdatedAt(),
                        m.getTmlDeletedAt()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countMasterList();

        return new PagedResponse<>(masterList, page, size, totalElements);
    }




    @Override
    public PagedResponse<ScheduleSevenResponse> getAllScheduleSeven(int page, int size) {
        List<ScheduleSeven> entities = masterRepository.getScheduleSevenPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No schedule seven entries configured");
        }

        List<ScheduleSevenResponse> scheduleSevenList = entities.stream()
                .map(s -> new ScheduleSevenResponse(
                        s.getTschmScheduleId(),
                        s.getTschmScheduleName(),
                        s.getTschmIsActive(),
                        s.getTschmCreatedBy(),
                        s.getTschmUpdatedBy(),
                        s.getTschmCreatedAt(),
                        s.getTschmUpdatedAt(),
                        s.getTschmDeletedAt(),
                        s.getTschmScheduleViiLineItem(),
                        s.getTschmSubActivityItemNumber(),
                        s.getTschmSubActivityDescription()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countScheduleSeven();

        return new PagedResponse<>(scheduleSevenList, page, size, totalElements);
    }


    @Override
    public PagedResponse<SubScheduleResponse> getAllSubSchedule(int page, int size) {
        List<SubSchedule> entities = masterRepository.getSubSchedulePaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No sub schedule entries configured");
        }

        List<SubScheduleResponse> subScheduleList = entities.stream()
                .map(ss -> new SubScheduleResponse(
                        ss.getTsubshcmSubScheduleId(),
                        ss.getTsubshcmSubScheduleName(),
                        ss.getTsubshcmScheduleId(),
                        ss.getTsubshcmIsActive(),
                        ss.getTsubshcmCreatedBy(),
                        ss.getTsubshcmUpdatedBy(),
                        ss.getTsubshcmCreatedAt(),
                        ss.getTsubshcmUpdatedAt(),
                        ss.getTsubshcmDeletedAt()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countSubSchedule();

        return new PagedResponse<>(subScheduleList, page, size, totalElements);
    }



    @Override
    public PagedResponse<ActivityResponse> getAllActivity(int page, int size) {
        List<Activity> entities = masterRepository.getActivityPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No activities configured");
        }

        List<ActivityResponse> activityList = entities.stream()
                .map(a -> new ActivityResponse(
                        a.getTactmActivityId(),
                        a.getTactmActivityName(),
                        a.getTactmScheduleId(),
                        a.getTactmFocusAreaId(),
                        a.getTactmIsActive(),
                        a.getTactmCreatedBy(),
                        a.getTactmUpdatedBy(),
                        a.getTactmCreatedAt(),
                        a.getTactmUpdatedAt(),
                        a.getTactmDeletedAt()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countActivity();

        return new PagedResponse<>(activityList, page, size, totalElements);
    }



    @Override
    public PagedResponse<SubActivityResponse> getAllSubActivity(int page, int size) {
        List<SubActivity> entities = masterRepository.getSubActivityPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No sub activities configured");
        }

        List<SubActivityResponse> subActivityList = entities.stream()
                .map(sa -> new SubActivityResponse(
                        sa.getTsactmSubActivityId(),
                        sa.getTsactmSubActivityName(),
                        sa.getTsactmScheduleId(),
                        sa.getTsactmFocusAreaId(),
                        sa.getTsactmActivityId(),
                        sa.getTsactmIsActive(),
                        sa.getTsactmCreatedBy(),
                        sa.getTsactmUpdatedBy(),
                        sa.getTsactmCreatedAt(),
                        sa.getTsactmUpdatedAt(),
                        sa.getTsactmDeletedAt()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countSubActivity();

        return new PagedResponse<>(subActivityList, page, size, totalElements);
    }


    public PagedResponse<SdgResponse> getAllSdg(int page, int size) {

        List<Sdg> entities = masterRepository.getSdgPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No SDGs configured");
        }

        List<SdgResponse> sdgList = entities.stream()
                .map(sdg -> new SdgResponse(
                        sdg.getTsdgId(),
                        sdg.getTsdgName(),
                        sdg.getTsdgIsActive(),
                        sdg.getTsdgCreatedBy(),
                        sdg.getTsdgUpdatedBy(),
                        sdg.getTsdgCreatedAt(),
                        sdg.getTsdgUpdatedAt(),
                        sdg.getTsdgDeletedAt(),
                        sdg.getTsdgDesc()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countSdg();

        return new PagedResponse<>(sdgList, page, size, totalElements);
    }



    @Override
    public PagedResponse<NationalIndicatorResponse> getAllNationalIndicator(int page, int size) {

        List<NationalIndicator> entities =
                masterRepository.getNationalIndicatorPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No national indicators configured");
        }

        List<NationalIndicatorResponse> nationalIndicatorList = entities.stream()
                .map(ni -> new NationalIndicatorResponse(
                        ni.getTnifId(),
                        ni.getTnifSdgId(),
                        ni.getTnifTarget(),
                        ni.getTnifIndicator(),
                        ni.getTnifIsActive(),
                        ni.getTnifCreatedBy(),
                        ni.getTnifUpdatedBy(),
                        ni.getTnifCreatedAt(),
                        ni.getTnifUpdatedAt(),
                        ni.getTnifDeletedAt()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countNationalIndicator();

        return new PagedResponse<>(
                nationalIndicatorList,
                page,
                size,
                totalElements
        );
    }




    @Override
    public PagedResponse<BudgetingResponse> getAllBudgeting(int page, int size) {

        List<Budgeting> entities =
                masterRepository.getBudgetingPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No budgeting configured");
        }

        List<BudgetingResponse> budgetingList = entities.stream()
                .map(b -> new BudgetingResponse(
                        b.getTbmId(),
                        b.getTbmType(),
                        b.getTbmFyId(),
                        b.getTbmDomainId(),
                        b.getTbmPlantId(),
                        b.getTbmBuId(),
                        b.getTbmStateId(),
                        b.getTbmDistrictId(),
                        b.getTbmBlockId(),
                        b.getTbmGlCode(),
                        b.getTbmProfitCenter(),
                        b.getTbmNatureOfProject(),
                        b.getTbmProjectConcise(),
                        b.getTbmProjectDuration(),
                        b.getTbmNationalIndicatorFramework(),
                        b.getTbmTotalBudgetAmount(),
                        b.getTbmBudgetList(),
                        b.getTbmStatus(),
                        b.getTbmApprovalOrder(),
                        b.getTbmFlArchive(),
                        b.getTbmCreatedBy(),
                        b.getTbmUpdatedBy(),
                        b.getTbmCreatedAt(),
                        b.getTbmUpdatedAt(),
                        b.getTbmDeletedAt(),
                        b.getTbmApprovalId(),
                        b.getTbmApproverIndex(),
                        b.getTbmUserRoleId(),
                        b.getTbmNotType(),
                        b.getTbmThemeId(),
                        b.getTbmForward(),
                        b.getTbmDepartmentId(),
                        b.getTbmForwardedToDepartment(),
                        b.getTbmForwardSequence(),
                        b.getTbmForwardRoleId(),
                        b.getTbmForwardUserId(),
                        b.getTbmBackForwardRoleId(),
                        b.getTbmBackForwardUserId(),
                        b.getTbmUserId()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countBudgeting();

        return new PagedResponse<>(
                budgetingList,
                page,
                size,
                totalElements
        );
    }




    @Override
    public PagedResponse<ProposalResponse> getAllProposal(int page, int size) {

        List<Proposal> entities =
                masterRepository.getProposalPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No proposals configured");
        }

        List<ProposalResponse> proposalList = entities.stream()
                .map(p -> new ProposalResponse(
                        p.getTprosId(),
                        p.getTprosFinancialYearId(),
                        p.getTprosProposalName(),
                        p.getTprosCurrentDate(),
                        p.getTprosNatureOfTheProject(),
                        p.getTprosProjectType(),
                        p.getTprosNgoEngagement(),
                        p.getTprosDescription(),
                        p.getTprosBaseProjectYear(),
                        p.getTprosProjectValue(),
                        p.getTprosDateOfTheProgram(),
                        p.getTprosStartDate(),
                        p.getTprosEndDate(),
                        p.getTprosFrequency(),
                        p.getTprosState(),
                        p.getTprosDistrict(),
                        p.getTprosSubDistrict(),
                        p.getTprosLocation(),
                        p.getTprosGpsLatitude(),
                        p.getTprosGpsLongitude(),
                        p.getTprosIsAspirationalDistrict(),
                        p.getTprosIsGromorVillage(),
                        p.getTprosScheduleSeven(),
                        p.getTprosSdg(),
                        p.getTprosOrgUnit(),
                        p.getTprosBu(),
                        p.getTprosThematicArea(),
                        p.getTprosGlCode(),
                        p.getTprosProfitCenter(),
                        p.getTprosCostCenter(),
                        p.getTprosTargetBeneficiaries(),
                        p.getTprosMaleBeneficiaries(),
                        p.getTprosFemaleBeneficiaries(),
                        p.getTprosMixGroupBeneficiaries(),
                        p.getTprosTypeOfTheProject(),
                        p.getTprosTypeOfTheSubProject(),
                        p.getTprosApprovedLineItem(),
                        p.getTprosAllocateBudgetForApprovedLineItem(),
                        p.getTprosUtilizedTillDate(),
                        p.getTprosProjectBudget(),
                        p.getTprosImplementationBy(),
                        p.getTprosImplementationPartnerName(),
                        p.getTprosNgoComplianceCheck(),
                        p.getTprosVendorComplianceCheck(),
                        p.getTprosProgramBackground(),
                        p.getTprosBaselineDataInformation(),
                        p.getTprosProposalDetails(),
                        p.getTprosGovtSchemeLinkage(),
                        p.getTprosStakeholderRequestLevel(),
                        p.getTprosGovernmentApproval(),
                        p.getTprosProgramObjective(),
                        p.getTprosActivitiesPlanned(),
                        p.getTprosExpectedOutcome(),
                        p.getTprosProjectUniqueness(),
                        p.getTprosBrandingCommunication(),
                        p.getTprosMonitoringScope(),
                        p.getTprosBudgetBreakup(),
                        p.getTprosParticular(),
                        p.getTprosUnit(),
                        p.getTprosNoOfUnits(),
                        p.getTprosUnitCost(),
                        p.getTprosTotalAmount(),
                        p.getTprosGstAmount(),
                        p.getTprosTotalInclGst(),
                        p.getTprosCapexCost(),
                        p.getTprosOpexCost(),
                        p.getTprosServiceCharges(),
                        p.getTprosTaxDetails(),
                        p.getTprosTotalProjectCost(),
                        p.getTprosStatus(),
                        p.getTprosApprovalOrder(),
                        p.getTprosApprovalType(),
                        p.getTprosFlArchive(),
                        p.getTprosCreatedBy(),
                        p.getTprosUpdatedBy(),
                        p.getTprosCreatedAt(),
                        p.getTprosUpdatedAt(),
                        p.getTprosDeletedAt(),
                        p.getTprosL1PartyBudget(),
                        p.getTprosRecommendedParty(),
                        p.getTprosJustificationOtherThanL1(),
                        p.getTprosSinglePartyJustification(),
                        p.getTprosRemarks(),
                        p.getTprosApproverIndex(),
                        p.getTprosUserRoleId(),
                        p.getTprosApprovalId(),
                        p.getTprosNotType(),
                        p.getTprosFactoryId(),
                        p.getTprosSubSchedule(),
                        p.getTprosDomainId(),
                        p.getTprosNgoId(),
                        p.getTprosForward(),
                        p.getTprosDepartmentId(),
                        p.getTprosForwardedToDepartment(),
                        p.getTprosForwardSequence(),
                        p.getTprosForwardRoleId(),
                        p.getTprosForwardUserId(),
                        p.getTprosBackForwardRoleId(),
                        p.getTprosBackForwardUserId(),
                        p.getTprosUserId()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countProposal();

        return new PagedResponse<>(
                proposalList,
                page,
                size,
                totalElements
        );
    }



    @Override
    public PagedResponse<ProjectResponse> getAllProject(int page, int size) {

        List<Project> entities =
                masterRepository.getProjectPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No projects configured");
        }

        List<ProjectResponse> projectList = entities.stream()
                .map(p -> new ProjectResponse(
                        p.getTprojId(),
                        p.getTprojProposalId(),
                        p.getTprojFinancialYearId(),
                        p.getTprojStateId(),
                        p.getTprojDistrictId(),
                        p.getTprojBlockId(),
                        p.getTprojLocationId(),
                        p.getTprojLatitude(),
                        p.getTprojLongitude(),
                        p.getTprojThemeId(),
                        p.getTprojProposalName(),
                        p.getTprojProjectTypeId(),
                        p.getTprojSubProjectId(),
                        p.getTprojSdgId(),
                        p.getTprojScheduleSevenId(),
                        p.getTprojAllocateBudgetAmount(),
                        p.getTprojUtilizedTillToday(),
                        p.getTprojFlArchive(),
                        p.getTprojCreatedBy(),
                        p.getTprojUpdatedBy(),
                        p.getTprojCreatedAt(),
                        p.getTprojUpdatedAt(),
                        p.getTprojDeletedAt(),
                        p.getTprojStatus(),
                        p.getTprojUniqueId()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countProject();

        return new PagedResponse<>(
                projectList,
                page,
                size,
                totalElements
        );
    }



    @Override
    public PagedResponse<NgoResponse> getAllNgo(int page, int size) {

        List<Ngo> entities =
                masterRepository.getNgoPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No NGOs configured");
        }

        List<NgoResponse> ngoList = entities.stream()
                .map(n -> new NgoResponse(
                        n.getTngoId(),
                        n.getTngoName(),
                        n.getTngoCsrOneResOrg(),
                        n.getTngoResCertificateOrg(),
                        n.getTngoRegisterId(),
                        n.getTngoPanCardOrg(),
                        n.getTngoTwelveAaCertificate(),
                        n.getTngoEightyGCertificateOrg(),
                        n.getTngoListOfExistGovBodyMembers(),
                        n.getTngoDetailsOfOfficeBearers(),
                        n.getTngoAuditReportOrgWithIncomeTaxReturn(),
                        n.getTngoBankAccountNo(),
                        n.getTngoBankAccountName(),
                        n.getTngoBankName(),
                        n.getTngoBankIfscCode(),
                        n.getTngoBankAddressOfTheBank(),
                        n.getTngoFcraRegCertificate(),
                        n.getTngoNitiAayogDarpanReg(),
                        n.getTngoCompleteAddressRegDocOrg(),
                        n.getTngoContactName(),
                        n.getTngoContactPhoneNo(),
                        n.getTngoContactEmail(),
                        n.getTngoContactOfficeAddress(),
                        n.getTngoKeyPersonName(),
                        n.getTngoKeyPersonPhoneNo(),
                        n.getTngoKeyPersonEmail(),
                        n.getTngoKeyPersonOfficeAddress(),
                        n.getTngoUserId(),
                        n.getTngoStatus(),
                        n.getTngoCreatedBy(),
                        n.getTngoCreatedAt(),
                        n.getTngoUpdatedBy(),
                        n.getTngoUpdatedAt(),
                        n.getTngoDeletedAt(),
                        n.getTngoFlArchive(),
                        n.getTngoApprovalOrder(),
                        n.getTngoRegisterStatus(),
                        n.getTngoDate(),
                        n.getTngoAmountReceived(),
                        n.getTngoAmountSpent(),
                        n.getTngoNameOfEntity(),
                        n.getTngoStatusOfEntityId(),
                        n.getTngoRegisteredOffAddress(),
                        n.getTngoCorporateOffAddress(),
                        n.getTngoBranches(),
                        n.getTngoNameOfGroup(),
                        n.getTngoPan(),
                        n.getTngoGst(),
                        n.getTngoWebsite(),
                        n.getTngoIsGstAvailable()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countNgo();

        return new PagedResponse<>(
                ngoList,
                page,
                size,
                totalElements
        );
    }



    @Override
    public PagedResponse<BestPracticeResponse> getAllBestPractice(int page, int size) {

        List<BestPractice> entities =
                masterRepository.getBestPracticePaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No best practices configured");
        }

        List<BestPracticeResponse> bestPracticeList = entities.stream()
                .map(bp -> new BestPracticeResponse(
                        bp.getTbpId(),
                        bp.getTbpProjectId(),
                        bp.getTbpThemeId(),
                        bp.getTbpFocusAreaId(),
                        bp.getTbpProblem(),
                        bp.getTbpSolution(),
                        bp.getTbpBenefit(),
                        bp.getTbpIsActive(),
                        bp.getTbpCreatedBy(),
                        bp.getTbpUpdatedBy(),
                        bp.getTbpCreatedAt(),
                        bp.getTbpUpdatedAt(),
                        bp.getTbpDeletedAt()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countBestPractice();

        return new PagedResponse<>(
                bestPracticeList,
                page,
                size,
                totalElements
        );
    }



    @Override
    public PagedResponse<EventResponse> getAllEvent(int page, int size) {

        List<Event> entities =
                masterRepository.getEventPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No events configured");
        }

        List<EventResponse> eventList = entities.stream()
                .map(e -> new EventResponse(
                        e.getTeventId(),
                        e.getTeventDomain(),
                        e.getTeventActivityTitle(),
                        e.getTeventActivityDescription(),
                        e.getTeventExpectedImpact(),
                        e.getTeventNgoId(),
                        e.getTeventMode(),
                        e.getTeventEventLink(),
                        e.getTeventScheduleVii(),
                        e.getTeventSubSchedule(),
                        e.getTeventSdgsId(),
                        e.getTeventVolunteerRoles(),
                        e.getTeventStateId(),
                        e.getTeventDistrictId(),
                        e.getTeventBlockId(),
                        e.getTeventVillage(),
                        e.getTeventLocation(),
                        e.getTeventMapLocation(),
                        e.getTeventOrgType(),
                        e.getTeventBu(),
                        e.getTeventStartDate(),
                        e.getTeventEndDate(),
                        e.getTeventStartTime(),
                        e.getTeventEndTime(),
                        e.getTeventVolunteersNeeded(),
                        e.getTeventFamilyParticipation(),
                        e.getTeventFamilyMembersCount(),
                        e.getTeventPartnerContact(),
                        e.getTeventContactPerson(),
                        e.getTeventContactDetails(),
                        e.getTeventVehicleArrangement(),
                        e.getTeventStatus(),
                        e.getTeventIsActive(),
                        e.getTeventApprovalOrder(),
                        e.getTeventCreatedBy(),
                        e.getTeventUpdatedBy(),
                        e.getTeventCreatedAt(),
                        e.getTeventUpdatedAt(),
                        e.getTeventDeletedAt(),
                        e.getTeventType(),
                        e.getTeventApprovalChannelId(),
                        e.getTeventApprovalRoleId(),
                        e.getTeventGpsLatitude(),
                        e.getTeventGpsLongitude(),
                        e.getTeventVirtualLocationType(),
                        e.getTeventImplementedBy()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countEvent();

        return new PagedResponse<>(
                eventList,
                page,
                size,
                totalElements
        );
    }




    @Override
    public PagedResponse<BudgetMasterResponse> getAllBudgetMaster(int page, int size) {

        List<BudgetMaster> entities =
                masterRepository.getBudgetMasterPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No budget masters configured");
        }

        List<BudgetMasterResponse> budgetMasterList = entities.stream()
                .map(bm -> new BudgetMasterResponse(
                        bm.getTbmId(),
                        bm.getTbmType(),
                        bm.getTbmFyId(),
                        bm.getTbmDomainId(),
                        bm.getTbmPlantId(),
                        bm.getTbmBuId(),
                        bm.getTbmStateId(),
                        bm.getTbmDistrictId(),
                        bm.getTbmBlockId(),
                        bm.getTbmGlCode(),
                        bm.getTbmProfitCenter(),
                        bm.getTbmNatureOfProject(),
                        bm.getTbmProjectConcise(),
                        bm.getTbmProjectDuration(),
                        bm.getTbmNationalIndicatorFramework(),
                        bm.getTbmTotalBudgetAmount(),
                        bm.getTbmBudgetList(),
                        bm.getTbmStatus(),
                        bm.getTbmApprovalOrder(),
                        bm.getTbmFlArchive(),
                        bm.getTbmCreatedBy(),
                        bm.getTbmUpdatedBy(),
                        bm.getTbmCreatedAt(),
                        bm.getTbmUpdatedAt(),
                        bm.getTbmDeletedAt(),
                        bm.getTbmApprovalId(),
                        bm.getTbmApproverIndex(),
                        bm.getTbmUserRoleId(),
                        bm.getTbmNotType(),
                        bm.getTbmThemeId(),
                        bm.getTbmForward(),
                        bm.getTbmDepartmentId(),
                        bm.getTbmForwardedToDepartment(),
                        bm.getTbmForwardSequence(),
                        bm.getTbmForwardRoleId(),
                        bm.getTbmForwardUserId(),
                        bm.getTbmBackForwardRoleId(),
                        bm.getTbmBackForwardUserId(),
                        bm.getTbmUserId()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countBudgetMaster();

        return new PagedResponse<>(
                budgetMasterList,
                page,
                size,
                totalElements
        );
    }



    @Override
    public PagedResponse<LoginLogoutResponse> getAllLoginLogout(int page, int size) {

        List<LoginLogout> entities =
                masterRepository.getLoginLogoutPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No login logout logs configured");
        }

        List<LoginLogoutResponse> loginLogoutList = entities.stream()
                .map(l -> new LoginLogoutResponse(
                        l.getId(),
                        l.getUserId(),
                        l.getLogType(),
                        l.getIpAddress(),
                        l.getUserAgent(),
                        l.getFlArchive(),
                        l.getStatus(),
                        l.getCreatedAt(),
                        l.getUpdatedAt(),
                        l.getCreatedBy(),
                        l.getUpdatedBy()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countLoginLogout();

        return new PagedResponse<>(
                loginLogoutList,
                page,
                size,
                totalElements
        );
    }



    @Override
    public PagedResponse<ProposalAuditResponse> getAllProposalAudit(int page, int size) {

        List<ProposalAudit> entities =
                masterRepository.getProposalAuditPaginated(page, size);

        if (entities.isEmpty()) {
            throw new ResourceNotFoundException("No proposal audit logs configured");
        }

        List<ProposalAuditResponse> proposalAuditList = entities.stream()
                .map(p -> new ProposalAuditResponse(
                        p.getEventId(),
                        p.getSchemaName(),
                        p.getTableName(),
                        p.getRelid(),
                        p.getSessionUserName(),
                        p.getActionTstampTx(),
                        p.getActionTstampStm(),
                        p.getActionTstampClk(),
                        p.getTransactionId(),
                        p.getApplicationName(),
                        p.getClientAddr(),
                        p.getClientPort(),
                        p.getClientQuery(),
                        p.getAction(),
                        p.getRowData(),
                        p.getChangedFields(),
                        p.getStatementOnly()
                ))
                .collect(Collectors.toList());

        long totalElements = masterRepository.countProposalAudit();

        return new PagedResponse<>(
                proposalAuditList,
                page,
                size,
                totalElements
        );
    }




    @Override
    @Transactional
    public MasterResponse createDepartment(DepartmentRequest request) {
        String name = request.getDepartmentName().trim();

        if (masterRepository.existsDepartmentByName(name)) {
            throw new IllegalArgumentException("Department already exists: " + name);
        }

        LocalDateTime now = LocalDateTime.now();

        Department dept = new Department();
        dept.setTdId(masterRepository.nextDepartmentId());
        dept.setTdDepartmentName(name);
        dept.setTdDepartmentSlug(slugify(name));
        dept.setTdStatus(true);
        dept.setTdCreatedAt(now);
        dept.setTdUpdatedAt(now);

        Department saved = masterRepository.saveDepartment(dept);

        return new MasterResponse(saved.getTdId(), saved.getTdDepartmentName());
    }

    private String slugify(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
        return normalized.toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9]+", "-")
                .replaceAll("(^-|-$)", "");
    }



    @Override
    @Transactional
    public ThemeResponse createTheme(ThemeRequest request) {
        String name = request.getThemeName().trim();

        if (masterRepository.existsThemeByName(name)) {
            throw new IllegalArgumentException("Theme already exists: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        ThemeMaster theme = new ThemeMaster();
        theme.setTthmThemeId(masterRepository.nextThemeId());
        theme.setTthmThemeName(name);
        theme.setTthmIsActive(true);
        theme.setTthmCreatedBy("SYSTEM");   // replace with the logged-in user later
        theme.setTthmUpdatedBy("SYSTEM");
        theme.setTthmCreatedAt(now);
        theme.setTthmUpdatedAt(now);
        theme.setTthmDomainId(request.getDomainId());

        ThemeMaster saved = masterRepository.saveTheme(theme);

        return new ThemeResponse(
                saved.getTthmThemeId(),
                saved.getTthmThemeName(),
                saved.getTthmIsActive(),
                saved.getTthmCreatedBy(),
                saved.getTthmUpdatedBy(),
                saved.getTthmCreatedAt(),
                saved.getTthmUpdatedAt(),
                saved.getTthmDeletedAt(),
                saved.getTthmDomainId()
        );
    }


    @Override
    @Transactional
    public MasterResponse createState(StateRequest request) {
        String name = request.getStateName().trim();

        if (masterRepository.existsStateByName(name)) {
            throw new IllegalArgumentException("State already exists: " + name);
        }

        LocalDateTime now = LocalDateTime.now();

        State state = new State();
        state.setTslStateId(masterRepository.nextStateId());
        state.setTslStateName(name);
        state.setTslIsActive(true);
        state.setTslCreatedBy("SYSTEM");   // replace with the logged-in user later
        state.setTslUpdatedBy("SYSTEM");
        state.setTslCreatedAt(now);
        state.setTslUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        State saved = masterRepository.saveState(state);

        return new MasterResponse(
                saved.getTslStateId(),
                saved.getTslStateName()

        );
    }



    @Override
    @Transactional
    public MasterResponse createDistrict(DistrictRequest request) {
        String name = request.getDistrictName().trim();
        String stateId = request.getStateId().trim();

        if (!masterRepository.existsStateById(stateId)) {
            throw new IllegalArgumentException("State not found: " + stateId);
        }

        if (masterRepository.existsDistrictByNameAndState(name, stateId)) {
            throw new IllegalArgumentException("District already exists in this state: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        District district = new District();
        district.setTdlDistrictId(masterRepository.nextDistrictId());
        district.setTdlDistrictName(name);
        district.setTdlStateId(stateId);
        district.setTdlIsActive(true);
        district.setTdlCreatedBy("SYSTEM");   // replace with the logged-in user later
        district.setTdlUpdatedBy("SYSTEM");
        district.setTdlCreatedAt(now);
        district.setTdlUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        District saved = masterRepository.saveDistrict(district);

        return new MasterResponse(saved.getTdlDistrictId(), saved.getTdlDistrictName());
    }




    @Override
    @Transactional
    public MasterResponse createSubDistrict(SubDistrictRequest request) {
        String name = request.getSubDistrictName().trim();
        String districtId = request.getDistrictId().trim();

        District district = masterRepository.findDistrictById(districtId);
        if (district == null) {
            throw new IllegalArgumentException("District not found: " + districtId);
        }

        if (masterRepository.existsSubDistrictByNameAndDistrict(name, districtId)) {
            throw new IllegalArgumentException("Sub district already exists in this district: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        SubDistrict block = new SubDistrict();
        block.setTblBlockId(masterRepository.nextSubDistrictId());
        block.setTblBlockName(name);
        block.setTblDistrictId(districtId);
        block.setTblStateId(district.getTdlStateId());   // taken from the district
        block.setTblIsActive(true);
        block.setTblCreatedBy("SYSTEM");   // replace with the logged-in user later
        block.setTblUpdatedBy("SYSTEM");
        block.setTblCreatedAt(now);
        block.setTblUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        SubDistrict saved = masterRepository.saveSubDistrict(block);

        return new MasterResponse(saved.getTblBlockId(), saved.getTblBlockName());
    }






    @Override
    @Transactional
    public MasterResponse createFactory(FactoryRequest request) {
        String name = request.getFactoryName().trim();
        String stateId = request.getStateId().trim();
        String districtId = request.getDistrictId().trim();
        String blockId = request.getBlockId().trim();

        if (!masterRepository.existsStateById(stateId)) {
            throw new IllegalArgumentException("State not found: " + stateId);
        }

        District district = masterRepository.findDistrictById(districtId);
        if (district == null) {
            throw new IllegalArgumentException("District not found: " + districtId);
        }
        if (!stateId.equals(district.getTdlStateId())) {
            throw new IllegalArgumentException("District does not belong to the given state");
        }

        SubDistrict block = masterRepository.findSubDistrictById(blockId);
        if (block == null) {
            throw new IllegalArgumentException("Block not found: " + blockId);
        }
        if (!districtId.equals(block.getTblDistrictId())) {
            throw new IllegalArgumentException("Block does not belong to the given district");
        }

        if (masterRepository.existsFactoryByNameAndBlock(name, blockId)) {
            throw new IllegalArgumentException("Factory already exists in this block: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        Factory factory = new Factory();
        factory.setTfactFactoryId(masterRepository.nextFactoryId());
        factory.setTfactFactoryName(name);
        factory.setTfactStateId(stateId);
        factory.setTfactDistrictId(districtId);
        factory.setTfactBlockId(blockId);
        factory.setTfactLocationId(request.getLocationId());
        factory.setTfactBusinessAreaId(request.getBusinessAreaId());
        factory.setTfactIsActive(true);
        factory.setTfactCreatedBy("SYSTEM");   // replace with the logged-in user later
        factory.setTfactUpdatedBy("SYSTEM");
        factory.setTfactCreatedAt(now);
        factory.setTfactUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        Factory saved = masterRepository.saveFactory(factory);

        return new MasterResponse(saved.getTfactFactoryId(), saved.getTfactFactoryName());
    }



    @Override
    @Transactional
    public MasterResponse createProfitCenter(ProfitCenterRequest request) {
        String profitCentre = request.getProfitCentre().trim();
        String stateId = request.getStateId().trim();
        String districtId = request.getDistrictId().trim();

        if (!masterRepository.existsStateById(stateId)) {
            throw new IllegalArgumentException("State not found: " + stateId);
        }

        District district = masterRepository.findDistrictById(districtId);
        if (district == null) {
            throw new IllegalArgumentException("District not found: " + districtId);
        }
        if (!stateId.equals(district.getTdlStateId())) {
            throw new IllegalArgumentException("District does not belong to the given state");
        }

        if (masterRepository.existsProfitCenterByName(profitCentre)) {
            throw new IllegalArgumentException("Profit center already exists: " + profitCentre);
        }

        OffsetDateTime now = OffsetDateTime.now();

        ProfitCenter pc = new ProfitCenter();
        pc.setTprofcId(masterRepository.nextProfitCenterId());
        pc.setTprofcProfitCentre(profitCentre);
        pc.setTprofcCorporate(request.getCorporate());
        pc.setTprofcBu(request.getBu());
        pc.setTprofcGlAccount(request.getGlAccount());
        pc.setTprofcCostCentre(request.getCostCentre());
        pc.setTprofcStateId(stateId);
        pc.setTprofcDistrictId(districtId);
        pc.setTprofcLocationId(request.getLocationId());
        pc.setTprofcIsActive(true);
        // createdBy / updatedBy are bigint: left null until you read the user id from the JWT
        pc.setTprofcCreatedAt(now);
        pc.setTprofcUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        ProfitCenter saved = masterRepository.saveProfitCenter(pc);

        return new MasterResponse(saved.getTprofcId(), saved.getTprofcProfitCentre());
    }

    @Override
    @Transactional
    public MasterResponse createDomain(DomainRequest request) {
        String name = request.getDomainName().trim();

        if (masterRepository.existsDomainByName(name)) {
            throw new IllegalArgumentException("Domain already exists: " + name);
        }

        LocalDateTime now = LocalDateTime.now();

        Domain domain = new Domain();
        domain.setTdnDomainId(masterRepository.nextDomainId());
        domain.setTdnDomainName(name);
        domain.setTdnSlug(slugify(name));
        domain.setTdnIsActive(true);
        domain.setTdnCreatedBy("SYSTEM");   // replace with the logged-in user later
        domain.setTdnUpdatedBy("SYSTEM");
        domain.setTdnCreatedAt(now);
        domain.setTdnUpdatedAt(now);
        // deletedAt stays null

        Domain saved = masterRepository.saveDomain(domain);

        return new MasterResponse(saved.getTdnDomainId(), saved.getTdnDomainName());
    }



    @Override
    @Transactional
    public MasterResponse createMasterList(MasterListRequest request) {
        String name = request.getMasterListName().trim();

        if (masterRepository.existsMasterListByName(name)) {
            throw new IllegalArgumentException("Master list already exists: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        Master ml = new Master();
        ml.setTmlId(masterRepository.nextMasterListId());
        ml.setTmlMasterListName(name);
        ml.setTmlMasterListDesc(request.getMasterListDesc() == null ? null : request.getMasterListDesc().trim());
        ml.setTmlMasterListSlug(slugify(name));
        ml.setTmlIsActive(true);
        ml.setTmlCreatedBy("SYSTEM");   // replace with the logged-in user later
        ml.setTmlUpdatedBy("SYSTEM");
        ml.setTmlCreatedAt(now);
        ml.setTmlUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        Master saved = masterRepository.saveMasterList(ml);

        return new MasterResponse(saved.getTmlId(), saved.getTmlMasterListName());
    }


    @Override
    @Transactional
    public MasterResponse createScheduleSeven(ScheduleSevenRequest request) {
        String name = request.getScheduleName().trim();

        if (masterRepository.existsScheduleSevenByName(name)) {
            throw new IllegalArgumentException("Schedule seven already exists: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        ScheduleSeven s = new ScheduleSeven();
        s.setTschmScheduleId(masterRepository.nextScheduleSevenId());
        s.setTschmScheduleName(name);
        s.setTschmScheduleViiLineItem(trimOrNull(request.getScheduleViiLineItem()));
        s.setTschmSubActivityItemNumber(trimOrNull(request.getSubActivityItemNumber()));
        s.setTschmSubActivityDescription(trimOrNull(request.getSubActivityDescription()));
        s.setTschmIsActive(true);
        s.setTschmCreatedBy("SYSTEM");   // replace with the logged-in user later
        s.setTschmUpdatedBy("SYSTEM");
        s.setTschmCreatedAt(now);
        s.setTschmUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        ScheduleSeven saved = masterRepository.saveScheduleSeven(s);

        return new MasterResponse(saved.getTschmScheduleId(), saved.getTschmScheduleName());
    }

    private String trimOrNull(String value) {
        return (value == null || value.isBlank()) ? null : value.trim();
    }



    @Override
    @Transactional
    public MasterResponse createSubSchedule(SubScheduleRequest request) {

        Long userId = CurrentUser.getId();

        String name = request.getSubScheduleName().trim();
        String scheduleId = request.getScheduleId().trim();

        if (masterRepository.findScheduleSevenById(scheduleId) == null) {
            throw new IllegalArgumentException("Schedule not found: " + scheduleId);
        }

        if (masterRepository.existsSubScheduleByNameAndSchedule(name, scheduleId)) {
            throw new IllegalArgumentException("Sub schedule already exists in this schedule: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        SubSchedule sub = new SubSchedule();
        sub.setTsubshcmSubScheduleId(masterRepository.nextSubScheduleId());
        sub.setTsubshcmSubScheduleName(name);
        sub.setTsubshcmScheduleId(scheduleId);
        sub.setTsubshcmIsActive(true);
        sub.setTsubshcmCreatedBy(String.valueOf(userId));
        sub.setTsubshcmUpdatedBy(String.valueOf(userId));
        sub.setTsubshcmCreatedAt(now);
        sub.setTsubshcmUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        SubSchedule saved = masterRepository.saveSubSchedule(sub);

        return new MasterResponse(saved.getTsubshcmSubScheduleId(), saved.getTsubshcmSubScheduleName());
    }


    @Override
    @Transactional
    public MasterResponse createActivity(ActivityRequest request) {
        String name = request.getActivityName().trim();
        String scheduleId = request.getScheduleId().trim();
        String focusAreaId = (request.getFocusAreaId() == null || request.getFocusAreaId().isBlank())
                ? null : request.getFocusAreaId().trim();

        if (masterRepository.findScheduleSevenById(scheduleId) == null) {
            throw new IllegalArgumentException("Schedule not found: " + scheduleId);
        }

        if (focusAreaId != null) {
            SubSchedule sub = masterRepository.findSubScheduleById(focusAreaId);
            if (sub == null) {
                throw new IllegalArgumentException("Focus area not found: " + focusAreaId);
            }
            if (!scheduleId.equals(sub.getTsubshcmScheduleId())) {
                throw new IllegalArgumentException("Focus area does not belong to the given schedule");
            }
        }

        if (masterRepository.existsActivityByNameAndSchedule(name, scheduleId)) {
            throw new IllegalArgumentException("Activity already exists in this schedule: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        Activity activity = new Activity();
        activity.setTactmActivityId(masterRepository.nextActivityId());
        activity.setTactmActivityName(name);
        activity.setTactmScheduleId(scheduleId);
        activity.setTactmFocusAreaId(focusAreaId);
        activity.setTactmIsActive(true);
        activity.setTactmCreatedBy("SYSTEM");   // replace with the logged-in user later
        activity.setTactmUpdatedBy("SYSTEM");
        activity.setTactmCreatedAt(now);
        activity.setTactmUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        Activity saved = masterRepository.saveActivity(activity);

        return new MasterResponse(saved.getTactmActivityId(), saved.getTactmActivityName());
    }




    @Override
    @Transactional
    public MasterResponse createSubActivity(SubActivityRequest request) {
        String name = request.getSubActivityName().trim();
        String activityId = request.getActivityId().trim();
        String focusAreaId = (request.getFocusAreaId() == null || request.getFocusAreaId().isBlank())
                ? null : request.getFocusAreaId().trim();

        Activity activity = masterRepository.findActivityById(activityId);
        if (activity == null) {
            throw new IllegalArgumentException("Activity not found: " + activityId);
        }

        if (focusAreaId != null) {
            SubSchedule sub = masterRepository.findSubScheduleById(focusAreaId);
            if (sub == null) {
                throw new IllegalArgumentException("Focus area not found: " + focusAreaId);
            }
            if (!sub.getTsubshcmScheduleId().equals(activity.getTactmScheduleId())) {
                throw new IllegalArgumentException("Focus area does not belong to the activity's schedule");
            }
        }

        if (masterRepository.existsSubActivityByNameAndActivity(name, activityId)) {
            throw new IllegalArgumentException("Sub activity already exists in this activity: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        SubActivity sa = new SubActivity();
        sa.setTsactmSubActivityId(masterRepository.nextSubActivityId());
        sa.setTsactmSubActivityName(name);
        sa.setTsactmActivityId(activityId);
        sa.setTsactmScheduleId(activity.getTactmScheduleId());   // taken from the activity
        sa.setTsactmFocusAreaId(focusAreaId != null ? focusAreaId : activity.getTactmFocusAreaId());
        sa.setTsactmIsActive(true);
        sa.setTsactmCreatedBy("SYSTEM");   // replace with the logged-in user later
        sa.setTsactmUpdatedBy("SYSTEM");
        sa.setTsactmCreatedAt(now);
        sa.setTsactmUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        SubActivity saved = masterRepository.saveSubActivity(sa);

        return new MasterResponse(saved.getTsactmSubActivityId(), saved.getTsactmSubActivityName());
    }





    @Override
    @Transactional
    public MasterResponse createSdg(SdgRequest request) {
        String name = request.getName().trim();

        if (masterRepository.existsSdgByName(name)) {
            throw new IllegalArgumentException("SDG already exists: " + name);
        }

        OffsetDateTime now = OffsetDateTime.now();

        Sdg sdg = new Sdg();
        sdg.setTsdgId(masterRepository.nextSdgId());
        sdg.setTsdgName(name);
        sdg.setTsdgDesc(request.getDesc() == null || request.getDesc().isBlank()
                ? null : request.getDesc().trim());
        sdg.setTsdgIsActive(true);
        sdg.setTsdgCreatedBy("SYSTEM");   // replace with the logged-in user later
        sdg.setTsdgUpdatedBy("SYSTEM");
        sdg.setTsdgCreatedAt(now);
        sdg.setTsdgUpdatedAt(now);
        // wkbGeometry and deletedAt stay null

        Sdg saved = masterRepository.saveSdg(sdg);

        return new MasterResponse(saved.getTsdgId(), saved.getTsdgName());
    }



    @Override
    @Transactional
    public MasterResponse createNationalIndicator(NationalIndicatorRequest request) {
        String sdgId = request.getSdgId().trim();
        String indicator = request.getIndicator().trim();
        String target = (request.getTarget() == null || request.getTarget().isBlank())
                ? null : request.getTarget().trim();

        if (masterRepository.findSdgById(sdgId) == null) {
            throw new IllegalArgumentException("SDG not found: " + sdgId);
        }

        if (masterRepository.existsNationalIndicatorByIndicatorAndSdg(indicator, sdgId)) {
            throw new IllegalArgumentException("National indicator already exists for this SDG: " + indicator);
        }

        OffsetDateTime now = OffsetDateTime.now();

        NationalIndicator ni = new NationalIndicator();
        ni.setTnifId(masterRepository.nextNationalIndicatorId());
        ni.setTnifSdgId(sdgId);
        ni.setTnifTarget(target);
        ni.setTnifIndicator(indicator);
        ni.setTnifIsActive(true);
        ni.setTnifCreatedBy("SYSTEM");   // replace with the logged-in user later
        ni.setTnifUpdatedBy("SYSTEM");
        ni.setTnifCreatedAt(now);
        ni.setTnifUpdatedAt(now);
        // deletedAt stays null

        NationalIndicator saved = masterRepository.saveNationalIndicator(ni);

        return new MasterResponse(saved.getTnifId(), saved.getTnifIndicator());
    }


    @Override
    @Transactional
    public MasterResponse createBudget(BudgetMasterRequest request) {
        String stateId = request.getStateId().trim();
        String domainId = request.getDomainId().trim();

        if (!masterRepository.existsStateById(stateId)) {
            throw new IllegalArgumentException("State not found: " + stateId);
        }
        if (masterRepository.findDomainById(domainId) == null) {
            throw new IllegalArgumentException("Domain not found: " + domainId);
        }

        String districtId = blankToNull(request.getDistrictId());
        if (districtId != null) {
            District district = masterRepository.findDistrictById(districtId);
            if (district == null) {
                throw new IllegalArgumentException("District not found: " + districtId);
            }
            if (!stateId.equals(district.getTdlStateId())) {
                throw new IllegalArgumentException("District does not belong to the given state");
            }
        }

        LocalDateTime now = LocalDateTime.now();   // response uses LocalDateTime

        BudgetMaster b = new BudgetMaster();
        b.setTbmId(masterRepository.nextBudgetId());              // ASSUMED
        b.setTbmType(request.getType().trim());                   // ASSUMED (all setters below)
        b.setTbmFyId(request.getFyId().trim());
        b.setTbmDomainId(domainId);
        b.setTbmPlantId(blankToNull(request.getPlantId()));
        b.setTbmBuId(blankToNull(request.getBuId()));
        b.setTbmStateId(stateId);
        b.setTbmDistrictId(districtId);
        b.setTbmBlockId(blankToNull(request.getBlockId()));
        b.setTbmGlCode(blankToNull(request.getGlCode()));
        b.setTbmProfitCenter(blankToNull(request.getProfitCenter()));
        b.setTbmNatureOfProject(blankToNull(request.getNatureOfProject()));
        b.setTbmProjectConcise(request.getProjectConcise().trim());
        b.setTbmProjectDuration(blankToNull(request.getProjectDuration()));
        b.setTbmNationalIndicatorFramework(blankToNull(request.getNationalIndicatorFramework()));
        b.setTbmTotalBudgetAmount(request.getTotalBudgetAmount());
        b.setTbmBudgetList(blankToNull(request.getBudgetList()));
        b.setTbmThemeId(blankToNull(request.getThemeId()));
        b.setTbmDepartmentId(blankToNull(request.getDepartmentId()));

        // server-controlled fields
        b.setTbmStatus("draft");          // same starting status your proposals use
        b.setTbmFlArchive("N");
        // createdBy / updatedBy / userId are Long: left null until you read the user id from the JWT
        // approval, forward and back-forward fields stay null on creation
        b.setTbmCreatedAt(now);
        b.setTbmUpdatedAt(now);

        BudgetMaster saved = masterRepository.saveBudget(b);

        return new MasterResponse(saved.getTbmId(), saved.getTbmProjectConcise());
    }

    private String blankToNull(String v) {
        return (v == null || v.isBlank()) ? null : v.trim();
    }



    @Override
    @Transactional
    public MasterResponse createProposal(ProposalRequest r) {
        String name = r.proposalName().trim();
        String fyId = r.financialYearId().trim();
        String stateId = r.state().trim();
        String districtId = blankToNull(r.district());
        String blockId = blankToNull(r.subDistrict());
        String domainId = r.domainId().trim();

        // ---- reference checks ----
        if (!masterRepository.existsStateById(stateId)) {
            throw new IllegalArgumentException("State not found: " + stateId);
        }
        if (masterRepository.findDomainById(domainId) == null) {
            throw new IllegalArgumentException("Domain not found: " + domainId);
        }
        if (districtId != null) {
            District d = masterRepository.findDistrictById(districtId);
            if (d == null) throw new IllegalArgumentException("District not found: " + districtId);
            if (!stateId.equals(d.getTdlStateId())) {
                throw new IllegalArgumentException("District does not belong to the given state");
            }
        }
        if (blockId != null) {
            SubDistrict b = masterRepository.findSubDistrictById(blockId);
            if (b == null) throw new IllegalArgumentException("Sub district not found: " + blockId);
            if (districtId != null && !districtId.equalsIgnoreCase(b.getTblDistrictId())) {
                throw new IllegalArgumentException("Sub district does not belong to the given district");
            }
        }

        // ---- date sanity ----
        if (r.startDate() != null && r.endDate() != null && r.endDate().isBefore(r.startDate())) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }

        // ---- duplicate check ----
        if (masterRepository.existsProposalByNameAndFy(name, fyId)) {
            throw new IllegalArgumentException("Proposal already exists for this financial year: " + name);
        }

        LocalDateTime now = LocalDateTime.now();

        Proposal p = new Proposal();
        p.setTprosId(masterRepository.nextProposalId());
        p.setTprosFinancialYearId(fyId);
        p.setTprosProposalName(name);
        p.setTprosCurrentDate(LocalDate.now());
        p.setTprosNatureOfTheProject(blankToNull(r.natureOfTheProject()));
        p.setTprosProjectType(r.projectType().trim());
        p.setTprosNgoEngagement(blankToNull(r.ngoEngagement()));
        p.setTprosDescription(blankToNull(r.description()));
        p.setTprosBaseProjectYear(blankToNull(r.baseProjectYear()));
        p.setTprosProjectValue(r.projectValue());
        p.setTprosDateOfTheProgram(r.dateOfTheProgram());
        p.setTprosStartDate(r.startDate());
        p.setTprosEndDate(r.endDate());
        p.setTprosFrequency(blankToNull(r.frequency()));
        p.setTprosState(stateId);
        p.setTprosDistrict(districtId);
        p.setTprosSubDistrict(blockId);
        p.setTprosLocation(blankToNull(r.location()));
        p.setTprosGpsLatitude(r.gpsLatitude());
        p.setTprosGpsLongitude(r.gpsLongitude());
        p.setTprosIsAspirationalDistrict(blankToNull(r.isAspirationalDistrict()));
        p.setTprosIsGromorVillage(blankToNull(r.isGromorVillage()));
        p.setTprosScheduleSeven(blankToNull(r.scheduleSeven()));
        p.setTprosSubSchedule(blankToNull(r.subSchedule()));
        p.setTprosSdg(blankToNull(r.sdg()));
        p.setTprosOrgUnit(blankToNull(r.orgUnit()));
        p.setTprosBu(blankToNull(r.bu()));
        p.setTprosThematicArea(blankToNull(r.thematicArea()));
        p.setTprosGlCode(blankToNull(r.glCode()));
        p.setTprosProfitCenter(blankToNull(r.profitCenter()));
        p.setTprosCostCenter(blankToNull(r.costCenter()));
        p.setTprosTargetBeneficiaries(blankToNull(r.targetBeneficiaries()));
        p.setTprosMaleBeneficiaries(r.maleBeneficiaries());
        p.setTprosFemaleBeneficiaries(r.femaleBeneficiaries());
        p.setTprosMixGroupBeneficiaries(r.mixGroupBeneficiaries());
        p.setTprosTypeOfTheProject(blankToNull(r.typeOfTheProject()));
        p.setTprosTypeOfTheSubProject(blankToNull(r.typeOfTheSubProject()));
        p.setTprosApprovedLineItem(blankToNull(r.approvedLineItem()));
        p.setTprosAllocateBudgetForApprovedLineItem(r.allocateBudgetForApprovedLineItem());
        p.setTprosUtilizedTillDate(r.utilizedTillDate());
        p.setTprosProjectBudget(r.projectBudget());
        p.setTprosImplementationBy(blankToNull(r.implementationBy()));
        p.setTprosImplementationPartnerName(blankToNull(r.implementationPartnerName()));
        p.setTprosNgoComplianceCheck(blankToNull(r.ngoComplianceCheck()));
        p.setTprosVendorComplianceCheck(blankToNull(r.vendorComplianceCheck()));
        p.setTprosProgramBackground(blankToNull(r.programBackground()));
        p.setTprosBaselineDataInformation(blankToNull(r.baselineDataInformation()));
        p.setTprosProposalDetails(blankToNull(r.proposalDetails()));
        p.setTprosGovtSchemeLinkage(blankToNull(r.govtSchemeLinkage()));
        p.setTprosStakeholderRequestLevel(blankToNull(r.stakeholderRequestLevel()));
        p.setTprosGovernmentApproval(blankToNull(r.governmentApproval()));
        p.setTprosProgramObjective(blankToNull(r.programObjective()));
        p.setTprosActivitiesPlanned(blankToNull(r.activitiesPlanned()));
        p.setTprosExpectedOutcome(blankToNull(r.expectedOutcome()));
        p.setTprosProjectUniqueness(blankToNull(r.projectUniqueness()));
        p.setTprosBrandingCommunication(blankToNull(r.brandingCommunication()));
        p.setTprosMonitoringScope(blankToNull(r.monitoringScope()));
        p.setTprosBudgetBreakup(r.budgetBreakup());
        p.setTprosParticular(blankToNull(r.particular()));
        p.setTprosUnit(blankToNull(r.unit()));
        p.setTprosNoOfUnits(r.noOfUnits());
        p.setTprosUnitCost(r.unitCost());
        p.setTprosTotalAmount(r.totalAmount());
        p.setTprosGstAmount(r.gstAmount());
        p.setTprosTotalInclGst(r.totalInclGst());
        p.setTprosCapexCost(r.capexCost());
        p.setTprosOpexCost(r.opexCost());
        p.setTprosServiceCharges(r.serviceCharges());
        p.setTprosTaxDetails(r.taxDetails());
        p.setTprosTotalProjectCost(r.totalProjectCost());
        p.setTprosL1PartyBudget(blankToNull(r.l1PartyBudget()));
        p.setTprosRecommendedParty(blankToNull(r.recommendedParty()));
        p.setTprosJustificationOtherThanL1(blankToNull(r.justificationOtherThanL1()));
        p.setTprosSinglePartyJustification(blankToNull(r.singlePartyJustification()));
        p.setTprosRemarks(blankToNull(r.remarks()));
        p.setTprosFactoryId(blankToNull(r.factoryId()));
        p.setTprosDomainId(domainId);
        p.setTprosNgoId(blankToNull(r.ngoId()));
        p.setTprosDepartmentId(blankToNull(r.departmentId()));

        // ---- server-controlled ----
        p.setTprosStatus("draft");
        p.setTprosFlArchive("N");
        // createdBy / updatedBy keep the entity default 0L until you read the user id from the JWT
        p.setTprosCreatedAt(now);
        p.setTprosUpdatedAt(now);
        // approval, forward and back-forward fields stay null on creation

        Proposal saved = masterRepository.saveProposal(p);

        return new MasterResponse(saved.getTprosId(), saved.getTprosProposalName());
    }



    @Override
    @Transactional
    public MasterResponse createProject(ProjectRequest request) {
        String proposalId = request.getProposalId().trim();

        Proposal p = masterRepository.findProposalById(proposalId);
        if (p == null) {
            throw new IllegalArgumentException("Proposal not found: " + proposalId);
        }
        if (!"approved".equalsIgnoreCase(p.getTprosStatus())) {
            throw new IllegalArgumentException("Only approved proposals can become projects. Current status: "
                    + p.getTprosStatus());
        }
        if (masterRepository.existsProjectByProposal(proposalId)) {
            throw new IllegalArgumentException("A project already exists for this proposal: " + proposalId);
        }

        LocalDateTime now = LocalDateTime.now();
        String id = masterRepository.nextProjectId();

        Project pr = new Project();
        pr.setTprojId(id);
        pr.setTprojProposalId(proposalId);
        pr.setTprojFinancialYearId(p.getTprosFinancialYearId());
        pr.setTprojStateId(p.getTprosState());
        pr.setTprojDistrictId(p.getTprosDistrict());
        pr.setTprojBlockId(p.getTprosSubDistrict());
        pr.setTprojLocationId(p.getTprosLocation());
        pr.setTprojLatitude(p.getTprosGpsLatitude());
        pr.setTprojLongitude(p.getTprosGpsLongitude());
        pr.setTprojThemeId(p.getTprosThematicArea());
        pr.setTprojProposalName(p.getTprosProposalName());
        pr.setTprojProjectTypeId(p.getTprosTypeOfTheProject());
        pr.setTprojSubProjectId(p.getTprosTypeOfTheSubProject());
        pr.setTprojSdgId(p.getTprosSdg());
        pr.setTprojScheduleSevenId(p.getTprosScheduleSeven());
        pr.setTprojAllocateBudgetAmount(request.getAllocateBudgetAmount() != null
                ? request.getAllocateBudgetAmount() : p.getTprosProjectBudget());
        pr.setTprojUtilizedTillToday(0.0);
        pr.setTprojStatus("active");                // ASSUMED status value
        pr.setTprojFlArchive("N");
        pr.setTprojUniqueId(id);                    // ASSUMED: replace with your real unique-code rule
        // createdBy / updatedBy: left null until you read the user id from the JWT
        pr.setTprojCreatedAt(now);
        pr.setTprojUpdatedAt(now);

        Project saved = masterRepository.saveProject(pr);

        return new MasterResponse(saved.getTprojId(), saved.getTprojProposalName());
    }

}