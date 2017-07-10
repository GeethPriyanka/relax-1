package com.doerit.dao;

import com.doerit.model.Patient;
import com.doerit.model.PatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int countByExample(PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int deleteByExample(PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int insert(Patient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int insertSelective(Patient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    List<Patient> selectByExample(PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    Patient selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int updateByPrimaryKeySelective(Patient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    int updateByPrimaryKey(Patient record);
}