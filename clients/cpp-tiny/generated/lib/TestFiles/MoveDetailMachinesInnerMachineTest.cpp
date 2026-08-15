
#include "MoveDetail_machines_inner_machine.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MoveDetail_machines_inner_machine_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    MoveDetail_machines_inner_machine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_MoveDetail_machines_inner_machine_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    MoveDetail_machines_inner_machine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


