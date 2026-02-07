namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.EvolutionChainSummary
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.GrowthRateSummary
open OpenAPI.Model.PokemonColorSummary
open OpenAPI.Model.PokemonDexEntry
open OpenAPI.Model.PokemonFormDetailFormNamesInner
open OpenAPI.Model.PokemonHabitatSummary
open OpenAPI.Model.PokemonShapeSummary
open OpenAPI.Model.PokemonSpeciesDescription
open OpenAPI.Model.PokemonSpeciesDetailGeneraInner
open OpenAPI.Model.PokemonSpeciesDetailPalParkEncountersInner
open OpenAPI.Model.PokemonSpeciesDetailVarietiesInner
open OpenAPI.Model.PokemonSpeciesFlavorText
open OpenAPI.Model.PokemonSpeciesSummary
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
    EggGroups : AbilityDetailPokemonInnerPokemon[];
    Color : PokemonColorSummary;
    Shape : PokemonShapeSummary;
    EvolvesFromSpecies : PokemonSpeciesSummary;
    EvolutionChain : EvolutionChainSummary;
    Habitat : PokemonHabitatSummary;
    Generation : GenerationSummary;
    Names : PokemonFormDetailFormNamesInner[];
    PalParkEncounters : PokemonSpeciesDetailPalParkEncountersInner[];
    FormDescriptions : PokemonSpeciesDescription[];
    FlavorTextEntries : PokemonSpeciesFlavorText[];
    Genera : PokemonSpeciesDetailGeneraInner[];
    Varieties : PokemonSpeciesDetailVarietiesInner[];
  }
  //#endregion
