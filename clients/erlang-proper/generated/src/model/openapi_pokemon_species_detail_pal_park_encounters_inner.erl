-module(openapi_pokemon_species_detail_pal_park_encounters_inner).

-include("openapi.hrl").

-export([openapi_pokemon_species_detail_pal_park_encounters_inner/0]).

-export([openapi_pokemon_species_detail_pal_park_encounters_inner/1]).

-export_type([openapi_pokemon_species_detail_pal_park_encounters_inner/0]).

-type openapi_pokemon_species_detail_pal_park_encounters_inner() ::
  [ {'area', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'base_score', integer() }
  | {'rate', integer() }
  ].


openapi_pokemon_species_detail_pal_park_encounters_inner() ->
    openapi_pokemon_species_detail_pal_park_encounters_inner([]).

openapi_pokemon_species_detail_pal_park_encounters_inner(Fields) ->
  Default = [ {'area', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'base_score', integer() }
            , {'rate', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

