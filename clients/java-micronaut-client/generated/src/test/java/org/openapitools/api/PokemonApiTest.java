package org.openapitools.api;

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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for PokemonApi
 */
@MicronautTest
public class PokemonApiTest {

    @Inject
    PokemonApi api;

    
    /**
     * 
     *
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void abilityListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedAbilitySummaryList body = api.abilityList(limit, offset, q).block();

        // then
        // TODO implement the abilityListTest()
    }

    
    /**
     * 
     *
     * Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void abilityRetrieveTest() {
        // given
        String id = "example";

        // when
        AbilityDetail body = api.abilityRetrieve(id).block();

        // then
        // TODO implement the abilityRetrieveTest()
    }

    
    /**
     * List charecterictics
     *
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void characteristicListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedCharacteristicSummaryList body = api.characteristicList(limit, offset, q).block();

        // then
        // TODO implement the characteristicListTest()
    }

    
    /**
     * Get characteristic
     *
     * Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void characteristicRetrieveTest() {
        // given
        String id = "example";

        // when
        CharacteristicDetail body = api.characteristicRetrieve(id).block();

        // then
        // TODO implement the characteristicRetrieveTest()
    }

    
    /**
     * List egg groups
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void eggGroupListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedEggGroupSummaryList body = api.eggGroupList(limit, offset, q).block();

        // then
        // TODO implement the eggGroupListTest()
    }

    
    /**
     * Get egg group
     *
     * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void eggGroupRetrieveTest() {
        // given
        String id = "example";

        // when
        EggGroupDetail body = api.eggGroupRetrieve(id).block();

        // then
        // TODO implement the eggGroupRetrieveTest()
    }

    
    /**
     * List genders
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void genderListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedGenderSummaryList body = api.genderList(limit, offset, q).block();

        // then
        // TODO implement the genderListTest()
    }

    
    /**
     * Get gender
     *
     * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void genderRetrieveTest() {
        // given
        String id = "example";

        // when
        GenderDetail body = api.genderRetrieve(id).block();

        // then
        // TODO implement the genderRetrieveTest()
    }

    
    /**
     * List growth rates
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void growthRateListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedGrowthRateSummaryList body = api.growthRateList(limit, offset, q).block();

        // then
        // TODO implement the growthRateListTest()
    }

    
    /**
     * Get growth rate
     *
     * Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void growthRateRetrieveTest() {
        // given
        String id = "example";

        // when
        GrowthRateDetail body = api.growthRateRetrieve(id).block();

        // then
        // TODO implement the growthRateRetrieveTest()
    }

    
    /**
     * List move damage classes
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveDamageClassListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedMoveDamageClassSummaryList body = api.moveDamageClassList(limit, offset, q).block();

        // then
        // TODO implement the moveDamageClassListTest()
    }

    
    /**
     * Get move damage class
     *
     * Damage classes moves can have, e.g. physical, special, or non-damaging.
     */
    @Test
    @Disabled("Not Implemented")
    public void moveDamageClassRetrieveTest() {
        // given
        String id = "example";

        // when
        MoveDamageClassDetail body = api.moveDamageClassRetrieve(id).block();

        // then
        // TODO implement the moveDamageClassRetrieveTest()
    }

    
    /**
     * List natures
     *
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void natureListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedNatureSummaryList body = api.natureList(limit, offset, q).block();

        // then
        // TODO implement the natureListTest()
    }

    
    /**
     * Get nature
     *
     * Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void natureRetrieveTest() {
        // given
        String id = "example";

        // when
        NatureDetail body = api.natureRetrieve(id).block();

        // then
        // TODO implement the natureRetrieveTest()
    }

    
    /**
     * List pokeathlon stats
     *
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokeathlonStatListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokeathlonStatSummaryList body = api.pokeathlonStatList(limit, offset, q).block();

        // then
        // TODO implement the pokeathlonStatListTest()
    }

    
    /**
     * Get pokeathlon stat
     *
     * Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokeathlonStatRetrieveTest() {
        // given
        String id = "example";

        // when
        PokeathlonStatDetail body = api.pokeathlonStatRetrieve(id).block();

        // then
        // TODO implement the pokeathlonStatRetrieveTest()
    }

    
    /**
     * List pokemon colors
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonColorListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonColorSummaryList body = api.pokemonColorList(limit, offset, q).block();

        // then
        // TODO implement the pokemonColorListTest()
    }

    
    /**
     * Get pokemon color
     *
     * Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonColorRetrieveTest() {
        // given
        String id = "example";

        // when
        PokemonColorDetail body = api.pokemonColorRetrieve(id).block();

        // then
        // TODO implement the pokemonColorRetrieveTest()
    }

    
    /**
     * List pokemon forms
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonFormListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonFormSummaryList body = api.pokemonFormList(limit, offset, q).block();

        // then
        // TODO implement the pokemonFormListTest()
    }

    
    /**
     * Get pokemon form
     *
     * Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonFormRetrieveTest() {
        // given
        String id = "example";

        // when
        PokemonFormDetail body = api.pokemonFormRetrieve(id).block();

        // then
        // TODO implement the pokemonFormRetrieveTest()
    }

    
    /**
     * List pokemom habitas
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonHabitatListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonHabitatSummaryList body = api.pokemonHabitatList(limit, offset, q).block();

        // then
        // TODO implement the pokemonHabitatListTest()
    }

    
    /**
     * Get pokemom habita
     *
     * Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonHabitatRetrieveTest() {
        // given
        String id = "example";

        // when
        PokemonHabitatDetail body = api.pokemonHabitatRetrieve(id).block();

        // then
        // TODO implement the pokemonHabitatRetrieveTest()
    }

    
    /**
     * List pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonSummaryList body = api.pokemonList(limit, offset, q).block();

        // then
        // TODO implement the pokemonListTest()
    }

    
    /**
     * Get pokemon
     *
     * Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonRetrieveTest() {
        // given
        String id = "example";

        // when
        PokemonDetail body = api.pokemonRetrieve(id).block();

        // then
        // TODO implement the pokemonRetrieveTest()
    }

    
    /**
     * List pokemon shapes
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonShapeListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonShapeSummaryList body = api.pokemonShapeList(limit, offset, q).block();

        // then
        // TODO implement the pokemonShapeListTest()
    }

    
    /**
     * Get pokemon shape
     *
     * Shapes used for sorting Pokémon in a Pokédex.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonShapeRetrieveTest() {
        // given
        String id = "example";

        // when
        PokemonShapeDetail body = api.pokemonShapeRetrieve(id).block();

        // then
        // TODO implement the pokemonShapeRetrieveTest()
    }

    
    /**
     * List pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonSpeciesListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedPokemonSpeciesSummaryList body = api.pokemonSpeciesList(limit, offset, q).block();

        // then
        // TODO implement the pokemonSpeciesListTest()
    }

    
    /**
     * Get pokemon species
     *
     * A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
     */
    @Test
    @Disabled("Not Implemented")
    public void pokemonSpeciesRetrieveTest() {
        // given
        String id = "example";

        // when
        PokemonSpeciesDetail body = api.pokemonSpeciesRetrieve(id).block();

        // then
        // TODO implement the pokemonSpeciesRetrieveTest()
    }

    
    /**
     * List stats
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     */
    @Test
    @Disabled("Not Implemented")
    public void statListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedStatSummaryList body = api.statList(limit, offset, q).block();

        // then
        // TODO implement the statListTest()
    }

    
    /**
     * Get stat
     *
     * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
     */
    @Test
    @Disabled("Not Implemented")
    public void statRetrieveTest() {
        // given
        String id = "example";

        // when
        StatDetail body = api.statRetrieve(id).block();

        // then
        // TODO implement the statRetrieveTest()
    }

    
    /**
     * List types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     */
    @Test
    @Disabled("Not Implemented")
    public void typeListTest() {
        // given
        Integer limit = 56;
        Integer offset = 56;
        String q = "example";

        // when
        PaginatedTypeSummaryList body = api.typeList(limit, offset, q).block();

        // then
        // TODO implement the typeListTest()
    }

    
    /**
     * Get types
     *
     * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
     */
    @Test
    @Disabled("Not Implemented")
    public void typeRetrieveTest() {
        // given
        String id = "example";

        // when
        TypeDetail body = api.typeRetrieve(id).block();

        // then
        // TODO implement the typeRetrieveTest()
    }

    
}
