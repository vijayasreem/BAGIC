package com.BAGICLoan.service;

import com.BAGICLoan.model.Trigger;
import com.BAGICLoan.repository.TriggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TriggerService {

    private final TriggerRepository triggerRepository;

    @Autowired
    public TriggerService(TriggerRepository triggerRepository) {
        this.triggerRepository = triggerRepository;
    }

    public List<Trigger> findByActionType(String actionType) {
        return triggerRepository.findByActionType(actionType);
    }

    public List<Trigger> findByCondition(String condition) {
        return triggerRepository.findByCondition(condition);
    }

    public List<Trigger> findByFormName(String formName) {
        return triggerRepository.findByFormName(formName);
    }

    public List<Trigger> findByFormInstance(String formInstance) {
        return triggerRepository.findByFormInstance(formInstance);
    }

    public List<Trigger> findByErrorStatus(boolean errorStatus) {
        return triggerRepository.findByErrorStatus(errorStatus);
    }

    public List<Trigger> findByAuditStatus(boolean auditStatus) {
        return triggerRepository.findByAuditStatus(auditStatus);
    }

    public List<Trigger> findByActionTypeAndCondition(String actionType, String condition) {
        return triggerRepository.findByActionTypeAndCondition(actionType, condition);
    }

    public List<Trigger> findByFormNameAndFormInstance(String formName, String formInstance) {
        return triggerRepository.findByFormNameAndFormInstance(formName, formInstance);
    }

    public List<Trigger> findByActionTypeAndErrorStatus(String actionType, boolean errorStatus) {
        return triggerRepository.findByActionTypeAndErrorStatus(actionType, errorStatus);
    }

    public List<Trigger> findByActionTypeAndAuditStatus(String actionType, boolean auditStatus) {
        return triggerRepository.findByActionTypeAndAuditStatus(actionType, auditStatus);
    }

    public List<Trigger> findByConditionAndErrorStatus(String condition, boolean errorStatus) {
        return triggerRepository.findByConditionAndErrorStatus(condition, errorStatus);
    }

    public List<Trigger> findByConditionAndAuditStatus(String condition, boolean auditStatus) {
        return triggerRepository.findByConditionAndAuditStatus(condition, auditStatus);
    }

    public List<Trigger> findByFormNameAndErrorStatus(String formName, boolean errorStatus) {
        return triggerRepository.findByFormNameAndErrorStatus(formName, errorStatus);
    }

    public List<Trigger> findByFormNameAndAuditStatus(String formName, boolean auditStatus) {
        return triggerRepository.findByFormNameAndAuditStatus(formName, auditStatus);
    }

    public List<Trigger> findByFormInstanceAndErrorStatus(String formInstance, boolean errorStatus) {
        return triggerRepository.findByFormInstanceAndErrorStatus(formInstance, errorStatus);
    }

    public List<Trigger> findByFormInstanceAndAuditStatus(String formInstance, boolean auditStatus) {
        return triggerRepository.findByFormInstanceAndAuditStatus(formInstance, auditStatus);
    }
}