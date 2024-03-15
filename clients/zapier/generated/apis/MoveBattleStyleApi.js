const samples = require('../samples/MoveBattleStyleApi');
const utils = require('../utils/utils');

module.exports = {
    moveBattleStyleList: {
        key: 'moveBattleStyleList',
        noun: 'move-battle-style',
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
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/move-battle-style/'),
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
    moveBattleStyleRead: {
        key: 'moveBattleStyleRead',
        noun: 'move-battle-style',
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
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/move-battle-style/{id}/'),
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
