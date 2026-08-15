
#include "EvolutionChainDetail_chain.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_EvolutionChainDetail_chain_is_baby_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_baby", true
    };

    EvolutionChainDetail_chain obj(input.dump());

    TEST_ASSERT(true == obj.isIsBaby());




}






void test_EvolutionChainDetail_chain_is_baby_is_converted_to_json()
{


    bourne::json input =
    {
        "is_baby", true
    };

    EvolutionChainDetail_chain obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_baby"] == output["is_baby"]);


}



