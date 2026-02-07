namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageSummary

module MoveDamageClassName =

  //#region MoveDamageClassName

  [<CLIMutable>]
  type MoveDamageClassName = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "language")>]
    Language : LanguageSummary;
  }

  //#endregion
