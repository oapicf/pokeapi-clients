--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedAbilitySummaryList' definition.
--


--
-- SELECT template for table `PaginatedAbilitySummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedAbilitySummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedAbilitySummaryList`
--
INSERT INTO `PaginatedAbilitySummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedAbilitySummaryList`
--
UPDATE `PaginatedAbilitySummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedAbilitySummaryList`
--
DELETE FROM `PaginatedAbilitySummaryList` WHERE 0;

