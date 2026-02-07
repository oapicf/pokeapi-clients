#!/usr/bin/env bash

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# ! Generator version: 7.18.0
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#
# This is a Bash client for PokéAPI.
#
# LICENSE:
# 
#
# CONTACT:
# blah+oapicf@cliffano.com
#
# MORE INFORMATION:
# https://pokeapi.co/docs/v2
#

# For improved pattern matching in case statements
shopt -s extglob

###############################################################################
#
# Make sure Bash is at least in version 4.3
#
###############################################################################
if ! ( (("${BASH_VERSION:0:1}" == "4")) && (("${BASH_VERSION:2:1}" >= "3")) ) \
  && ! (("${BASH_VERSION:0:1}" >= "5")); then
    echo ""
    echo "Sorry - your Bash version is ${BASH_VERSION}"
    echo ""
    echo "You need at least Bash 4.3 to run this script."
    echo ""
    exit 1
fi

###############################################################################
#
# Global variables
#
###############################################################################

##
# The filename of this script for help messages
script_name=$(basename "$0")

##
# Map for headers passed after operation as KEY:VALUE
declare -A header_arguments


##
# Map for operation parameters passed after operation as PARAMETER=VALUE
# These will be mapped to appropriate path or query parameters
# The values in operation_parameters are arrays, so that multiple values
# can be provided for the same parameter if allowed by API specification
declare -A operation_parameters

##
# Declare colors with autodetection if output is terminal
if [ -t 1 ]; then
    RED="$(tput setaf 1)"
    GREEN="$(tput setaf 2)"
    YELLOW="$(tput setaf 3)"
    BLUE="$(tput setaf 4)"
    MAGENTA="$(tput setaf 5)"
    CYAN="$(tput setaf 6)"
    WHITE="$(tput setaf 7)"
    BOLD="$(tput bold)"
    OFF="$(tput sgr0)"
else
    RED=""
    GREEN=""
    YELLOW=""
    BLUE=""
    MAGENTA=""
    CYAN=""
    WHITE=""
    BOLD=""
    OFF=""
fi

declare -a result_color_table=( "$WHITE" "$WHITE" "$GREEN" "$YELLOW" "$WHITE" "$MAGENTA" "$WHITE" )

##
# This array stores the minimum number of required occurrences for parameter
# 0 - optional
# 1 - required
declare -A operation_parameters_minimum_occurrences
operation_parameters_minimum_occurrences["berryFirmnessList:::limit"]=0
operation_parameters_minimum_occurrences["berryFirmnessList:::offset"]=0
operation_parameters_minimum_occurrences["berryFirmnessList:::q"]=0
operation_parameters_minimum_occurrences["berryFirmnessRetrieve:::id"]=1
operation_parameters_minimum_occurrences["berryFlavorList:::limit"]=0
operation_parameters_minimum_occurrences["berryFlavorList:::offset"]=0
operation_parameters_minimum_occurrences["berryFlavorList:::q"]=0
operation_parameters_minimum_occurrences["berryFlavorRetrieve:::id"]=1
operation_parameters_minimum_occurrences["berryList:::limit"]=0
operation_parameters_minimum_occurrences["berryList:::offset"]=0
operation_parameters_minimum_occurrences["berryList:::q"]=0
operation_parameters_minimum_occurrences["berryRetrieve:::id"]=1
operation_parameters_minimum_occurrences["contestEffectList:::limit"]=0
operation_parameters_minimum_occurrences["contestEffectList:::offset"]=0
operation_parameters_minimum_occurrences["contestEffectList:::q"]=0
operation_parameters_minimum_occurrences["contestEffectRetrieve:::id"]=1
operation_parameters_minimum_occurrences["contestTypeList:::limit"]=0
operation_parameters_minimum_occurrences["contestTypeList:::offset"]=0
operation_parameters_minimum_occurrences["contestTypeList:::q"]=0
operation_parameters_minimum_occurrences["contestTypeRetrieve:::id"]=1
operation_parameters_minimum_occurrences["superContestEffectList:::limit"]=0
operation_parameters_minimum_occurrences["superContestEffectList:::offset"]=0
operation_parameters_minimum_occurrences["superContestEffectList:::q"]=0
operation_parameters_minimum_occurrences["superContestEffectRetrieve:::id"]=1
operation_parameters_minimum_occurrences["encounterConditionList:::limit"]=0
operation_parameters_minimum_occurrences["encounterConditionList:::offset"]=0
operation_parameters_minimum_occurrences["encounterConditionList:::q"]=0
operation_parameters_minimum_occurrences["encounterConditionRetrieve:::id"]=1
operation_parameters_minimum_occurrences["encounterConditionValueList:::limit"]=0
operation_parameters_minimum_occurrences["encounterConditionValueList:::offset"]=0
operation_parameters_minimum_occurrences["encounterConditionValueList:::q"]=0
operation_parameters_minimum_occurrences["encounterConditionValueRetrieve:::id"]=1
operation_parameters_minimum_occurrences["encounterMethodList:::limit"]=0
operation_parameters_minimum_occurrences["encounterMethodList:::offset"]=0
operation_parameters_minimum_occurrences["encounterMethodList:::q"]=0
operation_parameters_minimum_occurrences["encounterMethodRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokemonEncountersRetrieve:::pokemon_id"]=1
operation_parameters_minimum_occurrences["evolutionChainList:::limit"]=0
operation_parameters_minimum_occurrences["evolutionChainList:::offset"]=0
operation_parameters_minimum_occurrences["evolutionChainList:::q"]=0
operation_parameters_minimum_occurrences["evolutionChainRetrieve:::id"]=1
operation_parameters_minimum_occurrences["evolutionTriggerList:::limit"]=0
operation_parameters_minimum_occurrences["evolutionTriggerList:::offset"]=0
operation_parameters_minimum_occurrences["evolutionTriggerList:::q"]=0
operation_parameters_minimum_occurrences["evolutionTriggerRetrieve:::id"]=1
operation_parameters_minimum_occurrences["generationList:::limit"]=0
operation_parameters_minimum_occurrences["generationList:::offset"]=0
operation_parameters_minimum_occurrences["generationList:::q"]=0
operation_parameters_minimum_occurrences["generationRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokedexList:::limit"]=0
operation_parameters_minimum_occurrences["pokedexList:::offset"]=0
operation_parameters_minimum_occurrences["pokedexList:::q"]=0
operation_parameters_minimum_occurrences["pokedexRetrieve:::id"]=1
operation_parameters_minimum_occurrences["versionGroupList:::limit"]=0
operation_parameters_minimum_occurrences["versionGroupList:::offset"]=0
operation_parameters_minimum_occurrences["versionGroupList:::q"]=0
operation_parameters_minimum_occurrences["versionGroupRetrieve:::id"]=1
operation_parameters_minimum_occurrences["versionList:::limit"]=0
operation_parameters_minimum_occurrences["versionList:::offset"]=0
operation_parameters_minimum_occurrences["versionList:::q"]=0
operation_parameters_minimum_occurrences["versionRetrieve:::id"]=1
operation_parameters_minimum_occurrences["itemAttributeList:::limit"]=0
operation_parameters_minimum_occurrences["itemAttributeList:::offset"]=0
operation_parameters_minimum_occurrences["itemAttributeList:::q"]=0
operation_parameters_minimum_occurrences["itemAttributeRetrieve:::id"]=1
operation_parameters_minimum_occurrences["itemCategoryList:::limit"]=0
operation_parameters_minimum_occurrences["itemCategoryList:::offset"]=0
operation_parameters_minimum_occurrences["itemCategoryList:::q"]=0
operation_parameters_minimum_occurrences["itemCategoryRetrieve:::id"]=1
operation_parameters_minimum_occurrences["itemFlingEffectList:::limit"]=0
operation_parameters_minimum_occurrences["itemFlingEffectList:::offset"]=0
operation_parameters_minimum_occurrences["itemFlingEffectList:::q"]=0
operation_parameters_minimum_occurrences["itemFlingEffectRetrieve:::id"]=1
operation_parameters_minimum_occurrences["itemList:::limit"]=0
operation_parameters_minimum_occurrences["itemList:::offset"]=0
operation_parameters_minimum_occurrences["itemList:::q"]=0
operation_parameters_minimum_occurrences["itemPocketList:::limit"]=0
operation_parameters_minimum_occurrences["itemPocketList:::offset"]=0
operation_parameters_minimum_occurrences["itemPocketList:::q"]=0
operation_parameters_minimum_occurrences["itemPocketRetrieve:::id"]=1
operation_parameters_minimum_occurrences["itemRetrieve:::id"]=1
operation_parameters_minimum_occurrences["locationAreaList:::limit"]=0
operation_parameters_minimum_occurrences["locationAreaList:::offset"]=0
operation_parameters_minimum_occurrences["locationAreaRetrieve:::id"]=1
operation_parameters_minimum_occurrences["locationList:::limit"]=0
operation_parameters_minimum_occurrences["locationList:::offset"]=0
operation_parameters_minimum_occurrences["locationList:::q"]=0
operation_parameters_minimum_occurrences["locationRetrieve:::id"]=1
operation_parameters_minimum_occurrences["palParkAreaList:::limit"]=0
operation_parameters_minimum_occurrences["palParkAreaList:::offset"]=0
operation_parameters_minimum_occurrences["palParkAreaList:::q"]=0
operation_parameters_minimum_occurrences["palParkAreaRetrieve:::id"]=1
operation_parameters_minimum_occurrences["regionList:::limit"]=0
operation_parameters_minimum_occurrences["regionList:::offset"]=0
operation_parameters_minimum_occurrences["regionList:::q"]=0
operation_parameters_minimum_occurrences["regionRetrieve:::id"]=1
operation_parameters_minimum_occurrences["machineList:::limit"]=0
operation_parameters_minimum_occurrences["machineList:::offset"]=0
operation_parameters_minimum_occurrences["machineList:::q"]=0
operation_parameters_minimum_occurrences["machineRetrieve:::id"]=1
operation_parameters_minimum_occurrences["moveAilmentList:::limit"]=0
operation_parameters_minimum_occurrences["moveAilmentList:::offset"]=0
operation_parameters_minimum_occurrences["moveAilmentList:::q"]=0
operation_parameters_minimum_occurrences["moveAilmentRetrieve:::id"]=1
operation_parameters_minimum_occurrences["moveBattleStyleList:::limit"]=0
operation_parameters_minimum_occurrences["moveBattleStyleList:::offset"]=0
operation_parameters_minimum_occurrences["moveBattleStyleList:::q"]=0
operation_parameters_minimum_occurrences["moveBattleStyleRetrieve:::id"]=1
operation_parameters_minimum_occurrences["moveCategoryList:::limit"]=0
operation_parameters_minimum_occurrences["moveCategoryList:::offset"]=0
operation_parameters_minimum_occurrences["moveCategoryList:::q"]=0
operation_parameters_minimum_occurrences["moveCategoryRetrieve:::id"]=1
operation_parameters_minimum_occurrences["moveLearnMethodList:::limit"]=0
operation_parameters_minimum_occurrences["moveLearnMethodList:::offset"]=0
operation_parameters_minimum_occurrences["moveLearnMethodList:::q"]=0
operation_parameters_minimum_occurrences["moveLearnMethodRetrieve:::id"]=1
operation_parameters_minimum_occurrences["moveList:::limit"]=0
operation_parameters_minimum_occurrences["moveList:::offset"]=0
operation_parameters_minimum_occurrences["moveList:::q"]=0
operation_parameters_minimum_occurrences["moveRetrieve:::id"]=1
operation_parameters_minimum_occurrences["moveTargetList:::limit"]=0
operation_parameters_minimum_occurrences["moveTargetList:::offset"]=0
operation_parameters_minimum_occurrences["moveTargetList:::q"]=0
operation_parameters_minimum_occurrences["moveTargetRetrieve:::id"]=1
operation_parameters_minimum_occurrences["abilityList:::limit"]=0
operation_parameters_minimum_occurrences["abilityList:::offset"]=0
operation_parameters_minimum_occurrences["abilityList:::q"]=0
operation_parameters_minimum_occurrences["abilityRetrieve:::id"]=1
operation_parameters_minimum_occurrences["characteristicList:::limit"]=0
operation_parameters_minimum_occurrences["characteristicList:::offset"]=0
operation_parameters_minimum_occurrences["characteristicList:::q"]=0
operation_parameters_minimum_occurrences["characteristicRetrieve:::id"]=1
operation_parameters_minimum_occurrences["eggGroupList:::limit"]=0
operation_parameters_minimum_occurrences["eggGroupList:::offset"]=0
operation_parameters_minimum_occurrences["eggGroupList:::q"]=0
operation_parameters_minimum_occurrences["eggGroupRetrieve:::id"]=1
operation_parameters_minimum_occurrences["genderList:::limit"]=0
operation_parameters_minimum_occurrences["genderList:::offset"]=0
operation_parameters_minimum_occurrences["genderList:::q"]=0
operation_parameters_minimum_occurrences["genderRetrieve:::id"]=1
operation_parameters_minimum_occurrences["growthRateList:::limit"]=0
operation_parameters_minimum_occurrences["growthRateList:::offset"]=0
operation_parameters_minimum_occurrences["growthRateList:::q"]=0
operation_parameters_minimum_occurrences["growthRateRetrieve:::id"]=1
operation_parameters_minimum_occurrences["moveDamageClassList:::limit"]=0
operation_parameters_minimum_occurrences["moveDamageClassList:::offset"]=0
operation_parameters_minimum_occurrences["moveDamageClassList:::q"]=0
operation_parameters_minimum_occurrences["moveDamageClassRetrieve:::id"]=1
operation_parameters_minimum_occurrences["natureList:::limit"]=0
operation_parameters_minimum_occurrences["natureList:::offset"]=0
operation_parameters_minimum_occurrences["natureList:::q"]=0
operation_parameters_minimum_occurrences["natureRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokeathlonStatList:::limit"]=0
operation_parameters_minimum_occurrences["pokeathlonStatList:::offset"]=0
operation_parameters_minimum_occurrences["pokeathlonStatList:::q"]=0
operation_parameters_minimum_occurrences["pokeathlonStatRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokemonColorList:::limit"]=0
operation_parameters_minimum_occurrences["pokemonColorList:::offset"]=0
operation_parameters_minimum_occurrences["pokemonColorList:::q"]=0
operation_parameters_minimum_occurrences["pokemonColorRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokemonFormList:::limit"]=0
operation_parameters_minimum_occurrences["pokemonFormList:::offset"]=0
operation_parameters_minimum_occurrences["pokemonFormList:::q"]=0
operation_parameters_minimum_occurrences["pokemonFormRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokemonHabitatList:::limit"]=0
operation_parameters_minimum_occurrences["pokemonHabitatList:::offset"]=0
operation_parameters_minimum_occurrences["pokemonHabitatList:::q"]=0
operation_parameters_minimum_occurrences["pokemonHabitatRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokemonList:::limit"]=0
operation_parameters_minimum_occurrences["pokemonList:::offset"]=0
operation_parameters_minimum_occurrences["pokemonList:::q"]=0
operation_parameters_minimum_occurrences["pokemonRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokemonShapeList:::limit"]=0
operation_parameters_minimum_occurrences["pokemonShapeList:::offset"]=0
operation_parameters_minimum_occurrences["pokemonShapeList:::q"]=0
operation_parameters_minimum_occurrences["pokemonShapeRetrieve:::id"]=1
operation_parameters_minimum_occurrences["pokemonSpeciesList:::limit"]=0
operation_parameters_minimum_occurrences["pokemonSpeciesList:::offset"]=0
operation_parameters_minimum_occurrences["pokemonSpeciesList:::q"]=0
operation_parameters_minimum_occurrences["pokemonSpeciesRetrieve:::id"]=1
operation_parameters_minimum_occurrences["statList:::limit"]=0
operation_parameters_minimum_occurrences["statList:::offset"]=0
operation_parameters_minimum_occurrences["statList:::q"]=0
operation_parameters_minimum_occurrences["statRetrieve:::id"]=1
operation_parameters_minimum_occurrences["typeList:::limit"]=0
operation_parameters_minimum_occurrences["typeList:::offset"]=0
operation_parameters_minimum_occurrences["typeList:::q"]=0
operation_parameters_minimum_occurrences["typeRetrieve:::id"]=1
operation_parameters_minimum_occurrences["languageList:::limit"]=0
operation_parameters_minimum_occurrences["languageList:::offset"]=0
operation_parameters_minimum_occurrences["languageList:::q"]=0
operation_parameters_minimum_occurrences["languageRetrieve:::id"]=1

