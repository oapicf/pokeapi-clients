--
-- PokéAPI.
-- Prepared SQL queries for 'PaginatedPalParkAreaSummaryList' definition.
--


--
-- SELECT template for table `PaginatedPalParkAreaSummaryList`
--
SELECT `count`, `next`, `previous`, `results` FROM `PaginatedPalParkAreaSummaryList` WHERE 1;

--
-- INSERT template for table `PaginatedPalParkAreaSummaryList`
--
INSERT INTO `PaginatedPalParkAreaSummaryList`(`count`, `next`, `previous`, `results`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PaginatedPalParkAreaSummaryList`
--
UPDATE `PaginatedPalParkAreaSummaryList` SET `count` = ?, `next` = ?, `previous` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `PaginatedPalParkAreaSummaryList`
--
DELETE FROM `PaginatedPalParkAreaSummaryList` WHERE 0;

