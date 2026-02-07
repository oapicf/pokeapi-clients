namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ContestEffectSummary =

  //#region ContestEffectSummary

  [<CLIMutable>]
  type ContestEffectSummary = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
