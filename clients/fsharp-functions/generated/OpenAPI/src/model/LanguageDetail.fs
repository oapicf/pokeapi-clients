namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.LanguageName

module LanguageDetail =

  //#region LanguageDetail

  [<CLIMutable>]
  type LanguageDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "official")>]
    Official : bool;
    [<JsonProperty(PropertyName = "iso639")>]
    Iso639 : string;
    [<JsonProperty(PropertyName = "iso3166")>]
    Iso3166 : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : LanguageName[];
  }

  //#endregion
