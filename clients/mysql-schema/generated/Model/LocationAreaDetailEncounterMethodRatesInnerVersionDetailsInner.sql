--
-- PokéAPI.
-- Prepared SQL queries for 'LocationAreaDetail_encounter_method_rates_inner_version_details_inner' definition.
--


--
-- SELECT template for table `LocationAreaDetail_encounter_method_rates_inner_version_details_`
--
SELECT `rate`, `version` FROM `LocationAreaDetail_encounter_method_rates_inner_version_details_` WHERE 1;

--
-- INSERT template for table `LocationAreaDetail_encounter_method_rates_inner_version_details_`
--
INSERT INTO `LocationAreaDetail_encounter_method_rates_inner_version_details_`(`rate`, `version`) VALUES (?, ?);

--
-- UPDATE template for table `LocationAreaDetail_encounter_method_rates_inner_version_details_`
--
UPDATE `LocationAreaDetail_encounter_method_rates_inner_version_details_` SET `rate` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `LocationAreaDetail_encounter_method_rates_inner_version_details_`
--
DELETE FROM `LocationAreaDetail_encounter_method_rates_inner_version_details_` WHERE 0;

