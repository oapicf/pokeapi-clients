namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFlavorSummary
open OpenAPI.Model.ContestTypeName

module ContestTypeDetail =

  //#region ContestTypeDetail


  type ContestTypeDetail = {
    Id : int;
    Name : string;
    BerryFlavor : BerryFlavorSummary;
    Names : ContestTypeName[];
  }
  //#endregion
