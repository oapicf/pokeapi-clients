#ifndef ability_change_effect_text_TEST
#define ability_change_effect_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_change_effect_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_change_effect_text.h"
ability_change_effect_text_t* instantiate_ability_change_effect_text(int include_optional);

#include "test_language_summary.c"


ability_change_effect_text_t* instantiate_ability_change_effect_text(int include_optional) {
  ability_change_effect_text_t* ability_change_effect_text = NULL;
  if (include_optional) {
    ability_change_effect_text = ability_change_effect_text_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    ability_change_effect_text = ability_change_effect_text_create(
      "0",
      NULL
    );
  }

  return ability_change_effect_text;
}


#ifdef ability_change_effect_text_MAIN

void test_ability_change_effect_text(int include_optional) {
    ability_change_effect_text_t* ability_change_effect_text_1 = instantiate_ability_change_effect_text(include_optional);

	cJSON* jsonability_change_effect_text_1 = ability_change_effect_text_convertToJSON(ability_change_effect_text_1);
	printf("ability_change_effect_text :\n%s\n", cJSON_Print(jsonability_change_effect_text_1));
	ability_change_effect_text_t* ability_change_effect_text_2 = ability_change_effect_text_parseFromJSON(jsonability_change_effect_text_1);
	cJSON* jsonability_change_effect_text_2 = ability_change_effect_text_convertToJSON(ability_change_effect_text_2);
	printf("repeating ability_change_effect_text:\n%s\n", cJSON_Print(jsonability_change_effect_text_2));
}

int main() {
  test_ability_change_effect_text(1);
  test_ability_change_effect_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_change_effect_text_MAIN
#endif // ability_change_effect_text_TEST
