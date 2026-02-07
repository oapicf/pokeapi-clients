

-- --------------------------------------------------------------------------
-- Table structure for table `AbilityChange` generated from model 'abilityChange'
--

CREATE TABLE IF NOT EXISTS `AbilityChange` (
  `version_group` long NOT NULL,
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
  `effect` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetail` generated from model 'abilityDetail'
--

CREATE TABLE IF NOT EXISTS `AbilityDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `generation` long NOT NULL,
  `is_main_series` boolean
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
-- Table structure for table `AbilityDetailAbilityDetailPokemonInner` generated from model 'AbilityDetailAbilityDetailPokemonInner'

CREATE TABLE IF NOT EXISTS `AbilityDetailAbilityDetailPokemonInner` (
  `abilityDetail` long NOT NULL
  `abilityDetailPokemonInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetail_pokemon_inner` generated from model 'abilityDetailPokemonInner'
--

CREATE TABLE IF NOT EXISTS `AbilityDetail_pokemon_inner` (
  `is_hidden` boolean NOT NULL,
  `slot` int NOT NULL,
  `pokemon` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityDetail_pokemon_inner_pokemon` generated from model 'abilityDetailPokemonInnerPokemon'
--

CREATE TABLE IF NOT EXISTS `AbilityDetail_pokemon_inner_pokemon` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityEffectText` generated from model 'abilityEffectText'
--

CREATE TABLE IF NOT EXISTS `AbilityEffectText` (
  `effect` text NOT NULL,
  `short_effect` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityFlavorText` generated from model 'abilityFlavorText'
--

CREATE TABLE IF NOT EXISTS `AbilityFlavorText` (
  `flavor_text` text NOT NULL,
  `language` long NOT NULL,
  `version_group` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilityName` generated from model 'abilityName'
--

CREATE TABLE IF NOT EXISTS `AbilityName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `AbilitySummary` generated from model 'abilitySummary'
--

CREATE TABLE IF NOT EXISTS `AbilitySummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryDetail` generated from model 'berryDetail'
--

CREATE TABLE IF NOT EXISTS `BerryDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `growth_time` int NOT NULL,
  `max_harvest` int NOT NULL,
  `natural_gift_power` int NOT NULL,
  `size` int NOT NULL,
  `smoothness` int NOT NULL,
  `soil_dryness` int NOT NULL,
  `firmness` long NOT NULL,
  `item` long NOT NULL,
  `natural_gift_type` long NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BerryDetailBerryDetailFlavorsInner` generated from model 'BerryDetailBerryDetailFlavorsInner'

CREATE TABLE IF NOT EXISTS `BerryDetailBerryDetailFlavorsInner` (
  `berryDetail` long NOT NULL
  `berryDetailFlavorsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BerryDetail_flavors_inner` generated from model 'berryDetailFlavorsInner'
--

CREATE TABLE IF NOT EXISTS `BerryDetail_flavors_inner` (
  `potency` int NOT NULL,
  `flavor` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryDetail_flavors_inner_flavor` generated from model 'berryDetailFlavorsInnerFlavor'
--

CREATE TABLE IF NOT EXISTS `BerryDetail_flavors_inner_flavor` (
  `name` text /*The name of the flavor*/,
  `url` text /*The URL to get more information about the flavor*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFirmnessDetail` generated from model 'berryFirmnessDetail'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFirmnessSummary` generated from model 'berryFirmnessSummary'
--

CREATE TABLE IF NOT EXISTS `BerryFirmnessSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorDetail` generated from model 'berryFlavorDetail'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `contest_type` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorDetailBerryFlavorDetailBerriesInner` generated from model 'BerryFlavorDetailBerryFlavorDetailBerriesInner'

CREATE TABLE IF NOT EXISTS `BerryFlavorDetailBerryFlavorDetailBerriesInner` (
  `berryFlavorDetail` long NOT NULL
  `berryFlavorDetailBerriesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorDetailBerryFlavorName` generated from model 'BerryFlavorDetailBerryFlavorName'

CREATE TABLE IF NOT EXISTS `BerryFlavorDetailBerryFlavorName` (
  `berryFlavorDetail` long NOT NULL
  `berryFlavorName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorDetail_berries_inner` generated from model 'berryFlavorDetailBerriesInner'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorDetail_berries_inner` (
  `potency` int NOT NULL,
  `berry` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorDetail_berries_inner_berry` generated from model 'berryFlavorDetailBerriesInnerBerry'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorDetail_berries_inner_berry` (
  `name` text /*The name of the berry*/,
  `url` text /*The URL to get more information about the berry*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorName` generated from model 'berryFlavorName'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerryFlavorSummary` generated from model 'berryFlavorSummary'
--

CREATE TABLE IF NOT EXISTS `BerryFlavorSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `BerrySummary` generated from model 'berrySummary'
--

CREATE TABLE IF NOT EXISTS `BerrySummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CharacteristicDescription` generated from model 'characteristicDescription'
--

CREATE TABLE IF NOT EXISTS `CharacteristicDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `CharacteristicDetail` generated from model 'characteristicDetail'
--

CREATE TABLE IF NOT EXISTS `CharacteristicDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `gene_modulo` int NOT NULL,
  `highest_stat` long NOT NULL,
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
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectDetail` generated from model 'contestEffectDetail'
--

CREATE TABLE IF NOT EXISTS `ContestEffectDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `appeal` int NOT NULL,
  `jam` int NOT NULL,
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
  `effect` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectFlavorText` generated from model 'contestEffectFlavorText'
--

CREATE TABLE IF NOT EXISTS `ContestEffectFlavorText` (
  `flavor_text` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestEffectSummary` generated from model 'contestEffectSummary'
--

CREATE TABLE IF NOT EXISTS `ContestEffectSummary` (
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestTypeDetail` generated from model 'contestTypeDetail'
--

CREATE TABLE IF NOT EXISTS `ContestTypeDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `berry_flavor` long NOT NULL,
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
  `name` text NOT NULL,
  `color` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ContestTypeSummary` generated from model 'contestTypeSummary'
--

CREATE TABLE IF NOT EXISTS `ContestTypeSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupDetail` generated from model 'eggGroupDetail'
--

CREATE TABLE IF NOT EXISTS `EggGroupDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupDetailEggGroupName` generated from model 'EggGroupDetailEggGroupName'

CREATE TABLE IF NOT EXISTS `EggGroupDetailEggGroupName` (
  `eggGroupDetail` long NOT NULL
  `eggGroupName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupDetailEggGroupDetailPokemonSpeciesInner` generated from model 'EggGroupDetailEggGroupDetailPokemonSpeciesInner'

CREATE TABLE IF NOT EXISTS `EggGroupDetailEggGroupDetailPokemonSpeciesInner` (
  `eggGroupDetail` long NOT NULL
  `eggGroupDetailPokemonSpeciesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupDetail_pokemon_species_inner` generated from model 'eggGroupDetailPokemonSpeciesInner'
--

CREATE TABLE IF NOT EXISTS `EggGroupDetail_pokemon_species_inner` (
  `name` text /*Pokemon species name.*/,
  `url` text /*The URL to get more information about the species*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupName` generated from model 'eggGroupName'
--

CREATE TABLE IF NOT EXISTS `EggGroupName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EggGroupSummary` generated from model 'eggGroupSummary'
--

CREATE TABLE IF NOT EXISTS `EggGroupSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionDetail` generated from model 'encounterConditionDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionSummary` generated from model 'encounterConditionSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionValueDetail` generated from model 'encounterConditionValueDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `condition` long NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterConditionValueSummary` generated from model 'encounterConditionValueSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterConditionValueSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterMethodDetail` generated from model 'encounterMethodDetail'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `order` int
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EncounterMethodSummary` generated from model 'encounterMethodSummary'
--

CREATE TABLE IF NOT EXISTS `EncounterMethodSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetail` generated from model 'evolutionChainDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `baby_trigger_item` long NOT NULL,
  `chain` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetail_chain` generated from model 'evolutionChainDetailChain'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail_chain` (
  `is_baby` boolean NOT NULL,
  `species` long NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetailChainEvolutionDetails` generated from model 'EvolutionChainDetailChainEvolutionDetails'

CREATE TABLE IF NOT EXISTS `EvolutionChainDetailChainEvolutionDetails` (
  `evolutionChainDetailChain` long NOT NULL
  `evolutionDetails` blob NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetailChainEvolutionChainDetailChainEvolvesToInner` generated from model 'EvolutionChainDetailChainEvolutionChainDetailChainEvolvesToInner'

CREATE TABLE IF NOT EXISTS `EvolutionChainDetailChainEvolutionChainDetailChainEvolvesToInner` (
  `evolutionChainDetailChain` long NOT NULL
  `evolutionChainDetailChainEvolvesToInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetail_chain_evolves_to_inner` generated from model 'evolutionChainDetailChainEvolvesToInner'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail_chain_evolves_to_inner` (
  `is_baby` boolean NOT NULL,
  `species` long NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetailChainEvolvesToInnerEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner` generated from model 'EvolutionChainDetailChainEvolvesToInnerEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner'

CREATE TABLE IF NOT EXISTS `EvolutionChainDetailChainEvolvesToInnerEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner` (
  `evolutionChainDetailChainEvolvesToInner` long NOT NULL
  `evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner` generated from model 'evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner` (
  `gender` long NOT NULL,
  `held_item` long NOT NULL,
  `item` long NOT NULL,
  `known_move` blob NOT NULL,
  `known_move_type` blob NOT NULL,
  `location` long NOT NULL,
  `min_affection` int NOT NULL,
  `min_beauty` int NOT NULL,
  `min_happiness` int NOT NULL,
  `min_level` int NOT NULL,
  `needs_overworld_rain` boolean NOT NULL,
  `party_species` text NOT NULL,
  `party_type` text NOT NULL,
  `relative_physical_stats` text NOT NULL,
  `time_of_day` text NOT NULL,
  `trade_species` text NOT NULL,
  `trigger` long NOT NULL,
  `turn_upside_down` boolean NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender` generated from model 'evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionChainSummary` generated from model 'evolutionChainSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionChainSummary` (
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerDetail` generated from model 'evolutionTriggerDetail'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerDetailEvolutionTriggerName` generated from model 'EvolutionTriggerDetailEvolutionTriggerName'

CREATE TABLE IF NOT EXISTS `EvolutionTriggerDetailEvolutionTriggerName` (
  `evolutionTriggerDetail` long NOT NULL
  `evolutionTriggerName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerDetailAbilityDetailPokemonInnerPokemon` generated from model 'EvolutionTriggerDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `EvolutionTriggerDetailAbilityDetailPokemonInnerPokemon` (
  `evolutionTriggerDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerName` generated from model 'evolutionTriggerName'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `EvolutionTriggerSummary` generated from model 'evolutionTriggerSummary'
--

CREATE TABLE IF NOT EXISTS `EvolutionTriggerSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Experience` generated from model 'experience'
--

CREATE TABLE IF NOT EXISTS `Experience` (
  `level` int NOT NULL,
  `experience` int NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenderDetail` generated from model 'genderDetail'
--

CREATE TABLE IF NOT EXISTS `GenderDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `GenderDetailGenderDetailPokemonSpeciesDetailsInner` generated from model 'GenderDetailGenderDetailPokemonSpeciesDetailsInner'

CREATE TABLE IF NOT EXISTS `GenderDetailGenderDetailPokemonSpeciesDetailsInner` (
  `genderDetail` long NOT NULL
  `genderDetailPokemonSpeciesDetailsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `GenderDetailAbilityDetailPokemonInnerPokemon` generated from model 'GenderDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `GenderDetailAbilityDetailPokemonInnerPokemon` (
  `genderDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `GenderDetail_pokemon_species_details_inner` generated from model 'genderDetailPokemonSpeciesDetailsInner'
--

CREATE TABLE IF NOT EXISTS `GenderDetail_pokemon_species_details_inner` (
  `rate` int NOT NULL,
  `pokemon_species` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenderSummary` generated from model 'genderSummary'
--

CREATE TABLE IF NOT EXISTS `GenderSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenerationDetail` generated from model 'generationDetail'
--

CREATE TABLE IF NOT EXISTS `GenerationDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `main_region` long NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GenerationSummary` generated from model 'generationSummary'
--

CREATE TABLE IF NOT EXISTS `GenerationSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GrowthRateDescription` generated from model 'growthRateDescription'
--

CREATE TABLE IF NOT EXISTS `GrowthRateDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GrowthRateDetail` generated from model 'growthRateDetail'
--

CREATE TABLE IF NOT EXISTS `GrowthRateDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `formula` text NOT NULL,
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
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDescription` generated from model 'itemAttributeDescription'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDetail` generated from model 'itemAttributeDetail'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDetailItemAttributeDescription` generated from model 'ItemAttributeDetailItemAttributeDescription'

CREATE TABLE IF NOT EXISTS `ItemAttributeDetailItemAttributeDescription` (
  `itemAttributeDetail` long NOT NULL
  `itemAttributeDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeDetailAbilityDetailPokemonInnerPokemon` generated from model 'ItemAttributeDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `ItemAttributeDetailAbilityDetailPokemonInnerPokemon` (
  `itemAttributeDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemAttributeSummary` generated from model 'itemAttributeSummary'
--

CREATE TABLE IF NOT EXISTS `ItemAttributeSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemCategoryDetail` generated from model 'itemCategoryDetail'
--

CREATE TABLE IF NOT EXISTS `ItemCategoryDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `pocket` long NOT NULL
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemCategorySummary` generated from model 'itemCategorySummary'
--

CREATE TABLE IF NOT EXISTS `ItemCategorySummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetail` generated from model 'itemDetail'
--

CREATE TABLE IF NOT EXISTS `ItemDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `fling_effect` long NOT NULL,
  `category` long NOT NULL,
  `sprites` long NOT NULL,
  `baby_trigger_for` long NOT NULL,
  `cost` int,
  `fling_power` int
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailAbilityDetailPokemonInnerPokemon` generated from model 'ItemDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `ItemDetailAbilityDetailPokemonInnerPokemon` (
  `itemDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
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
-- Table structure for table `ItemDetailItemName` generated from model 'ItemDetailItemName'

CREATE TABLE IF NOT EXISTS `ItemDetailItemName` (
  `itemDetail` long NOT NULL
  `itemName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemDetailHeldByPokemonInner` generated from model 'ItemDetailItemDetailHeldByPokemonInner'

CREATE TABLE IF NOT EXISTS `ItemDetailItemDetailHeldByPokemonInner` (
  `itemDetail` long NOT NULL
  `itemDetailHeldByPokemonInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailItemDetailMachinesInner` generated from model 'ItemDetailItemDetailMachinesInner'

CREATE TABLE IF NOT EXISTS `ItemDetailItemDetailMachinesInner` (
  `itemDetail` long NOT NULL
  `itemDetailMachinesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetail_baby_trigger_for` generated from model 'itemDetailBabyTriggerFor'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_baby_trigger_for` (
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetail_held_by_pokemon_inner` generated from model 'itemDetailHeldByPokemonInner'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_held_by_pokemon_inner` (
  `pokemon` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetailHeldByPokemonInnerItemDetailHeldByPokemonInnerVersionDetailsInner` generated from model 'ItemDetailHeldByPokemonInnerItemDetailHeldByPokemonInnerVersionDetailsInner'

CREATE TABLE IF NOT EXISTS `ItemDetailHeldByPokemonInnerItemDetailHeldByPokemonInnerVersionDetailsInner` (
  `itemDetailHeldByPokemonInner` long NOT NULL
  `itemDetailHeldByPokemonInnerVersionDetailsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetail_held_by_pokemon_inner_version_details_inner` generated from model 'itemDetailHeldByPokemonInnerVersionDetailsInner'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_held_by_pokemon_inner_version_details_inner` (
  `rarity` int NOT NULL,
  `version` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetail_machines_inner` generated from model 'itemDetailMachinesInner'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_machines_inner` (
  `machine` text NOT NULL,
  `version_group` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemDetail_sprites` generated from model 'itemDetailSprites'
--

CREATE TABLE IF NOT EXISTS `ItemDetail_sprites` (
  `default` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemEffectText` generated from model 'itemEffectText'
--

CREATE TABLE IF NOT EXISTS `ItemEffectText` (
  `effect` text NOT NULL,
  `short_effect` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlavorText` generated from model 'itemFlavorText'
--

CREATE TABLE IF NOT EXISTS `ItemFlavorText` (
  `text` text NOT NULL,
  `version_group` long NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlingEffectDetail` generated from model 'itemFlingEffectDetail'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `effect` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemFlingEffectSummary` generated from model 'itemFlingEffectSummary'
--

CREATE TABLE IF NOT EXISTS `ItemFlingEffectSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemGameIndex` generated from model 'itemGameIndex'
--

CREATE TABLE IF NOT EXISTS `ItemGameIndex` (
  `game_index` int NOT NULL,
  `generation` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemName` generated from model 'itemName'
--

CREATE TABLE IF NOT EXISTS `ItemName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemPocketDetail` generated from model 'itemPocketDetail'
--

CREATE TABLE IF NOT EXISTS `ItemPocketDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemPocketSummary` generated from model 'itemPocketSummary'
--

CREATE TABLE IF NOT EXISTS `ItemPocketSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ItemSummary` generated from model 'itemSummary'
--

CREATE TABLE IF NOT EXISTS `ItemSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LanguageDetail` generated from model 'languageDetail'
--

CREATE TABLE IF NOT EXISTS `LanguageDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `iso639` text NOT NULL,
  `iso3166` text NOT NULL,
  `official` boolean
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LanguageSummary` generated from model 'languageSummary'
--

CREATE TABLE IF NOT EXISTS `LanguageSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetail` generated from model 'locationAreaDetail'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `game_index` int NOT NULL,
  `location` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetailLocationAreaDetailEncounterMethodRatesInner` generated from model 'LocationAreaDetailLocationAreaDetailEncounterMethodRatesInner'

CREATE TABLE IF NOT EXISTS `LocationAreaDetailLocationAreaDetailEncounterMethodRatesInner` (
  `locationAreaDetail` long NOT NULL
  `locationAreaDetailEncounterMethodRatesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetailLocationAreaName` generated from model 'LocationAreaDetailLocationAreaName'

CREATE TABLE IF NOT EXISTS `LocationAreaDetailLocationAreaName` (
  `locationAreaDetail` long NOT NULL
  `locationAreaName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetailLocationAreaDetailPokemonEncountersInner` generated from model 'LocationAreaDetailLocationAreaDetailPokemonEncountersInner'

CREATE TABLE IF NOT EXISTS `LocationAreaDetailLocationAreaDetailPokemonEncountersInner` (
  `locationAreaDetail` long NOT NULL
  `locationAreaDetailPokemonEncountersInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetail_encounter_method_rates_inner` generated from model 'locationAreaDetailEncounterMethodRatesInner'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_encounter_method_rates_inner` (
  `encounter_method` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetailEncounterMethodRatesInnerLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner` generated from model 'LocationAreaDetailEncounterMethodRatesInnerLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner'

CREATE TABLE IF NOT EXISTS `LocationAreaDetailEncounterMethodRatesInnerLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner` (
  `locationAreaDetailEncounterMethodRatesInner` long NOT NULL
  `locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetail_encounter_method_rates_inner_version_details_inner` generated from model 'locationAreaDetailEncounterMethodRatesInnerVersionDetailsInner'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_encounter_method_rates_inner_version_details_inner` (
  `rate` int NOT NULL,
  `version` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetail_pokemon_encounters_inner` generated from model 'locationAreaDetailPokemonEncountersInner'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_pokemon_encounters_inner` (
  `pokemon` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetailPokemonEncountersInnerLocationAreaDetailPokemonEncountersInnerVersionDetailsInner` generated from model 'LocationAreaDetailPokemonEncountersInnerLocationAreaDetailPokemonEncountersInnerVersionDetailsInner'

CREATE TABLE IF NOT EXISTS `LocationAreaDetailPokemonEncountersInnerLocationAreaDetailPokemonEncountersInnerVersionDetailsInner` (
  `locationAreaDetailPokemonEncountersInner` long NOT NULL
  `locationAreaDetailPokemonEncountersInnerVersionDetailsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inner` generated from model 'locationAreaDetailPokemonEncountersInnerVersionDetailsInner'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_pokemon_encounters_inner_version_details_inner` (
  `version` long NOT NULL,
  `max_chance` int NOT NULL,
  `encounter_details` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details` generated from model 'locationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails'
--

CREATE TABLE IF NOT EXISTS `LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details` (
  `min_level` int NOT NULL,
  `max_level` int NOT NULL,
  `chance` int NOT NULL,
  `method` long NOT NULL,
  `condition_values` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaName` generated from model 'locationAreaName'
--

CREATE TABLE IF NOT EXISTS `LocationAreaName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationAreaSummary` generated from model 'locationAreaSummary'
--

CREATE TABLE IF NOT EXISTS `LocationAreaSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationDetail` generated from model 'locationDetail'
--

CREATE TABLE IF NOT EXISTS `LocationDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `region` long NOT NULL,
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
  `game_index` int NOT NULL,
  `generation` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationName` generated from model 'locationName'
--

CREATE TABLE IF NOT EXISTS `LocationName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `LocationSummary` generated from model 'locationSummary'
--

CREATE TABLE IF NOT EXISTS `LocationSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MachineDetail` generated from model 'machineDetail'
--

CREATE TABLE IF NOT EXISTS `MachineDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `item` long NOT NULL,
  `version_group` long NOT NULL,
  `move` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MachineSummary` generated from model 'machineSummary'
--

CREATE TABLE IF NOT EXISTS `MachineSummary` (
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveBattleStyleDetail` generated from model 'moveBattleStyleDetail'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveBattleStyleSummary` generated from model 'moveBattleStyleSummary'
--

CREATE TABLE IF NOT EXISTS `MoveBattleStyleSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveChange` generated from model 'moveChange'
--

CREATE TABLE IF NOT EXISTS `MoveChange` (
  `effect_chance` int NOT NULL,
  `type` long NOT NULL,
  `version_group` long NOT NULL,
  `accuracy` int,
  `power` int,
  `pp` int
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveChangeMoveChangeEffectEntriesInner` generated from model 'MoveChangeMoveChangeEffectEntriesInner'

CREATE TABLE IF NOT EXISTS `MoveChangeMoveChangeEffectEntriesInner` (
  `moveChange` long NOT NULL
  `moveChangeEffectEntriesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveChange_effect_entries_inner` generated from model 'moveChangeEffectEntriesInner'
--

CREATE TABLE IF NOT EXISTS `MoveChange_effect_entries_inner` (
  `effect` text NOT NULL,
  `short_effect` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassDescription` generated from model 'moveDamageClassDescription'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassDetail` generated from model 'moveDamageClassDetail'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDamageClassSummary` generated from model 'moveDamageClassSummary'
--

CREATE TABLE IF NOT EXISTS `MoveDamageClassSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail` generated from model 'moveDetail'
--

CREATE TABLE IF NOT EXISTS `MoveDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `effect_chance` int NOT NULL,
  `contest_combos` long NOT NULL,
  `contest_type` long NOT NULL,
  `contest_effect` long NOT NULL,
  `damage_class` long NOT NULL,
  `generation` long NOT NULL,
  `meta` long NOT NULL,
  `super_contest_effect` long NOT NULL,
  `target` long NOT NULL,
  `type` long NOT NULL,
  `accuracy` int,
  `pp` int,
  `priority` int,
  `power` int
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveChangeEffectEntriesInner` generated from model 'MoveDetailMoveChangeEffectEntriesInner'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveChangeEffectEntriesInner` (
  `moveDetail` long NOT NULL
  `moveChangeEffectEntriesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveDetailEffectChangesInner` generated from model 'MoveDetailMoveDetailEffectChangesInner'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveDetailEffectChangesInner` (
  `moveDetail` long NOT NULL
  `moveDetailEffectChangesInner` long NOT NULL
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
-- Table structure for table `MoveDetailMoveDetailStatChangesInner` generated from model 'MoveDetailMoveDetailStatChangesInner'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveDetailStatChangesInner` (
  `moveDetail` long NOT NULL
  `moveDetailStatChangesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveDetailMachinesInner` generated from model 'MoveDetailMoveDetailMachinesInner'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveDetailMachinesInner` (
  `moveDetail` long NOT NULL
  `moveDetailMachinesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailMoveFlavorText` generated from model 'MoveDetailMoveFlavorText'

CREATE TABLE IF NOT EXISTS `MoveDetailMoveFlavorText` (
  `moveDetail` long NOT NULL
  `moveFlavorText` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailAbilityDetailPokemonInnerPokemon` generated from model 'MoveDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `MoveDetailAbilityDetailPokemonInnerPokemon` (
  `moveDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail_contest_combos` generated from model 'moveDetailContestCombos'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_contest_combos` (
  `normal` long NOT NULL,
  `super` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail_contest_combos_normal` generated from model 'moveDetailContestCombosNormal'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_contest_combos_normal` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon` generated from model 'MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon` (
  `moveDetailContestCombosNormal` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon` generated from model 'MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `MoveDetailContestCombosNormalAbilityDetailPokemonInnerPokemon` (
  `moveDetailContestCombosNormal` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail_effect_changes_inner` generated from model 'moveDetailEffectChangesInner'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_effect_changes_inner` (
  `version_group` long NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetailEffectChangesInnerMoveDetailEffectChangesInnerEffectEntriesInner` generated from model 'MoveDetailEffectChangesInnerMoveDetailEffectChangesInnerEffectEntriesInner'

CREATE TABLE IF NOT EXISTS `MoveDetailEffectChangesInnerMoveDetailEffectChangesInnerEffectEntriesInner` (
  `moveDetailEffectChangesInner` long NOT NULL
  `moveDetailEffectChangesInnerEffectEntriesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail_effect_changes_inner_effect_entries_inner` generated from model 'moveDetailEffectChangesInnerEffectEntriesInner'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_effect_changes_inner_effect_entries_inner` (
  `effect` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail_machines_inner` generated from model 'moveDetailMachinesInner'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_machines_inner` (
  `machine` long NOT NULL,
  `version_group` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail_machines_inner_machine` generated from model 'moveDetailMachinesInnerMachine'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_machines_inner_machine` (
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveDetail_stat_changes_inner` generated from model 'moveDetailStatChangesInner'
--

CREATE TABLE IF NOT EXISTS `MoveDetail_stat_changes_inner` (
  `change` int NOT NULL,
  `stat` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveFlavorText` generated from model 'moveFlavorText'
--

CREATE TABLE IF NOT EXISTS `MoveFlavorText` (
  `flavor_text` text NOT NULL,
  `language` long NOT NULL,
  `version_group` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodDescription` generated from model 'moveLearnMethodDescription'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodDetail` generated from model 'moveLearnMethodDetail'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
-- Table structure for table `MoveLearnMethodDetailAbilityDetailPokemonInnerPokemon` generated from model 'MoveLearnMethodDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `MoveLearnMethodDetailAbilityDetailPokemonInnerPokemon` (
  `moveLearnMethodDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodName` generated from model 'moveLearnMethodName'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveLearnMethodSummary` generated from model 'moveLearnMethodSummary'
--

CREATE TABLE IF NOT EXISTS `MoveLearnMethodSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMeta` generated from model 'moveMeta'
--

CREATE TABLE IF NOT EXISTS `MoveMeta` (
  `ailment` long NOT NULL,
  `category` long NOT NULL,
  `min_hits` int,
  `max_hits` int,
  `min_turns` int,
  `max_turns` int,
  `drain` int,
  `healing` int,
  `crit_rate` int,
  `ailment_chance` int,
  `flinch_chance` int,
  `stat_chance` int
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaAilmentDetail` generated from model 'moveMetaAilmentDetail'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaAilmentDetailAbilityDetailPokemonInnerPokemon` generated from model 'MoveMetaAilmentDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentDetailAbilityDetailPokemonInnerPokemon` (
  `moveMetaAilmentDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaAilmentSummary` generated from model 'moveMetaAilmentSummary'
--

CREATE TABLE IF NOT EXISTS `MoveMetaAilmentSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategoryDescription` generated from model 'moveMetaCategoryDescription'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategoryDetail` generated from model 'moveMetaCategoryDetail'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategoryDetailMoveMetaCategoryDescription` generated from model 'MoveMetaCategoryDetailMoveMetaCategoryDescription'

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDetailMoveMetaCategoryDescription` (
  `moveMetaCategoryDetail` long NOT NULL
  `moveMetaCategoryDescription` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategoryDetailAbilityDetailPokemonInnerPokemon` generated from model 'MoveMetaCategoryDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `MoveMetaCategoryDetailAbilityDetailPokemonInnerPokemon` (
  `moveMetaCategoryDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `MoveMetaCategorySummary` generated from model 'moveMetaCategorySummary'
--

CREATE TABLE IF NOT EXISTS `MoveMetaCategorySummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveName` generated from model 'moveName'
--

CREATE TABLE IF NOT EXISTS `MoveName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveSummary` generated from model 'moveSummary'
--

CREATE TABLE IF NOT EXISTS `MoveSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetDescription` generated from model 'moveTargetDescription'
--

CREATE TABLE IF NOT EXISTS `MoveTargetDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetDetail` generated from model 'moveTargetDetail'
--

CREATE TABLE IF NOT EXISTS `MoveTargetDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MoveTargetSummary` generated from model 'moveTargetSummary'
--

CREATE TABLE IF NOT EXISTS `MoveTargetSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NatureBattleStylePreference` generated from model 'natureBattleStylePreference'
--

CREATE TABLE IF NOT EXISTS `NatureBattleStylePreference` (
  `low_hp_preference` int NOT NULL,
  `high_hp_preference` int NOT NULL,
  `move_battle_style` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NatureDetail` generated from model 'natureDetail'
--

CREATE TABLE IF NOT EXISTS `NatureDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `decreased_stat` long NOT NULL,
  `increased_stat` long NOT NULL,
  `likes_flavor` long NOT NULL,
  `hates_flavor` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `NatureDetailBerrySummary` generated from model 'NatureDetailBerrySummary'

CREATE TABLE IF NOT EXISTS `NatureDetailBerrySummary` (
  `natureDetail` long NOT NULL
  `berrySummary` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `NatureDetailNatureDetailPokeathlonStatChangesInner` generated from model 'NatureDetailNatureDetailPokeathlonStatChangesInner'

CREATE TABLE IF NOT EXISTS `NatureDetailNatureDetailPokeathlonStatChangesInner` (
  `natureDetail` long NOT NULL
  `natureDetailPokeathlonStatChangesInner` long NOT NULL
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
-- Table structure for table `NatureDetail_pokeathlon_stat_changes_inner` generated from model 'natureDetailPokeathlonStatChangesInner'
--

CREATE TABLE IF NOT EXISTS `NatureDetail_pokeathlon_stat_changes_inner` (
  `max_change` int NOT NULL,
  `pokeathlon_stat` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NatureName` generated from model 'natureName'
--

CREATE TABLE IF NOT EXISTS `NatureName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `NatureSummary` generated from model 'natureSummary'
--

CREATE TABLE IF NOT EXISTS `NatureSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedAbilitySummaryList` generated from model 'paginatedAbilitySummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedAbilitySummaryList` (
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedContestTypeSummaryListContestTypeSummary` generated from model 'PaginatedContestTypeSummaryListContestTypeSummary'

CREATE TABLE IF NOT EXISTS `PaginatedContestTypeSummaryListContestTypeSummary` (
  `paginatedContestTypeSummaryList` long NOT NULL
  `contestTypeSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEggGroupSummaryList` generated from model 'paginatedEggGroupSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedEggGroupSummaryList` (
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedEvolutionTriggerSummaryListEvolutionTriggerSummary` generated from model 'PaginatedEvolutionTriggerSummaryListEvolutionTriggerSummary'

CREATE TABLE IF NOT EXISTS `PaginatedEvolutionTriggerSummaryListEvolutionTriggerSummary` (
  `paginatedEvolutionTriggerSummaryList` long NOT NULL
  `evolutionTriggerSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PaginatedGenderSummaryList` generated from model 'paginatedGenderSummaryList'
--

CREATE TABLE IF NOT EXISTS `PaginatedGenderSummaryList` (
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `count` int,
  `next` text,
  `previous` text,
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
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaDetailPalParkAreaName` generated from model 'PalParkAreaDetailPalParkAreaName'

CREATE TABLE IF NOT EXISTS `PalParkAreaDetailPalParkAreaName` (
  `palParkAreaDetail` long NOT NULL
  `palParkAreaName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaDetailPalParkAreaDetailPokemonEncountersInner` generated from model 'PalParkAreaDetailPalParkAreaDetailPokemonEncountersInner'

CREATE TABLE IF NOT EXISTS `PalParkAreaDetailPalParkAreaDetailPokemonEncountersInner` (
  `palParkAreaDetail` long NOT NULL
  `palParkAreaDetailPokemonEncountersInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaDetail_pokemon_encounters_inner` generated from model 'palParkAreaDetailPokemonEncountersInner'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaDetail_pokemon_encounters_inner` (
  `base_score` int NOT NULL,
  `pokemonspecies` long NOT NULL,
  `rate` int NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaName` generated from model 'palParkAreaName'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PalParkAreaSummary` generated from model 'palParkAreaSummary'
--

CREATE TABLE IF NOT EXISTS `PalParkAreaSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetail` generated from model 'pokeathlonStatDetail'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `affecting_natures` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetailPokeathlonStatName` generated from model 'PokeathlonStatDetailPokeathlonStatName'

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetailPokeathlonStatName` (
  `pokeathlonStatDetail` long NOT NULL
  `pokeathlonStatName` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetail_affecting_natures` generated from model 'pokeathlonStatDetailAffectingNatures'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail_affecting_natures` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesDecreaseInner` generated from model 'PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesDecreaseInner'

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesDecreaseInner` (
  `pokeathlonStatDetailAffectingNatures` long NOT NULL
  `pokeathlonStatDetailAffectingNaturesDecreaseInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesIncreaseInner` generated from model 'PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesIncreaseInner'

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetailAffectingNaturesPokeathlonStatDetailAffectingNaturesIncreaseInner` (
  `pokeathlonStatDetailAffectingNatures` long NOT NULL
  `pokeathlonStatDetailAffectingNaturesIncreaseInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetail_affecting_natures_decrease_inner` generated from model 'pokeathlonStatDetailAffectingNaturesDecreaseInner'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail_affecting_natures_decrease_inner` (
  `max_change` int NOT NULL,
  `nature` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatDetail_affecting_natures_increase_inner` generated from model 'pokeathlonStatDetailAffectingNaturesIncreaseInner'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatDetail_affecting_natures_increase_inner` (
  `max_change` int UNSIGNED NOT NULL,
  `nature` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatName` generated from model 'pokeathlonStatName'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokeathlonStatSummary` generated from model 'pokeathlonStatSummary'
--

CREATE TABLE IF NOT EXISTS `PokeathlonStatSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDescription` generated from model 'pokedexDescription'
--

CREATE TABLE IF NOT EXISTS `PokedexDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDetail` generated from model 'pokedexDetail'
--

CREATE TABLE IF NOT EXISTS `PokedexDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `region` long NOT NULL,
  `is_main_series` boolean
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
-- Table structure for table `PokedexDetailPokedexDetailPokemonEntriesInner` generated from model 'PokedexDetailPokedexDetailPokemonEntriesInner'

CREATE TABLE IF NOT EXISTS `PokedexDetailPokedexDetailPokemonEntriesInner` (
  `pokedexDetail` long NOT NULL
  `pokedexDetailPokemonEntriesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDetailAbilityDetailPokemonInnerPokemon` generated from model 'PokedexDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `PokedexDetailAbilityDetailPokemonInnerPokemon` (
  `pokedexDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexDetail_pokemon_entries_inner` generated from model 'pokedexDetailPokemonEntriesInner'
--

CREATE TABLE IF NOT EXISTS `PokedexDetail_pokemon_entries_inner` (
  `entry_number` int NOT NULL,
  `pokemon_species` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexName` generated from model 'pokedexName'
--

CREATE TABLE IF NOT EXISTS `PokedexName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokedexSummary` generated from model 'pokedexSummary'
--

CREATE TABLE IF NOT EXISTS `PokedexSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonColorDetail` generated from model 'pokemonColorDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonColorDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonColorSummary` generated from model 'pokemonColorSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonColorSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail` generated from model 'pokemonDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `held_items` long NOT NULL,
  `location_area_encounters` text NOT NULL,
  `species` long NOT NULL,
  `sprites` long NOT NULL,
  `cries` long NOT NULL,
  `base_experience` int,
  `height` int,
  `is_default` boolean,
  `order` int,
  `weight` int
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonDetailAbilitiesInner` generated from model 'PokemonDetailPokemonDetailAbilitiesInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonDetailAbilitiesInner` (
  `pokemonDetail` long NOT NULL
  `pokemonDetailAbilitiesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonDetailPastAbilitiesInner` generated from model 'PokemonDetailPokemonDetailPastAbilitiesInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonDetailPastAbilitiesInner` (
  `pokemonDetail` long NOT NULL
  `pokemonDetailPastAbilitiesInner` long NOT NULL
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
-- Table structure for table `PokemonDetailPokemonDetailMovesInner` generated from model 'PokemonDetailPokemonDetailMovesInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonDetailMovesInner` (
  `pokemonDetail` long NOT NULL
  `pokemonDetailMovesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonStat` generated from model 'PokemonDetailPokemonStat'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonStat` (
  `pokemonDetail` long NOT NULL
  `pokemonStat` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonDetailTypesInner` generated from model 'PokemonDetailPokemonDetailTypesInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonDetailTypesInner` (
  `pokemonDetail` long NOT NULL
  `pokemonDetailTypesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPokemonDetailPastTypesInner` generated from model 'PokemonDetailPokemonDetailPastTypesInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailPokemonDetailPastTypesInner` (
  `pokemonDetail` long NOT NULL
  `pokemonDetailPastTypesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_abilities_inner` generated from model 'pokemonDetailAbilitiesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_abilities_inner` (
  `ability` long NOT NULL,
  `is_hidden` boolean NOT NULL,
  `slot` int NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_cries` generated from model 'pokemonDetailCries'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_cries` (
  `latest` text NOT NULL,
  `legacy` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_held_items` generated from model 'pokemonDetailHeldItems'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_held_items` (
  `item` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailHeldItemsItemDetailHeldByPokemonInnerVersionDetailsInner` generated from model 'PokemonDetailHeldItemsItemDetailHeldByPokemonInnerVersionDetailsInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailHeldItemsItemDetailHeldByPokemonInnerVersionDetailsInner` (
  `pokemonDetailHeldItems` long NOT NULL
  `itemDetailHeldByPokemonInnerVersionDetailsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_moves_inner` generated from model 'pokemonDetailMovesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_moves_inner` (
  `move` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailMovesInnerPokemonDetailMovesInnerVersionGroupDetailsInner` generated from model 'PokemonDetailMovesInnerPokemonDetailMovesInnerVersionGroupDetailsInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailMovesInnerPokemonDetailMovesInnerVersionGroupDetailsInner` (
  `pokemonDetailMovesInner` long NOT NULL
  `pokemonDetailMovesInnerVersionGroupDetailsInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_moves_inner_version_group_details_inner` generated from model 'pokemonDetailMovesInnerVersionGroupDetailsInner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_moves_inner_version_group_details_inner` (
  `level_learned_at` int NOT NULL,
  `move_learn_method` long NOT NULL,
  `version_group` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_past_abilities_inner` generated from model 'pokemonDetailPastAbilitiesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_past_abilities_inner` (
  `generation` long NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPastAbilitiesInnerPokemonDetailAbilitiesInner` generated from model 'PokemonDetailPastAbilitiesInnerPokemonDetailAbilitiesInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailPastAbilitiesInnerPokemonDetailAbilitiesInner` (
  `pokemonDetailPastAbilitiesInner` long NOT NULL
  `pokemonDetailAbilitiesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_past_types_inner` generated from model 'pokemonDetailPastTypesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_past_types_inner` (
  `generation` long NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetailPastTypesInnerPokemonDetailTypesInner` generated from model 'PokemonDetailPastTypesInnerPokemonDetailTypesInner'

CREATE TABLE IF NOT EXISTS `PokemonDetailPastTypesInnerPokemonDetailTypesInner` (
  `pokemonDetailPastTypesInner` long NOT NULL
  `pokemonDetailTypesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_sprites` generated from model 'pokemonDetailSprites'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_sprites` (
  `front_default` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDetail_types_inner` generated from model 'pokemonDetailTypesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonDetail_types_inner` (
  `slot` int NOT NULL,
  `type` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonDexEntry` generated from model 'pokemonDexEntry'
--

CREATE TABLE IF NOT EXISTS `PokemonDexEntry` (
  `entry_number` int NOT NULL,
  `pokedex` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetail` generated from model 'pokemonFormDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonFormDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `form_name` text NOT NULL,
  `pokemon` long NOT NULL,
  `sprites` long NOT NULL,
  `version_group` long NOT NULL,
  `order` int,
  `form_order` int,
  `is_default` boolean,
  `is_battle_only` boolean,
  `is_mega` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetailPokemonFormDetailFormNamesInner` generated from model 'PokemonFormDetailPokemonFormDetailFormNamesInner'

CREATE TABLE IF NOT EXISTS `PokemonFormDetailPokemonFormDetailFormNamesInner` (
  `pokemonFormDetail` long NOT NULL
  `pokemonFormDetailFormNamesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetailPokemonFormDetailFormNamesInner` generated from model 'PokemonFormDetailPokemonFormDetailFormNamesInner'

CREATE TABLE IF NOT EXISTS `PokemonFormDetailPokemonFormDetailFormNamesInner` (
  `pokemonFormDetail` long NOT NULL
  `pokemonFormDetailFormNamesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetailPokemonDetailTypesInner` generated from model 'PokemonFormDetailPokemonDetailTypesInner'

CREATE TABLE IF NOT EXISTS `PokemonFormDetailPokemonDetailTypesInner` (
  `pokemonFormDetail` long NOT NULL
  `pokemonDetailTypesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetail_form_names_inner` generated from model 'pokemonFormDetailFormNamesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonFormDetail_form_names_inner` (
  `language` long NOT NULL,
  `name` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormDetail_sprites` generated from model 'pokemonFormDetailSprites'
--

CREATE TABLE IF NOT EXISTS `PokemonFormDetail_sprites` (
  `default` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonFormSummary` generated from model 'pokemonFormSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonFormSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonGameIndex` generated from model 'pokemonGameIndex'
--

CREATE TABLE IF NOT EXISTS `PokemonGameIndex` (
  `game_index` int NOT NULL,
  `version` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHabitatDetail` generated from model 'pokemonHabitatDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
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
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonHabitatSummary` generated from model 'pokemonHabitatSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonHabitatSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetail` generated from model 'pokemonShapeDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetailPokemonShapeDetailAwesomeNamesInner` generated from model 'PokemonShapeDetailPokemonShapeDetailAwesomeNamesInner'

CREATE TABLE IF NOT EXISTS `PokemonShapeDetailPokemonShapeDetailAwesomeNamesInner` (
  `pokemonShapeDetail` long NOT NULL
  `pokemonShapeDetailAwesomeNamesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetailPokemonShapeDetailNamesInner` generated from model 'PokemonShapeDetailPokemonShapeDetailNamesInner'

CREATE TABLE IF NOT EXISTS `PokemonShapeDetailPokemonShapeDetailNamesInner` (
  `pokemonShapeDetail` long NOT NULL
  `pokemonShapeDetailNamesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetailPokemonSpeciesSummary` generated from model 'PokemonShapeDetailPokemonSpeciesSummary'

CREATE TABLE IF NOT EXISTS `PokemonShapeDetailPokemonSpeciesSummary` (
  `pokemonShapeDetail` long NOT NULL
  `pokemonSpeciesSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetail_awesome_names_inner` generated from model 'pokemonShapeDetailAwesomeNamesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeDetail_awesome_names_inner` (
  `awesome_name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeDetail_names_inner` generated from model 'pokemonShapeDetailNamesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeDetail_names_inner` (
  `url` text NOT NULL,
  `name` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonShapeSummary` generated from model 'pokemonShapeSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonShapeSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDescription` generated from model 'pokemonSpeciesDescription'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDescription` (
  `language` long NOT NULL,
  `description` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetail` generated from model 'pokemonSpeciesDetail'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `growth_rate` long NOT NULL,
  `color` long NOT NULL,
  `shape` long NOT NULL,
  `evolves_from_species` long NOT NULL,
  `evolution_chain` long NOT NULL,
  `habitat` long NOT NULL,
  `generation` long NOT NULL,
  `order` int,
  `gender_rate` int,
  `capture_rate` int,
  `base_happiness` int,
  `is_baby` boolean,
  `is_legendary` boolean,
  `is_mythical` boolean,
  `hatch_counter` int,
  `has_gender_differences` boolean,
  `forms_switchable` boolean
); 

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonDexEntry` generated from model 'PokemonSpeciesDetailPokemonDexEntry'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonDexEntry` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonDexEntry` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailAbilityDetailPokemonInnerPokemon` generated from model 'PokemonSpeciesDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailAbilityDetailPokemonInnerPokemon` (
  `pokemonSpeciesDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonFormDetailFormNamesInner` generated from model 'PokemonSpeciesDetailPokemonFormDetailFormNamesInner'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonFormDetailFormNamesInner` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonFormDetailFormNamesInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesDetailPalParkEncountersInner` generated from model 'PokemonSpeciesDetailPokemonSpeciesDetailPalParkEncountersInner'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesDetailPalParkEncountersInner` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesDetailPalParkEncountersInner` long NOT NULL
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
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesDetailGeneraInner` generated from model 'PokemonSpeciesDetailPokemonSpeciesDetailGeneraInner'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesDetailGeneraInner` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesDetailGeneraInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetailPokemonSpeciesDetailVarietiesInner` generated from model 'PokemonSpeciesDetailPokemonSpeciesDetailVarietiesInner'

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetailPokemonSpeciesDetailVarietiesInner` (
  `pokemonSpeciesDetail` long NOT NULL
  `pokemonSpeciesDetailVarietiesInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetail_genera_inner` generated from model 'pokemonSpeciesDetailGeneraInner'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail_genera_inner` (
  `genus` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetail_pal_park_encounters_inner` generated from model 'pokemonSpeciesDetailPalParkEncountersInner'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail_pal_park_encounters_inner` (
  `area` long NOT NULL,
  `base_score` int NOT NULL,
  `rate` int NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesDetail_varieties_inner` generated from model 'pokemonSpeciesDetailVarietiesInner'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesDetail_varieties_inner` (
  `is_default` boolean NOT NULL,
  `pokemon` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesFlavorText` generated from model 'pokemonSpeciesFlavorText'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesFlavorText` (
  `flavor_text` text NOT NULL,
  `language` long NOT NULL,
  `version` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSpeciesSummary` generated from model 'pokemonSpeciesSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonSpeciesSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonStat` generated from model 'pokemonStat'
--

CREATE TABLE IF NOT EXISTS `PokemonStat` (
  `base_stat` int NOT NULL,
  `effort` int NOT NULL,
  `stat` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `PokemonSummary` generated from model 'pokemonSummary'
--

CREATE TABLE IF NOT EXISTS `PokemonSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RegionDetail` generated from model 'regionDetail'
--

CREATE TABLE IF NOT EXISTS `RegionDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `main_generation` long NOT NULL,
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
-- Table structure for table `RegionDetailAbilityDetailPokemonInnerPokemon` generated from model 'RegionDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `RegionDetailAbilityDetailPokemonInnerPokemon` (
  `regionDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `RegionName` generated from model 'regionName'
--

CREATE TABLE IF NOT EXISTS `RegionName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `RegionSummary` generated from model 'regionSummary'
--

CREATE TABLE IF NOT EXISTS `RegionSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `StatDetail` generated from model 'statDetail'
--

CREATE TABLE IF NOT EXISTS `StatDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `game_index` int NOT NULL,
  `affecting_moves` long NOT NULL,
  `affecting_natures` long NOT NULL,
  `move_damage_class` long NOT NULL,
  `is_battle_only` boolean
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
-- Table structure for table `StatDetail_affecting_moves` generated from model 'statDetailAffectingMoves'
--

CREATE TABLE IF NOT EXISTS `StatDetail_affecting_moves` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner` generated from model 'StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner'

CREATE TABLE IF NOT EXISTS `StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner` (
  `statDetailAffectingMoves` long NOT NULL
  `statDetailAffectingMovesIncreaseInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner` generated from model 'StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner'

CREATE TABLE IF NOT EXISTS `StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner` (
  `statDetailAffectingMoves` long NOT NULL
  `statDetailAffectingMovesIncreaseInner` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `StatDetail_affecting_moves_increase_inner` generated from model 'statDetailAffectingMovesIncreaseInner'
--

CREATE TABLE IF NOT EXISTS `StatDetail_affecting_moves_increase_inner` (
  `change` int NOT NULL,
  `move` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `StatDetail_affecting_natures` generated from model 'statDetailAffectingNatures'
--

CREATE TABLE IF NOT EXISTS `StatDetail_affecting_natures` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `StatDetailAffectingNaturesAbilityDetailPokemonInnerPokemon` generated from model 'StatDetailAffectingNaturesAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `StatDetailAffectingNaturesAbilityDetailPokemonInnerPokemon` (
  `statDetailAffectingNatures` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `StatDetailAffectingNaturesAbilityDetailPokemonInnerPokemon` generated from model 'StatDetailAffectingNaturesAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `StatDetailAffectingNaturesAbilityDetailPokemonInnerPokemon` (
  `statDetailAffectingNatures` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `StatName` generated from model 'statName'
--

CREATE TABLE IF NOT EXISTS `StatName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `StatSummary` generated from model 'statSummary'
--

CREATE TABLE IF NOT EXISTS `StatSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SuperContestEffectDetail` generated from model 'superContestEffectDetail'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `appeal` int NOT NULL,
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
  `flavor_text` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `SuperContestEffectSummary` generated from model 'superContestEffectSummary'
--

CREATE TABLE IF NOT EXISTS `SuperContestEffectSummary` (
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetail` generated from model 'typeDetail'
-- Serializer for the Type resource
--

CREATE TABLE IF NOT EXISTS `TypeDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `damage_relations` long NOT NULL,
  `generation` long NOT NULL,
  `move_damage_class` long NOT NULL,
  `sprites` blob NOT NULL
);  /*Serializer for the Type resource*/

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailTypeDetailPastDamageRelationsInner` generated from model 'TypeDetailTypeDetailPastDamageRelationsInner'

CREATE TABLE IF NOT EXISTS `TypeDetailTypeDetailPastDamageRelationsInner` (
  `typeDetail` long NOT NULL
  `typeDetailPastDamageRelationsInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailTypeGameIndex` generated from model 'TypeDetailTypeGameIndex'

CREATE TABLE IF NOT EXISTS `TypeDetailTypeGameIndex` (
  `typeDetail` long NOT NULL
  `typeGameIndex` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailAbilityName` generated from model 'TypeDetailAbilityName'

CREATE TABLE IF NOT EXISTS `TypeDetailAbilityName` (
  `typeDetail` long NOT NULL
  `abilityName` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailTypeDetailPokemonInner` generated from model 'TypeDetailTypeDetailPokemonInner'

CREATE TABLE IF NOT EXISTS `TypeDetailTypeDetailPokemonInner` (
  `typeDetail` long NOT NULL
  `typeDetailPokemonInner` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailMoveSummary` generated from model 'TypeDetailMoveSummary'

CREATE TABLE IF NOT EXISTS `TypeDetailMoveSummary` (
  `typeDetail` long NOT NULL
  `moveSummary` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetail_damage_relations` generated from model 'typeDetailDamageRelations'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_damage_relations` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetail_past_damage_relations_inner` generated from model 'typeDetailPastDamageRelationsInner'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_past_damage_relations_inner` (
  `generation` long NOT NULL,
  `damage_relations` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetail_past_damage_relations_inner_damage_relations` generated from model 'typeDetailPastDamageRelationsInnerDamageRelations'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_past_damage_relations_inner_damage_relations` (
); 

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailPastDamageRelationsInnerDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailPastDamageRelationsInnerDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailPastDamageRelationsInnerDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailPastDamageRelationsInnerDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailPastDamageRelationsInnerDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` generated from model 'TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `TypeDetailPastDamageRelationsInnerDamageRelationsAbilityDetailPokemonInnerPokemon` (
  `typeDetailPastDamageRelationsInnerDamageRelations` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetail_pokemon_inner` generated from model 'typeDetailPokemonInner'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_pokemon_inner` (
  `slot` int,
  `pokemon` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetail_pokemon_inner_pokemon` generated from model 'typeDetailPokemonInnerPokemon'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_pokemon_inner_pokemon` (
  `name` text /*The name of the pokemon*/,
  `url` text /*The URL to get more information about the pokemon*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeDetail_sprites_value_value` generated from model 'typeDetailSpritesValueValue'
--

CREATE TABLE IF NOT EXISTS `TypeDetail_sprites_value_value` (
  `nameicon` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeGameIndex` generated from model 'typeGameIndex'
--

CREATE TABLE IF NOT EXISTS `TypeGameIndex` (
  `game_index` int NOT NULL,
  `generation` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TypeSummary` generated from model 'typeSummary'
--

CREATE TABLE IF NOT EXISTS `TypeSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionDetail` generated from model 'versionDetail'
-- Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I&#39;m not sure how to add anything other than a hyperlink
--

CREATE TABLE IF NOT EXISTS `VersionDetail` (
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `version_group` long NOT NULL
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
  `id` int NOT NULL PRIMARY KEY AUTOINCREMENT,
  `name` text NOT NULL,
  `generation` long NOT NULL,
  `order` int
); 

-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupDetailAbilityDetailPokemonInnerPokemon` generated from model 'VersionGroupDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `VersionGroupDetailAbilityDetailPokemonInnerPokemon` (
  `versionGroupDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupDetailAbilityDetailPokemonInnerPokemon` generated from model 'VersionGroupDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `VersionGroupDetailAbilityDetailPokemonInnerPokemon` (
  `versionGroupDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `VersionGroupDetailAbilityDetailPokemonInnerPokemon` generated from model 'VersionGroupDetailAbilityDetailPokemonInnerPokemon'

CREATE TABLE IF NOT EXISTS `VersionGroupDetailAbilityDetailPokemonInnerPokemon` (
  `versionGroupDetail` long NOT NULL
  `abilityDetailPokemonInnerPokemon` long NOT NULL
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
  `name` text NOT NULL,
  `url` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionName` generated from model 'versionName'
--

CREATE TABLE IF NOT EXISTS `VersionName` (
  `name` text NOT NULL,
  `language` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `VersionSummary` generated from model 'versionSummary'
--

CREATE TABLE IF NOT EXISTS `VersionSummary` (
  `name` text NOT NULL,
  `url` text NOT NULL
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
