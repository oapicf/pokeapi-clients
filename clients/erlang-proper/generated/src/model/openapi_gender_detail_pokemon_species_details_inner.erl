-module(openapi_gender_detail_pokemon_species_details_inner).

-include("openapi.hrl").

-export([openapi_gender_detail_pokemon_species_details_inner/0]).

-export([openapi_gender_detail_pokemon_species_details_inner/1]).

-export_type([openapi_gender_detail_pokemon_species_details_inner/0]).

-type openapi_gender_detail_pokemon_species_details_inner() ::
  [ {'rate', integer() }
  | {'pokemon_species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_gender_detail_pokemon_species_details_inner() ->
    openapi_gender_detail_pokemon_species_details_inner([]).

openapi_gender_detail_pokemon_species_details_inner(Fields) ->
  Default = [ {'rate', integer() }
            , {'pokemon_species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

