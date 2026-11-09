cmake_minimum_required(VERSION 3.14)
project(CppBoostBeastOpenAPIClient VERSION 1.0.0 LANGUAGES CXX)

include(GNUInstallDirs)

if (POLICY CMP0167)
    cmake_policy(SET CMP0167 OLD)
endif ()

set(BOOST_BOOST_TARGET_PREDEFINED FALSE)
set(BOOST_JSON_TARGET_PREDEFINED FALSE)
if (TARGET Boost::boost)
    set(BOOST_BOOST_TARGET_PREDEFINED TRUE)
endif ()
if (TARGET Boost::json)
    set(BOOST_JSON_TARGET_PREDEFINED TRUE)
endif ()

find_package(Boost 1.75 REQUIRED COMPONENTS json)

# Imported targets created in this subdirectory are otherwise invisible to
# sibling consumers when this project is included with add_subdirectory().
if (NOT BOOST_BOOST_TARGET_PREDEFINED)
    set_property(TARGET Boost::boost PROPERTY IMPORTED_GLOBAL TRUE)
endif ()
if (NOT BOOST_JSON_TARGET_PREDEFINED)
    set_property(TARGET Boost::json PROPERTY IMPORTED_GLOBAL TRUE)
endif ()
set(THREADS_TARGET_PREDEFINED FALSE)
if (TARGET Threads::Threads)
    set(THREADS_TARGET_PREDEFINED TRUE)
endif ()
set(THREADS_PREFER_PTHREAD_FLAG TRUE)
find_package(Threads REQUIRED)

if (NOT THREADS_TARGET_PREDEFINED)
    set_property(TARGET Threads::Threads PROPERTY IMPORTED_GLOBAL TRUE)
endif ()

set(OPENSSL_SSL_TARGET_PREDEFINED FALSE)
set(OPENSSL_CRYPTO_TARGET_PREDEFINED FALSE)
if (TARGET OpenSSL::SSL)
    set(OPENSSL_SSL_TARGET_PREDEFINED TRUE)
endif ()
if (TARGET OpenSSL::Crypto)
    set(OPENSSL_CRYPTO_TARGET_PREDEFINED TRUE)
endif ()

find_package(OpenSSL 1.1.0 REQUIRED COMPONENTS SSL Crypto)

# Imported targets created in this subdirectory are otherwise invisible to
# sibling consumers when this project is included with add_subdirectory().
if (NOT OPENSSL_SSL_TARGET_PREDEFINED)
    set_property(TARGET OpenSSL::SSL PROPERTY IMPORTED_GLOBAL TRUE)
endif ()
if (NOT OPENSSL_CRYPTO_TARGET_PREDEFINED)
    set_property(TARGET OpenSSL::Crypto PROPERTY IMPORTED_GLOBAL TRUE)
endif ()


if (MSVC)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} /W4")
else ()
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -fPIC -Wall")
endif ()


add_library(${PROJECT_NAME} SHARED)

set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_STANDARD 17)
set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_STANDARD_REQUIRED ON)
set_property(TARGET ${PROJECT_NAME} PROPERTY CXX_EXTENSIONS OFF)

