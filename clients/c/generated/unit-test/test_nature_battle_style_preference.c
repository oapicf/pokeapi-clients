#ifndef nature_battle_style_preference_TEST
#define nature_battle_style_preference_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define nature_battle_style_preference_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/nature_battle_style_preference.h"
nature_battle_style_preference_t* instantiate_nature_battle_style_preference(int include_optional);

#include "test_move_battle_style_summary.c"


nature_battle_style_preference_t* instantiate_nature_battle_style_preference(int include_optional) {
  nature_battle_style_preference_t* nature_battle_style_preference = NULL;
  if (include_optional) {
    nature_battle_style_preference = nature_battle_style_preference_create(
      56,
      56,
       // false, not to have infinite recursion
      instantiate_move_battle_style_summary(0)
    );
  } else {
    nature_battle_style_preference = nature_battle_style_preference_create(
      56,
      56,
      NULL
    );
  }

  return nature_battle_style_preference;
}


#ifdef nature_battle_style_preference_MAIN

void test_nature_battle_style_preference(int include_optional) {
    nature_battle_style_preference_t* nature_battle_style_preference_1 = instantiate_nature_battle_style_preference(include_optional);

	cJSON* jsonnature_battle_style_preference_1 = nature_battle_style_preference_convertToJSON(nature_battle_style_preference_1);
	printf("nature_battle_style_preference :\n%s\n", cJSON_Print(jsonnature_battle_style_preference_1));
	nature_battle_style_preference_t* nature_battle_style_preference_2 = nature_battle_style_preference_parseFromJSON(jsonnature_battle_style_preference_1);
	cJSON* jsonnature_battle_style_preference_2 = nature_battle_style_preference_convertToJSON(nature_battle_style_preference_2);
	printf("repeating nature_battle_style_preference:\n%s\n", cJSON_Print(jsonnature_battle_style_preference_2));
}

int main() {
  test_nature_battle_style_preference(1);
  test_nature_battle_style_preference(0);

  printf("Hello world \n");
  return 0;
}

#endif // nature_battle_style_preference_MAIN
#endif // nature_battle_style_preference_TEST
