-- Create trigger to update `updated_at` on update
CREATE TRIGGER trg_UpdateUtilityUsage
ON utility_usage
AFTER UPDATE
AS
BEGIN
    UPDATE utility_usage
    SET updated_at = GETDATE()
    FROM utility_usage
    INNER JOIN inserted ON utility_usage.id = inserted.id;
END;
