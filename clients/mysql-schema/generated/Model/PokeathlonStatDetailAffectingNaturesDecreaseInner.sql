--
-- PokéAPI.
-- Prepared SQL queries for 'PokeathlonStatDetail_affecting_natures_decrease_inner' definition.
--


--
-- SELECT template for table `PokeathlonStatDetail_affecting_natures_decrease_inner`
--
SELECT `max_change`, `nature` FROM `PokeathlonStatDetail_affecting_natures_decrease_inner` WHERE 1;

--
-- INSERT template for table `PokeathlonStatDetail_affecting_natures_decrease_inner`
--
INSERT INTO `PokeathlonStatDetail_affecting_natures_decrease_inner`(`max_change`, `nature`) VALUES (?, ?);

--
-- UPDATE template for table `PokeathlonStatDetail_affecting_natures_decrease_inner`
--
UPDATE `PokeathlonStatDetail_affecting_natures_decrease_inner` SET `max_change` = ?, `nature` = ? WHERE 1;

--
-- DELETE template for table `PokeathlonStatDetail_affecting_natures_decrease_inner`
--
DELETE FROM `PokeathlonStatDetail_affecting_natures_decrease_inner` WHERE 0;

