namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilitySummary

module PokemonAbilityPast =

  //#region PokemonAbilityPast


  type PokemonAbilityPast = {
    IsHidden : bool;
    Slot : int;
    Ability : AbilitySummary;
  }
  //#endregion