##
# This array stores the maximum number of allowed occurrences for parameter
# 1 - single value
# 2 - 2 values
# N - N values
# 0 - unlimited
declare -A operation_parameters_maximum_occurrences
operation_parameters_maximum_occurrences["berryFirmnessList:::limit"]=0
operation_parameters_maximum_occurrences["berryFirmnessList:::offset"]=0
operation_parameters_maximum_occurrences["berryFirmnessList:::q"]=0
operation_parameters_maximum_occurrences["berryFirmnessRetrieve:::id"]=0
operation_parameters_maximum_occurrences["berryFlavorList:::limit"]=0
operation_parameters_maximum_occurrences["berryFlavorList:::offset"]=0
operation_parameters_maximum_occurrences["berryFlavorList:::q"]=0
operation_parameters_maximum_occurrences["berryFlavorRetrieve:::id"]=0
operation_parameters_maximum_occurrences["berryList:::limit"]=0
operation_parameters_maximum_occurrences["berryList:::offset"]=0
operation_parameters_maximum_occurrences["berryList:::q"]=0
operation_parameters_maximum_occurrences["berryRetrieve:::id"]=0
operation_parameters_maximum_occurrences["contestEffectList:::limit"]=0
operation_parameters_maximum_occurrences["contestEffectList:::offset"]=0
operation_parameters_maximum_occurrences["contestEffectList:::q"]=0
operation_parameters_maximum_occurrences["contestEffectRetrieve:::id"]=0
operation_parameters_maximum_occurrences["contestTypeList:::limit"]=0
operation_parameters_maximum_occurrences["contestTypeList:::offset"]=0
operation_parameters_maximum_occurrences["contestTypeList:::q"]=0
operation_parameters_maximum_occurrences["contestTypeRetrieve:::id"]=0
operation_parameters_maximum_occurrences["superContestEffectList:::limit"]=0
operation_parameters_maximum_occurrences["superContestEffectList:::offset"]=0
operation_parameters_maximum_occurrences["superContestEffectList:::q"]=0
operation_parameters_maximum_occurrences["superContestEffectRetrieve:::id"]=0
operation_parameters_maximum_occurrences["encounterConditionList:::limit"]=0
operation_parameters_maximum_occurrences["encounterConditionList:::offset"]=0
operation_parameters_maximum_occurrences["encounterConditionList:::q"]=0
operation_parameters_maximum_occurrences["encounterConditionRetrieve:::id"]=0
operation_parameters_maximum_occurrences["encounterConditionValueList:::limit"]=0
operation_parameters_maximum_occurrences["encounterConditionValueList:::offset"]=0
operation_parameters_maximum_occurrences["encounterConditionValueList:::q"]=0
operation_parameters_maximum_occurrences["encounterConditionValueRetrieve:::id"]=0
operation_parameters_maximum_occurrences["encounterMethodList:::limit"]=0
operation_parameters_maximum_occurrences["encounterMethodList:::offset"]=0
operation_parameters_maximum_occurrences["encounterMethodList:::q"]=0
operation_parameters_maximum_occurrences["encounterMethodRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokemonEncountersRetrieve:::pokemon_id"]=0
operation_parameters_maximum_occurrences["evolutionChainList:::limit"]=0
operation_parameters_maximum_occurrences["evolutionChainList:::offset"]=0
operation_parameters_maximum_occurrences["evolutionChainList:::q"]=0
operation_parameters_maximum_occurrences["evolutionChainRetrieve:::id"]=0
operation_parameters_maximum_occurrences["evolutionTriggerList:::limit"]=0
operation_parameters_maximum_occurrences["evolutionTriggerList:::offset"]=0
operation_parameters_maximum_occurrences["evolutionTriggerList:::q"]=0
operation_parameters_maximum_occurrences["evolutionTriggerRetrieve:::id"]=0
operation_parameters_maximum_occurrences["generationList:::limit"]=0
operation_parameters_maximum_occurrences["generationList:::offset"]=0
operation_parameters_maximum_occurrences["generationList:::q"]=0
operation_parameters_maximum_occurrences["generationRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokedexList:::limit"]=0
operation_parameters_maximum_occurrences["pokedexList:::offset"]=0
operation_parameters_maximum_occurrences["pokedexList:::q"]=0
operation_parameters_maximum_occurrences["pokedexRetrieve:::id"]=0
operation_parameters_maximum_occurrences["versionGroupList:::limit"]=0
operation_parameters_maximum_occurrences["versionGroupList:::offset"]=0
operation_parameters_maximum_occurrences["versionGroupList:::q"]=0
operation_parameters_maximum_occurrences["versionGroupRetrieve:::id"]=0
operation_parameters_maximum_occurrences["versionList:::limit"]=0
operation_parameters_maximum_occurrences["versionList:::offset"]=0
operation_parameters_maximum_occurrences["versionList:::q"]=0
operation_parameters_maximum_occurrences["versionRetrieve:::id"]=0
operation_parameters_maximum_occurrences["itemAttributeList:::limit"]=0
operation_parameters_maximum_occurrences["itemAttributeList:::offset"]=0
operation_parameters_maximum_occurrences["itemAttributeList:::q"]=0
operation_parameters_maximum_occurrences["itemAttributeRetrieve:::id"]=0
operation_parameters_maximum_occurrences["itemCategoryList:::limit"]=0
operation_parameters_maximum_occurrences["itemCategoryList:::offset"]=0
operation_parameters_maximum_occurrences["itemCategoryList:::q"]=0
operation_parameters_maximum_occurrences["itemCategoryRetrieve:::id"]=0
operation_parameters_maximum_occurrences["itemFlingEffectList:::limit"]=0
operation_parameters_maximum_occurrences["itemFlingEffectList:::offset"]=0
operation_parameters_maximum_occurrences["itemFlingEffectList:::q"]=0
operation_parameters_maximum_occurrences["itemFlingEffectRetrieve:::id"]=0
operation_parameters_maximum_occurrences["itemList:::limit"]=0
operation_parameters_maximum_occurrences["itemList:::offset"]=0
operation_parameters_maximum_occurrences["itemList:::q"]=0
operation_parameters_maximum_occurrences["itemPocketList:::limit"]=0
operation_parameters_maximum_occurrences["itemPocketList:::offset"]=0
operation_parameters_maximum_occurrences["itemPocketList:::q"]=0
operation_parameters_maximum_occurrences["itemPocketRetrieve:::id"]=0
operation_parameters_maximum_occurrences["itemRetrieve:::id"]=0
operation_parameters_maximum_occurrences["locationAreaList:::limit"]=0
operation_parameters_maximum_occurrences["locationAreaList:::offset"]=0
operation_parameters_maximum_occurrences["locationAreaRetrieve:::id"]=0
operation_parameters_maximum_occurrences["locationList:::limit"]=0
operation_parameters_maximum_occurrences["locationList:::offset"]=0
operation_parameters_maximum_occurrences["locationList:::q"]=0
operation_parameters_maximum_occurrences["locationRetrieve:::id"]=0
operation_parameters_maximum_occurrences["palParkAreaList:::limit"]=0
operation_parameters_maximum_occurrences["palParkAreaList:::offset"]=0
operation_parameters_maximum_occurrences["palParkAreaList:::q"]=0
operation_parameters_maximum_occurrences["palParkAreaRetrieve:::id"]=0
operation_parameters_maximum_occurrences["regionList:::limit"]=0
operation_parameters_maximum_occurrences["regionList:::offset"]=0
operation_parameters_maximum_occurrences["regionList:::q"]=0
operation_parameters_maximum_occurrences["regionRetrieve:::id"]=0
operation_parameters_maximum_occurrences["machineList:::limit"]=0
operation_parameters_maximum_occurrences["machineList:::offset"]=0
operation_parameters_maximum_occurrences["machineList:::q"]=0
operation_parameters_maximum_occurrences["machineRetrieve:::id"]=0
operation_parameters_maximum_occurrences["moveAilmentList:::limit"]=0
operation_parameters_maximum_occurrences["moveAilmentList:::offset"]=0
operation_parameters_maximum_occurrences["moveAilmentList:::q"]=0
operation_parameters_maximum_occurrences["moveAilmentRetrieve:::id"]=0
operation_parameters_maximum_occurrences["moveBattleStyleList:::limit"]=0
operation_parameters_maximum_occurrences["moveBattleStyleList:::offset"]=0
operation_parameters_maximum_occurrences["moveBattleStyleList:::q"]=0
operation_parameters_maximum_occurrences["moveBattleStyleRetrieve:::id"]=0
operation_parameters_maximum_occurrences["moveCategoryList:::limit"]=0
operation_parameters_maximum_occurrences["moveCategoryList:::offset"]=0
operation_parameters_maximum_occurrences["moveCategoryList:::q"]=0
operation_parameters_maximum_occurrences["moveCategoryRetrieve:::id"]=0
operation_parameters_maximum_occurrences["moveLearnMethodList:::limit"]=0
operation_parameters_maximum_occurrences["moveLearnMethodList:::offset"]=0
operation_parameters_maximum_occurrences["moveLearnMethodList:::q"]=0
operation_parameters_maximum_occurrences["moveLearnMethodRetrieve:::id"]=0
operation_parameters_maximum_occurrences["moveList:::limit"]=0
operation_parameters_maximum_occurrences["moveList:::offset"]=0
operation_parameters_maximum_occurrences["moveList:::q"]=0
operation_parameters_maximum_occurrences["moveRetrieve:::id"]=0
operation_parameters_maximum_occurrences["moveTargetList:::limit"]=0
operation_parameters_maximum_occurrences["moveTargetList:::offset"]=0
operation_parameters_maximum_occurrences["moveTargetList:::q"]=0
operation_parameters_maximum_occurrences["moveTargetRetrieve:::id"]=0
operation_parameters_maximum_occurrences["abilityList:::limit"]=0
operation_parameters_maximum_occurrences["abilityList:::offset"]=0
operation_parameters_maximum_occurrences["abilityList:::q"]=0
operation_parameters_maximum_occurrences["abilityRetrieve:::id"]=0
operation_parameters_maximum_occurrences["characteristicList:::limit"]=0
operation_parameters_maximum_occurrences["characteristicList:::offset"]=0
operation_parameters_maximum_occurrences["characteristicList:::q"]=0
operation_parameters_maximum_occurrences["characteristicRetrieve:::id"]=0
operation_parameters_maximum_occurrences["eggGroupList:::limit"]=0
operation_parameters_maximum_occurrences["eggGroupList:::offset"]=0
operation_parameters_maximum_occurrences["eggGroupList:::q"]=0
operation_parameters_maximum_occurrences["eggGroupRetrieve:::id"]=0
operation_parameters_maximum_occurrences["genderList:::limit"]=0
operation_parameters_maximum_occurrences["genderList:::offset"]=0
operation_parameters_maximum_occurrences["genderList:::q"]=0
operation_parameters_maximum_occurrences["genderRetrieve:::id"]=0
operation_parameters_maximum_occurrences["growthRateList:::limit"]=0
operation_parameters_maximum_occurrences["growthRateList:::offset"]=0
operation_parameters_maximum_occurrences["growthRateList:::q"]=0
operation_parameters_maximum_occurrences["growthRateRetrieve:::id"]=0
operation_parameters_maximum_occurrences["moveDamageClassList:::limit"]=0
operation_parameters_maximum_occurrences["moveDamageClassList:::offset"]=0
operation_parameters_maximum_occurrences["moveDamageClassList:::q"]=0
operation_parameters_maximum_occurrences["moveDamageClassRetrieve:::id"]=0
operation_parameters_maximum_occurrences["natureList:::limit"]=0
operation_parameters_maximum_occurrences["natureList:::offset"]=0
operation_parameters_maximum_occurrences["natureList:::q"]=0
operation_parameters_maximum_occurrences["natureRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokeathlonStatList:::limit"]=0
operation_parameters_maximum_occurrences["pokeathlonStatList:::offset"]=0
operation_parameters_maximum_occurrences["pokeathlonStatList:::q"]=0
operation_parameters_maximum_occurrences["pokeathlonStatRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokemonColorList:::limit"]=0
operation_parameters_maximum_occurrences["pokemonColorList:::offset"]=0
operation_parameters_maximum_occurrences["pokemonColorList:::q"]=0
operation_parameters_maximum_occurrences["pokemonColorRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokemonFormList:::limit"]=0
operation_parameters_maximum_occurrences["pokemonFormList:::offset"]=0
operation_parameters_maximum_occurrences["pokemonFormList:::q"]=0
operation_parameters_maximum_occurrences["pokemonFormRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokemonHabitatList:::limit"]=0
operation_parameters_maximum_occurrences["pokemonHabitatList:::offset"]=0
operation_parameters_maximum_occurrences["pokemonHabitatList:::q"]=0
operation_parameters_maximum_occurrences["pokemonHabitatRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokemonList:::limit"]=0
operation_parameters_maximum_occurrences["pokemonList:::offset"]=0
operation_parameters_maximum_occurrences["pokemonList:::q"]=0
operation_parameters_maximum_occurrences["pokemonRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokemonShapeList:::limit"]=0
operation_parameters_maximum_occurrences["pokemonShapeList:::offset"]=0
operation_parameters_maximum_occurrences["pokemonShapeList:::q"]=0
operation_parameters_maximum_occurrences["pokemonShapeRetrieve:::id"]=0
operation_parameters_maximum_occurrences["pokemonSpeciesList:::limit"]=0
operation_parameters_maximum_occurrences["pokemonSpeciesList:::offset"]=0
operation_parameters_maximum_occurrences["pokemonSpeciesList:::q"]=0
operation_parameters_maximum_occurrences["pokemonSpeciesRetrieve:::id"]=0
operation_parameters_maximum_occurrences["statList:::limit"]=0
operation_parameters_maximum_occurrences["statList:::offset"]=0
operation_parameters_maximum_occurrences["statList:::q"]=0
operation_parameters_maximum_occurrences["statRetrieve:::id"]=0
operation_parameters_maximum_occurrences["typeList:::limit"]=0
operation_parameters_maximum_occurrences["typeList:::offset"]=0
operation_parameters_maximum_occurrences["typeList:::q"]=0
operation_parameters_maximum_occurrences["typeRetrieve:::id"]=0
operation_parameters_maximum_occurrences["languageList:::limit"]=0
operation_parameters_maximum_occurrences["languageList:::offset"]=0
operation_parameters_maximum_occurrences["languageList:::q"]=0
operation_parameters_maximum_occurrences["languageRetrieve:::id"]=0