target_sources(${PROJECT_NAME} PRIVATE
# models
    model/AbilityChange.cpp
    model/AbilityChange.h
    model/AbilityChangeEffectText.cpp
    model/AbilityChangeEffectText.h
    model/AbilityDetail.cpp
    model/AbilityDetail.h
    model/AbilityEffectText.cpp
    model/AbilityEffectText.h
    model/AbilityFlavorText.cpp
    model/AbilityFlavorText.h
    model/AbilityName.cpp
    model/AbilityName.h
    model/AbilityPokemonDetail.cpp
    model/AbilityPokemonDetail.h
    model/AbilitySummary.cpp
    model/AbilitySummary.h
    model/BerryDetail.cpp
    model/BerryDetail.h
    model/BerryDetail_firmness.cpp
    model/BerryDetail_firmness.h
    model/BerryDetail_natural_gift_type.cpp
    model/BerryDetail_natural_gift_type.h
    model/BerryFirmnessDetail.cpp
    model/BerryFirmnessDetail.h
    model/BerryFirmnessName.cpp
    model/BerryFirmnessName.h
    model/BerryFirmnessSummary.cpp
    model/BerryFirmnessSummary.h
    model/BerryFlavorBerryMap.cpp
    model/BerryFlavorBerryMap.h
    model/BerryFlavorDetail.cpp
    model/BerryFlavorDetail.h
    model/BerryFlavorMap.cpp
    model/BerryFlavorMap.h
    model/BerryFlavorName.cpp
    model/BerryFlavorName.h
    model/BerryFlavorSummary.cpp
    model/BerryFlavorSummary.h
    model/BerrySummary.cpp
    model/BerrySummary.h
    model/CharacteristicDescription.cpp
    model/CharacteristicDescription.h
    model/CharacteristicDetail.cpp
    model/CharacteristicDetail.h
    model/CharacteristicSummary.cpp
    model/CharacteristicSummary.h
    model/ContestEffectDetail.cpp
    model/ContestEffectDetail.h
    model/ContestEffectEffectText.cpp
    model/ContestEffectEffectText.h
    model/ContestEffectFlavorText.cpp
    model/ContestEffectFlavorText.h
    model/ContestEffectSummary.cpp
    model/ContestEffectSummary.h
    model/ContestTypeDetail.cpp
    model/ContestTypeDetail.h
    model/ContestTypeName.cpp
    model/ContestTypeName.h
    model/ContestTypeSummary.cpp
    model/ContestTypeSummary.h
    model/CurrencyDetail.cpp
    model/CurrencyDetail.h
    model/CurrencyName.cpp
    model/CurrencyName.h
    model/CurrencySummary.cpp
    model/CurrencySummary.h
    model/EggGroupDetail.cpp
    model/EggGroupDetail.h
    model/EggGroupName.cpp
    model/EggGroupName.h
    model/EggGroupSummary.cpp
    model/EggGroupSummary.h
    model/EncounterConditionDetail.cpp
    model/EncounterConditionDetail.h
    model/EncounterConditionName.cpp
    model/EncounterConditionName.h
    model/EncounterConditionSummary.cpp
    model/EncounterConditionSummary.h
    model/EncounterConditionValueDetail.cpp
    model/EncounterConditionValueDetail.h
    model/EncounterConditionValueName.cpp
    model/EncounterConditionValueName.h
    model/EncounterConditionValueSummary.cpp
    model/EncounterConditionValueSummary.h
    model/EncounterMethodDetail.cpp
    model/EncounterMethodDetail.h
    model/EncounterMethodName.cpp
    model/EncounterMethodName.h
    model/EncounterMethodSummary.cpp
    model/EncounterMethodSummary.h
    model/EncounterPokemonDetail.cpp
    model/EncounterPokemonDetail.h
    model/EvolutionChainDetail.cpp
    model/EvolutionChainDetail.h
    model/EvolutionChainDetail_baby_trigger_item.cpp
    model/EvolutionChainDetail_baby_trigger_item.h
    model/EvolutionChainLink.cpp
    model/EvolutionChainLink.h
    model/EvolutionChainSummary.cpp
    model/EvolutionChainSummary.h
    model/EvolutionConditionExpression.cpp
    model/EvolutionConditionExpression.h
    model/EvolutionTriggerDetail.cpp
    model/EvolutionTriggerDetail.h
    model/EvolutionTriggerName.cpp
    model/EvolutionTriggerName.h
    model/EvolutionTriggerSummary.cpp
    model/EvolutionTriggerSummary.h
    model/EvolutionVariableDescription.cpp
    model/EvolutionVariableDescription.h
    model/EvolutionVariableDetail.cpp
    model/EvolutionVariableDetail.h
    model/EvolutionVariableName.cpp
    model/EvolutionVariableName.h
    model/EvolutionVariableSummary.cpp
    model/EvolutionVariableSummary.h
    model/Experience.cpp
    model/Experience.h
    model/GenderDetail.cpp
    model/GenderDetail.h
    model/GenderPokemonSpecies.cpp
    model/GenderPokemonSpecies.h
    model/GenderSummary.cpp
    model/GenderSummary.h
    model/GenerationDetail.cpp
    model/GenerationDetail.h
    model/GenerationName.cpp
    model/GenerationName.h
    model/GenerationSummary.cpp
    model/GenerationSummary.h
    model/GrowthRateDescription.cpp
    model/GrowthRateDescription.h
    model/GrowthRateDetail.cpp
    model/GrowthRateDetail.h
    model/GrowthRateSummary.cpp
    model/GrowthRateSummary.h
    model/ItemAttributeDescription.cpp
    model/ItemAttributeDescription.h
    model/ItemAttributeDetail.cpp
    model/ItemAttributeDetail.h
    model/ItemAttributeName.cpp
    model/ItemAttributeName.h
    model/ItemAttributeSummary.cpp
    model/ItemAttributeSummary.h
    model/ItemCategoryDetail.cpp
    model/ItemCategoryDetail.h
    model/ItemCategoryName.cpp
    model/ItemCategoryName.h
    model/ItemCategorySummary.cpp
    model/ItemCategorySummary.h
    model/ItemDetail.cpp
    model/ItemDetail.h
    model/ItemDetail_baby_trigger_for.cpp
    model/ItemDetail_baby_trigger_for.h
    model/ItemDetail_fling_effect.cpp
    model/ItemDetail_fling_effect.h
    model/ItemEffectText.cpp
    model/ItemEffectText.h
    model/ItemFlavorText.cpp
    model/ItemFlavorText.h
    model/ItemFlingEffectDetail.cpp
    model/ItemFlingEffectDetail.h
    model/ItemFlingEffectEffectText.cpp
    model/ItemFlingEffectEffectText.h
    model/ItemFlingEffectSummary.cpp
    model/ItemFlingEffectSummary.h
    model/ItemGameIndex.cpp
    model/ItemGameIndex.h
    model/ItemMachine.cpp
    model/ItemMachine.h
    model/ItemName.cpp
    model/ItemName.h
    model/ItemPocketDetail.cpp
    model/ItemPocketDetail.h
    model/ItemPocketName.cpp
    model/ItemPocketName.h
    model/ItemPocketSummary.cpp
    model/ItemPocketSummary.h
    model/ItemPrice.cpp
    model/ItemPrice.h
    model/ItemSprites.cpp
    model/ItemSprites.h
    model/ItemSummary.cpp
    model/ItemSummary.h
    model/LanguageDetail.cpp
    model/LanguageDetail.h
    model/LanguageName.cpp
    model/LanguageName.h
    model/LanguageSummary.cpp
    model/LanguageSummary.h
    model/LocationAreaDetail.cpp
    model/LocationAreaDetail.h
    model/LocationAreaEncounterDetail.cpp
    model/LocationAreaEncounterDetail.h
    model/LocationAreaEncounterDetail_pokemon_details.cpp
    model/LocationAreaEncounterDetail_pokemon_details.h
    model/LocationAreaEncounterRate.cpp
    model/LocationAreaEncounterRate.h
    model/LocationAreaEncounterVersionDetail.cpp
    model/LocationAreaEncounterVersionDetail.h
    model/LocationAreaName.cpp
    model/LocationAreaName.h
    model/LocationAreaPokemonEncounter.cpp
    model/LocationAreaPokemonEncounter.h
    model/LocationAreaPokemonEncounterVersion.cpp
    model/LocationAreaPokemonEncounterVersion.h
    model/LocationAreaSummary.cpp
    model/LocationAreaSummary.h
    model/LocationDetail.cpp
    model/LocationDetail.h
    model/LocationDetail_region.cpp
    model/LocationDetail_region.h
    model/LocationGameIndex.cpp
    model/LocationGameIndex.h
    model/LocationName.cpp
    model/LocationName.h
    model/LocationSummary.cpp
    model/LocationSummary.h
    model/MachineDetail.cpp
    model/MachineDetail.h
    model/MachineSummary.cpp
    model/MachineSummary.h
    model/MoveBattleStyleDetail.cpp
    model/MoveBattleStyleDetail.h
    model/MoveBattleStyleName.cpp
    model/MoveBattleStyleName.h
    model/MoveBattleStyleSummary.cpp
    model/MoveBattleStyleSummary.h
    model/MoveChange.cpp
    model/MoveChange.h
    model/MoveChange_type.cpp
    model/MoveChange_type.h
    model/MoveComboUsage.cpp
    model/MoveComboUsage.h
    model/MoveCombos.cpp
    model/MoveCombos.h
    model/MoveDamageClassDescription.cpp
    model/MoveDamageClassDescription.h
    model/MoveDamageClassDetail.cpp
    model/MoveDamageClassDetail.h
    model/MoveDamageClassName.cpp
    model/MoveDamageClassName.h
    model/MoveDamageClassSummary.cpp
    model/MoveDamageClassSummary.h
    model/MoveDetail.cpp
    model/MoveDetail.h
    model/MoveDetail_contest_combos.cpp
    model/MoveDetail_contest_combos.h
    model/MoveDetail_contest_effect.cpp
    model/MoveDetail_contest_effect.h
    model/MoveDetail_contest_type.cpp
    model/MoveDetail_contest_type.h
    model/MoveDetail_meta.cpp
    model/MoveDetail_meta.h
    model/MoveDetail_super_contest_effect.cpp
    model/MoveDetail_super_contest_effect.h
    model/MoveEffectChange.cpp
    model/MoveEffectChange.h
    model/MoveEffectChangeEffectText.cpp
    model/MoveEffectChangeEffectText.h
    model/MoveEffectEffectText.cpp
    model/MoveEffectEffectText.h
    model/MoveFlavorText.cpp
    model/MoveFlavorText.h
    model/MoveLearnMethodDescription.cpp
    model/MoveLearnMethodDescription.h
    model/MoveLearnMethodDetail.cpp
    model/MoveLearnMethodDetail.h
    model/MoveLearnMethodName.cpp
    model/MoveLearnMethodName.h
    model/MoveLearnMethodSummary.cpp
    model/MoveLearnMethodSummary.h
    model/MoveMeta.cpp
    model/MoveMeta.h
    model/MoveMetaAilmentDetail.cpp
    model/MoveMetaAilmentDetail.h
    model/MoveMetaAilmentName.cpp
    model/MoveMetaAilmentName.h
    model/MoveMetaAilmentSummary.cpp
    model/MoveMetaAilmentSummary.h
    model/MoveMetaCategoryDescription.cpp
    model/MoveMetaCategoryDescription.h
    model/MoveMetaCategoryDetail.cpp
    model/MoveMetaCategoryDetail.h
    model/MoveMetaCategorySummary.cpp
    model/MoveMetaCategorySummary.h
    model/MoveMetaStatChange.cpp
    model/MoveMetaStatChange.h
    model/MoveName.cpp
    model/MoveName.h
    model/MoveStatChange.cpp
    model/MoveStatChange.h
    model/MoveSummary.cpp
    model/MoveSummary.h
    model/MoveTargetDescription.cpp
    model/MoveTargetDescription.h
    model/MoveTargetDetail.cpp
    model/MoveTargetDetail.h
    model/MoveTargetName.cpp
    model/MoveTargetName.h
    model/MoveTargetSummary.cpp
    model/MoveTargetSummary.h
    model/NatureBattleStylePreference.cpp
    model/NatureBattleStylePreference.h
    model/NatureDetail.cpp
    model/NatureDetail.h
    model/NatureDetail_decreased_stat.cpp
    model/NatureDetail_decreased_stat.h
    model/NatureDetail_hates_flavor.cpp
    model/NatureDetail_hates_flavor.h
    model/NatureDetail_increased_stat.cpp
    model/NatureDetail_increased_stat.h
    model/NatureDetail_likes_flavor.cpp
    model/NatureDetail_likes_flavor.h
    model/NatureName.cpp
    model/NatureName.h
    model/NaturePokeathlonStat.cpp
    model/NaturePokeathlonStat.h
    model/NatureSummary.cpp
    model/NatureSummary.h
    model/PaginatedAbilitySummaryList.cpp
    model/PaginatedAbilitySummaryList.h
    model/PaginatedBerryFirmnessSummaryList.cpp
    model/PaginatedBerryFirmnessSummaryList.h
    model/PaginatedBerryFlavorSummaryList.cpp
    model/PaginatedBerryFlavorSummaryList.h
    model/PaginatedBerrySummaryList.cpp
    model/PaginatedBerrySummaryList.h
    model/PaginatedCharacteristicSummaryList.cpp
    model/PaginatedCharacteristicSummaryList.h
    model/PaginatedContestEffectSummaryList.cpp
    model/PaginatedContestEffectSummaryList.h
    model/PaginatedContestTypeSummaryList.cpp
    model/PaginatedContestTypeSummaryList.h
    model/PaginatedCurrencySummaryList.cpp
    model/PaginatedCurrencySummaryList.h
    model/PaginatedEggGroupSummaryList.cpp
    model/PaginatedEggGroupSummaryList.h
    model/PaginatedEncounterConditionSummaryList.cpp
    model/PaginatedEncounterConditionSummaryList.h
    model/PaginatedEncounterConditionValueSummaryList.cpp
    model/PaginatedEncounterConditionValueSummaryList.h
    model/PaginatedEncounterMethodSummaryList.cpp
    model/PaginatedEncounterMethodSummaryList.h
    model/PaginatedEvolutionChainSummaryList.cpp
    model/PaginatedEvolutionChainSummaryList.h
    model/PaginatedEvolutionTriggerSummaryList.cpp
    model/PaginatedEvolutionTriggerSummaryList.h
    model/PaginatedEvolutionVariableSummaryList.cpp
    model/PaginatedEvolutionVariableSummaryList.h
    model/PaginatedGenderSummaryList.cpp
    model/PaginatedGenderSummaryList.h
    model/PaginatedGenerationSummaryList.cpp
    model/PaginatedGenerationSummaryList.h
    model/PaginatedGrowthRateSummaryList.cpp
    model/PaginatedGrowthRateSummaryList.h
    model/PaginatedItemAttributeSummaryList.cpp
    model/PaginatedItemAttributeSummaryList.h
    model/PaginatedItemCategorySummaryList.cpp
    model/PaginatedItemCategorySummaryList.h
    model/PaginatedItemFlingEffectSummaryList.cpp
    model/PaginatedItemFlingEffectSummaryList.h
    model/PaginatedItemPocketSummaryList.cpp
    model/PaginatedItemPocketSummaryList.h
    model/PaginatedItemSummaryList.cpp
    model/PaginatedItemSummaryList.h
    model/PaginatedLanguageSummaryList.cpp
    model/PaginatedLanguageSummaryList.h
    model/PaginatedLocationAreaSummaryList.cpp
    model/PaginatedLocationAreaSummaryList.h
    model/PaginatedLocationSummaryList.cpp
    model/PaginatedLocationSummaryList.h
    model/PaginatedMachineSummaryList.cpp
    model/PaginatedMachineSummaryList.h
    model/PaginatedMoveBattleStyleSummaryList.cpp
    model/PaginatedMoveBattleStyleSummaryList.h
    model/PaginatedMoveDamageClassSummaryList.cpp
    model/PaginatedMoveDamageClassSummaryList.h
    model/PaginatedMoveLearnMethodSummaryList.cpp
    model/PaginatedMoveLearnMethodSummaryList.h
    model/PaginatedMoveMetaAilmentSummaryList.cpp
    model/PaginatedMoveMetaAilmentSummaryList.h
    model/PaginatedMoveMetaCategorySummaryList.cpp
    model/PaginatedMoveMetaCategorySummaryList.h
    model/PaginatedMoveSummaryList.cpp
    model/PaginatedMoveSummaryList.h
    model/PaginatedMoveTargetSummaryList.cpp
    model/PaginatedMoveTargetSummaryList.h
    model/PaginatedNatureSummaryList.cpp
    model/PaginatedNatureSummaryList.h
    model/PaginatedPalParkAreaSummaryList.cpp
    model/PaginatedPalParkAreaSummaryList.h
    model/PaginatedPokeathlonStatSummaryList.cpp
    model/PaginatedPokeathlonStatSummaryList.h
    model/PaginatedPokedexSummaryList.cpp
    model/PaginatedPokedexSummaryList.h
    model/PaginatedPokemonColorSummaryList.cpp
    model/PaginatedPokemonColorSummaryList.h
    model/PaginatedPokemonFormSummaryList.cpp
    model/PaginatedPokemonFormSummaryList.h
    model/PaginatedPokemonHabitatSummaryList.cpp
    model/PaginatedPokemonHabitatSummaryList.h
    model/PaginatedPokemonShapeSummaryList.cpp
    model/PaginatedPokemonShapeSummaryList.h
    model/PaginatedPokemonSpeciesSummaryList.cpp
    model/PaginatedPokemonSpeciesSummaryList.h
    model/PaginatedPokemonSummaryList.cpp
    model/PaginatedPokemonSummaryList.h
    model/PaginatedRegionSummaryList.cpp
    model/PaginatedRegionSummaryList.h
    model/PaginatedStatSummaryList.cpp
    model/PaginatedStatSummaryList.h
    model/PaginatedSuperContestEffectSummaryList.cpp
    model/PaginatedSuperContestEffectSummaryList.h
    model/PaginatedTypeSummaryList.cpp
    model/PaginatedTypeSummaryList.h
    model/PaginatedVersionGroupSummaryList.cpp
    model/PaginatedVersionGroupSummaryList.h
    model/PaginatedVersionSummaryList.cpp
    model/PaginatedVersionSummaryList.h
    model/PalParkAreaDetail.cpp
    model/PalParkAreaDetail.h
    model/PalParkAreaName.cpp
    model/PalParkAreaName.h
    model/PalParkAreaSummary.cpp
    model/PalParkAreaSummary.h
    model/PalParkEncounter.cpp
    model/PalParkEncounter.h
    model/PokeapiMetaResponse.cpp
    model/PokeapiMetaResponse.h
    model/PokeathlonStatAffectingNature.cpp
    model/PokeathlonStatAffectingNature.h
    model/PokeathlonStatAffectingNatures.cpp
    model/PokeathlonStatAffectingNatures.h
    model/PokeathlonStatDetail.cpp
    model/PokeathlonStatDetail.h
    model/PokeathlonStatName.cpp
    model/PokeathlonStatName.h
    model/PokeathlonStatSummary.cpp
    model/PokeathlonStatSummary.h
    model/PokedexDescription.cpp
    model/PokedexDescription.h
    model/PokedexDetail.cpp
    model/PokedexDetail.h
    model/PokedexDetail_region.cpp
    model/PokedexDetail_region.h
    model/PokedexName.cpp
    model/PokedexName.h
    model/PokedexSummary.cpp
    model/PokedexSummary.h
    model/PokemonAbility.cpp
    model/PokemonAbility.h
    model/PokemonAbilityPast.cpp
    model/PokemonAbilityPast.h
    model/PokemonAbilityPast_ability.cpp
    model/PokemonAbilityPast_ability.h
    model/PokemonColorDetail.cpp
    model/PokemonColorDetail.h
    model/PokemonColorName.cpp
    model/PokemonColorName.h
    model/PokemonColorSummary.cpp
    model/PokemonColorSummary.h
    model/PokemonCries.cpp
    model/PokemonCries.h
    model/PokemonDetail.cpp
    model/PokemonDetail.h
    model/PokemonDexEntry.cpp
    model/PokemonDexEntry.h
    model/PokemonDexNumber.cpp
    model/PokemonDexNumber.h
    model/PokemonEncounterDetailResponse.cpp
    model/PokemonEncounterDetailResponse.h
    model/PokemonEncounterResponse.cpp
    model/PokemonEncounterResponse.h
    model/PokemonEncounterVersionDetailResponse.cpp
    model/PokemonEncounterVersionDetailResponse.h
    model/PokemonEvolution.cpp
    model/PokemonEvolution.h
    model/PokemonEvolution_condition_expression.cpp
    model/PokemonEvolution_condition_expression.h
    model/PokemonEvolution_evolved_pokemon_form.cpp
    model/PokemonEvolution_evolved_pokemon_form.h
    model/PokemonEvolution_held_item.cpp
    model/PokemonEvolution_held_item.h
    model/PokemonEvolution_item.cpp
    model/PokemonEvolution_item.h
    model/PokemonEvolution_known_move.cpp
    model/PokemonEvolution_known_move.h
    model/PokemonEvolution_location.cpp
    model/PokemonEvolution_location.h
    model/PokemonEvolution_party_species.cpp
    model/PokemonEvolution_party_species.h
    model/PokemonEvolution_party_type.cpp
    model/PokemonEvolution_party_type.h
    model/PokemonEvolution_region.cpp
    model/PokemonEvolution_region.h
    model/PokemonEvolution_required_pokemon_form.cpp
    model/PokemonEvolution_required_pokemon_form.h
    model/PokemonEvolution_trade_species.cpp
    model/PokemonEvolution_trade_species.h
    model/PokemonEvolution_used_move.cpp
    model/PokemonEvolution_used_move.h
    model/PokemonFormDetail.cpp
    model/PokemonFormDetail.h
    model/PokemonFormFlavorText.cpp
    model/PokemonFormFlavorText.h
    model/PokemonFormName.cpp
    model/PokemonFormName.h
    model/PokemonFormSprites.cpp
    model/PokemonFormSprites.h
    model/PokemonFormSummary.cpp
    model/PokemonFormSummary.h
    model/PokemonFormTriggerCondition.cpp
    model/PokemonFormTriggerCondition.h
    model/PokemonFormType.cpp
    model/PokemonFormType.h
    model/PokemonGameIndex.cpp
    model/PokemonGameIndex.h
    model/PokemonHabitatDetail.cpp
    model/PokemonHabitatDetail.h
    model/PokemonHabitatName.cpp
    model/PokemonHabitatName.h
    model/PokemonHabitatSummary.cpp
    model/PokemonHabitatSummary.h
    model/PokemonHeldItem.cpp
    model/PokemonHeldItem.h
    model/PokemonHeldItemSummary.cpp
    model/PokemonHeldItemSummary.h
    model/PokemonHeldItemVersion.cpp
    model/PokemonHeldItemVersion.h
    model/PokemonMove.cpp
    model/PokemonMove.h
    model/PokemonMoveVersionGroup.cpp
    model/PokemonMoveVersionGroup.h
    model/PokemonPastAbility.cpp
    model/PokemonPastAbility.h
    model/PokemonPastStat.cpp
    model/PokemonPastStat.h
    model/PokemonPastType.cpp
    model/PokemonPastType.h
    model/PokemonShapeAwesomeName.cpp
    model/PokemonShapeAwesomeName.h
    model/PokemonShapeDetail.cpp
    model/PokemonShapeDetail.h
    model/PokemonShapeName.cpp
    model/PokemonShapeName.h
    model/PokemonShapeSummary.cpp
    model/PokemonShapeSummary.h
    model/PokemonSpeciesDescription.cpp
    model/PokemonSpeciesDescription.h
    model/PokemonSpeciesDetail.cpp
    model/PokemonSpeciesDetail.h
    model/PokemonSpeciesDetail_evolves_from_species.cpp
    model/PokemonSpeciesDetail_evolves_from_species.h
    model/PokemonSpeciesDetail_habitat.cpp
    model/PokemonSpeciesDetail_habitat.h
    model/PokemonSpeciesFlavorText.cpp
    model/PokemonSpeciesFlavorText.h
    model/PokemonSpeciesGenus.cpp
    model/PokemonSpeciesGenus.h
    model/PokemonSpeciesName.cpp
    model/PokemonSpeciesName.h
    model/PokemonSpeciesPalParkEncounter.cpp
    model/PokemonSpeciesPalParkEncounter.h
    model/PokemonSpeciesSummary.cpp
    model/PokemonSpeciesSummary.h
    model/PokemonSpeciesVariety.cpp
    model/PokemonSpeciesVariety.h
    model/PokemonSprites.cpp
    model/PokemonSprites.h
    model/PokemonSpritesOther.cpp
    model/PokemonSpritesOther.h
    model/PokemonSpritesOtherDreamWorld.cpp
    model/PokemonSpritesOtherDreamWorld.h
    model/PokemonSpritesOtherHome.cpp
    model/PokemonSpritesOtherHome.h
    model/PokemonSpritesOtherOfficialArtwork.cpp
    model/PokemonSpritesOtherOfficialArtwork.h
    model/PokemonSpritesOtherShowdown.cpp
    model/PokemonSpritesOtherShowdown.h
    model/PokemonStat.cpp
    model/PokemonStat.h
    model/PokemonSummary.cpp
    model/PokemonSummary.h
    model/PokemonType.cpp
    model/PokemonType.h
    model/RegionDetail.cpp
    model/RegionDetail.h
    model/RegionDetail_main_generation.cpp
    model/RegionDetail_main_generation.h
    model/RegionName.cpp
    model/RegionName.h
    model/RegionSummary.cpp
    model/RegionSummary.h
    model/StatAffectingMoves.cpp
    model/StatAffectingMoves.h
    model/StatAffectingNatures.cpp
    model/StatAffectingNatures.h
    model/StatDetail.cpp
    model/StatDetail.h
    model/StatDetail_move_damage_class.cpp
    model/StatDetail_move_damage_class.h
    model/StatName.cpp
    model/StatName.h
    model/StatSummary.cpp
    model/StatSummary.h
    model/SuperContestEffectDetail.cpp
    model/SuperContestEffectDetail.h
    model/SuperContestEffectFlavorText.cpp
    model/SuperContestEffectFlavorText.h
    model/SuperContestEffectSummary.cpp
    model/SuperContestEffectSummary.h
    model/TypeDetail.cpp
    model/TypeDetail.h
    model/TypeDetail_move_damage_class.cpp
    model/TypeDetail_move_damage_class.h
    model/TypeGameIndex.cpp
    model/TypeGameIndex.h
    model/TypeGameSprite.cpp
    model/TypeGameSprite.h
    model/TypeName.cpp
    model/TypeName.h
    model/TypePastRelationships.cpp
    model/TypePastRelationships.h
    model/TypePokemon.cpp
    model/TypePokemon.h
    model/TypeRelationships.cpp
    model/TypeRelationships.h
    model/TypeSummary.cpp
    model/TypeSummary.h
    model/VersionDetail.cpp
    model/VersionDetail.h
    model/VersionGroupDetail.cpp
    model/VersionGroupDetail.h
    model/VersionGroupSummary.cpp
    model/VersionGroupSummary.h
    model/VersionName.cpp
    model/VersionName.h
    model/VersionSummary.cpp
    model/VersionSummary.h
# apis
    api/BerriesApi.cpp
    api/BerriesApi.h
    api/ContestsApi.cpp
    api/ContestsApi.h
    api/EncountersApi.cpp
    api/EncountersApi.h
    api/EvolutionApi.cpp
    api/EvolutionApi.h
    api/GamesApi.cpp
    api/GamesApi.h
    api/ItemsApi.cpp
    api/ItemsApi.h
    api/LocationApi.cpp
    api/LocationApi.h
    api/MachinesApi.cpp
    api/MachinesApi.h
    api/MovesApi.cpp
    api/MovesApi.h
    api/PokemonApi.cpp
    api/PokemonApi.h
    api/UtilityApi.cpp
    api/UtilityApi.h
# other
    api/HttpClient.h
    api/HttpClientImpl.cpp
    api/HttpClientImpl.h
    model/AnyType.h
    model/ValidationTypes.h
    model/NullableField.h
    model/Oas31DeepEqual.h
    model/Oas31ExactNumber.cpp
    model/Oas31ExactNumber.h
    model/Oas31SchemaIr.h
    model/Oas31ExactJson.h
    model/Oas31Validator.h
    model/schema_ir.generated.cpp
    model/schema_ir.generated.chunk0.cpp
    model/schema_ir.generated.chunk1.cpp
    model/schema_ir.generated.chunk2.cpp
    model/schema_ir.generated.chunk3.cpp
    model/Oas31SchemaRegistry.h
)


