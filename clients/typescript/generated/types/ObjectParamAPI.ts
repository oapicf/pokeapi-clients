import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';


import { ObservableAbilityApi } from "./ObservableAPI";
import { AbilityApiRequestFactory, AbilityApiResponseProcessor} from "../apis/AbilityApi";

export interface AbilityApiAbilityListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof AbilityApiabilityList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof AbilityApiabilityList
     */
    offset?: number
}

export interface AbilityApiAbilityReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof AbilityApiabilityRead
     */
    id: number
}

export class ObjectAbilityApi {
    private api: ObservableAbilityApi

    public constructor(configuration: Configuration, requestFactory?: AbilityApiRequestFactory, responseProcessor?: AbilityApiResponseProcessor) {
        this.api = new ObservableAbilityApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public abilityListWithHttpInfo(param: AbilityApiAbilityListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.abilityListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public abilityList(param: AbilityApiAbilityListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.abilityList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public abilityReadWithHttpInfo(param: AbilityApiAbilityReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.abilityReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public abilityRead(param: AbilityApiAbilityReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.abilityRead(param.id,  options).toPromise();
    }

}

import { ObservableBerryApi } from "./ObservableAPI";
import { BerryApiRequestFactory, BerryApiResponseProcessor} from "../apis/BerryApi";

export interface BerryApiBerryListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryApiberryList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryApiberryList
     */
    offset?: number
}

export interface BerryApiBerryReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryApiberryRead
     */
    id: number
}

export class ObjectBerryApi {
    private api: ObservableBerryApi

    public constructor(configuration: Configuration, requestFactory?: BerryApiRequestFactory, responseProcessor?: BerryApiResponseProcessor) {
        this.api = new ObservableBerryApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public berryListWithHttpInfo(param: BerryApiBerryListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.berryListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryList(param: BerryApiBerryListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.berryList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryReadWithHttpInfo(param: BerryApiBerryReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.berryReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryRead(param: BerryApiBerryReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.berryRead(param.id,  options).toPromise();
    }

}

import { ObservableBerryFirmnessApi } from "./ObservableAPI";
import { BerryFirmnessApiRequestFactory, BerryFirmnessApiResponseProcessor} from "../apis/BerryFirmnessApi";

export interface BerryFirmnessApiBerryFirmnessListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryFirmnessApiberryFirmnessList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryFirmnessApiberryFirmnessList
     */
    offset?: number
}

export interface BerryFirmnessApiBerryFirmnessReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryFirmnessApiberryFirmnessRead
     */
    id: number
}

export class ObjectBerryFirmnessApi {
    private api: ObservableBerryFirmnessApi

    public constructor(configuration: Configuration, requestFactory?: BerryFirmnessApiRequestFactory, responseProcessor?: BerryFirmnessApiResponseProcessor) {
        this.api = new ObservableBerryFirmnessApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public berryFirmnessListWithHttpInfo(param: BerryFirmnessApiBerryFirmnessListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.berryFirmnessListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryFirmnessList(param: BerryFirmnessApiBerryFirmnessListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.berryFirmnessList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryFirmnessReadWithHttpInfo(param: BerryFirmnessApiBerryFirmnessReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.berryFirmnessReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryFirmnessRead(param: BerryFirmnessApiBerryFirmnessReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.berryFirmnessRead(param.id,  options).toPromise();
    }

}

import { ObservableBerryFlavorApi } from "./ObservableAPI";
import { BerryFlavorApiRequestFactory, BerryFlavorApiResponseProcessor} from "../apis/BerryFlavorApi";

export interface BerryFlavorApiBerryFlavorListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryFlavorApiberryFlavorList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryFlavorApiberryFlavorList
     */
    offset?: number
}

export interface BerryFlavorApiBerryFlavorReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof BerryFlavorApiberryFlavorRead
     */
    id: number
}

export class ObjectBerryFlavorApi {
    private api: ObservableBerryFlavorApi

    public constructor(configuration: Configuration, requestFactory?: BerryFlavorApiRequestFactory, responseProcessor?: BerryFlavorApiResponseProcessor) {
        this.api = new ObservableBerryFlavorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public berryFlavorListWithHttpInfo(param: BerryFlavorApiBerryFlavorListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.berryFlavorListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryFlavorList(param: BerryFlavorApiBerryFlavorListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.berryFlavorList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryFlavorReadWithHttpInfo(param: BerryFlavorApiBerryFlavorReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.berryFlavorReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public berryFlavorRead(param: BerryFlavorApiBerryFlavorReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.berryFlavorRead(param.id,  options).toPromise();
    }

}

import { ObservableCharacteristicApi } from "./ObservableAPI";
import { CharacteristicApiRequestFactory, CharacteristicApiResponseProcessor} from "../apis/CharacteristicApi";

export interface CharacteristicApiCharacteristicListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof CharacteristicApicharacteristicList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof CharacteristicApicharacteristicList
     */
    offset?: number
}

export interface CharacteristicApiCharacteristicReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof CharacteristicApicharacteristicRead
     */
    id: number
}

export class ObjectCharacteristicApi {
    private api: ObservableCharacteristicApi

    public constructor(configuration: Configuration, requestFactory?: CharacteristicApiRequestFactory, responseProcessor?: CharacteristicApiResponseProcessor) {
        this.api = new ObservableCharacteristicApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public characteristicListWithHttpInfo(param: CharacteristicApiCharacteristicListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.characteristicListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public characteristicList(param: CharacteristicApiCharacteristicListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.characteristicList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public characteristicReadWithHttpInfo(param: CharacteristicApiCharacteristicReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.characteristicReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public characteristicRead(param: CharacteristicApiCharacteristicReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.characteristicRead(param.id,  options).toPromise();
    }

}

import { ObservableContestEffectApi } from "./ObservableAPI";
import { ContestEffectApiRequestFactory, ContestEffectApiResponseProcessor} from "../apis/ContestEffectApi";

export interface ContestEffectApiContestEffectListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ContestEffectApicontestEffectList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ContestEffectApicontestEffectList
     */
    offset?: number
}

export interface ContestEffectApiContestEffectReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ContestEffectApicontestEffectRead
     */
    id: number
}

export class ObjectContestEffectApi {
    private api: ObservableContestEffectApi

    public constructor(configuration: Configuration, requestFactory?: ContestEffectApiRequestFactory, responseProcessor?: ContestEffectApiResponseProcessor) {
        this.api = new ObservableContestEffectApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public contestEffectListWithHttpInfo(param: ContestEffectApiContestEffectListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.contestEffectListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public contestEffectList(param: ContestEffectApiContestEffectListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.contestEffectList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public contestEffectReadWithHttpInfo(param: ContestEffectApiContestEffectReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.contestEffectReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public contestEffectRead(param: ContestEffectApiContestEffectReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.contestEffectRead(param.id,  options).toPromise();
    }

}

import { ObservableContestTypeApi } from "./ObservableAPI";
import { ContestTypeApiRequestFactory, ContestTypeApiResponseProcessor} from "../apis/ContestTypeApi";

export interface ContestTypeApiContestTypeListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ContestTypeApicontestTypeList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ContestTypeApicontestTypeList
     */
    offset?: number
}

export interface ContestTypeApiContestTypeReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ContestTypeApicontestTypeRead
     */
    id: number
}

export class ObjectContestTypeApi {
    private api: ObservableContestTypeApi

    public constructor(configuration: Configuration, requestFactory?: ContestTypeApiRequestFactory, responseProcessor?: ContestTypeApiResponseProcessor) {
        this.api = new ObservableContestTypeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public contestTypeListWithHttpInfo(param: ContestTypeApiContestTypeListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.contestTypeListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public contestTypeList(param: ContestTypeApiContestTypeListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.contestTypeList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public contestTypeReadWithHttpInfo(param: ContestTypeApiContestTypeReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.contestTypeReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public contestTypeRead(param: ContestTypeApiContestTypeReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.contestTypeRead(param.id,  options).toPromise();
    }

}

import { ObservableEggGroupApi } from "./ObservableAPI";
import { EggGroupApiRequestFactory, EggGroupApiResponseProcessor} from "../apis/EggGroupApi";

export interface EggGroupApiEggGroupListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EggGroupApieggGroupList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EggGroupApieggGroupList
     */
    offset?: number
}

export interface EggGroupApiEggGroupReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EggGroupApieggGroupRead
     */
    id: number
}

export class ObjectEggGroupApi {
    private api: ObservableEggGroupApi

    public constructor(configuration: Configuration, requestFactory?: EggGroupApiRequestFactory, responseProcessor?: EggGroupApiResponseProcessor) {
        this.api = new ObservableEggGroupApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public eggGroupListWithHttpInfo(param: EggGroupApiEggGroupListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.eggGroupListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public eggGroupList(param: EggGroupApiEggGroupListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.eggGroupList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public eggGroupReadWithHttpInfo(param: EggGroupApiEggGroupReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.eggGroupReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public eggGroupRead(param: EggGroupApiEggGroupReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.eggGroupRead(param.id,  options).toPromise();
    }

}

import { ObservableEncounterConditionApi } from "./ObservableAPI";
import { EncounterConditionApiRequestFactory, EncounterConditionApiResponseProcessor} from "../apis/EncounterConditionApi";

export interface EncounterConditionApiEncounterConditionListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterConditionApiencounterConditionList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterConditionApiencounterConditionList
     */
    offset?: number
}

export interface EncounterConditionApiEncounterConditionReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterConditionApiencounterConditionRead
     */
    id: number
}

export class ObjectEncounterConditionApi {
    private api: ObservableEncounterConditionApi

    public constructor(configuration: Configuration, requestFactory?: EncounterConditionApiRequestFactory, responseProcessor?: EncounterConditionApiResponseProcessor) {
        this.api = new ObservableEncounterConditionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public encounterConditionListWithHttpInfo(param: EncounterConditionApiEncounterConditionListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.encounterConditionListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterConditionList(param: EncounterConditionApiEncounterConditionListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.encounterConditionList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterConditionReadWithHttpInfo(param: EncounterConditionApiEncounterConditionReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.encounterConditionReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterConditionRead(param: EncounterConditionApiEncounterConditionReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.encounterConditionRead(param.id,  options).toPromise();
    }

}

import { ObservableEncounterConditionValueApi } from "./ObservableAPI";
import { EncounterConditionValueApiRequestFactory, EncounterConditionValueApiResponseProcessor} from "../apis/EncounterConditionValueApi";

export interface EncounterConditionValueApiEncounterConditionValueListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterConditionValueApiencounterConditionValueList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterConditionValueApiencounterConditionValueList
     */
    offset?: number
}

export interface EncounterConditionValueApiEncounterConditionValueReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterConditionValueApiencounterConditionValueRead
     */
    id: number
}

export class ObjectEncounterConditionValueApi {
    private api: ObservableEncounterConditionValueApi

    public constructor(configuration: Configuration, requestFactory?: EncounterConditionValueApiRequestFactory, responseProcessor?: EncounterConditionValueApiResponseProcessor) {
        this.api = new ObservableEncounterConditionValueApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public encounterConditionValueListWithHttpInfo(param: EncounterConditionValueApiEncounterConditionValueListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.encounterConditionValueListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterConditionValueList(param: EncounterConditionValueApiEncounterConditionValueListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.encounterConditionValueList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterConditionValueReadWithHttpInfo(param: EncounterConditionValueApiEncounterConditionValueReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.encounterConditionValueReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterConditionValueRead(param: EncounterConditionValueApiEncounterConditionValueReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.encounterConditionValueRead(param.id,  options).toPromise();
    }

}

import { ObservableEncounterMethodApi } from "./ObservableAPI";
import { EncounterMethodApiRequestFactory, EncounterMethodApiResponseProcessor} from "../apis/EncounterMethodApi";

export interface EncounterMethodApiEncounterMethodListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterMethodApiencounterMethodList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterMethodApiencounterMethodList
     */
    offset?: number
}

export interface EncounterMethodApiEncounterMethodReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EncounterMethodApiencounterMethodRead
     */
    id: number
}

export class ObjectEncounterMethodApi {
    private api: ObservableEncounterMethodApi

    public constructor(configuration: Configuration, requestFactory?: EncounterMethodApiRequestFactory, responseProcessor?: EncounterMethodApiResponseProcessor) {
        this.api = new ObservableEncounterMethodApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public encounterMethodListWithHttpInfo(param: EncounterMethodApiEncounterMethodListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.encounterMethodListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterMethodList(param: EncounterMethodApiEncounterMethodListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.encounterMethodList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterMethodReadWithHttpInfo(param: EncounterMethodApiEncounterMethodReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.encounterMethodReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public encounterMethodRead(param: EncounterMethodApiEncounterMethodReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.encounterMethodRead(param.id,  options).toPromise();
    }

}

import { ObservableEvolutionChainApi } from "./ObservableAPI";
import { EvolutionChainApiRequestFactory, EvolutionChainApiResponseProcessor} from "../apis/EvolutionChainApi";

export interface EvolutionChainApiEvolutionChainListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionChainApievolutionChainList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionChainApievolutionChainList
     */
    offset?: number
}

export interface EvolutionChainApiEvolutionChainReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionChainApievolutionChainRead
     */
    id: number
}

export class ObjectEvolutionChainApi {
    private api: ObservableEvolutionChainApi

    public constructor(configuration: Configuration, requestFactory?: EvolutionChainApiRequestFactory, responseProcessor?: EvolutionChainApiResponseProcessor) {
        this.api = new ObservableEvolutionChainApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public evolutionChainListWithHttpInfo(param: EvolutionChainApiEvolutionChainListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.evolutionChainListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public evolutionChainList(param: EvolutionChainApiEvolutionChainListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.evolutionChainList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public evolutionChainReadWithHttpInfo(param: EvolutionChainApiEvolutionChainReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.evolutionChainReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public evolutionChainRead(param: EvolutionChainApiEvolutionChainReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.evolutionChainRead(param.id,  options).toPromise();
    }

}

import { ObservableEvolutionTriggerApi } from "./ObservableAPI";
import { EvolutionTriggerApiRequestFactory, EvolutionTriggerApiResponseProcessor} from "../apis/EvolutionTriggerApi";

export interface EvolutionTriggerApiEvolutionTriggerListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionTriggerApievolutionTriggerList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionTriggerApievolutionTriggerList
     */
    offset?: number
}

export interface EvolutionTriggerApiEvolutionTriggerReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof EvolutionTriggerApievolutionTriggerRead
     */
    id: number
}

export class ObjectEvolutionTriggerApi {
    private api: ObservableEvolutionTriggerApi

    public constructor(configuration: Configuration, requestFactory?: EvolutionTriggerApiRequestFactory, responseProcessor?: EvolutionTriggerApiResponseProcessor) {
        this.api = new ObservableEvolutionTriggerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public evolutionTriggerListWithHttpInfo(param: EvolutionTriggerApiEvolutionTriggerListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.evolutionTriggerListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public evolutionTriggerList(param: EvolutionTriggerApiEvolutionTriggerListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.evolutionTriggerList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public evolutionTriggerReadWithHttpInfo(param: EvolutionTriggerApiEvolutionTriggerReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.evolutionTriggerReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public evolutionTriggerRead(param: EvolutionTriggerApiEvolutionTriggerReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.evolutionTriggerRead(param.id,  options).toPromise();
    }

}

import { ObservableGenderApi } from "./ObservableAPI";
import { GenderApiRequestFactory, GenderApiResponseProcessor} from "../apis/GenderApi";

export interface GenderApiGenderListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GenderApigenderList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GenderApigenderList
     */
    offset?: number
}

export interface GenderApiGenderReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GenderApigenderRead
     */
    id: number
}

export class ObjectGenderApi {
    private api: ObservableGenderApi

    public constructor(configuration: Configuration, requestFactory?: GenderApiRequestFactory, responseProcessor?: GenderApiResponseProcessor) {
        this.api = new ObservableGenderApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public genderListWithHttpInfo(param: GenderApiGenderListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.genderListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public genderList(param: GenderApiGenderListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.genderList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public genderReadWithHttpInfo(param: GenderApiGenderReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.genderReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public genderRead(param: GenderApiGenderReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.genderRead(param.id,  options).toPromise();
    }

}

import { ObservableGenerationApi } from "./ObservableAPI";
import { GenerationApiRequestFactory, GenerationApiResponseProcessor} from "../apis/GenerationApi";

export interface GenerationApiGenerationListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GenerationApigenerationList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GenerationApigenerationList
     */
    offset?: number
}

export interface GenerationApiGenerationReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GenerationApigenerationRead
     */
    id: number
}

export class ObjectGenerationApi {
    private api: ObservableGenerationApi

    public constructor(configuration: Configuration, requestFactory?: GenerationApiRequestFactory, responseProcessor?: GenerationApiResponseProcessor) {
        this.api = new ObservableGenerationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public generationListWithHttpInfo(param: GenerationApiGenerationListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.generationListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public generationList(param: GenerationApiGenerationListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.generationList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public generationReadWithHttpInfo(param: GenerationApiGenerationReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.generationReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public generationRead(param: GenerationApiGenerationReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.generationRead(param.id,  options).toPromise();
    }

}

import { ObservableGrowthRateApi } from "./ObservableAPI";
import { GrowthRateApiRequestFactory, GrowthRateApiResponseProcessor} from "../apis/GrowthRateApi";

export interface GrowthRateApiGrowthRateListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GrowthRateApigrowthRateList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GrowthRateApigrowthRateList
     */
    offset?: number
}

export interface GrowthRateApiGrowthRateReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof GrowthRateApigrowthRateRead
     */
    id: number
}

export class ObjectGrowthRateApi {
    private api: ObservableGrowthRateApi

    public constructor(configuration: Configuration, requestFactory?: GrowthRateApiRequestFactory, responseProcessor?: GrowthRateApiResponseProcessor) {
        this.api = new ObservableGrowthRateApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public growthRateListWithHttpInfo(param: GrowthRateApiGrowthRateListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.growthRateListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public growthRateList(param: GrowthRateApiGrowthRateListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.growthRateList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public growthRateReadWithHttpInfo(param: GrowthRateApiGrowthRateReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.growthRateReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public growthRateRead(param: GrowthRateApiGrowthRateReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.growthRateRead(param.id,  options).toPromise();
    }

}

import { ObservableItemApi } from "./ObservableAPI";
import { ItemApiRequestFactory, ItemApiResponseProcessor} from "../apis/ItemApi";

export interface ItemApiItemListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemApiitemList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemApiitemList
     */
    offset?: number
}

export interface ItemApiItemReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemApiitemRead
     */
    id: number
}

export class ObjectItemApi {
    private api: ObservableItemApi

    public constructor(configuration: Configuration, requestFactory?: ItemApiRequestFactory, responseProcessor?: ItemApiResponseProcessor) {
        this.api = new ObservableItemApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public itemListWithHttpInfo(param: ItemApiItemListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemList(param: ItemApiItemListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemReadWithHttpInfo(param: ItemApiItemReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemRead(param: ItemApiItemReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemRead(param.id,  options).toPromise();
    }

}

import { ObservableItemAttributeApi } from "./ObservableAPI";
import { ItemAttributeApiRequestFactory, ItemAttributeApiResponseProcessor} from "../apis/ItemAttributeApi";

export interface ItemAttributeApiItemAttributeListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemAttributeApiitemAttributeList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemAttributeApiitemAttributeList
     */
    offset?: number
}

export interface ItemAttributeApiItemAttributeReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemAttributeApiitemAttributeRead
     */
    id: number
}

export class ObjectItemAttributeApi {
    private api: ObservableItemAttributeApi

    public constructor(configuration: Configuration, requestFactory?: ItemAttributeApiRequestFactory, responseProcessor?: ItemAttributeApiResponseProcessor) {
        this.api = new ObservableItemAttributeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public itemAttributeListWithHttpInfo(param: ItemAttributeApiItemAttributeListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemAttributeListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemAttributeList(param: ItemAttributeApiItemAttributeListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemAttributeList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemAttributeReadWithHttpInfo(param: ItemAttributeApiItemAttributeReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemAttributeReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemAttributeRead(param: ItemAttributeApiItemAttributeReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemAttributeRead(param.id,  options).toPromise();
    }

}

import { ObservableItemCategoryApi } from "./ObservableAPI";
import { ItemCategoryApiRequestFactory, ItemCategoryApiResponseProcessor} from "../apis/ItemCategoryApi";

export interface ItemCategoryApiItemCategoryListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemCategoryApiitemCategoryList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemCategoryApiitemCategoryList
     */
    offset?: number
}

export interface ItemCategoryApiItemCategoryReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemCategoryApiitemCategoryRead
     */
    id: number
}

export class ObjectItemCategoryApi {
    private api: ObservableItemCategoryApi

    public constructor(configuration: Configuration, requestFactory?: ItemCategoryApiRequestFactory, responseProcessor?: ItemCategoryApiResponseProcessor) {
        this.api = new ObservableItemCategoryApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public itemCategoryListWithHttpInfo(param: ItemCategoryApiItemCategoryListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemCategoryListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemCategoryList(param: ItemCategoryApiItemCategoryListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemCategoryList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemCategoryReadWithHttpInfo(param: ItemCategoryApiItemCategoryReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemCategoryReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemCategoryRead(param: ItemCategoryApiItemCategoryReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemCategoryRead(param.id,  options).toPromise();
    }

}

import { ObservableItemFlingEffectApi } from "./ObservableAPI";
import { ItemFlingEffectApiRequestFactory, ItemFlingEffectApiResponseProcessor} from "../apis/ItemFlingEffectApi";

export interface ItemFlingEffectApiItemFlingEffectListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemFlingEffectApiitemFlingEffectList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemFlingEffectApiitemFlingEffectList
     */
    offset?: number
}

export interface ItemFlingEffectApiItemFlingEffectReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemFlingEffectApiitemFlingEffectRead
     */
    id: number
}

export class ObjectItemFlingEffectApi {
    private api: ObservableItemFlingEffectApi

    public constructor(configuration: Configuration, requestFactory?: ItemFlingEffectApiRequestFactory, responseProcessor?: ItemFlingEffectApiResponseProcessor) {
        this.api = new ObservableItemFlingEffectApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public itemFlingEffectListWithHttpInfo(param: ItemFlingEffectApiItemFlingEffectListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemFlingEffectListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemFlingEffectList(param: ItemFlingEffectApiItemFlingEffectListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemFlingEffectList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemFlingEffectReadWithHttpInfo(param: ItemFlingEffectApiItemFlingEffectReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemFlingEffectReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemFlingEffectRead(param: ItemFlingEffectApiItemFlingEffectReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemFlingEffectRead(param.id,  options).toPromise();
    }

}

import { ObservableItemPocketApi } from "./ObservableAPI";
import { ItemPocketApiRequestFactory, ItemPocketApiResponseProcessor} from "../apis/ItemPocketApi";

export interface ItemPocketApiItemPocketListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemPocketApiitemPocketList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemPocketApiitemPocketList
     */
    offset?: number
}

export interface ItemPocketApiItemPocketReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof ItemPocketApiitemPocketRead
     */
    id: number
}

export class ObjectItemPocketApi {
    private api: ObservableItemPocketApi

    public constructor(configuration: Configuration, requestFactory?: ItemPocketApiRequestFactory, responseProcessor?: ItemPocketApiResponseProcessor) {
        this.api = new ObservableItemPocketApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public itemPocketListWithHttpInfo(param: ItemPocketApiItemPocketListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemPocketListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemPocketList(param: ItemPocketApiItemPocketListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemPocketList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemPocketReadWithHttpInfo(param: ItemPocketApiItemPocketReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.itemPocketReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public itemPocketRead(param: ItemPocketApiItemPocketReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.itemPocketRead(param.id,  options).toPromise();
    }

}

import { ObservableLanguageApi } from "./ObservableAPI";
import { LanguageApiRequestFactory, LanguageApiResponseProcessor} from "../apis/LanguageApi";

export interface LanguageApiLanguageListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LanguageApilanguageList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LanguageApilanguageList
     */
    offset?: number
}

export interface LanguageApiLanguageReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LanguageApilanguageRead
     */
    id: number
}

export class ObjectLanguageApi {
    private api: ObservableLanguageApi

    public constructor(configuration: Configuration, requestFactory?: LanguageApiRequestFactory, responseProcessor?: LanguageApiResponseProcessor) {
        this.api = new ObservableLanguageApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public languageListWithHttpInfo(param: LanguageApiLanguageListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.languageListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public languageList(param: LanguageApiLanguageListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.languageList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public languageReadWithHttpInfo(param: LanguageApiLanguageReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.languageReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public languageRead(param: LanguageApiLanguageReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.languageRead(param.id,  options).toPromise();
    }

}

import { ObservableLocationApi } from "./ObservableAPI";
import { LocationApiRequestFactory, LocationApiResponseProcessor} from "../apis/LocationApi";

export interface LocationApiLocationListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LocationApilocationList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LocationApilocationList
     */
    offset?: number
}

export interface LocationApiLocationReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LocationApilocationRead
     */
    id: number
}

export class ObjectLocationApi {
    private api: ObservableLocationApi

    public constructor(configuration: Configuration, requestFactory?: LocationApiRequestFactory, responseProcessor?: LocationApiResponseProcessor) {
        this.api = new ObservableLocationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public locationListWithHttpInfo(param: LocationApiLocationListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.locationListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public locationList(param: LocationApiLocationListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.locationList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public locationReadWithHttpInfo(param: LocationApiLocationReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.locationReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public locationRead(param: LocationApiLocationReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.locationRead(param.id,  options).toPromise();
    }

}

import { ObservableLocationAreaApi } from "./ObservableAPI";
import { LocationAreaApiRequestFactory, LocationAreaApiResponseProcessor} from "../apis/LocationAreaApi";

export interface LocationAreaApiLocationAreaListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LocationAreaApilocationAreaList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LocationAreaApilocationAreaList
     */
    offset?: number
}

export interface LocationAreaApiLocationAreaReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof LocationAreaApilocationAreaRead
     */
    id: number
}

export class ObjectLocationAreaApi {
    private api: ObservableLocationAreaApi

    public constructor(configuration: Configuration, requestFactory?: LocationAreaApiRequestFactory, responseProcessor?: LocationAreaApiResponseProcessor) {
        this.api = new ObservableLocationAreaApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public locationAreaListWithHttpInfo(param: LocationAreaApiLocationAreaListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.locationAreaListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public locationAreaList(param: LocationAreaApiLocationAreaListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.locationAreaList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public locationAreaReadWithHttpInfo(param: LocationAreaApiLocationAreaReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.locationAreaReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public locationAreaRead(param: LocationAreaApiLocationAreaReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.locationAreaRead(param.id,  options).toPromise();
    }

}

import { ObservableMachineApi } from "./ObservableAPI";
import { MachineApiRequestFactory, MachineApiResponseProcessor} from "../apis/MachineApi";

export interface MachineApiMachineListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MachineApimachineList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MachineApimachineList
     */
    offset?: number
}

export interface MachineApiMachineReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MachineApimachineRead
     */
    id: number
}

export class ObjectMachineApi {
    private api: ObservableMachineApi

    public constructor(configuration: Configuration, requestFactory?: MachineApiRequestFactory, responseProcessor?: MachineApiResponseProcessor) {
        this.api = new ObservableMachineApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public machineListWithHttpInfo(param: MachineApiMachineListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.machineListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public machineList(param: MachineApiMachineListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.machineList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public machineReadWithHttpInfo(param: MachineApiMachineReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.machineReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public machineRead(param: MachineApiMachineReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.machineRead(param.id,  options).toPromise();
    }

}

import { ObservableMoveApi } from "./ObservableAPI";
import { MoveApiRequestFactory, MoveApiResponseProcessor} from "../apis/MoveApi";

export interface MoveApiMoveListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveApimoveList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveApimoveList
     */
    offset?: number
}

export interface MoveApiMoveReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveApimoveRead
     */
    id: number
}

export class ObjectMoveApi {
    private api: ObservableMoveApi

    public constructor(configuration: Configuration, requestFactory?: MoveApiRequestFactory, responseProcessor?: MoveApiResponseProcessor) {
        this.api = new ObservableMoveApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public moveListWithHttpInfo(param: MoveApiMoveListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveList(param: MoveApiMoveListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveReadWithHttpInfo(param: MoveApiMoveReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveRead(param: MoveApiMoveReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveRead(param.id,  options).toPromise();
    }

}

import { ObservableMoveAilmentApi } from "./ObservableAPI";
import { MoveAilmentApiRequestFactory, MoveAilmentApiResponseProcessor} from "../apis/MoveAilmentApi";

export interface MoveAilmentApiMoveAilmentListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveAilmentApimoveAilmentList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveAilmentApimoveAilmentList
     */
    offset?: number
}

export interface MoveAilmentApiMoveAilmentReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveAilmentApimoveAilmentRead
     */
    id: number
}

export class ObjectMoveAilmentApi {
    private api: ObservableMoveAilmentApi

    public constructor(configuration: Configuration, requestFactory?: MoveAilmentApiRequestFactory, responseProcessor?: MoveAilmentApiResponseProcessor) {
        this.api = new ObservableMoveAilmentApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public moveAilmentListWithHttpInfo(param: MoveAilmentApiMoveAilmentListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveAilmentListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveAilmentList(param: MoveAilmentApiMoveAilmentListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveAilmentList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveAilmentReadWithHttpInfo(param: MoveAilmentApiMoveAilmentReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveAilmentReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveAilmentRead(param: MoveAilmentApiMoveAilmentReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveAilmentRead(param.id,  options).toPromise();
    }

}

import { ObservableMoveBattleStyleApi } from "./ObservableAPI";
import { MoveBattleStyleApiRequestFactory, MoveBattleStyleApiResponseProcessor} from "../apis/MoveBattleStyleApi";

export interface MoveBattleStyleApiMoveBattleStyleListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveBattleStyleApimoveBattleStyleList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveBattleStyleApimoveBattleStyleList
     */
    offset?: number
}

export interface MoveBattleStyleApiMoveBattleStyleReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveBattleStyleApimoveBattleStyleRead
     */
    id: number
}

export class ObjectMoveBattleStyleApi {
    private api: ObservableMoveBattleStyleApi

    public constructor(configuration: Configuration, requestFactory?: MoveBattleStyleApiRequestFactory, responseProcessor?: MoveBattleStyleApiResponseProcessor) {
        this.api = new ObservableMoveBattleStyleApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public moveBattleStyleListWithHttpInfo(param: MoveBattleStyleApiMoveBattleStyleListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveBattleStyleListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveBattleStyleList(param: MoveBattleStyleApiMoveBattleStyleListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveBattleStyleList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveBattleStyleReadWithHttpInfo(param: MoveBattleStyleApiMoveBattleStyleReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveBattleStyleReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveBattleStyleRead(param: MoveBattleStyleApiMoveBattleStyleReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveBattleStyleRead(param.id,  options).toPromise();
    }

}

import { ObservableMoveCategoryApi } from "./ObservableAPI";
import { MoveCategoryApiRequestFactory, MoveCategoryApiResponseProcessor} from "../apis/MoveCategoryApi";

export interface MoveCategoryApiMoveCategoryListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveCategoryApimoveCategoryList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveCategoryApimoveCategoryList
     */
    offset?: number
}

export interface MoveCategoryApiMoveCategoryReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveCategoryApimoveCategoryRead
     */
    id: number
}

export class ObjectMoveCategoryApi {
    private api: ObservableMoveCategoryApi

    public constructor(configuration: Configuration, requestFactory?: MoveCategoryApiRequestFactory, responseProcessor?: MoveCategoryApiResponseProcessor) {
        this.api = new ObservableMoveCategoryApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public moveCategoryListWithHttpInfo(param: MoveCategoryApiMoveCategoryListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveCategoryListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveCategoryList(param: MoveCategoryApiMoveCategoryListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveCategoryList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveCategoryReadWithHttpInfo(param: MoveCategoryApiMoveCategoryReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveCategoryReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveCategoryRead(param: MoveCategoryApiMoveCategoryReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveCategoryRead(param.id,  options).toPromise();
    }

}

import { ObservableMoveDamageClassApi } from "./ObservableAPI";
import { MoveDamageClassApiRequestFactory, MoveDamageClassApiResponseProcessor} from "../apis/MoveDamageClassApi";

export interface MoveDamageClassApiMoveDamageClassListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveDamageClassApimoveDamageClassList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveDamageClassApimoveDamageClassList
     */
    offset?: number
}

export interface MoveDamageClassApiMoveDamageClassReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveDamageClassApimoveDamageClassRead
     */
    id: number
}

export class ObjectMoveDamageClassApi {
    private api: ObservableMoveDamageClassApi

    public constructor(configuration: Configuration, requestFactory?: MoveDamageClassApiRequestFactory, responseProcessor?: MoveDamageClassApiResponseProcessor) {
        this.api = new ObservableMoveDamageClassApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public moveDamageClassListWithHttpInfo(param: MoveDamageClassApiMoveDamageClassListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveDamageClassListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveDamageClassList(param: MoveDamageClassApiMoveDamageClassListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveDamageClassList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveDamageClassReadWithHttpInfo(param: MoveDamageClassApiMoveDamageClassReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveDamageClassReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveDamageClassRead(param: MoveDamageClassApiMoveDamageClassReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveDamageClassRead(param.id,  options).toPromise();
    }

}

import { ObservableMoveLearnMethodApi } from "./ObservableAPI";
import { MoveLearnMethodApiRequestFactory, MoveLearnMethodApiResponseProcessor} from "../apis/MoveLearnMethodApi";

export interface MoveLearnMethodApiMoveLearnMethodListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveLearnMethodApimoveLearnMethodList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveLearnMethodApimoveLearnMethodList
     */
    offset?: number
}

export interface MoveLearnMethodApiMoveLearnMethodReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveLearnMethodApimoveLearnMethodRead
     */
    id: number
}

export class ObjectMoveLearnMethodApi {
    private api: ObservableMoveLearnMethodApi

    public constructor(configuration: Configuration, requestFactory?: MoveLearnMethodApiRequestFactory, responseProcessor?: MoveLearnMethodApiResponseProcessor) {
        this.api = new ObservableMoveLearnMethodApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public moveLearnMethodListWithHttpInfo(param: MoveLearnMethodApiMoveLearnMethodListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveLearnMethodListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveLearnMethodList(param: MoveLearnMethodApiMoveLearnMethodListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveLearnMethodList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveLearnMethodReadWithHttpInfo(param: MoveLearnMethodApiMoveLearnMethodReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveLearnMethodReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveLearnMethodRead(param: MoveLearnMethodApiMoveLearnMethodReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveLearnMethodRead(param.id,  options).toPromise();
    }

}

import { ObservableMoveTargetApi } from "./ObservableAPI";
import { MoveTargetApiRequestFactory, MoveTargetApiResponseProcessor} from "../apis/MoveTargetApi";

export interface MoveTargetApiMoveTargetListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveTargetApimoveTargetList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveTargetApimoveTargetList
     */
    offset?: number
}

export interface MoveTargetApiMoveTargetReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof MoveTargetApimoveTargetRead
     */
    id: number
}

export class ObjectMoveTargetApi {
    private api: ObservableMoveTargetApi

    public constructor(configuration: Configuration, requestFactory?: MoveTargetApiRequestFactory, responseProcessor?: MoveTargetApiResponseProcessor) {
        this.api = new ObservableMoveTargetApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public moveTargetListWithHttpInfo(param: MoveTargetApiMoveTargetListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveTargetListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveTargetList(param: MoveTargetApiMoveTargetListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveTargetList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveTargetReadWithHttpInfo(param: MoveTargetApiMoveTargetReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.moveTargetReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public moveTargetRead(param: MoveTargetApiMoveTargetReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.moveTargetRead(param.id,  options).toPromise();
    }

}

import { ObservableNatureApi } from "./ObservableAPI";
import { NatureApiRequestFactory, NatureApiResponseProcessor} from "../apis/NatureApi";

export interface NatureApiNatureListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof NatureApinatureList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof NatureApinatureList
     */
    offset?: number
}

export interface NatureApiNatureReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof NatureApinatureRead
     */
    id: number
}

export class ObjectNatureApi {
    private api: ObservableNatureApi

    public constructor(configuration: Configuration, requestFactory?: NatureApiRequestFactory, responseProcessor?: NatureApiResponseProcessor) {
        this.api = new ObservableNatureApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public natureListWithHttpInfo(param: NatureApiNatureListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.natureListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public natureList(param: NatureApiNatureListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.natureList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public natureReadWithHttpInfo(param: NatureApiNatureReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.natureReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public natureRead(param: NatureApiNatureReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.natureRead(param.id,  options).toPromise();
    }

}

import { ObservablePalParkAreaApi } from "./ObservableAPI";
import { PalParkAreaApiRequestFactory, PalParkAreaApiResponseProcessor} from "../apis/PalParkAreaApi";

export interface PalParkAreaApiPalParkAreaListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PalParkAreaApipalParkAreaList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PalParkAreaApipalParkAreaList
     */
    offset?: number
}

export interface PalParkAreaApiPalParkAreaReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PalParkAreaApipalParkAreaRead
     */
    id: number
}

export class ObjectPalParkAreaApi {
    private api: ObservablePalParkAreaApi

    public constructor(configuration: Configuration, requestFactory?: PalParkAreaApiRequestFactory, responseProcessor?: PalParkAreaApiResponseProcessor) {
        this.api = new ObservablePalParkAreaApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public palParkAreaListWithHttpInfo(param: PalParkAreaApiPalParkAreaListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.palParkAreaListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public palParkAreaList(param: PalParkAreaApiPalParkAreaListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.palParkAreaList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public palParkAreaReadWithHttpInfo(param: PalParkAreaApiPalParkAreaReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.palParkAreaReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public palParkAreaRead(param: PalParkAreaApiPalParkAreaReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.palParkAreaRead(param.id,  options).toPromise();
    }

}

import { ObservablePokeathlonStatApi } from "./ObservableAPI";
import { PokeathlonStatApiRequestFactory, PokeathlonStatApiResponseProcessor} from "../apis/PokeathlonStatApi";

export interface PokeathlonStatApiPokeathlonStatListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokeathlonStatApipokeathlonStatList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokeathlonStatApipokeathlonStatList
     */
    offset?: number
}

export interface PokeathlonStatApiPokeathlonStatReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokeathlonStatApipokeathlonStatRead
     */
    id: number
}

export class ObjectPokeathlonStatApi {
    private api: ObservablePokeathlonStatApi

    public constructor(configuration: Configuration, requestFactory?: PokeathlonStatApiRequestFactory, responseProcessor?: PokeathlonStatApiResponseProcessor) {
        this.api = new ObservablePokeathlonStatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public pokeathlonStatListWithHttpInfo(param: PokeathlonStatApiPokeathlonStatListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokeathlonStatListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokeathlonStatList(param: PokeathlonStatApiPokeathlonStatListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokeathlonStatList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokeathlonStatReadWithHttpInfo(param: PokeathlonStatApiPokeathlonStatReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokeathlonStatReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokeathlonStatRead(param: PokeathlonStatApiPokeathlonStatReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokeathlonStatRead(param.id,  options).toPromise();
    }

}

import { ObservablePokedexApi } from "./ObservableAPI";
import { PokedexApiRequestFactory, PokedexApiResponseProcessor} from "../apis/PokedexApi";

export interface PokedexApiPokedexListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokedexApipokedexList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokedexApipokedexList
     */
    offset?: number
}

export interface PokedexApiPokedexReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokedexApipokedexRead
     */
    id: number
}

export class ObjectPokedexApi {
    private api: ObservablePokedexApi

    public constructor(configuration: Configuration, requestFactory?: PokedexApiRequestFactory, responseProcessor?: PokedexApiResponseProcessor) {
        this.api = new ObservablePokedexApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public pokedexListWithHttpInfo(param: PokedexApiPokedexListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokedexListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokedexList(param: PokedexApiPokedexListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokedexList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokedexReadWithHttpInfo(param: PokedexApiPokedexReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokedexReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokedexRead(param: PokedexApiPokedexReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokedexRead(param.id,  options).toPromise();
    }

}

import { ObservablePokemonApi } from "./ObservableAPI";
import { PokemonApiRequestFactory, PokemonApiResponseProcessor} from "../apis/PokemonApi";

export interface PokemonApiPokemonListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonList
     */
    offset?: number
}

export interface PokemonApiPokemonReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonApipokemonRead
     */
    id: number
}

export class ObjectPokemonApi {
    private api: ObservablePokemonApi

    public constructor(configuration: Configuration, requestFactory?: PokemonApiRequestFactory, responseProcessor?: PokemonApiResponseProcessor) {
        this.api = new ObservablePokemonApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public pokemonListWithHttpInfo(param: PokemonApiPokemonListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonList(param: PokemonApiPokemonListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonReadWithHttpInfo(param: PokemonApiPokemonReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonRead(param: PokemonApiPokemonReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonRead(param.id,  options).toPromise();
    }

}

import { ObservablePokemonColorApi } from "./ObservableAPI";
import { PokemonColorApiRequestFactory, PokemonColorApiResponseProcessor} from "../apis/PokemonColorApi";

export interface PokemonColorApiPokemonColorListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonColorApipokemonColorList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonColorApipokemonColorList
     */
    offset?: number
}

export interface PokemonColorApiPokemonColorReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonColorApipokemonColorRead
     */
    id: number
}

export class ObjectPokemonColorApi {
    private api: ObservablePokemonColorApi

    public constructor(configuration: Configuration, requestFactory?: PokemonColorApiRequestFactory, responseProcessor?: PokemonColorApiResponseProcessor) {
        this.api = new ObservablePokemonColorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public pokemonColorListWithHttpInfo(param: PokemonColorApiPokemonColorListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonColorListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonColorList(param: PokemonColorApiPokemonColorListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonColorList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonColorReadWithHttpInfo(param: PokemonColorApiPokemonColorReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonColorReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonColorRead(param: PokemonColorApiPokemonColorReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonColorRead(param.id,  options).toPromise();
    }

}

import { ObservablePokemonFormApi } from "./ObservableAPI";
import { PokemonFormApiRequestFactory, PokemonFormApiResponseProcessor} from "../apis/PokemonFormApi";

export interface PokemonFormApiPokemonFormListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonFormApipokemonFormList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonFormApipokemonFormList
     */
    offset?: number
}

export interface PokemonFormApiPokemonFormReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonFormApipokemonFormRead
     */
    id: number
}

export class ObjectPokemonFormApi {
    private api: ObservablePokemonFormApi

    public constructor(configuration: Configuration, requestFactory?: PokemonFormApiRequestFactory, responseProcessor?: PokemonFormApiResponseProcessor) {
        this.api = new ObservablePokemonFormApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public pokemonFormListWithHttpInfo(param: PokemonFormApiPokemonFormListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonFormListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonFormList(param: PokemonFormApiPokemonFormListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonFormList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonFormReadWithHttpInfo(param: PokemonFormApiPokemonFormReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonFormReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonFormRead(param: PokemonFormApiPokemonFormReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonFormRead(param.id,  options).toPromise();
    }

}

import { ObservablePokemonHabitatApi } from "./ObservableAPI";
import { PokemonHabitatApiRequestFactory, PokemonHabitatApiResponseProcessor} from "../apis/PokemonHabitatApi";

export interface PokemonHabitatApiPokemonHabitatListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonHabitatApipokemonHabitatList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonHabitatApipokemonHabitatList
     */
    offset?: number
}

export interface PokemonHabitatApiPokemonHabitatReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonHabitatApipokemonHabitatRead
     */
    id: number
}

export class ObjectPokemonHabitatApi {
    private api: ObservablePokemonHabitatApi

    public constructor(configuration: Configuration, requestFactory?: PokemonHabitatApiRequestFactory, responseProcessor?: PokemonHabitatApiResponseProcessor) {
        this.api = new ObservablePokemonHabitatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public pokemonHabitatListWithHttpInfo(param: PokemonHabitatApiPokemonHabitatListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonHabitatListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonHabitatList(param: PokemonHabitatApiPokemonHabitatListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonHabitatList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonHabitatReadWithHttpInfo(param: PokemonHabitatApiPokemonHabitatReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonHabitatReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonHabitatRead(param: PokemonHabitatApiPokemonHabitatReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonHabitatRead(param.id,  options).toPromise();
    }

}

import { ObservablePokemonShapeApi } from "./ObservableAPI";
import { PokemonShapeApiRequestFactory, PokemonShapeApiResponseProcessor} from "../apis/PokemonShapeApi";

export interface PokemonShapeApiPokemonShapeListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonShapeApipokemonShapeList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonShapeApipokemonShapeList
     */
    offset?: number
}

export interface PokemonShapeApiPokemonShapeReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonShapeApipokemonShapeRead
     */
    id: number
}

export class ObjectPokemonShapeApi {
    private api: ObservablePokemonShapeApi

    public constructor(configuration: Configuration, requestFactory?: PokemonShapeApiRequestFactory, responseProcessor?: PokemonShapeApiResponseProcessor) {
        this.api = new ObservablePokemonShapeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public pokemonShapeListWithHttpInfo(param: PokemonShapeApiPokemonShapeListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonShapeListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonShapeList(param: PokemonShapeApiPokemonShapeListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonShapeList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonShapeReadWithHttpInfo(param: PokemonShapeApiPokemonShapeReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonShapeReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonShapeRead(param: PokemonShapeApiPokemonShapeReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonShapeRead(param.id,  options).toPromise();
    }

}

import { ObservablePokemonSpeciesApi } from "./ObservableAPI";
import { PokemonSpeciesApiRequestFactory, PokemonSpeciesApiResponseProcessor} from "../apis/PokemonSpeciesApi";

export interface PokemonSpeciesApiPokemonSpeciesListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonSpeciesApipokemonSpeciesList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonSpeciesApipokemonSpeciesList
     */
    offset?: number
}

export interface PokemonSpeciesApiPokemonSpeciesReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof PokemonSpeciesApipokemonSpeciesRead
     */
    id: number
}

export class ObjectPokemonSpeciesApi {
    private api: ObservablePokemonSpeciesApi

    public constructor(configuration: Configuration, requestFactory?: PokemonSpeciesApiRequestFactory, responseProcessor?: PokemonSpeciesApiResponseProcessor) {
        this.api = new ObservablePokemonSpeciesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public pokemonSpeciesListWithHttpInfo(param: PokemonSpeciesApiPokemonSpeciesListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonSpeciesListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonSpeciesList(param: PokemonSpeciesApiPokemonSpeciesListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonSpeciesList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonSpeciesReadWithHttpInfo(param: PokemonSpeciesApiPokemonSpeciesReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.pokemonSpeciesReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public pokemonSpeciesRead(param: PokemonSpeciesApiPokemonSpeciesReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.pokemonSpeciesRead(param.id,  options).toPromise();
    }

}

import { ObservableRegionApi } from "./ObservableAPI";
import { RegionApiRequestFactory, RegionApiResponseProcessor} from "../apis/RegionApi";

export interface RegionApiRegionListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof RegionApiregionList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof RegionApiregionList
     */
    offset?: number
}

export interface RegionApiRegionReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof RegionApiregionRead
     */
    id: number
}

export class ObjectRegionApi {
    private api: ObservableRegionApi

    public constructor(configuration: Configuration, requestFactory?: RegionApiRequestFactory, responseProcessor?: RegionApiResponseProcessor) {
        this.api = new ObservableRegionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public regionListWithHttpInfo(param: RegionApiRegionListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.regionListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public regionList(param: RegionApiRegionListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.regionList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public regionReadWithHttpInfo(param: RegionApiRegionReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.regionReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public regionRead(param: RegionApiRegionReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.regionRead(param.id,  options).toPromise();
    }

}

import { ObservableStatApi } from "./ObservableAPI";
import { StatApiRequestFactory, StatApiResponseProcessor} from "../apis/StatApi";

export interface StatApiStatListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof StatApistatList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof StatApistatList
     */
    offset?: number
}

export interface StatApiStatReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof StatApistatRead
     */
    id: number
}

export class ObjectStatApi {
    private api: ObservableStatApi

    public constructor(configuration: Configuration, requestFactory?: StatApiRequestFactory, responseProcessor?: StatApiResponseProcessor) {
        this.api = new ObservableStatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public statListWithHttpInfo(param: StatApiStatListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.statListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public statList(param: StatApiStatListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.statList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public statReadWithHttpInfo(param: StatApiStatReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.statReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public statRead(param: StatApiStatReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.statRead(param.id,  options).toPromise();
    }

}

import { ObservableSuperContestEffectApi } from "./ObservableAPI";
import { SuperContestEffectApiRequestFactory, SuperContestEffectApiResponseProcessor} from "../apis/SuperContestEffectApi";

export interface SuperContestEffectApiSuperContestEffectListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SuperContestEffectApisuperContestEffectList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SuperContestEffectApisuperContestEffectList
     */
    offset?: number
}

export interface SuperContestEffectApiSuperContestEffectReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof SuperContestEffectApisuperContestEffectRead
     */
    id: number
}

export class ObjectSuperContestEffectApi {
    private api: ObservableSuperContestEffectApi

    public constructor(configuration: Configuration, requestFactory?: SuperContestEffectApiRequestFactory, responseProcessor?: SuperContestEffectApiResponseProcessor) {
        this.api = new ObservableSuperContestEffectApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public superContestEffectListWithHttpInfo(param: SuperContestEffectApiSuperContestEffectListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.superContestEffectListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public superContestEffectList(param: SuperContestEffectApiSuperContestEffectListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.superContestEffectList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public superContestEffectReadWithHttpInfo(param: SuperContestEffectApiSuperContestEffectReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.superContestEffectReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public superContestEffectRead(param: SuperContestEffectApiSuperContestEffectReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.superContestEffectRead(param.id,  options).toPromise();
    }

}

import { ObservableTypeApi } from "./ObservableAPI";
import { TypeApiRequestFactory, TypeApiResponseProcessor} from "../apis/TypeApi";

export interface TypeApiTypeListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof TypeApitypeList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof TypeApitypeList
     */
    offset?: number
}

export interface TypeApiTypeReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof TypeApitypeRead
     */
    id: number
}

export class ObjectTypeApi {
    private api: ObservableTypeApi

    public constructor(configuration: Configuration, requestFactory?: TypeApiRequestFactory, responseProcessor?: TypeApiResponseProcessor) {
        this.api = new ObservableTypeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public typeListWithHttpInfo(param: TypeApiTypeListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.typeListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public typeList(param: TypeApiTypeListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.typeList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public typeReadWithHttpInfo(param: TypeApiTypeReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.typeReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public typeRead(param: TypeApiTypeReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.typeRead(param.id,  options).toPromise();
    }

}

import { ObservableVersionApi } from "./ObservableAPI";
import { VersionApiRequestFactory, VersionApiResponseProcessor} from "../apis/VersionApi";

export interface VersionApiVersionListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof VersionApiversionList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof VersionApiversionList
     */
    offset?: number
}

export interface VersionApiVersionReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof VersionApiversionRead
     */
    id: number
}

export class ObjectVersionApi {
    private api: ObservableVersionApi

    public constructor(configuration: Configuration, requestFactory?: VersionApiRequestFactory, responseProcessor?: VersionApiResponseProcessor) {
        this.api = new ObservableVersionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public versionListWithHttpInfo(param: VersionApiVersionListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.versionListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public versionList(param: VersionApiVersionListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.versionList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public versionReadWithHttpInfo(param: VersionApiVersionReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.versionReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public versionRead(param: VersionApiVersionReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.versionRead(param.id,  options).toPromise();
    }

}

import { ObservableVersionGroupApi } from "./ObservableAPI";
import { VersionGroupApiRequestFactory, VersionGroupApiResponseProcessor} from "../apis/VersionGroupApi";

export interface VersionGroupApiVersionGroupListRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof VersionGroupApiversionGroupList
     */
    limit?: number
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof VersionGroupApiversionGroupList
     */
    offset?: number
}

export interface VersionGroupApiVersionGroupReadRequest {
    /**
     * 
     * Defaults to: undefined
     * @type number
     * @memberof VersionGroupApiversionGroupRead
     */
    id: number
}

export class ObjectVersionGroupApi {
    private api: ObservableVersionGroupApi

    public constructor(configuration: Configuration, requestFactory?: VersionGroupApiRequestFactory, responseProcessor?: VersionGroupApiResponseProcessor) {
        this.api = new ObservableVersionGroupApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param param the request object
     */
    public versionGroupListWithHttpInfo(param: VersionGroupApiVersionGroupListRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.versionGroupListWithHttpInfo(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public versionGroupList(param: VersionGroupApiVersionGroupListRequest = {}, options?: ConfigurationOptions): Promise<void> {
        return this.api.versionGroupList(param.limit, param.offset,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public versionGroupReadWithHttpInfo(param: VersionGroupApiVersionGroupReadRequest, options?: ConfigurationOptions): Promise<HttpInfo<void>> {
        return this.api.versionGroupReadWithHttpInfo(param.id,  options).toPromise();
    }

    /**
     * @param param the request object
     */
    public versionGroupRead(param: VersionGroupApiVersionGroupReadRequest, options?: ConfigurationOptions): Promise<void> {
        return this.api.versionGroupRead(param.id,  options).toPromise();
    }

}
