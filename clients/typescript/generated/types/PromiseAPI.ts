import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import { Configuration} from '../configuration'

import { ObservableAbilityApi } from './ObservableAPI';

import { AbilityApiRequestFactory, AbilityApiResponseProcessor} from "../apis/AbilityApi";
export class PromiseAbilityApi {
    private api: ObservableAbilityApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AbilityApiRequestFactory,
        responseProcessor?: AbilityApiResponseProcessor
    ) {
        this.api = new ObservableAbilityApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public abilityList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.abilityList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public abilityRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.abilityRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableBerryApi } from './ObservableAPI';

import { BerryApiRequestFactory, BerryApiResponseProcessor} from "../apis/BerryApi";
export class PromiseBerryApi {
    private api: ObservableBerryApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BerryApiRequestFactory,
        responseProcessor?: BerryApiResponseProcessor
    ) {
        this.api = new ObservableBerryApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public berryList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.berryList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public berryRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.berryRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableBerryFirmnessApi } from './ObservableAPI';

import { BerryFirmnessApiRequestFactory, BerryFirmnessApiResponseProcessor} from "../apis/BerryFirmnessApi";
export class PromiseBerryFirmnessApi {
    private api: ObservableBerryFirmnessApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BerryFirmnessApiRequestFactory,
        responseProcessor?: BerryFirmnessApiResponseProcessor
    ) {
        this.api = new ObservableBerryFirmnessApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public berryFirmnessList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.berryFirmnessList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public berryFirmnessRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.berryFirmnessRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableBerryFlavorApi } from './ObservableAPI';

import { BerryFlavorApiRequestFactory, BerryFlavorApiResponseProcessor} from "../apis/BerryFlavorApi";
export class PromiseBerryFlavorApi {
    private api: ObservableBerryFlavorApi

