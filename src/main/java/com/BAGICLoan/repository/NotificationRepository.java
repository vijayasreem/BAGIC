
package com.BAGICLoan.repository;

import com.BAGICLoan.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    @Query("SELECT n FROM Notification n WHERE n.applicantId = ?1")
    List<Notification> findByApplicantId(Long applicantId);

    @Query("SELECT n FROM Notification n WHERE n.applicantId = ?1 AND n.status = ?2")
    List<Notification> findByApplicantIdAndStatus(Long applicantId, String status);

    @Query("SELECT n FROM Notification n WHERE n.applicantId = ?1 AND n.type = ?2")
    List<Notification> findByApplicantIdAndType(Long applicantId, String type);

    @Query("SELECT n FROM Notification n WHERE n.applicantId = ?1 AND n.type = ?2 AND n.status = ?3")
    List<Notification> findByApplicantIdAndTypeAndStatus(Long applicantId, String type, String status);

    @Query("SELECT n FROM Notification n WHERE n.applicantId = ?1 AND n.type = ?2 ORDER BY n.timestamp DESC")
    List<Notification> findLatestByApplicantIdAndType(Long applicantId, String type);

    @Query("SELECT n FROM Notification n WHERE n.applicantId = ?1 AND n.type = ?2 AND n.status = ?3 ORDER BY n.timestamp DESC")
    List<Notification> findLatestByApplicantIdAndTypeAndStatus(Long applicantId, String type, String status);
}
