namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AbilityDetailPokemonInnerPokemon
open OpenAPI.Model.EvolutionTriggerName

module EvolutionTriggerDetail =

  //#region EvolutionTriggerDetail


  type EvolutionTriggerDetail = {
    Id : int;
    Name : string;
    Names : EvolutionTriggerName[];
    PokemonSpecies : AbilityDetailPokemonInnerPokemon[];
  }
  //#endregion
