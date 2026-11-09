-module(openapi_pokemon_dex_number).

-include("openapi.hrl").

-export([openapi_pokemon_dex_number/0]).

-export([openapi_pokemon_dex_number/1]).

-export_type([openapi_pokemon_dex_number/0]).

-type openapi_pokemon_dex_number() ::
  [ {'entry_number', integer() }
  | {'pokemon_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
  ].


openapi_pokemon_dex_number() ->
    openapi_pokemon_dex_number([]).

openapi_pokemon_dex_number(Fields) ->
  Default = [ {'entry_number', integer() }
            , {'pokemon_species', openapi_pokemon_species_summary:openapi_pokemon_species_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

