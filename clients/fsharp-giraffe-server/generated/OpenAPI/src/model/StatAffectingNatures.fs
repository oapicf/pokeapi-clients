namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NatureSummary

module StatAffectingNatures =

  //#region StatAffectingNatures


  type StatAffectingNatures = {
    Increase : NatureSummary[];
    Decrease : NatureSummary[];
  }
  //#endregion
