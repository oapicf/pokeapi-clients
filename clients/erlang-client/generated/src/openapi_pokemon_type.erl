-module(openapi_pokemon_type).

-export([encode/1]).

-export_type([openapi_pokemon_type/0]).

-type openapi_pokemon_type() ::
    #{ 'slot' := integer(),
       'type' := openapi_type_summary:openapi_type_summary()
     }.

encode(#{ 'slot' := Slot,
          'type' := Type
        }) ->
    #{ 'slot' => Slot,
       'type' => Type
     }.
