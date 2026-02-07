-module(openapi_pokemon_dex_entry).

-include("openapi.hrl").

-export([openapi_pokemon_dex_entry/0]).

-export([openapi_pokemon_dex_entry/1]).

-export_type([openapi_pokemon_dex_entry/0]).

-type openapi_pokemon_dex_entry() ::
  [ {'entry_number', integer() }
  | {'pokedex', openapi_pokedex_summary:openapi_pokedex_summary() }
  ].


openapi_pokemon_dex_entry() ->
    openapi_pokemon_dex_entry([]).

openapi_pokemon_dex_entry(Fields) ->
  Default = [ {'entry_number', integer() }
            , {'pokedex', openapi_pokedex_summary:openapi_pokedex_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

