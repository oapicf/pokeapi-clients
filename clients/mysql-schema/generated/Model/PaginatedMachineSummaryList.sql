--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedMachineSummaryList' definition.
--


--
-- SELECT template for table `PaginatedMachineSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedMachineSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedMachineSummaryList`
--
INSERT INTO `PaginatedMachineSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedMachineSummaryList`
--
UPDATE `PaginatedMachineSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedMachineSummaryList`
--
DELETE FROM `PaginatedMachineSummaryList` WHERE 0;

