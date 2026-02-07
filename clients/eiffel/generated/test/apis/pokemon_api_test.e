note
    description: "API tests for POKEMON_API"
    date: "$Date$"
    revision: "$Revision$"


class POKEMON_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ability_list
            -- 
            --
            -- Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
        local
            l_response: PAGINATED_ABILITY_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.ability_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_ability_retrieve
            -- 
            --
            -- Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
        local
            l_response: ABILITY_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.ability_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_characteristic_list
            -- List charecterictics
            --
            -- Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
        local
            l_response: PAGINATED_CHARACTERISTIC_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.characteristic_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_characteristic_retrieve
            -- Get characteristic
            --
            -- Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
        local
            l_response: CHARACTERISTIC_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.characteristic_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_egg_group_list
            -- List egg groups
            --
            -- Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
        local
            l_response: PAGINATED_EGG_GROUP_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.egg_group_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_egg_group_retrieve
            -- Get egg group
            --
            -- Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
        local
            l_response: EGG_GROUP_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.egg_group_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_gender_list
            -- List genders
            --
            -- Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
        local
            l_response: PAGINATED_GENDER_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.gender_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_gender_retrieve
            -- Get gender
            --
            -- Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
        local
            l_response: GENDER_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.gender_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_growth_rate_list
            -- List growth rates
            --
            -- Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
        local
            l_response: PAGINATED_GROWTH_RATE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.growth_rate_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_growth_rate_retrieve
            -- Get growth rate
            --
            -- Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
        local
            l_response: GROWTH_RATE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.growth_rate_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_move_damage_class_list
            -- List move damage classes
            --
            -- Damage classes moves can have, e.g. physical, special, or non-damaging.
        local
            l_response: PAGINATED_MOVE_DAMAGE_CLASS_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.move_damage_class_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_move_damage_class_retrieve
            -- Get move damage class
            --
            -- Damage classes moves can have, e.g. physical, special, or non-damaging.
        local
            l_response: MOVE_DAMAGE_CLASS_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.move_damage_class_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_nature_list
            -- List natures
            --
            -- Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
        local
            l_response: PAGINATED_NATURE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.nature_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_nature_retrieve
            -- Get nature
            --
            -- Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
        local
            l_response: NATURE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.nature_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pokeathlon_stat_list
            -- List pokeathlon stats
            --
            -- Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
        local
            l_response: PAGINATED_POKEATHLON_STAT_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokeathlon_stat_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pokeathlon_stat_retrieve
            -- Get pokeathlon stat
            --
            -- Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
        local
            l_response: POKEATHLON_STAT_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokeathlon_stat_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pokemon_color_list
            -- List pokemon colors
            --
            -- Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
        local
            l_response: PAGINATED_POKEMON_COLOR_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_color_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pokemon_color_retrieve
            -- Get pokemon color
            --
            -- Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
        local
            l_response: POKEMON_COLOR_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_color_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pokemon_form_list
            -- List pokemon forms
            --
            -- Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
        local
            l_response: PAGINATED_POKEMON_FORM_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_form_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pokemon_form_retrieve
            -- Get pokemon form
            --
            -- Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
        local
            l_response: POKEMON_FORM_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_form_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pokemon_habitat_list
            -- List pokemom habitas
            --
            -- Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
        local
            l_response: PAGINATED_POKEMON_HABITAT_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_habitat_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pokemon_habitat_retrieve
            -- Get pokemom habita
            --
            -- Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
        local
            l_response: POKEMON_HABITAT_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_habitat_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pokemon_list
            -- List pokemon
            --
            -- Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
        local
            l_response: PAGINATED_POKEMON_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pokemon_retrieve
            -- Get pokemon
            --
            -- Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
        local
            l_response: POKEMON_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pokemon_shape_list
            -- List pokemon shapes
            --
            -- Shapes used for sorting Pokémon in a Pokédex.
        local
            l_response: PAGINATED_POKEMON_SHAPE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_shape_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pokemon_shape_retrieve
            -- Get pokemon shape
            --
            -- Shapes used for sorting Pokémon in a Pokédex.
        local
            l_response: POKEMON_SHAPE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_shape_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pokemon_species_list
            -- List pokemon species
            --
            -- A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
        local
            l_response: PAGINATED_POKEMON_SPECIES_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_species_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pokemon_species_retrieve
            -- Get pokemon species
            --
            -- A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
        local
            l_response: POKEMON_SPECIES_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_species_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_stat_list
            -- List stats
            --
            -- Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
        local
            l_response: PAGINATED_STAT_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.stat_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_stat_retrieve
            -- Get stat
            --
            -- Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
        local
            l_response: STAT_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.stat_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_type_list
            -- List types
            --
            -- Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
        local
            l_response: PAGINATED_TYPE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.type_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_type_retrieve
            -- Get types
            --
            -- Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
        local
            l_response: TYPE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.type_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: POKEMON_API
            -- Create an object instance of `POKEMON_API'.
        once
            create { POKEMON_API } Result
        end

end
