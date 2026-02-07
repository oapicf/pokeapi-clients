#ifndef ability_change_TEST
#define ability_change_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_change_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_change.h"
ability_change_t* instantiate_ability_change(int include_optional);

#include "test_version_group_summary.c"


ability_change_t* instantiate_ability_change(int include_optional) {
  ability_change_t* ability_change = NULL;
  if (include_optional) {
    ability_change = ability_change_create(
       // false, not to have infinite recursion
      instantiate_version_group_summary(0),
      list_createList()
    );
  } else {
    ability_change = ability_change_create(
      NULL,
      list_createList()
    );
  }

  return ability_change;
}


#ifdef ability_change_MAIN

void test_ability_change(int include_optional) {
    ability_change_t* ability_change_1 = instantiate_ability_change(include_optional);

	cJSON* jsonability_change_1 = ability_change_convertToJSON(ability_change_1);
	printf("ability_change :\n%s\n", cJSON_Print(jsonability_change_1));
	ability_change_t* ability_change_2 = ability_change_parseFromJSON(jsonability_change_1);
	cJSON* jsonability_change_2 = ability_change_convertToJSON(ability_change_2);
	printf("repeating ability_change:\n%s\n", cJSON_Print(jsonability_change_2));
}

int main() {
  test_ability_change(1);
  test_ability_change(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_change_MAIN
#endif // ability_change_TEST
