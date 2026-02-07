--
-- PokéAPI.
-- Prepared SQL queries for 'GrowthRateDescription' definition.
--


--
-- SELECT template for table `GrowthRateDescription`
--
SELECT `description`, `language` FROM `GrowthRateDescription` WHERE 1;

--
-- INSERT template for table `GrowthRateDescription`
--
INSERT INTO `GrowthRateDescription`(`description`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `GrowthRateDescription`
--
UPDATE `GrowthRateDescription` SET `description` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `GrowthRateDescription`
--
DELETE FROM `GrowthRateDescription` WHERE 0;

