const samples = require('../samples/LocationApi');
const LocationAreaDetail = require('../models/LocationAreaDetail');
const LocationDetail = require('../models/LocationDetail');
const PaginatedLocationAreaSummaryList = require('../models/PaginatedLocationAreaSummaryList');
const PaginatedLocationSummaryList = require('../models/PaginatedLocationSummaryList');
const PaginatedPalParkAreaSummaryList = require('../models/PaginatedPalParkAreaSummaryList');
const PaginatedRegionSummaryList = require('../models/PaginatedRegionSummaryList');
const PalParkAreaDetail = require('../models/PalParkAreaDetail');
const RegionDetail = require('../models/RegionDetail');
const utils = require('../utils/utils');

module.exports = {
    locationAreaList: {
        key: 'locationAreaList',
        noun: 'location',
        display: {
            label: 'List location areas',
            description: 'Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.',
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
            ],
            outputFields: [
                ...PaginatedLocationAreaSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/location-area/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'offset': bundle.inputData?.['offset'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'locationAreaList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedLocationAreaSummaryListSample']
        }
    },
    locationAreaRetrieve: {
        key: 'locationAreaRetrieve',
        noun: 'location',
        display: {
            label: 'Get location area',
            description: 'Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'id',
                    label: 'A unique integer value identifying this location area.',
                    type: 'integer',
                    required: true,
                },
            ],
            outputFields: [
                ...LocationAreaDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/location-area/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'locationAreaRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['LocationAreaDetailSample']
        }
    },
    locationList: {
        key: 'locationList',
        noun: 'location',
        display: {
            label: 'List locations',
            description: 'Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.',
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
                ...PaginatedLocationSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/location/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'locationList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedLocationSummaryListSample']
        }
    },
    locationRetrieve: {
        key: 'locationRetrieve',
        noun: 'location',
        display: {
            label: 'Get location',
            description: 'Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.',
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
                ...LocationDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/location/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'locationRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['LocationDetailSample']
        }
    },
    palParkAreaList: {
        key: 'palParkAreaList',
        noun: 'location',
        display: {
            label: 'List pal park areas',
            description: 'Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.',
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
                ...PaginatedPalParkAreaSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/pal-park-area/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'palParkAreaList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedPalParkAreaSummaryListSample']
        }
    },
    palParkAreaRetrieve: {
        key: 'palParkAreaRetrieve',
        noun: 'location',
        display: {
            label: 'Get pal park area',
            description: 'Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.',
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
                ...PalParkAreaDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/pal-park-area/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'palParkAreaRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['PalParkAreaDetailSample']
        }
    },
    regionList: {
        key: 'regionList',
        noun: 'location',
        display: {
            label: 'List regions',
            description: 'A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.',
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
                ...PaginatedRegionSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/region/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'regionList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedRegionSummaryListSample']
        }
    },
    regionRetrieve: {
        key: 'regionRetrieve',
        noun: 'location',
        display: {
            label: 'Get region',
            description: 'A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.',
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
                ...RegionDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/region/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'regionRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['RegionDetailSample']
        }
    },
}
