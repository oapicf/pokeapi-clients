-module(openapi_berry_detail_flavors_inner).

-export([encode/1]).

-export_type([openapi_berry_detail_flavors_inner/0]).

-type openapi_berry_detail_flavors_inner() ::
    #{ 'potency' := integer(),
       'flavor' := openapi_berry_detail_flavors_inner_flavor:openapi_berry_detail_flavors_inner_flavor()
     }.

encode(#{ 'potency' := Potency,
          'flavor' := Flavor
        }) ->
    #{ 'potency' => Potency,
       'flavor' => Flavor
     }.
