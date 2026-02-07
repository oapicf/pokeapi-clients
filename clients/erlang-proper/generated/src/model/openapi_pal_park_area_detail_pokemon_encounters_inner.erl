-module(openapi_pal_park_area_detail_pokemon_encounters_inner).

-include("openapi.hrl").

-export([openapi_pal_park_area_detail_pokemon_encounters_inner/0]).

-export([openapi_pal_park_area_detail_pokemon_encounters_inner/1]).

-export_type([openapi_pal_park_area_detail_pokemon_encounters_inner/0]).

-type openapi_pal_park_area_detail_pokemon_encounters_inner() ::
  [ {'base_score', integer() }
  | {'pokemon_species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'rate', integer() }
  ].


openapi_pal_park_area_detail_pokemon_encounters_inner() ->
    openapi_pal_park_area_detail_pokemon_encounters_inner([]).

openapi_pal_park_area_detail_pokemon_encounters_inner(Fields) ->
  Default = [ {'base_score', integer() }
            , {'pokemon-species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'rate', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