    public constructor(
        configuration: Configuration,
        requestFactory?: BerryFlavorApiRequestFactory,
        responseProcessor?: BerryFlavorApiResponseProcessor
    ) {
        this.api = new ObservableBerryFlavorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public berryFlavorList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.berryFlavorList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public berryFlavorRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.berryFlavorRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableCharacteristicApi } from './ObservableAPI';

import { CharacteristicApiRequestFactory, CharacteristicApiResponseProcessor} from "../apis/CharacteristicApi";
export class PromiseCharacteristicApi {
    private api: ObservableCharacteristicApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CharacteristicApiRequestFactory,
        responseProcessor?: CharacteristicApiResponseProcessor
    ) {
        this.api = new ObservableCharacteristicApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public characteristicList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.characteristicList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public characteristicRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.characteristicRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableContestEffectApi } from './ObservableAPI';

import { ContestEffectApiRequestFactory, ContestEffectApiResponseProcessor} from "../apis/ContestEffectApi";
export class PromiseContestEffectApi {
    private api: ObservableContestEffectApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ContestEffectApiRequestFactory,
        responseProcessor?: ContestEffectApiResponseProcessor
    ) {
        this.api = new ObservableContestEffectApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public contestEffectList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.contestEffectList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public contestEffectRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.contestEffectRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableContestTypeApi } from './ObservableAPI';

import { ContestTypeApiRequestFactory, ContestTypeApiResponseProcessor} from "../apis/ContestTypeApi";
export class PromiseContestTypeApi {
    private api: ObservableContestTypeApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ContestTypeApiRequestFactory,
        responseProcessor?: ContestTypeApiResponseProcessor
    ) {
        this.api = new ObservableContestTypeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public contestTypeList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.contestTypeList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public contestTypeRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.contestTypeRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableEggGroupApi } from './ObservableAPI';

import { EggGroupApiRequestFactory, EggGroupApiResponseProcessor} from "../apis/EggGroupApi";
export class PromiseEggGroupApi {
    private api: ObservableEggGroupApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EggGroupApiRequestFactory,
        responseProcessor?: EggGroupApiResponseProcessor
    ) {
        this.api = new ObservableEggGroupApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public eggGroupList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.eggGroupList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public eggGroupRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.eggGroupRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableEncounterConditionApi } from './ObservableAPI';

import { EncounterConditionApiRequestFactory, EncounterConditionApiResponseProcessor} from "../apis/EncounterConditionApi";
export class PromiseEncounterConditionApi {
    private api: ObservableEncounterConditionApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EncounterConditionApiRequestFactory,
        responseProcessor?: EncounterConditionApiResponseProcessor
    ) {
        this.api = new ObservableEncounterConditionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public encounterConditionList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.encounterConditionList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public encounterConditionRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.encounterConditionRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableEncounterConditionValueApi } from './ObservableAPI';

import { EncounterConditionValueApiRequestFactory, EncounterConditionValueApiResponseProcessor} from "../apis/EncounterConditionValueApi";
export class PromiseEncounterConditionValueApi {
    private api: ObservableEncounterConditionValueApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EncounterConditionValueApiRequestFactory,
        responseProcessor?: EncounterConditionValueApiResponseProcessor
    ) {
        this.api = new ObservableEncounterConditionValueApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public encounterConditionValueList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.encounterConditionValueList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public encounterConditionValueRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.encounterConditionValueRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableEncounterMethodApi } from './ObservableAPI';

import { EncounterMethodApiRequestFactory, EncounterMethodApiResponseProcessor} from "../apis/EncounterMethodApi";
export class PromiseEncounterMethodApi {
    private api: ObservableEncounterMethodApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EncounterMethodApiRequestFactory,
        responseProcessor?: EncounterMethodApiResponseProcessor
    ) {
        this.api = new ObservableEncounterMethodApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public encounterMethodList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.encounterMethodList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public encounterMethodRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.encounterMethodRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableEvolutionChainApi } from './ObservableAPI';

import { EvolutionChainApiRequestFactory, EvolutionChainApiResponseProcessor} from "../apis/EvolutionChainApi";
export class PromiseEvolutionChainApi {
    private api: ObservableEvolutionChainApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EvolutionChainApiRequestFactory,
        responseProcessor?: EvolutionChainApiResponseProcessor
    ) {
        this.api = new ObservableEvolutionChainApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public evolutionChainList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.evolutionChainList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public evolutionChainRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.evolutionChainRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableEvolutionTriggerApi } from './ObservableAPI';

import { EvolutionTriggerApiRequestFactory, EvolutionTriggerApiResponseProcessor} from "../apis/EvolutionTriggerApi";
export class PromiseEvolutionTriggerApi {
    private api: ObservableEvolutionTriggerApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EvolutionTriggerApiRequestFactory,
        responseProcessor?: EvolutionTriggerApiResponseProcessor
    ) {
        this.api = new ObservableEvolutionTriggerApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public evolutionTriggerList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.evolutionTriggerList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public evolutionTriggerRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.evolutionTriggerRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableGenderApi } from './ObservableAPI';

import { GenderApiRequestFactory, GenderApiResponseProcessor} from "../apis/GenderApi";
export class PromiseGenderApi {
    private api: ObservableGenderApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GenderApiRequestFactory,
        responseProcessor?: GenderApiResponseProcessor
    ) {
        this.api = new ObservableGenderApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public genderList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.genderList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public genderRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.genderRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableGenerationApi } from './ObservableAPI';

import { GenerationApiRequestFactory, GenerationApiResponseProcessor} from "../apis/GenerationApi";
export class PromiseGenerationApi {
    private api: ObservableGenerationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GenerationApiRequestFactory,
        responseProcessor?: GenerationApiResponseProcessor
    ) {
        this.api = new ObservableGenerationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public generationList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.generationList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public generationRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.generationRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableGrowthRateApi } from './ObservableAPI';

import { GrowthRateApiRequestFactory, GrowthRateApiResponseProcessor} from "../apis/GrowthRateApi";
export class PromiseGrowthRateApi {
    private api: ObservableGrowthRateApi

