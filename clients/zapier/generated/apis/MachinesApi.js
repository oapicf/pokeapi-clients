const samples = require('../samples/MachinesApi');
const MachineDetail = require('../models/MachineDetail');
const PaginatedMachineSummaryList = require('../models/PaginatedMachineSummaryList');
const utils = require('../utils/utils');

module.exports = {
    machineList: {
        key: 'machineList',
        noun: 'machines',
        display: {
            label: 'List machines',
            description: 'Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.',
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
                ...PaginatedMachineSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/machine/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'machineList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedMachineSummaryListSample']
        }
    },
    machineRetrieve: {
        key: 'machineRetrieve',
        noun: 'machines',
        display: {
            label: 'Get machine',
            description: 'Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.',
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
                ...MachineDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/machine/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'machineRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['MachineDetailSample']
        }
    },
}
