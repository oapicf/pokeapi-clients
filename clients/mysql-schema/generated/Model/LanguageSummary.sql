--
-- PokéAPI.
-- Prepared SQL queries for 'LanguageSummary' definition.
--


--
-- SELECT template for table `LanguageSummary`
--
SELECT `name`, `url` FROM `LanguageSummary` WHERE 1;

--
-- INSERT template for table `LanguageSummary`
--
INSERT INTO `LanguageSummary`(`name`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `LanguageSummary`
--
UPDATE `LanguageSummary` SET `name` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `LanguageSummary`
--
DELETE FROM `LanguageSummary` WHERE 0;

