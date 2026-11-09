--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedCurrencySummaryList' definition.
--


--
-- SELECT template for table `PaginatedCurrencySummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedCurrencySummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedCurrencySummaryList`
--
INSERT INTO `PaginatedCurrencySummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedCurrencySummaryList`
--
UPDATE `PaginatedCurrencySummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedCurrencySummaryList`
--
DELETE FROM `PaginatedCurrencySummaryList` WHERE 0;

