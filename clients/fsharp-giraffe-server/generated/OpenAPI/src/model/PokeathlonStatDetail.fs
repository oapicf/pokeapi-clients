namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PokeathlonStatDetailAffectingNatures
open OpenAPI.Model.PokeathlonStatName

module PokeathlonStatDetail =

  //#region PokeathlonStatDetail


  type PokeathlonStatDetail = {
    Id : int;
    Name : string;
    AffectingNatures : PokeathlonStatDetailAffectingNatures;
    Names : PokeathlonStatName[];
  }
  //#endregion
