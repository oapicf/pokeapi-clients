--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedMoveDamageClassSummaryList' definition.
--


--
-- SELECT template for table `PaginatedMoveDamageClassSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedMoveDamageClassSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedMoveDamageClassSummaryList`
--
INSERT INTO `PaginatedMoveDamageClassSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedMoveDamageClassSummaryList`
--
UPDATE `PaginatedMoveDamageClassSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedMoveDamageClassSummaryList`
--
DELETE FROM `PaginatedMoveDamageClassSummaryList` WHERE 0;

