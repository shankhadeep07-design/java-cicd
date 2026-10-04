// src/main/java/com/example/demo/service/MasterService.java
package com.example.demo.service;

import com.example.demo.dto.*;

import java.util.List;


import com.example.demo.dto.response.ThemeResponse;    // <-- add this
import com.example.demo.dto.response.PagedResponse;    // <-- add this too, since the signature uses it


import com.example.demo.dto.response.MasterListResponse;
import com.example.demo.dto.response.PagedResponse;
import com.example.demo.dto.response.PagedResponse;


import com.example.demo.dto.response.SubScheduleResponse;
import com.example.demo.dto.response.PagedResponse;

import com.example.demo.dto.response.PagedResponse;

public interface MasterService {
    List<MasterResponse> getAllDepartments();
    List<MasterResponse> getAllRoles();
    List<MasterResponse> getAllApprovals();

    List<MasterResponse> getAllStates();


    List<MasterResponse> getAllDistricts();
    List<MasterResponse> getAllSubDistrict();

    List<FactoryResponse> getAllFactory();
    List<ProfitCenterResponse> getAllProfitCenters();// changed return type from List<MasterResponse>
    List<DomainResponse> getAllDomains();



    PagedResponse<ThemeResponse> getAllThemes(int page, int size);




    PagedResponse<MasterListResponse> getAllMasterList(int page, int size);



    PagedResponse<ScheduleSevenResponse> getAllScheduleSeven(int page, int size);

    PagedResponse<SubScheduleResponse> getAllSubSchedule(int page, int size);


    PagedResponse<ActivityResponse> getAllActivity(int page, int size);


    PagedResponse<SubActivityResponse> getAllSubActivity(int page, int size);

    PagedResponse<SdgResponse> getAllSdg(int page, int size);



    PagedResponse<NationalIndicatorResponse> getAllNationalIndicator(int page, int size);



    PagedResponse<BudgetingResponse> getAllBudgeting(int page, int size);



    PagedResponse<ProposalResponse> getAllProposal(int page, int size);


    PagedResponse<ProjectResponse> getAllProject(int page, int size);


    PagedResponse<NgoResponse> getAllNgo(int page, int size);



    PagedResponse<BestPracticeResponse> getAllBestPractice(int page, int size);




    PagedResponse<EventResponse> getAllEvent(int page, int size);



    PagedResponse<BudgetMasterResponse> getAllBudgetMaster(int page, int size);


    PagedResponse<LoginLogoutResponse> getAllLoginLogout(int page, int size);



    PagedResponse<ProposalAuditResponse> getAllProposalAudit(int page, int size);





    MasterResponse createDepartment(DepartmentRequest request);


    ThemeResponse createTheme(ThemeRequest request);




    MasterResponse createState(StateRequest request);



    MasterResponse createDistrict(DistrictRequest request);


    MasterResponse createSubDistrict(SubDistrictRequest request);



    MasterResponse createFactory(FactoryRequest request);


    MasterResponse createProfitCenter(ProfitCenterRequest request);


    MasterResponse createDomain(DomainRequest request);


    MasterResponse createMasterList(MasterListRequest request);



    MasterResponse createScheduleSeven(ScheduleSevenRequest request);



    MasterResponse createSubSchedule(SubScheduleRequest request);



    MasterResponse createActivity(ActivityRequest request);



    MasterResponse createSubActivity(SubActivityRequest request);



    MasterResponse createSdg(SdgRequest request);


    MasterResponse createNationalIndicator(NationalIndicatorRequest request);



    MasterResponse createBudget(BudgetMasterRequest request);



    MasterResponse createProposal(ProposalRequest request);


    MasterResponse createProject(ProjectRequest request);
}