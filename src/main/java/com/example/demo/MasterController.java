// src/main/java/com/example/demo/controller/MasterController.java
package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.MasterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import com.example.demo.dto.response.ApiResponse;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import com.example.demo.dto.response.ThemeResponse;    // <-- add this
import com.example.demo.dto.response.PagedResponse;    // <-- add this too
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.response.MasterListResponse;


import com.example.demo.dto.response.SubScheduleResponse;
@RestController
public class MasterController {

    @Autowired
    private MasterService masterService;

    @GetMapping("/department/all")
    public List<MasterResponse> getAllDepartments() {
        return masterService.getAllDepartments();
    }

    @GetMapping("/role/all")
    public List<MasterResponse> getAllRoles() {
        return masterService.getAllRoles();
    }

    @GetMapping("/approval_path/all")
    public ResponseEntity<ApiResponse<List<MasterResponse>>> getAllApprovals() {
        List<MasterResponse> approvals = masterService.getAllApprovals();
        ApiResponse<List<MasterResponse>> response = new ApiResponse<>(200, "Success", approvals);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/state/all")
    public ResponseEntity<ApiResponse<List<MasterResponse>>> getAllState() {
        List<MasterResponse> states = masterService.getAllStates();
        ApiResponse<List<MasterResponse>> response = new ApiResponse<>(200, "Success", states);
        return ResponseEntity.ok(response);
    }


    // MasterController
    @GetMapping("/district/all")
    public ResponseEntity<ApiResponse<List<MasterResponse>>> getAllDistrict() {
        List<MasterResponse> districts = masterService.getAllDistricts();
        ApiResponse<List<MasterResponse>> response = new ApiResponse<>(200, "Success", districts);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/sub-district/all")
    public ResponseEntity<ApiResponse<List<MasterResponse>>> getAllSubDistrict() {
        List<MasterResponse> districts = masterService.getAllSubDistrict();
        ApiResponse<List<MasterResponse>> response = new ApiResponse<>(200, "Success", districts);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/factory/all")
    public ResponseEntity<ApiResponse<List<FactoryResponse>>> getAllFactory() {
        List<FactoryResponse> factories = masterService.getAllFactory();
        ApiResponse<List<FactoryResponse>> response = new ApiResponse<>(200, "Success", factories);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/profit_center/all")
    public ResponseEntity<ApiResponse<List<ProfitCenterResponse>>> getAllProfitCenters() {
        List<ProfitCenterResponse> profitCenters = masterService.getAllProfitCenters();
        ApiResponse<List<ProfitCenterResponse>> response = new ApiResponse<>(200, "Success", profitCenters);
        return ResponseEntity.ok(response);
    }


    @GetMapping("/domain/all")
    public ResponseEntity<ApiResponse<List<DomainResponse>>> getAllDomains() {
        List<DomainResponse> domains = masterService.getAllDomains();
        ApiResponse<List<DomainResponse>> response = new ApiResponse<>(200, "Success", domains);
        return ResponseEntity.ok(response);
    }



    @GetMapping("/theme/all")
    public ResponseEntity<ApiResponse<PagedResponse<ThemeResponse>>> getAllThemes(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<ThemeResponse> themes = masterService.getAllThemes(page, size);
        ApiResponse<PagedResponse<ThemeResponse>> response = new ApiResponse<>(200, "Success", themes);
        return ResponseEntity.ok(response);
    }



    @GetMapping("/master_list/all")
    public ResponseEntity<ApiResponse<PagedResponse<MasterListResponse>>> getAllMasterList(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<MasterListResponse> masterList = masterService.getAllMasterList(page, size);
        ApiResponse<PagedResponse<MasterListResponse>> response = new ApiResponse<>(200, "Success", masterList);
        return ResponseEntity.ok(response);
    }



    @GetMapping("/schedule_seven/all")
    public ResponseEntity<ApiResponse<PagedResponse<ScheduleSevenResponse>>> getAllScheduleSeven(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<ScheduleSevenResponse> scheduleSevenList = masterService.getAllScheduleSeven(page, size);
        ApiResponse<PagedResponse<ScheduleSevenResponse>> response = new ApiResponse<>(200, "Success", scheduleSevenList);
        return ResponseEntity.ok(response);
    }



    @GetMapping("/sub_schedule/all")
    public ResponseEntity<ApiResponse<PagedResponse<SubScheduleResponse>>> getAllSubSchedule(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<SubScheduleResponse> subScheduleList = masterService.getAllSubSchedule(page, size);
        ApiResponse<PagedResponse<SubScheduleResponse>> response = new ApiResponse<>(200, "Success", subScheduleList);
        return ResponseEntity.ok(response);
    }



    @GetMapping("/activity/all")
    public ResponseEntity<ApiResponse<PagedResponse<ActivityResponse>>> getAllActivity(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<ActivityResponse> activityList = masterService.getAllActivity(page, size);
        ApiResponse<PagedResponse<ActivityResponse>> response = new ApiResponse<>(200, "Success", activityList);
        return ResponseEntity.ok(response);
    }




    @GetMapping("/sub_activity/all")
    public ResponseEntity<ApiResponse<PagedResponse<SubActivityResponse>>> getAllSubActivity(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<SubActivityResponse> subActivityList = masterService.getAllSubActivity(page, size);
        ApiResponse<PagedResponse<SubActivityResponse>> response = new ApiResponse<>(200, "Success", subActivityList);
        return ResponseEntity.ok(response);
    }



    @GetMapping("/sdg/all")
    public ResponseEntity<ApiResponse<PagedResponse<SdgResponse>>> getAllSdg(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<SdgResponse> sdgList = masterService.getAllSdg(page, size);

        ApiResponse<PagedResponse<SdgResponse>> response =
                new ApiResponse<>(200, "Success", sdgList);

        return ResponseEntity.ok(response);
    }



    @GetMapping("/national_indicator/all")
    public ResponseEntity<ApiResponse<PagedResponse<NationalIndicatorResponse>>> getAllNationalIndicator(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<NationalIndicatorResponse> nationalIndicatorList =
                masterService.getAllNationalIndicator(page, size);

        ApiResponse<PagedResponse<NationalIndicatorResponse>> response =
                new ApiResponse<>(200, "Success", nationalIndicatorList);

        return ResponseEntity.ok(response);
    }



    @GetMapping("/budgeting/all")
    public ResponseEntity<ApiResponse<PagedResponse<BudgetingResponse>>> getAllBudgeting(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<BudgetingResponse> budgetingList =
                masterService.getAllBudgeting(page, size);

        ApiResponse<PagedResponse<BudgetingResponse>> response =
                new ApiResponse<>(200, "Success", budgetingList);

        return ResponseEntity.ok(response);
    }




    @GetMapping("/proposal/all")
    public ResponseEntity<ApiResponse<PagedResponse<ProposalResponse>>> getAllProposal(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<ProposalResponse> proposalList =
                masterService.getAllProposal(page, size);

        ApiResponse<PagedResponse<ProposalResponse>> response =
                new ApiResponse<>(200, "Success", proposalList);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/project/all")
    public ResponseEntity<ApiResponse<PagedResponse<ProjectResponse>>> getAllProject(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<ProjectResponse> projectList =
                masterService.getAllProject(page, size);

        ApiResponse<PagedResponse<ProjectResponse>> response =
                new ApiResponse<>(200, "Success", projectList);

        return ResponseEntity.ok(response);
    }



    @GetMapping("/ngo/all")
    public ResponseEntity<ApiResponse<PagedResponse<NgoResponse>>> getAllNgo(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<NgoResponse> ngoList =
                masterService.getAllNgo(page, size);

        ApiResponse<PagedResponse<NgoResponse>> response =
                new ApiResponse<>(200, "Success", ngoList);

        return ResponseEntity.ok(response);
    }



    @GetMapping("/best_practice/all")
    public ResponseEntity<ApiResponse<PagedResponse<BestPracticeResponse>>> getAllBestPractice(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<BestPracticeResponse> bestPracticeList =
                masterService.getAllBestPractice(page, size);

        ApiResponse<PagedResponse<BestPracticeResponse>> response =
                new ApiResponse<>(200, "Success", bestPracticeList);

        return ResponseEntity.ok(response);
    }



    @GetMapping("/event/all")
    public ResponseEntity<ApiResponse<PagedResponse<EventResponse>>> getAllEvent(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<EventResponse> eventList =
                masterService.getAllEvent(page, size);

        ApiResponse<PagedResponse<EventResponse>> response =
                new ApiResponse<>(200, "Success", eventList);

        return ResponseEntity.ok(response);
    }




    @GetMapping("/budget_master/all")
    public ResponseEntity<ApiResponse<PagedResponse<BudgetMasterResponse>>> getAllBudgetMaster(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<BudgetMasterResponse> budgetMasterList =
                masterService.getAllBudgetMaster(page, size);

        ApiResponse<PagedResponse<BudgetMasterResponse>> response =
                new ApiResponse<>(200, "Success", budgetMasterList);

        return ResponseEntity.ok(response);
    }



    @GetMapping("/login_logout/all")
    public ResponseEntity<ApiResponse<PagedResponse<LoginLogoutResponse>>> getAllLoginLogout(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<LoginLogoutResponse> loginLogoutList =
                masterService.getAllLoginLogout(page, size);

        ApiResponse<PagedResponse<LoginLogoutResponse>> response =
                new ApiResponse<>(200, "Success", loginLogoutList);

        return ResponseEntity.ok(response);
    }



    @GetMapping("/proposal_audit/all")
    public ResponseEntity<ApiResponse<PagedResponse<ProposalAuditResponse>>> getAllProposalAudit(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        PagedResponse<ProposalAuditResponse> proposalAuditList =
                masterService.getAllProposalAudit(page, size);

        ApiResponse<PagedResponse<ProposalAuditResponse>> response =
                new ApiResponse<>(200, "Success", proposalAuditList);

        return ResponseEntity.ok(response);
    }


    @PostMapping("/department-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createDepartment(
            @Valid @RequestBody DepartmentRequest request) {

        MasterResponse created = masterService.createDepartment(request);

        ApiResponse<MasterResponse> response =
                new ApiResponse<>(HttpStatus.CREATED.value(), "Department created successfully", created);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }


    @PostMapping("/theme-store")
    public ResponseEntity<ApiResponse<ThemeResponse>> createTheme(
            @Valid @RequestBody ThemeRequest request) {

        ThemeResponse created = masterService.createTheme(request);

        ApiResponse<ThemeResponse> response =
                new ApiResponse<>(HttpStatus.CREATED.value(), "Theme created successfully", created);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }




    @PostMapping("/state-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createState(
            @Valid @RequestBody StateRequest request) {

        MasterResponse created = masterService.createState(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "State created successfully", created));
    }



    @PostMapping("/district-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createDistrict(
            @Valid @RequestBody DistrictRequest request) {

        MasterResponse created = masterService.createDistrict(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "District created successfully", created));
    }




    @PostMapping("/sub-district-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createSubDistrict(
            @Valid @RequestBody SubDistrictRequest request) {

        MasterResponse created = masterService.createSubDistrict(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Sub district created successfully", created));
    }




    @PostMapping("/factory-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createFactory(
            @Valid @RequestBody FactoryRequest request) {

        MasterResponse created = masterService.createFactory(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Factory created successfully", created));
    }


    @PostMapping("/profit-center-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createProfitCenter(
            @Valid @RequestBody ProfitCenterRequest request) {

        MasterResponse created = masterService.createProfitCenter(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Profit center created successfully", created));
    }



    @PostMapping("/domain-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createDomain(
            @Valid @RequestBody DomainRequest request) {

        MasterResponse created = masterService.createDomain(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Domain created successfully", created));
    }





    @PostMapping("/master-list-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createMasterList(
            @Valid @RequestBody MasterListRequest request) {

        MasterResponse created = masterService.createMasterList(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Master list created successfully", created));
    }



    @PostMapping("/schedule-seven-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createScheduleSeven(
            @Valid @RequestBody ScheduleSevenRequest request) {

        MasterResponse created = masterService.createScheduleSeven(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Schedule seven created successfully", created));
    }



    @PostMapping("/sub-schedule-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createSubSchedule(
            @Valid @RequestBody SubScheduleRequest request) {

        MasterResponse created = masterService.createSubSchedule(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Sub schedule created successfully", created));
    }



    @PostMapping("/activity-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createActivity(
            @Valid @RequestBody ActivityRequest request) {

        MasterResponse created = masterService.createActivity(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Activity created successfully", created));
    }




    @PostMapping("/sub-activity-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createSubActivity(
            @Valid @RequestBody SubActivityRequest request) {

        MasterResponse created = masterService.createSubActivity(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Sub activity created successfully", created));
    }






    @PostMapping("/sdg-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createSdg(
            @Valid @RequestBody SdgRequest request) {

        MasterResponse created = masterService.createSdg(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "SDG created successfully", created));
    }


    @PostMapping("/national-indicator-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createNationalIndicator(
            @Valid @RequestBody NationalIndicatorRequest request) {

        MasterResponse created = masterService.createNationalIndicator(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "National indicator created successfully", created));
    }



    @PostMapping("/budget-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createBudget(
            @Valid @RequestBody BudgetMasterRequest request) {

        MasterResponse created = masterService.createBudget(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Budget created successfully", created));
    }



    @PostMapping("/proposal-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createProposal(
            @Valid @RequestBody ProposalRequest request) {

        MasterResponse created = masterService.createProposal(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Proposal created successfully", created));
    }


    @PostMapping("/project-store")
    public ResponseEntity<ApiResponse<MasterResponse>> createProject(
            @Valid @RequestBody ProjectRequest request) {

        MasterResponse created = masterService.createProject(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse<>(HttpStatus.CREATED.value(), "Project created successfully", created));
    }


    // Add a new endpoint here for each new master entity
}