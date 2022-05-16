note
    description: "API tests for ITEMCATEGORY_API"
    date: "$Date$"
    revision: "$Revision$"


class ITEMCATEGORY_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_item_category_list
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_limit: INTEGER_32
            l_offset: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.item_category_list(l_limit, l_offset)
            assert ("not_implemented", False)
        end

    test_item_category_read
            -- 
            --
            -- 
        local
            l_response: STRING_32
            l_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.item_category_read(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ITEMCATEGORY_API
            -- Create an object instance of `ITEMCATEGORY_API'.
        once
            create { ITEMCATEGORY_API } Result
        end

end
