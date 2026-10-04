// src/main/java/com/example/demo/repository/MasterRepository.java
package com.example.demo.repository;

import com.example.demo.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.example.demo.entity.ThemeMaster;
@Repository
public class MasterRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Department> findAllDepartments() {
        return entityManager.createQuery("SELECT d FROM Department d", Department.class)
                .getResultList();
    }

    public List<Role> findAllRoles() {
        return entityManager.createQuery("SELECT r FROM Role r", Role.class)
                .getResultList();
    }



    // src/main/java/com/example/demo/repository/MasterRepository.java
    public List<ApprovalPathEntity> getAllApprovals() {
        return entityManager.createQuery("SELECT a FROM ApprovalPathEntity a", ApprovalPathEntity.class)
                .getResultList();
    }


    public List<State> getAllStates() {
        return entityManager.createQuery("SELECT s FROM State s", State.class)
                .getResultList();
    }

    public List<District> getAllDistricts() {
        return entityManager.createQuery("SELECT d FROM District d", District.class)
                .getResultList();
    }


    public List<SubDistrict> getAllSubDistrict() {
        return entityManager.createQuery("SELECT sd FROM SubDistrict sd", SubDistrict.class)
                .getResultList();
    }

    public List<Factory> getAllFactory() {
        return entityManager.createQuery("SELECT f FROM Factory f", Factory.class)
                .getResultList();
    }



    public List<ProfitCenter> getAllProfitCenters() {
        return entityManager.createQuery("SELECT p FROM ProfitCenter p", ProfitCenter.class)
                .getResultList();
    }

    public List<Domain> getAllDomains() {
        return entityManager.createQuery("SELECT d FROM Domain d", Domain.class)
                .getResultList();
    }



    public List<ThemeMaster> getThemesPaginated(int page, int size) {
        return entityManager.createQuery("SELECT t FROM ThemeMaster t", ThemeMaster.class)
                .setFirstResult((page - 1) * size)  // skip rows from previous pages
                .setMaxResults(size)                 // limit to page size
                .getResultList();
    }

    public long countThemes() {
        return entityManager.createQuery("SELECT COUNT(t) FROM ThemeMaster t", Long.class)
                .getSingleResult();
    }




    public List<Master> getMasterListPaginated(int page, int size) {
        return entityManager.createQuery("SELECT m FROM Master m", Master.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countMasterList() {
        return entityManager.createQuery("SELECT COUNT(m) FROM Master m", Long.class)
                .getSingleResult();
    }




    public List<ScheduleSeven> getScheduleSevenPaginated(int page, int size) {
        return entityManager.createQuery("SELECT s FROM ScheduleSeven s", ScheduleSeven.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countScheduleSeven() {
        return entityManager.createQuery("SELECT COUNT(s) FROM ScheduleSeven s", Long.class)
                .getSingleResult();
    }





    public List<SubSchedule> getSubSchedulePaginated(int page, int size) {
        return entityManager.createQuery("SELECT ss FROM SubSchedule ss", SubSchedule.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countSubSchedule() {
        return entityManager.createQuery("SELECT COUNT(ss) FROM SubSchedule ss", Long.class)
                .getSingleResult();
    }

    public List<Activity> getActivityPaginated(int page, int size) {
        return entityManager.createQuery("SELECT a FROM Activity a", Activity.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countActivity() {
        return entityManager.createQuery("SELECT COUNT(a) FROM Activity a", Long.class)
                .getSingleResult();
    }







    public List<SubActivity> getSubActivityPaginated(int page, int size) {
        return entityManager.createQuery("SELECT sa FROM SubActivity sa", SubActivity.class)
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countSubActivity() {
        return entityManager.createQuery("SELECT COUNT(sa) FROM SubActivity sa", Long.class)
                .getSingleResult();
    }



    public List<Sdg> getSdgPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT sdg FROM Sdg sdg",
                        Sdg.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countSdg() {
        return entityManager.createQuery(
                        "SELECT COUNT(sdg) FROM Sdg sdg",
                        Long.class
                )
                .getSingleResult();
    }




    public List<NationalIndicator> getNationalIndicatorPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT ni FROM NationalIndicator ni",
                        NationalIndicator.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countNationalIndicator() {
        return entityManager.createQuery(
                        "SELECT COUNT(ni) FROM NationalIndicator ni",
                        Long.class
                )
                .getSingleResult();
    }








    public List<Budgeting> getBudgetingPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT b FROM Budgeting b",
                        Budgeting.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countBudgeting() {
        return entityManager.createQuery(
                "SELECT COUNT(b) FROM Budgeting b",
                Long.class
        ).getSingleResult();
    }




    public List<Proposal> getProposalPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT p FROM Proposal p",
                        Proposal.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countProposal() {
        return entityManager.createQuery(
                "SELECT COUNT(p) FROM Proposal p",
                Long.class
        ).getSingleResult();
    }




    public List<Project> getProjectPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT p FROM Project p",
                        Project.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countProject() {
        return entityManager.createQuery(
                "SELECT COUNT(p) FROM Project p",
                Long.class
        ).getSingleResult();
    }




    public List<Ngo> getNgoPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT n FROM Ngo n",
                        Ngo.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countNgo() {
        return entityManager.createQuery(
                "SELECT COUNT(n) FROM Ngo n",
                Long.class
        ).getSingleResult();
    }



    public List<BestPractice> getBestPracticePaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT bp FROM BestPractice bp",
                        BestPractice.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countBestPractice() {
        return entityManager.createQuery(
                "SELECT COUNT(bp) FROM BestPractice bp",
                Long.class
        ).getSingleResult();
    }



    public List<Event> getEventPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT e FROM Event e",
                        Event.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countEvent() {
        return entityManager.createQuery(
                "SELECT COUNT(e) FROM Event e",
                Long.class
        ).getSingleResult();
    }




    public List<BudgetMaster> getBudgetMasterPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT bm FROM BudgetMaster bm",
                        BudgetMaster.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countBudgetMaster() {
        return entityManager.createQuery(
                "SELECT COUNT(bm) FROM BudgetMaster bm",
                Long.class
        ).getSingleResult();
    }




    public List<LoginLogout> getLoginLogoutPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT l FROM LoginLogout l",
                        LoginLogout.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countLoginLogout() {
        return entityManager.createQuery(
                "SELECT COUNT(l) FROM LoginLogout l",
                Long.class
        ).getSingleResult();
    }





    public List<ProposalAudit> getProposalAuditPaginated(int page, int size) {
        return entityManager.createQuery(
                        "SELECT p FROM ProposalAudit p",
                        ProposalAudit.class
                )
                .setFirstResult((page - 1) * size)
                .setMaxResults(size)
                .getResultList();
    }

    public long countProposalAudit() {
        return entityManager.createQuery(
                "SELECT COUNT(p) FROM ProposalAudit p",
                Long.class
        ).getSingleResult();
    }




    public boolean existsDepartmentByName(String name) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(d) FROM Department d WHERE LOWER(d.tdDepartmentName) = :name", Long.class)
                .setParameter("name", name.toLowerCase())
                .getSingleResult();
        return count > 0;
    }

    public Department saveDepartment(Department dept) {
        entityManager.persist(dept);
        return dept;
    }



    public String nextDepartmentId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_department_id_seq')")
                .getSingleResult();
        return "td" + String.format("%010d", seq.longValue());
    }




    public boolean existsThemeByName(String name) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(t) FROM ThemeMaster t WHERE LOWER(t.tthmThemeName) = :name", Long.class)
                .setParameter("name", name.toLowerCase())
                .getSingleResult();
        return count > 0;
    }

    public String nextThemeId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_theme_master_id_seq')")
                .getSingleResult();
        return "tthm" + String.format("%010d", seq.longValue());
    }

    public ThemeMaster saveTheme(ThemeMaster theme) {
        entityManager.persist(theme);
        return theme;
    }



    public boolean existsStateByName(String name) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(s) FROM State s WHERE LOWER(s.tslStateName) = :name", Long.class)
                .setParameter("name", name.toLowerCase())
                .getSingleResult();
        return count > 0;
    }

    public String nextStateId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_state_id_seq')")
                .getSingleResult();
        return "tsl" + String.format("%010d", seq.longValue());
    }

    public State saveState(State state) {
        entityManager.persist(state);
        return state;
    }



    public boolean existsStateById(String stateId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(s) FROM State s WHERE s.tslStateId = :id", Long.class)
                .setParameter("id", stateId)
                .getSingleResult();
        return count > 0;
    }

    public boolean existsDistrictByNameAndState(String name, String stateId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(d) FROM District d " +
                                "WHERE LOWER(d.tdlDistrictName) = :name AND d.tdlStateId = :stateId", Long.class)
                .setParameter("name", name.toLowerCase())
                .setParameter("stateId", stateId)
                .getSingleResult();
        return count > 0;
    }

    public String nextDistrictId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_district_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tdl" + String.format("%010d", seq.longValue());
    }

    public District saveDistrict(District district) {
        entityManager.persist(district);
        return district;
    }





    public District findDistrictById(String districtId) {
        return entityManager.find(District.class, districtId);
    }

    public boolean existsSubDistrictByNameAndDistrict(String name, String districtId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(b) FROM SubDistrict b " +
                                "WHERE LOWER(b.tblBlockName) = :name AND b.tblDistrictId = :districtId", Long.class)
                .setParameter("name", name.toLowerCase())
                .setParameter("districtId", districtId)
                .getSingleResult();
        return count > 0;
    }

    public String nextSubDistrictId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_block_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tbl" + String.format("%010d", seq.longValue());
    }

    public SubDistrict saveSubDistrict(SubDistrict block) {
        entityManager.persist(block);
        return block;
    }



    public SubDistrict findSubDistrictById(String blockId) {
        return entityManager.find(SubDistrict.class, blockId);
    }

    public boolean existsFactoryByNameAndBlock(String name, String blockId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(f) FROM Factory f " +
                                "WHERE LOWER(f.tfactFactoryName) = :name AND f.tfactBlockId = :blockId", Long.class)
                .setParameter("name", name.toLowerCase())
                .setParameter("blockId", blockId)
                .getSingleResult();
        return count > 0;
    }

    public String nextFactoryId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_factory_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tfact" + String.format("%010d", seq.longValue());
    }

    public Factory saveFactory(Factory factory) {
        entityManager.persist(factory);
        return factory;
    }





    public boolean existsProfitCenterByName(String profitCentre) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(p) FROM ProfitCenter p WHERE LOWER(p.tprofcProfitCentre) = :name", Long.class)
                .setParameter("name", profitCentre.toLowerCase())
                .getSingleResult();
        return count > 0;
    }

    public String nextProfitCenterId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_profit_center_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tprofc" + String.format("%010d", seq.longValue());
    }

    public ProfitCenter saveProfitCenter(ProfitCenter pc) {
        entityManager.persist(pc);
        return pc;
    }




    public boolean existsDomainByName(String name) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(d) FROM Domain d WHERE LOWER(d.tdnDomainName) = :name", Long.class)
                .setParameter("name", name.toLowerCase())
                .getSingleResult();
        return count > 0;
    }

    public String nextDomainId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_domain_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tdn" + String.format("%010d", seq.longValue());
    }

    public Domain saveDomain(Domain domain) {
        entityManager.persist(domain);
        return domain;
    }



    public boolean existsMasterListByName(String name) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(m) FROM Master m WHERE LOWER(m.tmlMasterListName) = :name", Long.class)
                .setParameter("name", name.toLowerCase())
                .getSingleResult();
        return count > 0;
    }

    public String nextMasterListId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_master_list_id_seq')")
                .getSingleResult();
        return "tml" + String.format("%010d", seq.longValue());
    }

    public Master saveMasterList(Master master) {
        entityManager.persist(master);
        return master;
    }



    public boolean existsScheduleSevenByName(String name) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(s) FROM ScheduleSeven s WHERE LOWER(s.tschmScheduleName) = :name", Long.class)
                .setParameter("name", name.toLowerCase())
                .getSingleResult();
        return count > 0;
    }

    public String nextScheduleSevenId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_schedule_seven_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tschm" + String.format("%010d", seq.longValue());
    }

    public ScheduleSeven saveScheduleSeven(ScheduleSeven s) {
        entityManager.persist(s);
        return s;
    }




    public ScheduleSeven findScheduleSevenById(String scheduleId) {
        return entityManager.find(ScheduleSeven.class, scheduleId);
    }

    public boolean existsSubScheduleByNameAndSchedule(String name, String scheduleId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(s) FROM SubSchedule s " +
                                "WHERE LOWER(s.tsubshcmSubScheduleName) = :name AND s.tsubshcmScheduleId = :scheduleId",
                        Long.class)
                .setParameter("name", name.toLowerCase())
                .setParameter("scheduleId", scheduleId)
                .getSingleResult();
        return count > 0;
    }

    public String nextSubScheduleId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_sub_schedule_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tsubshcm" + String.format("%010d", seq.longValue());
    }

    public SubSchedule saveSubSchedule(SubSchedule sub) {
        entityManager.persist(sub);
        return sub;
    }




    public SubSchedule findSubScheduleById(String subScheduleId) {
        return entityManager.find(SubSchedule.class, subScheduleId);
    }

    public boolean existsActivityByNameAndSchedule(String name, String scheduleId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(a) FROM Activity a " +
                                "WHERE LOWER(a.tactmActivityName) = :name AND a.tactmScheduleId = :scheduleId",
                        Long.class)
                .setParameter("name", name.toLowerCase())
                .setParameter("scheduleId", scheduleId)
                .getSingleResult();
        return count > 0;
    }

    public String nextActivityId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_activity_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tactm" + String.format("%010d", seq.longValue());
    }

    public Activity saveActivity(Activity activity) {
        entityManager.persist(activity);
        return activity;
    }




    public Activity findActivityById(String activityId) {
        return entityManager.find(Activity.class, activityId);
    }

    public boolean existsSubActivityByNameAndActivity(String name, String activityId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(s) FROM SubActivity s " +
                                "WHERE LOWER(s.tsactmSubActivityName) = :name AND s.tsactmActivityId = :activityId",
                        Long.class)
                .setParameter("name", name.toLowerCase())
                .setParameter("activityId", activityId)
                .getSingleResult();
        return count > 0;
    }

    public String nextSubActivityId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_sub_activity_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tsactm" + String.format("%010d", seq.longValue());
    }

    public SubActivity saveSubActivity(SubActivity sa) {
        entityManager.persist(sa);
        return sa;
    }




    public boolean existsSdgByName(String name) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(s) FROM Sdg s WHERE LOWER(s.tsdgName) = :name", Long.class)
                .setParameter("name", name.toLowerCase())
                .getSingleResult();
        return count > 0;
    }

    public String nextSdgId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_sdg_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tsdg" + String.format("%010d", seq.longValue());
    }

    public Sdg saveSdg(Sdg sdg) {
        entityManager.persist(sdg);
        return sdg;
    }



    public Sdg findSdgById(String sdgId) {
        return entityManager.find(Sdg.class, sdgId);
    }

    public boolean existsNationalIndicatorByIndicatorAndSdg(String indicator, String sdgId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(n) FROM NationalIndicator n " +
                                "WHERE LOWER(n.tnifIndicator) = :indicator AND n.tnifSdgId = :sdgId",
                        Long.class)
                .setParameter("indicator", indicator.toLowerCase())
                .setParameter("sdgId", sdgId)
                .getSingleResult();
        return count > 0;
    }

    public String nextNationalIndicatorId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_national_indicator_master_id_seq')")   // verify sequence name
                .getSingleResult();
        return "tnif" + String.format("%010d", seq.longValue());
    }

    public NationalIndicator saveNationalIndicator(NationalIndicator ni) {
        entityManager.persist(ni);
        return ni;
    }



    public Domain findDomainById(String domainId) {
        return entityManager.find(Domain.class, domainId);
    }

    public String nextBudgetId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_budget_master_id_seq')")   // ASSUMED
                .getSingleResult();
        return "tbm" + String.format("%010d", seq.longValue());                  // ASSUMED prefix
    }

    public BudgetMaster saveBudget(BudgetMaster b) {
        entityManager.persist(b);
        return b;
    }






    public boolean existsProposalByNameAndFy(String name, String fyId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(p) FROM Proposal p " +
                                "WHERE LOWER(p.tprosProposalName) = :name AND p.tprosFinancialYearId = :fy",
                        Long.class)
                .setParameter("name", name.toLowerCase())
                .setParameter("fy", fyId)
                .getSingleResult();
        return count > 0;
    }

    public String nextProposalId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_proposal_id_seq')")
                .getSingleResult();
        return "tpros" + String.format("%010d", seq.longValue());
    }

    public Proposal saveProposal(Proposal p) {
        entityManager.persist(p);
        return p;
    }




    public Proposal findProposalById(String proposalId) {
        return entityManager.find(Proposal.class, proposalId);
    }

    public boolean existsProjectByProposal(String proposalId) {
        Long count = entityManager.createQuery(
                        "SELECT COUNT(p) FROM Project p WHERE p.tprojProposalId = :pid", Long.class)
                .setParameter("pid", proposalId)
                .getSingleResult();
        return count > 0;
    }

    public String nextProjectId() {
        Number seq = (Number) entityManager
                .createNativeQuery("SELECT nextval('t_project_id_seq')")   // ASSUMED
                .getSingleResult();
        return "tproj" + String.format("%010d", seq.longValue());          // ASSUMED prefix
    }

    public Project saveProject(Project p) {
        entityManager.persist(p);
        return p;
    }

    // Add a new method here for each new master entity
}