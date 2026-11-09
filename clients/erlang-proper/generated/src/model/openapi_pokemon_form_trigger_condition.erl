-module(openapi_pokemon_form_trigger_condition).

-include("openapi.hrl").

-export([openapi_pokemon_form_trigger_condition/0]).

-export([openapi_pokemon_form_trigger_condition/1]).

-export_type([openapi_pokemon_form_trigger_condition/0]).

-type openapi_pokemon_form_trigger_condition() ::
  [ {'trigger', binary() }
  | {'name', binary() }
  | {'url', openapi_u_ri:openapi_u_ri() }
  | {'base_form', openapi_pokemon_form_summary:openapi_pokemon_form_summary() }
  ].


openapi_pokemon_form_trigger_condition() ->
    openapi_pokemon_form_trigger_condition([]).

openapi_pokemon_form_trigger_condition(Fields) ->
  Default = [ {'trigger', binary() }
            , {'name', binary() }
            , {'url', binary() }
            , {'base_form', openapi_pokemon_form_summary:openapi_pokemon_form_summary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