    public constructor(
        configuration: Configuration,
        requestFactory?: GrowthRateApiRequestFactory,
        responseProcessor?: GrowthRateApiResponseProcessor
    ) {
        this.api = new ObservableGrowthRateApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public growthRateList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.growthRateList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public growthRateRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.growthRateRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableItemApi } from './ObservableAPI';

import { ItemApiRequestFactory, ItemApiResponseProcessor} from "../apis/ItemApi";
export class PromiseItemApi {
    private api: ObservableItemApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemApiRequestFactory,
        responseProcessor?: ItemApiResponseProcessor
    ) {
        this.api = new ObservableItemApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public itemList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public itemRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableItemAttributeApi } from './ObservableAPI';

import { ItemAttributeApiRequestFactory, ItemAttributeApiResponseProcessor} from "../apis/ItemAttributeApi";
export class PromiseItemAttributeApi {
    private api: ObservableItemAttributeApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemAttributeApiRequestFactory,
        responseProcessor?: ItemAttributeApiResponseProcessor
    ) {
        this.api = new ObservableItemAttributeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public itemAttributeList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemAttributeList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public itemAttributeRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemAttributeRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableItemCategoryApi } from './ObservableAPI';

import { ItemCategoryApiRequestFactory, ItemCategoryApiResponseProcessor} from "../apis/ItemCategoryApi";
export class PromiseItemCategoryApi {
    private api: ObservableItemCategoryApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemCategoryApiRequestFactory,
        responseProcessor?: ItemCategoryApiResponseProcessor
    ) {
        this.api = new ObservableItemCategoryApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public itemCategoryList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemCategoryList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public itemCategoryRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemCategoryRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableItemFlingEffectApi } from './ObservableAPI';

import { ItemFlingEffectApiRequestFactory, ItemFlingEffectApiResponseProcessor} from "../apis/ItemFlingEffectApi";
export class PromiseItemFlingEffectApi {
    private api: ObservableItemFlingEffectApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemFlingEffectApiRequestFactory,
        responseProcessor?: ItemFlingEffectApiResponseProcessor
    ) {
        this.api = new ObservableItemFlingEffectApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public itemFlingEffectList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemFlingEffectList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public itemFlingEffectRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemFlingEffectRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableItemPocketApi } from './ObservableAPI';

import { ItemPocketApiRequestFactory, ItemPocketApiResponseProcessor} from "../apis/ItemPocketApi";
export class PromiseItemPocketApi {
    private api: ObservableItemPocketApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ItemPocketApiRequestFactory,
        responseProcessor?: ItemPocketApiResponseProcessor
    ) {
        this.api = new ObservableItemPocketApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public itemPocketList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemPocketList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public itemPocketRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.itemPocketRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableLanguageApi } from './ObservableAPI';

import { LanguageApiRequestFactory, LanguageApiResponseProcessor} from "../apis/LanguageApi";
export class PromiseLanguageApi {
    private api: ObservableLanguageApi

    public constructor(
        configuration: Configuration,
        requestFactory?: LanguageApiRequestFactory,
        responseProcessor?: LanguageApiResponseProcessor
    ) {
        this.api = new ObservableLanguageApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public languageList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.languageList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public languageRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.languageRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableLocationApi } from './ObservableAPI';

import { LocationApiRequestFactory, LocationApiResponseProcessor} from "../apis/LocationApi";
export class PromiseLocationApi {
    private api: ObservableLocationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: LocationApiRequestFactory,
        responseProcessor?: LocationApiResponseProcessor
    ) {
        this.api = new ObservableLocationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public locationList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.locationList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public locationRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.locationRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableLocationAreaApi } from './ObservableAPI';

import { LocationAreaApiRequestFactory, LocationAreaApiResponseProcessor} from "../apis/LocationAreaApi";
export class PromiseLocationAreaApi {
    private api: ObservableLocationAreaApi

