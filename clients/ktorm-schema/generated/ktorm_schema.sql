

-- --------------------------------------------------------------------------
-- Table structure for table `AbilityChange` generated from model 'abilityChange'
--

CREATE TABLE IF NOT EXISTS `AbilityChange` (
  `version_group` long NOT NULL /*The version group in which the previous effect of this ability originated.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AbilityChangeAbilityChangeEffectText` generated from model 'AbilityChangeAbilityChangeEffectText'

CREATE TABLE IF NOT EXISTS `AbilityChangeAbilityChangeEffectText` (
  `abilityChange` long NOT NULL
  `abilityChangeEffectText` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityChangeEffectText` generated from model 'abilityChangeEffectText'
--

CREATE TABLE IF NOT EXISTS `AbilityChangeEffectText` (
  `effect` text NOT NULL /*The localized effect text for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this effect is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetail` generated from model 'abilityDetail'
--

CREATE TABLE IF NOT EXISTS `AbilityDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `generation` long NOT NULL /*The generation this ability originated in.*/,
  `is_main_series` boolean /*Whether or not this ability originated in the main series of the video games.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetailAbilityName` generated from model 'AbilityDetailAbilityName'

CREATE TABLE IF NOT EXISTS `AbilityDetailAbilityName` (
  `abilityDetail` long NOT NULL
  `abilityName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetailAbilityEffectText` generated from model 'AbilityDetailAbilityEffectText'

CREATE TABLE IF NOT EXISTS `AbilityDetailAbilityEffectText` (
  `abilityDetail` long NOT NULL
  `abilityEffectText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetailAbilityChange` generated from model 'AbilityDetailAbilityChange'

CREATE TABLE IF NOT EXISTS `AbilityDetailAbilityChange` (
  `abilityDetail` long NOT NULL
  `abilityChange` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetailAbilityFlavorText` generated from model 'AbilityDetailAbilityFlavorText'

CREATE TABLE IF NOT EXISTS `AbilityDetailAbilityFlavorText` (
  `abilityDetail` long NOT NULL
  `abilityFlavorText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetailAbilityPokemonDetail` generated from model 'AbilityDetailAbilityPokemonDetail'

CREATE TABLE IF NOT EXISTS `AbilityDetailAbilityPokemonDetail` (
  `abilityDetail` long NOT NULL
  `abilityPokemonDetail` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityEffectText` generated from model 'abilityEffectText'
--

CREATE TABLE IF NOT EXISTS `AbilityEffectText` (
  `effect` text NOT NULL /*The localized effect text for an API resource in a specific language.*/,
  `short_effect` text NOT NULL /*The localized effect text in brief.*/,
  `language` long NOT NULL /*The language this effect is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityFlavorText` generated from model 'abilityFlavorText'
--

CREATE TABLE IF NOT EXISTS `AbilityFlavorText` (
  `flavor_text` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this text resource is in.*/,
  `version_group` long NOT NULL /*The version group that uses this flavor text.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityName` generated from model 'abilityName'
--

CREATE TABLE IF NOT EXISTS `AbilityName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityPokemonDetail` generated from model 'abilityPokemonDetail'
--

CREATE TABLE IF NOT EXISTS `AbilityPokemonDetail` (
  `slot` int NOT NULL /*Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.*/,
  `pokemon` long NOT NULL /*The Pokémon this ability could belong to.*/,
  `is_hidden` boolean /*Whether or not this a hidden ability for the referenced Pokémon.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilitySummary` generated from model 'abilitySummary'
--

CREATE TABLE IF NOT EXISTS `AbilitySummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryDetail` generated from model 'berryDetail'
--

CREATE TABLE IF NOT EXISTS `BerryDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `firmness` long NOT NULL /*The firmness of this berry, used in making Pokéblocks or Poffins.*/,
  `item` long NOT NULL /*Berries are actually items. This is a reference to the item specific data for this berry.*/,
  `natural_gift_type` long NOT NULL /*The type inherited by \&quot;Natural Gift\&quot; when used with this Berry.*/,
  `growth_time` int /*Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.*/,
  `max_harvest` int /*The maximum number of these berries that can grow on one tree in Generation IV.*/,
  `natural_gift_power` int /*The power of the move \&quot;Natural Gift\&quot; when used with this Berry.*/,
  `size` int /*The size of this Berry, in millimeters.*/,
  `smoothness` int /*The smoothness of this Berry, used in making Pokéblocks or Poffins.*/,
  `soil_dryness` int /*The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BerryDetailBerryFlavorMap` generated from model 'BerryDetailBerryFlavorMap'

CREATE TABLE IF NOT EXISTS `BerryDetailBerryFlavorMap` (
  `berryDetail` long NOT NULL
  `berryFlavorMap` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFirmnessDetail` generated from model 'berryFirmnessDetail'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BerryFirmnessDetailBerrySummary` generated from model 'BerryFirmnessDetailBerrySummary'

CREATE TABLE IF NOT EXISTS `BerryFirmnessDetailBerrySummary` (
  `berryFirmnessDetail` long NOT NULL
  `berrySummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BerryFirmnessDetailBerryFirmnessName` generated from model 'BerryFirmnessDetailBerryFirmnessName'

CREATE TABLE IF NOT EXISTS `BerryFirmnessDetailBerryFirmnessName` (
  `berryFirmnessDetail` long NOT NULL
  `berryFirmnessName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFirmnessName` generated from model 'berryFirmnessName'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFirmnessSummary` generated from model 'berryFirmnessSummary'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorBerryMap` generated from model 'berryFlavorBerryMap'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorBerryMap` (
  `potency` int NOT NULL /*How powerful the referenced flavor is for this berry.*/,
  `berry` long NOT NULL /*The berry with the referenced flavor.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorDetail` generated from model 'berryFlavorDetail'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `contest_type` long NOT NULL /*The contest type that correlates with this berry flavor.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorDetailBerryFlavorBerryMap` generated from model 'BerryFlavorDetailBerryFlavorBerryMap'

CREATE TABLE IF NOT EXISTS `BerryFlavorDetailBerryFlavorBerryMap` (
  `berryFlavorDetail` long NOT NULL
  `berryFlavorBerryMap` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorDetailBerryFlavorName` generated from model 'BerryFlavorDetailBerryFlavorName'

CREATE TABLE IF NOT EXISTS `BerryFlavorDetailBerryFlavorName` (
  `berryFlavorDetail` long NOT NULL
  `berryFlavorName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorMap` generated from model 'berryFlavorMap'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorMap` (
  `potency` int NOT NULL /*How powerful the referenced flavor is for this berry.*/,
  `flavor` long NOT NULL /*The referenced berry flavor.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorName` generated from model 'berryFlavorName'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorSummary` generated from model 'berryFlavorSummary'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerrySummary` generated from model 'berrySummary'
--

CREATE TABLE IF NOT EXISTS `BerrySummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CharacteristicDescription` generated from model 'characteristicDescription'
--

CREATE TABLE IF NOT EXISTS `CharacteristicDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CharacteristicDetail` generated from model 'characteristicDetail'
--

CREATE TABLE IF NOT EXISTS `CharacteristicDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `gene_modulo` int NOT NULL /*The remainder of the highest stat/IV divided by 5.*/,
  `highest_stat` long NOT NULL /*The stat which results in this characteristic.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CharacteristicDetailPossibleValues` generated from model 'CharacteristicDetailPossibleValues'

CREATE TABLE IF NOT EXISTS `CharacteristicDetailPossibleValues` (
  `characteristicDetail` long NOT NULL
  `possibleValues` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `CharacteristicDetailCharacteristicDescription` generated from model 'CharacteristicDetailCharacteristicDescription'

CREATE TABLE IF NOT EXISTS `CharacteristicDetailCharacteristicDescription` (
  `characteristicDetail` long NOT NULL
  `characteristicDescription` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CharacteristicSummary` generated from model 'characteristicSummary'
--

CREATE TABLE IF NOT EXISTS `CharacteristicSummary` (
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectDetail` generated from model 'contestEffectDetail'
--

CREATE TABLE IF NOT EXISTS `ContestEffectDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `appeal` int NOT NULL /*The base number of hearts the user of this move gets.*/,
  `jam` int NOT NULL /*The base number of hearts the user&#39;s opponent loses.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectDetailContestEffectEffectText` generated from model 'ContestEffectDetailContestEffectEffectText'

CREATE TABLE IF NOT EXISTS `ContestEffectDetailContestEffectEffectText` (
  `contestEffectDetail` long NOT NULL
  `contestEffectEffectText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectDetailContestEffectFlavorText` generated from model 'ContestEffectDetailContestEffectFlavorText'

CREATE TABLE IF NOT EXISTS `ContestEffectDetailContestEffectFlavorText` (
  `contestEffectDetail` long NOT NULL
  `contestEffectFlavorText` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectEffectText` generated from model 'contestEffectEffectText'
--

CREATE TABLE IF NOT EXISTS `ContestEffectEffectText` (
  `effect` text NOT NULL /*The localized effect text for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this effect is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectFlavorText` generated from model 'contestEffectFlavorText'
--

CREATE TABLE IF NOT EXISTS `ContestEffectFlavorText` (
  `flavor_text` text NOT NULL /*The localized flavor text for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectSummary` generated from model 'contestEffectSummary'
--

CREATE TABLE IF NOT EXISTS `ContestEffectSummary` (
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestTypeDetail` generated from model 'contestTypeDetail'
--

CREATE TABLE IF NOT EXISTS `ContestTypeDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `berry_flavor` long NOT NULL /*The berry flavor that correlates with this contest type.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ContestTypeDetailContestTypeName` generated from model 'ContestTypeDetailContestTypeName'

CREATE TABLE IF NOT EXISTS `ContestTypeDetailContestTypeName` (
  `contestTypeDetail` long NOT NULL
  `contestTypeName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ContestTypeName` generated from model 'contestTypeName'
--

CREATE TABLE IF NOT EXISTS `ContestTypeName` (
  `name` text NOT NULL /*The name for this contest.*/,
  `color` text NOT NULL /*The color associated with this contest&#39;s name.*/,
  `language` long NOT NULL /*The language that this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestTypeSummary` generated from model 'contestTypeSummary'
--

CREATE TABLE IF NOT EXISTS `ContestTypeSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CurrencyDetail` generated from model 'currencyDetail'
--

CREATE TABLE IF NOT EXISTS `CurrencyDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `CurrencyDetailCurrencyName` generated from model 'CurrencyDetailCurrencyName'

CREATE TABLE IF NOT EXISTS `CurrencyDetailCurrencyName` (
  `currencyDetail` long NOT NULL
  `currencyName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `CurrencyName` generated from model 'currencyName'
--

CREATE TABLE IF NOT EXISTS `CurrencyName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CurrencySummary` generated from model 'currencySummary'
--

CREATE TABLE IF NOT EXISTS `CurrencySummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupDetail` generated from model 'eggGroupDetail'
--

CREATE TABLE IF NOT EXISTS `EggGroupDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupDetailEggGroupName` generated from model 'EggGroupDetailEggGroupName'

CREATE TABLE IF NOT EXISTS `EggGroupDetailEggGroupName` (
  `eggGroupDetail` long NOT NULL
  `eggGroupName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupDetailPokemonSpeciesSummary` generated from model 'EggGroupDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `EggGroupDetailPokemonSpeciesSummary` (
  `eggGroupDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupName` generated from model 'eggGroupName'
--

CREATE TABLE IF NOT EXISTS `EggGroupName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupSummary` generated from model 'eggGroupSummary'
--

CREATE TABLE IF NOT EXISTS `EggGroupSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionDetail` generated from model 'encounterConditionDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionDetailEncounterConditionValueSummary` generated from model 'EncounterConditionDetailEncounterConditionValueSummary'

CREATE TABLE IF NOT EXISTS `EncounterConditionDetailEncounterConditionValueSummary` (
  `encounterConditionDetail` long NOT NULL
  `encounterConditionValueSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionDetailEncounterConditionName` generated from model 'EncounterConditionDetailEncounterConditionName'

CREATE TABLE IF NOT EXISTS `EncounterConditionDetailEncounterConditionName` (
  `encounterConditionDetail` long NOT NULL
  `encounterConditionName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionName` generated from model 'encounterConditionName'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionSummary` generated from model 'encounterConditionSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionValueDetail` generated from model 'encounterConditionValueDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `condition` long NOT NULL /*The condition this encounter condition value pertains to.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionValueDetailEncounterConditionValueName` generated from model 'EncounterConditionValueDetailEncounterConditionValueName'

CREATE TABLE IF NOT EXISTS `EncounterConditionValueDetailEncounterConditionValueName` (
  `encounterConditionValueDetail` long NOT NULL
  `encounterConditionValueName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionValueName` generated from model 'encounterConditionValueName'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionValueSummary` generated from model 'encounterConditionValueSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterMethodDetail` generated from model 'encounterMethodDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `order` int /*A good value for sorting.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EncounterMethodDetailEncounterMethodName` generated from model 'EncounterMethodDetailEncounterMethodName'

CREATE TABLE IF NOT EXISTS `EncounterMethodDetailEncounterMethodName` (
  `encounterMethodDetail` long NOT NULL
  `encounterMethodName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterMethodName` generated from model 'encounterMethodName'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterMethodSummary` generated from model 'encounterMethodSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterPokemonDetail` generated from model 'encounterPokemonDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterPokemonDetail` (
  `min_perfect_ivs` int /*The minimum number of perfect IVs, or null if unspecified.*/,
  `always_shiny` boolean /*Whether the encountered Pokémon is always shiny.*/,
  `never_shiny` boolean /*Whether the encountered Pokémon can never be shiny.*/,
  `is_alpha` boolean /*Whether the encountered Pokémon is an alpha Pokémon.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetail` generated from model 'evolutionChainDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `baby_trigger_item` long NOT NULL /*The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.*/,
  `chain` long NOT NULL /*The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainLink` generated from model 'evolutionChainLink'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainLink` (
  `is_baby` boolean NOT NULL /*Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.*/,
  `species` long NOT NULL /*The Pokémon species at this point in the evolution chain.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainLinkPokemonEvolution` generated from model 'EvolutionChainLinkPokemonEvolution'

CREATE TABLE IF NOT EXISTS `EvolutionChainLinkPokemonEvolution` (
  `evolutionChainLink` long NOT NULL
  `pokemonEvolution` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainLinkEvolutionChainLink` generated from model 'EvolutionChainLinkEvolutionChainLink'

CREATE TABLE IF NOT EXISTS `EvolutionChainLinkEvolutionChainLink` (
  `evolutionChainLink` long NOT NULL
  `evolutionChainLink` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainSummary` generated from model 'evolutionChainSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainSummary` (
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionConditionExpression` generated from model 'evolutionConditionExpression'
--

CREATE TABLE IF NOT EXISTS `EvolutionConditionExpression` (
  `expression` text NOT NULL /*Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)*/,
  `percentage_chance` double NOT NULL /*Percentage chance of evolution under this condition (0-100)*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionConditionExpressionEvolutionVariableSummary` generated from model 'EvolutionConditionExpressionEvolutionVariableSummary'

CREATE TABLE IF NOT EXISTS `EvolutionConditionExpressionEvolutionVariableSummary` (
  `evolutionConditionExpression` long NOT NULL
  `evolutionVariableSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerDetail` generated from model 'evolutionTriggerDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerDetailEvolutionTriggerName` generated from model 'EvolutionTriggerDetailEvolutionTriggerName'

CREATE TABLE IF NOT EXISTS `EvolutionTriggerDetailEvolutionTriggerName` (
  `evolutionTriggerDetail` long NOT NULL
  `evolutionTriggerName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerDetailPokemonSpeciesSummary` generated from model 'EvolutionTriggerDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `EvolutionTriggerDetailPokemonSpeciesSummary` (
  `evolutionTriggerDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerName` generated from model 'evolutionTriggerName'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerSummary` generated from model 'evolutionTriggerSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionVariableDescription` generated from model 'evolutionVariableDescription'
--

CREATE TABLE IF NOT EXISTS `EvolutionVariableDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionVariableDetail` generated from model 'evolutionVariableDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionVariableDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `symbol` text NOT NULL /*The symbol used for this variable in evolution condition expressions.*/,
  `version_group` long NOT NULL /*The version group in which this variable was introduced.*/,
  `data_type` text /*The data type of this variable.*/,
  `source` text /*The source of the variable value.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionVariableDetailEvolutionVariableName` generated from model 'EvolutionVariableDetailEvolutionVariableName'

CREATE TABLE IF NOT EXISTS `EvolutionVariableDetailEvolutionVariableName` (
  `evolutionVariableDetail` long NOT NULL
  `evolutionVariableName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionVariableDetailEvolutionVariableDescription` generated from model 'EvolutionVariableDetailEvolutionVariableDescription'

CREATE TABLE IF NOT EXISTS `EvolutionVariableDetailEvolutionVariableDescription` (
  `evolutionVariableDetail` long NOT NULL
  `evolutionVariableDescription` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionVariableName` generated from model 'evolutionVariableName'
--

CREATE TABLE IF NOT EXISTS `EvolutionVariableName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionVariableSummary` generated from model 'evolutionVariableSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionVariableSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Experience` generated from model 'experience'
--

CREATE TABLE IF NOT EXISTS `Experience` (
  `level` int NOT NULL /*The level gained.*/,
  `experience` int NOT NULL /*The amount of experience required to reach the referenced level.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenderDetail` generated from model 'genderDetail'
--

CREATE TABLE IF NOT EXISTS `GenderDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GenderDetailGenderPokemonSpecies` generated from model 'GenderDetailGenderPokemonSpecies'

CREATE TABLE IF NOT EXISTS `GenderDetailGenderPokemonSpecies` (
  `genderDetail` long NOT NULL
  `genderPokemonSpecies` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenderDetailPokemonSpeciesSummary` generated from model 'GenderDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `GenderDetailPokemonSpeciesSummary` (
  `genderDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GenderPokemonSpecies` generated from model 'genderPokemonSpecies'
--

CREATE TABLE IF NOT EXISTS `GenderPokemonSpecies` (
  `rate` int NOT NULL /*The chance of this Pokémon being female, in eighths; or -1 for genderless.*/,
  `pokemon_species` long NOT NULL /*A Pokémon species that can be the referenced gender.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenderSummary` generated from model 'genderSummary'
--

CREATE TABLE IF NOT EXISTS `GenderSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenerationDetail` generated from model 'generationDetail'
--

CREATE TABLE IF NOT EXISTS `GenerationDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `main_region` long NOT NULL /*The main region travelled in this generation.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GenerationDetailAbilitySummary` generated from model 'GenerationDetailAbilitySummary'

CREATE TABLE IF NOT EXISTS `GenerationDetailAbilitySummary` (
  `generationDetail` long NOT NULL
  `abilitySummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerationDetailMoveSummary` generated from model 'GenerationDetailMoveSummary'

CREATE TABLE IF NOT EXISTS `GenerationDetailMoveSummary` (
  `generationDetail` long NOT NULL
  `moveSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerationDetailGenerationName` generated from model 'GenerationDetailGenerationName'

CREATE TABLE IF NOT EXISTS `GenerationDetailGenerationName` (
  `generationDetail` long NOT NULL
  `generationName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerationDetailPokemonSpeciesSummary` generated from model 'GenerationDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `GenerationDetailPokemonSpeciesSummary` (
  `generationDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerationDetailTypeSummary` generated from model 'GenerationDetailTypeSummary'

CREATE TABLE IF NOT EXISTS `GenerationDetailTypeSummary` (
  `generationDetail` long NOT NULL
  `typeSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenerationDetailVersionGroupSummary` generated from model 'GenerationDetailVersionGroupSummary'

CREATE TABLE IF NOT EXISTS `GenerationDetailVersionGroupSummary` (
  `generationDetail` long NOT NULL
  `versionGroupSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GenerationName` generated from model 'generationName'
--

CREATE TABLE IF NOT EXISTS `GenerationName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenerationSummary` generated from model 'generationSummary'
--

CREATE TABLE IF NOT EXISTS `GenerationSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GrowthRateDescription` generated from model 'growthRateDescription'
--

CREATE TABLE IF NOT EXISTS `GrowthRateDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GrowthRateDetail` generated from model 'growthRateDetail'
--

CREATE TABLE IF NOT EXISTS `GrowthRateDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `formula` text NOT NULL /*The formula used to calculate the rate at which the Pokémon species gains level.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GrowthRateDetailGrowthRateDescription` generated from model 'GrowthRateDetailGrowthRateDescription'

CREATE TABLE IF NOT EXISTS `GrowthRateDetailGrowthRateDescription` (
  `growthRateDetail` long NOT NULL
  `growthRateDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GrowthRateDetailExperience` generated from model 'GrowthRateDetailExperience'

CREATE TABLE IF NOT EXISTS `GrowthRateDetailExperience` (
  `growthRateDetail` long NOT NULL
  `experience` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GrowthRateDetailPokemonSpeciesSummary` generated from model 'GrowthRateDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `GrowthRateDetailPokemonSpeciesSummary` (
  `growthRateDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GrowthRateSummary` generated from model 'growthRateSummary'
--

CREATE TABLE IF NOT EXISTS `GrowthRateSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDescription` generated from model 'itemAttributeDescription'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDetail` generated from model 'itemAttributeDetail'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDetailItemAttributeDescription` generated from model 'ItemAttributeDetailItemAttributeDescription'

CREATE TABLE IF NOT EXISTS `ItemAttributeDetailItemAttributeDescription` (
  `itemAttributeDetail` long NOT NULL
  `itemAttributeDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDetailItemSummary` generated from model 'ItemAttributeDetailItemSummary'

CREATE TABLE IF NOT EXISTS `ItemAttributeDetailItemSummary` (
  `itemAttributeDetail` long NOT NULL
  `itemSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDetailItemAttributeName` generated from model 'ItemAttributeDetailItemAttributeName'

CREATE TABLE IF NOT EXISTS `ItemAttributeDetailItemAttributeName` (
  `itemAttributeDetail` long NOT NULL
  `itemAttributeName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeName` generated from model 'itemAttributeName'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeSummary` generated from model 'itemAttributeSummary'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemCategoryDetail` generated from model 'itemCategoryDetail'
--

CREATE TABLE IF NOT EXISTS `ItemCategoryDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `pocket` long NOT NULL /*The pocket items in this category would be put in.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemCategoryDetailItemSummary` generated from model 'ItemCategoryDetailItemSummary'

CREATE TABLE IF NOT EXISTS `ItemCategoryDetailItemSummary` (
  `itemCategoryDetail` long NOT NULL
  `itemSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemCategoryDetailItemCategoryName` generated from model 'ItemCategoryDetailItemCategoryName'

CREATE TABLE IF NOT EXISTS `ItemCategoryDetailItemCategoryName` (
  `itemCategoryDetail` long NOT NULL
  `itemCategoryName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemCategoryName` generated from model 'itemCategoryName'
--

CREATE TABLE IF NOT EXISTS `ItemCategoryName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemCategorySummary` generated from model 'itemCategorySummary'
--

CREATE TABLE IF NOT EXISTS `ItemCategorySummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetail` generated from model 'itemDetail'
--

CREATE TABLE IF NOT EXISTS `ItemDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `fling_effect` long NOT NULL /*The effect of the move Fling when used with this item.*/,
  `category` long NOT NULL /*The category of items this item falls into.*/,
  `sprites` long NOT NULL /*A set of sprites used to depict this item in the game.*/,
  `baby_trigger_for` long NOT NULL /*An evolution chain this item requires to produce a bay during mating.*/,
  `fling_power` int /*The power of the move Fling when used with this item.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemAttributeSummary` generated from model 'ItemDetailItemAttributeSummary'

CREATE TABLE IF NOT EXISTS `ItemDetailItemAttributeSummary` (
  `itemDetail` long NOT NULL
  `itemAttributeSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemEffectText` generated from model 'ItemDetailItemEffectText'

CREATE TABLE IF NOT EXISTS `ItemDetailItemEffectText` (
  `itemDetail` long NOT NULL
  `itemEffectText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemFlavorText` generated from model 'ItemDetailItemFlavorText'

CREATE TABLE IF NOT EXISTS `ItemDetailItemFlavorText` (
  `itemDetail` long NOT NULL
  `itemFlavorText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemGameIndex` generated from model 'ItemDetailItemGameIndex'

CREATE TABLE IF NOT EXISTS `ItemDetailItemGameIndex` (
  `itemDetail` long NOT NULL
  `itemGameIndex` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemPrice` generated from model 'ItemDetailItemPrice'

CREATE TABLE IF NOT EXISTS `ItemDetailItemPrice` (
  `itemDetail` long NOT NULL
  `itemPrice` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemName` generated from model 'ItemDetailItemName'

CREATE TABLE IF NOT EXISTS `ItemDetailItemName` (
  `itemDetail` long NOT NULL
  `itemName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailPokemonHeldItem` generated from model 'ItemDetailPokemonHeldItem'

CREATE TABLE IF NOT EXISTS `ItemDetailPokemonHeldItem` (
  `itemDetail` long NOT NULL
  `pokemonHeldItem` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemMachine` generated from model 'ItemDetailItemMachine'

CREATE TABLE IF NOT EXISTS `ItemDetailItemMachine` (
  `itemDetail` long NOT NULL
  `itemMachine` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemEffectText` generated from model 'itemEffectText'
--

CREATE TABLE IF NOT EXISTS `ItemEffectText` (
  `effect` text NOT NULL /*The localized effect text for an API resource in a specific language.*/,
  `short_effect` text NOT NULL /*The localized effect text in brief.*/,
  `language` long NOT NULL /*The language this effect is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlavorText` generated from model 'itemFlavorText'
--

CREATE TABLE IF NOT EXISTS `ItemFlavorText` (
  `text` text NOT NULL /*The localized flavor text for an API resource in a specific language.*/,
  `version_group` long NOT NULL /*The version group which uses this flavor text.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlingEffectDetail` generated from model 'itemFlingEffectDetail'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlingEffectDetailItemFlingEffectEffectText` generated from model 'ItemFlingEffectDetailItemFlingEffectEffectText'

CREATE TABLE IF NOT EXISTS `ItemFlingEffectDetailItemFlingEffectEffectText` (
  `itemFlingEffectDetail` long NOT NULL
  `itemFlingEffectEffectText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlingEffectDetailItemSummary` generated from model 'ItemFlingEffectDetailItemSummary'

CREATE TABLE IF NOT EXISTS `ItemFlingEffectDetailItemSummary` (
  `itemFlingEffectDetail` long NOT NULL
  `itemSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlingEffectEffectText` generated from model 'itemFlingEffectEffectText'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectEffectText` (
  `effect` text NOT NULL /*The localized effect text for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this effect is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlingEffectSummary` generated from model 'itemFlingEffectSummary'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemGameIndex` generated from model 'itemGameIndex'
--

CREATE TABLE IF NOT EXISTS `ItemGameIndex` (
  `game_index` int NOT NULL /*The internal id of an API resource within game data.*/,
  `generation` long NOT NULL /*The generation relevent to this game index.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemMachine` generated from model 'itemMachine'
--

CREATE TABLE IF NOT EXISTS `ItemMachine` (
  `machine` long NOT NULL /*The machine that teaches a move from an item.*/,
  `version_group` long NOT NULL /*The version group of this specific machine.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemName` generated from model 'itemName'
--

CREATE TABLE IF NOT EXISTS `ItemName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemPocketDetail` generated from model 'itemPocketDetail'
--

CREATE TABLE IF NOT EXISTS `ItemPocketDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemPocketDetailItemCategorySummary` generated from model 'ItemPocketDetailItemCategorySummary'

CREATE TABLE IF NOT EXISTS `ItemPocketDetailItemCategorySummary` (
  `itemPocketDetail` long NOT NULL
  `itemCategorySummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemPocketDetailItemPocketName` generated from model 'ItemPocketDetailItemPocketName'

CREATE TABLE IF NOT EXISTS `ItemPocketDetailItemPocketName` (
  `itemPocketDetail` long NOT NULL
  `itemPocketName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemPocketName` generated from model 'itemPocketName'
--

CREATE TABLE IF NOT EXISTS `ItemPocketName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemPocketSummary` generated from model 'itemPocketSummary'
--

CREATE TABLE IF NOT EXISTS `ItemPocketSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemPrice` generated from model 'itemPrice'
--

CREATE TABLE IF NOT EXISTS `ItemPrice` (
  `currency` long NOT NULL /*The currency used for this price.*/,
  `version_group` long NOT NULL /*The version group to which this price applies.*/,
  `purchase_price` int /*The purchase price in this currency and version group, or null if unavailable.*/,
  `sell_price` int /*The sell price in this currency and version group, or null if unavailable.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemSprites` generated from model 'itemSprites'
--

CREATE TABLE IF NOT EXISTS `ItemSprites` (
  `default` text NOT NULL /*The default depiction of this item.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemSummary` generated from model 'itemSummary'
--

CREATE TABLE IF NOT EXISTS `ItemSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LanguageDetail` generated from model 'languageDetail'
--

CREATE TABLE IF NOT EXISTS `LanguageDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `iso639` text NOT NULL /*The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.*/,
  `iso3166` text NOT NULL /*The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.*/,
  `official` boolean /*Whether or not the games are published in this language.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LanguageDetailLanguageName` generated from model 'LanguageDetailLanguageName'

CREATE TABLE IF NOT EXISTS `LanguageDetailLanguageName` (
  `languageDetail` long NOT NULL
  `languageName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LanguageName` generated from model 'languageName'
--

CREATE TABLE IF NOT EXISTS `LanguageName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LanguageSummary` generated from model 'languageSummary'
--

CREATE TABLE IF NOT EXISTS `LanguageSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetail` generated from model 'locationAreaDetail'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `game_index` int NOT NULL /*The internal id of an API resource within game data.*/,
  `location` long NOT NULL /*The region this location area can be found in.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetailLocationAreaEncounterRate` generated from model 'LocationAreaDetailLocationAreaEncounterRate'

CREATE TABLE IF NOT EXISTS `LocationAreaDetailLocationAreaEncounterRate` (
  `locationAreaDetail` long NOT NULL
  `locationAreaEncounterRate` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetailLocationAreaName` generated from model 'LocationAreaDetailLocationAreaName'

CREATE TABLE IF NOT EXISTS `LocationAreaDetailLocationAreaName` (
  `locationAreaDetail` long NOT NULL
  `locationAreaName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetailLocationAreaPokemonEncounter` generated from model 'LocationAreaDetailLocationAreaPokemonEncounter'

CREATE TABLE IF NOT EXISTS `LocationAreaDetailLocationAreaPokemonEncounter` (
  `locationAreaDetail` long NOT NULL
  `locationAreaPokemonEncounter` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaEncounterDetail` generated from model 'locationAreaEncounterDetail'
--

CREATE TABLE IF NOT EXISTS `LocationAreaEncounterDetail` (
  `min_level` int NOT NULL /*The lowest level the Pokémon could be encountered at.*/,
  `max_level` int NOT NULL /*The highest level the Pokémon could be encountered at.*/,
  `pokemon_details` long NOT NULL /*Additional properties of the encountered Pokémon, or null if unspecified.*/,
  `chance` int /*Percent chance that this encounter will occur.*/,
  `method` long /*The method by which this encounter happens.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaEncounterDetailEncounterConditionValueSummary` generated from model 'LocationAreaEncounterDetailEncounterConditionValueSummary'

CREATE TABLE IF NOT EXISTS `LocationAreaEncounterDetailEncounterConditionValueSummary` (
  `locationAreaEncounterDetail` long NOT NULL
  `encounterConditionValueSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaEncounterRate` generated from model 'locationAreaEncounterRate'
--

CREATE TABLE IF NOT EXISTS `LocationAreaEncounterRate` (
  `encounter_method` long NOT NULL /*The method in which Pokémon may be encountered in an area..*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaEncounterRateLocationAreaEncounterVersionDetail` generated from model 'LocationAreaEncounterRateLocationAreaEncounterVersionDetail'

CREATE TABLE IF NOT EXISTS `LocationAreaEncounterRateLocationAreaEncounterVersionDetail` (
  `locationAreaEncounterRate` long NOT NULL
  `locationAreaEncounterVersionDetail` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaEncounterVersionDetail` generated from model 'locationAreaEncounterVersionDetail'
--

CREATE TABLE IF NOT EXISTS `LocationAreaEncounterVersionDetail` (
  `rate` int NOT NULL /*The chance of an encounter to occur.*/,
  `version` long NOT NULL /*The version of the game in which the encounter can occur with the given chance.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaName` generated from model 'locationAreaName'
--

CREATE TABLE IF NOT EXISTS `LocationAreaName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaPokemonEncounter` generated from model 'locationAreaPokemonEncounter'
--

CREATE TABLE IF NOT EXISTS `LocationAreaPokemonEncounter` (
  `pokemon` long NOT NULL /*The Pokémon being encountered.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaPokemonEncounterLocationAreaPokemonEncounterVersion` generated from model 'LocationAreaPokemonEncounterLocationAreaPokemonEncounterVersion'

CREATE TABLE IF NOT EXISTS `LocationAreaPokemonEncounterLocationAreaPokemonEncounterVersion` (
  `locationAreaPokemonEncounter` long NOT NULL
  `locationAreaPokemonEncounterVersion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaPokemonEncounterVersion` generated from model 'locationAreaPokemonEncounterVersion'
--

CREATE TABLE IF NOT EXISTS `LocationAreaPokemonEncounterVersion` (
  `version` long NOT NULL /*The game version this encounter happens in.*/,
  `max_chance` int NOT NULL /*The total percentage of all encounter potential.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaPokemonEncounterVersionLocationAreaEncounterDetail` generated from model 'LocationAreaPokemonEncounterVersionLocationAreaEncounterDetail'

CREATE TABLE IF NOT EXISTS `LocationAreaPokemonEncounterVersionLocationAreaEncounterDetail` (
  `locationAreaPokemonEncounterVersion` long NOT NULL
  `locationAreaEncounterDetail` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaSummary` generated from model 'locationAreaSummary'
--

CREATE TABLE IF NOT EXISTS `LocationAreaSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationDetail` generated from model 'locationDetail'
--

CREATE TABLE IF NOT EXISTS `LocationDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `region` long NOT NULL /*The region this location can be found in.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationDetailLocationName` generated from model 'LocationDetailLocationName'

CREATE TABLE IF NOT EXISTS `LocationDetailLocationName` (
  `locationDetail` long NOT NULL
  `locationName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LocationDetailLocationGameIndex` generated from model 'LocationDetailLocationGameIndex'

CREATE TABLE IF NOT EXISTS `LocationDetailLocationGameIndex` (
  `locationDetail` long NOT NULL
  `locationGameIndex` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LocationDetailLocationAreaSummary` generated from model 'LocationDetailLocationAreaSummary'

CREATE TABLE IF NOT EXISTS `LocationDetailLocationAreaSummary` (
  `locationDetail` long NOT NULL
  `locationAreaSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationGameIndex` generated from model 'locationGameIndex'
--

CREATE TABLE IF NOT EXISTS `LocationGameIndex` (
  `game_index` int NOT NULL /*The internal id of an API resource within game data.*/,
  `generation` long NOT NULL /*The generation relevent to this game index.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationName` generated from model 'locationName'
--

CREATE TABLE IF NOT EXISTS `LocationName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationSummary` generated from model 'locationSummary'
--

CREATE TABLE IF NOT EXISTS `LocationSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MachineDetail` generated from model 'machineDetail'
--

CREATE TABLE IF NOT EXISTS `MachineDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `item` long NOT NULL /*The TM or HM item that corresponds to this machine.*/,
  `version_group` long NOT NULL /*The version group that this machine applies to.*/,
  `move` long NOT NULL /*The move that is taught by this machine.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MachineSummary` generated from model 'machineSummary'
--

CREATE TABLE IF NOT EXISTS `MachineSummary` (
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveBattleStyleDetail` generated from model 'moveBattleStyleDetail'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveBattleStyleDetailMoveBattleStyleName` generated from model 'MoveBattleStyleDetailMoveBattleStyleName'

CREATE TABLE IF NOT EXISTS `MoveBattleStyleDetailMoveBattleStyleName` (
  `moveBattleStyleDetail` long NOT NULL
  `moveBattleStyleName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveBattleStyleName` generated from model 'moveBattleStyleName'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveBattleStyleSummary` generated from model 'moveBattleStyleSummary'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveChange` generated from model 'moveChange'
--

CREATE TABLE IF NOT EXISTS `MoveChange` (
  `effect_chance` int NOT NULL /*The percent value of how likely it is this moves effect will take effect.*/,
  `type` long NOT NULL /*The elemental type of this move.*/,
  `version_group` long NOT NULL /*The version group in which these move stat values were in effect.*/,
  `accuracy` int /*The percent value of how likely this move is to be successful.*/,
  `power` int /*The base power before the listed version group, or null if power did not change.*/,
  `pp` int /*Power points. The number of times this move can be used.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveChangeMoveEffectEffectText` generated from model 'MoveChangeMoveEffectEffectText'

CREATE TABLE IF NOT EXISTS `MoveChangeMoveEffectEffectText` (
  `moveChange` long NOT NULL
  `moveEffectEffectText` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveComboUsage` generated from model 'moveComboUsage'
--

CREATE TABLE IF NOT EXISTS `MoveComboUsage` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveComboUsageMoveSummary` generated from model 'MoveComboUsageMoveSummary'

CREATE TABLE IF NOT EXISTS `MoveComboUsageMoveSummary` (
  `moveComboUsage` long NOT NULL
  `moveSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveComboUsageMoveSummary` generated from model 'MoveComboUsageMoveSummary'

CREATE TABLE IF NOT EXISTS `MoveComboUsageMoveSummary` (
  `moveComboUsage` long NOT NULL
  `moveSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveCombos` generated from model 'moveCombos'
--

CREATE TABLE IF NOT EXISTS `MoveCombos` (
  `normal` long NOT NULL /*A detail of moves this move can be used before or after, granting additional appeal points in contests.*/,
  `super` long NOT NULL /*A detail of moves this move can be used before or after, granting additional appeal points in super contests.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassDescription` generated from model 'moveDamageClassDescription'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassDetail` generated from model 'moveDamageClassDetail'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassDetailMoveDamageClassDescription` generated from model 'MoveDamageClassDetailMoveDamageClassDescription'

CREATE TABLE IF NOT EXISTS `MoveDamageClassDetailMoveDamageClassDescription` (
  `moveDamageClassDetail` long NOT NULL
  `moveDamageClassDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassDetailMoveSummary` generated from model 'MoveDamageClassDetailMoveSummary'

CREATE TABLE IF NOT EXISTS `MoveDamageClassDetailMoveSummary` (
  `moveDamageClassDetail` long NOT NULL
  `moveSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassDetailMoveDamageClassName` generated from model 'MoveDamageClassDetailMoveDamageClassName'

CREATE TABLE IF NOT EXISTS `MoveDamageClassDetailMoveDamageClassName` (
  `moveDamageClassDetail` long NOT NULL
  `moveDamageClassName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassName` generated from model 'moveDamageClassName'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassSummary` generated from model 'moveDamageClassSummary'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail` generated from model 'moveDetail'
--

CREATE TABLE IF NOT EXISTS `MoveDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `effect_chance` int NOT NULL /*The percent value of how likely it is this moves effect will happen.*/,
  `contest_combos` long NOT NULL /*A detail of normal and super contest combos that require this move.*/,
  `contest_type` long NOT NULL /*The type of appeal this move gives a Pokémon when used in a contest.*/,
  `contest_effect` long NOT NULL /*The effect the move has when used in a contest.*/,
  `damage_class` long NOT NULL /*The type of damage the move inflicts on the target, e.g. physical.*/,
  `generation` long NOT NULL /*The generation in which this move was introduced.*/,
  `meta` long NOT NULL /*Metadata about this move*/,
  `super_contest_effect` long NOT NULL /*The effect the move has when used in a super contest.*/,
  `target` long NOT NULL /*The type of target that will receive the effects of the attack.*/,
  `type` long NOT NULL /*The elemental type of this move.*/,
  `accuracy` int /*The percent value of how likely this move is to be successful.*/,
  `pp` int /*Power points. The number of times this move can be used.*/,
  `priority` int /*A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.*/,
  `power` int /*The base power of this move, or null if it has no fixed base power.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveEffectEffectText` generated from model 'MoveDetailMoveEffectEffectText'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveEffectEffectText` (
  `moveDetail` long NOT NULL
  `moveEffectEffectText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveEffectChange` generated from model 'MoveDetailMoveEffectChange'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveEffectChange` (
  `moveDetail` long NOT NULL
  `moveEffectChange` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveName` generated from model 'MoveDetailMoveName'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveName` (
  `moveDetail` long NOT NULL
  `moveName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveChange` generated from model 'MoveDetailMoveChange'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveChange` (
  `moveDetail` long NOT NULL
  `moveChange` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveMetaStatChange` generated from model 'MoveDetailMoveMetaStatChange'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveMetaStatChange` (
  `moveDetail` long NOT NULL
  `moveMetaStatChange` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailItemMachine` generated from model 'MoveDetailItemMachine'

CREATE TABLE IF NOT EXISTS `MoveDetailItemMachine` (
  `moveDetail` long NOT NULL
  `itemMachine` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveFlavorText` generated from model 'MoveDetailMoveFlavorText'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveFlavorText` (
  `moveDetail` long NOT NULL
  `moveFlavorText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailPokemonSummary` generated from model 'MoveDetailPokemonSummary'

CREATE TABLE IF NOT EXISTS `MoveDetailPokemonSummary` (
  `moveDetail` long NOT NULL
  `pokemonSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveEffectChange` generated from model 'moveEffectChange'
--

CREATE TABLE IF NOT EXISTS `MoveEffectChange` (
  `version_group` long NOT NULL /*The version group in which the previous effect of this ability originated.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveEffectChangeMoveEffectChangeEffectText` generated from model 'MoveEffectChangeMoveEffectChangeEffectText'

CREATE TABLE IF NOT EXISTS `MoveEffectChangeMoveEffectChangeEffectText` (
  `moveEffectChange` long NOT NULL
  `moveEffectChangeEffectText` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveEffectChangeEffectText` generated from model 'moveEffectChangeEffectText'
--

CREATE TABLE IF NOT EXISTS `MoveEffectChangeEffectText` (
  `effect` text NOT NULL /*The localized effect text for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this effect is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveEffectEffectText` generated from model 'moveEffectEffectText'
--

CREATE TABLE IF NOT EXISTS `MoveEffectEffectText` (
  `effect` text NOT NULL /*The localized effect text for an API resource in a specific language.*/,
  `short_effect` text NOT NULL /*The localized effect text in brief.*/,
  `language` long NOT NULL /*The language this effect is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveFlavorText` generated from model 'moveFlavorText'
--

CREATE TABLE IF NOT EXISTS `MoveFlavorText` (
  `flavor_text` text NOT NULL /*The localized flavor text for an api resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/,
  `version_group` long NOT NULL /*The version group that uses this flavor text.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodDescription` generated from model 'moveLearnMethodDescription'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodDetail` generated from model 'moveLearnMethodDetail'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodDetailMoveLearnMethodName` generated from model 'MoveLearnMethodDetailMoveLearnMethodName'

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDetailMoveLearnMethodName` (
  `moveLearnMethodDetail` long NOT NULL
  `moveLearnMethodName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodDetailMoveLearnMethodDescription` generated from model 'MoveLearnMethodDetailMoveLearnMethodDescription'

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDetailMoveLearnMethodDescription` (
  `moveLearnMethodDetail` long NOT NULL
  `moveLearnMethodDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodDetailVersionGroupSummary` generated from model 'MoveLearnMethodDetailVersionGroupSummary'

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDetailVersionGroupSummary` (
  `moveLearnMethodDetail` long NOT NULL
  `versionGroupSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodName` generated from model 'moveLearnMethodName'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodSummary` generated from model 'moveLearnMethodSummary'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMeta` generated from model 'moveMeta'
--

CREATE TABLE IF NOT EXISTS `MoveMeta` (
  `ailment` long NOT NULL /*The status ailment this move inflicts on its target.*/,
  `category` long NOT NULL /*The category of move this move falls under, e.g. damage or ailment.*/,
  `min_hits` int /*The minimum number of times this move hits. Null if it always only hits once.*/,
  `max_hits` int /*The maximum number of times this move hits. Null if it always only hits once.*/,
  `min_turns` int /*The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.*/,
  `max_turns` int /*The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.*/,
  `drain` int /*HP drain (if positive) or Recoil damage (if negative), in percent of damage done.*/,
  `healing` int /*The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.*/,
  `crit_rate` int /*Critical hit rate bonus.*/,
  `ailment_chance` int /*The likelihood this attack will cause an ailment.*/,
  `flinch_chance` int /*The likelihood this attack will cause the target Pokémon to flinch.*/,
  `stat_chance` int /*The likelihood this attack will cause a stat change in the target Pokémon.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaAilmentDetail` generated from model 'moveMetaAilmentDetail'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaAilmentDetailMoveSummary` generated from model 'MoveMetaAilmentDetailMoveSummary'

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentDetailMoveSummary` (
  `moveMetaAilmentDetail` long NOT NULL
  `moveSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaAilmentDetailMoveMetaAilmentName` generated from model 'MoveMetaAilmentDetailMoveMetaAilmentName'

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentDetailMoveMetaAilmentName` (
  `moveMetaAilmentDetail` long NOT NULL
  `moveMetaAilmentName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaAilmentName` generated from model 'moveMetaAilmentName'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaAilmentSummary` generated from model 'moveMetaAilmentSummary'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategoryDescription` generated from model 'moveMetaCategoryDescription'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategoryDetail` generated from model 'moveMetaCategoryDetail'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategoryDetailMoveMetaCategoryDescription` generated from model 'MoveMetaCategoryDetailMoveMetaCategoryDescription'

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDetailMoveMetaCategoryDescription` (
  `moveMetaCategoryDetail` long NOT NULL
  `moveMetaCategoryDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategoryDetailMoveSummary` generated from model 'MoveMetaCategoryDetailMoveSummary'

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDetailMoveSummary` (
  `moveMetaCategoryDetail` long NOT NULL
  `moveSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategorySummary` generated from model 'moveMetaCategorySummary'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategorySummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaStatChange` generated from model 'moveMetaStatChange'
--

CREATE TABLE IF NOT EXISTS `MoveMetaStatChange` (
  `change` int NOT NULL /*The amount of change.*/,
  `stat` long NOT NULL /*The stat being affected.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveName` generated from model 'moveName'
--

CREATE TABLE IF NOT EXISTS `MoveName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveStatChange` generated from model 'moveStatChange'
--

CREATE TABLE IF NOT EXISTS `MoveStatChange` (
  `change` int NOT NULL /*The maximum amount of change to the referenced stat.*/,
  `move` long NOT NULL /*The move causing the change.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveSummary` generated from model 'moveSummary'
--

CREATE TABLE IF NOT EXISTS `MoveSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetDescription` generated from model 'moveTargetDescription'
--

CREATE TABLE IF NOT EXISTS `MoveTargetDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetDetail` generated from model 'moveTargetDetail'
--

CREATE TABLE IF NOT EXISTS `MoveTargetDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetDetailMoveTargetDescription` generated from model 'MoveTargetDetailMoveTargetDescription'

CREATE TABLE IF NOT EXISTS `MoveTargetDetailMoveTargetDescription` (
  `moveTargetDetail` long NOT NULL
  `moveTargetDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetDetailMoveSummary` generated from model 'MoveTargetDetailMoveSummary'

CREATE TABLE IF NOT EXISTS `MoveTargetDetailMoveSummary` (
  `moveTargetDetail` long NOT NULL
  `moveSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetDetailMoveTargetName` generated from model 'MoveTargetDetailMoveTargetName'

CREATE TABLE IF NOT EXISTS `MoveTargetDetailMoveTargetName` (
  `moveTargetDetail` long NOT NULL
  `moveTargetName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetName` generated from model 'moveTargetName'
--

CREATE TABLE IF NOT EXISTS `MoveTargetName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetSummary` generated from model 'moveTargetSummary'
--

CREATE TABLE IF NOT EXISTS `MoveTargetSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NatureBattleStylePreference` generated from model 'natureBattleStylePreference'
--

CREATE TABLE IF NOT EXISTS `NatureBattleStylePreference` (
  `low_hp_preference` int NOT NULL /*Chance of using the move, in percent, if HP is under one half.*/,
  `high_hp_preference` int NOT NULL /*Chance of using the move, in percent, if HP is over one half.*/,
  `move_battle_style` long NOT NULL /*The move battle style.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NatureDetail` generated from model 'natureDetail'
--

CREATE TABLE IF NOT EXISTS `NatureDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `decreased_stat` long NOT NULL /*The stat decreased by 10% in Pokémon with this nature.*/,
  `increased_stat` long NOT NULL /*The stat increased by 10% in Pokémon with this nature.*/,
  `likes_flavor` long NOT NULL /*The flavor liked by Pokémon with this nature.*/,
  `hates_flavor` long NOT NULL /*The flavor hated by Pokémon with this nature.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `NatureDetailNaturePokeathlonStat` generated from model 'NatureDetailNaturePokeathlonStat'

CREATE TABLE IF NOT EXISTS `NatureDetailNaturePokeathlonStat` (
  `natureDetail` long NOT NULL
  `naturePokeathlonStat` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `NatureDetailNatureBattleStylePreference` generated from model 'NatureDetailNatureBattleStylePreference'

CREATE TABLE IF NOT EXISTS `NatureDetailNatureBattleStylePreference` (
  `natureDetail` long NOT NULL
  `natureBattleStylePreference` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `NatureDetailNatureName` generated from model 'NatureDetailNatureName'

CREATE TABLE IF NOT EXISTS `NatureDetailNatureName` (
  `natureDetail` long NOT NULL
  `natureName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `NatureName` generated from model 'natureName'
--

CREATE TABLE IF NOT EXISTS `NatureName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NaturePokeathlonStat` generated from model 'naturePokeathlonStat'
--

CREATE TABLE IF NOT EXISTS `NaturePokeathlonStat` (
  `max_change` int NOT NULL /*The amount of change.*/,
  `pokeathlon_stat` long NOT NULL /*The stat being affected.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NatureSummary` generated from model 'natureSummary'
--

CREATE TABLE IF NOT EXISTS `NatureSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedAbilitySummaryList` generated from model 'paginatedAbilitySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedAbilitySummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedAbilitySummaryListAbilitySummary` generated from model 'PaginatedAbilitySummaryListAbilitySummary'

CREATE TABLE IF NOT EXISTS `PaginatedAbilitySummaryListAbilitySummary` (
  `paginatedAbilitySummaryList` long NOT NULL
  `abilitySummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedBerryFirmnessSummaryList` generated from model 'paginatedBerryFirmnessSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerryFirmnessSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedBerryFirmnessSummaryListBerryFirmnessSummary` generated from model 'PaginatedBerryFirmnessSummaryListBerryFirmnessSummary'

CREATE TABLE IF NOT EXISTS `PaginatedBerryFirmnessSummaryListBerryFirmnessSummary` (
  `paginatedBerryFirmnessSummaryList` long NOT NULL
  `berryFirmnessSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedBerryFlavorSummaryList` generated from model 'paginatedBerryFlavorSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerryFlavorSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedBerryFlavorSummaryListBerryFlavorSummary` generated from model 'PaginatedBerryFlavorSummaryListBerryFlavorSummary'

CREATE TABLE IF NOT EXISTS `PaginatedBerryFlavorSummaryListBerryFlavorSummary` (
  `paginatedBerryFlavorSummaryList` long NOT NULL
  `berryFlavorSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedBerrySummaryList` generated from model 'paginatedBerrySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedBerrySummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedBerrySummaryListBerrySummary` generated from model 'PaginatedBerrySummaryListBerrySummary'

CREATE TABLE IF NOT EXISTS `PaginatedBerrySummaryListBerrySummary` (
  `paginatedBerrySummaryList` long NOT NULL
  `berrySummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedCharacteristicSummaryList` generated from model 'paginatedCharacteristicSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedCharacteristicSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedCharacteristicSummaryListCharacteristicSummary` generated from model 'PaginatedCharacteristicSummaryListCharacteristicSummary'

CREATE TABLE IF NOT EXISTS `PaginatedCharacteristicSummaryListCharacteristicSummary` (
  `paginatedCharacteristicSummaryList` long NOT NULL
  `characteristicSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedContestEffectSummaryList` generated from model 'paginatedContestEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedContestEffectSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedContestEffectSummaryListContestEffectSummary` generated from model 'PaginatedContestEffectSummaryListContestEffectSummary'

CREATE TABLE IF NOT EXISTS `PaginatedContestEffectSummaryListContestEffectSummary` (
  `paginatedContestEffectSummaryList` long NOT NULL
  `contestEffectSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedContestTypeSummaryList` generated from model 'paginatedContestTypeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedContestTypeSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedContestTypeSummaryListContestTypeSummary` generated from model 'PaginatedContestTypeSummaryListContestTypeSummary'

CREATE TABLE IF NOT EXISTS `PaginatedContestTypeSummaryListContestTypeSummary` (
  `paginatedContestTypeSummaryList` long NOT NULL
  `contestTypeSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedCurrencySummaryList` generated from model 'paginatedCurrencySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedCurrencySummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedCurrencySummaryListCurrencySummary` generated from model 'PaginatedCurrencySummaryListCurrencySummary'

CREATE TABLE IF NOT EXISTS `PaginatedCurrencySummaryListCurrencySummary` (
  `paginatedCurrencySummaryList` long NOT NULL
  `currencySummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEggGroupSummaryList` generated from model 'paginatedEggGroupSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEggGroupSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEggGroupSummaryListEggGroupSummary` generated from model 'PaginatedEggGroupSummaryListEggGroupSummary'

CREATE TABLE IF NOT EXISTS `PaginatedEggGroupSummaryListEggGroupSummary` (
  `paginatedEggGroupSummaryList` long NOT NULL
  `eggGroupSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEncounterConditionSummaryList` generated from model 'paginatedEncounterConditionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterConditionSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEncounterConditionSummaryListEncounterConditionSummary` generated from model 'PaginatedEncounterConditionSummaryListEncounterConditionSummary'

CREATE TABLE IF NOT EXISTS `PaginatedEncounterConditionSummaryListEncounterConditionSummary` (
  `paginatedEncounterConditionSummaryList` long NOT NULL
  `encounterConditionSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEncounterConditionValueSummaryList` generated from model 'paginatedEncounterConditionValueSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterConditionValueSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEncounterConditionValueSummaryListEncounterConditionValueSummary` generated from model 'PaginatedEncounterConditionValueSummaryListEncounterConditionValueSummary'

CREATE TABLE IF NOT EXISTS `PaginatedEncounterConditionValueSummaryListEncounterConditionValueSummary` (
  `paginatedEncounterConditionValueSummaryList` long NOT NULL
  `encounterConditionValueSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEncounterMethodSummaryList` generated from model 'paginatedEncounterMethodSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEncounterMethodSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEncounterMethodSummaryListEncounterMethodSummary` generated from model 'PaginatedEncounterMethodSummaryListEncounterMethodSummary'

CREATE TABLE IF NOT EXISTS `PaginatedEncounterMethodSummaryListEncounterMethodSummary` (
  `paginatedEncounterMethodSummaryList` long NOT NULL
  `encounterMethodSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEvolutionChainSummaryList` generated from model 'paginatedEvolutionChainSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionChainSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEvolutionChainSummaryListEvolutionChainSummary` generated from model 'PaginatedEvolutionChainSummaryListEvolutionChainSummary'

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionChainSummaryListEvolutionChainSummary` (
  `paginatedEvolutionChainSummaryList` long NOT NULL
  `evolutionChainSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEvolutionTriggerSummaryList` generated from model 'paginatedEvolutionTriggerSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionTriggerSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEvolutionTriggerSummaryListEvolutionTriggerSummary` generated from model 'PaginatedEvolutionTriggerSummaryListEvolutionTriggerSummary'

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionTriggerSummaryListEvolutionTriggerSummary` (
  `paginatedEvolutionTriggerSummaryList` long NOT NULL
  `evolutionTriggerSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEvolutionVariableSummaryList` generated from model 'paginatedEvolutionVariableSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionVariableSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEvolutionVariableSummaryListEvolutionVariableSummary` generated from model 'PaginatedEvolutionVariableSummaryListEvolutionVariableSummary'

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionVariableSummaryListEvolutionVariableSummary` (
  `paginatedEvolutionVariableSummaryList` long NOT NULL
  `evolutionVariableSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedGenderSummaryList` generated from model 'paginatedGenderSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGenderSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedGenderSummaryListGenderSummary` generated from model 'PaginatedGenderSummaryListGenderSummary'

CREATE TABLE IF NOT EXISTS `PaginatedGenderSummaryListGenderSummary` (
  `paginatedGenderSummaryList` long NOT NULL
  `genderSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedGenerationSummaryList` generated from model 'paginatedGenerationSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGenerationSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedGenerationSummaryListGenerationSummary` generated from model 'PaginatedGenerationSummaryListGenerationSummary'

CREATE TABLE IF NOT EXISTS `PaginatedGenerationSummaryListGenerationSummary` (
  `paginatedGenerationSummaryList` long NOT NULL
  `generationSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedGrowthRateSummaryList` generated from model 'paginatedGrowthRateSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGrowthRateSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedGrowthRateSummaryListGrowthRateSummary` generated from model 'PaginatedGrowthRateSummaryListGrowthRateSummary'

CREATE TABLE IF NOT EXISTS `PaginatedGrowthRateSummaryListGrowthRateSummary` (
  `paginatedGrowthRateSummaryList` long NOT NULL
  `growthRateSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemAttributeSummaryList` generated from model 'paginatedItemAttributeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemAttributeSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemAttributeSummaryListItemAttributeSummary` generated from model 'PaginatedItemAttributeSummaryListItemAttributeSummary'

CREATE TABLE IF NOT EXISTS `PaginatedItemAttributeSummaryListItemAttributeSummary` (
  `paginatedItemAttributeSummaryList` long NOT NULL
  `itemAttributeSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemCategorySummaryList` generated from model 'paginatedItemCategorySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemCategorySummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemCategorySummaryListItemCategorySummary` generated from model 'PaginatedItemCategorySummaryListItemCategorySummary'

CREATE TABLE IF NOT EXISTS `PaginatedItemCategorySummaryListItemCategorySummary` (
  `paginatedItemCategorySummaryList` long NOT NULL
  `itemCategorySummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemFlingEffectSummaryList` generated from model 'paginatedItemFlingEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemFlingEffectSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemFlingEffectSummaryListItemFlingEffectSummary` generated from model 'PaginatedItemFlingEffectSummaryListItemFlingEffectSummary'

CREATE TABLE IF NOT EXISTS `PaginatedItemFlingEffectSummaryListItemFlingEffectSummary` (
  `paginatedItemFlingEffectSummaryList` long NOT NULL
  `itemFlingEffectSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemPocketSummaryList` generated from model 'paginatedItemPocketSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemPocketSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemPocketSummaryListItemPocketSummary` generated from model 'PaginatedItemPocketSummaryListItemPocketSummary'

CREATE TABLE IF NOT EXISTS `PaginatedItemPocketSummaryListItemPocketSummary` (
  `paginatedItemPocketSummaryList` long NOT NULL
  `itemPocketSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemSummaryList` generated from model 'paginatedItemSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedItemSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedItemSummaryListItemSummary` generated from model 'PaginatedItemSummaryListItemSummary'

CREATE TABLE IF NOT EXISTS `PaginatedItemSummaryListItemSummary` (
  `paginatedItemSummaryList` long NOT NULL
  `itemSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedLanguageSummaryList` generated from model 'paginatedLanguageSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLanguageSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedLanguageSummaryListLanguageSummary` generated from model 'PaginatedLanguageSummaryListLanguageSummary'

CREATE TABLE IF NOT EXISTS `PaginatedLanguageSummaryListLanguageSummary` (
  `paginatedLanguageSummaryList` long NOT NULL
  `languageSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedLocationAreaSummaryList` generated from model 'paginatedLocationAreaSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLocationAreaSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedLocationAreaSummaryListLocationAreaSummary` generated from model 'PaginatedLocationAreaSummaryListLocationAreaSummary'

CREATE TABLE IF NOT EXISTS `PaginatedLocationAreaSummaryListLocationAreaSummary` (
  `paginatedLocationAreaSummaryList` long NOT NULL
  `locationAreaSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedLocationSummaryList` generated from model 'paginatedLocationSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedLocationSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedLocationSummaryListLocationSummary` generated from model 'PaginatedLocationSummaryListLocationSummary'

CREATE TABLE IF NOT EXISTS `PaginatedLocationSummaryListLocationSummary` (
  `paginatedLocationSummaryList` long NOT NULL
  `locationSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMachineSummaryList` generated from model 'paginatedMachineSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMachineSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMachineSummaryListMachineSummary` generated from model 'PaginatedMachineSummaryListMachineSummary'

CREATE TABLE IF NOT EXISTS `PaginatedMachineSummaryListMachineSummary` (
  `paginatedMachineSummaryList` long NOT NULL
  `machineSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveBattleStyleSummaryList` generated from model 'paginatedMoveBattleStyleSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveBattleStyleSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveBattleStyleSummaryListMoveBattleStyleSummary` generated from model 'PaginatedMoveBattleStyleSummaryListMoveBattleStyleSummary'

CREATE TABLE IF NOT EXISTS `PaginatedMoveBattleStyleSummaryListMoveBattleStyleSummary` (
  `paginatedMoveBattleStyleSummaryList` long NOT NULL
  `moveBattleStyleSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveDamageClassSummaryList` generated from model 'paginatedMoveDamageClassSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveDamageClassSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveDamageClassSummaryListMoveDamageClassSummary` generated from model 'PaginatedMoveDamageClassSummaryListMoveDamageClassSummary'

CREATE TABLE IF NOT EXISTS `PaginatedMoveDamageClassSummaryListMoveDamageClassSummary` (
  `paginatedMoveDamageClassSummaryList` long NOT NULL
  `moveDamageClassSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveLearnMethodSummaryList` generated from model 'paginatedMoveLearnMethodSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveLearnMethodSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveLearnMethodSummaryListMoveLearnMethodSummary` generated from model 'PaginatedMoveLearnMethodSummaryListMoveLearnMethodSummary'

CREATE TABLE IF NOT EXISTS `PaginatedMoveLearnMethodSummaryListMoveLearnMethodSummary` (
  `paginatedMoveLearnMethodSummaryList` long NOT NULL
  `moveLearnMethodSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveMetaAilmentSummaryList` generated from model 'paginatedMoveMetaAilmentSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveMetaAilmentSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveMetaAilmentSummaryListMoveMetaAilmentSummary` generated from model 'PaginatedMoveMetaAilmentSummaryListMoveMetaAilmentSummary'

CREATE TABLE IF NOT EXISTS `PaginatedMoveMetaAilmentSummaryListMoveMetaAilmentSummary` (
  `paginatedMoveMetaAilmentSummaryList` long NOT NULL
  `moveMetaAilmentSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveMetaCategorySummaryList` generated from model 'paginatedMoveMetaCategorySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveMetaCategorySummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveMetaCategorySummaryListMoveMetaCategorySummary` generated from model 'PaginatedMoveMetaCategorySummaryListMoveMetaCategorySummary'

CREATE TABLE IF NOT EXISTS `PaginatedMoveMetaCategorySummaryListMoveMetaCategorySummary` (
  `paginatedMoveMetaCategorySummaryList` long NOT NULL
  `moveMetaCategorySummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveSummaryList` generated from model 'paginatedMoveSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveSummaryListMoveSummary` generated from model 'PaginatedMoveSummaryListMoveSummary'

CREATE TABLE IF NOT EXISTS `PaginatedMoveSummaryListMoveSummary` (
  `paginatedMoveSummaryList` long NOT NULL
  `moveSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveTargetSummaryList` generated from model 'paginatedMoveTargetSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedMoveTargetSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedMoveTargetSummaryListMoveTargetSummary` generated from model 'PaginatedMoveTargetSummaryListMoveTargetSummary'

CREATE TABLE IF NOT EXISTS `PaginatedMoveTargetSummaryListMoveTargetSummary` (
  `paginatedMoveTargetSummaryList` long NOT NULL
  `moveTargetSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedNatureSummaryList` generated from model 'paginatedNatureSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedNatureSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedNatureSummaryListNatureSummary` generated from model 'PaginatedNatureSummaryListNatureSummary'

CREATE TABLE IF NOT EXISTS `PaginatedNatureSummaryListNatureSummary` (
  `paginatedNatureSummaryList` long NOT NULL
  `natureSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPalParkAreaSummaryList` generated from model 'paginatedPalParkAreaSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPalParkAreaSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPalParkAreaSummaryListPalParkAreaSummary` generated from model 'PaginatedPalParkAreaSummaryListPalParkAreaSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPalParkAreaSummaryListPalParkAreaSummary` (
  `paginatedPalParkAreaSummaryList` long NOT NULL
  `palParkAreaSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokeathlonStatSummaryList` generated from model 'paginatedPokeathlonStatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokeathlonStatSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokeathlonStatSummaryListPokeathlonStatSummary` generated from model 'PaginatedPokeathlonStatSummaryListPokeathlonStatSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPokeathlonStatSummaryListPokeathlonStatSummary` (
  `paginatedPokeathlonStatSummaryList` long NOT NULL
  `pokeathlonStatSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokedexSummaryList` generated from model 'paginatedPokedexSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokedexSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokedexSummaryListPokedexSummary` generated from model 'PaginatedPokedexSummaryListPokedexSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPokedexSummaryListPokedexSummary` (
  `paginatedPokedexSummaryList` long NOT NULL
  `pokedexSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonColorSummaryList` generated from model 'paginatedPokemonColorSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonColorSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonColorSummaryListPokemonColorSummary` generated from model 'PaginatedPokemonColorSummaryListPokemonColorSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPokemonColorSummaryListPokemonColorSummary` (
  `paginatedPokemonColorSummaryList` long NOT NULL
  `pokemonColorSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonFormSummaryList` generated from model 'paginatedPokemonFormSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonFormSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonFormSummaryListPokemonFormSummary` generated from model 'PaginatedPokemonFormSummaryListPokemonFormSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPokemonFormSummaryListPokemonFormSummary` (
  `paginatedPokemonFormSummaryList` long NOT NULL
  `pokemonFormSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonHabitatSummaryList` generated from model 'paginatedPokemonHabitatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonHabitatSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonHabitatSummaryListPokemonHabitatSummary` generated from model 'PaginatedPokemonHabitatSummaryListPokemonHabitatSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPokemonHabitatSummaryListPokemonHabitatSummary` (
  `paginatedPokemonHabitatSummaryList` long NOT NULL
  `pokemonHabitatSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonShapeSummaryList` generated from model 'paginatedPokemonShapeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonShapeSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonShapeSummaryListPokemonShapeSummary` generated from model 'PaginatedPokemonShapeSummaryListPokemonShapeSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPokemonShapeSummaryListPokemonShapeSummary` (
  `paginatedPokemonShapeSummaryList` long NOT NULL
  `pokemonShapeSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonSpeciesSummaryList` generated from model 'paginatedPokemonSpeciesSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonSpeciesSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonSpeciesSummaryListPokemonSpeciesSummary` generated from model 'PaginatedPokemonSpeciesSummaryListPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPokemonSpeciesSummaryListPokemonSpeciesSummary` (
  `paginatedPokemonSpeciesSummaryList` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonSummaryList` generated from model 'paginatedPokemonSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedPokemonSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedPokemonSummaryListPokemonSummary` generated from model 'PaginatedPokemonSummaryListPokemonSummary'

CREATE TABLE IF NOT EXISTS `PaginatedPokemonSummaryListPokemonSummary` (
  `paginatedPokemonSummaryList` long NOT NULL
  `pokemonSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedRegionSummaryList` generated from model 'paginatedRegionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedRegionSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedRegionSummaryListRegionSummary` generated from model 'PaginatedRegionSummaryListRegionSummary'

CREATE TABLE IF NOT EXISTS `PaginatedRegionSummaryListRegionSummary` (
  `paginatedRegionSummaryList` long NOT NULL
  `regionSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedStatSummaryList` generated from model 'paginatedStatSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedStatSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedStatSummaryListStatSummary` generated from model 'PaginatedStatSummaryListStatSummary'

CREATE TABLE IF NOT EXISTS `PaginatedStatSummaryListStatSummary` (
  `paginatedStatSummaryList` long NOT NULL
  `statSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedSuperContestEffectSummaryList` generated from model 'paginatedSuperContestEffectSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedSuperContestEffectSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedSuperContestEffectSummaryListSuperContestEffectSummary` generated from model 'PaginatedSuperContestEffectSummaryListSuperContestEffectSummary'

CREATE TABLE IF NOT EXISTS `PaginatedSuperContestEffectSummaryListSuperContestEffectSummary` (
  `paginatedSuperContestEffectSummaryList` long NOT NULL
  `superContestEffectSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedTypeSummaryList` generated from model 'paginatedTypeSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedTypeSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedTypeSummaryListTypeSummary` generated from model 'PaginatedTypeSummaryListTypeSummary'

CREATE TABLE IF NOT EXISTS `PaginatedTypeSummaryListTypeSummary` (
  `paginatedTypeSummaryList` long NOT NULL
  `typeSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedVersionGroupSummaryList` generated from model 'paginatedVersionGroupSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedVersionGroupSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedVersionGroupSummaryListVersionGroupSummary` generated from model 'PaginatedVersionGroupSummaryListVersionGroupSummary'

CREATE TABLE IF NOT EXISTS `PaginatedVersionGroupSummaryListVersionGroupSummary` (
  `paginatedVersionGroupSummaryList` long NOT NULL
  `versionGroupSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedVersionSummaryList` generated from model 'paginatedVersionSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedVersionSummaryList` (
  `count` int NOT NULL /*The total number of resources available from this API.*/,
  `next` text /*The URL for the next page in the list, or null if there is no next page.*/,
  `previous` text /*The URL for the previous page in the list, or null if there is no previous page.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedVersionSummaryListVersionSummary` generated from model 'PaginatedVersionSummaryListVersionSummary'

CREATE TABLE IF NOT EXISTS `PaginatedVersionSummaryListVersionSummary` (
  `paginatedVersionSummaryList` long NOT NULL
  `versionSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaDetail` generated from model 'palParkAreaDetail'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaDetailPalParkAreaName` generated from model 'PalParkAreaDetailPalParkAreaName'

CREATE TABLE IF NOT EXISTS `PalParkAreaDetailPalParkAreaName` (
  `palParkAreaDetail` long NOT NULL
  `palParkAreaName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaDetailPalParkEncounter` generated from model 'PalParkAreaDetailPalParkEncounter'

CREATE TABLE IF NOT EXISTS `PalParkAreaDetailPalParkEncounter` (
  `palParkAreaDetail` long NOT NULL
  `palParkEncounter` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaName` generated from model 'palParkAreaName'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaSummary` generated from model 'palParkAreaSummary'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PalParkEncounter` generated from model 'palParkEncounter'
--

CREATE TABLE IF NOT EXISTS `PalParkEncounter` (
  `rate` int NOT NULL /*The base rate for encountering this Pokémon in this pal park area.*/,
  `pokemon_species` long NOT NULL /*The Pokémon species being encountered.*/,
  `base_score` int /*The base score given to the player when this Pokémon is caught during a pal park run.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokeapiMetaResponse` generated from model 'pokeapiMetaResponse'
--

CREATE TABLE IF NOT EXISTS `PokeapiMetaResponse` (
  `deploy_date` text NOT NULL /*The deployment time as a Unix timestamp string.*/,
  `hash` text NOT NULL /*The source commit hash used for this deployment.*/,
  `tag` text NOT NULL /*The deployment tag, or null if the deployment has no tag.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatAffectingNature` generated from model 'pokeathlonStatAffectingNature'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatAffectingNature` (
  `max_change` int NOT NULL /*The maximum amount of change to the referenced Pokéathlon stat.*/,
  `nature` long NOT NULL /*The nature causing the change.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatAffectingNatures` generated from model 'pokeathlonStatAffectingNatures'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatAffectingNatures` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature` generated from model 'PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature'

CREATE TABLE IF NOT EXISTS `PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature` (
  `pokeathlonStatAffectingNatures` long NOT NULL
  `pokeathlonStatAffectingNature` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature` generated from model 'PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature'

CREATE TABLE IF NOT EXISTS `PokeathlonStatAffectingNaturesPokeathlonStatAffectingNature` (
  `pokeathlonStatAffectingNatures` long NOT NULL
  `pokeathlonStatAffectingNature` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetail` generated from model 'pokeathlonStatDetail'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `affecting_natures` long NOT NULL /*A detail of natures which affect this Pokéathlon stat positively or negatively.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetailPokeathlonStatName` generated from model 'PokeathlonStatDetailPokeathlonStatName'

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetailPokeathlonStatName` (
  `pokeathlonStatDetail` long NOT NULL
  `pokeathlonStatName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatName` generated from model 'pokeathlonStatName'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatSummary` generated from model 'pokeathlonStatSummary'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDescription` generated from model 'pokedexDescription'
--

CREATE TABLE IF NOT EXISTS `PokedexDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDetail` generated from model 'pokedexDetail'
--

CREATE TABLE IF NOT EXISTS `PokedexDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `region` long NOT NULL /*The region this Pokédex catalogues Pokémon for.*/,
  `is_main_series` boolean /*Whether or not this Pokédex originated in the main series of the video games.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDetailPokedexDescription` generated from model 'PokedexDetailPokedexDescription'

CREATE TABLE IF NOT EXISTS `PokedexDetailPokedexDescription` (
  `pokedexDetail` long NOT NULL
  `pokedexDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDetailPokedexName` generated from model 'PokedexDetailPokedexName'

CREATE TABLE IF NOT EXISTS `PokedexDetailPokedexName` (
  `pokedexDetail` long NOT NULL
  `pokedexName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDetailPokemonDexNumber` generated from model 'PokedexDetailPokemonDexNumber'

CREATE TABLE IF NOT EXISTS `PokedexDetailPokemonDexNumber` (
  `pokedexDetail` long NOT NULL
  `pokemonDexNumber` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDetailVersionGroupSummary` generated from model 'PokedexDetailVersionGroupSummary'

CREATE TABLE IF NOT EXISTS `PokedexDetailVersionGroupSummary` (
  `pokedexDetail` long NOT NULL
  `versionGroupSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexName` generated from model 'pokedexName'
--

CREATE TABLE IF NOT EXISTS `PokedexName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexSummary` generated from model 'pokedexSummary'
--

CREATE TABLE IF NOT EXISTS `PokedexSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonAbility` generated from model 'pokemonAbility'
--

CREATE TABLE IF NOT EXISTS `PokemonAbility` (
  `slot` int NOT NULL /*The slot this ability occupies in this Pokémon species.*/,
  `ability` long NOT NULL /*The ability the Pokémon may have.*/,
  `is_hidden` boolean /*Whether or not this is a hidden ability.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonAbilityPast` generated from model 'pokemonAbilityPast'
--

CREATE TABLE IF NOT EXISTS `PokemonAbilityPast` (
  `slot` int NOT NULL /*The slot this ability occupies in this Pokémon species.*/,
  `ability` long NOT NULL /*The ability the Pokémon may have.*/,
  `is_hidden` boolean /*Whether or not this is a hidden ability.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonColorDetail` generated from model 'pokemonColorDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonColorDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonColorDetailPokemonColorName` generated from model 'PokemonColorDetailPokemonColorName'

CREATE TABLE IF NOT EXISTS `PokemonColorDetailPokemonColorName` (
  `pokemonColorDetail` long NOT NULL
  `pokemonColorName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonColorDetailPokemonSpeciesSummary` generated from model 'PokemonColorDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `PokemonColorDetailPokemonSpeciesSummary` (
  `pokemonColorDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonColorName` generated from model 'pokemonColorName'
--

CREATE TABLE IF NOT EXISTS `PokemonColorName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonColorSummary` generated from model 'pokemonColorSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonColorSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonCries` generated from model 'pokemonCries'
--

CREATE TABLE IF NOT EXISTS `PokemonCries` (
  `latest` text NOT NULL /*The latest depiction of this Pokémon&#39;s cry.*/,
  `legacy` text NOT NULL /*The legacy depiction of this Pokémon&#39;s cry.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail` generated from model 'pokemonDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `location_area_encounters` text NOT NULL /*A link to a list of location areas, as well as encounter details pertaining to specific versions.*/,
  `species` long NOT NULL /*The species this Pokémon belongs to.*/,
  `sprites` long NOT NULL /*A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt;*/,
  `cries` long NOT NULL /*A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt;*/,
  `base_experience` int /*The base experience gained for defeating this Pokémon.*/,
  `height` int /*The height of this Pokémon in decimetres.*/,
  `is_default` boolean /*Set for exactly one Pokémon used as the default for each species.*/,
  `order` int /*Order for sorting. Almost national order, except families are grouped together.*/,
  `weight` int /*The weight of this Pokémon in hectograms.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonAbility` generated from model 'PokemonDetailPokemonAbility'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonAbility` (
  `pokemonDetail` long NOT NULL
  `pokemonAbility` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonPastAbility` generated from model 'PokemonDetailPokemonPastAbility'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonPastAbility` (
  `pokemonDetail` long NOT NULL
  `pokemonPastAbility` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonFormSummary` generated from model 'PokemonDetailPokemonFormSummary'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonFormSummary` (
  `pokemonDetail` long NOT NULL
  `pokemonFormSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonGameIndex` generated from model 'PokemonDetailPokemonGameIndex'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonGameIndex` (
  `pokemonDetail` long NOT NULL
  `pokemonGameIndex` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonHeldItemSummary` generated from model 'PokemonDetailPokemonHeldItemSummary'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonHeldItemSummary` (
  `pokemonDetail` long NOT NULL
  `pokemonHeldItemSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonMove` generated from model 'PokemonDetailPokemonMove'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonMove` (
  `pokemonDetail` long NOT NULL
  `pokemonMove` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonStat` generated from model 'PokemonDetailPokemonStat'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonStat` (
  `pokemonDetail` long NOT NULL
  `pokemonStat` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonPastStat` generated from model 'PokemonDetailPokemonPastStat'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonPastStat` (
  `pokemonDetail` long NOT NULL
  `pokemonPastStat` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonType` generated from model 'PokemonDetailPokemonType'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonType` (
  `pokemonDetail` long NOT NULL
  `pokemonType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonPastType` generated from model 'PokemonDetailPokemonPastType'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonPastType` (
  `pokemonDetail` long NOT NULL
  `pokemonPastType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDexEntry` generated from model 'pokemonDexEntry'
--

CREATE TABLE IF NOT EXISTS `PokemonDexEntry` (
  `entry_number` int NOT NULL /*The index number within the Pokédex.*/,
  `pokedex` long NOT NULL /*The Pokédex the referenced Pokémon species can be found in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDexNumber` generated from model 'pokemonDexNumber'
--

CREATE TABLE IF NOT EXISTS `PokemonDexNumber` (
  `entry_number` int NOT NULL /*The index of this Pokémon species entry within the Pokédex.*/,
  `pokemon_species` long NOT NULL /*The Pokémon species being encountered.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEncounterDetailResponse` generated from model 'pokemonEncounterDetailResponse'
--

CREATE TABLE IF NOT EXISTS `PokemonEncounterDetailResponse` (
  `chance` int NOT NULL /*Percent chance that this encounter will occur.*/,
  `max_level` int NOT NULL /*The highest level the Pokémon could be encountered at.*/,
  `method` long NOT NULL /*The method by which this encounter happens.*/,
  `min_level` int NOT NULL /*The lowest level the Pokémon could be encountered at.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEncounterDetailResponseEncounterConditionValueSummary` generated from model 'PokemonEncounterDetailResponseEncounterConditionValueSummary'

CREATE TABLE IF NOT EXISTS `PokemonEncounterDetailResponseEncounterConditionValueSummary` (
  `pokemonEncounterDetailResponse` long NOT NULL
  `encounterConditionValueSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEncounterResponse` generated from model 'pokemonEncounterResponse'
--

CREATE TABLE IF NOT EXISTS `PokemonEncounterResponse` (
  `location_area` long NOT NULL /*The location area the referenced Pokémon can be encountered in.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEncounterResponsePokemonEncounterVersionDetailResponse` generated from model 'PokemonEncounterResponsePokemonEncounterVersionDetailResponse'

CREATE TABLE IF NOT EXISTS `PokemonEncounterResponsePokemonEncounterVersionDetailResponse` (
  `pokemonEncounterResponse` long NOT NULL
  `pokemonEncounterVersionDetailResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEncounterVersionDetailResponse` generated from model 'pokemonEncounterVersionDetailResponse'
--

CREATE TABLE IF NOT EXISTS `PokemonEncounterVersionDetailResponse` (
  `version` long NOT NULL /*The game version this encounter happens in.*/,
  `max_chance` int NOT NULL /*The total percentage of all encounter potential.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEncounterVersionDetailResponsePokemonEncounterDetailResponse` generated from model 'PokemonEncounterVersionDetailResponsePokemonEncounterDetailResponse'

CREATE TABLE IF NOT EXISTS `PokemonEncounterVersionDetailResponsePokemonEncounterDetailResponse` (
  `pokemonEncounterVersionDetailResponse` long NOT NULL
  `pokemonEncounterDetailResponse` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEvolution` generated from model 'pokemonEvolution'
--

CREATE TABLE IF NOT EXISTS `PokemonEvolution` (
  `version_group` long NOT NULL /*The version group in which these evolution requirements apply.*/,
  `item` long NOT NULL /*The item required to cause evolution this into Pokémon species.*/,
  `trigger` long NOT NULL /*The type of event that triggers evolution into this Pokémon species.*/,
  `held_item` long NOT NULL /*The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.*/,
  `known_move` long NOT NULL,
  `known_move_type` long NOT NULL,
  `location` long NOT NULL /*The location the evolution must be triggered at.*/,
  `party_species` long NOT NULL /*The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.*/,
  `party_type` long NOT NULL /*The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.*/,
  `trade_species` long NOT NULL /*Pokémon species for which this one must be traded.*/,
  `region` long NOT NULL /*The required region in which this evolution can occur.*/,
  `required_pokemon_form` long NOT NULL /*The Pokémon form required before evolving, or null if unrestricted.*/,
  `evolved_pokemon_form` long NOT NULL /*The Pokémon form produced by this evolution, or null if unspecified.*/,
  `used_move` long NOT NULL /*The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.*/,
  `condition_expression` long NOT NULL /*An additional evolution condition expressed in reverse Polish notation, or null if none.*/,
  `is_default` boolean /*Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one &#39;default&#39; evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.*/,
  `gender` int /*The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.*/,
  `min_level` int /*The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.*/,
  `min_happiness` int /*The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.*/,
  `min_beauty` int /*The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.*/,
  `min_affection` int /*The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.*/,
  `near_special_rock` boolean /*Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.*/,
  `needs_multiplayer` boolean /*Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).*/,
  `needs_overworld_rain` boolean /*Whether or not it must be raining in the overworld to cause evolution this Pokémon species.*/,
  `relative_physical_stats` int /*The required relation between the Pokémon&#39;s Attack and Defense stats. 1 means Attack &gt; Defense. 0 means Attack &#x3D; Defense. -1 means Attack &lt; Defense.*/,
  `time_of_day` text /*The required time of day. Day or night.*/,
  `turn_upside_down` boolean /*Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.*/,
  `min_move_count` int /*The minimum number of times a move must be used in order to evolve into this Pokémon species.*/,
  `min_steps` int /*The minimum number of steps that must be taken in order to evolve into this Pokémon species.*/,
  `min_damage_taken` int /*The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEvolutionNatureSummary` generated from model 'PokemonEvolutionNatureSummary'

CREATE TABLE IF NOT EXISTS `PokemonEvolutionNatureSummary` (
  `pokemonEvolution` long NOT NULL
  `natureSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonEvolution_known_move` generated from model 'pokemonEvolutionKnownMove'
--

CREATE TABLE IF NOT EXISTS `PokemonEvolution_known_move` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetail` generated from model 'pokemonFormDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonFormDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `form_name` text NOT NULL /*The name of this form.*/,
  `pokemon` long NOT NULL /*The Pokémon that can take on this form.*/,
  `sprites` long NOT NULL /*A set of sprites used to depict this Pokémon form in the game.*/,
  `version_group` long NOT NULL /*The version group this Pokémon form was introduced in.*/,
  `order` int /*The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.*/,
  `form_order` int /*The order in which forms should be sorted within a species&#39; forms.*/,
  `is_default` boolean /*True for exactly one form used as the default for each Pokémon.*/,
  `is_battle_only` boolean /*Whether or not this form can only happen during battle.*/,
  `is_mega` boolean /*Whether or not this form requires mega evolution.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetailPokemonFormName` generated from model 'PokemonFormDetailPokemonFormName'

CREATE TABLE IF NOT EXISTS `PokemonFormDetailPokemonFormName` (
  `pokemonFormDetail` long NOT NULL
  `pokemonFormName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetailPokemonFormName` generated from model 'PokemonFormDetailPokemonFormName'

CREATE TABLE IF NOT EXISTS `PokemonFormDetailPokemonFormName` (
  `pokemonFormDetail` long NOT NULL
  `pokemonFormName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetailPokemonFormType` generated from model 'PokemonFormDetailPokemonFormType'

CREATE TABLE IF NOT EXISTS `PokemonFormDetailPokemonFormType` (
  `pokemonFormDetail` long NOT NULL
  `pokemonFormType` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetailPokemonFormTriggerCondition` generated from model 'PokemonFormDetailPokemonFormTriggerCondition'

CREATE TABLE IF NOT EXISTS `PokemonFormDetailPokemonFormTriggerCondition` (
  `pokemonFormDetail` long NOT NULL
  `pokemonFormTriggerCondition` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetailPokemonFormFlavorText` generated from model 'PokemonFormDetailPokemonFormFlavorText'

CREATE TABLE IF NOT EXISTS `PokemonFormDetailPokemonFormFlavorText` (
  `pokemonFormDetail` long NOT NULL
  `pokemonFormFlavorText` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormFlavorText` generated from model 'pokemonFormFlavorText'
--

CREATE TABLE IF NOT EXISTS `PokemonFormFlavorText` (
  `flavor_text` text NOT NULL /*The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more. */,
  `language` long NOT NULL /*The language this name is in.*/,
  `version` long NOT NULL /*The game version this flavor text is extracted from.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormName` generated from model 'pokemonFormName'
--

CREATE TABLE IF NOT EXISTS `PokemonFormName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormSprites` generated from model 'pokemonFormSprites'
--

CREATE TABLE IF NOT EXISTS `PokemonFormSprites` (
  `front_default` text NOT NULL /*The default depiction of this Pokémon from the front in battle.*/,
  `front_shiny` text NOT NULL /*The shiny depiction of this Pokémon from the front in battle.*/,
  `front_female` text NOT NULL /*The female depiction of this Pokémon from the front in battle.*/,
  `front_shiny_female` text NOT NULL /*The shiny female depiction of this Pokémon from the front in battle.*/,
  `back_default` text NOT NULL /*The default depiction of this Pokémon from the back in battle.*/,
  `back_shiny` text NOT NULL /*The shiny depiction of this Pokémon from the back in battle.*/,
  `back_female` text NOT NULL /*The female depiction of this Pokémon from the back in battle.*/,
  `back_shiny_female` text NOT NULL /*The shiny female depiction of this Pokémon from the back in battle.*/,
  `other` long /*Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.*/,
  `versions` blob /*Sprites grouped by generation and game. Available keys vary by resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormSummary` generated from model 'pokemonFormSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonFormSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormTriggerCondition` generated from model 'pokemonFormTriggerCondition'
--

CREATE TABLE IF NOT EXISTS `PokemonFormTriggerCondition` (
  `trigger` text NOT NULL /*The trigger for this form change.*/,
  `name` text /*The name of the required item, ability, or move. Only present for a resource-based trigger.*/,
  `url` text /*The URL of the required item, ability, or move. Only present for a resource-based trigger.*/,
  `base_form` long /*The required base form. Only present when the trigger specifies one.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormType` generated from model 'pokemonFormType'
--

CREATE TABLE IF NOT EXISTS `PokemonFormType` (
  `slot` int NOT NULL /*The order the Pokémon&#39;s types are listed in.*/,
  `type` long NOT NULL /*The type the referenced Form has.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonGameIndex` generated from model 'pokemonGameIndex'
--

CREATE TABLE IF NOT EXISTS `PokemonGameIndex` (
  `game_index` int NOT NULL /*The internal id of an API resource within game data.*/,
  `version` long NOT NULL /*The version relevent to this game index.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHabitatDetail` generated from model 'pokemonHabitatDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHabitatDetailPokemonHabitatName` generated from model 'PokemonHabitatDetailPokemonHabitatName'

CREATE TABLE IF NOT EXISTS `PokemonHabitatDetailPokemonHabitatName` (
  `pokemonHabitatDetail` long NOT NULL
  `pokemonHabitatName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHabitatDetailPokemonSpeciesSummary` generated from model 'PokemonHabitatDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `PokemonHabitatDetailPokemonSpeciesSummary` (
  `pokemonHabitatDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHabitatName` generated from model 'pokemonHabitatName'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHabitatSummary` generated from model 'pokemonHabitatSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHeldItem` generated from model 'pokemonHeldItem'
--

CREATE TABLE IF NOT EXISTS `PokemonHeldItem` (
  `pokemon` long NOT NULL /*The Pokémon that holds this item.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHeldItemPokemonHeldItemVersion` generated from model 'PokemonHeldItemPokemonHeldItemVersion'

CREATE TABLE IF NOT EXISTS `PokemonHeldItemPokemonHeldItemVersion` (
  `pokemonHeldItem` long NOT NULL
  `pokemonHeldItemVersion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHeldItemSummary` generated from model 'pokemonHeldItemSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonHeldItemSummary` (
  `item` long NOT NULL /*The item the referenced Pokémon holds.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHeldItemSummaryPokemonHeldItemVersion` generated from model 'PokemonHeldItemSummaryPokemonHeldItemVersion'

CREATE TABLE IF NOT EXISTS `PokemonHeldItemSummaryPokemonHeldItemVersion` (
  `pokemonHeldItemSummary` long NOT NULL
  `pokemonHeldItemVersion` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHeldItemVersion` generated from model 'pokemonHeldItemVersion'
--

CREATE TABLE IF NOT EXISTS `PokemonHeldItemVersion` (
  `rarity` int NOT NULL /*How often the item is held.*/,
  `version` long NOT NULL /*The version in which the item is held.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonMove` generated from model 'pokemonMove'
--

CREATE TABLE IF NOT EXISTS `PokemonMove` (
  `move` long NOT NULL /*The move the Pokémon can learn.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonMovePokemonMoveVersionGroup` generated from model 'PokemonMovePokemonMoveVersionGroup'

CREATE TABLE IF NOT EXISTS `PokemonMovePokemonMoveVersionGroup` (
  `pokemonMove` long NOT NULL
  `pokemonMoveVersionGroup` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonMoveVersionGroup` generated from model 'pokemonMoveVersionGroup'
--

CREATE TABLE IF NOT EXISTS `PokemonMoveVersionGroup` (
  `level_learned_at` int NOT NULL /*The minimum level to learn the move.*/,
  `move_learn_method` long NOT NULL /*The method by which the move is learned.*/,
  `version_group` long NOT NULL /*The version group in which the move is learned.*/,
  `order` int /*Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonPastAbility` generated from model 'pokemonPastAbility'
--

CREATE TABLE IF NOT EXISTS `PokemonPastAbility` (
  `generation` long NOT NULL /*The last generation in which the referenced pokémon had the listed abilities.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonPastAbilityPokemonAbilityPast` generated from model 'PokemonPastAbilityPokemonAbilityPast'

CREATE TABLE IF NOT EXISTS `PokemonPastAbilityPokemonAbilityPast` (
  `pokemonPastAbility` long NOT NULL
  `pokemonAbilityPast` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonPastStat` generated from model 'pokemonPastStat'
--

CREATE TABLE IF NOT EXISTS `PokemonPastStat` (
  `generation` long NOT NULL /*The last generation in which the referenced pokémon had the listed stats.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonPastStatPokemonStat` generated from model 'PokemonPastStatPokemonStat'

CREATE TABLE IF NOT EXISTS `PokemonPastStatPokemonStat` (
  `pokemonPastStat` long NOT NULL
  `pokemonStat` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonPastType` generated from model 'pokemonPastType'
--

CREATE TABLE IF NOT EXISTS `PokemonPastType` (
  `generation` long NOT NULL /*The last generation in which the referenced pokémon had the listed types.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonPastTypePokemonType` generated from model 'PokemonPastTypePokemonType'

CREATE TABLE IF NOT EXISTS `PokemonPastTypePokemonType` (
  `pokemonPastType` long NOT NULL
  `pokemonType` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeAwesomeName` generated from model 'pokemonShapeAwesomeName'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeAwesomeName` (
  `awesome_name` text NOT NULL /*The localized \&quot;scientific\&quot; name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this \&quot;scientific\&quot; name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetail` generated from model 'pokemonShapeDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetailPokemonShapeAwesomeName` generated from model 'PokemonShapeDetailPokemonShapeAwesomeName'

CREATE TABLE IF NOT EXISTS `PokemonShapeDetailPokemonShapeAwesomeName` (
  `pokemonShapeDetail` long NOT NULL
  `pokemonShapeAwesomeName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetailPokemonShapeName` generated from model 'PokemonShapeDetailPokemonShapeName'

CREATE TABLE IF NOT EXISTS `PokemonShapeDetailPokemonShapeName` (
  `pokemonShapeDetail` long NOT NULL
  `pokemonShapeName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetailPokemonSpeciesSummary` generated from model 'PokemonShapeDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `PokemonShapeDetailPokemonSpeciesSummary` (
  `pokemonShapeDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeName` generated from model 'pokemonShapeName'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeSummary` generated from model 'pokemonShapeSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDescription` generated from model 'pokemonSpeciesDescription'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDescription` (
  `language` long NOT NULL /*The language this name is in.*/,
  `description` text /*The localized description for an API resource in a specific language.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetail` generated from model 'pokemonSpeciesDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `growth_rate` long NOT NULL /*The rate at which this Pokémon species gains levels.*/,
  `color` long NOT NULL /*The color of this Pokémon for Pokédex search.*/,
  `shape` long NOT NULL /*The shape of this Pokémon for Pokédex search.*/,
  `evolves_from_species` long NOT NULL /*The Pokémon species that evolves into this Pokemon_species.*/,
  `evolution_chain` long NOT NULL /*The evolution chain this Pokémon species is a member of.*/,
  `habitat` long NOT NULL /*The habitat this Pokémon species can be encountered in.*/,
  `generation` long NOT NULL /*The generation this Pokémon species was introduced in.*/,
  `order` int /*The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.*/,
  `gender_rate` int /*The chance of this Pokémon being female, in eighths; or -1 for genderless.*/,
  `capture_rate` int /*The base capture rate; up to 255. The higher the number, the easier the catch.*/,
  `base_happiness` int /*The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.*/,
  `is_baby` boolean /*Whether or not this is a baby Pokémon.*/,
  `is_legendary` boolean /*Whether or not this is a legendary Pokémon.*/,
  `is_mythical` boolean /*Whether or not this is a mythical Pokémon.*/,
  `hatch_counter` int /*Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon&#39;s egg hatches, unless utilizing bonuses like Flame Body&#39;s. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.*/,
  `has_gender_differences` boolean /*Whether or not this Pokémon has visual gender differences.*/,
  `forms_switchable` boolean /*Whether or not this Pokémon has multiple forms and can switch between them.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonDexEntry` generated from model 'PokemonSpeciesDetailPokemonDexEntry'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonDexEntry` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonDexEntry` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailEggGroupSummary` generated from model 'PokemonSpeciesDetailEggGroupSummary'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailEggGroupSummary` (
  `pokemonSpeciesDetail` long NOT NULL
  `eggGroupSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesName` generated from model 'PokemonSpeciesDetailPokemonSpeciesName'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesName` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesPalParkEncounter` generated from model 'PokemonSpeciesDetailPokemonSpeciesPalParkEncounter'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesPalParkEncounter` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesPalParkEncounter` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesDescription` generated from model 'PokemonSpeciesDetailPokemonSpeciesDescription'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesDescription` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesFlavorText` generated from model 'PokemonSpeciesDetailPokemonSpeciesFlavorText'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesFlavorText` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesFlavorText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesGenus` generated from model 'PokemonSpeciesDetailPokemonSpeciesGenus'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesGenus` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesGenus` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesVariety` generated from model 'PokemonSpeciesDetailPokemonSpeciesVariety'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesVariety` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesVariety` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesFlavorText` generated from model 'pokemonSpeciesFlavorText'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesFlavorText` (
  `flavor_text` text NOT NULL /*The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this &lt;a href&#x3D;&#39;https://github.com/veekun/pokedex/issues/218#issuecomment-339841781&#39; &gt;issue&lt;/a&gt; to find out more. */,
  `language` long NOT NULL /*The language this name is in.*/,
  `version` long NOT NULL /*The game version this flavor text is extracted from.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesGenus` generated from model 'pokemonSpeciesGenus'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesGenus` (
  `genus` text NOT NULL /*The localized genus for the referenced Pokémon species*/,
  `language` long NOT NULL /*The language this genus is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesName` generated from model 'pokemonSpeciesName'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesPalParkEncounter` generated from model 'pokemonSpeciesPalParkEncounter'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesPalParkEncounter` (
  `rate` int NOT NULL /*The base rate for encountering the referenced Pokémon in this pal park area.*/,
  `area` long NOT NULL /*The pal park area where this encounter happens.*/,
  `base_score` int /*The base score given to the player when the referenced Pokémon is caught during a pal park run.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesSummary` generated from model 'pokemonSpeciesSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesVariety` generated from model 'pokemonSpeciesVariety'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesVariety` (
  `is_default` boolean NOT NULL /*Whether this variety is the default variety.*/,
  `pokemon` long NOT NULL /*The Pokémon variety.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSprites` generated from model 'pokemonSprites'
--

CREATE TABLE IF NOT EXISTS `PokemonSprites` (
  `front_default` text NOT NULL /*The default depiction of this Pokémon from the front in battle.*/,
  `front_shiny` text NOT NULL /*The shiny depiction of this Pokémon from the front in battle.*/,
  `front_female` text NOT NULL /*The female depiction of this Pokémon from the front in battle.*/,
  `front_shiny_female` text NOT NULL /*The shiny female depiction of this Pokémon from the front in battle.*/,
  `back_default` text NOT NULL /*The default depiction of this Pokémon from the back in battle.*/,
  `back_shiny` text NOT NULL /*The shiny depiction of this Pokémon from the back in battle.*/,
  `back_female` text NOT NULL /*The female depiction of this Pokémon from the back in battle.*/,
  `back_shiny_female` text NOT NULL /*The shiny female depiction of this Pokémon from the back in battle.*/,
  `other` long /*Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.*/,
  `versions` blob /*Sprites grouped by generation and game. Available keys vary by resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpritesOther` generated from model 'pokemonSpritesOther'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOther` (
  `dream_world` long /*Pokémon Dream World artwork URLs.*/,
  `home` long /*Pokémon HOME sprite URLs.*/,
  `showdown` long /*Pokémon Showdown sprite URLs.*/,
  `officialartwork` long /*Official Pokémon artwork URLs, including shiny artwork and version-specific variants.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpritesOtherDreamWorld` generated from model 'pokemonSpritesOtherDreamWorld'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOtherDreamWorld` (
  `front_default` text NOT NULL /*The URL of the default Pokémon Dream World front image, or null if unavailable.*/,
  `front_female` text NOT NULL /*The URL of the female Pokémon Dream World front image, or null if unavailable.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpritesOtherHome` generated from model 'pokemonSpritesOtherHome'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOtherHome` (
  `front_default` text NOT NULL /*The URL of the default Pokémon HOME front image, or null if unavailable.*/,
  `front_female` text NOT NULL /*The URL of the female Pokémon HOME front image, or null if unavailable.*/,
  `front_shiny` text NOT NULL /*The URL of the shiny Pokémon HOME front image, or null if unavailable.*/,
  `front_shiny_female` text NOT NULL /*The URL of the shiny female Pokémon HOME front image, or null if unavailable.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpritesOtherOfficialArtwork` generated from model 'pokemonSpritesOtherOfficialArtwork'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOtherOfficialArtwork` (
  `front_default` text NOT NULL /*The URL of the default front official artwork, or null if unavailable.*/,
  `front_shiny` text NOT NULL /*The URL of the shiny front official artwork, or null if unavailable.*/,
  `versions` blob /*Additional official artwork grouped by version. Available keys vary by resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpritesOtherShowdown` generated from model 'pokemonSpritesOtherShowdown'
--

CREATE TABLE IF NOT EXISTS `PokemonSpritesOtherShowdown` (
  `front_default` text NOT NULL /*The URL of the default Pokémon Showdown front image, or null if unavailable.*/,
  `front_female` text NOT NULL /*The URL of the female Pokémon Showdown front image, or null if unavailable.*/,
  `front_shiny` text NOT NULL /*The URL of the shiny Pokémon Showdown front image, or null if unavailable.*/,
  `front_shiny_female` text NOT NULL /*The URL of the shiny female Pokémon Showdown front image, or null if unavailable.*/,
  `back_default` text NOT NULL /*The URL of the default Pokémon Showdown back image, or null if unavailable.*/,
  `back_female` text NOT NULL /*The URL of the female Pokémon Showdown back image, or null if unavailable.*/,
  `back_shiny` text NOT NULL /*The URL of the shiny Pokémon Showdown back image, or null if unavailable.*/,
  `back_shiny_female` text NOT NULL /*The URL of the shiny female Pokémon Showdown back image, or null if unavailable.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonStat` generated from model 'pokemonStat'
--

CREATE TABLE IF NOT EXISTS `PokemonStat` (
  `base_stat` int NOT NULL /*The base value of the stat.*/,
  `effort` int NOT NULL /*The effort points (EV) the Pokémon has in the stat.*/,
  `stat` long NOT NULL /*The stat the Pokémon has.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSummary` generated from model 'pokemonSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonType` generated from model 'pokemonType'
--

CREATE TABLE IF NOT EXISTS `PokemonType` (
  `slot` int NOT NULL /*The order the Pokémon&#39;s types are listed in.*/,
  `type` long NOT NULL /*The type the referenced Pokémon has.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RegionDetail` generated from model 'regionDetail'
--

CREATE TABLE IF NOT EXISTS `RegionDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `main_generation` long NOT NULL /*The generation this region was introduced in.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `RegionDetailLocationSummary` generated from model 'RegionDetailLocationSummary'

CREATE TABLE IF NOT EXISTS `RegionDetailLocationSummary` (
  `regionDetail` long NOT NULL
  `locationSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `RegionDetailRegionName` generated from model 'RegionDetailRegionName'

CREATE TABLE IF NOT EXISTS `RegionDetailRegionName` (
  `regionDetail` long NOT NULL
  `regionName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `RegionDetailPokedexSummary` generated from model 'RegionDetailPokedexSummary'

CREATE TABLE IF NOT EXISTS `RegionDetailPokedexSummary` (
  `regionDetail` long NOT NULL
  `pokedexSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `RegionDetailVersionGroupSummary` generated from model 'RegionDetailVersionGroupSummary'

CREATE TABLE IF NOT EXISTS `RegionDetailVersionGroupSummary` (
  `regionDetail` long NOT NULL
  `versionGroupSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RegionName` generated from model 'regionName'
--

CREATE TABLE IF NOT EXISTS `RegionName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RegionSummary` generated from model 'regionSummary'
--

CREATE TABLE IF NOT EXISTS `RegionSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `StatAffectingMoves` generated from model 'statAffectingMoves'
--

CREATE TABLE IF NOT EXISTS `StatAffectingMoves` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `StatAffectingMovesMoveStatChange` generated from model 'StatAffectingMovesMoveStatChange'

CREATE TABLE IF NOT EXISTS `StatAffectingMovesMoveStatChange` (
  `statAffectingMoves` long NOT NULL
  `moveStatChange` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `StatAffectingMovesMoveStatChange` generated from model 'StatAffectingMovesMoveStatChange'

CREATE TABLE IF NOT EXISTS `StatAffectingMovesMoveStatChange` (
  `statAffectingMoves` long NOT NULL
  `moveStatChange` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `StatAffectingNatures` generated from model 'statAffectingNatures'
--

CREATE TABLE IF NOT EXISTS `StatAffectingNatures` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `StatAffectingNaturesNatureSummary` generated from model 'StatAffectingNaturesNatureSummary'

CREATE TABLE IF NOT EXISTS `StatAffectingNaturesNatureSummary` (
  `statAffectingNatures` long NOT NULL
  `natureSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `StatAffectingNaturesNatureSummary` generated from model 'StatAffectingNaturesNatureSummary'

CREATE TABLE IF NOT EXISTS `StatAffectingNaturesNatureSummary` (
  `statAffectingNatures` long NOT NULL
  `natureSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `StatDetail` generated from model 'statDetail'
--

CREATE TABLE IF NOT EXISTS `StatDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `game_index` int NOT NULL /*ID the games use for this stat.*/,
  `affecting_moves` long NOT NULL /*A detail of moves which affect this stat positively or negatively.*/,
  `affecting_natures` long NOT NULL /*A detail of natures which affect this stat positively or negatively.*/,
  `move_damage_class` long NOT NULL /*The class of damage this stat is directly related to.*/,
  `is_battle_only` boolean /*Whether this stat only exists within a battle.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `StatDetailItemSummary` generated from model 'StatDetailItemSummary'

CREATE TABLE IF NOT EXISTS `StatDetailItemSummary` (
  `statDetail` long NOT NULL
  `itemSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `StatDetailCharacteristicSummary` generated from model 'StatDetailCharacteristicSummary'

CREATE TABLE IF NOT EXISTS `StatDetailCharacteristicSummary` (
  `statDetail` long NOT NULL
  `characteristicSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `StatDetailStatName` generated from model 'StatDetailStatName'

CREATE TABLE IF NOT EXISTS `StatDetailStatName` (
  `statDetail` long NOT NULL
  `statName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `StatName` generated from model 'statName'
--

CREATE TABLE IF NOT EXISTS `StatName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `StatSummary` generated from model 'statSummary'
--

CREATE TABLE IF NOT EXISTS `StatSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SuperContestEffectDetail` generated from model 'superContestEffectDetail'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `appeal` int NOT NULL /*The level of appeal this super contest effect has.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `SuperContestEffectDetailSuperContestEffectFlavorText` generated from model 'SuperContestEffectDetailSuperContestEffectFlavorText'

CREATE TABLE IF NOT EXISTS `SuperContestEffectDetailSuperContestEffectFlavorText` (
  `superContestEffectDetail` long NOT NULL
  `superContestEffectFlavorText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `SuperContestEffectDetailMoveSummary` generated from model 'SuperContestEffectDetailMoveSummary'

CREATE TABLE IF NOT EXISTS `SuperContestEffectDetailMoveSummary` (
  `superContestEffectDetail` long NOT NULL
  `moveSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `SuperContestEffectFlavorText` generated from model 'superContestEffectFlavorText'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectFlavorText` (
  `flavor_text` text NOT NULL /*The localized flavor text for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SuperContestEffectSummary` generated from model 'superContestEffectSummary'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectSummary` (
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetail` generated from model 'typeDetail'
-- Serializer for the Type resource
--

CREATE TABLE IF NOT EXISTS `TypeDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `damage_relations` long NOT NULL /*A detail of how effective this type is toward others and vice versa.*/,
  `generation` long NOT NULL /*The generation this type was introduced in.*/,
  `move_damage_class` long NOT NULL /*The class of damage inflicted by this type.*/,
  `sprites` blob NOT NULL /*Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.*/
);  /*Serializer for the Type resource*/

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailTypePastRelationships` generated from model 'TypeDetailTypePastRelationships'

CREATE TABLE IF NOT EXISTS `TypeDetailTypePastRelationships` (
  `typeDetail` long NOT NULL
  `typePastRelationships` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailTypeGameIndex` generated from model 'TypeDetailTypeGameIndex'

