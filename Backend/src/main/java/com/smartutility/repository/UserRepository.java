package com.smartutility.repository;

import com.smartutility.model.User;

/**
 * Repository interface for User entity.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
