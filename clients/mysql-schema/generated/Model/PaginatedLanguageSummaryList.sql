--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedLanguageSummaryList' definition.
--


--
-- SELECT template for table `PaginatedLanguageSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedLanguageSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedLanguageSummaryList`
--
INSERT INTO `PaginatedLanguageSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedLanguageSummaryList`
--
UPDATE `PaginatedLanguageSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedLanguageSummaryList`
--
DELETE FROM `PaginatedLanguageSummaryList` WHERE 0;

