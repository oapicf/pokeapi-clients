namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemAttributeDescription
open OpenAPI.Model.ItemAttributeName
open OpenAPI.Model.ItemSummary

module ItemAttributeDetail =

  //#region ItemAttributeDetail


  type ItemAttributeDetail = {
    Id : int;
    Name : string;
    Descriptions : ItemAttributeDescription[];
    Items : ItemSummary[];
    Names : ItemAttributeName[];
  }
  //#endregion
