const samples = require('../samples/EncountersApi');
const EncounterConditionDetail = require('../models/EncounterConditionDetail');
const EncounterConditionValueDetail = require('../models/EncounterConditionValueDetail');
const EncounterMethodDetail = require('../models/EncounterMethodDetail');
const PaginatedEncounterConditionSummaryList = require('../models/PaginatedEncounterConditionSummaryList');
const PaginatedEncounterConditionValueSummaryList = require('../models/PaginatedEncounterConditionValueSummaryList');
const PaginatedEncounterMethodSummaryList = require('../models/PaginatedEncounterMethodSummaryList');
const pokemon_encounters_retrieve_200_response_inner = require('../models/pokemon_encounters_retrieve_200_response_inner');
const utils = require('../utils/utils');

module.exports = {
    encounterConditionList: {
        key: 'encounterConditionList',
        noun: 'encounters',
        display: {
            label: 'List encounter conditions',
            description: 'Conditions which affect what pokemon might appear in the wild, e.g., day or night.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'limit',
                    label: 'Number of results to return per page.',
                    type: 'integer',
                },
                {
                    key: 'offset',
                    label: 'The initial index from which to return the results.',
                    type: 'integer',
                },
                {
                    key: 'q',
                    label: '&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...PaginatedEncounterConditionSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/encounter-condition/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'offset': bundle.inputData?.['offset'],
                        'q': bundle.inputData?.['q'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'encounterConditionList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedEncounterConditionSummaryListSample']
        }
    },
    encounterConditionRetrieve: {
        key: 'encounterConditionRetrieve',
        noun: 'encounters',
        display: {
            label: 'Get encounter condition',
            description: 'Conditions which affect what pokemon might appear in the wild, e.g., day or night.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'id',
                    label: 'This parameter can be a string or an integer.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...EncounterConditionDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/encounter-condition/{id}/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'encounterConditionRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['EncounterConditionDetailSample']
        }
    },
    encounterConditionValueList: {
        key: 'encounterConditionValueList',
        noun: 'encounters',
        display: {
            label: 'List encounter condition values',
            description: 'Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'limit',
                    label: 'Number of results to return per page.',
                    type: 'integer',
                },
                {
                    key: 'offset',
                    label: 'The initial index from which to return the results.',
                    type: 'integer',
                },
                {
                    key: 'q',
                    label: '&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...PaginatedEncounterConditionValueSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/encounter-condition-value/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'offset': bundle.inputData?.['offset'],
                        'q': bundle.inputData?.['q'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'encounterConditionValueList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedEncounterConditionValueSummaryListSample']
        }
    },
    encounterConditionValueRetrieve: {
        key: 'encounterConditionValueRetrieve',
        noun: 'encounters',
        display: {
            label: 'Get encounter condition value',
            description: 'Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'id',
                    label: 'This parameter can be a string or an integer.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...EncounterConditionValueDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/encounter-condition-value/{id}/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'encounterConditionValueRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['EncounterConditionValueDetailSample']
        }
    },
    encounterMethodList: {
        key: 'encounterMethodList',
        noun: 'encounters',
        display: {
            label: 'List encounter methods',
            description: 'Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'limit',
                    label: 'Number of results to return per page.',
                    type: 'integer',
                },
                {
                    key: 'offset',
                    label: 'The initial index from which to return the results.',
                    type: 'integer',
                },
                {
                    key: 'q',
                    label: '&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ',
                    type: 'string',
                },
            ],
            outputFields: [
                ...PaginatedEncounterMethodSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/encounter-method/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'offset': bundle.inputData?.['offset'],
                        'q': bundle.inputData?.['q'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'encounterMethodList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedEncounterMethodSummaryListSample']
        }
    },
    encounterMethodRetrieve: {
        key: 'encounterMethodRetrieve',
        noun: 'encounters',
        display: {
            label: 'Get encounter method',
            description: 'Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'id',
                    label: 'This parameter can be a string or an integer.',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...EncounterMethodDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/encounter-method/{id}/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'encounterMethodRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['EncounterMethodDetailSample']
        }
    },
    pokemonEncountersRetrieve: {
        key: 'pokemonEncountersRetrieve',
        noun: 'encounters',
        display: {
            label: 'Get pokemon encounter',
            description: 'Handles Pokemon Encounters as a sub-resource.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'pokemon_id',
                    label: '',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/pokemon/{pokemon_id}/encounters'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'pokemonEncountersRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['pokemon_encounters_retrieve_200_response_innerSample']
        }
    },
}
