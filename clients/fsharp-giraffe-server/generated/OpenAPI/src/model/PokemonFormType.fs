namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TypeSummary

module PokemonFormType =

  //#region PokemonFormType


  type PokemonFormType = {
    Slot : int;
    Type : TypeSummary;
  }
  //#endregion
