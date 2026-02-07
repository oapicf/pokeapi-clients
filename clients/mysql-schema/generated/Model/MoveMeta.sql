--
-- PokéAPI.
-- Prepared SQL queries for 'MoveMeta' definition.
--


--
-- SELECT template for table `MoveMeta`
--
SELECT `ailment`, `category`, `min_hits`, `max_hits`, `min_turns`, `max_turns`, `drain`, `healing`, `crit_rate`, `ailment_chance`, `flinch_chance`, `stat_chance` FROM `MoveMeta` WHERE 1;

--
-- INSERT template for table `MoveMeta`
--
INSERT INTO `MoveMeta`(`ailment`, `category`, `min_hits`, `max_hits`, `min_turns`, `max_turns`, `drain`, `healing`, `crit_rate`, `ailment_chance`, `flinch_chance`, `stat_chance`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MoveMeta`
--
UPDATE `MoveMeta` SET `ailment` = ?, `category` = ?, `min_hits` = ?, `max_hits` = ?, `min_turns` = ?, `max_turns` = ?, `drain` = ?, `healing` = ?, `crit_rate` = ?, `ailment_chance` = ?, `flinch_chance` = ?, `stat_chance` = ? WHERE 1;

--
-- DELETE template for table `MoveMeta`
--
DELETE FROM `MoveMeta` WHERE 0;

