package org.lamisplus.modules.triage.repository;

import com.foreach.across.modules.hibernate.jpa.repositories.CommonJpaRepository;
import org.lamisplus.modules.triage.domain.entity.VitalSign;


import java.util.List;
import java.util.Optional;

public interface VitalSignRepository extends CommonJpaRepository<VitalSign, Long> {
    List<VitalSign> getVitalSignByArchived(Integer archived);
    Optional<VitalSign> getVitalSignByVisitIdAndArchived(Long visitId, Integer archived);

    List<VitalSign> getVitalSignByPersonIdAndArchived(Long personId, Integer archived);
}
