namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CurrencyName

module CurrencyDetail =

  //#region CurrencyDetail

  [<CLIMutable>]
  type CurrencyDetail = {
    [<JsonProperty(PropertyName = "id")>]
    Id : int;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "names")>]
    Names : CurrencyName[];
  }

  //#endregion
