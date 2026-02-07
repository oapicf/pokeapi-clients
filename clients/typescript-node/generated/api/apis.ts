export * from './berriesApi';
import { BerriesApi } from './berriesApi';
export * from './contestsApi';
import { ContestsApi } from './contestsApi';
export * from './encountersApi';
import { EncountersApi } from './encountersApi';
export * from './evolutionApi';
import { EvolutionApi } from './evolutionApi';
export * from './gamesApi';
import { GamesApi } from './gamesApi';
export * from './itemsApi';
import { ItemsApi } from './itemsApi';
export * from './locationApi';
import { LocationApi } from './locationApi';
export * from './machinesApi';
import { MachinesApi } from './machinesApi';
export * from './movesApi';
import { MovesApi } from './movesApi';
export * from './pokemonApi';
import { PokemonApi } from './pokemonApi';
export * from './utilityApi';
import { UtilityApi } from './utilityApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [BerriesApi, ContestsApi, EncountersApi, EvolutionApi, GamesApi, ItemsApi, LocationApi, MachinesApi, MovesApi, PokemonApi, UtilityApi];
