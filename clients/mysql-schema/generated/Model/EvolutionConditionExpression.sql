--
-- PokéAPI.
-- Prepared SQL queries for 'EvolutionConditionExpression' definition.
--


--
-- SELECT template for table `EvolutionConditionExpression`
--
SELECT `expression`, `percentage_chance`, `variables` FROM `EvolutionConditionExpression` WHERE 1;

--
-- INSERT template for table `EvolutionConditionExpression`
--
INSERT INTO `EvolutionConditionExpression`(`expression`, `percentage_chance`, `variables`) VALUES (?, ?, ?);

--
-- UPDATE template for table `EvolutionConditionExpression`
--
UPDATE `EvolutionConditionExpression` SET `expression` = ?, `percentage_chance` = ?, `variables` = ? WHERE 1;

--
-- DELETE template for table `EvolutionConditionExpression`
--
DELETE FROM `EvolutionConditionExpression` WHERE 0;

