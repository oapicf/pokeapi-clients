-module(openapi_pokemon_form_detail).

-include("openapi.hrl").

-export([openapi_pokemon_form_detail/0]).

-export([openapi_pokemon_form_detail/1]).

-export_type([openapi_pokemon_form_detail/0]).

-type openapi_pokemon_form_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'order', integer() }
  | {'form_order', integer() }
  | {'is_default', boolean() }
  | {'is_battle_only', boolean() }
  | {'is_mega', boolean() }
  | {'form_name', binary() }
  | {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
  | {'sprites', openapi_pokemon_form_detail_sprites:openapi_pokemon_form_detail_sprites() }
  | {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
  | {'form_names', list(openapi_pokemon_form_detail_form_names_inner:openapi_pokemon_form_detail_form_names_inner()) }
  | {'names', list(openapi_pokemon_form_detail_form_names_inner:openapi_pokemon_form_detail_form_names_inner()) }
  | {'types', list(openapi_pokemon_detail_types_inner:openapi_pokemon_detail_types_inner()) }
  ].


openapi_pokemon_form_detail() ->
    openapi_pokemon_form_detail([]).

openapi_pokemon_form_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'order', integer() }
            , {'form_order', integer() }
            , {'is_default', boolean() }
            , {'is_battle_only', boolean() }
            , {'is_mega', boolean() }
            , {'form_name', binary() }
            , {'pokemon', openapi_pokemon_summary:openapi_pokemon_summary() }
            , {'sprites', openapi_pokemon_form_detail_sprites:openapi_pokemon_form_detail_sprites() }
            , {'version_group', openapi_version_group_summary:openapi_version_group_summary() }
            , {'form_names', list(openapi_pokemon_form_detail_form_names_inner:openapi_pokemon_form_detail_form_names_inner()) }
            , {'names', list(openapi_pokemon_form_detail_form_names_inner:openapi_pokemon_form_detail_form_names_inner()) }
            , {'types', list(openapi_pokemon_detail_types_inner:openapi_pokemon_detail_types_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

