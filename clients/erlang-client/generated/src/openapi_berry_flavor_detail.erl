-module(openapi_berry_flavor_detail).

-export([encode/1]).

-export_type([openapi_berry_flavor_detail/0]).

-type openapi_berry_flavor_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'berries' := list(),
       'contest_type' := openapi_contest_type_summary:openapi_contest_type_summary(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'berries' := Berries,
          'contest_type' := ContestType,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'berries' => Berries,
       'contest_type' => ContestType,
       'names' => Names
     }.
