-module(openapi_pokemon_species_detail_varieties_inner).

-include("openapi.hrl").

-export([openapi_pokemon_species_detail_varieties_inner/0]).

-export([openapi_pokemon_species_detail_varieties_inner/1]).

-export_type([openapi_pokemon_species_detail_varieties_inner/0]).

-type openapi_pokemon_species_detail_varieties_inner() ::
  [ {'is_default', boolean() }
  | {'pokemon', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_pokemon_species_detail_varieties_inner() ->
    openapi_pokemon_species_detail_varieties_inner([]).

openapi_pokemon_species_detail_varieties_inner(Fields) ->
  Default = [ {'is_default', boolean() }
            , {'pokemon', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

