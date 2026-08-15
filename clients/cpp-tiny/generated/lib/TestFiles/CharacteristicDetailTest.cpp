
#include "CharacteristicDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_CharacteristicDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    CharacteristicDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_CharacteristicDetail_gene_modulo_is_assigned_from_json()
{
    bourne::json input =
    {
        "gene_modulo", 1
    };

    CharacteristicDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGeneModulo());








}






void test_CharacteristicDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    CharacteristicDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_CharacteristicDetail_gene_modulo_is_converted_to_json()
{
    bourne::json input =
    {
        "gene_modulo", 1
    };

    CharacteristicDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["gene_modulo"] == output["gene_modulo"]);




}





