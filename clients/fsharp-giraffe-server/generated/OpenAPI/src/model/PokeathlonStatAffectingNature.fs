namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.NatureSummary

module PokeathlonStatAffectingNature =

  //#region PokeathlonStatAffectingNature


  type PokeathlonStatAffectingNature = {
    MaxChange : int;
    Nature : NatureSummary;
  }
  //#endregion
