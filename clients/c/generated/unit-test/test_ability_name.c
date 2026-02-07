#ifndef ability_name_TEST
#define ability_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_name.h"
ability_name_t* instantiate_ability_name(int include_optional);

#include "test_language_summary.c"


ability_name_t* instantiate_ability_name(int include_optional) {
  ability_name_t* ability_name = NULL;
  if (include_optional) {
    ability_name = ability_name_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    ability_name = ability_name_create(
      "0",
      NULL
    );
  }

  return ability_name;
}


#ifdef ability_name_MAIN

void test_ability_name(int include_optional) {
    ability_name_t* ability_name_1 = instantiate_ability_name(include_optional);

	cJSON* jsonability_name_1 = ability_name_convertToJSON(ability_name_1);
	printf("ability_name :\n%s\n", cJSON_Print(jsonability_name_1));
	ability_name_t* ability_name_2 = ability_name_parseFromJSON(jsonability_name_1);
	cJSON* jsonability_name_2 = ability_name_convertToJSON(ability_name_2);
	printf("repeating ability_name:\n%s\n", cJSON_Print(jsonability_name_2));
}

int main() {
  test_ability_name(1);
  test_ability_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_name_MAIN
#endif // ability_name_TEST
