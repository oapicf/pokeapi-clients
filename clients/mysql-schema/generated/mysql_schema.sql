/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `AbilityChange` generated from model 'AbilityChange'
--

CREATE TABLE IF NOT EXISTS `AbilityChange` (
  `version_group` TEXT NOT NULL,
  `effect_entries` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityChangeEffectText` generated from model 'AbilityChangeEffectText'
--

CREATE TABLE IF NOT EXISTS `AbilityChangeEffectText` (
  `effect` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityDetail` generated from model 'AbilityDetail'
--

CREATE TABLE IF NOT EXISTS `AbilityDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `is_main_series` TINYINT(1) DEFAULT NULL,
  `generation` TEXT NOT NULL,
  `names` JSON NOT NULL,
  `effect_entries` JSON NOT NULL,
  `effect_changes` JSON NOT NULL,
  `flavor_text_entries` JSON NOT NULL,
  `pokemon` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityDetail_pokemon_inner` generated from model 'AbilityDetailUnderscorepokemonUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `AbilityDetail_pokemon_inner` (
  `is_hidden` TINYINT(1) NOT NULL,
  `slot` INT NOT NULL,
  `pokemon` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityDetail_pokemon_inner_pokemon` generated from model 'AbilityDetailUnderscorepokemonUnderscoreinnerUnderscorepokemon'
--

CREATE TABLE IF NOT EXISTS `AbilityDetail_pokemon_inner_pokemon` (
  `name` TEXT NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityEffectText` generated from model 'AbilityEffectText'
--

CREATE TABLE IF NOT EXISTS `AbilityEffectText` (
  `effect` TEXT NOT NULL,
  `short_effect` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityFlavorText` generated from model 'AbilityFlavorText'
--

CREATE TABLE IF NOT EXISTS `AbilityFlavorText` (
  `flavor_text` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `version_group` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityName` generated from model 'AbilityName'
--

CREATE TABLE IF NOT EXISTS `AbilityName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilitySummary` generated from model 'AbilitySummary'
--

CREATE TABLE IF NOT EXISTS `AbilitySummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryDetail` generated from model 'BerryDetail'
--

CREATE TABLE IF NOT EXISTS `BerryDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `growth_time` INT NOT NULL,
  `max_harvest` INT NOT NULL,
  `natural_gift_power` INT NOT NULL,
  `size` INT NOT NULL,
  `smoothness` INT NOT NULL,
  `soil_dryness` INT NOT NULL,
  `firmness` TEXT NOT NULL,
  `flavors` JSON NOT NULL,
  `item` TEXT NOT NULL,
  `natural_gift_type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryDetail_flavors_inner` generated from model 'BerryDetailUnderscoreflavorsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `BerryDetail_flavors_inner` (
  `potency` INT NOT NULL,
  `flavor` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryDetail_flavors_inner_flavor` generated from model 'BerryDetailUnderscoreflavorsUnderscoreinnerUnderscoreflavor'
--

CREATE TABLE IF NOT EXISTS `BerryDetail_flavors_inner_flavor` (
  `name` TEXT DEFAULT NULL COMMENT 'The name of the flavor',
  `url` TEXT DEFAULT NULL COMMENT 'The URL to get more information about the flavor'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFirmnessDetail` generated from model 'BerryFirmnessDetail'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `berries` JSON NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFirmnessName` generated from model 'BerryFirmnessName'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFirmnessSummary` generated from model 'BerryFirmnessSummary'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorDetail` generated from model 'BerryFlavorDetail'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `berries` JSON NOT NULL,
  `contest_type` TEXT NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorDetail_berries_inner` generated from model 'BerryFlavorDetailUnderscoreberriesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorDetail_berries_inner` (
  `potency` INT NOT NULL,
  `berry` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorDetail_berries_inner_berry` generated from model 'BerryFlavorDetailUnderscoreberriesUnderscoreinnerUnderscoreberry'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorDetail_berries_inner_berry` (
  `name` TEXT DEFAULT NULL COMMENT 'The name of the berry',
  `url` TEXT DEFAULT NULL COMMENT 'The URL to get more information about the berry'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorName` generated from model 'BerryFlavorName'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorSummary` generated from model 'BerryFlavorSummary'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerrySummary` generated from model 'BerrySummary'
--

CREATE TABLE IF NOT EXISTS `BerrySummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CharacteristicDescription` generated from model 'CharacteristicDescription'
--

CREATE TABLE IF NOT EXISTS `CharacteristicDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CharacteristicDetail` generated from model 'CharacteristicDetail'
--

CREATE TABLE IF NOT EXISTS `CharacteristicDetail` (
  `id` INT NOT NULL,
  `gene_modulo` INT NOT NULL,
  `possible_values` JSON NOT NULL,
  `highest_stat` TEXT NOT NULL,
  `descriptions` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CharacteristicSummary` generated from model 'CharacteristicSummary'
--

CREATE TABLE IF NOT EXISTS `CharacteristicSummary` (
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestEffectDetail` generated from model 'ContestEffectDetail'
--

CREATE TABLE IF NOT EXISTS `ContestEffectDetail` (
  `id` INT NOT NULL,
  `appeal` INT NOT NULL,
  `jam` INT NOT NULL,
  `effect_entries` JSON NOT NULL,
  `flavor_text_entries` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestEffectEffectText` generated from model 'ContestEffectEffectText'
--

CREATE TABLE IF NOT EXISTS `ContestEffectEffectText` (
  `effect` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestEffectFlavorText` generated from model 'ContestEffectFlavorText'
--

CREATE TABLE IF NOT EXISTS `ContestEffectFlavorText` (
  `flavor_text` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestEffectSummary` generated from model 'ContestEffectSummary'
--

CREATE TABLE IF NOT EXISTS `ContestEffectSummary` (
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestTypeDetail` generated from model 'ContestTypeDetail'
--

CREATE TABLE IF NOT EXISTS `ContestTypeDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `berry_flavor` TEXT NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestTypeName` generated from model 'ContestTypeName'
--

CREATE TABLE IF NOT EXISTS `ContestTypeName` (
  `name` VARCHAR(100) NOT NULL,
  `color` VARCHAR(10) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestTypeSummary` generated from model 'ContestTypeSummary'
--

CREATE TABLE IF NOT EXISTS `ContestTypeSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EggGroupDetail` generated from model 'EggGroupDetail'
--

CREATE TABLE IF NOT EXISTS `EggGroupDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_species` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EggGroupDetail_pokemon_species_inner` generated from model 'EggGroupDetailUnderscorepokemonUnderscorespeciesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `EggGroupDetail_pokemon_species_inner` (
  `name` TEXT DEFAULT NULL COMMENT 'Pokemon species name.',
  `url` TEXT DEFAULT NULL COMMENT 'The URL to get more information about the species'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EggGroupName` generated from model 'EggGroupName'
--

CREATE TABLE IF NOT EXISTS `EggGroupName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EggGroupSummary` generated from model 'EggGroupSummary'
--

CREATE TABLE IF NOT EXISTS `EggGroupSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionDetail` generated from model 'EncounterConditionDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `values` JSON NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionName` generated from model 'EncounterConditionName'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionSummary` generated from model 'EncounterConditionSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionValueDetail` generated from model 'EncounterConditionValueDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `condition` TEXT NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionValueName` generated from model 'EncounterConditionValueName'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionValueSummary` generated from model 'EncounterConditionValueSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterMethodDetail` generated from model 'EncounterMethodDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `order` INT DEFAULT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterMethodName` generated from model 'EncounterMethodName'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterMethodSummary` generated from model 'EncounterMethodSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainDetail` generated from model 'EvolutionChainDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail` (
  `id` INT NOT NULL,
  `baby_trigger_item` TEXT NOT NULL,
  `chain` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainDetail_chain` generated from model 'EvolutionChainDetailUnderscorechain'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail_chain` (
  `evolution_details` JSON NOT NULL,
  `evolves_to` JSON NOT NULL,
  `is_baby` TINYINT(1) NOT NULL,
  `species` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainDetail_chain_evolves_to_inner` generated from model 'EvolutionChainDetailUnderscorechainUnderscoreevolvesUnderscoretoUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail_chain_evolves_to_inner` (
  `evolution_details` JSON NOT NULL,
  `is_baby` TINYINT(1) NOT NULL,
  `species` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in` generated from model 'EvolutionChainDetailUnderscorechainUnderscoreevolvesUnderscoretoUnderscoreinnerUnderscoreevolutionUnderscoredetailsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in` (
  `gender` TEXT NOT NULL,
  `held_item` TEXT NOT NULL,
  `item` TEXT NOT NULL,
  `known_move` JSON NOT NULL,
  `known_move_type` JSON NOT NULL,
  `location` TEXT NOT NULL,
  `min_affection` INT NOT NULL,
  `min_beauty` INT NOT NULL,
  `min_happiness` INT NOT NULL,
  `min_level` INT NOT NULL,
  `needs_overworld_rain` TINYINT(1) NOT NULL,
  `party_species` TEXT NOT NULL,
  `party_type` TEXT NOT NULL,
  `relative_physical_stats` TEXT NOT NULL,
  `time_of_day` TEXT NOT NULL,
  `trade_species` TEXT NOT NULL,
  `trigger` TEXT NOT NULL,
  `turn_upside_down` TINYINT(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in` generated from model 'EvolutionChainDetailUnderscorechainUnderscoreevolvesUnderscoretoUnderscoreinnerUnderscoreevolutionUnderscoredetailsUnderscoreinnerUnderscoregender'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_in` (
  `name` TEXT NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainSummary` generated from model 'EvolutionChainSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainSummary` (
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionTriggerDetail` generated from model 'EvolutionTriggerDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_species` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionTriggerName` generated from model 'EvolutionTriggerName'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionTriggerSummary` generated from model 'EvolutionTriggerSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Experience` generated from model 'Experience'
--

CREATE TABLE IF NOT EXISTS `Experience` (
  `level` INT NOT NULL,
  `experience` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderDetail` generated from model 'GenderDetail'
--

CREATE TABLE IF NOT EXISTS `GenderDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `pokemon_species_details` JSON NOT NULL,
  `required_for_evolution` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderDetail_pokemon_species_details_inner` generated from model 'GenderDetailUnderscorepokemonUnderscorespeciesUnderscoredetailsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `GenderDetail_pokemon_species_details_inner` (
  `rate` INT NOT NULL,
  `pokemon_species` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderSummary` generated from model 'GenderSummary'
--

CREATE TABLE IF NOT EXISTS `GenderSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenerationDetail` generated from model 'GenerationDetail'
--

CREATE TABLE IF NOT EXISTS `GenerationDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `abilities` JSON NOT NULL,
  `main_region` TEXT NOT NULL,
  `moves` JSON NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_species` JSON NOT NULL,
  `types` JSON NOT NULL,
  `version_groups` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenerationName` generated from model 'GenerationName'
--

CREATE TABLE IF NOT EXISTS `GenerationName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenerationSummary` generated from model 'GenerationSummary'
--

CREATE TABLE IF NOT EXISTS `GenerationSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GrowthRateDescription` generated from model 'GrowthRateDescription'
--

CREATE TABLE IF NOT EXISTS `GrowthRateDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GrowthRateDetail` generated from model 'GrowthRateDetail'
--

CREATE TABLE IF NOT EXISTS `GrowthRateDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `formula` TEXT NOT NULL,
  `descriptions` JSON NOT NULL,
  `levels` JSON NOT NULL,
  `pokemon_species` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GrowthRateSummary` generated from model 'GrowthRateSummary'
--

CREATE TABLE IF NOT EXISTS `GrowthRateSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributeDescription` generated from model 'ItemAttributeDescription'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributeDetail` generated from model 'ItemAttributeDetail'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `descriptions` JSON NOT NULL,
  `items` JSON NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributeName` generated from model 'ItemAttributeName'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributeSummary` generated from model 'ItemAttributeSummary'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemCategoryDetail` generated from model 'ItemCategoryDetail'
--

CREATE TABLE IF NOT EXISTS `ItemCategoryDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `items` JSON NOT NULL,
  `names` JSON NOT NULL,
  `pocket` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemCategoryName` generated from model 'ItemCategoryName'
--

CREATE TABLE IF NOT EXISTS `ItemCategoryName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemCategorySummary` generated from model 'ItemCategorySummary'
--

CREATE TABLE IF NOT EXISTS `ItemCategorySummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemDetail` generated from model 'ItemDetail'
--

CREATE TABLE IF NOT EXISTS `ItemDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `cost` INT DEFAULT NULL,
  `fling_power` INT DEFAULT NULL,
  `fling_effect` TEXT NOT NULL,
  `attributes` JSON NOT NULL,
  `category` TEXT NOT NULL,
  `effect_entries` JSON NOT NULL,
  `flavor_text_entries` JSON NOT NULL,
  `game_indices` JSON NOT NULL,
  `names` JSON NOT NULL,
  `held_by_pokemon` JSON NOT NULL,
  `sprites` TEXT NOT NULL,
  `baby_trigger_for` TEXT NOT NULL,
  `machines` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemDetail_baby_trigger_for` generated from model 'ItemDetailUnderscorebabyUnderscoretriggerUnderscorefor'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_baby_trigger_for` (
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemDetail_held_by_pokemon_inner` generated from model 'ItemDetailUnderscoreheldUnderscorebyUnderscorepokemonUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_held_by_pokemon_inner` (
  `pokemon` TEXT NOT NULL,
  `version-details` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemDetail_held_by_pokemon_inner_version_details_inner` generated from model 'ItemDetailUnderscoreheldUnderscorebyUnderscorepokemonUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_held_by_pokemon_inner_version_details_inner` (
  `rarity` INT NOT NULL,
  `version` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemDetail_machines_inner` generated from model 'ItemDetailUnderscoremachinesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_machines_inner` (
  `machine` TEXT NOT NULL,
  `version_group` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemDetail_sprites` generated from model 'ItemDetailUnderscoresprites'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_sprites` (
  `default` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemEffectText` generated from model 'ItemEffectText'
--

CREATE TABLE IF NOT EXISTS `ItemEffectText` (
  `effect` TEXT NOT NULL,
  `short_effect` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemFlavorText` generated from model 'ItemFlavorText'
--

CREATE TABLE IF NOT EXISTS `ItemFlavorText` (
  `text` TEXT NOT NULL,
  `version_group` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemFlingEffectDetail` generated from model 'ItemFlingEffectDetail'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `effect_entries` JSON NOT NULL,
  `items` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemFlingEffectEffectText` generated from model 'ItemFlingEffectEffectText'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectEffectText` (
  `effect` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemFlingEffectSummary` generated from model 'ItemFlingEffectSummary'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemGameIndex` generated from model 'ItemGameIndex'
--

CREATE TABLE IF NOT EXISTS `ItemGameIndex` (
  `game_index` INT NOT NULL,
  `generation` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemName` generated from model 'ItemName'
--

CREATE TABLE IF NOT EXISTS `ItemName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemPocketDetail` generated from model 'ItemPocketDetail'
--

CREATE TABLE IF NOT EXISTS `ItemPocketDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `categories` JSON NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemPocketName` generated from model 'ItemPocketName'
--

CREATE TABLE IF NOT EXISTS `ItemPocketName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemPocketSummary` generated from model 'ItemPocketSummary'
--

CREATE TABLE IF NOT EXISTS `ItemPocketSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemSummary` generated from model 'ItemSummary'
--

CREATE TABLE IF NOT EXISTS `ItemSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LanguageDetail` generated from model 'LanguageDetail'
--

CREATE TABLE IF NOT EXISTS `LanguageDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `official` TINYINT(1) DEFAULT NULL,
  `iso639` VARCHAR(10) NOT NULL,
  `iso3166` VARCHAR(2) NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LanguageName` generated from model 'LanguageName'
--

CREATE TABLE IF NOT EXISTS `LanguageName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LanguageSummary` generated from model 'LanguageSummary'
--

CREATE TABLE IF NOT EXISTS `LanguageSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaDetail` generated from model 'LocationAreaDetail'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `game_index` INT NOT NULL,
  `encounter_method_rates` JSON NOT NULL,
  `location` TEXT NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_encounters` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaDetail_encounter_method_rates_inner` generated from model 'LocationAreaDetailUnderscoreencounterUnderscoremethodUnderscoreratesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_encounter_method_rates_inner` (
  `encounter_method` TEXT NOT NULL,
  `version_details` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaDetail_encounter_method_rates_inner_version_details_` generated from model 'LocationAreaDetailUnderscoreencounterUnderscoremethodUnderscoreratesUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_encounter_method_rates_inner_version_details_` (
  `rate` INT NOT NULL,
  `version` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaDetail_pokemon_encounters_inner` generated from model 'LocationAreaDetailUnderscorepokemonUnderscoreencountersUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_pokemon_encounters_inner` (
  `pokemon` TEXT NOT NULL,
  `version_details` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` generated from model 'LocationAreaDetailUnderscorepokemonUnderscoreencountersUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` (
  `version` TEXT NOT NULL,
  `max_chance` INT NOT NULL,
  `encounter_details` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` generated from model 'LocationAreaDetailUnderscorepokemonUnderscoreencountersUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinnerUnderscoreencounterUnderscoredetails'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_pokemon_encounters_inner_version_details_inne` (
  `min_level` INT NOT NULL,
  `max_level` INT NOT NULL,
  `condition_values` TEXT DEFAULT NULL,
  `chance` INT NOT NULL,
  `method` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaName` generated from model 'LocationAreaName'
--

CREATE TABLE IF NOT EXISTS `LocationAreaName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaSummary` generated from model 'LocationAreaSummary'
--

CREATE TABLE IF NOT EXISTS `LocationAreaSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationDetail` generated from model 'LocationDetail'
--

CREATE TABLE IF NOT EXISTS `LocationDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `region` TEXT NOT NULL,
  `names` JSON NOT NULL,
  `game_indices` JSON NOT NULL,
  `areas` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationGameIndex` generated from model 'LocationGameIndex'
--

CREATE TABLE IF NOT EXISTS `LocationGameIndex` (
  `game_index` INT NOT NULL,
  `generation` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationName` generated from model 'LocationName'
--

CREATE TABLE IF NOT EXISTS `LocationName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationSummary` generated from model 'LocationSummary'
--

CREATE TABLE IF NOT EXISTS `LocationSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MachineDetail` generated from model 'MachineDetail'
--

CREATE TABLE IF NOT EXISTS `MachineDetail` (
  `id` INT NOT NULL,
  `item` TEXT NOT NULL,
  `version_group` TEXT NOT NULL,
  `move` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MachineSummary` generated from model 'MachineSummary'
--

CREATE TABLE IF NOT EXISTS `MachineSummary` (
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveBattleStyleDetail` generated from model 'MoveBattleStyleDetail'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveBattleStyleName` generated from model 'MoveBattleStyleName'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveBattleStyleSummary` generated from model 'MoveBattleStyleSummary'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveChange` generated from model 'MoveChange'
--

CREATE TABLE IF NOT EXISTS `MoveChange` (
  `accuracy` INT DEFAULT NULL,
  `power` INT DEFAULT NULL,
  `pp` INT DEFAULT NULL,
  `effect_chance` INT NOT NULL,
  `effect_entries` JSON NOT NULL,
  `type` TEXT NOT NULL,
  `version_group` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveChange_effect_entries_inner` generated from model 'MoveChangeUnderscoreeffectUnderscoreentriesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MoveChange_effect_entries_inner` (
  `effect` TEXT NOT NULL,
  `short_effect` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDamageClassDescription` generated from model 'MoveDamageClassDescription'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDamageClassDetail` generated from model 'MoveDamageClassDetail'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `descriptions` JSON NOT NULL,
  `moves` JSON NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDamageClassName` generated from model 'MoveDamageClassName'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDamageClassSummary` generated from model 'MoveDamageClassSummary'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail` generated from model 'MoveDetail'
--

CREATE TABLE IF NOT EXISTS `MoveDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `accuracy` INT DEFAULT NULL,
  `effect_chance` INT NOT NULL,
  `pp` INT DEFAULT NULL,
  `priority` INT DEFAULT NULL,
  `power` INT DEFAULT NULL,
  `contest_combos` TEXT NOT NULL,
  `contest_type` TEXT NOT NULL,
  `contest_effect` TEXT NOT NULL,
  `damage_class` TEXT NOT NULL,
  `effect_entries` JSON NOT NULL,
  `effect_changes` JSON NOT NULL,
  `generation` TEXT NOT NULL,
  `meta` TEXT NOT NULL,
  `names` JSON NOT NULL,
  `past_values` JSON NOT NULL,
  `stat_changes` JSON NOT NULL,
  `super_contest_effect` TEXT NOT NULL,
  `target` TEXT NOT NULL,
  `type` TEXT NOT NULL,
  `machines` JSON NOT NULL,
  `flavor_text_entries` JSON NOT NULL,
  `learned_by_pokemon` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail_contest_combos` generated from model 'MoveDetailUnderscorecontestUnderscorecombos'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_contest_combos` (
  `normal` TEXT NOT NULL,
  `super` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail_contest_combos_normal` generated from model 'MoveDetailUnderscorecontestUnderscorecombosUnderscorenormal'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_contest_combos_normal` (
  `use_before` JSON NOT NULL,
  `use_after` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail_effect_changes_inner` generated from model 'MoveDetailUnderscoreeffectUnderscorechangesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_effect_changes_inner` (
  `effect_entries` JSON NOT NULL,
  `version_group` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail_effect_changes_inner_effect_entries_inner` generated from model 'MoveDetailUnderscoreeffectUnderscorechangesUnderscoreinnerUnderscoreeffectUnderscoreentriesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_effect_changes_inner_effect_entries_inner` (
  `effect` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail_machines_inner` generated from model 'MoveDetailUnderscoremachinesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_machines_inner` (
  `machine` TEXT NOT NULL,
  `version_group` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail_machines_inner_machine` generated from model 'MoveDetailUnderscoremachinesUnderscoreinnerUnderscoremachine'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_machines_inner_machine` (
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail_stat_changes_inner` generated from model 'MoveDetailUnderscorestatUnderscorechangesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_stat_changes_inner` (
  `change` INT NOT NULL,
  `stat` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveFlavorText` generated from model 'MoveFlavorText'
--

CREATE TABLE IF NOT EXISTS `MoveFlavorText` (
  `flavor_text` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `version_group` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveLearnMethodDescription` generated from model 'MoveLearnMethodDescription'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveLearnMethodDetail` generated from model 'MoveLearnMethodDetail'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `names` JSON NOT NULL,
  `descriptions` JSON NOT NULL,
  `version_groups` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveLearnMethodName` generated from model 'MoveLearnMethodName'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveLearnMethodSummary` generated from model 'MoveLearnMethodSummary'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMeta` generated from model 'MoveMeta'
--

CREATE TABLE IF NOT EXISTS `MoveMeta` (
  `ailment` TEXT NOT NULL,
  `category` TEXT NOT NULL,
  `min_hits` INT DEFAULT NULL,
  `max_hits` INT DEFAULT NULL,
  `min_turns` INT DEFAULT NULL,
  `max_turns` INT DEFAULT NULL,
  `drain` INT DEFAULT NULL,
  `healing` INT DEFAULT NULL,
  `crit_rate` INT DEFAULT NULL,
  `ailment_chance` INT DEFAULT NULL,
  `flinch_chance` INT DEFAULT NULL,
  `stat_chance` INT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaAilmentDetail` generated from model 'MoveMetaAilmentDetail'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `moves` JSON NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaAilmentName` generated from model 'MoveMetaAilmentName'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaAilmentSummary` generated from model 'MoveMetaAilmentSummary'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaCategoryDescription` generated from model 'MoveMetaCategoryDescription'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaCategoryDetail` generated from model 'MoveMetaCategoryDetail'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `descriptions` JSON NOT NULL,
  `moves` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaCategorySummary` generated from model 'MoveMetaCategorySummary'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategorySummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveName` generated from model 'MoveName'
--

CREATE TABLE IF NOT EXISTS `MoveName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveSummary` generated from model 'MoveSummary'
--

CREATE TABLE IF NOT EXISTS `MoveSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveTargetDescription` generated from model 'MoveTargetDescription'
--

CREATE TABLE IF NOT EXISTS `MoveTargetDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveTargetDetail` generated from model 'MoveTargetDetail'
--

CREATE TABLE IF NOT EXISTS `MoveTargetDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `descriptions` JSON NOT NULL,
  `moves` JSON NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveTargetName` generated from model 'MoveTargetName'
--

CREATE TABLE IF NOT EXISTS `MoveTargetName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveTargetSummary` generated from model 'MoveTargetSummary'
--

CREATE TABLE IF NOT EXISTS `MoveTargetSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureBattleStylePreference` generated from model 'NatureBattleStylePreference'
--

CREATE TABLE IF NOT EXISTS `NatureBattleStylePreference` (
  `low_hp_preference` INT NOT NULL,
  `high_hp_preference` INT NOT NULL,
  `move_battle_style` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureDetail` generated from model 'NatureDetail'
--

CREATE TABLE IF NOT EXISTS `NatureDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `decreased_stat` TEXT NOT NULL,
  `increased_stat` TEXT NOT NULL,
  `likes_flavor` TEXT NOT NULL,
  `hates_flavor` TEXT NOT NULL,
  `berries` JSON NOT NULL,
  `pokeathlon_stat_changes` JSON NOT NULL,
  `move_battle_style_preferences` JSON NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureDetail_pokeathlon_stat_changes_inner` generated from model 'NatureDetailUnderscorepokeathlonUnderscorestatUnderscorechangesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `NatureDetail_pokeathlon_stat_changes_inner` (
  `max_change` INT NOT NULL,
  `pokeathlon_stat` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureName` generated from model 'NatureName'
--

CREATE TABLE IF NOT EXISTS `NatureName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureSummary` generated from model 'NatureSummary'
--

CREATE TABLE IF NOT EXISTS `NatureSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedAbilitySummaryList` generated from model 'PaginatedAbilitySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedAbilitySummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedBerryFirmnessSummaryList` generated from model 'PaginatedBerryFirmnessSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerryFirmnessSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedBerryFlavorSummaryList` generated from model 'PaginatedBerryFlavorSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerryFlavorSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedBerrySummaryList` generated from model 'PaginatedBerrySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerrySummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedCharacteristicSummaryList` generated from model 'PaginatedCharacteristicSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedCharacteristicSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedContestEffectSummaryList` generated from model 'PaginatedContestEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedContestEffectSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedContestTypeSummaryList` generated from model 'PaginatedContestTypeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedContestTypeSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEggGroupSummaryList` generated from model 'PaginatedEggGroupSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEggGroupSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEncounterConditionSummaryList` generated from model 'PaginatedEncounterConditionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterConditionSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEncounterConditionValueSummaryList` generated from model 'PaginatedEncounterConditionValueSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterConditionValueSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEncounterMethodSummaryList` generated from model 'PaginatedEncounterMethodSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterMethodSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEvolutionChainSummaryList` generated from model 'PaginatedEvolutionChainSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionChainSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEvolutionTriggerSummaryList` generated from model 'PaginatedEvolutionTriggerSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionTriggerSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedGenderSummaryList` generated from model 'PaginatedGenderSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGenderSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedGenerationSummaryList` generated from model 'PaginatedGenerationSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGenerationSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedGrowthRateSummaryList` generated from model 'PaginatedGrowthRateSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGrowthRateSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemAttributeSummaryList` generated from model 'PaginatedItemAttributeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemAttributeSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemCategorySummaryList` generated from model 'PaginatedItemCategorySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemCategorySummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemFlingEffectSummaryList` generated from model 'PaginatedItemFlingEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemFlingEffectSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemPocketSummaryList` generated from model 'PaginatedItemPocketSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemPocketSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemSummaryList` generated from model 'PaginatedItemSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedLanguageSummaryList` generated from model 'PaginatedLanguageSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLanguageSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedLocationAreaSummaryList` generated from model 'PaginatedLocationAreaSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLocationAreaSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedLocationSummaryList` generated from model 'PaginatedLocationSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLocationSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMachineSummaryList` generated from model 'PaginatedMachineSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMachineSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveBattleStyleSummaryList` generated from model 'PaginatedMoveBattleStyleSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveBattleStyleSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveDamageClassSummaryList` generated from model 'PaginatedMoveDamageClassSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveDamageClassSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveLearnMethodSummaryList` generated from model 'PaginatedMoveLearnMethodSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveLearnMethodSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveMetaAilmentSummaryList` generated from model 'PaginatedMoveMetaAilmentSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveMetaAilmentSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveMetaCategorySummaryList` generated from model 'PaginatedMoveMetaCategorySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveMetaCategorySummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveSummaryList` generated from model 'PaginatedMoveSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveTargetSummaryList` generated from model 'PaginatedMoveTargetSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveTargetSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedNatureSummaryList` generated from model 'PaginatedNatureSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedNatureSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPalParkAreaSummaryList` generated from model 'PaginatedPalParkAreaSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPalParkAreaSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokeathlonStatSummaryList` generated from model 'PaginatedPokeathlonStatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokeathlonStatSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokedexSummaryList` generated from model 'PaginatedPokedexSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokedexSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonColorSummaryList` generated from model 'PaginatedPokemonColorSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonColorSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonFormSummaryList` generated from model 'PaginatedPokemonFormSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonFormSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonHabitatSummaryList` generated from model 'PaginatedPokemonHabitatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonHabitatSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonShapeSummaryList` generated from model 'PaginatedPokemonShapeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonShapeSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonSpeciesSummaryList` generated from model 'PaginatedPokemonSpeciesSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonSpeciesSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonSummaryList` generated from model 'PaginatedPokemonSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedRegionSummaryList` generated from model 'PaginatedRegionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedRegionSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedStatSummaryList` generated from model 'PaginatedStatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedStatSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedSuperContestEffectSummaryList` generated from model 'PaginatedSuperContestEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedSuperContestEffectSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedTypeSummaryList` generated from model 'PaginatedTypeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedTypeSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedVersionGroupSummaryList` generated from model 'PaginatedVersionGroupSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedVersionGroupSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedVersionSummaryList` generated from model 'PaginatedVersionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedVersionSummaryList` (
  `count` INT DEFAULT NULL,
  `next` TEXT DEFAULT NULL,
  `previous` TEXT DEFAULT NULL,
  `results` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PalParkAreaDetail` generated from model 'PalParkAreaDetail'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_encounters` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PalParkAreaDetail_pokemon_encounters_inner` generated from model 'PalParkAreaDetailUnderscorepokemonUnderscoreencountersUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaDetail_pokemon_encounters_inner` (
  `base_score` INT NOT NULL,
  `pokemon-species` TEXT NOT NULL,
  `rate` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PalParkAreaName` generated from model 'PalParkAreaName'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PalParkAreaSummary` generated from model 'PalParkAreaSummary'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatDetail` generated from model 'PokeathlonStatDetail'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `affecting_natures` TEXT NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatDetail_affecting_natures` generated from model 'PokeathlonStatDetailUnderscoreaffectingUnderscorenatures'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail_affecting_natures` (
  `decrease` JSON NOT NULL,
  `increase` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatDetail_affecting_natures_decrease_inner` generated from model 'PokeathlonStatDetailUnderscoreaffectingUnderscorenaturesUnderscoredecreaseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail_affecting_natures_decrease_inner` (
  `max_change` INT NOT NULL,
  `nature` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatDetail_affecting_natures_increase_inner` generated from model 'PokeathlonStatDetailUnderscoreaffectingUnderscorenaturesUnderscoreincreaseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail_affecting_natures_increase_inner` (
  `max_change` INT UNSIGNED NOT NULL,
  `nature` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatName` generated from model 'PokeathlonStatName'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatSummary` generated from model 'PokeathlonStatSummary'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexDescription` generated from model 'PokedexDescription'
--

CREATE TABLE IF NOT EXISTS `PokedexDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexDetail` generated from model 'PokedexDetail'
--

CREATE TABLE IF NOT EXISTS `PokedexDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `is_main_series` TINYINT(1) DEFAULT NULL,
  `descriptions` JSON NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_entries` JSON NOT NULL,
  `region` TEXT NOT NULL,
  `version_groups` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexDetail_pokemon_entries_inner` generated from model 'PokedexDetailUnderscorepokemonUnderscoreentriesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokedexDetail_pokemon_entries_inner` (
  `entry_number` INT NOT NULL,
  `pokemon_species` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexName` generated from model 'PokedexName'
--

CREATE TABLE IF NOT EXISTS `PokedexName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexSummary` generated from model 'PokedexSummary'
--

CREATE TABLE IF NOT EXISTS `PokedexSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonColorDetail` generated from model 'PokemonColorDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonColorDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_species` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonColorName` generated from model 'PokemonColorName'
--

CREATE TABLE IF NOT EXISTS `PokemonColorName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonColorSummary` generated from model 'PokemonColorSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonColorSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail` generated from model 'PokemonDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `base_experience` INT DEFAULT NULL,
  `height` INT DEFAULT NULL,
  `is_default` TINYINT(1) DEFAULT NULL,
  `order` INT DEFAULT NULL,
  `weight` INT DEFAULT NULL,
  `abilities` JSON NOT NULL,
  `past_abilities` JSON NOT NULL,
  `forms` JSON NOT NULL,
  `game_indices` JSON NOT NULL,
  `held_items` TEXT NOT NULL,
  `location_area_encounters` TEXT NOT NULL,
  `moves` JSON NOT NULL,
  `species` TEXT NOT NULL,
  `sprites` TEXT NOT NULL,
  `cries` TEXT NOT NULL,
  `stats` JSON NOT NULL,
  `types` JSON NOT NULL,
  `past_types` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_abilities_inner` generated from model 'PokemonDetailUnderscoreabilitiesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_abilities_inner` (
  `ability` TEXT NOT NULL,
  `is_hidden` TINYINT(1) NOT NULL,
  `slot` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_cries` generated from model 'PokemonDetailUnderscorecries'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_cries` (
  `latest` TEXT NOT NULL,
  `legacy` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_held_items` generated from model 'PokemonDetailUnderscoreheldUnderscoreitems'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_held_items` (
  `item` TEXT NOT NULL,
  `version_details` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_moves_inner` generated from model 'PokemonDetailUnderscoremovesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_moves_inner` (
  `move` TEXT NOT NULL,
  `version_group_details` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_moves_inner_version_group_details_inner` generated from model 'PokemonDetailUnderscoremovesUnderscoreinnerUnderscoreversionUnderscoregroupUnderscoredetailsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_moves_inner_version_group_details_inner` (
  `level_learned_at` INT NOT NULL,
  `move_learn_method` TEXT NOT NULL,
  `version_group` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_past_abilities_inner` generated from model 'PokemonDetailUnderscorepastUnderscoreabilitiesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_past_abilities_inner` (
  `abilities` JSON NOT NULL,
  `generation` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_past_types_inner` generated from model 'PokemonDetailUnderscorepastUnderscoretypesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_past_types_inner` (
  `generation` TEXT NOT NULL,
  `types` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_sprites` generated from model 'PokemonDetailUnderscoresprites'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_sprites` (
  `front_default` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail_types_inner` generated from model 'PokemonDetailUnderscoretypesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_types_inner` (
  `slot` INT NOT NULL,
  `type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDexEntry` generated from model 'PokemonDexEntry'
--

CREATE TABLE IF NOT EXISTS `PokemonDexEntry` (
  `entry_number` INT NOT NULL,
  `pokedex` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pokemon_encounters_retrieve_200_response_inner` generated from model 'pokemonUnderscoreencountersUnderscoreretrieveUnderscore200UnderscoreresponseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `pokemon_encounters_retrieve_200_response_inner` (
  `location_area` TEXT NOT NULL,
  `version_details` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pokemon_encounters_retrieve_200_response_inner_location_area` generated from model 'pokemonUnderscoreencountersUnderscoreretrieveUnderscore200UnderscoreresponseUnderscoreinnerUnderscorelocationUnderscorearea'
--

CREATE TABLE IF NOT EXISTS `pokemon_encounters_retrieve_200_response_inner_location_area` (
  `name` TEXT NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pokemon_encounters_retrieve_200_response_inner_version_details_i` generated from model 'pokemonUnderscoreencountersUnderscoreretrieveUnderscore200UnderscoreresponseUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `pokemon_encounters_retrieve_200_response_inner_version_details_i` (
  `encounter_details` JSON NOT NULL,
  `max_chance` DECIMAL(20, 9) NOT NULL,
  `version` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pokemon_encounters_retrieve_200_response_inner_version_details_i` generated from model 'pokemonUnderscoreencountersUnderscoreretrieveUnderscore200UnderscoreresponseUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinnerUnderscoreencounterUnderscoredetailsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `pokemon_encounters_retrieve_200_response_inner_version_details_i` (
  `chance` DECIMAL(20, 9) NOT NULL,
  `condition_values` JSON NOT NULL,
  `max_level` DECIMAL(20, 9) NOT NULL,
  `method` TEXT NOT NULL,
  `min_level` DECIMAL(20, 9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pokemon_encounters_retrieve_200_response_inner_version_details_i` generated from model 'pokemonUnderscoreencountersUnderscoreretrieveUnderscore200UnderscoreresponseUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinnerUnderscoreencounterUnderscoredetailsUnderscoreinnerUnderscoreconditionUnderscorevaluesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `pokemon_encounters_retrieve_200_response_inner_version_details_i` (
  `name` TEXT NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pokemon_encounters_retrieve_200_response_inner_version_details_i` generated from model 'pokemonUnderscoreencountersUnderscoreretrieveUnderscore200UnderscoreresponseUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinnerUnderscoreencounterUnderscoredetailsUnderscoreinnerUnderscoremethod'
--

CREATE TABLE IF NOT EXISTS `pokemon_encounters_retrieve_200_response_inner_version_details_i` (
  `name` TEXT NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `pokemon_encounters_retrieve_200_response_inner_version_details_i` generated from model 'pokemonUnderscoreencountersUnderscoreretrieveUnderscore200UnderscoreresponseUnderscoreinnerUnderscoreversionUnderscoredetailsUnderscoreinnerUnderscoreversion'
--

CREATE TABLE IF NOT EXISTS `pokemon_encounters_retrieve_200_response_inner_version_details_i` (
  `name` TEXT NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormDetail` generated from model 'PokemonFormDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonFormDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `order` INT DEFAULT NULL,
  `form_order` INT DEFAULT NULL,
  `is_default` TINYINT(1) DEFAULT NULL,
  `is_battle_only` TINYINT(1) DEFAULT NULL,
  `is_mega` TINYINT(1) DEFAULT NULL,
  `form_name` VARCHAR(30) NOT NULL,
  `pokemon` TEXT NOT NULL,
  `sprites` TEXT NOT NULL,
  `version_group` TEXT NOT NULL,
  `form_names` JSON NOT NULL,
  `names` JSON NOT NULL,
  `types` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormDetail_form_names_inner` generated from model 'PokemonFormDetailUnderscoreformUnderscorenamesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonFormDetail_form_names_inner` (
  `language` TEXT NOT NULL,
  `name` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormDetail_sprites` generated from model 'PokemonFormDetailUnderscoresprites'
--

CREATE TABLE IF NOT EXISTS `PokemonFormDetail_sprites` (
  `default` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormSummary` generated from model 'PokemonFormSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonFormSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonGameIndex` generated from model 'PokemonGameIndex'
--

CREATE TABLE IF NOT EXISTS `PokemonGameIndex` (
  `game_index` INT NOT NULL,
  `version` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHabitatDetail` generated from model 'PokemonHabitatDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_species` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHabitatName` generated from model 'PokemonHabitatName'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHabitatSummary` generated from model 'PokemonHabitatSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonShapeDetail` generated from model 'PokemonShapeDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `awesome_names` JSON NOT NULL,
  `names` JSON NOT NULL,
  `pokemon_species` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonShapeDetail_awesome_names_inner` generated from model 'PokemonShapeDetailUnderscoreawesomeUnderscorenamesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeDetail_awesome_names_inner` (
  `awesome_name` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonShapeDetail_names_inner` generated from model 'PokemonShapeDetailUnderscorenamesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeDetail_names_inner` (
  `url` TEXT NOT NULL,
  `name` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonShapeSummary` generated from model 'PokemonShapeSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesDescription` generated from model 'PokemonSpeciesDescription'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDescription` (
  `description` TEXT DEFAULT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesDetail` generated from model 'PokemonSpeciesDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `order` INT DEFAULT NULL,
  `gender_rate` INT DEFAULT NULL,
  `capture_rate` INT DEFAULT NULL,
  `base_happiness` INT DEFAULT NULL,
  `is_baby` TINYINT(1) DEFAULT NULL,
  `is_legendary` TINYINT(1) DEFAULT NULL,
  `is_mythical` TINYINT(1) DEFAULT NULL,
  `hatch_counter` INT DEFAULT NULL,
  `has_gender_differences` TINYINT(1) DEFAULT NULL,
  `forms_switchable` TINYINT(1) DEFAULT NULL,
  `growth_rate` TEXT NOT NULL,
  `pokedex_numbers` JSON NOT NULL,
  `egg_groups` JSON NOT NULL,
  `color` TEXT NOT NULL,
  `shape` TEXT NOT NULL,
  `evolves_from_species` TEXT NOT NULL,
  `evolution_chain` TEXT NOT NULL,
  `habitat` TEXT NOT NULL,
  `generation` TEXT NOT NULL,
  `names` JSON NOT NULL,
  `pal_park_encounters` JSON NOT NULL,
  `form_descriptions` JSON NOT NULL,
  `flavor_text_entries` JSON NOT NULL,
  `genera` JSON NOT NULL,
  `varieties` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesDetail_genera_inner` generated from model 'PokemonSpeciesDetailUnderscoregeneraUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail_genera_inner` (
  `genus` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesDetail_pal_park_encounters_inner` generated from model 'PokemonSpeciesDetailUnderscorepalUnderscoreparkUnderscoreencountersUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail_pal_park_encounters_inner` (
  `area` TEXT NOT NULL,
  `base_score` INT NOT NULL,
  `rate` INT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesDetail_varieties_inner` generated from model 'PokemonSpeciesDetailUnderscorevarietiesUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail_varieties_inner` (
  `is_default` TINYINT(1) NOT NULL,
  `pokemon` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesFlavorText` generated from model 'PokemonSpeciesFlavorText'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesFlavorText` (
  `flavor_text` TEXT NOT NULL,
  `language` TEXT NOT NULL,
  `version` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesSummary` generated from model 'PokemonSpeciesSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonStat` generated from model 'PokemonStat'
--

CREATE TABLE IF NOT EXISTS `PokemonStat` (
  `base_stat` INT NOT NULL,
  `effort` INT NOT NULL,
  `stat` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSummary` generated from model 'PokemonSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RegionDetail` generated from model 'RegionDetail'
--

CREATE TABLE IF NOT EXISTS `RegionDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `locations` JSON NOT NULL,
  `main_generation` TEXT NOT NULL,
  `names` JSON NOT NULL,
  `pokedexes` JSON NOT NULL,
  `version_groups` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RegionName` generated from model 'RegionName'
--

CREATE TABLE IF NOT EXISTS `RegionName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RegionSummary` generated from model 'RegionSummary'
--

CREATE TABLE IF NOT EXISTS `RegionSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatDetail` generated from model 'StatDetail'
--

CREATE TABLE IF NOT EXISTS `StatDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `game_index` INT NOT NULL,
  `is_battle_only` TINYINT(1) DEFAULT NULL,
  `affecting_moves` TEXT NOT NULL,
  `affecting_natures` TEXT NOT NULL,
  `characteristics` JSON NOT NULL,
  `move_damage_class` TEXT NOT NULL,
  `names` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatDetail_affecting_moves` generated from model 'StatDetailUnderscoreaffectingUnderscoremoves'
--

CREATE TABLE IF NOT EXISTS `StatDetail_affecting_moves` (
  `increase` JSON NOT NULL,
  `decrease` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatDetail_affecting_moves_increase_inner` generated from model 'StatDetailUnderscoreaffectingUnderscoremovesUnderscoreincreaseUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `StatDetail_affecting_moves_increase_inner` (
  `change` INT NOT NULL,
  `move` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatDetail_affecting_natures` generated from model 'StatDetailUnderscoreaffectingUnderscorenatures'
--

CREATE TABLE IF NOT EXISTS `StatDetail_affecting_natures` (
  `increase` JSON NOT NULL,
  `decrease` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatName` generated from model 'StatName'
--

CREATE TABLE IF NOT EXISTS `StatName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatSummary` generated from model 'StatSummary'
--

CREATE TABLE IF NOT EXISTS `StatSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SuperContestEffectDetail` generated from model 'SuperContestEffectDetail'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectDetail` (
  `id` INT NOT NULL,
  `appeal` INT NOT NULL,
  `flavor_text_entries` JSON NOT NULL,
  `moves` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SuperContestEffectFlavorText` generated from model 'SuperContestEffectFlavorText'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectFlavorText` (
  `flavor_text` TEXT NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SuperContestEffectSummary` generated from model 'SuperContestEffectSummary'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectSummary` (
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeDetail` generated from model 'TypeDetail'
-- Serializer for the Type resource
--

CREATE TABLE IF NOT EXISTS `TypeDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `damage_relations` TEXT NOT NULL,
  `past_damage_relations` JSON NOT NULL,
  `game_indices` JSON NOT NULL,
  `generation` TEXT NOT NULL,
  `move_damage_class` TEXT NOT NULL,
  `names` JSON NOT NULL,
  `pokemon` JSON NOT NULL,
  `moves` JSON NOT NULL,
  `sprites` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Serializer for the Type resource';

--
-- Table structure for table `TypeDetail_damage_relations` generated from model 'TypeDetailUnderscoredamageUnderscorerelations'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_damage_relations` (
  `no_damage_to` JSON NOT NULL,
  `half_damage_to` JSON NOT NULL,
  `double_damage_to` JSON NOT NULL,
  `no_damage_from` JSON NOT NULL,
  `half_damage_from` JSON NOT NULL,
  `double_damage_from` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeDetail_past_damage_relations_inner` generated from model 'TypeDetailUnderscorepastUnderscoredamageUnderscorerelationsUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_past_damage_relations_inner` (
  `generation` TEXT NOT NULL,
  `damage_relations` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeDetail_past_damage_relations_inner_damage_relations` generated from model 'TypeDetailUnderscorepastUnderscoredamageUnderscorerelationsUnderscoreinnerUnderscoredamageUnderscorerelations'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_past_damage_relations_inner_damage_relations` (
  `no_damage_to` JSON NOT NULL,
  `half_damage_to` JSON NOT NULL,
  `double_damage_to` JSON NOT NULL,
  `no_damage_from` JSON NOT NULL,
  `half_damage_from` JSON NOT NULL,
  `double_damage_from` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeDetail_pokemon_inner` generated from model 'TypeDetailUnderscorepokemonUnderscoreinner'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_pokemon_inner` (
  `slot` INT DEFAULT NULL,
  `pokemon` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeDetail_pokemon_inner_pokemon` generated from model 'TypeDetailUnderscorepokemonUnderscoreinnerUnderscorepokemon'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_pokemon_inner_pokemon` (
  `name` TEXT DEFAULT NULL COMMENT 'The name of the pokemon',
  `url` TEXT DEFAULT NULL COMMENT 'The URL to get more information about the pokemon'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeDetail_sprites_value_value` generated from model 'TypeDetailUnderscorespritesUnderscorevalueUnderscorevalue'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_sprites_value_value` (
  `name-icon` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeGameIndex` generated from model 'TypeGameIndex'
--

CREATE TABLE IF NOT EXISTS `TypeGameIndex` (
  `game_index` INT NOT NULL,
  `generation` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeSummary` generated from model 'TypeSummary'
--

CREATE TABLE IF NOT EXISTS `TypeSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionDetail` generated from model 'VersionDetail'
-- Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
--

CREATE TABLE IF NOT EXISTS `VersionDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `names` JSON NOT NULL,
  `version_group` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink';

--
-- Table structure for table `VersionGroupDetail` generated from model 'VersionGroupDetail'
--

CREATE TABLE IF NOT EXISTS `VersionGroupDetail` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `order` INT DEFAULT NULL,
  `generation` TEXT NOT NULL,
  `move_learn_methods` JSON NOT NULL,
  `pokedexes` JSON NOT NULL,
  `regions` JSON NOT NULL,
  `versions` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionGroupSummary` generated from model 'VersionGroupSummary'
--

CREATE TABLE IF NOT EXISTS `VersionGroupSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionName` generated from model 'VersionName'
--

CREATE TABLE IF NOT EXISTS `VersionName` (
  `name` VARCHAR(100) NOT NULL,
  `language` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionSummary` generated from model 'VersionSummary'
--

CREATE TABLE IF NOT EXISTS `VersionSummary` (
  `name` VARCHAR(100) NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


