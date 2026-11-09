namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokemonSummary

module AbilityPokemonDetail =

  //#region AbilityPokemonDetail


  type AbilityPokemonDetail = {
    IsHidden : bool;
    Slot : int;
    Pokemon : PokemonSummary;
  }
  //#endregion
