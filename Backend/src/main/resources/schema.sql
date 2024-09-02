-- Drop tables if they exist to avoid conflicts
IF OBJECT_ID('utility_usage', 'U') IS NOT NULL DROP TABLE utility_usage;
IF OBJECT_ID('users', 'U') IS NOT NULL DROP TABLE users;

-- Create the 'users' table
CREATE TABLE users (
    id BIGINT IDENTITY(1,1) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    created_at DATETIME DEFAULT GETDATE(),
    updated_at DATETIME DEFAULT GETDATE()
);

-- Create the 'utility_usage' table
CREATE TABLE utility_usage (
    id BIGINT IDENTITY(1,1) PRIMARY KEY,
    user_id BIGINT NOT NULL,
    utility_type VARCHAR(255) NOT NULL,
    usage_amount FLOAT NOT NULL,
    created_at DATETIME DEFAULT GETDATE(),
    updated_at DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
