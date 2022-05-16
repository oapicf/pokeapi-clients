note
    description: "API tests for ITEMPOCKET_API"
    date: "$Date$"
    revision: "$Revision$"


class ITEMPOCKET_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_item_pocket_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.item_pocket_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_item_pocket_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.item_pocket_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ITEMPOCKET_API
            -- Create an object instance of `ITEMPOCKET_API'.
        once
            create { ITEMPOCKET_API } Result
        end

end
