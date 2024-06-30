
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Trigger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TriggerRepository extends JpaRepository<Trigger, Long> {

    // Query to find triggers by action type
    List<Trigger> findByActionType(String actionType);

    // Query to find triggers by condition
    List<Trigger> findByCondition(String condition);

    // Query to find triggers by form name
    List<Trigger> findByFormName(String formName);

    // Query to find triggers by form instance
    List<Trigger> findByFormInstance(String formInstance);

    // Query to find triggers by error status
    List<Trigger> findByErrorStatus(boolean errorStatus);

    // Query to find triggers by audit status
    List<Trigger> findByAuditStatus(boolean auditStatus);

    // Query to find triggers by action type and condition
    List<Trigger> findByActionTypeAndCondition(String actionType, String condition);

    // Query to find triggers by form name and form instance
    List<Trigger> findByFormNameAndFormInstance(String formName, String formInstance);

    // Query to find triggers by action type and error status
    List<Trigger> findByActionTypeAndErrorStatus(String actionType, boolean errorStatus);

    // Query to find triggers by action type and audit status
    List<Trigger> findByActionTypeAndAuditStatus(String actionType, boolean auditStatus);

    // Query to find triggers by condition and error status
    List<Trigger> findByConditionAndErrorStatus(String condition, boolean errorStatus);

    // Query to find triggers by condition and audit status
    List<Trigger> findByConditionAndAuditStatus(String condition, boolean auditStatus);

    // Query to find triggers by form name and error status
    List<Trigger> findByFormNameAndErrorStatus(String formName, boolean errorStatus);

    // Query to find triggers by form name and audit status
    List<Trigger> findByFormNameAndAuditStatus(String formName, boolean auditStatus);

    // Query to find triggers by form instance and error status
    List<Trigger> findByFormInstanceAndErrorStatus(String formInstance, boolean errorStatus);

    // Query to find triggers by form instance and audit status
    List<Trigger> findByFormInstanceAndAuditStatus(String formInstance, boolean auditStatus);
}