    public constructor(
        configuration: Configuration,
        requestFactory?: LocationAreaApiRequestFactory,
        responseProcessor?: LocationAreaApiResponseProcessor
    ) {
        this.api = new ObservableLocationAreaApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public locationAreaList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.locationAreaList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public locationAreaRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.locationAreaRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableMachineApi } from './ObservableAPI';

import { MachineApiRequestFactory, MachineApiResponseProcessor} from "../apis/MachineApi";
export class PromiseMachineApi {
    private api: ObservableMachineApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MachineApiRequestFactory,
        responseProcessor?: MachineApiResponseProcessor
    ) {
        this.api = new ObservableMachineApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public machineList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.machineList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public machineRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.machineRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableMoveApi } from './ObservableAPI';

import { MoveApiRequestFactory, MoveApiResponseProcessor} from "../apis/MoveApi";
export class PromiseMoveApi {
    private api: ObservableMoveApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveApiRequestFactory,
        responseProcessor?: MoveApiResponseProcessor
    ) {
        this.api = new ObservableMoveApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public moveList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public moveRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableMoveAilmentApi } from './ObservableAPI';

import { MoveAilmentApiRequestFactory, MoveAilmentApiResponseProcessor} from "../apis/MoveAilmentApi";
export class PromiseMoveAilmentApi {
    private api: ObservableMoveAilmentApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveAilmentApiRequestFactory,
        responseProcessor?: MoveAilmentApiResponseProcessor
    ) {
        this.api = new ObservableMoveAilmentApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public moveAilmentList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveAilmentList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public moveAilmentRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveAilmentRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableMoveBattleStyleApi } from './ObservableAPI';

import { MoveBattleStyleApiRequestFactory, MoveBattleStyleApiResponseProcessor} from "../apis/MoveBattleStyleApi";
export class PromiseMoveBattleStyleApi {
    private api: ObservableMoveBattleStyleApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveBattleStyleApiRequestFactory,
        responseProcessor?: MoveBattleStyleApiResponseProcessor
    ) {
        this.api = new ObservableMoveBattleStyleApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public moveBattleStyleList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveBattleStyleList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public moveBattleStyleRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveBattleStyleRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableMoveCategoryApi } from './ObservableAPI';

import { MoveCategoryApiRequestFactory, MoveCategoryApiResponseProcessor} from "../apis/MoveCategoryApi";
export class PromiseMoveCategoryApi {
    private api: ObservableMoveCategoryApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveCategoryApiRequestFactory,
        responseProcessor?: MoveCategoryApiResponseProcessor
    ) {
        this.api = new ObservableMoveCategoryApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public moveCategoryList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveCategoryList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public moveCategoryRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveCategoryRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableMoveDamageClassApi } from './ObservableAPI';

import { MoveDamageClassApiRequestFactory, MoveDamageClassApiResponseProcessor} from "../apis/MoveDamageClassApi";
export class PromiseMoveDamageClassApi {
    private api: ObservableMoveDamageClassApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveDamageClassApiRequestFactory,
        responseProcessor?: MoveDamageClassApiResponseProcessor
    ) {
        this.api = new ObservableMoveDamageClassApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public moveDamageClassList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveDamageClassList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public moveDamageClassRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveDamageClassRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableMoveLearnMethodApi } from './ObservableAPI';

import { MoveLearnMethodApiRequestFactory, MoveLearnMethodApiResponseProcessor} from "../apis/MoveLearnMethodApi";
export class PromiseMoveLearnMethodApi {
    private api: ObservableMoveLearnMethodApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveLearnMethodApiRequestFactory,
        responseProcessor?: MoveLearnMethodApiResponseProcessor
    ) {
        this.api = new ObservableMoveLearnMethodApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public moveLearnMethodList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveLearnMethodList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public moveLearnMethodRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveLearnMethodRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableMoveTargetApi } from './ObservableAPI';

import { MoveTargetApiRequestFactory, MoveTargetApiResponseProcessor} from "../apis/MoveTargetApi";
export class PromiseMoveTargetApi {
    private api: ObservableMoveTargetApi

    public constructor(
        configuration: Configuration,
        requestFactory?: MoveTargetApiRequestFactory,
        responseProcessor?: MoveTargetApiResponseProcessor
    ) {
        this.api = new ObservableMoveTargetApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public moveTargetList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveTargetList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public moveTargetRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.moveTargetRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableNatureApi } from './ObservableAPI';

import { NatureApiRequestFactory, NatureApiResponseProcessor} from "../apis/NatureApi";
export class PromiseNatureApi {
    private api: ObservableNatureApi

