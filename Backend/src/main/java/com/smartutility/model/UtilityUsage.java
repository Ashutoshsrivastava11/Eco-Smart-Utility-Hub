package com.smartutility.model;

/**
 * Entity representing utility usage data in the system.
 */
@Entity
@Table(name = "utility_usage")
public class UtilityUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String utilityType;

    @Column(nullable = false)
    private Double usageAmount;

    // Constructors, Getters, Setters
}
