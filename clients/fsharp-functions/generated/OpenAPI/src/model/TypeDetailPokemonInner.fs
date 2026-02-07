namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TypeDetailPokemonInnerPokemon

module TypeDetailPokemonInner =

  //#region TypeDetailPokemonInner

  [<CLIMutable>]
  type TypeDetailPokemonInner = {
    [<JsonProperty(PropertyName = "slot")>]
    Slot : int;
    [<JsonProperty(PropertyName = "pokemon")>]
    Pokemon : TypeDetailPokemonInnerPokemon;
  }

  //#endregion