CREATE TABLE IF NOT EXISTS `TypeDetailTypeGameIndex` (
  `typeDetail` long NOT NULL
  `typeGameIndex` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailTypeName` generated from model 'TypeDetailTypeName'

CREATE TABLE IF NOT EXISTS `TypeDetailTypeName` (
  `typeDetail` long NOT NULL
  `typeName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailTypePokemon` generated from model 'TypeDetailTypePokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailTypePokemon` (
  `typeDetail` long NOT NULL
  `typePokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailMoveSummary` generated from model 'TypeDetailMoveSummary'

CREATE TABLE IF NOT EXISTS `TypeDetailMoveSummary` (
  `typeDetail` long NOT NULL
  `moveSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TypeGameIndex` generated from model 'typeGameIndex'
--

CREATE TABLE IF NOT EXISTS `TypeGameIndex` (
  `game_index` int NOT NULL /*The internal id of an API resource within game data.*/,
  `generation` long NOT NULL /*The generation relevent to this game index.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeGameSprite` generated from model 'typeGameSprite'
--

CREATE TABLE IF NOT EXISTS `TypeGameSprite` (
  `name_icon` text /*The URL of the icon displaying the type name in this game, or null if unavailable.*/,
  `symbol_icon` text /*The URL of the type symbol icon in this game, or null if unavailable.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeName` generated from model 'typeName'
--

CREATE TABLE IF NOT EXISTS `TypeName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypePastRelationships` generated from model 'typePastRelationships'
--

CREATE TABLE IF NOT EXISTS `TypePastRelationships` (
  `generation` long NOT NULL /*The last generation in which the referenced type had the listed damage relations*/,
  `damage_relations` long NOT NULL /*The damage relations the referenced type had up to and including the listed generation*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypePokemon` generated from model 'typePokemon'
--

CREATE TABLE IF NOT EXISTS `TypePokemon` (
  `slot` int NOT NULL /*The order the Pokémon&#39;s types are listed in.*/,
  `pokemon` long NOT NULL /*The Pokémon that has the referenced type.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeRelationships` generated from model 'typeRelationships'
--

CREATE TABLE IF NOT EXISTS `TypeRelationships` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TypeRelationshipsTypeSummary` generated from model 'TypeRelationshipsTypeSummary'

CREATE TABLE IF NOT EXISTS `TypeRelationshipsTypeSummary` (
  `typeRelationships` long NOT NULL
  `typeSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeRelationshipsTypeSummary` generated from model 'TypeRelationshipsTypeSummary'

CREATE TABLE IF NOT EXISTS `TypeRelationshipsTypeSummary` (
  `typeRelationships` long NOT NULL
  `typeSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeRelationshipsTypeSummary` generated from model 'TypeRelationshipsTypeSummary'

CREATE TABLE IF NOT EXISTS `TypeRelationshipsTypeSummary` (
  `typeRelationships` long NOT NULL
  `typeSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeRelationshipsTypeSummary` generated from model 'TypeRelationshipsTypeSummary'

CREATE TABLE IF NOT EXISTS `TypeRelationshipsTypeSummary` (
  `typeRelationships` long NOT NULL
  `typeSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeRelationshipsTypeSummary` generated from model 'TypeRelationshipsTypeSummary'

CREATE TABLE IF NOT EXISTS `TypeRelationshipsTypeSummary` (
  `typeRelationships` long NOT NULL
  `typeSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeRelationshipsTypeSummary` generated from model 'TypeRelationshipsTypeSummary'

CREATE TABLE IF NOT EXISTS `TypeRelationshipsTypeSummary` (
  `typeRelationships` long NOT NULL
  `typeSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TypeSummary` generated from model 'typeSummary'
--

CREATE TABLE IF NOT EXISTS `TypeSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionDetail` generated from model 'versionDetail'
-- Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
--

CREATE TABLE IF NOT EXISTS `VersionDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `version_group` long NOT NULL /*The version group this version belongs to.*/
);  /*Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink*/

-- --------------------------------------------------------------------------
-- Table structure for table `VersionDetailVersionName` generated from model 'VersionDetailVersionName'

CREATE TABLE IF NOT EXISTS `VersionDetailVersionName` (
  `versionDetail` long NOT NULL
  `versionName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupDetail` generated from model 'versionGroupDetail'
--

CREATE TABLE IF NOT EXISTS `VersionGroupDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT /*The identifier for this resource.*/,
  `name` text NOT NULL /*The name for this resource.*/,
  `generation` long NOT NULL /*The generation this version was introduced in.*/,
  `order` int /*Order for sorting. Almost by date of release, except similar versions are grouped together.*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupDetailMoveLearnMethodSummary` generated from model 'VersionGroupDetailMoveLearnMethodSummary'

CREATE TABLE IF NOT EXISTS `VersionGroupDetailMoveLearnMethodSummary` (
  `versionGroupDetail` long NOT NULL
  `moveLearnMethodSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupDetailPokedexSummary` generated from model 'VersionGroupDetailPokedexSummary'

CREATE TABLE IF NOT EXISTS `VersionGroupDetailPokedexSummary` (
  `versionGroupDetail` long NOT NULL
  `pokedexSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupDetailRegionSummary` generated from model 'VersionGroupDetailRegionSummary'

CREATE TABLE IF NOT EXISTS `VersionGroupDetailRegionSummary` (
  `versionGroupDetail` long NOT NULL
  `regionSummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupDetailVersionSummary` generated from model 'VersionGroupDetailVersionSummary'

CREATE TABLE IF NOT EXISTS `VersionGroupDetailVersionSummary` (
  `versionGroupDetail` long NOT NULL
  `versionSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupSummary` generated from model 'versionGroupSummary'
--

CREATE TABLE IF NOT EXISTS `VersionGroupSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionName` generated from model 'versionName'
--

CREATE TABLE IF NOT EXISTS `VersionName` (
  `name` text NOT NULL /*The localized name for an API resource in a specific language.*/,
  `language` long NOT NULL /*The language this name is in.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionSummary` generated from model 'versionSummary'
--

CREATE TABLE IF NOT EXISTS `VersionSummary` (
  `name` text NOT NULL /*The name of the referenced resource.*/,
  `url` text NOT NULL /*The URL of the referenced resource.*/
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
