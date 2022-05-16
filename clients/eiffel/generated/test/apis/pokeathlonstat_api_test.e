note
    description: "API tests for POKEATHLONSTAT_API"
    date: "$Date$"
    revision: "$Revision$"


class POKEATHLONSTAT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_pokeathlon_stat_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.pokeathlon_stat_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_pokeathlon_stat_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.pokeathlon_stat_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: POKEATHLONSTAT_API
            -- Create an object instance of `POKEATHLONSTAT_API'.
        once
            create { POKEATHLONSTAT_API } Result
        end

end
