namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EncounterConditionSummary
open OpenAPI.Model.EncounterConditionValueName

module EncounterConditionValueDetail =

  //#region EncounterConditionValueDetail


  type EncounterConditionValueDetail = {
    Id : int;
    Name : string;
    Condition : EncounterConditionSummary;
    Names : EncounterConditionValueName[];
  }
  //#endregion
