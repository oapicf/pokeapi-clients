/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `AbilityChange` generated from model 'AbilityChange'
--

CREATE TABLE IF NOT EXISTS `AbilityChange` (
  `version_group` TEXT NOT NULL COMMENT 'The version group in which the previous effect of this ability originated.',
  `effect_entries` JSON NOT NULL COMMENT 'The previous effect of this ability listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityChangeEffectText` generated from model 'AbilityChangeEffectText'
--

CREATE TABLE IF NOT EXISTS `AbilityChangeEffectText` (
  `effect` TEXT NOT NULL COMMENT 'The localized effect text for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this effect is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityDetail` generated from model 'AbilityDetail'
--

CREATE TABLE IF NOT EXISTS `AbilityDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `is_main_series` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this ability originated in the main series of the video games.',
  `generation` TEXT NOT NULL COMMENT 'The generation this ability originated in.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `effect_entries` JSON NOT NULL COMMENT 'The effect of this ability listed in different languages.',
  `effect_changes` JSON NOT NULL COMMENT 'The list of previous effects this ability has had across version groups.',
  `flavor_text_entries` JSON NOT NULL COMMENT 'The flavor text of this ability listed in different languages.',
  `pokemon` JSON NOT NULL COMMENT 'A list of Pokémon that could potentially have this ability.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityEffectText` generated from model 'AbilityEffectText'
--

CREATE TABLE IF NOT EXISTS `AbilityEffectText` (
  `effect` TEXT NOT NULL COMMENT 'The localized effect text for an API resource in a specific language.',
  `short_effect` TEXT NOT NULL COMMENT 'The localized effect text in brief.',
  `language` TEXT NOT NULL COMMENT 'The language this effect is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityFlavorText` generated from model 'AbilityFlavorText'
--

CREATE TABLE IF NOT EXISTS `AbilityFlavorText` (
  `flavor_text` TEXT NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this text resource is in.',
  `version_group` TEXT NOT NULL COMMENT 'The version group that uses this flavor text.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityName` generated from model 'AbilityName'
--

CREATE TABLE IF NOT EXISTS `AbilityName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilityPokemonDetail` generated from model 'AbilityPokemonDetail'
--

CREATE TABLE IF NOT EXISTS `AbilityPokemonDetail` (
  `is_hidden` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this a hidden ability for the referenced Pokémon.',
  `slot` INT NOT NULL COMMENT 'Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.',
  `pokemon` TEXT NOT NULL COMMENT 'The Pokémon this ability could belong to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `AbilitySummary` generated from model 'AbilitySummary'
--

CREATE TABLE IF NOT EXISTS `AbilitySummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryDetail` generated from model 'BerryDetail'
--

CREATE TABLE IF NOT EXISTS `BerryDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `growth_time` INT DEFAULT NULL COMMENT 'Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.',
  `max_harvest` INT DEFAULT NULL COMMENT 'The maximum number of these berries that can grow on one tree in Generation IV.',
  `natural_gift_power` INT DEFAULT NULL COMMENT 'The power of the move \&quot;Natural Gift\&quot; when used with this Berry.',
  `size` INT DEFAULT NULL COMMENT 'The size of this Berry, in millimeters.',
  `smoothness` INT DEFAULT NULL COMMENT 'The smoothness of this Berry, used in making Pokéblocks or Poffins.',
  `soil_dryness` INT DEFAULT NULL COMMENT 'The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.',
  `firmness` TEXT NOT NULL COMMENT 'The firmness of this berry, used in making Pokéblocks or Poffins.',
  `flavors` JSON NOT NULL COMMENT 'A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.',
  `item` TEXT NOT NULL COMMENT 'Berries are actually items. This is a reference to the item specific data for this berry.',
  `natural_gift_type` TEXT NOT NULL COMMENT 'The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFirmnessDetail` generated from model 'BerryFirmnessDetail'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `berries` JSON NOT NULL COMMENT 'A list of the berries with this firmness.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFirmnessName` generated from model 'BerryFirmnessName'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFirmnessSummary` generated from model 'BerryFirmnessSummary'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorBerryMap` generated from model 'BerryFlavorBerryMap'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorBerryMap` (
  `potency` INT NOT NULL COMMENT 'How powerful the referenced flavor is for this berry.',
  `berry` TEXT NOT NULL COMMENT 'The berry with the referenced flavor.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorDetail` generated from model 'BerryFlavorDetail'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `berries` JSON NOT NULL COMMENT 'A list of the berries with this flavor.',
  `contest_type` TEXT NOT NULL COMMENT 'The contest type that correlates with this berry flavor.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorMap` generated from model 'BerryFlavorMap'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorMap` (
  `potency` INT NOT NULL COMMENT 'How powerful the referenced flavor is for this berry.',
  `flavor` TEXT NOT NULL COMMENT 'The referenced berry flavor.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorName` generated from model 'BerryFlavorName'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerryFlavorSummary` generated from model 'BerryFlavorSummary'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `BerrySummary` generated from model 'BerrySummary'
--

CREATE TABLE IF NOT EXISTS `BerrySummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CharacteristicDescription` generated from model 'CharacteristicDescription'
--

CREATE TABLE IF NOT EXISTS `CharacteristicDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CharacteristicDetail` generated from model 'CharacteristicDetail'
--

CREATE TABLE IF NOT EXISTS `CharacteristicDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `gene_modulo` INT NOT NULL COMMENT 'The remainder of the highest stat/IV divided by 5.',
  `possible_values` JSON NOT NULL COMMENT 'The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.',
  `highest_stat` TEXT NOT NULL COMMENT 'The stat which results in this characteristic.',
  `descriptions` JSON NOT NULL COMMENT 'The descriptions of this characteristic listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CharacteristicSummary` generated from model 'CharacteristicSummary'
--

CREATE TABLE IF NOT EXISTS `CharacteristicSummary` (
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestEffectDetail` generated from model 'ContestEffectDetail'
--

CREATE TABLE IF NOT EXISTS `ContestEffectDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `appeal` INT NOT NULL COMMENT 'The base number of hearts the user of this move gets.',
  `jam` INT NOT NULL COMMENT 'The base number of hearts the user&#39;s opponent loses.',
  `effect_entries` JSON NOT NULL COMMENT 'The result of this contest effect listed in different languages.',
  `flavor_text_entries` JSON NOT NULL COMMENT 'The flavor text of this contest effect listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestEffectEffectText` generated from model 'ContestEffectEffectText'
--

CREATE TABLE IF NOT EXISTS `ContestEffectEffectText` (
  `effect` TEXT NOT NULL COMMENT 'The localized effect text for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this effect is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestEffectFlavorText` generated from model 'ContestEffectFlavorText'
--

CREATE TABLE IF NOT EXISTS `ContestEffectFlavorText` (
  `flavor_text` TEXT NOT NULL COMMENT 'The localized flavor text for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestEffectSummary` generated from model 'ContestEffectSummary'
--

CREATE TABLE IF NOT EXISTS `ContestEffectSummary` (
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestTypeDetail` generated from model 'ContestTypeDetail'
--

CREATE TABLE IF NOT EXISTS `ContestTypeDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `berry_flavor` TEXT NOT NULL COMMENT 'The berry flavor that correlates with this contest type.',
  `names` JSON NOT NULL COMMENT 'The name of this contest type listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestTypeName` generated from model 'ContestTypeName'
--

CREATE TABLE IF NOT EXISTS `ContestTypeName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this contest.',
  `color` VARCHAR(10) NOT NULL COMMENT 'The color associated with this contest&#39;s name.',
  `language` TEXT NOT NULL COMMENT 'The language that this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ContestTypeSummary` generated from model 'ContestTypeSummary'
--

CREATE TABLE IF NOT EXISTS `ContestTypeSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CurrencyDetail` generated from model 'CurrencyDetail'
--

CREATE TABLE IF NOT EXISTS `CurrencyDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CurrencyName` generated from model 'CurrencyName'
--

CREATE TABLE IF NOT EXISTS `CurrencyName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `CurrencySummary` generated from model 'CurrencySummary'
--

CREATE TABLE IF NOT EXISTS `CurrencySummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EggGroupDetail` generated from model 'EggGroupDetail'
--

CREATE TABLE IF NOT EXISTS `EggGroupDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_species` JSON NOT NULL COMMENT 'A list of all Pokémon species that are members of this egg group.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EggGroupName` generated from model 'EggGroupName'
--

CREATE TABLE IF NOT EXISTS `EggGroupName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EggGroupSummary` generated from model 'EggGroupSummary'
--

CREATE TABLE IF NOT EXISTS `EggGroupSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionDetail` generated from model 'EncounterConditionDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `values` JSON NOT NULL COMMENT 'A list of possible values for this encounter condition.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionName` generated from model 'EncounterConditionName'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionSummary` generated from model 'EncounterConditionSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionValueDetail` generated from model 'EncounterConditionValueDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `condition` TEXT NOT NULL COMMENT 'The condition this encounter condition value pertains to.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionValueName` generated from model 'EncounterConditionValueName'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterConditionValueSummary` generated from model 'EncounterConditionValueSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterMethodDetail` generated from model 'EncounterMethodDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `order` INT DEFAULT NULL COMMENT 'A good value for sorting.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterMethodName` generated from model 'EncounterMethodName'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterMethodSummary` generated from model 'EncounterMethodSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EncounterPokemonDetail` generated from model 'EncounterPokemonDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterPokemonDetail` (
  `min_perfect_ivs` INT DEFAULT NULL COMMENT 'The minimum number of perfect IVs, or null if unspecified.',
  `always_shiny` TINYINT(1) DEFAULT NULL COMMENT 'Whether the encountered Pokémon is always shiny.',
  `never_shiny` TINYINT(1) DEFAULT NULL COMMENT 'Whether the encountered Pokémon can never be shiny.',
  `is_alpha` TINYINT(1) DEFAULT NULL COMMENT 'Whether the encountered Pokémon is an alpha Pokémon.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainDetail` generated from model 'EvolutionChainDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `baby_trigger_item` TEXT NOT NULL COMMENT 'The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.',
  `chain` TEXT NOT NULL COMMENT 'The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainLink` generated from model 'EvolutionChainLink'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainLink` (
  `is_baby` TINYINT(1) NOT NULL COMMENT 'Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.',
  `species` TEXT NOT NULL COMMENT 'The Pokémon species at this point in the evolution chain.',
  `evolution_details` JSON NOT NULL COMMENT 'All details regarding the specific details of the referenced Pokémon species evolution.',
  `evolves_to` JSON NOT NULL COMMENT 'A List of chain objects.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionChainSummary` generated from model 'EvolutionChainSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainSummary` (
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionConditionExpression` generated from model 'EvolutionConditionExpression'
--

CREATE TABLE IF NOT EXISTS `EvolutionConditionExpression` (
  `expression` TEXT NOT NULL COMMENT 'Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)',
  `percentage_chance` DECIMAL(20, 9) NOT NULL COMMENT 'Percentage chance of evolution under this condition (0-100)',
  `variables` JSON NOT NULL COMMENT 'Evolution variables referenced in the expression'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionTriggerDetail` generated from model 'EvolutionTriggerDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_species` JSON NOT NULL COMMENT 'A list of pokemon species that result from this evolution trigger.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionTriggerName` generated from model 'EvolutionTriggerName'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionTriggerSummary` generated from model 'EvolutionTriggerSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionVariableDescription` generated from model 'EvolutionVariableDescription'
--

CREATE TABLE IF NOT EXISTS `EvolutionVariableDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionVariableDetail` generated from model 'EvolutionVariableDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionVariableDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `symbol` VARCHAR(10) NOT NULL COMMENT 'The symbol used for this variable in evolution condition expressions.',
  `data_type` VARCHAR(20) DEFAULT NULL COMMENT 'The data type of this variable.',
  `source` VARCHAR(20) DEFAULT NULL COMMENT 'The source of the variable value.',
  `version_group` TEXT NOT NULL COMMENT 'The version group in which this variable was introduced.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `descriptions` JSON NOT NULL COMMENT 'The description of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionVariableName` generated from model 'EvolutionVariableName'
--

CREATE TABLE IF NOT EXISTS `EvolutionVariableName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `EvolutionVariableSummary` generated from model 'EvolutionVariableSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionVariableSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Experience` generated from model 'Experience'
--

CREATE TABLE IF NOT EXISTS `Experience` (
  `level` INT NOT NULL COMMENT 'The level gained.',
  `experience` INT NOT NULL COMMENT 'The amount of experience required to reach the referenced level.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderDetail` generated from model 'GenderDetail'
--

CREATE TABLE IF NOT EXISTS `GenderDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `pokemon_species_details` JSON NOT NULL COMMENT 'A list of Pokémon species that can be this gender and how likely it is that they will be.',
  `required_for_evolution` JSON NOT NULL COMMENT 'A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderPokemonSpecies` generated from model 'GenderPokemonSpecies'
--

CREATE TABLE IF NOT EXISTS `GenderPokemonSpecies` (
  `rate` INT NOT NULL COMMENT 'The chance of this Pokémon being female, in eighths; or -1 for genderless.',
  `pokemon_species` TEXT NOT NULL COMMENT 'A Pokémon species that can be the referenced gender.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenderSummary` generated from model 'GenderSummary'
--

CREATE TABLE IF NOT EXISTS `GenderSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenerationDetail` generated from model 'GenerationDetail'
--

CREATE TABLE IF NOT EXISTS `GenerationDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `abilities` JSON NOT NULL COMMENT 'A list of abilities that were introduced in this generation.',
  `main_region` TEXT NOT NULL COMMENT 'The main region travelled in this generation.',
  `moves` JSON NOT NULL COMMENT 'A list of moves that were introduced in this generation.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_species` JSON NOT NULL COMMENT 'A list of Pokémon species that were introduced in this generation.',
  `types` JSON NOT NULL COMMENT 'A list of types that were introduced in this generation.',
  `version_groups` JSON NOT NULL COMMENT 'A list of version groups that were introduced in this generation.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenerationName` generated from model 'GenerationName'
--

CREATE TABLE IF NOT EXISTS `GenerationName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GenerationSummary` generated from model 'GenerationSummary'
--

CREATE TABLE IF NOT EXISTS `GenerationSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GrowthRateDescription` generated from model 'GrowthRateDescription'
--

CREATE TABLE IF NOT EXISTS `GrowthRateDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GrowthRateDetail` generated from model 'GrowthRateDetail'
--

CREATE TABLE IF NOT EXISTS `GrowthRateDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `formula` TEXT NOT NULL COMMENT 'The formula used to calculate the rate at which the Pokémon species gains level.',
  `descriptions` JSON NOT NULL COMMENT 'The descriptions of this characteristic listed in different languages.',
  `levels` JSON NOT NULL COMMENT 'A list of levels and the amount of experienced needed to atain them based on this growth rate.',
  `pokemon_species` JSON NOT NULL COMMENT 'A list of Pokémon species that gain levels at this growth rate.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GrowthRateSummary` generated from model 'GrowthRateSummary'
--

CREATE TABLE IF NOT EXISTS `GrowthRateSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributeDescription` generated from model 'ItemAttributeDescription'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributeDetail` generated from model 'ItemAttributeDetail'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `descriptions` JSON NOT NULL COMMENT 'The description of this item attribute listed in different languages.',
  `items` JSON NOT NULL COMMENT 'A list of items that have this attribute.',
  `names` JSON NOT NULL COMMENT 'The name of this item attribute listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributeName` generated from model 'ItemAttributeName'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemAttributeSummary` generated from model 'ItemAttributeSummary'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemCategoryDetail` generated from model 'ItemCategoryDetail'
--

CREATE TABLE IF NOT EXISTS `ItemCategoryDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `items` JSON NOT NULL COMMENT 'A list of items that are a part of this category.',
  `names` JSON NOT NULL COMMENT 'The name of this item category listed in different languages.',
  `pocket` TEXT NOT NULL COMMENT 'The pocket items in this category would be put in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemCategoryName` generated from model 'ItemCategoryName'
--

CREATE TABLE IF NOT EXISTS `ItemCategoryName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemCategorySummary` generated from model 'ItemCategorySummary'
--

CREATE TABLE IF NOT EXISTS `ItemCategorySummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemDetail` generated from model 'ItemDetail'
--

CREATE TABLE IF NOT EXISTS `ItemDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `fling_power` INT DEFAULT NULL COMMENT 'The power of the move Fling when used with this item.',
  `fling_effect` TEXT NOT NULL COMMENT 'The effect of the move Fling when used with this item.',
  `attributes` JSON NOT NULL COMMENT 'A list of attributes this item has.',
  `category` TEXT NOT NULL COMMENT 'The category of items this item falls into.',
  `effect_entries` JSON NOT NULL COMMENT 'The effect of this ability listed in different languages.',
  `flavor_text_entries` JSON NOT NULL COMMENT 'The flavor text of this ability listed in different languages.',
  `game_indices` JSON NOT NULL COMMENT 'A list of game indices relevent to this item by generation.',
  `prices` JSON NOT NULL COMMENT 'Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.',
  `names` JSON NOT NULL COMMENT 'The name of this item listed in different languages.',
  `held_by_pokemon` JSON NOT NULL COMMENT 'A list of Pokémon that might be found in the wild holding this item.',
  `sprites` TEXT NOT NULL COMMENT 'A set of sprites used to depict this item in the game.',
  `baby_trigger_for` TEXT NOT NULL COMMENT 'An evolution chain this item requires to produce a bay during mating.',
  `machines` JSON NOT NULL COMMENT 'A list of the machines related to this item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemEffectText` generated from model 'ItemEffectText'
--

CREATE TABLE IF NOT EXISTS `ItemEffectText` (
  `effect` TEXT NOT NULL COMMENT 'The localized effect text for an API resource in a specific language.',
  `short_effect` TEXT NOT NULL COMMENT 'The localized effect text in brief.',
  `language` TEXT NOT NULL COMMENT 'The language this effect is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemFlavorText` generated from model 'ItemFlavorText'
--

CREATE TABLE IF NOT EXISTS `ItemFlavorText` (
  `text` TEXT NOT NULL COMMENT 'The localized flavor text for an API resource in a specific language.',
  `version_group` TEXT NOT NULL COMMENT 'The version group which uses this flavor text.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemFlingEffectDetail` generated from model 'ItemFlingEffectDetail'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `effect_entries` JSON NOT NULL COMMENT 'The result of this fling effect listed in different languages.',
  `items` JSON NOT NULL COMMENT 'A list of items that have this fling effect.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemFlingEffectEffectText` generated from model 'ItemFlingEffectEffectText'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectEffectText` (
  `effect` TEXT NOT NULL COMMENT 'The localized effect text for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this effect is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemFlingEffectSummary` generated from model 'ItemFlingEffectSummary'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemGameIndex` generated from model 'ItemGameIndex'
--

CREATE TABLE IF NOT EXISTS `ItemGameIndex` (
  `game_index` INT NOT NULL COMMENT 'The internal id of an API resource within game data.',
  `generation` TEXT NOT NULL COMMENT 'The generation relevent to this game index.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemMachine` generated from model 'ItemMachine'
--

CREATE TABLE IF NOT EXISTS `ItemMachine` (
  `machine` TEXT NOT NULL COMMENT 'The machine that teaches a move from an item.',
  `version_group` TEXT NOT NULL COMMENT 'The version group of this specific machine.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemName` generated from model 'ItemName'
--

CREATE TABLE IF NOT EXISTS `ItemName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemPocketDetail` generated from model 'ItemPocketDetail'
--

CREATE TABLE IF NOT EXISTS `ItemPocketDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `categories` JSON NOT NULL COMMENT 'A list of item categories that are relevant to this item pocket.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemPocketName` generated from model 'ItemPocketName'
--

CREATE TABLE IF NOT EXISTS `ItemPocketName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemPocketSummary` generated from model 'ItemPocketSummary'
--

CREATE TABLE IF NOT EXISTS `ItemPocketSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemPrice` generated from model 'ItemPrice'
--

CREATE TABLE IF NOT EXISTS `ItemPrice` (
  `purchase_price` INT DEFAULT NULL COMMENT 'The purchase price in this currency and version group, or null if unavailable.',
  `sell_price` INT DEFAULT NULL COMMENT 'The sell price in this currency and version group, or null if unavailable.',
  `currency` TEXT NOT NULL COMMENT 'The currency used for this price.',
  `version_group` TEXT NOT NULL COMMENT 'The version group to which this price applies.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemSprites` generated from model 'ItemSprites'
--

CREATE TABLE IF NOT EXISTS `ItemSprites` (
  `default` TEXT NOT NULL COMMENT 'The default depiction of this item.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ItemSummary` generated from model 'ItemSummary'
--

CREATE TABLE IF NOT EXISTS `ItemSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LanguageDetail` generated from model 'LanguageDetail'
--

CREATE TABLE IF NOT EXISTS `LanguageDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `official` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not the games are published in this language.',
  `iso639` VARCHAR(10) NOT NULL COMMENT 'The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.',
  `iso3166` VARCHAR(2) NOT NULL COMMENT 'The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LanguageName` generated from model 'LanguageName'
--

CREATE TABLE IF NOT EXISTS `LanguageName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LanguageSummary` generated from model 'LanguageSummary'
--

CREATE TABLE IF NOT EXISTS `LanguageSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaDetail` generated from model 'LocationAreaDetail'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `game_index` INT NOT NULL COMMENT 'The internal id of an API resource within game data.',
  `encounter_method_rates` JSON NOT NULL COMMENT 'A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.',
  `location` TEXT NOT NULL COMMENT 'The region this location area can be found in.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_encounters` JSON NOT NULL COMMENT 'A list of Pokémon that can be encountered in this area along with version specific details about the encounter.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaEncounterDetail` generated from model 'LocationAreaEncounterDetail'
--

CREATE TABLE IF NOT EXISTS `LocationAreaEncounterDetail` (
  `min_level` INT NOT NULL COMMENT 'The lowest level the Pokémon could be encountered at.',
  `max_level` INT NOT NULL COMMENT 'The highest level the Pokémon could be encountered at.',
  `chance` INT DEFAULT 0 COMMENT 'Percent chance that this encounter will occur.',
  `method` TEXT DEFAULT NULL COMMENT 'The method by which this encounter happens.',
  `condition_values` JSON NOT NULL COMMENT 'A list of condition values that must be in effect for this encounter to occur.',
  `pokemon_details` TEXT NOT NULL COMMENT 'Additional properties of the encountered Pokémon, or null if unspecified.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaEncounterRate` generated from model 'LocationAreaEncounterRate'
--

CREATE TABLE IF NOT EXISTS `LocationAreaEncounterRate` (
  `encounter_method` TEXT NOT NULL COMMENT 'The method in which Pokémon may be encountered in an area..',
  `version_details` JSON NOT NULL COMMENT 'The chance of the encounter to occur on a version of the game.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaEncounterVersionDetail` generated from model 'LocationAreaEncounterVersionDetail'
--

CREATE TABLE IF NOT EXISTS `LocationAreaEncounterVersionDetail` (
  `rate` INT NOT NULL COMMENT 'The chance of an encounter to occur.',
  `version` TEXT NOT NULL COMMENT 'The version of the game in which the encounter can occur with the given chance.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaName` generated from model 'LocationAreaName'
--

CREATE TABLE IF NOT EXISTS `LocationAreaName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaPokemonEncounter` generated from model 'LocationAreaPokemonEncounter'
--

CREATE TABLE IF NOT EXISTS `LocationAreaPokemonEncounter` (
  `pokemon` TEXT NOT NULL COMMENT 'The Pokémon being encountered.',
  `version_details` JSON NOT NULL COMMENT 'A list of versions and encounters with Pokémon that might happen in the referenced location area.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaPokemonEncounterVersion` generated from model 'LocationAreaPokemonEncounterVersion'
--

CREATE TABLE IF NOT EXISTS `LocationAreaPokemonEncounterVersion` (
  `version` TEXT NOT NULL COMMENT 'The game version this encounter happens in.',
  `max_chance` INT NOT NULL COMMENT 'The total percentage of all encounter potential.',
  `encounter_details` JSON NOT NULL COMMENT 'A list of encounters and their specifics.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationAreaSummary` generated from model 'LocationAreaSummary'
--

CREATE TABLE IF NOT EXISTS `LocationAreaSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationDetail` generated from model 'LocationDetail'
--

CREATE TABLE IF NOT EXISTS `LocationDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `region` TEXT NOT NULL COMMENT 'The region this location can be found in.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `game_indices` JSON NOT NULL COMMENT 'A list of game indices relevent to this location by generation.',
  `areas` JSON NOT NULL COMMENT 'Areas that can be found within this location.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationGameIndex` generated from model 'LocationGameIndex'
--

CREATE TABLE IF NOT EXISTS `LocationGameIndex` (
  `game_index` INT NOT NULL COMMENT 'The internal id of an API resource within game data.',
  `generation` TEXT NOT NULL COMMENT 'The generation relevent to this game index.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationName` generated from model 'LocationName'
--

CREATE TABLE IF NOT EXISTS `LocationName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `LocationSummary` generated from model 'LocationSummary'
--

CREATE TABLE IF NOT EXISTS `LocationSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MachineDetail` generated from model 'MachineDetail'
--

CREATE TABLE IF NOT EXISTS `MachineDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `item` TEXT NOT NULL COMMENT 'The TM or HM item that corresponds to this machine.',
  `version_group` TEXT NOT NULL COMMENT 'The version group that this machine applies to.',
  `move` TEXT NOT NULL COMMENT 'The move that is taught by this machine.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MachineSummary` generated from model 'MachineSummary'
--

CREATE TABLE IF NOT EXISTS `MachineSummary` (
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveBattleStyleDetail` generated from model 'MoveBattleStyleDetail'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveBattleStyleName` generated from model 'MoveBattleStyleName'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveBattleStyleSummary` generated from model 'MoveBattleStyleSummary'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveChange` generated from model 'MoveChange'
--

CREATE TABLE IF NOT EXISTS `MoveChange` (
  `accuracy` INT DEFAULT NULL COMMENT 'The percent value of how likely this move is to be successful.',
  `power` INT DEFAULT NULL COMMENT 'The base power before the listed version group, or null if power did not change.',
  `pp` INT DEFAULT NULL COMMENT 'Power points. The number of times this move can be used.',
  `effect_chance` INT NOT NULL COMMENT 'The percent value of how likely it is this moves effect will take effect.',
  `effect_entries` JSON NOT NULL COMMENT 'The effect of this move listed in different languages.',
  `type` TEXT NOT NULL COMMENT 'The elemental type of this move.',
  `version_group` TEXT NOT NULL COMMENT 'The version group in which these move stat values were in effect.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveComboUsage` generated from model 'MoveComboUsage'
--

CREATE TABLE IF NOT EXISTS `MoveComboUsage` (
  `use_before` JSON NOT NULL COMMENT 'A list of moves to use before this move.',
  `use_after` JSON NOT NULL COMMENT 'A list of moves to use after this move.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveCombos` generated from model 'MoveCombos'
--

CREATE TABLE IF NOT EXISTS `MoveCombos` (
  `normal` TEXT NOT NULL COMMENT 'A detail of moves this move can be used before or after, granting additional appeal points in contests.',
  `super` TEXT NOT NULL COMMENT 'A detail of moves this move can be used before or after, granting additional appeal points in super contests.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDamageClassDescription` generated from model 'MoveDamageClassDescription'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDamageClassDetail` generated from model 'MoveDamageClassDetail'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `descriptions` JSON NOT NULL COMMENT 'The description of this resource listed in different languages.',
  `moves` JSON NOT NULL COMMENT 'A list of moves that fall into this damage class.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDamageClassName` generated from model 'MoveDamageClassName'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDamageClassSummary` generated from model 'MoveDamageClassSummary'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveDetail` generated from model 'MoveDetail'
--

CREATE TABLE IF NOT EXISTS `MoveDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `accuracy` INT DEFAULT NULL COMMENT 'The percent value of how likely this move is to be successful.',
  `effect_chance` INT NOT NULL COMMENT 'The percent value of how likely it is this moves effect will happen.',
  `pp` INT DEFAULT NULL COMMENT 'Power points. The number of times this move can be used.',
  `priority` INT DEFAULT NULL COMMENT 'A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.',
  `power` INT DEFAULT NULL COMMENT 'The base power of this move, or null if it has no fixed base power.',
  `contest_combos` TEXT NOT NULL COMMENT 'A detail of normal and super contest combos that require this move.',
  `contest_type` TEXT NOT NULL COMMENT 'The type of appeal this move gives a Pokémon when used in a contest.',
  `contest_effect` TEXT NOT NULL COMMENT 'The effect the move has when used in a contest.',
  `damage_class` TEXT NOT NULL COMMENT 'The type of damage the move inflicts on the target, e.g. physical.',
  `effect_entries` JSON NOT NULL COMMENT 'The effect of this move listed in different languages.',
  `effect_changes` JSON NOT NULL COMMENT 'The list of previous effects this move has had across version groups of the games.',
  `generation` TEXT NOT NULL COMMENT 'The generation in which this move was introduced.',
  `meta` TEXT NOT NULL COMMENT 'Metadata about this move',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `past_values` JSON NOT NULL COMMENT 'A list of move resource value changes across version groups of the game.',
  `stat_changes` JSON NOT NULL COMMENT 'A list of stats this moves effects and how much it effects them.',
  `super_contest_effect` TEXT NOT NULL COMMENT 'The effect the move has when used in a super contest.',
  `target` TEXT NOT NULL COMMENT 'The type of target that will receive the effects of the attack.',
  `type` TEXT NOT NULL COMMENT 'The elemental type of this move.',
  `machines` JSON NOT NULL COMMENT 'A list of the machines that teach this move.',
  `flavor_text_entries` JSON NOT NULL COMMENT 'The flavor text of this move listed in different languages.',
  `learned_by_pokemon` JSON NOT NULL COMMENT 'List of Pokemon that can learn the move'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveEffectChange` generated from model 'MoveEffectChange'
--

CREATE TABLE IF NOT EXISTS `MoveEffectChange` (
  `version_group` TEXT NOT NULL COMMENT 'The version group in which the previous effect of this ability originated.',
  `effect_entries` JSON NOT NULL COMMENT 'The previous effect of this ability listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveEffectChangeEffectText` generated from model 'MoveEffectChangeEffectText'
--

CREATE TABLE IF NOT EXISTS `MoveEffectChangeEffectText` (
  `effect` TEXT NOT NULL COMMENT 'The localized effect text for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this effect is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveEffectEffectText` generated from model 'MoveEffectEffectText'
--

CREATE TABLE IF NOT EXISTS `MoveEffectEffectText` (
  `effect` TEXT NOT NULL COMMENT 'The localized effect text for an API resource in a specific language.',
  `short_effect` TEXT NOT NULL COMMENT 'The localized effect text in brief.',
  `language` TEXT NOT NULL COMMENT 'The language this effect is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveFlavorText` generated from model 'MoveFlavorText'
--

CREATE TABLE IF NOT EXISTS `MoveFlavorText` (
  `flavor_text` TEXT NOT NULL COMMENT 'The localized flavor text for an api resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.',
  `version_group` TEXT NOT NULL COMMENT 'The version group that uses this flavor text.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveLearnMethodDescription` generated from model 'MoveLearnMethodDescription'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveLearnMethodDetail` generated from model 'MoveLearnMethodDetail'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `descriptions` JSON NOT NULL COMMENT 'The description of this resource listed in different languages.',
  `version_groups` JSON NOT NULL COMMENT 'A list of version groups where moves can be learned through this method.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveLearnMethodName` generated from model 'MoveLearnMethodName'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveLearnMethodSummary` generated from model 'MoveLearnMethodSummary'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMeta` generated from model 'MoveMeta'
--

CREATE TABLE IF NOT EXISTS `MoveMeta` (
  `ailment` TEXT NOT NULL COMMENT 'The status ailment this move inflicts on its target.',
  `category` TEXT NOT NULL COMMENT 'The category of move this move falls under, e.g. damage or ailment.',
  `min_hits` INT DEFAULT NULL COMMENT 'The minimum number of times this move hits. Null if it always only hits once.',
  `max_hits` INT DEFAULT NULL COMMENT 'The maximum number of times this move hits. Null if it always only hits once.',
  `min_turns` INT DEFAULT NULL COMMENT 'The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.',
  `max_turns` INT DEFAULT NULL COMMENT 'The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.',
  `drain` INT DEFAULT NULL COMMENT 'HP drain (if positive) or Recoil damage (if negative), in percent of damage done.',
  `healing` INT DEFAULT NULL COMMENT 'The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.',
  `crit_rate` INT DEFAULT NULL COMMENT 'Critical hit rate bonus.',
  `ailment_chance` INT DEFAULT NULL COMMENT 'The likelihood this attack will cause an ailment.',
  `flinch_chance` INT DEFAULT NULL COMMENT 'The likelihood this attack will cause the target Pokémon to flinch.',
  `stat_chance` INT DEFAULT NULL COMMENT 'The likelihood this attack will cause a stat change in the target Pokémon.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaAilmentDetail` generated from model 'MoveMetaAilmentDetail'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `moves` JSON NOT NULL COMMENT 'A list of moves that cause this ailment.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaAilmentName` generated from model 'MoveMetaAilmentName'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaAilmentSummary` generated from model 'MoveMetaAilmentSummary'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaCategoryDescription` generated from model 'MoveMetaCategoryDescription'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaCategoryDetail` generated from model 'MoveMetaCategoryDetail'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `descriptions` JSON NOT NULL COMMENT 'The description of this resource listed in different languages.',
  `moves` JSON NOT NULL COMMENT 'A list of moves that fall into this category.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaCategorySummary` generated from model 'MoveMetaCategorySummary'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategorySummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveMetaStatChange` generated from model 'MoveMetaStatChange'
--

CREATE TABLE IF NOT EXISTS `MoveMetaStatChange` (
  `change` INT NOT NULL COMMENT 'The amount of change.',
  `stat` TEXT NOT NULL COMMENT 'The stat being affected.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveName` generated from model 'MoveName'
--

CREATE TABLE IF NOT EXISTS `MoveName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveStatChange` generated from model 'MoveStatChange'
--

CREATE TABLE IF NOT EXISTS `MoveStatChange` (
  `change` INT NOT NULL COMMENT 'The maximum amount of change to the referenced stat.',
  `move` TEXT NOT NULL COMMENT 'The move causing the change.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveSummary` generated from model 'MoveSummary'
--

CREATE TABLE IF NOT EXISTS `MoveSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveTargetDescription` generated from model 'MoveTargetDescription'
--

CREATE TABLE IF NOT EXISTS `MoveTargetDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveTargetDetail` generated from model 'MoveTargetDetail'
--

CREATE TABLE IF NOT EXISTS `MoveTargetDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `descriptions` JSON NOT NULL COMMENT 'The description of this resource listed in different languages.',
  `moves` JSON NOT NULL COMMENT 'A list of moves that that are directed at this target.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveTargetName` generated from model 'MoveTargetName'
--

CREATE TABLE IF NOT EXISTS `MoveTargetName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `MoveTargetSummary` generated from model 'MoveTargetSummary'
--

CREATE TABLE IF NOT EXISTS `MoveTargetSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureBattleStylePreference` generated from model 'NatureBattleStylePreference'
--

CREATE TABLE IF NOT EXISTS `NatureBattleStylePreference` (
  `low_hp_preference` INT NOT NULL COMMENT 'Chance of using the move, in percent, if HP is under one half.',
  `high_hp_preference` INT NOT NULL COMMENT 'Chance of using the move, in percent, if HP is over one half.',
  `move_battle_style` TEXT NOT NULL COMMENT 'The move battle style.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureDetail` generated from model 'NatureDetail'
--

CREATE TABLE IF NOT EXISTS `NatureDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `decreased_stat` TEXT NOT NULL COMMENT 'The stat decreased by 10% in Pokémon with this nature.',
  `increased_stat` TEXT NOT NULL COMMENT 'The stat increased by 10% in Pokémon with this nature.',
  `likes_flavor` TEXT NOT NULL COMMENT 'The flavor liked by Pokémon with this nature.',
  `hates_flavor` TEXT NOT NULL COMMENT 'The flavor hated by Pokémon with this nature.',
  `pokeathlon_stat_changes` JSON NOT NULL COMMENT 'A list of Pokéathlon stats this nature effects and how much it effects them.',
  `move_battle_style_preferences` JSON NOT NULL COMMENT 'A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureName` generated from model 'NatureName'
--

CREATE TABLE IF NOT EXISTS `NatureName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NaturePokeathlonStat` generated from model 'NaturePokeathlonStat'
--

CREATE TABLE IF NOT EXISTS `NaturePokeathlonStat` (
  `max_change` INT NOT NULL COMMENT 'The amount of change.',
  `pokeathlon_stat` TEXT NOT NULL COMMENT 'The stat being affected.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `NatureSummary` generated from model 'NatureSummary'
--

CREATE TABLE IF NOT EXISTS `NatureSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedAbilitySummaryList` generated from model 'PaginatedAbilitySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedAbilitySummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedBerryFirmnessSummaryList` generated from model 'PaginatedBerryFirmnessSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerryFirmnessSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedBerryFlavorSummaryList` generated from model 'PaginatedBerryFlavorSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerryFlavorSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedBerrySummaryList` generated from model 'PaginatedBerrySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerrySummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedCharacteristicSummaryList` generated from model 'PaginatedCharacteristicSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedCharacteristicSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedContestEffectSummaryList` generated from model 'PaginatedContestEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedContestEffectSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedContestTypeSummaryList` generated from model 'PaginatedContestTypeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedContestTypeSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedCurrencySummaryList` generated from model 'PaginatedCurrencySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedCurrencySummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEggGroupSummaryList` generated from model 'PaginatedEggGroupSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEggGroupSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEncounterConditionSummaryList` generated from model 'PaginatedEncounterConditionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterConditionSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEncounterConditionValueSummaryList` generated from model 'PaginatedEncounterConditionValueSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterConditionValueSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEncounterMethodSummaryList` generated from model 'PaginatedEncounterMethodSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterMethodSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEvolutionChainSummaryList` generated from model 'PaginatedEvolutionChainSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionChainSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEvolutionTriggerSummaryList` generated from model 'PaginatedEvolutionTriggerSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionTriggerSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedEvolutionVariableSummaryList` generated from model 'PaginatedEvolutionVariableSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionVariableSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedGenderSummaryList` generated from model 'PaginatedGenderSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGenderSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedGenerationSummaryList` generated from model 'PaginatedGenerationSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGenerationSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedGrowthRateSummaryList` generated from model 'PaginatedGrowthRateSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGrowthRateSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemAttributeSummaryList` generated from model 'PaginatedItemAttributeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemAttributeSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemCategorySummaryList` generated from model 'PaginatedItemCategorySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemCategorySummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemFlingEffectSummaryList` generated from model 'PaginatedItemFlingEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemFlingEffectSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemPocketSummaryList` generated from model 'PaginatedItemPocketSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemPocketSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedItemSummaryList` generated from model 'PaginatedItemSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedLanguageSummaryList` generated from model 'PaginatedLanguageSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLanguageSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedLocationAreaSummaryList` generated from model 'PaginatedLocationAreaSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLocationAreaSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedLocationSummaryList` generated from model 'PaginatedLocationSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLocationSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMachineSummaryList` generated from model 'PaginatedMachineSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMachineSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveBattleStyleSummaryList` generated from model 'PaginatedMoveBattleStyleSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveBattleStyleSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveDamageClassSummaryList` generated from model 'PaginatedMoveDamageClassSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveDamageClassSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveLearnMethodSummaryList` generated from model 'PaginatedMoveLearnMethodSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveLearnMethodSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveMetaAilmentSummaryList` generated from model 'PaginatedMoveMetaAilmentSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveMetaAilmentSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveMetaCategorySummaryList` generated from model 'PaginatedMoveMetaCategorySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveMetaCategorySummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveSummaryList` generated from model 'PaginatedMoveSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedMoveTargetSummaryList` generated from model 'PaginatedMoveTargetSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveTargetSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedNatureSummaryList` generated from model 'PaginatedNatureSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedNatureSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPalParkAreaSummaryList` generated from model 'PaginatedPalParkAreaSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPalParkAreaSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokeathlonStatSummaryList` generated from model 'PaginatedPokeathlonStatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokeathlonStatSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokedexSummaryList` generated from model 'PaginatedPokedexSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokedexSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonColorSummaryList` generated from model 'PaginatedPokemonColorSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonColorSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonFormSummaryList` generated from model 'PaginatedPokemonFormSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonFormSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonHabitatSummaryList` generated from model 'PaginatedPokemonHabitatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonHabitatSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonShapeSummaryList` generated from model 'PaginatedPokemonShapeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonShapeSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonSpeciesSummaryList` generated from model 'PaginatedPokemonSpeciesSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonSpeciesSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedPokemonSummaryList` generated from model 'PaginatedPokemonSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedRegionSummaryList` generated from model 'PaginatedRegionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedRegionSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedStatSummaryList` generated from model 'PaginatedStatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedStatSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedSuperContestEffectSummaryList` generated from model 'PaginatedSuperContestEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedSuperContestEffectSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedTypeSummaryList` generated from model 'PaginatedTypeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedTypeSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedVersionGroupSummaryList` generated from model 'PaginatedVersionGroupSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedVersionGroupSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PaginatedVersionSummaryList` generated from model 'PaginatedVersionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedVersionSummaryList` (
  `count` INT NOT NULL COMMENT 'The total number of resources available from this API.',
  `next` TEXT DEFAULT NULL COMMENT 'The URL for the next page in the list, or null if there is no next page.',
  `previous` TEXT DEFAULT NULL COMMENT 'The URL for the previous page in the list, or null if there is no previous page.',
  `results` JSON NOT NULL COMMENT 'A list of API resources on this page.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PalParkAreaDetail` generated from model 'PalParkAreaDetail'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_encounters` JSON NOT NULL COMMENT 'A list of Pokémon encountered in thi pal park area along with details.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PalParkAreaName` generated from model 'PalParkAreaName'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PalParkAreaSummary` generated from model 'PalParkAreaSummary'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PalParkEncounter` generated from model 'PalParkEncounter'
--

CREATE TABLE IF NOT EXISTS `PalParkEncounter` (
  `base_score` INT DEFAULT NULL COMMENT 'The base score given to the player when this Pokémon is caught during a pal park run.',
  `rate` INT NOT NULL COMMENT 'The base rate for encountering this Pokémon in this pal park area.',
  `pokemon_species` TEXT NOT NULL COMMENT 'The Pokémon species being encountered.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeapiMetaResponse` generated from model 'PokeapiMetaResponse'
--

CREATE TABLE IF NOT EXISTS `PokeapiMetaResponse` (
  `deploy_date` TEXT NOT NULL COMMENT 'The deployment time as a Unix timestamp string.',
  `hash` TEXT NOT NULL COMMENT 'The source commit hash used for this deployment.',
  `tag` TEXT NOT NULL COMMENT 'The deployment tag, or null if the deployment has no tag.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatAffectingNature` generated from model 'PokeathlonStatAffectingNature'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatAffectingNature` (
  `max_change` INT NOT NULL COMMENT 'The maximum amount of change to the referenced Pokéathlon stat.',
  `nature` TEXT NOT NULL COMMENT 'The nature causing the change.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatAffectingNatures` generated from model 'PokeathlonStatAffectingNatures'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatAffectingNatures` (
  `increase` JSON NOT NULL COMMENT 'A list of natures and how they change the referenced Pokéathlon stat.',
  `decrease` JSON NOT NULL COMMENT 'A list of natures and how they change the referenced Pokéathlon stat.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatDetail` generated from model 'PokeathlonStatDetail'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `affecting_natures` TEXT NOT NULL COMMENT 'A detail of natures which affect this Pokéathlon stat positively or negatively.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatName` generated from model 'PokeathlonStatName'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokeathlonStatSummary` generated from model 'PokeathlonStatSummary'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexDescription` generated from model 'PokedexDescription'
--

CREATE TABLE IF NOT EXISTS `PokedexDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexDetail` generated from model 'PokedexDetail'
--

CREATE TABLE IF NOT EXISTS `PokedexDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `is_main_series` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this Pokédex originated in the main series of the video games.',
  `descriptions` JSON NOT NULL COMMENT 'The description of this resource listed in different languages.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_entries` JSON NOT NULL COMMENT 'A list of Pokémon catalogued in this Pokédex and their indexes.',
  `region` TEXT NOT NULL COMMENT 'The region this Pokédex catalogues Pokémon for.',
  `version_groups` JSON NOT NULL COMMENT 'A list of version groups this Pokédex is relevant to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexName` generated from model 'PokedexName'
--

CREATE TABLE IF NOT EXISTS `PokedexName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokedexSummary` generated from model 'PokedexSummary'
--

CREATE TABLE IF NOT EXISTS `PokedexSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonAbility` generated from model 'PokemonAbility'
--

CREATE TABLE IF NOT EXISTS `PokemonAbility` (
  `is_hidden` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this is a hidden ability.',
  `slot` INT NOT NULL COMMENT 'The slot this ability occupies in this Pokémon species.',
  `ability` TEXT NOT NULL COMMENT 'The ability the Pokémon may have.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonAbilityPast` generated from model 'PokemonAbilityPast'
--

CREATE TABLE IF NOT EXISTS `PokemonAbilityPast` (
  `is_hidden` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this is a hidden ability.',
  `slot` INT NOT NULL COMMENT 'The slot this ability occupies in this Pokémon species.',
  `ability` TEXT NOT NULL COMMENT 'The ability the Pokémon may have.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonColorDetail` generated from model 'PokemonColorDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonColorDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_species` JSON NOT NULL COMMENT 'A list of the Pokémon species that have this color.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonColorName` generated from model 'PokemonColorName'
--

CREATE TABLE IF NOT EXISTS `PokemonColorName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonColorSummary` generated from model 'PokemonColorSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonColorSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonCries` generated from model 'PokemonCries'
--

CREATE TABLE IF NOT EXISTS `PokemonCries` (
  `latest` TEXT NOT NULL COMMENT 'The latest depiction of this Pokémon&#39;s cry.',
  `legacy` TEXT NOT NULL COMMENT 'The legacy depiction of this Pokémon&#39;s cry.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDetail` generated from model 'PokemonDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `base_experience` INT DEFAULT NULL COMMENT 'The base experience gained for defeating this Pokémon.',
  `height` INT DEFAULT NULL COMMENT 'The height of this Pokémon in decimetres.',
  `is_default` TINYINT(1) DEFAULT NULL COMMENT 'Set for exactly one Pokémon used as the default for each species.',
  `order` INT DEFAULT NULL COMMENT 'Order for sorting. Almost national order, except families are grouped together.',
  `weight` INT DEFAULT NULL COMMENT 'The weight of this Pokémon in hectograms.',
  `abilities` JSON NOT NULL COMMENT 'A list of abilities this Pokémon could potentially have.',
  `past_abilities` JSON NOT NULL COMMENT 'A list of details showing abilities this pokémon had in previous generations',
  `forms` JSON NOT NULL COMMENT 'A list of forms this Pokémon can take on.',
  `game_indices` JSON NOT NULL COMMENT 'A list of game indices relevent to Pokémon item by generation.',
  `held_items` JSON NOT NULL COMMENT 'A list of items this Pokémon may be holding when encountered.',
  `location_area_encounters` TEXT NOT NULL COMMENT 'A link to a list of location areas, as well as encounter details pertaining to specific versions.',
  `moves` JSON NOT NULL COMMENT 'A list of moves along with learn methods and level details pertaining to specific version groups.',
  `species` TEXT NOT NULL COMMENT 'The species this Pokémon belongs to.',
  `sprites` TEXT NOT NULL COMMENT 'A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;',
  `cries` TEXT NOT NULL COMMENT 'A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;',
  `stats` JSON NOT NULL COMMENT 'A list of base stat values for this Pokémon.',
  `past_stats` JSON NOT NULL COMMENT 'A list of details showing stats this pokémon had in previous generations',
  `types` JSON NOT NULL COMMENT 'A list of details showing types this Pokémon has.',
  `past_types` JSON NOT NULL COMMENT 'A list of details showing types this pokémon had in previous generations'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDexEntry` generated from model 'PokemonDexEntry'
--

CREATE TABLE IF NOT EXISTS `PokemonDexEntry` (
  `entry_number` INT NOT NULL COMMENT 'The index number within the Pokédex.',
  `pokedex` TEXT NOT NULL COMMENT 'The Pokédex the referenced Pokémon species can be found in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonDexNumber` generated from model 'PokemonDexNumber'
--

CREATE TABLE IF NOT EXISTS `PokemonDexNumber` (
  `entry_number` INT NOT NULL COMMENT 'The index of this Pokémon species entry within the Pokédex.',
  `pokemon_species` TEXT NOT NULL COMMENT 'The Pokémon species being encountered.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonEncounterDetailResponse` generated from model 'PokemonEncounterDetailResponse'
--

CREATE TABLE IF NOT EXISTS `PokemonEncounterDetailResponse` (
  `chance` INT NOT NULL COMMENT 'Percent chance that this encounter will occur.',
  `condition_values` JSON NOT NULL COMMENT 'A list of condition values that must be in effect for this encounter to occur.',
  `max_level` INT NOT NULL COMMENT 'The highest level the Pokémon could be encountered at.',
  `method` TEXT NOT NULL COMMENT 'The method by which this encounter happens.',
  `min_level` INT NOT NULL COMMENT 'The lowest level the Pokémon could be encountered at.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonEncounterResponse` generated from model 'PokemonEncounterResponse'
--

CREATE TABLE IF NOT EXISTS `PokemonEncounterResponse` (
  `location_area` TEXT NOT NULL COMMENT 'The location area the referenced Pokémon can be encountered in.',
  `version_details` JSON NOT NULL COMMENT 'A list of versions and encounters with the referenced Pokémon that might happen.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonEncounterVersionDetailResponse` generated from model 'PokemonEncounterVersionDetailResponse'
--

CREATE TABLE IF NOT EXISTS `PokemonEncounterVersionDetailResponse` (
  `version` TEXT NOT NULL COMMENT 'The game version this encounter happens in.',
  `max_chance` INT NOT NULL COMMENT 'The total percentage of all encounter potential.',
  `encounter_details` JSON NOT NULL COMMENT 'A list of encounters and their specifics.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonEvolution` generated from model 'PokemonEvolution'
--

CREATE TABLE IF NOT EXISTS `PokemonEvolution` (
  `version_group` TEXT NOT NULL COMMENT 'The version group in which these evolution requirements apply.',
  `is_default` TINYINT(1) DEFAULT NULL COMMENT 'Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.',
  `item` TEXT NOT NULL COMMENT 'The item required to cause evolution this into Pokémon species.',
  `trigger` TEXT NOT NULL COMMENT 'The type of event that triggers evolution into this Pokémon species.',
  `gender` INT DEFAULT NULL COMMENT 'The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.',
  `held_item` TEXT NOT NULL COMMENT 'The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.',
  `known_move` TEXT NOT NULL,
  `known_move_type` TEXT NOT NULL,
  `location` TEXT NOT NULL COMMENT 'The location the evolution must be triggered at.',
  `min_level` INT DEFAULT NULL COMMENT 'The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.',
  `min_happiness` INT DEFAULT NULL COMMENT 'The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.',
  `min_beauty` INT DEFAULT NULL COMMENT 'The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.',
  `min_affection` INT DEFAULT NULL COMMENT 'The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.',
  `near_special_rock` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.',
  `needs_multiplayer` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).',
  `needs_overworld_rain` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not it must be raining in the overworld to cause evolution this Pokémon species.',
  `party_species` TEXT NOT NULL COMMENT 'The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.',
  `party_type` TEXT NOT NULL COMMENT 'The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.',
  `relative_physical_stats` INT DEFAULT NULL COMMENT 'The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.',
  `time_of_day` VARCHAR(10) DEFAULT NULL COMMENT 'The required time of day. Day or night.',
  `trade_species` TEXT NOT NULL COMMENT 'Pokémon species for which this one must be traded.',
  `turn_upside_down` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.',
  `region` TEXT NOT NULL COMMENT 'The required region in which this evolution can occur.',
  `required_pokemon_form` TEXT NOT NULL COMMENT 'The Pokémon form required before evolving, or null if unrestricted.',
  `evolved_pokemon_form` TEXT NOT NULL COMMENT 'The Pokémon form produced by this evolution, or null if unspecified.',
  `used_move` TEXT NOT NULL COMMENT 'The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.',
  `min_move_count` INT DEFAULT NULL COMMENT 'The minimum number of times a move must be used in order to evolve into this Pokémon species.',
  `min_steps` INT DEFAULT NULL COMMENT 'The minimum number of steps that must be taken in order to evolve into this Pokémon species.',
  `min_damage_taken` INT DEFAULT NULL COMMENT 'The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.',
  `allowed_natures` JSON NOT NULL COMMENT 'The natures that allow this evolution, or null if unrestricted.',
  `condition_expression` TEXT NOT NULL COMMENT 'An additional evolution condition expressed in reverse Polish notation, or null if none.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonEvolution_known_move` generated from model 'PokemonEvolutionUnderscoreknownUnderscoremove'
--

CREATE TABLE IF NOT EXISTS `PokemonEvolution_known_move` (
  `name` TEXT NOT NULL,
  `url` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormDetail` generated from model 'PokemonFormDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonFormDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `order` INT DEFAULT NULL COMMENT 'The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.',
  `form_order` INT DEFAULT NULL COMMENT 'The order in which forms should be sorted within a species&#39; forms.',
  `is_default` TINYINT(1) DEFAULT NULL COMMENT 'True for exactly one form used as the default for each Pokémon.',
  `is_battle_only` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this form can only happen during battle.',
  `is_mega` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this form requires mega evolution.',
  `form_name` VARCHAR(30) NOT NULL COMMENT 'The name of this form.',
  `pokemon` TEXT NOT NULL COMMENT 'The Pokémon that can take on this form.',
  `sprites` TEXT NOT NULL COMMENT 'A set of sprites used to depict this Pokémon form in the game.',
  `version_group` TEXT NOT NULL COMMENT 'The version group this Pokémon form was introduced in.',
  `form_names` JSON NOT NULL COMMENT 'The form specific form name of this Pokémon form, or empty if the form does not have a specific name.',
  `names` JSON NOT NULL COMMENT 'The form specific full name of this Pokémon form, or empty if the form does not have a specific name.',
  `types` JSON NOT NULL COMMENT 'A list of details showing types this Pokémon form has.',
  `trigger_conditions` JSON NOT NULL COMMENT 'The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.',
  `flavor_text_entries` JSON NOT NULL COMMENT 'The flavor text of this form listed in different languages and versions.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormFlavorText` generated from model 'PokemonFormFlavorText'
--

CREATE TABLE IF NOT EXISTS `PokemonFormFlavorText` (
  `flavor_text` TEXT NOT NULL COMMENT 'The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more. ',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.',
  `version` TEXT NOT NULL COMMENT 'The game version this flavor text is extracted from.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormName` generated from model 'PokemonFormName'
--

CREATE TABLE IF NOT EXISTS `PokemonFormName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormSprites` generated from model 'PokemonFormSprites'
--

CREATE TABLE IF NOT EXISTS `PokemonFormSprites` (
  `front_default` TEXT NOT NULL COMMENT 'The default depiction of this Pokémon from the front in battle.',
  `front_shiny` TEXT NOT NULL COMMENT 'The shiny depiction of this Pokémon from the front in battle.',
  `front_female` TEXT NOT NULL COMMENT 'The female depiction of this Pokémon from the front in battle.',
  `front_shiny_female` TEXT NOT NULL COMMENT 'The shiny female depiction of this Pokémon from the front in battle.',
  `back_default` TEXT NOT NULL COMMENT 'The default depiction of this Pokémon from the back in battle.',
  `back_shiny` TEXT NOT NULL COMMENT 'The shiny depiction of this Pokémon from the back in battle.',
  `back_female` TEXT NOT NULL COMMENT 'The female depiction of this Pokémon from the back in battle.',
  `back_shiny_female` TEXT NOT NULL COMMENT 'The shiny female depiction of this Pokémon from the back in battle.',
  `other` TEXT DEFAULT NULL COMMENT 'Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.',
  `versions` JSON DEFAULT NULL COMMENT 'Sprites grouped by generation and game. Available keys vary by resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormSummary` generated from model 'PokemonFormSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonFormSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormTriggerCondition` generated from model 'PokemonFormTriggerCondition'
--

CREATE TABLE IF NOT EXISTS `PokemonFormTriggerCondition` (
  `trigger` TEXT NOT NULL COMMENT 'The trigger for this form change.',
  `name` TEXT DEFAULT NULL COMMENT 'The name of the required item, ability, or move. Only present for a resource-based trigger.',
  `url` TEXT DEFAULT NULL COMMENT 'The URL of the required item, ability, or move. Only present for a resource-based trigger.',
  `base_form` TEXT DEFAULT NULL COMMENT 'The required base form. Only present when the trigger specifies one.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonFormType` generated from model 'PokemonFormType'
--

CREATE TABLE IF NOT EXISTS `PokemonFormType` (
  `slot` INT NOT NULL COMMENT 'The order the Pokémon&#39;s types are listed in.',
  `type` TEXT NOT NULL COMMENT 'The type the referenced Form has.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonGameIndex` generated from model 'PokemonGameIndex'
--

CREATE TABLE IF NOT EXISTS `PokemonGameIndex` (
  `game_index` INT NOT NULL COMMENT 'The internal id of an API resource within game data.',
  `version` TEXT NOT NULL COMMENT 'The version relevent to this game index.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHabitatDetail` generated from model 'PokemonHabitatDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_species` JSON NOT NULL COMMENT 'A list of the Pokémon species that can be found in this habitat.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHabitatName` generated from model 'PokemonHabitatName'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHabitatSummary` generated from model 'PokemonHabitatSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHeldItem` generated from model 'PokemonHeldItem'
--

CREATE TABLE IF NOT EXISTS `PokemonHeldItem` (
  `pokemon` TEXT NOT NULL COMMENT 'The Pokémon that holds this item.',
  `version_details` JSON NOT NULL COMMENT 'The details for the version that this item is held in by the Pokémon.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHeldItemSummary` generated from model 'PokemonHeldItemSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonHeldItemSummary` (
  `item` TEXT NOT NULL COMMENT 'The item the referenced Pokémon holds.',
  `version_details` JSON NOT NULL COMMENT 'The details of the different versions in which the item is held.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonHeldItemVersion` generated from model 'PokemonHeldItemVersion'
--

CREATE TABLE IF NOT EXISTS `PokemonHeldItemVersion` (
  `rarity` INT NOT NULL COMMENT 'How often the item is held.',
  `version` TEXT NOT NULL COMMENT 'The version in which the item is held.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonMove` generated from model 'PokemonMove'
--

CREATE TABLE IF NOT EXISTS `PokemonMove` (
  `move` TEXT NOT NULL COMMENT 'The move the Pokémon can learn.',
  `version_group_details` JSON NOT NULL COMMENT 'The details of the version in which the Pokémon can learn the move.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonMoveVersionGroup` generated from model 'PokemonMoveVersionGroup'
--

CREATE TABLE IF NOT EXISTS `PokemonMoveVersionGroup` (
  `level_learned_at` INT NOT NULL COMMENT 'The minimum level to learn the move.',
  `move_learn_method` TEXT NOT NULL COMMENT 'The method by which the move is learned.',
  `version_group` TEXT NOT NULL COMMENT 'The version group in which the move is learned.',
  `order` INT DEFAULT NULL COMMENT 'Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonPastAbility` generated from model 'PokemonPastAbility'
--

CREATE TABLE IF NOT EXISTS `PokemonPastAbility` (
  `abilities` JSON NOT NULL COMMENT 'The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.',
  `generation` TEXT NOT NULL COMMENT 'The last generation in which the referenced pokémon had the listed abilities.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonPastStat` generated from model 'PokemonPastStat'
--

CREATE TABLE IF NOT EXISTS `PokemonPastStat` (
  `generation` TEXT NOT NULL COMMENT 'The last generation in which the referenced pokémon had the listed stats.',
  `stats` JSON NOT NULL COMMENT 'The stat the Pokémon had up to and including the listed generation.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonPastType` generated from model 'PokemonPastType'
--

CREATE TABLE IF NOT EXISTS `PokemonPastType` (
  `generation` TEXT NOT NULL COMMENT 'The last generation in which the referenced pokémon had the listed types.',
  `types` JSON NOT NULL COMMENT 'The types the referenced pokémon had up to and including the listed generation.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonShapeAwesomeName` generated from model 'PokemonShapeAwesomeName'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeAwesomeName` (
  `awesome_name` VARCHAR(30) NOT NULL COMMENT 'The localized \&quot;scientific\&quot; name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this \&quot;scientific\&quot; name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonShapeDetail` generated from model 'PokemonShapeDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `awesome_names` JSON NOT NULL COMMENT 'The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon_species` JSON NOT NULL COMMENT 'A list of the Pokémon species that have this shape.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonShapeName` generated from model 'PokemonShapeName'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonShapeSummary` generated from model 'PokemonShapeSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesDescription` generated from model 'PokemonSpeciesDescription'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDescription` (
  `description` TEXT DEFAULT NULL COMMENT 'The localized description for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesDetail` generated from model 'PokemonSpeciesDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `order` INT DEFAULT NULL COMMENT 'The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.',
  `gender_rate` INT DEFAULT NULL COMMENT 'The chance of this Pokémon being female, in eighths; or -1 for genderless.',
  `capture_rate` INT DEFAULT NULL COMMENT 'The base capture rate; up to 255. The higher the number, the easier the catch.',
  `base_happiness` INT DEFAULT NULL COMMENT 'The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.',
  `is_baby` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this is a baby Pokémon.',
  `is_legendary` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this is a legendary Pokémon.',
  `is_mythical` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this is a mythical Pokémon.',
  `hatch_counter` INT DEFAULT NULL COMMENT 'Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.',
  `has_gender_differences` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this Pokémon has visual gender differences.',
  `forms_switchable` TINYINT(1) DEFAULT NULL COMMENT 'Whether or not this Pokémon has multiple forms and can switch between them.',
  `growth_rate` TEXT NOT NULL COMMENT 'The rate at which this Pokémon species gains levels.',
  `pokedex_numbers` JSON NOT NULL COMMENT 'A list of Pokedexes and the indexes reserved within them for this Pokémon species.',
  `egg_groups` JSON NOT NULL COMMENT 'A list of egg groups this Pokémon species is a member of.',
  `color` TEXT NOT NULL COMMENT 'The color of this Pokémon for Pokédex search.',
  `shape` TEXT NOT NULL COMMENT 'The shape of this Pokémon for Pokédex search.',
  `evolves_from_species` TEXT NOT NULL COMMENT 'The Pokémon species that evolves into this Pokemon_species.',
  `evolution_chain` TEXT NOT NULL COMMENT 'The evolution chain this Pokémon species is a member of.',
  `habitat` TEXT NOT NULL COMMENT 'The habitat this Pokémon species can be encountered in.',
  `generation` TEXT NOT NULL COMMENT 'The generation this Pokémon species was introduced in.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pal_park_encounters` JSON NOT NULL COMMENT 'A list of encounters that can be had with this Pokémon species in pal park.',
  `form_descriptions` JSON NOT NULL COMMENT 'Descriptions of different forms Pokémon take on within the Pokémon species.',
  `flavor_text_entries` JSON NOT NULL COMMENT 'A list of flavor text entries for this Pokémon species.',
  `genera` JSON NOT NULL COMMENT 'The genus of this Pokémon species listed in multiple languages.',
  `varieties` JSON NOT NULL COMMENT 'A list of the Pokémon that exist within this Pokémon species.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesFlavorText` generated from model 'PokemonSpeciesFlavorText'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesFlavorText` (
  `flavor_text` TEXT NOT NULL COMMENT 'The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more. ',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.',
  `version` TEXT NOT NULL COMMENT 'The game version this flavor text is extracted from.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesGenus` generated from model 'PokemonSpeciesGenus'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesGenus` (
  `genus` VARCHAR(30) NOT NULL COMMENT 'The localized genus for the referenced Pokémon species',
  `language` TEXT NOT NULL COMMENT 'The language this genus is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesName` generated from model 'PokemonSpeciesName'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesPalParkEncounter` generated from model 'PokemonSpeciesPalParkEncounter'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesPalParkEncounter` (
  `base_score` INT DEFAULT NULL COMMENT 'The base score given to the player when the referenced Pokémon is caught during a pal park run.',
  `rate` INT NOT NULL COMMENT 'The base rate for encountering the referenced Pokémon in this pal park area.',
  `area` TEXT NOT NULL COMMENT 'The pal park area where this encounter happens.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesSummary` generated from model 'PokemonSpeciesSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpeciesVariety` generated from model 'PokemonSpeciesVariety'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesVariety` (
  `is_default` TINYINT(1) NOT NULL COMMENT 'Whether this variety is the default variety.',
  `pokemon` TEXT NOT NULL COMMENT 'The Pokémon variety.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSprites` generated from model 'PokemonSprites'
--

CREATE TABLE IF NOT EXISTS `PokemonSprites` (
  `front_default` TEXT NOT NULL COMMENT 'The default depiction of this Pokémon from the front in battle.',
  `front_shiny` TEXT NOT NULL COMMENT 'The shiny depiction of this Pokémon from the front in battle.',
  `front_female` TEXT NOT NULL COMMENT 'The female depiction of this Pokémon from the front in battle.',
  `front_shiny_female` TEXT NOT NULL COMMENT 'The shiny female depiction of this Pokémon from the front in battle.',
  `back_default` TEXT NOT NULL COMMENT 'The default depiction of this Pokémon from the back in battle.',
  `back_shiny` TEXT NOT NULL COMMENT 'The shiny depiction of this Pokémon from the back in battle.',
  `back_female` TEXT NOT NULL COMMENT 'The female depiction of this Pokémon from the back in battle.',
  `back_shiny_female` TEXT NOT NULL COMMENT 'The shiny female depiction of this Pokémon from the back in battle.',
  `other` TEXT DEFAULT NULL COMMENT 'Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.',
  `versions` JSON DEFAULT NULL COMMENT 'Sprites grouped by generation and game. Available keys vary by resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpritesOther` generated from model 'PokemonSpritesOther'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOther` (
  `dream_world` TEXT DEFAULT NULL COMMENT 'Pokémon Dream World artwork URLs.',
  `home` TEXT DEFAULT NULL COMMENT 'Pokémon HOME sprite URLs.',
  `showdown` TEXT DEFAULT NULL COMMENT 'Pokémon Showdown sprite URLs.',
  `official-artwork` TEXT DEFAULT NULL COMMENT 'Official Pokémon artwork URLs, including shiny artwork and version-specific variants.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpritesOtherDreamWorld` generated from model 'PokemonSpritesOtherDreamWorld'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOtherDreamWorld` (
  `front_default` TEXT NOT NULL COMMENT 'The URL of the default Pokémon Dream World front image, or null if unavailable.',
  `front_female` TEXT NOT NULL COMMENT 'The URL of the female Pokémon Dream World front image, or null if unavailable.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpritesOtherHome` generated from model 'PokemonSpritesOtherHome'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOtherHome` (
  `front_default` TEXT NOT NULL COMMENT 'The URL of the default Pokémon HOME front image, or null if unavailable.',
  `front_female` TEXT NOT NULL COMMENT 'The URL of the female Pokémon HOME front image, or null if unavailable.',
  `front_shiny` TEXT NOT NULL COMMENT 'The URL of the shiny Pokémon HOME front image, or null if unavailable.',
  `front_shiny_female` TEXT NOT NULL COMMENT 'The URL of the shiny female Pokémon HOME front image, or null if unavailable.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpritesOtherOfficialArtwork` generated from model 'PokemonSpritesOtherOfficialArtwork'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOtherOfficialArtwork` (
  `front_default` TEXT NOT NULL COMMENT 'The URL of the default front official artwork, or null if unavailable.',
  `front_shiny` TEXT NOT NULL COMMENT 'The URL of the shiny front official artwork, or null if unavailable.',
  `versions` JSON DEFAULT NULL COMMENT 'Additional official artwork grouped by version. Available keys vary by resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSpritesOtherShowdown` generated from model 'PokemonSpritesOtherShowdown'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOtherShowdown` (
  `front_default` TEXT NOT NULL COMMENT 'The URL of the default Pokémon Showdown front image, or null if unavailable.',
  `front_female` TEXT NOT NULL COMMENT 'The URL of the female Pokémon Showdown front image, or null if unavailable.',
  `front_shiny` TEXT NOT NULL COMMENT 'The URL of the shiny Pokémon Showdown front image, or null if unavailable.',
  `front_shiny_female` TEXT NOT NULL COMMENT 'The URL of the shiny female Pokémon Showdown front image, or null if unavailable.',
  `back_default` TEXT NOT NULL COMMENT 'The URL of the default Pokémon Showdown back image, or null if unavailable.',
  `back_female` TEXT NOT NULL COMMENT 'The URL of the female Pokémon Showdown back image, or null if unavailable.',
  `back_shiny` TEXT NOT NULL COMMENT 'The URL of the shiny Pokémon Showdown back image, or null if unavailable.',
  `back_shiny_female` TEXT NOT NULL COMMENT 'The URL of the shiny female Pokémon Showdown back image, or null if unavailable.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonStat` generated from model 'PokemonStat'
--

CREATE TABLE IF NOT EXISTS `PokemonStat` (
  `base_stat` INT NOT NULL COMMENT 'The base value of the stat.',
  `effort` INT NOT NULL COMMENT 'The effort points (EV) the Pokémon has in the stat.',
  `stat` TEXT NOT NULL COMMENT 'The stat the Pokémon has.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonSummary` generated from model 'PokemonSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `PokemonType` generated from model 'PokemonType'
--

CREATE TABLE IF NOT EXISTS `PokemonType` (
  `slot` INT NOT NULL COMMENT 'The order the Pokémon&#39;s types are listed in.',
  `type` TEXT NOT NULL COMMENT 'The type the referenced Pokémon has.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RegionDetail` generated from model 'RegionDetail'
--

CREATE TABLE IF NOT EXISTS `RegionDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `locations` JSON NOT NULL COMMENT 'A list of locations that can be found in this region.',
  `main_generation` TEXT NOT NULL COMMENT 'The generation this region was introduced in.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokedexes` JSON NOT NULL COMMENT 'A list of pokédexes that catalogue Pokémon in this region.',
  `version_groups` JSON NOT NULL COMMENT 'A list of version groups where this region can be visited.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RegionName` generated from model 'RegionName'
--

CREATE TABLE IF NOT EXISTS `RegionName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `RegionSummary` generated from model 'RegionSummary'
--

CREATE TABLE IF NOT EXISTS `RegionSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatAffectingMoves` generated from model 'StatAffectingMoves'
--

CREATE TABLE IF NOT EXISTS `StatAffectingMoves` (
  `increase` JSON NOT NULL COMMENT 'A list of moves and how they change the referenced stat.',
  `decrease` JSON NOT NULL COMMENT 'A list of moves and how they change the referenced stat.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatAffectingNatures` generated from model 'StatAffectingNatures'
--

CREATE TABLE IF NOT EXISTS `StatAffectingNatures` (
  `increase` JSON NOT NULL COMMENT 'A list of natures and how they change the referenced stat.',
  `decrease` JSON NOT NULL COMMENT 'A list of nature sand how they change the referenced stat.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatDetail` generated from model 'StatDetail'
--

CREATE TABLE IF NOT EXISTS `StatDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `game_index` INT NOT NULL COMMENT 'ID the games use for this stat.',
  `is_battle_only` TINYINT(1) DEFAULT NULL COMMENT 'Whether this stat only exists within a battle.',
  `affecting_moves` TEXT NOT NULL COMMENT 'A detail of moves which affect this stat positively or negatively.',
  `affecting_natures` TEXT NOT NULL COMMENT 'A detail of natures which affect this stat positively or negatively.',
  `affecting_items` JSON NOT NULL COMMENT 'Items that affect this stat, such as vitamins and battle items.',
  `characteristics` JSON NOT NULL COMMENT 'A list of characteristics that are set on a Pokémon when its highest base stat is this stat.',
  `move_damage_class` TEXT NOT NULL COMMENT 'The class of damage this stat is directly related to.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatName` generated from model 'StatName'
--

CREATE TABLE IF NOT EXISTS `StatName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `StatSummary` generated from model 'StatSummary'
--

CREATE TABLE IF NOT EXISTS `StatSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SuperContestEffectDetail` generated from model 'SuperContestEffectDetail'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `appeal` INT NOT NULL COMMENT 'The level of appeal this super contest effect has.',
  `flavor_text_entries` JSON NOT NULL COMMENT 'The flavor text of this super contest effect listed in different languages.',
  `moves` JSON NOT NULL COMMENT 'A list of moves that have the effect when used in super contests.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SuperContestEffectFlavorText` generated from model 'SuperContestEffectFlavorText'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectFlavorText` (
  `flavor_text` TEXT NOT NULL COMMENT 'The localized flavor text for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `SuperContestEffectSummary` generated from model 'SuperContestEffectSummary'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectSummary` (
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeDetail` generated from model 'TypeDetail'
-- Serializer for the Type resource
--

CREATE TABLE IF NOT EXISTS `TypeDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `damage_relations` TEXT NOT NULL COMMENT 'A detail of how effective this type is toward others and vice versa.',
  `past_damage_relations` JSON NOT NULL COMMENT 'A list of details of how effective this type was toward others and vice versa in previous generations',
  `game_indices` JSON NOT NULL COMMENT 'A list of game indices relevent to this item by generation.',
  `generation` TEXT NOT NULL COMMENT 'The generation this type was introduced in.',
  `move_damage_class` TEXT NOT NULL COMMENT 'The class of damage inflicted by this type.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `pokemon` JSON NOT NULL COMMENT 'A list of details of Pokémon that have this type.',
  `moves` JSON NOT NULL COMMENT 'A list of moves that have this type.',
  `sprites` JSON NOT NULL COMMENT 'Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Serializer for the Type resource';

--
-- Table structure for table `TypeGameIndex` generated from model 'TypeGameIndex'
--

CREATE TABLE IF NOT EXISTS `TypeGameIndex` (
  `game_index` INT NOT NULL COMMENT 'The internal id of an API resource within game data.',
  `generation` TEXT NOT NULL COMMENT 'The generation relevent to this game index.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeGameSprite` generated from model 'TypeGameSprite'
--

CREATE TABLE IF NOT EXISTS `TypeGameSprite` (
  `name_icon` TEXT DEFAULT NULL COMMENT 'The URL of the icon displaying the type name in this game, or null if unavailable.',
  `symbol_icon` TEXT DEFAULT NULL COMMENT 'The URL of the type symbol icon in this game, or null if unavailable.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeName` generated from model 'TypeName'
--

CREATE TABLE IF NOT EXISTS `TypeName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypePastRelationships` generated from model 'TypePastRelationships'
--

CREATE TABLE IF NOT EXISTS `TypePastRelationships` (
  `generation` TEXT NOT NULL COMMENT 'The last generation in which the referenced type had the listed damage relations',
  `damage_relations` TEXT NOT NULL COMMENT 'The damage relations the referenced type had up to and including the listed generation'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypePokemon` generated from model 'TypePokemon'
--

CREATE TABLE IF NOT EXISTS `TypePokemon` (
  `slot` INT NOT NULL COMMENT 'The order the Pokémon&#39;s types are listed in.',
  `pokemon` TEXT NOT NULL COMMENT 'The Pokémon that has the referenced type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeRelationships` generated from model 'TypeRelationships'
--

CREATE TABLE IF NOT EXISTS `TypeRelationships` (
  `no_damage_to` JSON NOT NULL COMMENT 'A list of types this type has no effect on.',
  `half_damage_to` JSON NOT NULL COMMENT 'A list of types this type is not very effect against.',
  `double_damage_to` JSON NOT NULL COMMENT 'A list of types this type is very effect against.',
  `no_damage_from` JSON NOT NULL COMMENT 'A list of types that have no effect on this type.',
  `half_damage_from` JSON NOT NULL COMMENT 'A list of types that are not very effective against this type.',
  `double_damage_from` JSON NOT NULL COMMENT 'A list of types that are very effective against this type.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TypeSummary` generated from model 'TypeSummary'
--

CREATE TABLE IF NOT EXISTS `TypeSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionDetail` generated from model 'VersionDetail'
-- Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
--

CREATE TABLE IF NOT EXISTS `VersionDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `names` JSON NOT NULL COMMENT 'The name of this resource listed in different languages.',
  `version_group` TEXT NOT NULL COMMENT 'The version group this version belongs to.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink';

--
-- Table structure for table `VersionGroupDetail` generated from model 'VersionGroupDetail'
--

CREATE TABLE IF NOT EXISTS `VersionGroupDetail` (
  `id` INT NOT NULL COMMENT 'The identifier for this resource.',
  `name` VARCHAR(200) NOT NULL COMMENT 'The name for this resource.',
  `order` INT DEFAULT NULL COMMENT 'Order for sorting. Almost by date of release, except similar versions are grouped together.',
  `generation` TEXT NOT NULL COMMENT 'The generation this version was introduced in.',
  `move_learn_methods` JSON NOT NULL COMMENT 'A list of methods in which Pokémon can learn moves in this version group.',
  `pokedexes` JSON NOT NULL COMMENT 'A list of Pokédexes introduces in this version group.',
  `regions` JSON NOT NULL COMMENT 'A list of regions that can be visited in this version group.',
  `versions` JSON NOT NULL COMMENT 'The versions this version group owns.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionGroupSummary` generated from model 'VersionGroupSummary'
--

CREATE TABLE IF NOT EXISTS `VersionGroupSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionName` generated from model 'VersionName'
--

CREATE TABLE IF NOT EXISTS `VersionName` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The localized name for an API resource in a specific language.',
  `language` TEXT NOT NULL COMMENT 'The language this name is in.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `VersionSummary` generated from model 'VersionSummary'
--

CREATE TABLE IF NOT EXISTS `VersionSummary` (
  `name` VARCHAR(200) NOT NULL COMMENT 'The name of the referenced resource.',
  `url` TEXT NOT NULL COMMENT 'The URL of the referenced resource.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


