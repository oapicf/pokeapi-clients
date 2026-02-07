-module(openapi_machines_api).

-export([machine_list/1, machine_list/2,
         machine_retrieve/2, machine_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List machines
%% Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
-spec machine_list(ctx:ctx()) -> {ok, openapi_paginated_machine_summary_list:openapi_paginated_machine_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
machine_list(Ctx) ->
    machine_list(Ctx, #{}).

-spec machine_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_machine_summary_list:openapi_paginated_machine_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
machine_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/machine/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get machine
%% Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
-spec machine_retrieve(ctx:ctx(), binary()) -> {ok, openapi_machine_detail:openapi_machine_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
machine_retrieve(Ctx, Id) ->
    machine_retrieve(Ctx, Id, #{}).

-spec machine_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_machine_detail:openapi_machine_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
machine_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/machine/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


