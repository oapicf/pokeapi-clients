#ifndef contest_effect_summary_TEST
#define contest_effect_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define contest_effect_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/contest_effect_summary.h"
contest_effect_summary_t* instantiate_contest_effect_summary(int include_optional);



contest_effect_summary_t* instantiate_contest_effect_summary(int include_optional) {
  contest_effect_summary_t* contest_effect_summary = NULL;
  if (include_optional) {
    contest_effect_summary = contest_effect_summary_create(
      "0"
    );
  } else {
    contest_effect_summary = contest_effect_summary_create(
      "0"
    );
  }

  return contest_effect_summary;
}


#ifdef contest_effect_summary_MAIN

void test_contest_effect_summary(int include_optional) {
    contest_effect_summary_t* contest_effect_summary_1 = instantiate_contest_effect_summary(include_optional);

	cJSON* jsoncontest_effect_summary_1 = contest_effect_summary_convertToJSON(contest_effect_summary_1);
	printf("contest_effect_summary :\n%s\n", cJSON_Print(jsoncontest_effect_summary_1));
	contest_effect_summary_t* contest_effect_summary_2 = contest_effect_summary_parseFromJSON(jsoncontest_effect_summary_1);
	cJSON* jsoncontest_effect_summary_2 = contest_effect_summary_convertToJSON(contest_effect_summary_2);
	printf("repeating contest_effect_summary:\n%s\n", cJSON_Print(jsoncontest_effect_summary_2));
}

int main() {
  test_contest_effect_summary(1);
  test_contest_effect_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // contest_effect_summary_MAIN
#endif // contest_effect_summary_TEST
