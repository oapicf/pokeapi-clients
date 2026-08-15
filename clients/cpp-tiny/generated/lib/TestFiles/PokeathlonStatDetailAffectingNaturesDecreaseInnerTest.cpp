
#include "PokeathlonStatDetail_affecting_natures_decrease_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokeathlonStatDetail_affecting_natures_decrease_inner_max_change_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_change", 1
    };

    PokeathlonStatDetail_affecting_natures_decrease_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxChange());








}




void test_PokeathlonStatDetail_affecting_natures_decrease_inner_max_change_is_converted_to_json()
{
    bourne::json input =
    {
        "max_change", 1
    };

    PokeathlonStatDetail_affecting_natures_decrease_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_change"] == output["max_change"]);




}



