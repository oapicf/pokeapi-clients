note
    description: "API tests for EVOLUTIONCHAIN_API"
    date: "$Date$"
    revision: "$Revision$"


class EVOLUTIONCHAIN_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_evolution_chain_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.evolution_chain_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_evolution_chain_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.evolution_chain_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: EVOLUTIONCHAIN_API
            -- Create an object instance of `EVOLUTIONCHAIN_API'.
        once
            create { EVOLUTIONCHAIN_API } Result
        end

end