    public constructor(
        configuration: Configuration,
        requestFactory?: NatureApiRequestFactory,
        responseProcessor?: NatureApiResponseProcessor
    ) {
        this.api = new ObservableNatureApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public natureList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.natureList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public natureRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.natureRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePalParkAreaApi } from './ObservableAPI';

import { PalParkAreaApiRequestFactory, PalParkAreaApiResponseProcessor} from "../apis/PalParkAreaApi";
export class PromisePalParkAreaApi {
    private api: ObservablePalParkAreaApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PalParkAreaApiRequestFactory,
        responseProcessor?: PalParkAreaApiResponseProcessor
    ) {
        this.api = new ObservablePalParkAreaApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public palParkAreaList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.palParkAreaList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public palParkAreaRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.palParkAreaRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePokeathlonStatApi } from './ObservableAPI';

import { PokeathlonStatApiRequestFactory, PokeathlonStatApiResponseProcessor} from "../apis/PokeathlonStatApi";
export class PromisePokeathlonStatApi {
    private api: ObservablePokeathlonStatApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokeathlonStatApiRequestFactory,
        responseProcessor?: PokeathlonStatApiResponseProcessor
    ) {
        this.api = new ObservablePokeathlonStatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public pokeathlonStatList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokeathlonStatList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public pokeathlonStatRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokeathlonStatRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePokedexApi } from './ObservableAPI';

import { PokedexApiRequestFactory, PokedexApiResponseProcessor} from "../apis/PokedexApi";
export class PromisePokedexApi {
    private api: ObservablePokedexApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokedexApiRequestFactory,
        responseProcessor?: PokedexApiResponseProcessor
    ) {
        this.api = new ObservablePokedexApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public pokedexList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokedexList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public pokedexRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokedexRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePokemonApi } from './ObservableAPI';

import { PokemonApiRequestFactory, PokemonApiResponseProcessor} from "../apis/PokemonApi";
export class PromisePokemonApi {
    private api: ObservablePokemonApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonApiRequestFactory,
        responseProcessor?: PokemonApiResponseProcessor
    ) {
        this.api = new ObservablePokemonApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public pokemonList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public pokemonRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePokemonColorApi } from './ObservableAPI';

import { PokemonColorApiRequestFactory, PokemonColorApiResponseProcessor} from "../apis/PokemonColorApi";
export class PromisePokemonColorApi {
    private api: ObservablePokemonColorApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonColorApiRequestFactory,
        responseProcessor?: PokemonColorApiResponseProcessor
    ) {
        this.api = new ObservablePokemonColorApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public pokemonColorList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonColorList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public pokemonColorRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonColorRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePokemonFormApi } from './ObservableAPI';

import { PokemonFormApiRequestFactory, PokemonFormApiResponseProcessor} from "../apis/PokemonFormApi";
export class PromisePokemonFormApi {
    private api: ObservablePokemonFormApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonFormApiRequestFactory,
        responseProcessor?: PokemonFormApiResponseProcessor
    ) {
        this.api = new ObservablePokemonFormApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public pokemonFormList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonFormList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public pokemonFormRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonFormRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePokemonHabitatApi } from './ObservableAPI';

import { PokemonHabitatApiRequestFactory, PokemonHabitatApiResponseProcessor} from "../apis/PokemonHabitatApi";
export class PromisePokemonHabitatApi {
    private api: ObservablePokemonHabitatApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonHabitatApiRequestFactory,
        responseProcessor?: PokemonHabitatApiResponseProcessor
    ) {
        this.api = new ObservablePokemonHabitatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public pokemonHabitatList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonHabitatList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public pokemonHabitatRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonHabitatRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePokemonShapeApi } from './ObservableAPI';

import { PokemonShapeApiRequestFactory, PokemonShapeApiResponseProcessor} from "../apis/PokemonShapeApi";
export class PromisePokemonShapeApi {
    private api: ObservablePokemonShapeApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonShapeApiRequestFactory,
        responseProcessor?: PokemonShapeApiResponseProcessor
    ) {
        this.api = new ObservablePokemonShapeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public pokemonShapeList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonShapeList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public pokemonShapeRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonShapeRead(id, _options);
        return result.toPromise();
    }


}



import { ObservablePokemonSpeciesApi } from './ObservableAPI';

import { PokemonSpeciesApiRequestFactory, PokemonSpeciesApiResponseProcessor} from "../apis/PokemonSpeciesApi";
export class PromisePokemonSpeciesApi {
    private api: ObservablePokemonSpeciesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: PokemonSpeciesApiRequestFactory,
        responseProcessor?: PokemonSpeciesApiResponseProcessor
    ) {
        this.api = new ObservablePokemonSpeciesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public pokemonSpeciesList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonSpeciesList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public pokemonSpeciesRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.pokemonSpeciesRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableRegionApi } from './ObservableAPI';

import { RegionApiRequestFactory, RegionApiResponseProcessor} from "../apis/RegionApi";
export class PromiseRegionApi {
    private api: ObservableRegionApi

