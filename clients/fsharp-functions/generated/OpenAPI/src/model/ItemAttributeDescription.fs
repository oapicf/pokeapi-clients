namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module ItemAttributeDescription =

  //#region ItemAttributeDescription

  [<CLIMutable>]
  type ItemAttributeDescription = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
