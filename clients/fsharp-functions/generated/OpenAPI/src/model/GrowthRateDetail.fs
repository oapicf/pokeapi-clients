namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Experience
open OpenAPI.Model.GrowthRateDescription
open OpenAPI.Model.PokemonSpeciesSummary

module GrowthRateDetail =

  //#region GrowthRateDetail

  [<CLIMutable>]
  type GrowthRateDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "formula")>]
    Formula : string;
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : GrowthRateDescription[];
    [<JsonProperty(PropertyName = "levels")>]
    Levels : Experience[];
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : PokemonSpeciesSummary[];
  }

  //#endregion
