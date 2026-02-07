--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedGenderSummaryList' definition.
--


--
-- SELECT template for table `PaginatedGenderSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedGenderSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedGenderSummaryList`
--
INSERT INTO `PaginatedGenderSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedGenderSummaryList`
--
UPDATE `PaginatedGenderSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedGenderSummaryList`
--
DELETE FROM `PaginatedGenderSummaryList` WHERE 0;

