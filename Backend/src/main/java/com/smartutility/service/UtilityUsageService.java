package com.smartutility.service;

import com.smartutility.dto.UtilityUsageDTO;
import com.smartutility.model.UtilityUsage;
import com.smartutility.repository.UtilityUsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing utility usage data.
 */
@Service
public class UtilityUsageService {

    @Autowired
    private UtilityUsageRepository usageRepository;

    /**
     * Adds new utility usage data.
     *
     * @param usageDTO Data Transfer Object representing the utility usage.
     * @return UtilityUsage entity that was created.
     */
    public UtilityUsage addUsage(UtilityUsageDTO usageDTO) {
        UtilityUsage usage = new UtilityUsage(usageDTO.getUserId(), usageDTO.getUtilityType(), usageDTO.getUsageAmount());
        return usageRepository.save(usage);
    }

    /**
     * Retrieves utility usage data for a specific user.
     *
     * @param userId ID of the user whose usage data is to be fetched.
     * @return List of utility usage data for the specified user.
     */
    public List<UtilityUsage> getUsageByUserId(Long userId) {
        return usageRepository.findByUserId(userId);
    }
}
