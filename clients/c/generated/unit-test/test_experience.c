#ifndef experience_TEST
#define experience_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define experience_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/experience.h"
experience_t* instantiate_experience(int include_optional);



experience_t* instantiate_experience(int include_optional) {
  experience_t* experience = NULL;
  if (include_optional) {
    experience = experience_create(
      56,
      56
    );
  } else {
    experience = experience_create(
      56,
      56
    );
  }

  return experience;
}


#ifdef experience_MAIN

void test_experience(int include_optional) {
    experience_t* experience_1 = instantiate_experience(include_optional);

	cJSON* jsonexperience_1 = experience_convertToJSON(experience_1);
	printf("experience :\n%s\n", cJSON_Print(jsonexperience_1));
	experience_t* experience_2 = experience_parseFromJSON(jsonexperience_1);
	cJSON* jsonexperience_2 = experience_convertToJSON(experience_2);
	printf("repeating experience:\n%s\n", cJSON_Print(jsonexperience_2));
}

int main() {
  test_experience(1);
  test_experience(0);

  printf("Hello world \n");
  return 0;
}

#endif // experience_MAIN
#endif // experience_TEST
