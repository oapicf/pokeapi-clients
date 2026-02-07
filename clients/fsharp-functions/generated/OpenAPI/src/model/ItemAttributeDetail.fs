namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.ItemAttributeDescription
open OpenAPI.Model.ItemAttributeName

module ItemAttributeDetail =

  //#region ItemAttributeDetail

  [<CLIMutable>]
  type ItemAttributeDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "descriptions")>]
    Descriptions : ItemAttributeDescription[];
    [<JsonProperty(PropertyName = "items")>]
    Items : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "names")>]
    Names : ItemAttributeName[];
  }

  //#endregion
