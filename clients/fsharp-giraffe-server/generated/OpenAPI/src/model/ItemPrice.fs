namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CurrencySummary
open OpenAPI.Model.VersionGroupSummary
open OpenAPI.Model.int option

module ItemPrice =

  //#region ItemPrice


  type ItemPrice = {
    PurchasePrice : int option;
    SellPrice : int option;
    Currency : CurrencySummary;
    VersionGroup : VersionGroupSummary;
  }
  //#endregion
