namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EvolutionVariableSummary =

  //#region EvolutionVariableSummary

  [<CLIMutable>]
  type EvolutionVariableSummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
