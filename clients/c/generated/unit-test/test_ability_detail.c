#ifndef ability_detail_TEST
#define ability_detail_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_detail_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_detail.h"
ability_detail_t* instantiate_ability_detail(int include_optional);

#include "test_generation_summary.c"


ability_detail_t* instantiate_ability_detail(int include_optional) {
  ability_detail_t* ability_detail = NULL;
  if (include_optional) {
    ability_detail = ability_detail_create(
      56,
      "0",
      1,
       // false, not to have infinite recursion
      instantiate_generation_summary(0),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    ability_detail = ability_detail_create(
      56,
      "0",
      1,
      NULL,
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return ability_detail;
}


#ifdef ability_detail_MAIN

void test_ability_detail(int include_optional) {
    ability_detail_t* ability_detail_1 = instantiate_ability_detail(include_optional);

	cJSON* jsonability_detail_1 = ability_detail_convertToJSON(ability_detail_1);
	printf("ability_detail :\n%s\n", cJSON_Print(jsonability_detail_1));
	ability_detail_t* ability_detail_2 = ability_detail_parseFromJSON(jsonability_detail_1);
	cJSON* jsonability_detail_2 = ability_detail_convertToJSON(ability_detail_2);
	printf("repeating ability_detail:\n%s\n", cJSON_Print(jsonability_detail_2));
}

int main() {
  test_ability_detail(1);
  test_ability_detail(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_detail_MAIN
#endif // ability_detail_TEST
