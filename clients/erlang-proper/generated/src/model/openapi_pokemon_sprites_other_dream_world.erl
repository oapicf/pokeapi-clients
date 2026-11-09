-module(openapi_pokemon_sprites_other_dream_world).

-include("openapi.hrl").

-export([openapi_pokemon_sprites_other_dream_world/0]).

-export([openapi_pokemon_sprites_other_dream_world/1]).

-export_type([openapi_pokemon_sprites_other_dream_world/0]).

-type openapi_pokemon_sprites_other_dream_world() ::
  [ {'front_default', binary() }
  | {'front_female', binary() }
  ].


openapi_pokemon_sprites_other_dream_world() ->
    openapi_pokemon_sprites_other_dream_world([]).

openapi_pokemon_sprites_other_dream_world(Fields) ->
  Default = [ {'front_default', binary() }
            , {'front_female', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

