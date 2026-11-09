namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CurrencySummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module ItemPrice =

  //#region ItemPrice

  [<CLIMutable>]
  type ItemPrice = {
    [<JsonProperty(PropertyName = "purchase_price")>]
    PurchasePrice : int option;
    [<JsonProperty(PropertyName = "sell_price")>]
    SellPrice : int option;
    [<JsonProperty(PropertyName = "currency")>]
    Currency : CurrencySummary;
    [<JsonProperty(PropertyName = "version_group")>]
    VersionGroup : VersionGroupSummary;
  }

  //#endregion
