namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EvolutionTriggerSummary =

  //#region EvolutionTriggerSummary

  [<CLIMutable>]
  type EvolutionTriggerSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
