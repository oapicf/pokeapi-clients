namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemCategorySummary
open OpenAPI.Model.ItemPocketName

module ItemPocketDetail =

  //#region ItemPocketDetail


  type ItemPocketDetail = {
    Id : int;
    Name : string;
    Categories : ItemCategorySummary[];
    Names : ItemPocketName[];
  }
  //#endregion
