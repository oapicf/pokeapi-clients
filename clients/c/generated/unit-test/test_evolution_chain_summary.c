#ifndef evolution_chain_summary_TEST
#define evolution_chain_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define evolution_chain_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/evolution_chain_summary.h"
evolution_chain_summary_t* instantiate_evolution_chain_summary(int include_optional);



evolution_chain_summary_t* instantiate_evolution_chain_summary(int include_optional) {
  evolution_chain_summary_t* evolution_chain_summary = NULL;
  if (include_optional) {
    evolution_chain_summary = evolution_chain_summary_create(
      "0"
    );
  } else {
    evolution_chain_summary = evolution_chain_summary_create(
      "0"
    );
  }

  return evolution_chain_summary;
}


#ifdef evolution_chain_summary_MAIN

void test_evolution_chain_summary(int include_optional) {
    evolution_chain_summary_t* evolution_chain_summary_1 = instantiate_evolution_chain_summary(include_optional);

	cJSON* jsonevolution_chain_summary_1 = evolution_chain_summary_convertToJSON(evolution_chain_summary_1);
	printf("evolution_chain_summary :\n%s\n", cJSON_Print(jsonevolution_chain_summary_1));
	evolution_chain_summary_t* evolution_chain_summary_2 = evolution_chain_summary_parseFromJSON(jsonevolution_chain_summary_1);
	cJSON* jsonevolution_chain_summary_2 = evolution_chain_summary_convertToJSON(evolution_chain_summary_2);
	printf("repeating evolution_chain_summary:\n%s\n", cJSON_Print(jsonevolution_chain_summary_2));
}

int main() {
  test_evolution_chain_summary(1);
  test_evolution_chain_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // evolution_chain_summary_MAIN
#endif // evolution_chain_summary_TEST
