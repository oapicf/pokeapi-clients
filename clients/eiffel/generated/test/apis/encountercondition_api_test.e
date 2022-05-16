note
    description: "API tests for ENCOUNTERCONDITION_API"
    date: "$Date$"
    revision: "$Revision$"


class ENCOUNTERCONDITION_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_encounter_condition_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.encounter_condition_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_encounter_condition_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.encounter_condition_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ENCOUNTERCONDITION_API
            -- Create an object instance of `ENCOUNTERCONDITION_API'.
        once
            create { ENCOUNTERCONDITION_API } Result
        end

end
