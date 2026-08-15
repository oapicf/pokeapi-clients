
/*
 * LocationAreaDetail_encounter_method_rates_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaDetail_encounter_method_rates_inner_H_
#define TINY_CPP_CLIENT_LocationAreaDetail_encounter_method_rates_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "LocationAreaDetail_encounter_method_rates_inner_version_details_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaDetail_encounter_method_rates_inner{
public:

    /*! \brief Constructor.
	 */
    LocationAreaDetail_encounter_method_rates_inner();
    LocationAreaDetail_encounter_method_rates_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaDetail_encounter_method_rates_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getEncounterMethod();

	/*! \brief Set 
	 */
	void setEncounterMethod(AbilityDetail_pokemon_inner_pokemon  encounter_method);
	/*! \brief Get 
	 */
	std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> getVersionDetails();

	/*! \brief Set 
	 */
	void setVersionDetails(std::list <LocationAreaDetail_encounter_method_rates_inner_version_details_inner> version_details);


    private:
    AbilityDetail_pokemon_inner_pokemon encounter_method;
    std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> version_details;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaDetail_encounter_method_rates_inner_H_ */
