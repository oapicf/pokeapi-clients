const samples = require('../samples/ItemsApi');
const ItemAttributeDetail = require('../models/ItemAttributeDetail');
const ItemCategoryDetail = require('../models/ItemCategoryDetail');
const ItemDetail = require('../models/ItemDetail');
const ItemFlingEffectDetail = require('../models/ItemFlingEffectDetail');
const ItemPocketDetail = require('../models/ItemPocketDetail');
const PaginatedItemAttributeSummaryList = require('../models/PaginatedItemAttributeSummaryList');
const PaginatedItemCategorySummaryList = require('../models/PaginatedItemCategorySummaryList');
const PaginatedItemFlingEffectSummaryList = require('../models/PaginatedItemFlingEffectSummaryList');
const PaginatedItemPocketSummaryList = require('../models/PaginatedItemPocketSummaryList');
const PaginatedItemSummaryList = require('../models/PaginatedItemSummaryList');
const utils = require('../utils/utils');

module.exports = {
    itemAttributeList: {
        key: 'itemAttributeList',
        noun: 'items',
        display: {
            label: 'List item attributes',
            description: 'Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.',
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
                ...PaginatedItemAttributeSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-attribute/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemAttributeList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedItemAttributeSummaryListSample']
        }
    },
    itemAttributeRetrieve: {
        key: 'itemAttributeRetrieve',
        noun: 'items',
        display: {
            label: 'Get item attribute',
            description: 'Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.',
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
                ...ItemAttributeDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-attribute/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemAttributeRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['ItemAttributeDetailSample']
        }
    },
    itemCategoryList: {
        key: 'itemCategoryList',
        noun: 'items',
        display: {
            label: 'List item categories',
            description: 'Item categories determine where items will be placed in the players bag.',
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
                ...PaginatedItemCategorySummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-category/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemCategoryList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedItemCategorySummaryListSample']
        }
    },
    itemCategoryRetrieve: {
        key: 'itemCategoryRetrieve',
        noun: 'items',
        display: {
            label: 'Get item category',
            description: 'Item categories determine where items will be placed in the players bag.',
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
                ...ItemCategoryDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-category/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemCategoryRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['ItemCategoryDetailSample']
        }
    },
    itemFlingEffectList: {
        key: 'itemFlingEffectList',
        noun: 'items',
        display: {
            label: 'List item fling effects',
            description: 'The various effects of the move\&quot;Fling\&quot; when used with different items.',
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
                ...PaginatedItemFlingEffectSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-fling-effect/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemFlingEffectList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedItemFlingEffectSummaryListSample']
        }
    },
    itemFlingEffectRetrieve: {
        key: 'itemFlingEffectRetrieve',
        noun: 'items',
        display: {
            label: 'Get item fling effect',
            description: 'The various effects of the move\&quot;Fling\&quot; when used with different items.',
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
                ...ItemFlingEffectDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-fling-effect/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemFlingEffectRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['ItemFlingEffectDetailSample']
        }
    },
    itemList: {
        key: 'itemList',
        noun: 'items',
        display: {
            label: 'List items',
            description: 'An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.',
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
                ...PaginatedItemSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedItemSummaryListSample']
        }
    },
    itemPocketList: {
        key: 'itemPocketList',
        noun: 'items',
        display: {
            label: 'List item pockets',
            description: 'Pockets within the players bag used for storing items by category.',
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
                ...PaginatedItemPocketSummaryList.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-pocket/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemPocketList', response.json);
                    return results;
                })
            },
            sample: samples['PaginatedItemPocketSummaryListSample']
        }
    },
    itemPocketRetrieve: {
        key: 'itemPocketRetrieve',
        noun: 'items',
        display: {
            label: 'Get item pocket',
            description: 'Pockets within the players bag used for storing items by category.',
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
                ...ItemPocketDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item-pocket/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemPocketRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['ItemPocketDetailSample']
        }
    },
    itemRetrieve: {
        key: 'itemRetrieve',
        noun: 'items',
        display: {
            label: 'Get item',
            description: 'An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.',
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
                ...ItemDetail.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://pokeapi.co/api/v2/item/{id}/'),
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
                    const results = utils.responseOptionsMiddleware(z, bundle, 'itemRetrieve', response.json);
                    return results;
                })
            },
            sample: samples['ItemDetailSample']
        }
    },
}
