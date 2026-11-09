namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFlavorBerryMap
open OpenAPI.Model.BerryFlavorName
open OpenAPI.Model.ContestTypeSummary

module BerryFlavorDetail =

  //#region BerryFlavorDetail


  type BerryFlavorDetail = {
    Id : int;
    Name : string;
    Berries : BerryFlavorBerryMap[];
    ContestType : ContestTypeSummary;
    Names : BerryFlavorName[];
  }
  //#endregion
