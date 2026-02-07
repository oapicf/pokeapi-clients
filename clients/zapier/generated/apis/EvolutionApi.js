const samples = require('../samples/EvolutionApi');
const EvolutionChainDetail = require('../models/EvolutionChainDetail');
const EvolutionTriggerDetail = require('../models/EvolutionTriggerDetail');
const PaginatedEvolutionChainSummaryList = require('../models/PaginatedEvolutionChainSummaryList');
const PaginatedEvolutionTriggerSummaryList = require('../models/PaginatedEvolutionTriggerSummaryList');
const utils = require('../utils/utils');

module.exports = {
    evolutionChainList: {
        key: 'evolutionChainList',
        noun: 'evolution',
        display: {
            label: 'List evolution chains',
            description: 'Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.',
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
                ...PaginatedEvolutionChainSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/evolution-chain/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'evolutionChainList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedEvolutionChainSummaryListSample']
        }
    },
    evolutionChainRetrieve: {
        key: 'evolutionChainRetrieve',
        noun: 'evolution',
        display: {
            label: 'Get evolution chain',
            description: 'Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.',
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
                ...EvolutionChainDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/evolution-chain/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'evolutionChainRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['EvolutionChainDetailSample']
        }
    },
    evolutionTriggerList: {
        key: 'evolutionTriggerList',
        noun: 'evolution',
        display: {
            label: 'List evolution triggers',
            description: 'Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.',
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
                ...PaginatedEvolutionTriggerSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/evolution-trigger/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'evolutionTriggerList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedEvolutionTriggerSummaryListSample']
        }
    },
    evolutionTriggerRetrieve: {
        key: 'evolutionTriggerRetrieve',
        noun: 'evolution',
        display: {
            label: 'Get evolution trigger',
            description: 'Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.',
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
                ...EvolutionTriggerDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/evolution-trigger/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'evolutionTriggerRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['EvolutionTriggerDetailSample']
        }
    },
}
