--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaDetail_encounter_method_rates_inner' definition.
--


--
-- SELECT template for table `LocationAreaDetail_encounter_method_rates_inner`
--
SELECT `encounter_method`, `version_details` FROM `LocationAreaDetail_encounter_method_rates_inner` WHERE 1;

--
-- INSERT template for table `LocationAreaDetail_encounter_method_rates_inner`
--
INSERT INTO `LocationAreaDetail_encounter_method_rates_inner`(`encounter_method`, `version_details`) VALUES (?, ?);

--
-- UPDATE template for table `LocationAreaDetail_encounter_method_rates_inner`
--
UPDATE `LocationAreaDetail_encounter_method_rates_inner` SET `encounter_method` = ?, `version_details` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaDetail_encounter_method_rates_inner`
--
DELETE FROM `LocationAreaDetail_encounter_method_rates_inner` WHERE 0;

