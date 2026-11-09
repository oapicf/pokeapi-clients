namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BerryFlavorSummary

module BerryFlavorMap =

  //#region BerryFlavorMap


  type BerryFlavorMap = {
    Potency : int;
    Flavor : BerryFlavorSummary;
  }
  //#endregion
