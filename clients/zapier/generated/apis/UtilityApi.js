const samples = require('../samples/UtilityApi');
const LanguageDetail = require('../models/LanguageDetail');
const PaginatedLanguageSummaryList = require('../models/PaginatedLanguageSummaryList');
const PokeapiMetaResponse = require('../models/PokeapiMetaResponse');
const utils = require('../utils/utils');

module.exports = {
    languageList: {
        key: 'languageList',
        noun: 'utility',
        display: {
            label: 'List languages',
            description: 'Languages for translations of API resource information.',
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
                ...PaginatedLanguageSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/language/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'languageList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedLanguageSummaryListSample']
        }
    },
    languageRetrieve: {
        key: 'languageRetrieve',
        noun: 'utility',
        display: {
            label: 'Get language',
            description: 'Languages for translations of API resource information.',
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
                ...LanguageDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/language/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'languageRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['LanguageDetailSample']
        }
    },
    metaRetrieve: {
        key: 'metaRetrieve',
        noun: 'utility',
        display: {
            label: 'Get API metadata',
            description: 'Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...PokeapiMetaResponse.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/meta/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'metaRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['PokeapiMetaResponseSample']
        }
    },
}
