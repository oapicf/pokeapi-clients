#ifndef ability_flavor_text_TEST
#define ability_flavor_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_flavor_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_flavor_text.h"
ability_flavor_text_t* instantiate_ability_flavor_text(int include_optional);

#include "test_language_summary.c"
#include "test_version_group_summary.c"


ability_flavor_text_t* instantiate_ability_flavor_text(int include_optional) {
  ability_flavor_text_t* ability_flavor_text = NULL;
  if (include_optional) {
    ability_flavor_text = ability_flavor_text_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0),
       // false, not to have infinite recursion
      instantiate_version_group_summary(0)
    );
  } else {
    ability_flavor_text = ability_flavor_text_create(
      "0",
      NULL,
      NULL
    );
  }

  return ability_flavor_text;
}


#ifdef ability_flavor_text_MAIN

void test_ability_flavor_text(int include_optional) {
    ability_flavor_text_t* ability_flavor_text_1 = instantiate_ability_flavor_text(include_optional);

	cJSON* jsonability_flavor_text_1 = ability_flavor_text_convertToJSON(ability_flavor_text_1);
	printf("ability_flavor_text :\n%s\n", cJSON_Print(jsonability_flavor_text_1));
	ability_flavor_text_t* ability_flavor_text_2 = ability_flavor_text_parseFromJSON(jsonability_flavor_text_1);
	cJSON* jsonability_flavor_text_2 = ability_flavor_text_convertToJSON(ability_flavor_text_2);
	printf("repeating ability_flavor_text:\n%s\n", cJSON_Print(jsonability_flavor_text_2));
}

int main() {
  test_ability_flavor_text(1);
  test_ability_flavor_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_flavor_text_MAIN
#endif // ability_flavor_text_TEST
