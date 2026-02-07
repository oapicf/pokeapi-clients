namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.LocationSummary
open OpenAPI.Model.PokedexSummary
open OpenAPI.Model.RegionName

module RegionDetail =

  //#region RegionDetail

  [<CLIMutable>]
  type RegionDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "locations")>]
    Locations : LocationSummary[];
    [<JsonProperty(PropertyName = "main_generation")>]
    MainGeneration : GenerationSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : RegionName[];
    [<JsonProperty(PropertyName = "pokedexes")>]
    Pokedexes : PokedexSummary[];
    [<JsonProperty(PropertyName = "version_groups")>]
    VersionGroups : AbilityDetailPokemonInnerPokemon[];
  }

  //#endregion
