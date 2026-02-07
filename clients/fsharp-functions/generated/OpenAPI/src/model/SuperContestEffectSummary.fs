namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SuperContestEffectSummary =

  //#region SuperContestEffectSummary

  [<CLIMutable>]
  type SuperContestEffectSummary = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
