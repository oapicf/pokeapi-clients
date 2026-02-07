#ifndef contest_effect_flavor_text_TEST
#define contest_effect_flavor_text_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define contest_effect_flavor_text_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/contest_effect_flavor_text.h"
contest_effect_flavor_text_t* instantiate_contest_effect_flavor_text(int include_optional);

#include "test_language_summary.c"


contest_effect_flavor_text_t* instantiate_contest_effect_flavor_text(int include_optional) {
  contest_effect_flavor_text_t* contest_effect_flavor_text = NULL;
  if (include_optional) {
    contest_effect_flavor_text = contest_effect_flavor_text_create(
      "0",
       // false, not to have infinite recursion
      instantiate_language_summary(0)
    );
  } else {
    contest_effect_flavor_text = contest_effect_flavor_text_create(
      "0",
      NULL
    );
  }

  return contest_effect_flavor_text;
}


#ifdef contest_effect_flavor_text_MAIN

void test_contest_effect_flavor_text(int include_optional) {
    contest_effect_flavor_text_t* contest_effect_flavor_text_1 = instantiate_contest_effect_flavor_text(include_optional);

	cJSON* jsoncontest_effect_flavor_text_1 = contest_effect_flavor_text_convertToJSON(contest_effect_flavor_text_1);
	printf("contest_effect_flavor_text :\n%s\n", cJSON_Print(jsoncontest_effect_flavor_text_1));
	contest_effect_flavor_text_t* contest_effect_flavor_text_2 = contest_effect_flavor_text_parseFromJSON(jsoncontest_effect_flavor_text_1);
	cJSON* jsoncontest_effect_flavor_text_2 = contest_effect_flavor_text_convertToJSON(contest_effect_flavor_text_2);
	printf("repeating contest_effect_flavor_text:\n%s\n", cJSON_Print(jsoncontest_effect_flavor_text_2));
}

int main() {
  test_contest_effect_flavor_text(1);
  test_contest_effect_flavor_text(0);

  printf("Hello world \n");
  return 0;
}

#endif // contest_effect_flavor_text_MAIN
#endif // contest_effect_flavor_text_TEST