##
# The type of collection for specifying multiple values for parameter:
# - multi, csv, ssv, tsv
declare -A operation_parameters_collection_type
operation_parameters_collection_type["berryFirmnessList:::limit"]=""
operation_parameters_collection_type["berryFirmnessList:::offset"]=""
operation_parameters_collection_type["berryFirmnessList:::q"]=""
operation_parameters_collection_type["berryFirmnessRetrieve:::id"]=""
operation_parameters_collection_type["berryFlavorList:::limit"]=""
operation_parameters_collection_type["berryFlavorList:::offset"]=""
operation_parameters_collection_type["berryFlavorList:::q"]=""
operation_parameters_collection_type["berryFlavorRetrieve:::id"]=""
operation_parameters_collection_type["berryList:::limit"]=""
operation_parameters_collection_type["berryList:::offset"]=""
operation_parameters_collection_type["berryList:::q"]=""
operation_parameters_collection_type["berryRetrieve:::id"]=""
operation_parameters_collection_type["contestEffectList:::limit"]=""
operation_parameters_collection_type["contestEffectList:::offset"]=""
operation_parameters_collection_type["contestEffectList:::q"]=""
operation_parameters_collection_type["contestEffectRetrieve:::id"]=""
operation_parameters_collection_type["contestTypeList:::limit"]=""
operation_parameters_collection_type["contestTypeList:::offset"]=""
operation_parameters_collection_type["contestTypeList:::q"]=""
operation_parameters_collection_type["contestTypeRetrieve:::id"]=""
operation_parameters_collection_type["superContestEffectList:::limit"]=""
operation_parameters_collection_type["superContestEffectList:::offset"]=""
operation_parameters_collection_type["superContestEffectList:::q"]=""
operation_parameters_collection_type["superContestEffectRetrieve:::id"]=""
operation_parameters_collection_type["encounterConditionList:::limit"]=""
operation_parameters_collection_type["encounterConditionList:::offset"]=""
operation_parameters_collection_type["encounterConditionList:::q"]=""
operation_parameters_collection_type["encounterConditionRetrieve:::id"]=""
operation_parameters_collection_type["encounterConditionValueList:::limit"]=""
operation_parameters_collection_type["encounterConditionValueList:::offset"]=""
operation_parameters_collection_type["encounterConditionValueList:::q"]=""
operation_parameters_collection_type["encounterConditionValueRetrieve:::id"]=""
operation_parameters_collection_type["encounterMethodList:::limit"]=""
operation_parameters_collection_type["encounterMethodList:::offset"]=""
operation_parameters_collection_type["encounterMethodList:::q"]=""
operation_parameters_collection_type["encounterMethodRetrieve:::id"]=""
operation_parameters_collection_type["pokemonEncountersRetrieve:::pokemon_id"]=""
operation_parameters_collection_type["evolutionChainList:::limit"]=""
operation_parameters_collection_type["evolutionChainList:::offset"]=""
operation_parameters_collection_type["evolutionChainList:::q"]=""
operation_parameters_collection_type["evolutionChainRetrieve:::id"]=""
operation_parameters_collection_type["evolutionTriggerList:::limit"]=""
operation_parameters_collection_type["evolutionTriggerList:::offset"]=""
operation_parameters_collection_type["evolutionTriggerList:::q"]=""
operation_parameters_collection_type["evolutionTriggerRetrieve:::id"]=""
operation_parameters_collection_type["generationList:::limit"]=""
operation_parameters_collection_type["generationList:::offset"]=""
operation_parameters_collection_type["generationList:::q"]=""
operation_parameters_collection_type["generationRetrieve:::id"]=""
operation_parameters_collection_type["pokedexList:::limit"]=""
operation_parameters_collection_type["pokedexList:::offset"]=""
operation_parameters_collection_type["pokedexList:::q"]=""
operation_parameters_collection_type["pokedexRetrieve:::id"]=""
operation_parameters_collection_type["versionGroupList:::limit"]=""
operation_parameters_collection_type["versionGroupList:::offset"]=""
operation_parameters_collection_type["versionGroupList:::q"]=""
operation_parameters_collection_type["versionGroupRetrieve:::id"]=""
operation_parameters_collection_type["versionList:::limit"]=""
operation_parameters_collection_type["versionList:::offset"]=""
operation_parameters_collection_type["versionList:::q"]=""
operation_parameters_collection_type["versionRetrieve:::id"]=""
operation_parameters_collection_type["itemAttributeList:::limit"]=""
operation_parameters_collection_type["itemAttributeList:::offset"]=""
operation_parameters_collection_type["itemAttributeList:::q"]=""
operation_parameters_collection_type["itemAttributeRetrieve:::id"]=""
operation_parameters_collection_type["itemCategoryList:::limit"]=""
operation_parameters_collection_type["itemCategoryList:::offset"]=""
operation_parameters_collection_type["itemCategoryList:::q"]=""
operation_parameters_collection_type["itemCategoryRetrieve:::id"]=""
operation_parameters_collection_type["itemFlingEffectList:::limit"]=""
operation_parameters_collection_type["itemFlingEffectList:::offset"]=""
operation_parameters_collection_type["itemFlingEffectList:::q"]=""
operation_parameters_collection_type["itemFlingEffectRetrieve:::id"]=""
operation_parameters_collection_type["itemList:::limit"]=""
operation_parameters_collection_type["itemList:::offset"]=""
operation_parameters_collection_type["itemList:::q"]=""
operation_parameters_collection_type["itemPocketList:::limit"]=""
operation_parameters_collection_type["itemPocketList:::offset"]=""
operation_parameters_collection_type["itemPocketList:::q"]=""
operation_parameters_collection_type["itemPocketRetrieve:::id"]=""
operation_parameters_collection_type["itemRetrieve:::id"]=""
operation_parameters_collection_type["locationAreaList:::limit"]=""
operation_parameters_collection_type["locationAreaList:::offset"]=""
operation_parameters_collection_type["locationAreaRetrieve:::id"]=""
operation_parameters_collection_type["locationList:::limit"]=""
operation_parameters_collection_type["locationList:::offset"]=""
operation_parameters_collection_type["locationList:::q"]=""
operation_parameters_collection_type["locationRetrieve:::id"]=""
operation_parameters_collection_type["palParkAreaList:::limit"]=""
operation_parameters_collection_type["palParkAreaList:::offset"]=""
operation_parameters_collection_type["palParkAreaList:::q"]=""
operation_parameters_collection_type["palParkAreaRetrieve:::id"]=""
operation_parameters_collection_type["regionList:::limit"]=""
operation_parameters_collection_type["regionList:::offset"]=""
operation_parameters_collection_type["regionList:::q"]=""
operation_parameters_collection_type["regionRetrieve:::id"]=""
operation_parameters_collection_type["machineList:::limit"]=""
operation_parameters_collection_type["machineList:::offset"]=""
operation_parameters_collection_type["machineList:::q"]=""
operation_parameters_collection_type["machineRetrieve:::id"]=""
operation_parameters_collection_type["moveAilmentList:::limit"]=""
operation_parameters_collection_type["moveAilmentList:::offset"]=""
operation_parameters_collection_type["moveAilmentList:::q"]=""
operation_parameters_collection_type["moveAilmentRetrieve:::id"]=""
operation_parameters_collection_type["moveBattleStyleList:::limit"]=""
operation_parameters_collection_type["moveBattleStyleList:::offset"]=""
operation_parameters_collection_type["moveBattleStyleList:::q"]=""
operation_parameters_collection_type["moveBattleStyleRetrieve:::id"]=""
operation_parameters_collection_type["moveCategoryList:::limit"]=""
operation_parameters_collection_type["moveCategoryList:::offset"]=""
operation_parameters_collection_type["moveCategoryList:::q"]=""
operation_parameters_collection_type["moveCategoryRetrieve:::id"]=""
operation_parameters_collection_type["moveLearnMethodList:::limit"]=""
operation_parameters_collection_type["moveLearnMethodList:::offset"]=""
operation_parameters_collection_type["moveLearnMethodList:::q"]=""
operation_parameters_collection_type["moveLearnMethodRetrieve:::id"]=""
operation_parameters_collection_type["moveList:::limit"]=""
operation_parameters_collection_type["moveList:::offset"]=""
operation_parameters_collection_type["moveList:::q"]=""
operation_parameters_collection_type["moveRetrieve:::id"]=""
operation_parameters_collection_type["moveTargetList:::limit"]=""
operation_parameters_collection_type["moveTargetList:::offset"]=""
operation_parameters_collection_type["moveTargetList:::q"]=""
operation_parameters_collection_type["moveTargetRetrieve:::id"]=""
operation_parameters_collection_type["abilityList:::limit"]=""
operation_parameters_collection_type["abilityList:::offset"]=""
operation_parameters_collection_type["abilityList:::q"]=""
operation_parameters_collection_type["abilityRetrieve:::id"]=""
operation_parameters_collection_type["characteristicList:::limit"]=""
operation_parameters_collection_type["characteristicList:::offset"]=""
operation_parameters_collection_type["characteristicList:::q"]=""
operation_parameters_collection_type["characteristicRetrieve:::id"]=""
operation_parameters_collection_type["eggGroupList:::limit"]=""
operation_parameters_collection_type["eggGroupList:::offset"]=""
operation_parameters_collection_type["eggGroupList:::q"]=""
operation_parameters_collection_type["eggGroupRetrieve:::id"]=""
operation_parameters_collection_type["genderList:::limit"]=""
operation_parameters_collection_type["genderList:::offset"]=""
operation_parameters_collection_type["genderList:::q"]=""
operation_parameters_collection_type["genderRetrieve:::id"]=""
operation_parameters_collection_type["growthRateList:::limit"]=""
operation_parameters_collection_type["growthRateList:::offset"]=""
operation_parameters_collection_type["growthRateList:::q"]=""
operation_parameters_collection_type["growthRateRetrieve:::id"]=""
operation_parameters_collection_type["moveDamageClassList:::limit"]=""
operation_parameters_collection_type["moveDamageClassList:::offset"]=""
operation_parameters_collection_type["moveDamageClassList:::q"]=""
operation_parameters_collection_type["moveDamageClassRetrieve:::id"]=""
operation_parameters_collection_type["natureList:::limit"]=""
operation_parameters_collection_type["natureList:::offset"]=""
operation_parameters_collection_type["natureList:::q"]=""
operation_parameters_collection_type["natureRetrieve:::id"]=""
operation_parameters_collection_type["pokeathlonStatList:::limit"]=""
operation_parameters_collection_type["pokeathlonStatList:::offset"]=""
operation_parameters_collection_type["pokeathlonStatList:::q"]=""
operation_parameters_collection_type["pokeathlonStatRetrieve:::id"]=""
operation_parameters_collection_type["pokemonColorList:::limit"]=""
operation_parameters_collection_type["pokemonColorList:::offset"]=""
operation_parameters_collection_type["pokemonColorList:::q"]=""
operation_parameters_collection_type["pokemonColorRetrieve:::id"]=""
operation_parameters_collection_type["pokemonFormList:::limit"]=""
operation_parameters_collection_type["pokemonFormList:::offset"]=""
operation_parameters_collection_type["pokemonFormList:::q"]=""
operation_parameters_collection_type["pokemonFormRetrieve:::id"]=""
operation_parameters_collection_type["pokemonHabitatList:::limit"]=""
operation_parameters_collection_type["pokemonHabitatList:::offset"]=""
operation_parameters_collection_type["pokemonHabitatList:::q"]=""
operation_parameters_collection_type["pokemonHabitatRetrieve:::id"]=""
operation_parameters_collection_type["pokemonList:::limit"]=""
operation_parameters_collection_type["pokemonList:::offset"]=""
operation_parameters_collection_type["pokemonList:::q"]=""
operation_parameters_collection_type["pokemonRetrieve:::id"]=""
operation_parameters_collection_type["pokemonShapeList:::limit"]=""
operation_parameters_collection_type["pokemonShapeList:::offset"]=""
operation_parameters_collection_type["pokemonShapeList:::q"]=""
operation_parameters_collection_type["pokemonShapeRetrieve:::id"]=""
operation_parameters_collection_type["pokemonSpeciesList:::limit"]=""
operation_parameters_collection_type["pokemonSpeciesList:::offset"]=""
operation_parameters_collection_type["pokemonSpeciesList:::q"]=""
operation_parameters_collection_type["pokemonSpeciesRetrieve:::id"]=""
operation_parameters_collection_type["statList:::limit"]=""
operation_parameters_collection_type["statList:::offset"]=""
operation_parameters_collection_type["statList:::q"]=""
operation_parameters_collection_type["statRetrieve:::id"]=""
operation_parameters_collection_type["typeList:::limit"]=""
operation_parameters_collection_type["typeList:::offset"]=""
operation_parameters_collection_type["typeList:::q"]=""
operation_parameters_collection_type["typeRetrieve:::id"]=""
operation_parameters_collection_type["languageList:::limit"]=""
operation_parameters_collection_type["languageList:::offset"]=""
operation_parameters_collection_type["languageList:::q"]=""
operation_parameters_collection_type["languageRetrieve:::id"]=""


