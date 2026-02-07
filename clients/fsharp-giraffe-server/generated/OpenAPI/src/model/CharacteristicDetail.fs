namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CharacteristicDescription
open OpenAPI.Model.StatSummary

module CharacteristicDetail =

  //#region CharacteristicDetail


  type CharacteristicDetail = {
    Id : int;
    GeneModulo : int;
    PossibleValues : int[];
    HighestStat : StatSummary;
    Descriptions : CharacteristicDescription[];
  }
  //#endregion
