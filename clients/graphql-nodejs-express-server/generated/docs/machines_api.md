# machines_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MachineList**](machines_api.md#MachineList) | **GET** /api/v2/machine/ | List machines
[**MachineRetrieve**](machines_api.md#MachineRetrieve) | **GET** /api/v2/machine/{id}/ | Get machine


<a name="MachineList"></a>
# **MachineList**
> PaginatedMachineSummaryList MachineList(limit, offset, q)

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
<a name="MachineRetrieve"></a>
# **MachineRetrieve**
> MachineDetail MachineRetrieve(Id_)

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
