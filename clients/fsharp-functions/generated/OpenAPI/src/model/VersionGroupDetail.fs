namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.VersionSummary
open OpenAPI.Model.int option

module VersionGroupDetail =

  //#region VersionGroupDetail

  [<CLIMutable>]
  type VersionGroupDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "order")>]
    Order : int option;
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
    [<JsonProperty(PropertyName = "move_learn_methods")>]
    MoveLearnMethods : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "pokedexes")>]
    Pokedexes : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "regions")>]
    Regions : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "versions")>]
    Versions : VersionSummary[];
  }

  //#endregion
