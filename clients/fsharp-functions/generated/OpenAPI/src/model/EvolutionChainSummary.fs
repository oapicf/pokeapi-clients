namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module EvolutionChainSummary =

  //#region EvolutionChainSummary

  [<CLIMutable>]
  type EvolutionChainSummary = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
