note
    description: "API tests for GAMES_API"
    date: "$Date$"
    revision: "$Revision$"


class GAMES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_generation_list
            -- List genrations
            --
            -- A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
        local
            l_response: PAGINATED_GENERATION_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.generation_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_generation_retrieve
            -- Get genration
            --
            -- A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
        local
            l_response: GENERATION_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.generation_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_pokedex_list
            -- List pokedex
            --
            -- A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
        local
            l_response: PAGINATED_POKEDEX_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokedex_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_pokedex_retrieve
            -- Get pokedex
            --
            -- A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
        local
            l_response: POKEDEX_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokedex_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_version_group_list
            -- List version groups
            --
            -- Version groups categorize highly similar versions of the games.
        local
            l_response: PAGINATED_VERSION_GROUP_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.version_group_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_version_group_retrieve
            -- Get version group
            --
            -- Version groups categorize highly similar versions of the games.
        local
            l_response: VERSION_GROUP_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.version_group_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_version_list
            -- List versions
            --
            -- Versions of the games, e.g., Red, Blue or Yellow.
        local
            l_response: PAGINATED_VERSION_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.version_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_version_retrieve
            -- Get version
            --
            -- Versions of the games, e.g., Red, Blue or Yellow.
        local
            l_response: VERSION_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.version_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: GAMES_API
            -- Create an object instance of `GAMES_API'.
        once
            create { GAMES_API } Result
        end

end
