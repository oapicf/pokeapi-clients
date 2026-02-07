--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedBerryFirmnessSummaryList' definition.
--


--
-- SELECT template for table `PaginatedBerryFirmnessSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedBerryFirmnessSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedBerryFirmnessSummaryList`
--
INSERT INTO `PaginatedBerryFirmnessSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedBerryFirmnessSummaryList`
--
UPDATE `PaginatedBerryFirmnessSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedBerryFirmnessSummaryList`
--
DELETE FROM `PaginatedBerryFirmnessSummaryList` WHERE 0;

