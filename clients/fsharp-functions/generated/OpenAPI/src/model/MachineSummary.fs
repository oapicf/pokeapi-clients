namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MachineSummary =

  //#region MachineSummary

  [<CLIMutable>]
  type MachineSummary = {
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
