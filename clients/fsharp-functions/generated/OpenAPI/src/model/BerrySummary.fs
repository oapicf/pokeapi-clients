namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BerrySummary =

  //#region BerrySummary

  [<CLIMutable>]
  type BerrySummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