    public constructor(
        configuration: Configuration,
        requestFactory?: RegionApiRequestFactory,
        responseProcessor?: RegionApiResponseProcessor
    ) {
        this.api = new ObservableRegionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public regionList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.regionList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public regionRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.regionRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableStatApi } from './ObservableAPI';

import { StatApiRequestFactory, StatApiResponseProcessor} from "../apis/StatApi";
export class PromiseStatApi {
    private api: ObservableStatApi

    public constructor(
        configuration: Configuration,
        requestFactory?: StatApiRequestFactory,
        responseProcessor?: StatApiResponseProcessor
    ) {
        this.api = new ObservableStatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public statList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.statList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public statRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.statRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableSuperContestEffectApi } from './ObservableAPI';

import { SuperContestEffectApiRequestFactory, SuperContestEffectApiResponseProcessor} from "../apis/SuperContestEffectApi";
export class PromiseSuperContestEffectApi {
    private api: ObservableSuperContestEffectApi

    public constructor(
        configuration: Configuration,
        requestFactory?: SuperContestEffectApiRequestFactory,
        responseProcessor?: SuperContestEffectApiResponseProcessor
    ) {
        this.api = new ObservableSuperContestEffectApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public superContestEffectList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.superContestEffectList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public superContestEffectRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.superContestEffectRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableTypeApi } from './ObservableAPI';

import { TypeApiRequestFactory, TypeApiResponseProcessor} from "../apis/TypeApi";
export class PromiseTypeApi {
    private api: ObservableTypeApi

    public constructor(
        configuration: Configuration,
        requestFactory?: TypeApiRequestFactory,
        responseProcessor?: TypeApiResponseProcessor
    ) {
        this.api = new ObservableTypeApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public typeList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.typeList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public typeRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.typeRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableVersionApi } from './ObservableAPI';

import { VersionApiRequestFactory, VersionApiResponseProcessor} from "../apis/VersionApi";
export class PromiseVersionApi {
    private api: ObservableVersionApi

    public constructor(
        configuration: Configuration,
        requestFactory?: VersionApiRequestFactory,
        responseProcessor?: VersionApiResponseProcessor
    ) {
        this.api = new ObservableVersionApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public versionList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.versionList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public versionRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.versionRead(id, _options);
        return result.toPromise();
    }


}



import { ObservableVersionGroupApi } from './ObservableAPI';

import { VersionGroupApiRequestFactory, VersionGroupApiResponseProcessor} from "../apis/VersionGroupApi";
export class PromiseVersionGroupApi {
    private api: ObservableVersionGroupApi

    public constructor(
        configuration: Configuration,
        requestFactory?: VersionGroupApiRequestFactory,
        responseProcessor?: VersionGroupApiResponseProcessor
    ) {
        this.api = new ObservableVersionGroupApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * @param limit 
     * @param offset 
     */
    public versionGroupList(limit?: number, offset?: number, _options?: Configuration): Promise<void> {
        const result = this.api.versionGroupList(limit, offset, _options);
        return result.toPromise();
    }

    /**
     * @param id 
     */
    public versionGroupRead(id: number, _options?: Configuration): Promise<void> {
        const result = this.api.versionGroupRead(id, _options);
        return result.toPromise();
    }


}



