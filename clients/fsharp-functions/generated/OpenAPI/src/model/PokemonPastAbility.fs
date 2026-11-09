namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.PokemonAbilityPast

module PokemonPastAbility =

  //#region PokemonPastAbility

  [<CLIMutable>]
  type PokemonPastAbility = {
    [<JsonProperty(PropertyName = "abilities")>]
    Abilities : PokemonAbilityPast[];
    [<JsonProperty(PropertyName = "generation")>]
    Generation : GenerationSummary;
  }

  //#endregion