##
# Map for body parameters passed after operation as
# PARAMETER==STRING_VALUE or PARAMETER:=NUMERIC_VALUE
# These will be mapped to top level json keys ( { "PARAMETER": "VALUE" })
declare -A body_parameters

##
# These arguments will be directly passed to cURL
curl_arguments=""

##
# The host for making the request
host=""

##
# The user credentials for basic authentication
basic_auth_credential=""


##
# If true, the script will only output the actual cURL command that would be
# used
print_curl=false

##
# The operation ID passed on the command line
operation=""

##
# The provided Accept header value
header_accept=""

##
# The provided Content-type header value
header_content_type=""

##
# If there is any body content on the stdin pass it to the body of the request
body_content_temp_file=""

##
# If this variable is set to true, the request will be performed even
# if parameters for required query, header or body values are not provided
# (path parameters are still required).
force=false

##
# Declare some mime types abbreviations for easier content-type and accepts
# headers specification
declare -A mime_type_abbreviations
# text/*
mime_type_abbreviations["text"]="text/plain"
mime_type_abbreviations["html"]="text/html"
mime_type_abbreviations["md"]="text/x-markdown"
mime_type_abbreviations["csv"]="text/csv"
mime_type_abbreviations["css"]="text/css"
mime_type_abbreviations["rtf"]="text/rtf"
# application/*
mime_type_abbreviations["json"]="application/json"
mime_type_abbreviations["xml"]="application/xml"
mime_type_abbreviations["yaml"]="application/yaml"
mime_type_abbreviations["js"]="application/javascript"
mime_type_abbreviations["bin"]="application/octet-stream"
mime_type_abbreviations["rdf"]="application/rdf+xml"
# image/*
mime_type_abbreviations["jpg"]="image/jpeg"
mime_type_abbreviations["png"]="image/png"
mime_type_abbreviations["gif"]="image/gif"
mime_type_abbreviations["bmp"]="image/bmp"
mime_type_abbreviations["tiff"]="image/tiff"


