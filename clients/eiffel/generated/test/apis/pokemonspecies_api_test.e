note
    description: "API tests for POKEMONSPECIES_API"
    date: "$Date$"
    revision: "$Revision$"


class POKEMONSPECIES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_pokemon_species_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_species_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_pokemon_species_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_species_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: POKEMONSPECIES_API
            -- Create an object instance of `POKEMONSPECIES_API'.
        once
            create { POKEMONSPECIES_API } Result
        end

end
