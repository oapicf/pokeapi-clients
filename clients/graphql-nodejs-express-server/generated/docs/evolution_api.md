# evolution_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EvolutionChainList**](evolution_api.md#EvolutionChainList) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**EvolutionChainRetrieve**](evolution_api.md#EvolutionChainRetrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**EvolutionTriggerList**](evolution_api.md#EvolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**EvolutionTriggerRetrieve**](evolution_api.md#EvolutionTriggerRetrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
[**EvolutionVariableList**](evolution_api.md#EvolutionVariableList) | **GET** /api/v2/evolution-variable/ | List evolution variables
[**EvolutionVariableRetrieve**](evolution_api.md#EvolutionVariableRetrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable


<a name="EvolutionChainList"></a>
# **EvolutionChainList**
> PaginatedEvolutionChainSummaryList EvolutionChainList(limit, offset)

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
<a name="EvolutionChainRetrieve"></a>
# **EvolutionChainRetrieve**
> EvolutionChainDetail EvolutionChainRetrieve(Id_)

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
<a name="EvolutionTriggerList"></a>
# **EvolutionTriggerList**
> PaginatedEvolutionTriggerSummaryList EvolutionTriggerList(limit, offset, q)

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
<a name="EvolutionTriggerRetrieve"></a>
# **EvolutionTriggerRetrieve**
> EvolutionTriggerDetail EvolutionTriggerRetrieve(Id_)

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
<a name="EvolutionVariableList"></a>
# **EvolutionVariableList**
> PaginatedEvolutionVariableSummaryList EvolutionVariableList(limit, offset, q)

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.
<a name="EvolutionVariableRetrieve"></a>
# **EvolutionVariableRetrieve**
> EvolutionVariableDetail EvolutionVariableRetrieve(Id_)

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.
