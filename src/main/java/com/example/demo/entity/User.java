//package com.example.demo.entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//import java.util.List;   // <-- new import
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false)
//    private String email;
//
//    @Column(name = "email_verified_at")
//    private LocalDateTime emailVerifiedAt;
//
//    private String phone;
//
//    @Column(name = "user_type_id")
//    private String userTypeId;
//
//    @Column(name = "role_id")
//    private String roleId;
//
//    private String password;
//
//    @Column(name = "access_token")
//    private String accessToken;
//
//    @Column(name = "refresh_token")
//    private String refreshToken;
//
//    @Column(name = "remember_token", length = 100)
//    private String rememberToken;
//
//    @Column(name = "last_passwords")
//    private String lastPasswords;
//
//    @Column(name = "password_changed_at", nullable = false)
//    private LocalDateTime passwordChangedAt;
//
//    @Column(name = "failed_login_attempts", nullable = false)
//    private Integer failedLoginAttempts = 0;
//
//    @Column(name = "failed_login_attempts_at")
//    private LocalDateTime failedLoginAttemptsAt;
//
//    @Column(name = "designation_id")
//    private String designationId;
//
//    @Column(name = "ngo_id")
//    private String ngoId;
//
//    @Column(name = "is_first_login", nullable = false, length = 1)
//    private String isFirstLogin = "Y";
//
//    @Column(name = "is_active", nullable = false, length = 1)
//    private String isActive = "Y";
//
//    @Column(name = "last_otp")
//    private Integer lastOtp;
//
//    @Column(name = "created_by")
//    private Long createdBy;
//
//    @Column(name = "updated_by")
//    private Long updatedBy;
//
//    @Column(name = "created_at")
//    private LocalDateTime createdAt;
//
//    @Column(name = "updated_at")
//    private LocalDateTime updatedAt;
//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;
//
//    @Column(name = "user_login_id")
//    private String userLoginId;
//
//    @Column(name = "theme_id")
//    private String themeId;
//
//    @Column(name = "device_id")
//    private String deviceId;
//
//    @Column(name = "otp_generated_at")
//    private LocalDateTime otpGeneratedAt;
//
//
//    @Transient   // <-- new field: not persisted to DB, only used for API response
//    private List<Object> gallery;
//
//    // ===== Getters and Setters =====
//
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//
//    public String getEmail() { return email; }
//    public void setEmail(String email) { this.email = email; }
//
//    public LocalDateTime getEmailVerifiedAt() { return emailVerifiedAt; }
//    public void setEmailVerifiedAt(LocalDateTime emailVerifiedAt) { this.emailVerifiedAt = emailVerifiedAt; }
//
//    public String getPhone() { return phone; }
//    public void setPhone(String phone) { this.phone = phone; }
//
//    public String getUserTypeId() { return userTypeId; }
//    public void setUserTypeId(String userTypeId) { this.userTypeId = userTypeId; }
//
//    public String getRoleId() { return roleId; }
//    public void setRoleId(String roleId) { this.roleId = roleId; }
//
//    public String getPassword() { return password; }
//    public void setPassword(String password) { this.password = password; }
//
//    public String getAccessToken() { return accessToken; }
//    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }
//
//    public String getRefreshToken() { return refreshToken; }
//    public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }
//
//    public String getRememberToken() { return rememberToken; }
//    public void setRememberToken(String rememberToken) { this.rememberToken = rememberToken; }
//
//    public String getLastPasswords() { return lastPasswords; }
//    public void setLastPasswords(String lastPasswords) { this.lastPasswords = lastPasswords; }
//
//    public LocalDateTime getPasswordChangedAt() { return passwordChangedAt; }
//    public void setPasswordChangedAt(LocalDateTime passwordChangedAt) { this.passwordChangedAt = passwordChangedAt; }
//
//    public Integer getFailedLoginAttempts() { return failedLoginAttempts; }
//    public void setFailedLoginAttempts(Integer failedLoginAttempts) { this.failedLoginAttempts = failedLoginAttempts; }
//
//    public LocalDateTime getFailedLoginAttemptsAt() { return failedLoginAttemptsAt; }
//    public void setFailedLoginAttemptsAt(LocalDateTime failedLoginAttemptsAt) { this.failedLoginAttemptsAt = failedLoginAttemptsAt; }
//
//    public String getDesignationId() { return designationId; }
//    public void setDesignationId(String designationId) { this.designationId = designationId; }
//
//    public String getNgoId() { return ngoId; }
//    public void setNgoId(String ngoId) { this.ngoId = ngoId; }
//
//    public String getIsFirstLogin() { return isFirstLogin; }
//    public void setIsFirstLogin(String isFirstLogin) { this.isFirstLogin = isFirstLogin; }
//
//    public String getIsActive() { return isActive; }
//    public void setIsActive(String isActive) { this.isActive = isActive; }
//
//    public Integer getLastOtp() { return lastOtp; }
//    public void setLastOtp(Integer lastOtp) { this.lastOtp = lastOtp; }
//
//    public Long getCreatedBy() { return createdBy; }
//    public void setCreatedBy(Long createdBy) { this.createdBy = createdBy; }
//
//    public Long getUpdatedBy() { return updatedBy; }
//    public void setUpdatedBy(Long updatedBy) { this.updatedBy = updatedBy; }
//
//    public LocalDateTime getCreatedAt() { return createdAt; }
//    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
//
//    public LocalDateTime getUpdatedAt() { return updatedAt; }
//    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
//
//    public String getFirstName() { return firstName; }
//    public void setFirstName(String firstName) { this.firstName = firstName; }
//
//    public String getLastName() { return lastName; }
//    public void setLastName(String lastName) { this.lastName = lastName; }
//
//    public String getUserLoginId() { return userLoginId; }
//    public void setUserLoginId(String userLoginId) { this.userLoginId = userLoginId; }
//
//    public String getThemeId() { return themeId; }
//    public void setThemeId(String themeId) { this.themeId = themeId; }
//
//    public String getDeviceId() { return deviceId; }
//    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }
//
//    public LocalDateTime getOtpGeneratedAt() { return otpGeneratedAt; }
//    public void setOtpGeneratedAt(LocalDateTime otpGeneratedAt) { this.otpGeneratedAt = otpGeneratedAt; }
//
//
//
//
//
//    // new getter/setter for gallery
//    public List<Object> getGallery() { return gallery; }
//    public void setGallery(List<Object> gallery) { this.gallery = gallery; }
//}


