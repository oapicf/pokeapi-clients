namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EncounterConditionName
open OpenAPI.Model.EncounterConditionValueSummary

module EncounterConditionDetail =

  //#region EncounterConditionDetail

  [<CLIMutable>]
  type EncounterConditionDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "values")>]
    Values : EncounterConditionValueSummary[];
    [<JsonProperty(PropertyName = "names")>]
    Names : EncounterConditionName[];
  }

  //#endregion
