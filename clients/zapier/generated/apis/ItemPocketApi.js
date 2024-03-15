const samples = require('../samples/ItemPocketApi');
const utils = require('../utils/utils');

module.exports = {
    itemPocketList: {
        key: 'itemPocketList',
        noun: 'item-pocket',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'limit',
                    label: '',
                    type: 'integer',
                },
                {
                    key: 'offset',
                    label: '',
                    type: 'integer',
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-pocket/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'text/plain',
                    },
                    params: {
                        'limit': bundle.inputData?.['limit'],
                        'offset': bundle.inputData?.['offset'],
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
    itemPocketRead: {
        key: 'itemPocketRead',
        noun: 'item-pocket',
        display: {
            label: '',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'id',
                    label: '',
                    type: 'integer',
                    required: true,
                },
            ],
            outputFields: [
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-pocket/{id}/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'text/plain',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}
