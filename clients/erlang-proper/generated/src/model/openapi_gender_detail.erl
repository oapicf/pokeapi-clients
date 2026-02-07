-module(openapi_gender_detail).

-include("openapi.hrl").

-export([openapi_gender_detail/0]).

-export([openapi_gender_detail/1]).

-export_type([openapi_gender_detail/0]).

-type openapi_gender_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'pokemon_species_details', list(openapi_gender_detail_pokemon_species_details_inner:openapi_gender_detail_pokemon_species_details_inner()) }
  | {'required_for_evolution', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  ].


openapi_gender_detail() ->
    openapi_gender_detail([]).

openapi_gender_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'pokemon_species_details', list(openapi_gender_detail_pokemon_species_details_inner:openapi_gender_detail_pokemon_species_details_inner()) }
            , {'required_for_evolution', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

