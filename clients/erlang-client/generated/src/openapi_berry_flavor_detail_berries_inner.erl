-module(openapi_berry_flavor_detail_berries_inner).

-export([encode/1]).

-export_type([openapi_berry_flavor_detail_berries_inner/0]).

-type openapi_berry_flavor_detail_berries_inner() ::
    #{ 'potency' := integer(),
       'berry' := openapi_berry_flavor_detail_berries_inner_berry:openapi_berry_flavor_detail_berries_inner_berry()
     }.

encode(#{ 'potency' := Potency,
          'berry' := Berry
        }) ->
    #{ 'potency' => Potency,
       'berry' => Berry
     }.