package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(name = "email_verified_at")
    private LocalDateTime emailVerifiedAt;

    private String phone;

    @Column(name = "role_id")
    private String roleId;

    private String password;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "remember_token", length = 100)
    private String rememberToken;

    @Column(name = "ngo_id")
    private String ngoId;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // ===== Everything below is NOT present in coromandel_server2 =====
    // Kept as Java fields for compatibility, but not mapped to any DB column

    @Transient
    private String userTypeId;

    @Transient
    private String refreshToken;

    @Transient
    private String lastPasswords;

    @Transient
    private LocalDateTime passwordChangedAt;

    @Transient
    private Integer failedLoginAttempts = 0;

    @Transient
    private LocalDateTime failedLoginAttemptsAt;

    @Transient
    private String designationId;

    @Transient
    private String isFirstLogin = "Y";

    @Transient
    private String isActive = "Y";

    @Transient
    private Integer lastOtp;

    @Transient
    private String firstName;

    @Transient
    private String lastName;

    @Transient
    private String userLoginId;

    @Transient
    private String themeId;

    @Transient
    private String deviceId;

    @Transient
    private LocalDateTime otpGeneratedAt;

    @Transient
    private List<Object> gallery;

    // ===== Getters and Setters (all kept, unchanged) =====

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDateTime getEmailVerifiedAt() { return emailVerifiedAt; }
    public void setEmailVerifiedAt(LocalDateTime emailVerifiedAt) { this.emailVerifiedAt = emailVerifiedAt; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getUserTypeId() { return userTypeId; }
    public void setUserTypeId(String userTypeId) { this.userTypeId = userTypeId; }

    public String getRoleId() { return roleId; }
    public void setRoleId(String roleId) { this.roleId = roleId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }

    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }

    public String getRememberToken() { return rememberToken; }
    public void setRememberToken(String rememberToken) { this.rememberToken = rememberToken; }

    public String getLastPasswords() { return lastPasswords; }
    public void setLastPasswords(String lastPasswords) { this.lastPasswords = lastPasswords; }

    public LocalDateTime getPasswordChangedAt() { return passwordChangedAt; }
    public void setPasswordChangedAt(LocalDateTime passwordChangedAt) { this.passwordChangedAt = passwordChangedAt; }

    public Integer getFailedLoginAttempts() { return failedLoginAttempts; }
    public void setFailedLoginAttempts(Integer failedLoginAttempts) { this.failedLoginAttempts = failedLoginAttempts; }

    public LocalDateTime getFailedLoginAttemptsAt() { return failedLoginAttemptsAt; }
    public void setFailedLoginAttemptsAt(LocalDateTime failedLoginAttemptsAt) { this.failedLoginAttemptsAt = failedLoginAttemptsAt; }

    public String getDesignationId() { return designationId; }
    public void setDesignationId(String designationId) { this.designationId = designationId; }

    public String getNgoId() { return ngoId; }
    public void setNgoId(String ngoId) { this.ngoId = ngoId; }

    public String getIsFirstLogin() { return isFirstLogin; }
    public void setIsFirstLogin(String isFirstLogin) { this.isFirstLogin = isFirstLogin; }

    public String getIsActive() { return isActive; }
    public void setIsActive(String isActive) { this.isActive = isActive; }

    public Integer getLastOtp() { return lastOtp; }
    public void setLastOtp(Integer lastOtp) { this.lastOtp = lastOtp; }

    public Long getCreatedBy() { return createdBy; }
    public void setCreatedBy(Long createdBy) { this.createdBy = createdBy; }

    public Long getUpdatedBy() { return updatedBy; }
    public void setUpdatedBy(Long updatedBy) { this.updatedBy = updatedBy; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUserLoginId() { return userLoginId; }
    public void setUserLoginId(String userLoginId) { this.userLoginId = userLoginId; }

    public String getThemeId() { return themeId; }
    public void setThemeId(String themeId) { this.themeId = themeId; }

    public String getDeviceId() { return deviceId; }
    public void setDeviceId(String deviceId) { this.deviceId = deviceId; }

    public LocalDateTime getOtpGeneratedAt() { return otpGeneratedAt; }
    public void setOtpGeneratedAt(LocalDateTime otpGeneratedAt) { this.otpGeneratedAt = otpGeneratedAt; }

    public List<Object> getGallery() { return gallery; }
    public void setGallery(List<Object> gallery) { this.gallery = gallery; }
}