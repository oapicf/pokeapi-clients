-module(openapi_contests_api).

-export([contest_effect_list/1, contest_effect_list/2,
         contest_effect_retrieve/2, contest_effect_retrieve/3,
         contest_type_list/1, contest_type_list/2,
         contest_type_retrieve/2, contest_type_retrieve/3,
         super_contest_effect_list/1, super_contest_effect_list/2,
         super_contest_effect_retrieve/2, super_contest_effect_retrieve/3]).

-define(BASE_URL, <<"">>).

%% @doc List contest effects
%% Contest effects refer to the effects of moves when used in contests.
-spec contest_effect_list(ctx:ctx()) -> {ok, openapi_paginated_contest_effect_summary_list:openapi_paginated_contest_effect_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
contest_effect_list(Ctx) ->
    contest_effect_list(Ctx, #{}).

-spec contest_effect_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_contest_effect_summary_list:openapi_paginated_contest_effect_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
contest_effect_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/contest-effect/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get contest effect
%% Contest effects refer to the effects of moves when used in contests.
-spec contest_effect_retrieve(ctx:ctx(), binary()) -> {ok, openapi_contest_effect_detail:openapi_contest_effect_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
contest_effect_retrieve(Ctx, Id) ->
    contest_effect_retrieve(Ctx, Id, #{}).

-spec contest_effect_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_contest_effect_detail:openapi_contest_effect_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
contest_effect_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/contest-effect/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List contest types
%% Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
-spec contest_type_list(ctx:ctx()) -> {ok, openapi_paginated_contest_type_summary_list:openapi_paginated_contest_type_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
contest_type_list(Ctx) ->
    contest_type_list(Ctx, #{}).

-spec contest_type_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_contest_type_summary_list:openapi_paginated_contest_type_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
contest_type_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/contest-type/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get contest type
%% Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
-spec contest_type_retrieve(ctx:ctx(), binary()) -> {ok, openapi_contest_type_detail:openapi_contest_type_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
contest_type_retrieve(Ctx, Id) ->
    contest_type_retrieve(Ctx, Id, #{}).

-spec contest_type_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_contest_type_detail:openapi_contest_type_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
contest_type_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/contest-type/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc List super contest effects
%% Super contest effects refer to the effects of moves when used in super contests.
-spec super_contest_effect_list(ctx:ctx()) -> {ok, openapi_paginated_super_contest_effect_summary_list:openapi_paginated_super_contest_effect_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
super_contest_effect_list(Ctx) ->
    super_contest_effect_list(Ctx, #{}).

-spec super_contest_effect_list(ctx:ctx(), maps:map()) -> {ok, openapi_paginated_super_contest_effect_summary_list:openapi_paginated_super_contest_effect_summary_list(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
super_contest_effect_list(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/super-contest-effect/"],
    QS = lists:flatten([])++openapi_utils:optional_params(['limit', 'offset', 'q'], _OptionalParams),
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).

%% @doc Get super contest effect
%% Super contest effects refer to the effects of moves when used in super contests.
-spec super_contest_effect_retrieve(ctx:ctx(), binary()) -> {ok, openapi_super_contest_effect_detail:openapi_super_contest_effect_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
super_contest_effect_retrieve(Ctx, Id) ->
    super_contest_effect_retrieve(Ctx, Id, #{}).

-spec super_contest_effect_retrieve(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_super_contest_effect_detail:openapi_super_contest_effect_detail(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
super_contest_effect_retrieve(Ctx, Id, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/api/v2/super-contest-effect/", Id, "/"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


