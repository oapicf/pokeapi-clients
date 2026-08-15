
#include "ItemGameIndex.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ItemGameIndex_game_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "game_index", 1
    };

    ItemGameIndex obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGameIndex());








}




void test_ItemGameIndex_game_index_is_converted_to_json()
{
    bourne::json input =
    {
        "game_index", 1
    };

    ItemGameIndex obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["game_index"] == output["game_index"]);




}



