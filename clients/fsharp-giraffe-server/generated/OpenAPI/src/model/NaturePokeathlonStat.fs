namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokeathlonStatSummary

module NaturePokeathlonStat =

  //#region NaturePokeathlonStat


  type NaturePokeathlonStat = {
    MaxChange : int;
    PokeathlonStat : PokeathlonStatSummary;
  }
  //#endregion
