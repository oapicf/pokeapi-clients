namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokeathlonStatAffectingNatures
open OpenAPI.Model.PokeathlonStatName

module PokeathlonStatDetail =

  //#region PokeathlonStatDetail


  type PokeathlonStatDetail = {
    Id : int;
    Name : string;
    AffectingNatures : PokeathlonStatAffectingNatures;
    Names : PokeathlonStatName[];
  }
  //#endregion
