namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PokedexDescription
open OpenAPI.Model.PokedexName
open OpenAPI.Model.PokemonDexNumber
open OpenAPI.Model.RegionSummary
open OpenAPI.Model.VersionGroupSummary

module PokedexDetail =

  //#region PokedexDetail

  [<CLIMutable>]
  type PokedexDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "is_main_series")>]
    IsMainSeries : bool;
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : PokedexDescription[];
    [<JsonProperty(PropertyName = "names")>]
    Names : PokedexName[];
    [<JsonProperty(PropertyName = "pokemon_entries")>]
    PokemonEntries : PokemonDexNumber[];
    [<JsonProperty(PropertyName = "region")>]
    Region : RegionSummary;
    [<JsonProperty(PropertyName = "version_groups")>]
    VersionGroups : VersionGroupSummary[];
  }

  //#endregion
