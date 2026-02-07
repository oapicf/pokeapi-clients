--
-- PokéAPI.
-- Prepared SQL queries for 'PokeathlonStatDetail_affecting_natures_increase_inner' definition.
--


--
-- SELECT template for table `PokeathlonStatDetail_affecting_natures_increase_inner`
--
SELECT `max_change`, `nature` FROM `PokeathlonStatDetail_affecting_natures_increase_inner` WHERE 1;

--
-- INSERT template for table `PokeathlonStatDetail_affecting_natures_increase_inner`
--
INSERT INTO `PokeathlonStatDetail_affecting_natures_increase_inner`(`max_change`, `nature`) VALUES (?, ?);

--
-- UPDATE template for table `PokeathlonStatDetail_affecting_natures_increase_inner`
--
UPDATE `PokeathlonStatDetail_affecting_natures_increase_inner` SET `max_change` = ?, `nature` = ? WHERE 1;

--
-- DELETE template for table `PokeathlonStatDetail_affecting_natures_increase_inner`
--
DELETE FROM `PokeathlonStatDetail_affecting_natures_increase_inner` WHERE 0;

