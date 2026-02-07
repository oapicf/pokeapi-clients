namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EncounterConditionValueSummary =

  //#region EncounterConditionValueSummary

  [<CLIMutable>]
  type EncounterConditionValueSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