target_link_libraries(${PROJECT_NAME}
    PUBLIC Boost::boost Boost::json OpenSSL::SSL Threads::Threads)

target_include_directories(${PROJECT_NAME} PUBLIC
    $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}>
    $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}/api>
    $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}/model>
    $<INSTALL_INTERFACE:${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}>
    $<INSTALL_INTERFACE:${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}/api>
    $<INSTALL_INTERFACE:${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}/model>)

install(TARGETS ${PROJECT_NAME}
    RUNTIME DESTINATION "${CMAKE_INSTALL_BINDIR}"
    LIBRARY DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    ARCHIVE DESTINATION "${CMAKE_INSTALL_LIBDIR}")

install(DIRECTORY api model
    DESTINATION "${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}"
    FILES_MATCHING PATTERN "*.h" PATTERN "*.hpp")

# ──────────────────────────────────────────────────────────────────────
# Wire-level multipart encoding test executable.
# Build and run:
#   cmake -DMULTIPART_ENCODING_SELF_TEST=ON -B build
#   cmake --build build --parallel
#   ctest --test-dir build --output-on-failure
# ──────────────────────────────────────────────────────────────────────
option(MULTIPART_ENCODING_SELF_TEST "Enable multipart encoding wire-level self-test" OFF)
if (MULTIPART_ENCODING_SELF_TEST)
    enable_testing()
    add_executable(${PROJECT_NAME}_multipart_wire_test
        test/MultipartWireTest.cpp)

    set_property(TARGET ${PROJECT_NAME}_multipart_wire_test
        PROPERTY CXX_STANDARD 17)
    target_link_libraries(${PROJECT_NAME}_multipart_wire_test
        PRIVATE Boost::boost)

    add_test(NAME multipart-encoding-wire-test
        COMMAND ${PROJECT_NAME}_multipart_wire_test)
endif ()
