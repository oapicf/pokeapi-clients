namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CurrencyName

module CurrencyDetail =

  //#region CurrencyDetail


  type CurrencyDetail = {
    Id : int;
    Name : string;
    Names : CurrencyName[];
  }
  //#endregion
