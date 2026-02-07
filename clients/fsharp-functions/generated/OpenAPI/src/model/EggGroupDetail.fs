namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EggGroupDetailPokemonSpeciesInner
open OpenAPI.Model.EggGroupName

module EggGroupDetail =

  //#region EggGroupDetail

  [<CLIMutable>]
  type EggGroupDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : EggGroupName[];
    [<JsonProperty(PropertyName = "pokemon_species")>]
    PokemonSpecies : EggGroupDetailPokemonSpeciesInner[];
  }

  //#endregion
