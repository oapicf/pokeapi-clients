-module(openapi_evolution_trigger_detail).

-include("openapi.hrl").

-export([openapi_evolution_trigger_detail/0]).

-export([openapi_evolution_trigger_detail/1]).

-export_type([openapi_evolution_trigger_detail/0]).

-type openapi_evolution_trigger_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'names', list(openapi_evolution_trigger_name:openapi_evolution_trigger_name()) }
  | {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
  ].


openapi_evolution_trigger_detail() ->
    openapi_evolution_trigger_detail([]).

openapi_evolution_trigger_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'names', list(openapi_evolution_trigger_name:openapi_evolution_trigger_name()) }
            , {'pokemon_species', list(openapi_pokemon_species_summary:openapi_pokemon_species_summary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

