<a name="__pageTop"></a>
# ContestsApi   { #ContestsApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contest_effect_list**](#contest_effect_list) | **GET** `/api/v2/contest-effect/` | List contest effects
[**contest_effect_retrieve**](#contest_effect_retrieve) | **GET** `/api/v2/contest-effect/{id}/` | Get contest effect
[**contest_type_list**](#contest_type_list) | **GET** `/api/v2/contest-type/` | List contest types
[**contest_type_retrieve**](#contest_type_retrieve) | **GET** `/api/v2/contest-type/{id}/` | Get contest type
[**super_contest_effect_list**](#super_contest_effect_list) | **GET** `/api/v2/super-contest-effect/` | List super contest effects
[**super_contest_effect_retrieve**](#super_contest_effect_retrieve) | **GET** `/api/v2/super-contest-effect/{id}/` | Get super contest effect

# **contest_effect_list**   { #contest_effect_list }
<a name="contest_effect_list"></a>

> `contest_effect_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ContestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ContestsApi.new(config, client)


# Invoke an endpoint
api.contest_effect_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "contest_effect_list", response)
		assert(response.data is PaginatedContestEffectSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **contest_effect_retrieve**   { #contest_effect_retrieve }
<a name="contest_effect_retrieve"></a>

> `contest_effect_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ContestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ContestsApi.new(config, client)


# Invoke an endpoint
api.contest_effect_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "contest_effect_retrieve", response)
		assert(response.data is ContestEffectDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **contest_type_list**   { #contest_type_list }
<a name="contest_type_list"></a>

> `contest_type_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ContestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ContestsApi.new(config, client)


# Invoke an endpoint
api.contest_type_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "contest_type_list", response)
		assert(response.data is PaginatedContestTypeSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **contest_type_retrieve**   { #contest_type_retrieve }
<a name="contest_type_retrieve"></a>

> `contest_type_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ContestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ContestsApi.new(config, client)


# Invoke an endpoint
api.contest_type_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "contest_type_retrieve", response)
		assert(response.data is ContestTypeDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **super_contest_effect_list**   { #super_contest_effect_list }
<a name="super_contest_effect_list"></a>

> `super_contest_effect_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ContestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ContestsApi.new(config, client)


# Invoke an endpoint
api.super_contest_effect_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "super_contest_effect_list", response)
		assert(response.data is PaginatedSuperContestEffectSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **super_contest_effect_retrieve**   { #super_contest_effect_retrieve }
<a name="super_contest_effect_retrieve"></a>

> `super_contest_effect_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = ContestsApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = ContestsApi.new(config, client)


# Invoke an endpoint
api.super_contest_effect_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "super_contest_effect_retrieve", response)
		assert(response.data is SuperContestEffectDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[basicAuth](../README.md#basicAuth), 
[cookieAuth](../README.md#cookieAuth)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

