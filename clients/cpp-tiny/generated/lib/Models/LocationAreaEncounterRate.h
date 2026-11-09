
/*
 * LocationAreaEncounterRate.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaEncounterRate_H_
#define TINY_CPP_CLIENT_LocationAreaEncounterRate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EncounterMethodSummary.h"
#include "LocationAreaEncounterVersionDetail.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaEncounterRate{
public:

    /*! \brief Constructor.
	 */
    LocationAreaEncounterRate();
    LocationAreaEncounterRate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaEncounterRate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The method in which Pokémon may be encountered in an area..
	 */
	EncounterMethodSummary getEncounterMethod();

	/*! \brief Set The method in which Pokémon may be encountered in an area..
	 */
	void setEncounterMethod(EncounterMethodSummary encounter_method);
	/*! \brief Get The chance of the encounter to occur on a version of the game.
	 */
	std::list<LocationAreaEncounterVersionDetail> getVersionDetails();

	/*! \brief Set The chance of the encounter to occur on a version of the game.
	 */
	void setVersionDetails(std::list<LocationAreaEncounterVersionDetail> version_details);


    private:
    EncounterMethodSummary encounter_method;
    std::list<LocationAreaEncounterVersionDetail> version_details;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaEncounterRate_H_ */
