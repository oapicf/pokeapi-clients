namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EggGroupSummary
open OpenAPI.Model.EvolutionChainSummary
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.GrowthRateSummary
open OpenAPI.Model.PokemonColorSummary
open OpenAPI.Model.PokemonDexEntry
open OpenAPI.Model.PokemonHabitatSummary
open OpenAPI.Model.PokemonShapeSummary
open OpenAPI.Model.PokemonSpeciesDescription
open OpenAPI.Model.PokemonSpeciesFlavorText
open OpenAPI.Model.PokemonSpeciesGenus
open OpenAPI.Model.PokemonSpeciesName
open OpenAPI.Model.PokemonSpeciesPalParkEncounter
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.PokemonSpeciesVariety
open OpenAPI.Model.int option

module PokemonSpeciesDetail =

  //#region PokemonSpeciesDetail


  type PokemonSpeciesDetail = {
    Id : int;
    Name : string;
    Order : int option;
    GenderRate : int option;
    CaptureRate : int option;
    BaseHappiness : int option;
    IsBaby : bool;
    IsLegendary : bool;
    IsMythical : bool;
    HatchCounter : int option;
    HasGenderDifferences : bool;
    FormsSwitchable : bool;
    GrowthRate : GrowthRateSummary;
    PokedexNumbers : PokemonDexEntry[];
    EggGroups : EggGroupSummary[];
    Color : PokemonColorSummary;
    Shape : PokemonShapeSummary;
    EvolvesFromSpecies : PokemonSpeciesSummary;
    EvolutionChain : EvolutionChainSummary;
    Habitat : PokemonHabitatSummary;
    Generation : GenerationSummary;
    Names : PokemonSpeciesName[];
    PalParkEncounters : PokemonSpeciesPalParkEncounter[];
    FormDescriptions : PokemonSpeciesDescription[];
    FlavorTextEntries : PokemonSpeciesFlavorText[];
    Genera : PokemonSpeciesGenus[];
    Varieties : PokemonSpeciesVariety[];
  }
  //#endregion
