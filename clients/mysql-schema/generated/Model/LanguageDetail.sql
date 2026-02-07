--
-- PokéAPI.
-- Prepared SQL queries for 'LanguageDetail' definition.
--


--
-- SELECT template for table `LanguageDetail`
--
SELECT `id`, `name`, `official`, `iso639`, `iso3166`, `names` FROM `LanguageDetail` WHERE 1;

--
-- INSERT template for table `LanguageDetail`
--
INSERT INTO `LanguageDetail`(`id`, `name`, `official`, `iso639`, `iso3166`, `names`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LanguageDetail`
--
UPDATE `LanguageDetail` SET `id` = ?, `name` = ?, `official` = ?, `iso639` = ?, `iso3166` = ?, `names` = ? WHERE 1;

--
-- DELETE template for table `LanguageDetail`
--
DELETE FROM `LanguageDetail` WHERE 0;

