namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilitySummary
open OpenAPI.Model.GenerationName
open OpenAPI.Model.MoveSummary
open OpenAPI.Model.PokemonSpeciesSummary
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.TypeSummary
open OpenAPI.Model.VersionGroupSummary

module GenerationDetail =

  //#region GenerationDetail

  [<CLIMutable>]
  type GenerationDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "abilities")>]
    Abilities : AbilitySummary[];
    [<JsonProperty(PropertyName = "main_region")>]
    MainRegion : RegionSummary;
    [<JsonProperty(PropertyName = "moves")>]
    Moves : MoveSummary[];
    [<JsonProperty(PropertyName = "names")>]
    Names : GenerationName[];
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary[];
    [<JsonProperty(PropertyName = "types")>]
    Types : TypeSummary[];
    [<JsonProperty(PropertyName = "version_groups")>]
    VersionGroups : VersionGroupSummary[];
  }

  //#endregion
