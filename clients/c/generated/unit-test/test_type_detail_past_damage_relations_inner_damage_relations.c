#ifndef type_detail_past_damage_relations_inner_damage_relations_TEST
#define type_detail_past_damage_relations_inner_damage_relations_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_detail_past_damage_relations_inner_damage_relations_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_detail_past_damage_relations_inner_damage_relations.h"
type_detail_past_damage_relations_inner_damage_relations_t* instantiate_type_detail_past_damage_relations_inner_damage_relations(int include_optional);



type_detail_past_damage_relations_inner_damage_relations_t* instantiate_type_detail_past_damage_relations_inner_damage_relations(int include_optional) {
  type_detail_past_damage_relations_inner_damage_relations_t* type_detail_past_damage_relations_inner_damage_relations = NULL;
  if (include_optional) {
    type_detail_past_damage_relations_inner_damage_relations = type_detail_past_damage_relations_inner_damage_relations_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    type_detail_past_damage_relations_inner_damage_relations = type_detail_past_damage_relations_inner_damage_relations_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return type_detail_past_damage_relations_inner_damage_relations;
}


#ifdef type_detail_past_damage_relations_inner_damage_relations_MAIN

void test_type_detail_past_damage_relations_inner_damage_relations(int include_optional) {
    type_detail_past_damage_relations_inner_damage_relations_t* type_detail_past_damage_relations_inner_damage_relations_1 = instantiate_type_detail_past_damage_relations_inner_damage_relations(include_optional);

	cJSON* jsontype_detail_past_damage_relations_inner_damage_relations_1 = type_detail_past_damage_relations_inner_damage_relations_convertToJSON(type_detail_past_damage_relations_inner_damage_relations_1);
	printf("type_detail_past_damage_relations_inner_damage_relations :\n%s\n", cJSON_Print(jsontype_detail_past_damage_relations_inner_damage_relations_1));
	type_detail_past_damage_relations_inner_damage_relations_t* type_detail_past_damage_relations_inner_damage_relations_2 = type_detail_past_damage_relations_inner_damage_relations_parseFromJSON(jsontype_detail_past_damage_relations_inner_damage_relations_1);
	cJSON* jsontype_detail_past_damage_relations_inner_damage_relations_2 = type_detail_past_damage_relations_inner_damage_relations_convertToJSON(type_detail_past_damage_relations_inner_damage_relations_2);
	printf("repeating type_detail_past_damage_relations_inner_damage_relations:\n%s\n", cJSON_Print(jsontype_detail_past_damage_relations_inner_damage_relations_2));
}

int main() {
  test_type_detail_past_damage_relations_inner_damage_relations(1);
  test_type_detail_past_damage_relations_inner_damage_relations(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_detail_past_damage_relations_inner_damage_relations_MAIN
#endif // type_detail_past_damage_relations_inner_damage_relations_TEST
