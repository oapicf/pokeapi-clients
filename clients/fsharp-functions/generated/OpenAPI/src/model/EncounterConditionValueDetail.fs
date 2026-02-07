namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterConditionSummary
open OpenAPI.Model.EncounterConditionValueName

module EncounterConditionValueDetail =

  //#region EncounterConditionValueDetail

  [<CLIMutable>]
  type EncounterConditionValueDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "condition")>]
    Condition : EncounterConditionSummary;
    [<JsonProperty(PropertyName = "names")>]
    Names : EncounterConditionValueName[];
  }

  //#endregion
