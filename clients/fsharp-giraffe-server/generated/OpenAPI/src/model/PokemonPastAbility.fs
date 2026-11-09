namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GenerationSummary
open OpenAPI.Model.PokemonAbilityPast

module PokemonPastAbility =

  //#region PokemonPastAbility


  type PokemonPastAbility = {
    Abilities : PokemonAbilityPast[];
    Generation : GenerationSummary;
  }
  //#endregion
