note
    description: "API tests for ENCOUNTERMETHOD_API"
    date: "$Date$"
    revision: "$Revision$"


class ENCOUNTERMETHOD_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_encounter_method_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.encounter_method_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_encounter_method_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.encounter_method_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ENCOUNTERMETHOD_API
            -- Create an object instance of `ENCOUNTERMETHOD_API'.
        once
            create { ENCOUNTERMETHOD_API } Result
        end

end
