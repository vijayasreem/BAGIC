package com.BAGICLoan.controller;

import com.BAGICLoan.model.Notification;
import com.BAGICLoan.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/applicant/{applicantId}")
    public List<Notification> getNotificationsByApplicantId(@PathVariable Long applicantId) {
        return notificationService.findByApplicantId(applicantId);
    }

    @GetMapping("/applicant/{applicantId}/status/{status}")
    public List<Notification> getNotificationsByApplicantIdAndStatus(@PathVariable Long applicantId, @PathVariable String status) {
        return notificationService.findByApplicantIdAndStatus(applicantId, status);
    }

    @GetMapping("/applicant/{applicantId}/type/{type}")
    public List<Notification> getNotificationsByApplicantIdAndType(@PathVariable Long applicantId, @PathVariable String type) {
        return notificationService.findByApplicantIdAndType(applicantId, type);
    }

    @GetMapping("/applicant/{applicantId}/type/{type}/status/{status}")
    public List<Notification> getNotificationsByApplicantIdAndTypeAndStatus(@PathVariable Long applicantId, @PathVariable String type, @PathVariable String status) {
        return notificationService.findByApplicantIdAndTypeAndStatus(applicantId, type, status);
    }

    @GetMapping("/applicant/{applicantId}/type/{type}/latest")
    public List<Notification> getLatestNotificationsByApplicantIdAndType(@PathVariable Long applicantId, @PathVariable String type) {
        return notificationService.findLatestByApplicantIdAndType(applicantId, type);
    }

    @GetMapping("/applicant/{applicantId}/type/{type}/status/{status}/latest")
    public List<Notification> getLatestNotificationsByApplicantIdAndTypeAndStatus(@PathVariable Long applicantId, @PathVariable String type, @PathVariable String status) {
        return notificationService.findLatestByApplicantIdAndTypeAndStatus(applicantId, type, status);
    }
}