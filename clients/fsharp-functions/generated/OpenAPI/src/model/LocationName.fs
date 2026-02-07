namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module LocationName =

  //#region LocationName

  [<CLIMutable>]
  type LocationName = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
