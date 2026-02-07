--
-- PokéAPI.
-- Prepared SQL queries for 'LanguageName' definition.
--


--
-- SELECT template for table `LanguageName`
--
SELECT `name`, `language` FROM `LanguageName` WHERE 1;

--
-- INSERT template for table `LanguageName`
--
INSERT INTO `LanguageName`(`name`, `language`) VALUES (?, ?);

--
-- UPDATE template for table `LanguageName`
--
UPDATE `LanguageName` SET `name` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `LanguageName`
--
DELETE FROM `LanguageName` WHERE 0;