##############################################################################
#
# Escape special URL characters
# Based on table at http://www.w3schools.com/tags/ref_urlencode.asp
#
##############################################################################
url_escape() {
    local raw_url="$1"

    value=$(sed -e 's/ /%20/g' \
       -e 's/!/%21/g' \
       -e 's/"/%22/g' \
       -e 's/#/%23/g' \
       -e 's/\&/%26/g' \
       -e 's/'\''/%28/g' \
       -e 's/(/%28/g' \
       -e 's/)/%29/g' \
       -e 's/:/%3A/g' \
       -e 's/\\t/%09/g' \
       -e 's/?/%3F/g' <<<"$raw_url");

    echo "$value"
}

##############################################################################
#
# Lookup the mime type abbreviation in the mime_type_abbreviations array.
# If not present assume the user provided a valid mime type
#
##############################################################################
lookup_mime_type() {
    local mime_type="$1"

    if [[ ${mime_type_abbreviations[$mime_type]} ]]; then
        echo "${mime_type_abbreviations[$mime_type]}"
    else
        echo "$mime_type"
    fi
}

##############################################################################
#
# Converts an associative array into a list of cURL header
# arguments (-H "KEY: VALUE")
#
##############################################################################
header_arguments_to_curl() {
    local headers_curl=""

    for key in "${!header_arguments[@]}"; do
        headers_curl+="-H \"${key}: ${header_arguments[${key}]}\" "
    done
    headers_curl+=" "

    echo "${headers_curl}"
}

##############################################################################
#
# Converts an associative array into a simple JSON with keys as top
# level object attributes
#
# \todo Add conversion of more complex attributes using paths
#
##############################################################################
body_parameters_to_json() {
    if [[ $RAW_BODY == "1" ]]; then
        echo "-d '${body_parameters["RAW_BODY"]}'"
    else
        local body_json="-d '{"
        local count=0
        for key in "${!body_parameters[@]}"; do
            if [[ $((count++)) -gt 0 ]]; then
                body_json+=", "
            fi
            body_json+="\"${key}\": ${body_parameters[${key}]}"
        done
        body_json+="}'"

        if [[ "${#body_parameters[@]}" -eq 0 ]]; then
            echo ""
        else
            echo "${body_json}"
        fi
    fi
}

##############################################################################
#
# Converts an associative array into form urlencoded string
#
##############################################################################
body_parameters_to_form_urlencoded() {
    local body_form_urlencoded="-d '"
    local count=0
    for key in "${!body_parameters[@]}"; do
        if [[ $((count++)) -gt 0 ]]; then
            body_form_urlencoded+="&"
        fi
        body_form_urlencoded+="${key}=${body_parameters[${key}]}"
    done
    body_form_urlencoded+="'"

    if [[ "${#body_parameters[@]}" -eq 0 ]]; then
        echo ""
    else
        echo "${body_form_urlencoded}"
    fi
}

##############################################################################
#
# Helper method for showing error because for example echo in
# build_request_path() is evaluated as part of command line not printed on
# output. Anyway better idea for resource clean up ;-).
#
##############################################################################
ERROR_MSG=""
function finish {
    if [[ -n "$ERROR_MSG" ]]; then
        echo >&2 "${OFF}${RED}$ERROR_MSG"
        echo >&2 "${OFF}Check usage: '${script_name} --help'"
    fi
}
trap finish EXIT


##############################################################################
#
# Validate and build request path including query parameters
#
##############################################################################
build_request_path() {
    local path_template=$1
    local -n path_params=$2
    local -n query_params=$3


    #
    # Check input parameters count against minimum and maximum required
    #
    if [[ "$force" = false ]]; then
        local was_error=""
        for qparam in "${query_params[@]}" "${path_params[@]}"; do
            local parameter_values
            mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

            #
            # Check if the number of provided values is not less than minimum required
            #
            if [[ ${#parameter_values[@]} -lt ${operation_parameters_minimum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too few values provided for '${qparam}' parameter."
                was_error=true
            fi

            #
            # Check if the number of provided values is not more than maximum
            #
            if [[ ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} -gt 0 \
                  && ${#parameter_values[@]} -gt ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too many values provided for '${qparam}' parameter"
                was_error=true
            fi
        done
        if [[ -n "$was_error" ]]; then
            exit 1
        fi
    fi

    # First replace all path parameters in the path
    for pparam in "${path_params[@]}"; do
        local path_regex="(.*)(\\{$pparam\\})(.*)"
        if [[ $path_template =~ $path_regex ]]; then
            path_template=${BASH_REMATCH[1]}${operation_parameters[$pparam]}${BASH_REMATCH[3]}
        fi
    done

    local query_request_part=""

    for qparam in "${query_params[@]}"; do
        if [[ "${operation_parameters[$qparam]}" == "" ]]; then
            continue
        fi

        # Get the array of parameter values
        local parameter_value=""
        local parameter_values
        mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")



        #
        # Append parameters without specific cardinality
        #
        local collection_type="${operation_parameters_collection_type["${operation}:::${qparam}"]}"
        if [[ "${collection_type}" == "" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'multi' collections i.e. param=value1&param=value2&...
        #
        elif [[ "${collection_type}" == "multi" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'csv' collections i.e. param=value1,value2,...
        #
        elif [[ "${collection_type}" == "csv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=","
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'ssv' collections i.e. param="value1 value2 ..."
        #
        elif [[ "${collection_type}" == "ssv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=" "
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'tsv' collections i.e. param="value1\tvalue2\t..."
        #
        elif [[ "${collection_type}" == "tsv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="\\t"
                fi
                parameter_value+="${qvalue}"
            done
        else
            echo "Unsupported collection format \"${collection_type}\""
            exit 1
        fi

        if [[ -n "${parameter_value}" ]]; then
            if [[ -n "${query_request_part}" ]]; then
                query_request_part+="&"
            fi
            query_request_part+="${parameter_value}"
        fi

    done


    # Now append query parameters - if any
    if [[ -n "${query_request_part}" ]]; then
        path_template+="?${query_request_part}"
    fi

    echo "$path_template"
}



###############################################################################
#
# Print main help message
#
###############################################################################
print_help() {
cat <<EOF

${BOLD}${WHITE}PokéAPI command line client (API version 2.7.0)${OFF}

${BOLD}${WHITE}Usage${OFF}

  ${GREEN}${script_name}${OFF} [-h|--help] [-V|--version] [--about] [${RED}<curl-options>${OFF}]
           [-ac|--accept ${GREEN}<mime-type>${OFF}] [-ct,--content-type ${GREEN}<mime-type>${OFF}]
           [--host ${CYAN}<url>${OFF}] [--dry-run] [-nc|--no-colors] ${YELLOW}<operation>${OFF} [-h|--help]
           [${BLUE}<headers>${OFF}] [${MAGENTA}<parameters>${OFF}] [${MAGENTA}<body-parameters>${OFF}]

  - ${CYAN}<url>${OFF} - endpoint of the REST service without basepath

  - ${RED}<curl-options>${OFF} - any valid cURL options can be passed before ${YELLOW}<operation>${OFF}
  - ${GREEN}<mime-type>${OFF} - either full mime-type or one of supported abbreviations:
                   (text, html, md, csv, css, rtf, json, xml, yaml, js, bin,
                    rdf, jpg, png, gif, bmp, tiff)
  - ${BLUE}<headers>${OFF} - HTTP headers can be passed in the form ${YELLOW}HEADER${OFF}:${BLUE}VALUE${OFF}
  - ${MAGENTA}<parameters>${OFF} - REST operation parameters can be passed in the following
                   forms:
                   * ${YELLOW}KEY${OFF}=${BLUE}VALUE${OFF} - path or query parameters
  - ${MAGENTA}<body-parameters>${OFF} - simple JSON body content (first level only) can be build
                        using the following arguments:
                        * ${YELLOW}KEY${OFF}==${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": "${BLUE}VALUE${OFF}", ... }'
                        * ${YELLOW}KEY${OFF}:=${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": ${BLUE}VALUE${OFF}, ... }'

EOF
    echo -e "${BOLD}${WHITE}Authentication methods${OFF}"
    echo -e ""
    echo -e "  - ${BLUE}Basic AUTH${OFF} - add '-u <username>:<password>' before ${YELLOW}<operation>${OFF}"
    
    
    echo ""
    echo -e "${BOLD}${WHITE}Operations (grouped by tags)${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}[berries]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}berryFirmnessList${OFF};List berry firmness (AUTH) (AUTH)
  ${CYAN}berryFirmnessRetrieve${OFF};Get berry by firmness (AUTH) (AUTH)
  ${CYAN}berryFlavorList${OFF};List berry flavors (AUTH) (AUTH)
  ${CYAN}berryFlavorRetrieve${OFF};Get berries by flavor (AUTH) (AUTH)
  ${CYAN}berryList${OFF};List berries (AUTH) (AUTH)
  ${CYAN}berryRetrieve${OFF};Get a berry (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[contests]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}contestEffectList${OFF};List contest effects (AUTH) (AUTH)
  ${CYAN}contestEffectRetrieve${OFF};Get contest effect (AUTH) (AUTH)
  ${CYAN}contestTypeList${OFF};List contest types (AUTH) (AUTH)
  ${CYAN}contestTypeRetrieve${OFF};Get contest type (AUTH) (AUTH)
  ${CYAN}superContestEffectList${OFF};List super contest effects (AUTH) (AUTH)
  ${CYAN}superContestEffectRetrieve${OFF};Get super contest effect (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[encounters]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}encounterConditionList${OFF};List encounter conditions (AUTH) (AUTH)
  ${CYAN}encounterConditionRetrieve${OFF};Get encounter condition (AUTH) (AUTH)
  ${CYAN}encounterConditionValueList${OFF};List encounter condition values (AUTH) (AUTH)
  ${CYAN}encounterConditionValueRetrieve${OFF};Get encounter condition value (AUTH) (AUTH)
  ${CYAN}encounterMethodList${OFF};List encounter methods (AUTH) (AUTH)
  ${CYAN}encounterMethodRetrieve${OFF};Get encounter method (AUTH) (AUTH)
  ${CYAN}pokemonEncountersRetrieve${OFF};Get pokemon encounter (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[evolution]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}evolutionChainList${OFF};List evolution chains (AUTH) (AUTH)
  ${CYAN}evolutionChainRetrieve${OFF};Get evolution chain (AUTH) (AUTH)
  ${CYAN}evolutionTriggerList${OFF};List evolution triggers (AUTH) (AUTH)
  ${CYAN}evolutionTriggerRetrieve${OFF};Get evolution trigger (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[games]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}generationList${OFF};List genrations (AUTH) (AUTH)
  ${CYAN}generationRetrieve${OFF};Get genration (AUTH) (AUTH)
  ${CYAN}pokedexList${OFF};List pokedex (AUTH) (AUTH)
  ${CYAN}pokedexRetrieve${OFF};Get pokedex (AUTH) (AUTH)
  ${CYAN}versionGroupList${OFF};List version groups (AUTH) (AUTH)
  ${CYAN}versionGroupRetrieve${OFF};Get version group (AUTH) (AUTH)
  ${CYAN}versionList${OFF};List versions (AUTH) (AUTH)
  ${CYAN}versionRetrieve${OFF};Get version (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[items]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}itemAttributeList${OFF};List item attributes (AUTH) (AUTH)
  ${CYAN}itemAttributeRetrieve${OFF};Get item attribute (AUTH) (AUTH)
  ${CYAN}itemCategoryList${OFF};List item categories (AUTH) (AUTH)
  ${CYAN}itemCategoryRetrieve${OFF};Get item category (AUTH) (AUTH)
  ${CYAN}itemFlingEffectList${OFF};List item fling effects (AUTH) (AUTH)
  ${CYAN}itemFlingEffectRetrieve${OFF};Get item fling effect (AUTH) (AUTH)
  ${CYAN}itemList${OFF};List items (AUTH) (AUTH)
  ${CYAN}itemPocketList${OFF};List item pockets (AUTH) (AUTH)
  ${CYAN}itemPocketRetrieve${OFF};Get item pocket (AUTH) (AUTH)
  ${CYAN}itemRetrieve${OFF};Get item (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[location]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}locationAreaList${OFF};List location areas (AUTH) (AUTH)
  ${CYAN}locationAreaRetrieve${OFF};Get location area (AUTH) (AUTH)
  ${CYAN}locationList${OFF};List locations (AUTH) (AUTH)
  ${CYAN}locationRetrieve${OFF};Get location (AUTH) (AUTH)
  ${CYAN}palParkAreaList${OFF};List pal park areas (AUTH) (AUTH)
  ${CYAN}palParkAreaRetrieve${OFF};Get pal park area (AUTH) (AUTH)
  ${CYAN}regionList${OFF};List regions (AUTH) (AUTH)
  ${CYAN}regionRetrieve${OFF};Get region (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[machines]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}machineList${OFF};List machines (AUTH) (AUTH)
  ${CYAN}machineRetrieve${OFF};Get machine (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[moves]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}moveAilmentList${OFF};List move meta ailments (AUTH) (AUTH)
  ${CYAN}moveAilmentRetrieve${OFF};Get move meta ailment (AUTH) (AUTH)
  ${CYAN}moveBattleStyleList${OFF};List move battle styles (AUTH) (AUTH)
  ${CYAN}moveBattleStyleRetrieve${OFF};Get move battle style (AUTH) (AUTH)
  ${CYAN}moveCategoryList${OFF};List move meta categories (AUTH) (AUTH)
  ${CYAN}moveCategoryRetrieve${OFF};Get move meta category (AUTH) (AUTH)
  ${CYAN}moveLearnMethodList${OFF};List move learn methods (AUTH) (AUTH)
  ${CYAN}moveLearnMethodRetrieve${OFF};Get move learn method (AUTH) (AUTH)
  ${CYAN}moveList${OFF};List moves (AUTH) (AUTH)
  ${CYAN}moveRetrieve${OFF};Get move (AUTH) (AUTH)
  ${CYAN}moveTargetList${OFF};List move targets (AUTH) (AUTH)
  ${CYAN}moveTargetRetrieve${OFF};Get move target (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[pokemon]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}abilityList${OFF}; (AUTH) (AUTH)
  ${CYAN}abilityRetrieve${OFF}; (AUTH) (AUTH)
  ${CYAN}characteristicList${OFF};List charecterictics (AUTH) (AUTH)
  ${CYAN}characteristicRetrieve${OFF};Get characteristic (AUTH) (AUTH)
  ${CYAN}eggGroupList${OFF};List egg groups (AUTH) (AUTH)
  ${CYAN}eggGroupRetrieve${OFF};Get egg group (AUTH) (AUTH)
  ${CYAN}genderList${OFF};List genders (AUTH) (AUTH)
  ${CYAN}genderRetrieve${OFF};Get gender (AUTH) (AUTH)
  ${CYAN}growthRateList${OFF};List growth rates (AUTH) (AUTH)
  ${CYAN}growthRateRetrieve${OFF};Get growth rate (AUTH) (AUTH)
  ${CYAN}moveDamageClassList${OFF};List move damage classes (AUTH) (AUTH)
  ${CYAN}moveDamageClassRetrieve${OFF};Get move damage class (AUTH) (AUTH)
  ${CYAN}natureList${OFF};List natures (AUTH) (AUTH)
  ${CYAN}natureRetrieve${OFF};Get nature (AUTH) (AUTH)
  ${CYAN}pokeathlonStatList${OFF};List pokeathlon stats (AUTH) (AUTH)
  ${CYAN}pokeathlonStatRetrieve${OFF};Get pokeathlon stat (AUTH) (AUTH)
  ${CYAN}pokemonColorList${OFF};List pokemon colors (AUTH) (AUTH)
  ${CYAN}pokemonColorRetrieve${OFF};Get pokemon color (AUTH) (AUTH)
  ${CYAN}pokemonFormList${OFF};List pokemon forms (AUTH) (AUTH)
  ${CYAN}pokemonFormRetrieve${OFF};Get pokemon form (AUTH) (AUTH)
  ${CYAN}pokemonHabitatList${OFF};List pokemom habitas (AUTH) (AUTH)
  ${CYAN}pokemonHabitatRetrieve${OFF};Get pokemom habita (AUTH) (AUTH)
  ${CYAN}pokemonList${OFF};List pokemon (AUTH) (AUTH)
  ${CYAN}pokemonRetrieve${OFF};Get pokemon (AUTH) (AUTH)
  ${CYAN}pokemonShapeList${OFF};List pokemon shapes (AUTH) (AUTH)
  ${CYAN}pokemonShapeRetrieve${OFF};Get pokemon shape (AUTH) (AUTH)
  ${CYAN}pokemonSpeciesList${OFF};List pokemon species (AUTH) (AUTH)
  ${CYAN}pokemonSpeciesRetrieve${OFF};Get pokemon species (AUTH) (AUTH)
  ${CYAN}statList${OFF};List stats (AUTH) (AUTH)
  ${CYAN}statRetrieve${OFF};Get stat (AUTH) (AUTH)
  ${CYAN}typeList${OFF};List types (AUTH) (AUTH)
  ${CYAN}typeRetrieve${OFF};Get types (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[utility]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}languageList${OFF};List languages (AUTH) (AUTH)
  ${CYAN}languageRetrieve${OFF};Get language (AUTH) (AUTH)
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}Options${OFF}"
    echo -e "  -h,--help\\t\\t\\t\\tPrint this help"
    echo -e "  -V,--version\\t\\t\\t\\tPrint API version"
    echo -e "  --about\\t\\t\\t\\tPrint the information about service"
    echo -e "  --host ${CYAN}<url>${OFF}\\t\\t\\t\\tSpecify the host URL "
echo -e "              \\t\\t\\t\\t(e.g. 'https://pokeapi.co')"

    echo -e "  --force\\t\\t\\t\\tForce command invocation in spite of missing"
    echo -e "         \\t\\t\\t\\trequired parameters or wrong content type"
    echo -e "  --dry-run\\t\\t\\t\\tPrint out the cURL command without"
    echo -e "           \\t\\t\\t\\texecuting it"
    echo -e "  -nc,--no-colors\\t\\t\\tEnforce print without colors, otherwise autodetected"
    echo -e "  -ac,--accept ${YELLOW}<mime-type>${OFF}\\t\\tSet the 'Accept' header in the request"
    echo -e "  -ct,--content-type ${YELLOW}<mime-type>${OFF}\\tSet the 'Content-type' header in "
    echo -e "                                \\tthe request"
    echo ""
}


##############################################################################
#
# Print REST service description
#
##############################################################################
print_about() {
    echo ""
    echo -e "${BOLD}${WHITE}PokéAPI command line client (API version 2.7.0)${OFF}"
    echo ""
    echo -e "License: "
    echo -e "Contact: blah+oapicf@cliffano.com"
    echo ""
read -r -d '' appdescription <<EOF

All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.

## What is this?

This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.

We've covered everything from Pokémon to Berry Flavors.

## Where do I start?

We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.

This API will always be publicly available and will never require any extensive setup process to consume.

Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
EOF
echo "$appdescription" | paste -sd' ' - | fold -sw 80
}


##############################################################################
#
# Print REST api version
#
##############################################################################
print_version() {
    echo ""
    echo -e "${BOLD}PokéAPI command line client (API version 2.7.0)${OFF}"
    echo ""
}

##############################################################################
#
# Print help for berryFirmnessList operation
#
##############################################################################
print_berryFirmnessList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}berryFirmnessList - List berry firmness${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for berryFirmnessRetrieve operation
#
##############################################################################
print_berryFirmnessRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}berryFirmnessRetrieve - Get berry by firmness${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for berryFlavorList operation
#
##############################################################################
print_berryFlavorList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}berryFlavorList - List berry flavors${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for berryFlavorRetrieve operation
#
##############################################################################
print_berryFlavorRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}berryFlavorRetrieve - Get berries by flavor${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for berryList operation
#
##############################################################################
print_berryList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}berryList - List berries${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for berryRetrieve operation
#
##############################################################################
print_berryRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}berryRetrieve - Get a berry${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for contestEffectList operation
#
##############################################################################
print_contestEffectList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}contestEffectList - List contest effects${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Contest effects refer to the effects of moves when used in contests." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for contestEffectRetrieve operation
#
##############################################################################
print_contestEffectRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}contestEffectRetrieve - Get contest effect${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Contest effects refer to the effects of moves when used in contests." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for contestTypeList operation
#
##############################################################################
print_contestTypeList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}contestTypeList - List contest types${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for contestTypeRetrieve operation
#
##############################################################################
print_contestTypeRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}contestTypeRetrieve - Get contest type${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for superContestEffectList operation
#
##############################################################################
print_superContestEffectList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}superContestEffectList - List super contest effects${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Super contest effects refer to the effects of moves when used in super contests." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for superContestEffectRetrieve operation
#
##############################################################################
print_superContestEffectRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}superContestEffectRetrieve - Get super contest effect${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Super contest effects refer to the effects of moves when used in super contests." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for encounterConditionList operation
#
##############################################################################
print_encounterConditionList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}encounterConditionList - List encounter conditions${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Conditions which affect what pokemon might appear in the wild, e.g., day or night." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for encounterConditionRetrieve operation
#
##############################################################################
print_encounterConditionRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}encounterConditionRetrieve - Get encounter condition${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Conditions which affect what pokemon might appear in the wild, e.g., day or night." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for encounterConditionValueList operation
#
##############################################################################
print_encounterConditionValueList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}encounterConditionValueList - List encounter condition values${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for encounterConditionValueRetrieve operation
#
##############################################################################
print_encounterConditionValueRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}encounterConditionValueRetrieve - Get encounter condition value${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for encounterMethodList operation
#
##############################################################################
print_encounterMethodList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}encounterMethodList - List encounter methods${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for encounterMethodRetrieve operation
#
##############################################################################
print_encounterMethodRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}encounterMethodRetrieve - Get encounter method${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonEncountersRetrieve operation
#
##############################################################################
print_pokemonEncountersRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonEncountersRetrieve - Get pokemon encounter${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Handles Pokemon Encounters as a sub-resource." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}pokemon_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} -  ${YELLOW}Specify as: pokemon_id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for evolutionChainList operation
#
##############################################################################
print_evolutionChainList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}evolutionChainList - List evolution chains${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for evolutionChainRetrieve operation
#
##############################################################################
print_evolutionChainRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}evolutionChainRetrieve - Get evolution chain${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for evolutionTriggerList operation
#
##############################################################################
print_evolutionTriggerList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}evolutionTriggerList - List evolution triggers${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for evolutionTriggerRetrieve operation
#
##############################################################################
print_evolutionTriggerRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}evolutionTriggerRetrieve - Get evolution trigger${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for generationList operation
#
##############################################################################
print_generationList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}generationList - List genrations${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for generationRetrieve operation
#
##############################################################################
print_generationRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}generationRetrieve - Get genration${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokedexList operation
#
##############################################################################
print_pokedexList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokedexList - List pokedex${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokedexRetrieve operation
#
##############################################################################
print_pokedexRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokedexRetrieve - Get pokedex${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for versionGroupList operation
#
##############################################################################
print_versionGroupList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}versionGroupList - List version groups${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Version groups categorize highly similar versions of the games." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for versionGroupRetrieve operation
#
##############################################################################
print_versionGroupRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}versionGroupRetrieve - Get version group${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Version groups categorize highly similar versions of the games." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for versionList operation
#
##############################################################################
print_versionList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}versionList - List versions${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Versions of the games, e.g., Red, Blue or Yellow." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for versionRetrieve operation
#
##############################################################################
print_versionRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}versionRetrieve - Get version${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Versions of the games, e.g., Red, Blue or Yellow." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemAttributeList operation
#
##############################################################################
print_itemAttributeList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemAttributeList - List item attributes${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\"." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemAttributeRetrieve operation
#
##############################################################################
print_itemAttributeRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemAttributeRetrieve - Get item attribute${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\"." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemCategoryList operation
#
##############################################################################
print_itemCategoryList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemCategoryList - List item categories${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Item categories determine where items will be placed in the players bag." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemCategoryRetrieve operation
#
##############################################################################
print_itemCategoryRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemCategoryRetrieve - Get item category${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Item categories determine where items will be placed in the players bag." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemFlingEffectList operation
#
##############################################################################
print_itemFlingEffectList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemFlingEffectList - List item fling effects${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "The various effects of the move\"Fling\" when used with different items." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemFlingEffectRetrieve operation
#
##############################################################################
print_itemFlingEffectRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemFlingEffectRetrieve - Get item fling effect${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "The various effects of the move\"Fling\" when used with different items." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemList operation
#
##############################################################################
print_itemList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemList - List items${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemPocketList operation
#
##############################################################################
print_itemPocketList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemPocketList - List item pockets${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Pockets within the players bag used for storing items by category." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemPocketRetrieve operation
#
##############################################################################
print_itemPocketRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemPocketRetrieve - Get item pocket${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Pockets within the players bag used for storing items by category." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for itemRetrieve operation
#
##############################################################################
print_itemRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}itemRetrieve - Get item${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for locationAreaList operation
#
##############################################################################
print_locationAreaList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}locationAreaList - List location areas${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for locationAreaRetrieve operation
#
##############################################################################
print_locationAreaRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}locationAreaRetrieve - Get location area${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - A unique integer value identifying this location area. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for locationList operation
#
##############################################################################
print_locationList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}locationList - List locations${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for locationRetrieve operation
#
##############################################################################
print_locationRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}locationRetrieve - Get location${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for palParkAreaList operation
#
##############################################################################
print_palParkAreaList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}palParkAreaList - List pal park areas${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for palParkAreaRetrieve operation
#
##############################################################################
print_palParkAreaRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}palParkAreaRetrieve - Get pal park area${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for regionList operation
#
##############################################################################
print_regionList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}regionList - List regions${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for regionRetrieve operation
#
##############################################################################
print_regionRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}regionRetrieve - Get region${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for machineList operation
#
##############################################################################
print_machineList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}machineList - List machines${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for machineRetrieve operation
#
##############################################################################
print_machineRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}machineRetrieve - Get machine${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveAilmentList operation
#
##############################################################################
print_moveAilmentList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveAilmentList - List move meta ailments${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveAilmentRetrieve operation
#
##############################################################################
print_moveAilmentRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveAilmentRetrieve - Get move meta ailment${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveBattleStyleList operation
#
##############################################################################
print_moveBattleStyleList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveBattleStyleList - List move battle styles${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveBattleStyleRetrieve operation
#
##############################################################################
print_moveBattleStyleRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveBattleStyleRetrieve - Get move battle style${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveCategoryList operation
#
##############################################################################
print_moveCategoryList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveCategoryList - List move meta categories${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Very general categories that loosely group move effects." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveCategoryRetrieve operation
#
##############################################################################
print_moveCategoryRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveCategoryRetrieve - Get move meta category${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Very general categories that loosely group move effects." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveLearnMethodList operation
#
##############################################################################
print_moveLearnMethodList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveLearnMethodList - List move learn methods${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Methods by which Pokémon can learn moves." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveLearnMethodRetrieve operation
#
##############################################################################
print_moveLearnMethodRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveLearnMethodRetrieve - Get move learn method${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Methods by which Pokémon can learn moves." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveList operation
#
##############################################################################
print_moveList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveList - List moves${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveRetrieve operation
#
##############################################################################
print_moveRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveRetrieve - Get move${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveTargetList operation
#
##############################################################################
print_moveTargetList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveTargetList - List move targets${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveTargetRetrieve operation
#
##############################################################################
print_moveTargetRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveTargetRetrieve - Get move target${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for abilityList operation
#
##############################################################################
print_abilityList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}abilityList - ${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for abilityRetrieve operation
#
##############################################################################
print_abilityRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}abilityRetrieve - ${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for characteristicList operation
#
##############################################################################
print_characteristicList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}characteristicList - List charecterictics${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for characteristicRetrieve operation
#
##############################################################################
print_characteristicRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}characteristicRetrieve - Get characteristic${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for eggGroupList operation
#
##############################################################################
print_eggGroupList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}eggGroupList - List egg groups${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for eggGroupRetrieve operation
#
##############################################################################
print_eggGroupRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}eggGroupRetrieve - Get egg group${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for genderList operation
#
##############################################################################
print_genderList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}genderList - List genders${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for genderRetrieve operation
#
##############################################################################
print_genderRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}genderRetrieve - Get gender${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for growthRateList operation
#
##############################################################################
print_growthRateList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}growthRateList - List growth rates${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for growthRateRetrieve operation
#
##############################################################################
print_growthRateRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}growthRateRetrieve - Get growth rate${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveDamageClassList operation
#
##############################################################################
print_moveDamageClassList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveDamageClassList - List move damage classes${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Damage classes moves can have, e.g. physical, special, or non-damaging." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for moveDamageClassRetrieve operation
#
##############################################################################
print_moveDamageClassRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}moveDamageClassRetrieve - Get move damage class${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Damage classes moves can have, e.g. physical, special, or non-damaging." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for natureList operation
#
##############################################################################
print_natureList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}natureList - List natures${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for natureRetrieve operation
#
##############################################################################
print_natureRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}natureRetrieve - Get nature${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokeathlonStatList operation
#
##############################################################################
print_pokeathlonStatList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokeathlonStatList - List pokeathlon stats${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokeathlonStatRetrieve operation
#
##############################################################################
print_pokeathlonStatRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokeathlonStatRetrieve - Get pokeathlon stat${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonColorList operation
#
##############################################################################
print_pokemonColorList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonColorList - List pokemon colors${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonColorRetrieve operation
#
##############################################################################
print_pokemonColorRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonColorRetrieve - Get pokemon color${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonFormList operation
#
##############################################################################
print_pokemonFormList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonFormList - List pokemon forms${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonFormRetrieve operation
#
##############################################################################
print_pokemonFormRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonFormRetrieve - Get pokemon form${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonHabitatList operation
#
##############################################################################
print_pokemonHabitatList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonHabitatList - List pokemom habitas${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonHabitatRetrieve operation
#
##############################################################################
print_pokemonHabitatRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonHabitatRetrieve - Get pokemom habita${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonList operation
#
##############################################################################
print_pokemonList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonList - List pokemon${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonRetrieve operation
#
##############################################################################
print_pokemonRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonRetrieve - Get pokemon${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonShapeList operation
#
##############################################################################
print_pokemonShapeList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonShapeList - List pokemon shapes${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Shapes used for sorting Pokémon in a Pokédex." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonShapeRetrieve operation
#
##############################################################################
print_pokemonShapeRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonShapeRetrieve - Get pokemon shape${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Shapes used for sorting Pokémon in a Pokédex." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonSpeciesList operation
#
##############################################################################
print_pokemonSpeciesList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonSpeciesList - List pokemon species${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for pokemonSpeciesRetrieve operation
#
##############################################################################
print_pokemonSpeciesRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}pokemonSpeciesRetrieve - Get pokemon species${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for statList operation
#
##############################################################################
print_statList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}statList - List stats${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for statRetrieve operation
#
##############################################################################
print_statRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}statRetrieve - Get stat${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for typeList operation
#
##############################################################################
print_typeList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}typeList - List types${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for typeRetrieve operation
#
##############################################################################
print_typeRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}typeRetrieve - Get types${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for languageList operation
#
##############################################################################
print_languageList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}languageList - List languages${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Languages for translations of API resource information." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Number of results to return per page.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}offset${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - The initial index from which to return the results.${YELLOW} Specify as: offset=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}q${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property.${YELLOW} Specify as: q=value${OFF}" \
        | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for languageRetrieve operation
#
##############################################################################
print_languageRetrieve_help() {
    echo ""
    echo -e "${BOLD}${WHITE}languageRetrieve - Get language${OFF}${BLUE}(AUTH - BASIC)${OFF}${BLUE}(AUTH - )${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Languages for translations of API resource information." | paste -sd' ' - | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - This parameter can be a string or an integer. ${YELLOW}Specify as: id=value${OFF}" | paste -sd' ' - | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;${OFF}" | paste -sd' ' - | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}


##############################################################################
#
# Call berryFirmnessList operation
#
##############################################################################
call_berryFirmnessList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/berry-firmness/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call berryFirmnessRetrieve operation
#
##############################################################################
call_berryFirmnessRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/berry-firmness/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call berryFlavorList operation
#
##############################################################################
call_berryFlavorList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/berry-flavor/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call berryFlavorRetrieve operation
#
##############################################################################
call_berryFlavorRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/berry-flavor/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call berryList operation
#
##############################################################################
call_berryList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/berry/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call berryRetrieve operation
#
##############################################################################
call_berryRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/berry/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call contestEffectList operation
#
##############################################################################
call_contestEffectList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/contest-effect/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call contestEffectRetrieve operation
#
##############################################################################
call_contestEffectRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/contest-effect/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call contestTypeList operation
#
##############################################################################
call_contestTypeList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/contest-type/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call contestTypeRetrieve operation
#
##############################################################################
call_contestTypeRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/contest-type/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call superContestEffectList operation
#
##############################################################################
call_superContestEffectList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/super-contest-effect/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call superContestEffectRetrieve operation
#
##############################################################################
call_superContestEffectRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/super-contest-effect/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call encounterConditionList operation
#
##############################################################################
call_encounterConditionList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/encounter-condition/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call encounterConditionRetrieve operation
#
##############################################################################
call_encounterConditionRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/encounter-condition/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call encounterConditionValueList operation
#
##############################################################################
call_encounterConditionValueList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/encounter-condition-value/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call encounterConditionValueRetrieve operation
#
##############################################################################
call_encounterConditionValueRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/encounter-condition-value/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call encounterMethodList operation
#
##############################################################################
call_encounterMethodList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/encounter-method/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call encounterMethodRetrieve operation
#
##############################################################################
call_encounterMethodRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/encounter-method/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonEncountersRetrieve operation
#
##############################################################################
call_pokemonEncountersRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(pokemon_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon/{pokemon_id}/encounters" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call evolutionChainList operation
#
##############################################################################
call_evolutionChainList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/evolution-chain/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call evolutionChainRetrieve operation
#
##############################################################################
call_evolutionChainRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/evolution-chain/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call evolutionTriggerList operation
#
##############################################################################
call_evolutionTriggerList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/evolution-trigger/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call evolutionTriggerRetrieve operation
#
##############################################################################
call_evolutionTriggerRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/evolution-trigger/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call generationList operation
#
##############################################################################
call_generationList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/generation/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call generationRetrieve operation
#
##############################################################################
call_generationRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/generation/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokedexList operation
#
##############################################################################
call_pokedexList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pokedex/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokedexRetrieve operation
#
##############################################################################
call_pokedexRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokedex/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call versionGroupList operation
#
##############################################################################
call_versionGroupList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/version-group/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call versionGroupRetrieve operation
#
##############################################################################
call_versionGroupRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/version-group/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call versionList operation
#
##############################################################################
call_versionList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/version/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call versionRetrieve operation
#
##############################################################################
call_versionRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/version/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemAttributeList operation
#
##############################################################################
call_itemAttributeList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/item-attribute/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemAttributeRetrieve operation
#
##############################################################################
call_itemAttributeRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/item-attribute/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemCategoryList operation
#
##############################################################################
call_itemCategoryList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/item-category/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemCategoryRetrieve operation
#
##############################################################################
call_itemCategoryRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/item-category/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemFlingEffectList operation
#
##############################################################################
call_itemFlingEffectList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/item-fling-effect/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemFlingEffectRetrieve operation
#
##############################################################################
call_itemFlingEffectRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/item-fling-effect/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemList operation
#
##############################################################################
call_itemList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/item/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemPocketList operation
#
##############################################################################
call_itemPocketList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/item-pocket/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemPocketRetrieve operation
#
##############################################################################
call_itemPocketRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/item-pocket/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call itemRetrieve operation
#
##############################################################################
call_itemRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/item/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call locationAreaList operation
#
##############################################################################
call_locationAreaList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset    )
    local path

    if ! path=$(build_request_path "/api/v2/location-area/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call locationAreaRetrieve operation
#
##############################################################################
call_locationAreaRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/location-area/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call locationList operation
#
##############################################################################
call_locationList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/location/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call locationRetrieve operation
#
##############################################################################
call_locationRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/location/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call palParkAreaList operation
#
##############################################################################
call_palParkAreaList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pal-park-area/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call palParkAreaRetrieve operation
#
##############################################################################
call_palParkAreaRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pal-park-area/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call regionList operation
#
##############################################################################
call_regionList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/region/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call regionRetrieve operation
#
##############################################################################
call_regionRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/region/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call machineList operation
#
##############################################################################
call_machineList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/machine/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call machineRetrieve operation
#
##############################################################################
call_machineRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/machine/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveAilmentList operation
#
##############################################################################
call_moveAilmentList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/move-ailment/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveAilmentRetrieve operation
#
##############################################################################
call_moveAilmentRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/move-ailment/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveBattleStyleList operation
#
##############################################################################
call_moveBattleStyleList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/move-battle-style/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveBattleStyleRetrieve operation
#
##############################################################################
call_moveBattleStyleRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/move-battle-style/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveCategoryList operation
#
##############################################################################
call_moveCategoryList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/move-category/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveCategoryRetrieve operation
#
##############################################################################
call_moveCategoryRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/move-category/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveLearnMethodList operation
#
##############################################################################
call_moveLearnMethodList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/move-learn-method/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveLearnMethodRetrieve operation
#
##############################################################################
call_moveLearnMethodRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/move-learn-method/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveList operation
#
##############################################################################
call_moveList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/move/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveRetrieve operation
#
##############################################################################
call_moveRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/move/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveTargetList operation
#
##############################################################################
call_moveTargetList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/move-target/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveTargetRetrieve operation
#
##############################################################################
call_moveTargetRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/move-target/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call abilityList operation
#
##############################################################################
call_abilityList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/ability/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call abilityRetrieve operation
#
##############################################################################
call_abilityRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/ability/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call characteristicList operation
#
##############################################################################
call_characteristicList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/characteristic/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call characteristicRetrieve operation
#
##############################################################################
call_characteristicRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/characteristic/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call eggGroupList operation
#
##############################################################################
call_eggGroupList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/egg-group/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call eggGroupRetrieve operation
#
##############################################################################
call_eggGroupRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/egg-group/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call genderList operation
#
##############################################################################
call_genderList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/gender/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call genderRetrieve operation
#
##############################################################################
call_genderRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/gender/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call growthRateList operation
#
##############################################################################
call_growthRateList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/growth-rate/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call growthRateRetrieve operation
#
##############################################################################
call_growthRateRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/growth-rate/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveDamageClassList operation
#
##############################################################################
call_moveDamageClassList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/move-damage-class/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call moveDamageClassRetrieve operation
#
##############################################################################
call_moveDamageClassRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/move-damage-class/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call natureList operation
#
##############################################################################
call_natureList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/nature/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call natureRetrieve operation
#
##############################################################################
call_natureRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/nature/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokeathlonStatList operation
#
##############################################################################
call_pokeathlonStatList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pokeathlon-stat/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokeathlonStatRetrieve operation
#
##############################################################################
call_pokeathlonStatRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokeathlon-stat/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonColorList operation
#
##############################################################################
call_pokemonColorList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-color/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonColorRetrieve operation
#
##############################################################################
call_pokemonColorRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-color/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonFormList operation
#
##############################################################################
call_pokemonFormList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-form/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonFormRetrieve operation
#
##############################################################################
call_pokemonFormRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-form/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonHabitatList operation
#
##############################################################################
call_pokemonHabitatList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-habitat/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonHabitatRetrieve operation
#
##############################################################################
call_pokemonHabitatRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-habitat/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonList operation
#
##############################################################################
call_pokemonList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonRetrieve operation
#
##############################################################################
call_pokemonRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonShapeList operation
#
##############################################################################
call_pokemonShapeList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-shape/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonShapeRetrieve operation
#
##############################################################################
call_pokemonShapeRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-shape/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonSpeciesList operation
#
##############################################################################
call_pokemonSpeciesList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-species/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call pokemonSpeciesRetrieve operation
#
##############################################################################
call_pokemonSpeciesRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/pokemon-species/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call statList operation
#
##############################################################################
call_statList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/stat/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call statRetrieve operation
#
##############################################################################
call_statRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/stat/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call typeList operation
#
##############################################################################
call_typeList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/type/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call typeRetrieve operation
#
##############################################################################
call_typeRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/type/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call languageList operation
#
##############################################################################
call_languageList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(limit offset q    )
    local path

    if ! path=$(build_request_path "/api/v2/language/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call languageRetrieve operation
#
##############################################################################
call_languageRetrieve() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(    )
    local path

    if ! path=$(build_request_path "/api/v2/language/{id}/" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl -d '' ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}



##############################################################################
#
# Main
#
##############################################################################


# Check dependencies
type curl >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'cURL' installed."; exit 1; }
type sed >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'sed' installed."; exit 1; }
type column >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'bsdmainutils' installed."; exit 1; }

#
# Process command line
#
# Pass all arguments before 'operation' to cURL except the ones we override
#
take_user=false
take_host=false
take_accept_header=false
take_contenttype_header=false

for key in "$@"; do
# Take the value of -u|--user argument
if [[ "$take_user" = true ]]; then
    basic_auth_credential="$key"
    take_user=false
    continue
fi
# Take the value of --host argument
if [[ "$take_host" = true ]]; then
    host="$key"
    take_host=false
    continue
fi
# Take the value of --accept argument
if [[ "$take_accept_header" = true ]]; then
    header_accept=$(lookup_mime_type "$key")
    take_accept_header=false
    continue
fi
# Take the value of --content-type argument
if [[ "$take_contenttype_header" = true ]]; then
    header_content_type=$(lookup_mime_type "$key")
    take_contenttype_header=false
    continue
fi
case $key in
    -h|--help)
    if [[ "x$operation" == "x" ]]; then
        print_help
        exit 0
    else
        eval "print_${operation}_help"
        exit 0
    fi
    ;;
    -V|--version)
    print_version
    exit 0
    ;;
    --about)
    print_about
    exit 0
    ;;
    -u|--user)
    take_user=true
    ;;
    --host)
    take_host=true
    ;;
    --force)
    force=true
    ;;
    -ac|--accept)
    take_accept_header=true
    ;;
    -ct|--content-type)
    take_contenttype_header=true
    ;;
    --dry-run)
    print_curl=true
    ;;
    -nc|--no-colors)
        RED=""
        GREEN=""
        YELLOW=""
        BLUE=""
        MAGENTA=""
        CYAN=""
        WHITE=""
        BOLD=""
        OFF=""
        result_color_table=( "" "" "" "" "" "" "" )
    ;;
    berryFirmnessList)
    operation="berryFirmnessList"
    ;;
    berryFirmnessRetrieve)
    operation="berryFirmnessRetrieve"
    ;;
    berryFlavorList)
    operation="berryFlavorList"
    ;;
    berryFlavorRetrieve)
    operation="berryFlavorRetrieve"
    ;;
    berryList)
    operation="berryList"
    ;;
    berryRetrieve)
    operation="berryRetrieve"
    ;;
    contestEffectList)
    operation="contestEffectList"
    ;;
    contestEffectRetrieve)
    operation="contestEffectRetrieve"
    ;;
    contestTypeList)
    operation="contestTypeList"
    ;;
    contestTypeRetrieve)
    operation="contestTypeRetrieve"
    ;;
    superContestEffectList)
    operation="superContestEffectList"
    ;;
    superContestEffectRetrieve)
    operation="superContestEffectRetrieve"
    ;;
    encounterConditionList)
    operation="encounterConditionList"
    ;;
    encounterConditionRetrieve)
    operation="encounterConditionRetrieve"
    ;;
    encounterConditionValueList)
    operation="encounterConditionValueList"
    ;;
    encounterConditionValueRetrieve)
    operation="encounterConditionValueRetrieve"
    ;;
    encounterMethodList)
    operation="encounterMethodList"
    ;;
    encounterMethodRetrieve)
    operation="encounterMethodRetrieve"
    ;;
    pokemonEncountersRetrieve)
    operation="pokemonEncountersRetrieve"
    ;;
    evolutionChainList)
    operation="evolutionChainList"
    ;;
    evolutionChainRetrieve)
    operation="evolutionChainRetrieve"
    ;;
    evolutionTriggerList)
    operation="evolutionTriggerList"
    ;;
    evolutionTriggerRetrieve)
    operation="evolutionTriggerRetrieve"
    ;;
    generationList)
    operation="generationList"
    ;;
    generationRetrieve)
    operation="generationRetrieve"
    ;;
    pokedexList)
    operation="pokedexList"
    ;;
    pokedexRetrieve)
    operation="pokedexRetrieve"
    ;;
    versionGroupList)
    operation="versionGroupList"
    ;;
    versionGroupRetrieve)
    operation="versionGroupRetrieve"
    ;;
    versionList)
    operation="versionList"
    ;;
    versionRetrieve)
    operation="versionRetrieve"
    ;;
    itemAttributeList)
    operation="itemAttributeList"
    ;;
    itemAttributeRetrieve)
    operation="itemAttributeRetrieve"
    ;;
    itemCategoryList)
    operation="itemCategoryList"
    ;;
    itemCategoryRetrieve)
    operation="itemCategoryRetrieve"
    ;;
    itemFlingEffectList)
    operation="itemFlingEffectList"
    ;;
    itemFlingEffectRetrieve)
    operation="itemFlingEffectRetrieve"
    ;;
    itemList)
    operation="itemList"
    ;;
    itemPocketList)
    operation="itemPocketList"
    ;;
    itemPocketRetrieve)
    operation="itemPocketRetrieve"
    ;;
    itemRetrieve)
    operation="itemRetrieve"
    ;;
    locationAreaList)
    operation="locationAreaList"
    ;;
    locationAreaRetrieve)
    operation="locationAreaRetrieve"
    ;;
    locationList)
    operation="locationList"
    ;;
    locationRetrieve)
    operation="locationRetrieve"
    ;;
    palParkAreaList)
    operation="palParkAreaList"
    ;;
    palParkAreaRetrieve)
    operation="palParkAreaRetrieve"
    ;;
    regionList)
    operation="regionList"
    ;;
    regionRetrieve)
    operation="regionRetrieve"
    ;;
    machineList)
    operation="machineList"
    ;;
    machineRetrieve)
    operation="machineRetrieve"
    ;;
    moveAilmentList)
    operation="moveAilmentList"
    ;;
    moveAilmentRetrieve)
    operation="moveAilmentRetrieve"
    ;;
    moveBattleStyleList)
    operation="moveBattleStyleList"
    ;;
    moveBattleStyleRetrieve)
    operation="moveBattleStyleRetrieve"
    ;;
    moveCategoryList)
    operation="moveCategoryList"
    ;;
    moveCategoryRetrieve)
    operation="moveCategoryRetrieve"
    ;;
    moveLearnMethodList)
    operation="moveLearnMethodList"
    ;;
    moveLearnMethodRetrieve)
    operation="moveLearnMethodRetrieve"
    ;;
    moveList)
    operation="moveList"
    ;;
    moveRetrieve)
    operation="moveRetrieve"
    ;;
    moveTargetList)
    operation="moveTargetList"
    ;;
    moveTargetRetrieve)
    operation="moveTargetRetrieve"
    ;;
    abilityList)
    operation="abilityList"
    ;;
    abilityRetrieve)
    operation="abilityRetrieve"
    ;;
    characteristicList)
    operation="characteristicList"
    ;;
    characteristicRetrieve)
    operation="characteristicRetrieve"
    ;;
    eggGroupList)
    operation="eggGroupList"
    ;;
    eggGroupRetrieve)
    operation="eggGroupRetrieve"
    ;;
    genderList)
    operation="genderList"
    ;;
    genderRetrieve)
    operation="genderRetrieve"
    ;;
    growthRateList)
    operation="growthRateList"
    ;;
    growthRateRetrieve)
    operation="growthRateRetrieve"
    ;;
    moveDamageClassList)
    operation="moveDamageClassList"
    ;;
    moveDamageClassRetrieve)
    operation="moveDamageClassRetrieve"
    ;;
    natureList)
    operation="natureList"
    ;;
    natureRetrieve)
    operation="natureRetrieve"
    ;;
    pokeathlonStatList)
    operation="pokeathlonStatList"
    ;;
    pokeathlonStatRetrieve)
    operation="pokeathlonStatRetrieve"
    ;;
    pokemonColorList)
    operation="pokemonColorList"
    ;;
    pokemonColorRetrieve)
    operation="pokemonColorRetrieve"
    ;;
    pokemonFormList)
    operation="pokemonFormList"
    ;;
    pokemonFormRetrieve)
    operation="pokemonFormRetrieve"
    ;;
    pokemonHabitatList)
    operation="pokemonHabitatList"
    ;;
    pokemonHabitatRetrieve)
    operation="pokemonHabitatRetrieve"
    ;;
    pokemonList)
    operation="pokemonList"
    ;;
    pokemonRetrieve)
    operation="pokemonRetrieve"
    ;;
    pokemonShapeList)
    operation="pokemonShapeList"
    ;;
    pokemonShapeRetrieve)
    operation="pokemonShapeRetrieve"
    ;;
    pokemonSpeciesList)
    operation="pokemonSpeciesList"
    ;;
    pokemonSpeciesRetrieve)
    operation="pokemonSpeciesRetrieve"
    ;;
    statList)
    operation="statList"
    ;;
    statRetrieve)
    operation="statRetrieve"
    ;;
    typeList)
    operation="typeList"
    ;;
    typeRetrieve)
    operation="typeRetrieve"
    ;;
    languageList)
    operation="languageList"
    ;;
    languageRetrieve)
    operation="languageRetrieve"
    ;;
    *==*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content as strings
    if [[ "$operation" ]]; then
        IFS='==' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]="\"${body_value}\""
    fi
    ;;
    --body=*)
    # Parse value of body as argument and convert it into only
    # the raw body content
    if [[ "$operation" ]]; then
        IFS='--body=' read -r body_value <<< "$key"
        body_value=${body_value##--body=}
        body_parameters["RAW_BODY"]="${body_value}"
        RAW_BODY=1
    fi
    ;;
    *:=*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content without quotes
    if [[ "$operation" ]]; then
        # ignore error about 'sep' being unused
        # shellcheck disable=SC2034
        IFS=':=' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]=${body_value}
    fi
    ;;
    +([^=]):*)
    # Parse header arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS=':' read -r header_name header_value <<< "$key"
        header_arguments[$header_name]=$header_value
    else
        curl_arguments+=" $key"
    fi
    ;;
    -)
    body_content_temp_file=$(mktemp)
    cat - > "$body_content_temp_file"
    ;;
    *=*)
    # Parse operation arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS='=' read -r parameter_name parameter_value <<< "$key"
        if [[ -z "${operation_parameters[$parameter_name]+foo}" ]]; then
            operation_parameters[$parameter_name]=$(url_escape "${parameter_value}")
        else
            operation_parameters[$parameter_name]+=":::"$(url_escape "${parameter_value}")
        fi
    else
        curl_arguments+=" $key"
    fi
    ;;
    *)
    # If we are before the operation, treat the arguments as cURL arguments
    if [[ "x$operation" == "x" ]]; then
        # Maintain quotes around cURL arguments if necessary
        space_regexp="[[:space:]]"
        if [[ $key =~ $space_regexp ]]; then
            curl_arguments+=" \"$key\""
        else
            curl_arguments+=" $key"
        fi
    fi
    ;;
