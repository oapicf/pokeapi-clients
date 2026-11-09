
#include "BerryFlavorBerryMap.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BerryFlavorBerryMap_potency_is_assigned_from_json()
{
    bourne::json input =
    {
        "potency", 1
    };

    BerryFlavorBerryMap obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPotency());








}




void test_BerryFlavorBerryMap_potency_is_converted_to_json()
{
    bourne::json input =
    {
        "potency", 1
    };

    BerryFlavorBerryMap obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["potency"] == output["potency"]);




}



