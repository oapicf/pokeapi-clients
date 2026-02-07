namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon

module StatDetailAffectingNatures =

  //#region StatDetailAffectingNatures

  [<CLIMutable>]
  type StatDetailAffectingNatures = {
    [<JsonProperty(PropertyName = "increase")>]
    Increase : AbilityDetailPokemonInnerPokemon[];
    [<JsonProperty(PropertyName = "decrease")>]
    Decrease : AbilityDetailPokemonInnerPokemon[];
  }

  //#endregion
