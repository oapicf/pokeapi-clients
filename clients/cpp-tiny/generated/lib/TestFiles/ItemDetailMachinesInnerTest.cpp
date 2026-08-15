
#include "ItemDetail_machines_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ItemDetail_machines_inner_machine_is_assigned_from_json()
{


    bourne::json input =
    {
        "machine", "hello"
    };

    ItemDetail_machines_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMachine().c_str());






}




void test_ItemDetail_machines_inner_machine_is_converted_to_json()
{

    bourne::json input =
    {
        "machine", "hello"
    };

    ItemDetail_machines_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["machine"] == output["machine"]);



}



