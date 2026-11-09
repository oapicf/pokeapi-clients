-module(openapi_berry_flavor_berry_map).

-export([encode/1]).

-export_type([openapi_berry_flavor_berry_map/0]).

-type openapi_berry_flavor_berry_map() ::
    #{ 'potency' := integer(),
       'berry' := openapi_berry_summary:openapi_berry_summary()
     }.

encode(#{ 'potency' := Potency,
          'berry' := Berry
        }) ->
    #{ 'potency' => Potency,
       'berry' => Berry
     }.
