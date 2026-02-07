#ifndef ability_summary_TEST
#define ability_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ability_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ability_summary.h"
ability_summary_t* instantiate_ability_summary(int include_optional);



ability_summary_t* instantiate_ability_summary(int include_optional) {
  ability_summary_t* ability_summary = NULL;
  if (include_optional) {
    ability_summary = ability_summary_create(
      "0",
      "0"
    );
  } else {
    ability_summary = ability_summary_create(
      "0",
      "0"
    );
  }

  return ability_summary;
}


#ifdef ability_summary_MAIN

void test_ability_summary(int include_optional) {
    ability_summary_t* ability_summary_1 = instantiate_ability_summary(include_optional);

	cJSON* jsonability_summary_1 = ability_summary_convertToJSON(ability_summary_1);
	printf("ability_summary :\n%s\n", cJSON_Print(jsonability_summary_1));
	ability_summary_t* ability_summary_2 = ability_summary_parseFromJSON(jsonability_summary_1);
	cJSON* jsonability_summary_2 = ability_summary_convertToJSON(ability_summary_2);
	printf("repeating ability_summary:\n%s\n", cJSON_Print(jsonability_summary_2));
}

int main() {
  test_ability_summary(1);
  test_ability_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // ability_summary_MAIN
#endif // ability_summary_TEST
