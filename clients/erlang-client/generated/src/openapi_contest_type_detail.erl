-module(openapi_contest_type_detail).

-export([encode/1]).

-export_type([openapi_contest_type_detail/0]).

-type openapi_contest_type_detail() ::
    #{ 'id' := integer(),
       'name' := binary(),
       'berry_flavor' := openapi_berry_flavor_summary:openapi_berry_flavor_summary(),
       'names' := list()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'berry_flavor' := BerryFlavor,
          'names' := Names
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'berry_flavor' => BerryFlavor,
       'names' => Names
     }.
