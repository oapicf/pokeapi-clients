#ifndef super_contest_effect_flavor_text_TEST
#define super_contest_effect_flavor_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define super_contest_effect_flavor_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/super_contest_effect_flavor_text.h"
super_contest_effect_flavor_text_t* instantiate_super_contest_effect_flavor_text(int include_optional);

#include "test_language_summary.c"


super_contest_effect_flavor_text_t* instantiate_super_contest_effect_flavor_text(int include_optional) {
  super_contest_effect_flavor_text_t* super_contest_effect_flavor_text = NULL;
  if (include_optional) {
    super_contest_effect_flavor_text = super_contest_effect_flavor_text_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    super_contest_effect_flavor_text = super_contest_effect_flavor_text_create(
      "0",
      NULL
    );
  }

  return super_contest_effect_flavor_text;
}


#ifdef super_contest_effect_flavor_text_MAIN

void test_super_contest_effect_flavor_text(int include_optional) {
    super_contest_effect_flavor_text_t* super_contest_effect_flavor_text_1 = instantiate_super_contest_effect_flavor_text(include_optional);

	cJSON* jsonsuper_contest_effect_flavor_text_1 = super_contest_effect_flavor_text_convertToJSON(super_contest_effect_flavor_text_1);
	printf("super_contest_effect_flavor_text :\n%s\n", cJSON_Print(jsonsuper_contest_effect_flavor_text_1));
	super_contest_effect_flavor_text_t* super_contest_effect_flavor_text_2 = super_contest_effect_flavor_text_parseFromJSON(jsonsuper_contest_effect_flavor_text_1);
	cJSON* jsonsuper_contest_effect_flavor_text_2 = super_contest_effect_flavor_text_convertToJSON(super_contest_effect_flavor_text_2);
	printf("repeating super_contest_effect_flavor_text:\n%s\n", cJSON_Print(jsonsuper_contest_effect_flavor_text_2));
}

int main() {
  test_super_contest_effect_flavor_text(1);
  test_super_contest_effect_flavor_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // super_contest_effect_flavor_text_MAIN
#endif // super_contest_effect_flavor_text_TEST
