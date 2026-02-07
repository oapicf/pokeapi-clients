#ifndef type_detail_TEST
#define type_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define type_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/type_detail.h"
type_detail_t* instantiate_type_detail(int include_optional);

#include "test_type_detail_damage_relations.c"
#include "test_generation_summary.c"
#include "test_move_damage_class_summary.c"


type_detail_t* instantiate_type_detail(int include_optional) {
  type_detail_t* type_detail = NULL;
  if (include_optional) {
    type_detail = type_detail_create(
      56,
      "0",
       // false, not to have infinite recursion
      instantiate_type_detail_damage_relations(0),
      list_createList(),
      list_createList(),
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
       // false, not to have infinite recursion
      instantiate_move_damage_class_summary(0),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    type_detail = type_detail_create(
      56,
      "0",
      NULL,
      list_createList(),
      list_createList(),
      NULL,
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return type_detail;
}


#ifdef type_detail_MAIN

void test_type_detail(int include_optional) {
    type_detail_t* type_detail_1 = instantiate_type_detail(include_optional);

	cJSON* jsontype_detail_1 = type_detail_convertToJSON(type_detail_1);
	printf("type_detail :\n%s\n", cJSON_Print(jsontype_detail_1));
	type_detail_t* type_detail_2 = type_detail_parseFromJSON(jsontype_detail_1);
	cJSON* jsontype_detail_2 = type_detail_convertToJSON(type_detail_2);
	printf("repeating type_detail:\n%s\n", cJSON_Print(jsontype_detail_2));
}

int main() {
  test_type_detail(1);
  test_type_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // type_detail_MAIN
#endif // type_detail_TEST
