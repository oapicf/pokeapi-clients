-module(openapi_move_detail_machines_inner_machine).

-export([encode/1]).

-export_type([openapi_move_detail_machines_inner_machine/0]).

-type openapi_move_detail_machines_inner_machine() ::
    #{ 'url' := openapi_u_ri:openapi_u_ri()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
