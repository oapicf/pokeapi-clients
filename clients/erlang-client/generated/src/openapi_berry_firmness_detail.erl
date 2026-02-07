-module(openapi_berry_firmness_detail).

-export([encode/1]).

-export_type([openapi_berry_firmness_detail/0]).

-type openapi_berry_firmness_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'berries' := list(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'berries' := Berries,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'berries' => Berries,
       'names' => Names
     }.
