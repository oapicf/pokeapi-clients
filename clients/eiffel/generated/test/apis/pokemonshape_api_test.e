note
    description: "API tests for POKEMONSHAPE_API"
    date: "$Date$"
    revision: "$Revision$"


class POKEMONSHAPE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_pokemon_shape_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokemon_shape_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_pokemon_shape_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokemon_shape_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: POKEMONSHAPE_API
            -- Create an object instance of `POKEMONSHAPE_API'.
        once
            create { POKEMONSHAPE_API } Result
        end

end
