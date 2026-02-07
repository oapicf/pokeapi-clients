package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AbilityDetail;
import org.openapitools.model.CharacteristicDetail;
import org.openapitools.model.EggGroupDetail;
import org.openapitools.model.GenderDetail;
import org.openapitools.model.GrowthRateDetail;
import org.openapitools.model.MoveDamageClassDetail;
import org.openapitools.model.NatureDetail;
import org.openapitools.model.PaginatedAbilitySummaryList;
import org.openapitools.model.PaginatedCharacteristicSummaryList;
import org.openapitools.model.PaginatedEggGroupSummaryList;
import org.openapitools.model.PaginatedGenderSummaryList;
import org.openapitools.model.PaginatedGrowthRateSummaryList;
import org.openapitools.model.PaginatedMoveDamageClassSummaryList;
import org.openapitools.model.PaginatedNatureSummaryList;
import org.openapitools.model.PaginatedPokeathlonStatSummaryList;
import org.openapitools.model.PaginatedPokemonColorSummaryList;
import org.openapitools.model.PaginatedPokemonFormSummaryList;
import org.openapitools.model.PaginatedPokemonHabitatSummaryList;
import org.openapitools.model.PaginatedPokemonShapeSummaryList;
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList;
import org.openapitools.model.PaginatedPokemonSummaryList;
import org.openapitools.model.PaginatedStatSummaryList;
import org.openapitools.model.PaginatedTypeSummaryList;
import org.openapitools.model.PokeathlonStatDetail;
import org.openapitools.model.PokemonColorDetail;
import org.openapitools.model.PokemonDetail;
import org.openapitools.model.PokemonFormDetail;
import org.openapitools.model.PokemonHabitatDetail;
import org.openapitools.model.PokemonShapeDetail;
import org.openapitools.model.PokemonSpeciesDetail;
import org.openapitools.model.StatDetail;
import org.openapitools.model.TypeDetail;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * PokéAPI
 *
 * <p>All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**(]https://github.com/phalt) and other [**PokéAPI contributors***](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.     
 *
 */
public class PokemonApiServiceImpl implements PokemonApi {
    public PaginatedAbilitySummaryList abilityList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    public AbilityDetail abilityRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List charecterictics
     *
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     *
     */
    public PaginatedCharacteristicSummaryList characteristicList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get characteristic
     *
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     *
     */
    public CharacteristicDetail characteristicRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List egg groups
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     *
     */
    public PaginatedEggGroupSummaryList eggGroupList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get egg group
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     *
     */
    public EggGroupDetail eggGroupRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List genders
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     *
     */
    public PaginatedGenderSummaryList genderList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get gender
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     *
     */
    public GenderDetail genderRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List growth rates
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     *
     */
    public PaginatedGrowthRateSummaryList growthRateList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get growth rate
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     *
     */
    public GrowthRateDetail growthRateRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List move damage classes
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     *
     */
    public PaginatedMoveDamageClassSummaryList moveDamageClassList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get move damage class
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     *
     */
    public MoveDamageClassDetail moveDamageClassRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List natures
     *
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     *
     */
    public PaginatedNatureSummaryList natureList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get nature
     *
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     *
     */
    public NatureDetail natureRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pokeathlon stats
     *
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     *
     */
    public PaginatedPokeathlonStatSummaryList pokeathlonStatList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pokeathlon stat
     *
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     *
     */
    public PokeathlonStatDetail pokeathlonStatRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pokemon colors
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     *
     */
    public PaginatedPokemonColorSummaryList pokemonColorList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pokemon color
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     *
     */
    public PokemonColorDetail pokemonColorRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pokemon forms
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     *
     */
    public PaginatedPokemonFormSummaryList pokemonFormList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pokemon form
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     *
     */
    public PokemonFormDetail pokemonFormRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pokemom habitas
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     *
     */
    public PaginatedPokemonHabitatSummaryList pokemonHabitatList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pokemom habita
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     *
     */
    public PokemonHabitatDetail pokemonHabitatRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     *
     */
    public PaginatedPokemonSummaryList pokemonList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     *
     */
    public PokemonDetail pokemonRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pokemon shapes
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     *
     */
    public PaginatedPokemonShapeSummaryList pokemonShapeList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pokemon shape
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     *
     */
    public PokemonShapeDetail pokemonShapeRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     *
     */
    public PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     *
     */
    public PokemonSpeciesDetail pokemonSpeciesRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List stats
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     *
     */
    public PaginatedStatSummaryList statList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get stat
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     *
     */
    public StatDetail statRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

    /**
     * List types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     *
     */
    public PaginatedTypeSummaryList typeList(Integer limit, Integer offset, String q) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     *
     */
    public TypeDetail typeRetrieve(String id) {
        // TODO: Implement...

        return null;
    }

}
