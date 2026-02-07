note
    description: "API tests for ITEMS_API"
    date: "$Date$"
    revision: "$Revision$"


class ITEMS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_item_attribute_list
            -- List item attributes
            --
            -- Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
        local
            l_response: PAGINATED_ITEM_ATTRIBUTE_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.item_attribute_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_item_attribute_retrieve
            -- Get item attribute
            --
            -- Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
        local
            l_response: ITEM_ATTRIBUTE_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.item_attribute_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_item_category_list
            -- List item categories
            --
            -- Item categories determine where items will be placed in the players bag.
        local
            l_response: PAGINATED_ITEM_CATEGORY_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.item_category_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_item_category_retrieve
            -- Get item category
            --
            -- Item categories determine where items will be placed in the players bag.
        local
            l_response: ITEM_CATEGORY_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.item_category_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_item_fling_effect_list
            -- List item fling effects
            --
            -- The various effects of the move\&quot;Fling\&quot; when used with different items.
        local
            l_response: PAGINATED_ITEM_FLING_EFFECT_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.item_fling_effect_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_item_fling_effect_retrieve
            -- Get item fling effect
            --
            -- The various effects of the move\&quot;Fling\&quot; when used with different items.
        local
            l_response: ITEM_FLING_EFFECT_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.item_fling_effect_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_item_list
            -- List items
            --
            -- An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
        local
            l_response: PAGINATED_ITEM_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.item_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_item_pocket_list
            -- List item pockets
            --
            -- Pockets within the players bag used for storing items by category.
        local
            l_response: PAGINATED_ITEM_POCKET_SUMMARY_LIST
            l_limit: INTEGER_32
            l_offset: INTEGER_32
            l_q: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.item_pocket_list(l_limit, l_offset, l_q)
            assert ("not_implemented", False)
        end

    test_item_pocket_retrieve
            -- Get item pocket
            --
            -- Pockets within the players bag used for storing items by category.
        local
            l_response: ITEM_POCKET_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.item_pocket_retrieve(l_id)
            assert ("not_implemented", False)
        end

    test_item_retrieve
            -- Get item
            --
            -- An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
        local
            l_response: ITEM_DETAIL
            l_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_id

            -- l_response := api.item_retrieve(l_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ITEMS_API
            -- Create an object instance of `ITEMS_API'.
        once
            create { ITEMS_API } Result
        end

end
