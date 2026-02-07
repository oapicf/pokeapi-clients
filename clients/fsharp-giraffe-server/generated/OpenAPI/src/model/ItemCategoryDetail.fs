namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemCategoryName
open OpenAPI.Model.ItemPocketSummary
open OpenAPI.Model.ItemSummary

module ItemCategoryDetail =

  //#region ItemCategoryDetail


  type ItemCategoryDetail = {
    Id : int;
    Name : string;
    Items : ItemSummary[];
    Names : ItemCategoryName[];
    Pocket : ItemPocketSummary;
  }
  //#endregion
