namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterConditionName
open OpenAPI.Model.EncounterConditionValueSummary

module EncounterConditionDetail =

  //#region EncounterConditionDetail


  type EncounterConditionDetail = {
    Id : int;
    Name : string;
    Values : EncounterConditionValueSummary[];
    Names : EncounterConditionName[];
  }
  //#endregion
