package com.BAGICLoan.service;

import com.BAGICLoan.model.Notification;
import com.BAGICLoan.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> findByApplicantId(Long applicantId) {
        return notificationRepository.findByApplicantId(applicantId);
    }

    public List<Notification> findByApplicantIdAndStatus(Long applicantId, String status) {
        return notificationRepository.findByApplicantIdAndStatus(applicantId, status);
    }

    public List<Notification> findByApplicantIdAndType(Long applicantId, String type) {
        return notificationRepository.findByApplicantIdAndType(applicantId, type);
    }

    public List<Notification> findByApplicantIdAndTypeAndStatus(Long applicantId, String type, String status) {
        return notificationRepository.findByApplicantIdAndTypeAndStatus(applicantId, type, status);
    }

    public List<Notification> findLatestByApplicantIdAndType(Long applicantId, String type) {
        return notificationRepository.findLatestByApplicantIdAndType(applicantId, type);
    }

    public List<Notification> findLatestByApplicantIdAndTypeAndStatus(Long applicantId, String type, String status) {
        return notificationRepository.findLatestByApplicantIdAndTypeAndStatus(applicantId, type, status);
    }
}