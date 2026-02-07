namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
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

  [<CLIMutable>]
  type PokemonSpeciesDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "order")>]
    Order : int option;
    [<JsonProperty(PropertyName = "gender_rate")>]
    GenderRate : int option;
    [<JsonProperty(PropertyName = "capture_rate")>]
    CaptureRate : int option;
    [<JsonProperty(PropertyName = "base_happiness")>]
    BaseHappiness : int option;
    [<JsonProperty(PropertyName = "is_baby")>]
    IsBaby : bool;
    [<JsonProperty(PropertyName = "is_legendary")>]
    IsLegendary : bool;
    [<JsonProperty(PropertyName = "is_mythical")>]
    IsMythical : bool;
    [<JsonProperty(PropertyName = "hatch_counter")>]
    HatchCounter : int option;
    [<JsonProperty(PropertyName = "has_gender_differences")>]
    HasGenderDifferences : bool;
    [<JsonProperty(PropertyName = "forms_switchable")>]
    FormsSwitchable : bool;
    [<JsonProperty(PropertyName = "growth_rate")>]
    GrowthRate : GrowthRateSummary;
    [<JsonProperty(PropertyName = "pokedex_numbers")>]
    PokedexNumbers : PokemonDexEntry[];
    [<JsonProperty(PropertyName = "egg_groups")>]
    EggGroups : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "color")>]
    Color : PokemonColorSummary;
    [<JsonProperty(PropertyName = "shape")>]
    Shape : PokemonShapeSummary;
    [<JsonProperty(PropertyName = "evolves_from_species")>]
    EvolvesFromSpecies : PokemonSpeciesSummary;
    [<JsonProperty(PropertyName = "evolution_chain")>]
    EvolutionChain : EvolutionChainSummary;
    [<JsonProperty(PropertyName = "habitat")>]
    Habitat : PokemonHabitatSummary;
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : PokemonFormDetailFormNamesInner[];
    [<JsonProperty(PropertyName = "pal_park_encounters")>]
    PalParkEncounters : PokemonSpeciesDetailPalParkEncountersInner[];
    [<JsonProperty(PropertyName = "form_descriptions")>]
    FormDescriptions : PokemonSpeciesDescription[];
    [<JsonProperty(PropertyName = "flavor_text_entries")>]
    FlavorTextEntries : PokemonSpeciesFlavorText[];
    [<JsonProperty(PropertyName = "genera")>]
    Genera : PokemonSpeciesDetailGeneraInner[];
    [<JsonProperty(PropertyName = "varieties")>]
    Varieties : PokemonSpeciesDetailVarietiesInner[];
  }

  //#endregion
