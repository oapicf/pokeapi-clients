--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedEggGroupSummaryList' definition.
--


--
-- SELECT template for table `PaginatedEggGroupSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedEggGroupSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedEggGroupSummaryList`
--
INSERT INTO `PaginatedEggGroupSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedEggGroupSummaryList`
--
UPDATE `PaginatedEggGroupSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedEggGroupSummaryList`
--
DELETE FROM `PaginatedEggGroupSummaryList` WHERE 0;