esac
done


# Check if user provided host name
if [[ -z "$host" ]]; then
    ERROR_MSG="ERROR: No hostname provided!!! You have to  provide on command line option '--host ...'"
    exit 1
fi

# Check if user specified operation ID
if [[ -z "$operation" ]]; then
    ERROR_MSG="ERROR: No operation specified!!!"
    exit 1
fi


# Run cURL command based on the operation ID
case $operation in
    berryFirmnessList)
    call_berryFirmnessList
    ;;
    berryFirmnessRetrieve)
    call_berryFirmnessRetrieve
    ;;
    berryFlavorList)
    call_berryFlavorList
    ;;
    berryFlavorRetrieve)
    call_berryFlavorRetrieve
    ;;
    berryList)
    call_berryList
    ;;
    berryRetrieve)
    call_berryRetrieve
    ;;
    contestEffectList)
    call_contestEffectList
    ;;
    contestEffectRetrieve)
    call_contestEffectRetrieve
    ;;
    contestTypeList)
    call_contestTypeList
    ;;
    contestTypeRetrieve)
    call_contestTypeRetrieve
    ;;
    superContestEffectList)
    call_superContestEffectList
    ;;
    superContestEffectRetrieve)
    call_superContestEffectRetrieve
    ;;
    encounterConditionList)
    call_encounterConditionList
    ;;
    encounterConditionRetrieve)
    call_encounterConditionRetrieve
    ;;
    encounterConditionValueList)
    call_encounterConditionValueList
    ;;
    encounterConditionValueRetrieve)
    call_encounterConditionValueRetrieve
    ;;
    encounterMethodList)
    call_encounterMethodList
    ;;
    encounterMethodRetrieve)
    call_encounterMethodRetrieve
    ;;
    pokemonEncountersRetrieve)
    call_pokemonEncountersRetrieve
    ;;
    evolutionChainList)
    call_evolutionChainList
    ;;
    evolutionChainRetrieve)
    call_evolutionChainRetrieve
    ;;
    evolutionTriggerList)
    call_evolutionTriggerList
    ;;
    evolutionTriggerRetrieve)
    call_evolutionTriggerRetrieve
    ;;
    generationList)
    call_generationList
    ;;
    generationRetrieve)
    call_generationRetrieve
    ;;
    pokedexList)
    call_pokedexList
    ;;
    pokedexRetrieve)
    call_pokedexRetrieve
    ;;
    versionGroupList)
    call_versionGroupList
    ;;
    versionGroupRetrieve)
    call_versionGroupRetrieve
    ;;
    versionList)
    call_versionList
    ;;
    versionRetrieve)
    call_versionRetrieve
    ;;
    itemAttributeList)
    call_itemAttributeList
    ;;
    itemAttributeRetrieve)
    call_itemAttributeRetrieve
    ;;
    itemCategoryList)
    call_itemCategoryList
    ;;
    itemCategoryRetrieve)
    call_itemCategoryRetrieve
    ;;
    itemFlingEffectList)
    call_itemFlingEffectList
    ;;
    itemFlingEffectRetrieve)
    call_itemFlingEffectRetrieve
    ;;
    itemList)
    call_itemList
    ;;
    itemPocketList)
    call_itemPocketList
    ;;
    itemPocketRetrieve)
    call_itemPocketRetrieve
    ;;
    itemRetrieve)
    call_itemRetrieve
    ;;
    locationAreaList)
    call_locationAreaList
    ;;
    locationAreaRetrieve)
    call_locationAreaRetrieve
    ;;
    locationList)
    call_locationList
    ;;
    locationRetrieve)
    call_locationRetrieve
    ;;
    palParkAreaList)
    call_palParkAreaList
    ;;
    palParkAreaRetrieve)
    call_palParkAreaRetrieve
    ;;
    regionList)
    call_regionList
    ;;
    regionRetrieve)
    call_regionRetrieve
    ;;
    machineList)
    call_machineList
    ;;
    machineRetrieve)
    call_machineRetrieve
    ;;
    moveAilmentList)
    call_moveAilmentList
    ;;
    moveAilmentRetrieve)
    call_moveAilmentRetrieve
    ;;
    moveBattleStyleList)
    call_moveBattleStyleList
    ;;
    moveBattleStyleRetrieve)
    call_moveBattleStyleRetrieve
    ;;
    moveCategoryList)
    call_moveCategoryList
    ;;
    moveCategoryRetrieve)
    call_moveCategoryRetrieve
    ;;
    moveLearnMethodList)
    call_moveLearnMethodList
    ;;
    moveLearnMethodRetrieve)
    call_moveLearnMethodRetrieve
    ;;
    moveList)
    call_moveList
    ;;
    moveRetrieve)
    call_moveRetrieve
    ;;
    moveTargetList)
    call_moveTargetList
    ;;
    moveTargetRetrieve)
    call_moveTargetRetrieve
    ;;
    abilityList)
    call_abilityList
    ;;
    abilityRetrieve)
    call_abilityRetrieve
    ;;
    characteristicList)
    call_characteristicList
    ;;
    characteristicRetrieve)
    call_characteristicRetrieve
    ;;
    eggGroupList)
    call_eggGroupList
    ;;
    eggGroupRetrieve)
    call_eggGroupRetrieve
    ;;
    genderList)
    call_genderList
    ;;
    genderRetrieve)
    call_genderRetrieve
    ;;
    growthRateList)
    call_growthRateList
    ;;
    growthRateRetrieve)
    call_growthRateRetrieve
    ;;
    moveDamageClassList)
    call_moveDamageClassList
    ;;
    moveDamageClassRetrieve)
    call_moveDamageClassRetrieve
    ;;
    natureList)
    call_natureList
    ;;
    natureRetrieve)
    call_natureRetrieve
    ;;
    pokeathlonStatList)
    call_pokeathlonStatList
    ;;
    pokeathlonStatRetrieve)
    call_pokeathlonStatRetrieve
    ;;
    pokemonColorList)
    call_pokemonColorList
    ;;
    pokemonColorRetrieve)
    call_pokemonColorRetrieve
    ;;
    pokemonFormList)
    call_pokemonFormList
    ;;
    pokemonFormRetrieve)
    call_pokemonFormRetrieve
    ;;
    pokemonHabitatList)
    call_pokemonHabitatList
    ;;
    pokemonHabitatRetrieve)
    call_pokemonHabitatRetrieve
    ;;
    pokemonList)
    call_pokemonList
    ;;
    pokemonRetrieve)
    call_pokemonRetrieve
    ;;
    pokemonShapeList)
    call_pokemonShapeList
    ;;
    pokemonShapeRetrieve)
    call_pokemonShapeRetrieve
    ;;
    pokemonSpeciesList)
    call_pokemonSpeciesList
    ;;
    pokemonSpeciesRetrieve)
    call_pokemonSpeciesRetrieve
    ;;
    statList)
    call_statList
    ;;
    statRetrieve)
    call_statRetrieve
    ;;
    typeList)
    call_typeList
    ;;
    typeRetrieve)
    call_typeRetrieve
    ;;
    languageList)
    call_languageList
    ;;
    languageRetrieve)
    call_languageRetrieve
    ;;
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
