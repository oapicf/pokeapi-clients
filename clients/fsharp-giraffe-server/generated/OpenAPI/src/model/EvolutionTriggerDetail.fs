namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionTriggerName
open OpenAPI.Model.PokemonSpeciesSummary

module EvolutionTriggerDetail =

  //#region EvolutionTriggerDetail


  type EvolutionTriggerDetail = {
    Id : int;
    Name : string;
    Names : EvolutionTriggerName[];
    PokemonSpecies : PokemonSpeciesSummary[];
  }
  //#endregion
