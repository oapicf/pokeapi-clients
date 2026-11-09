namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CurrencySummary =

  //#region CurrencySummary

  [<CLIMutable>]
  type CurrencySummary = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
