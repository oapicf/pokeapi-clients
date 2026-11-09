namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TypeSummary

module PokemonType =

  //#region PokemonType


  type PokemonType = {
    Slot : int;
    Type : TypeSummary;
  }
  //#endregion
