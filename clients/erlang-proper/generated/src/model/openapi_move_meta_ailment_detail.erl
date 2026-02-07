-module(openapi_move_meta_ailment_detail).

-include("openapi.hrl").

-export([openapi_move_meta_ailment_detail/0]).

-export([openapi_move_meta_ailment_detail/1]).

-export_type([openapi_move_meta_ailment_detail/0]).

-type openapi_move_meta_ailment_detail() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'moves', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
  | {'names', list(openapi_move_meta_ailment_name:openapi_move_meta_ailment_name()) }
  ].


openapi_move_meta_ailment_detail() ->
    openapi_move_meta_ailment_detail([]).

openapi_move_meta_ailment_detail(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'moves', list(openapi_ability_detail_pokemon_inner_pokemon:openapi_ability_detail_pokemon_inner_pokemon()) }
            , {'names', list(openapi_move_meta_ailment_name:openapi_move_meta_ailment_name()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

