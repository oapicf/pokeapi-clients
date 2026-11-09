-module(openapi_berry_flavor_map).

-export([encode/1]).

-export_type([openapi_berry_flavor_map/0]).

-type openapi_berry_flavor_map() ::
    #{ 'potency' := integer(),
       'flavor' := openapi_berry_flavor_summary:openapi_berry_flavor_summary()
     }.

encode(#{ 'potency' := Potency,
          'flavor' := Flavor
        }) ->
    #{ 'potency' => Potency,
       'flavor' => Flavor
     }.
