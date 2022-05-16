note
    description: "API tests for CHARACTERISTIC_API"
    date: "$Date$"
    revision: "$Revision$"


class CHARACTERISTIC_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_characteristic_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.characteristic_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_characteristic_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.characteristic_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CHARACTERISTIC_API
            -- Create an object instance of `CHARACTERISTIC_API'.
        once
            create { CHARACTERISTIC_API } Result
        end

end
