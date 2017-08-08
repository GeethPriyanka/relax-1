package com.doerit.model;

import java.util.Date;

public class PatientVisit {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.PATIENT_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private String patientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.DEPARTMENT_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private String departmentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.COMMENT
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.STATUS
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.SORT_ORDER
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private Integer sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.INSERT_USER_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private String insertUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.UPDATE_USER_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private String updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.INSERT_DATETIME
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private Date insertDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_patient_visit.UPDATE_DATETIME
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    private Date updateDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.ID
     *
     * @return the value of tbl_patient_visit.ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.ID
     *
     * @param id the value for tbl_patient_visit.ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.PATIENT_ID
     *
     * @return the value of tbl_patient_visit.PATIENT_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.PATIENT_ID
     *
     * @param patientId the value for tbl_patient_visit.PATIENT_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.DEPARTMENT_ID
     *
     * @return the value of tbl_patient_visit.DEPARTMENT_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.DEPARTMENT_ID
     *
     * @param departmentId the value for tbl_patient_visit.DEPARTMENT_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.COMMENT
     *
     * @return the value of tbl_patient_visit.COMMENT
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.COMMENT
     *
     * @param comment the value for tbl_patient_visit.COMMENT
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.STATUS
     *
     * @return the value of tbl_patient_visit.STATUS
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.STATUS
     *
     * @param status the value for tbl_patient_visit.STATUS
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.SORT_ORDER
     *
     * @return the value of tbl_patient_visit.SORT_ORDER
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.SORT_ORDER
     *
     * @param sortOrder the value for tbl_patient_visit.SORT_ORDER
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.INSERT_USER_ID
     *
     * @return the value of tbl_patient_visit.INSERT_USER_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public String getInsertUserId() {
        return insertUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.INSERT_USER_ID
     *
     * @param insertUserId the value for tbl_patient_visit.INSERT_USER_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId == null ? null : insertUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.UPDATE_USER_ID
     *
     * @return the value of tbl_patient_visit.UPDATE_USER_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.UPDATE_USER_ID
     *
     * @param updateUserId the value for tbl_patient_visit.UPDATE_USER_ID
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.INSERT_DATETIME
     *
     * @return the value of tbl_patient_visit.INSERT_DATETIME
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public Date getInsertDatetime() {
        return insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.INSERT_DATETIME
     *
     * @param insertDatetime the value for tbl_patient_visit.INSERT_DATETIME
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_visit.UPDATE_DATETIME
     *
     * @return the value of tbl_patient_visit.UPDATE_DATETIME
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_visit.UPDATE_DATETIME
     *
     * @param updateDatetime the value for tbl_patient_visit.UPDATE_DATETIME
     *
     * @mbggenerated Tue Aug 08 18:24:58 IST 2017
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}