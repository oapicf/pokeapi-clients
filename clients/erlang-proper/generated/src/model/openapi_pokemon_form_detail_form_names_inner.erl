-module(openapi_pokemon_form_detail_form_names_inner).

-include("openapi.hrl").

-export([openapi_pokemon_form_detail_form_names_inner/0]).

-export([openapi_pokemon_form_detail_form_names_inner/1]).

-export_type([openapi_pokemon_form_detail_form_names_inner/0]).

-type openapi_pokemon_form_detail_form_names_inner() ::
  [ {'language', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
  | {'name', binary() }
  ].


openapi_pokemon_form_detail_form_names_inner() ->
    openapi_pokemon_form_detail_form_names_inner([]).

openapi_pokemon_form_detail_form_names_inner(Fields) ->
  Default = [ {'language', openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

