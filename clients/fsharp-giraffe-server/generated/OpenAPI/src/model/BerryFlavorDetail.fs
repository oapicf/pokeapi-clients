namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFlavorDetailBerriesInner
open OpenAPI.Model.BerryFlavorName
open OpenAPI.Model.ContestTypeSummary

module BerryFlavorDetail =

  //#region BerryFlavorDetail


  type BerryFlavorDetail = {
    Id : int;
    Name : string;
    Berries : BerryFlavorDetailBerriesInner[];
    ContestType : ContestTypeSummary;
    Names : BerryFlavorName[];
  }
  //#endregion
