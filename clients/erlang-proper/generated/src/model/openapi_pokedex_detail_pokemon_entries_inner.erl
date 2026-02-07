-module(openapi_pokedex_detail_pokemon_entries_inner).

-include("openapi.hrl").

-export([openapi_pokedex_detail_pokemon_entries_inner/0]).

-export([openapi_pokedex_detail_pokemon_entries_inner/1]).

-export_type([openapi_pokedex_detail_pokemon_entries_inner/0]).

-type openapi_pokedex_detail_pokemon_entries_inner() ::
  [ {'entry_number', integer() }
  | {'pokemon_species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  ].


openapi_pokedex_detail_pokemon_entries_inner() ->
    openapi_pokedex_detail_pokemon_entries_inner([]).

openapi_pokedex_detail_pokemon_entries_inner(Fields) ->
  Default = [ {'entry_number', integer() }
            , {'pokemon_species', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

