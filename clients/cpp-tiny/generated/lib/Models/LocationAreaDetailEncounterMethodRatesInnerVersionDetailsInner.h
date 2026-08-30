
/*
 * LocationAreaDetail_encounter_method_rates_inner_version_details_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaDetail_encounter_method_rates_inner_version_details_inner_H_
#define TINY_CPP_CLIENT_LocationAreaDetail_encounter_method_rates_inner_version_details_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaDetail_encounter_method_rates_inner_version_details_inner{
public:

    /*! \brief Constructor.
	 */
    LocationAreaDetail_encounter_method_rates_inner_version_details_inner();
    LocationAreaDetail_encounter_method_rates_inner_version_details_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaDetail_encounter_method_rates_inner_version_details_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getRate();

	/*! \brief Set 
	 */
	void setRate(int rate);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getVersion();

	/*! \brief Set 
	 */
	void setVersion(AbilityDetail_pokemon_inner_pokemon version);


    private:
    int rate{};
    AbilityDetail_pokemon_inner_pokemon version;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaDetail_encounter_method_rates_inner_version_details_inner_H_ */
