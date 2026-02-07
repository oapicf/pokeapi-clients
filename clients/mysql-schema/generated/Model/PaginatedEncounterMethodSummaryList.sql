--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedEncounterMethodSummaryList' definition.
--


--
-- SELECT template for table `PaginatedEncounterMethodSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedEncounterMethodSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedEncounterMethodSummaryList`
--
INSERT INTO `PaginatedEncounterMethodSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedEncounterMethodSummaryList`
--
UPDATE `PaginatedEncounterMethodSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedEncounterMethodSummaryList`
--
DELETE FROM `PaginatedEncounterMethodSummaryList` WHERE 0;

