package com.BAGICLoan.controller;

import com.BAGICLoan.model.Trigger;
import com.BAGICLoan.service.TriggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/triggers")
public class TriggerController {

    private final TriggerService triggerService;

    @Autowired
    public TriggerController(TriggerService triggerService) {
        this.triggerService = triggerService;
    }

    @GetMapping("/actionType/{actionType}")
    public List<Trigger> findByActionType(@PathVariable String actionType) {
        return triggerService.findByActionType(actionType);
    }

    @GetMapping("/condition/{condition}")
    public List<Trigger> findByCondition(@PathVariable String condition) {
        return triggerService.findByCondition(condition);
    }

    @GetMapping("/formName/{formName}")
    public List<Trigger> findByFormName(@PathVariable String formName) {
        return triggerService.findByFormName(formName);
    }

    @GetMapping("/formInstance/{formInstance}")
    public List<Trigger> findByFormInstance(@PathVariable String formInstance) {
        return triggerService.findByFormInstance(formInstance);
    }

    @GetMapping("/errorStatus/{errorStatus}")
    public List<Trigger> findByErrorStatus(@PathVariable boolean errorStatus) {
        return triggerService.findByErrorStatus(errorStatus);
    }

    @GetMapping("/auditStatus/{auditStatus}")
    public List<Trigger> findByAuditStatus(@PathVariable boolean auditStatus) {
        return triggerService.findByAuditStatus(auditStatus);
    }

    @GetMapping("/actionType/{actionType}/condition/{condition}")
    public List<Trigger> findByActionTypeAndCondition(@PathVariable String actionType, @PathVariable String condition) {
        return triggerService.findByActionTypeAndCondition(actionType, condition);
    }

    @GetMapping("/formName/{formName}/formInstance/{formInstance}")
    public List<Trigger> findByFormNameAndFormInstance(@PathVariable String formName, @PathVariable String formInstance) {
        return triggerService.findByFormNameAndFormInstance(formName, formInstance);
    }

    @GetMapping("/actionType/{actionType}/errorStatus/{errorStatus}")
    public List<Trigger> findByActionTypeAndErrorStatus(@PathVariable String actionType, @PathVariable boolean errorStatus) {
        return triggerService.findByActionTypeAndErrorStatus(actionType, errorStatus);
    }

    @GetMapping("/actionType/{actionType}/auditStatus/{auditStatus}")
    public List<Trigger> findByActionTypeAndAuditStatus(@PathVariable String actionType, @PathVariable boolean auditStatus) {
        return triggerService.findByActionTypeAndAuditStatus(actionType, auditStatus);
    }

    @GetMapping("/condition/{condition}/errorStatus/{errorStatus}")
    public List<Trigger> findByConditionAndErrorStatus(@PathVariable String condition, @PathVariable boolean errorStatus) {
        return triggerService.findByConditionAndErrorStatus(condition, errorStatus);
    }

    @GetMapping("/condition/{condition}/auditStatus/{auditStatus}")
    public List<Trigger> findByConditionAndAuditStatus(@PathVariable String condition, @PathVariable boolean auditStatus) {
        return triggerService.findByConditionAndAuditStatus(condition, auditStatus);
    }

    @GetMapping("/formName/{formName}/errorStatus/{errorStatus}")
    public List<Trigger> findByFormNameAndErrorStatus(@PathVariable String formName, @PathVariable boolean errorStatus) {
        return triggerService.findByFormNameAndErrorStatus(formName, errorStatus);
    }

    @GetMapping("/formName/{formName}/auditStatus/{auditStatus}")
    public List<Trigger> findByFormNameAndAuditStatus(@PathVariable String formName, @PathVariable boolean auditStatus) {
        return triggerService.findByFormNameAndAuditStatus(formName, auditStatus);
    }

    @GetMapping("/formInstance/{formInstance}/errorStatus/{errorStatus}")
    public List<Trigger> findByFormInstanceAndErrorStatus(@PathVariable String formInstance, @PathVariable boolean errorStatus) {
        return triggerService.findByFormInstanceAndErrorStatus(formInstance, errorStatus);
    }

    @GetMapping("/formInstance/{formInstance}/auditStatus/{auditStatus}")
    public List<Trigger> findByFormInstanceAndAuditStatus(@PathVariable String formInstance, @PathVariable boolean auditStatus) {
        return triggerService.findByFormInstanceAndAuditStatus(formInstance, auditStatus);
    }
}