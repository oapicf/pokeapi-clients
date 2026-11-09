namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.int option

module EncounterPokemonDetail =

  //#region EncounterPokemonDetail


  type EncounterPokemonDetail = {
    MinPerfectIvs : int option;
    AlwaysShiny : bool;
    NeverShiny : bool;
    IsAlpha : bool;
  }
  //#endregion
