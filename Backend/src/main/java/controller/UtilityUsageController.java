

import com.smartutility.dto.UtilityUsageDTO;
import com.smartutility.model.UtilityUsage;
import com.smartutility.service.UtilityUsageService;
import org.springframework.beans.facST Controller for managing utility usage data.
 */
@RestController
@RequestMapping("/api/usage")
public class UtilityUsageController {

    @Autowired
    private UtilityUsageService usageService;

    /**
     * Adds new utility usage data.
     *
     * @param usageDTO Data Transfer Object representing the utility usage.
     * @return UtilityUsage entity that was created.
     */
    @PostMapping("/add")
    public UtilityUsage addUsage(@RequestBody UtilityUsageDTO usageDTO) {
        return usageService.addUsage(usageDTO);
    }

    /**
     * Retrieves utility usage data for a specific user.
     *
     * @param userId ID of the user whose usage data is to be fetched.
     * @return List of utility usage data for the specified user.
     */
    @GetMapping("/{userId}")
    public List<UtilityUsage> getUsageByUserId(@PathVariable Long userId) {
        return usageService.getUsageByUserId(userId);
    }
}
