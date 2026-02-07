#ifndef super_contest_effect_summary_TEST
#define super_contest_effect_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define super_contest_effect_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/super_contest_effect_summary.h"
super_contest_effect_summary_t* instantiate_super_contest_effect_summary(int include_optional);



super_contest_effect_summary_t* instantiate_super_contest_effect_summary(int include_optional) {
  super_contest_effect_summary_t* super_contest_effect_summary = NULL;
  if (include_optional) {
    super_contest_effect_summary = super_contest_effect_summary_create(
      "0"
    );
  } else {
    super_contest_effect_summary = super_contest_effect_summary_create(
      "0"
    );
  }

  return super_contest_effect_summary;
}


#ifdef super_contest_effect_summary_MAIN

void test_super_contest_effect_summary(int include_optional) {
    super_contest_effect_summary_t* super_contest_effect_summary_1 = instantiate_super_contest_effect_summary(include_optional);

	cJSON* jsonsuper_contest_effect_summary_1 = super_contest_effect_summary_convertToJSON(super_contest_effect_summary_1);
	printf("super_contest_effect_summary :\n%s\n", cJSON_Print(jsonsuper_contest_effect_summary_1));
	super_contest_effect_summary_t* super_contest_effect_summary_2 = super_contest_effect_summary_parseFromJSON(jsonsuper_contest_effect_summary_1);
	cJSON* jsonsuper_contest_effect_summary_2 = super_contest_effect_summary_convertToJSON(super_contest_effect_summary_2);
	printf("repeating super_contest_effect_summary:\n%s\n", cJSON_Print(jsonsuper_contest_effect_summary_2));
}

int main() {
  test_super_contest_effect_summary(1);
  test_super_contest_effect_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // super_contest_effect_summary_MAIN
#endif // super_contest_effect_summary_TEST
