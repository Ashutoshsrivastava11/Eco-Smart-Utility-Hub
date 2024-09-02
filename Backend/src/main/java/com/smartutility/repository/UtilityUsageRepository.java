package com.smartutility.repository;

import com.smartutility.model.UtilityUsage;
import java.util.List;

/**
 * Repository interface for UtilityUsage entity.
 */
@Repository
public interface UtilityUsageRepository extends JpaRepository<UtilityUsage, Long> {

    List<UtilityUsage> findByUserId(Long userId);
}
