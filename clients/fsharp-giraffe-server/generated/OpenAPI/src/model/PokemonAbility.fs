namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilitySummary

module PokemonAbility =

  //#region PokemonAbility


  type PokemonAbility = {
    IsHidden : bool;
    Slot : int;
    Ability : AbilitySummary;
  }
  //#endregion
