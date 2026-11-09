
/*
 * PokemonEncounterResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonEncounterResponse_H_
#define TINY_CPP_CLIENT_PokemonEncounterResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LocationAreaSummary.h"
#include "PokemonEncounterVersionDetailResponse.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonEncounterResponse{
public:

    /*! \brief Constructor.
	 */
    PokemonEncounterResponse();
    PokemonEncounterResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonEncounterResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The location area the referenced Pokémon can be encountered in.
	 */
	LocationAreaSummary getLocationArea();

	/*! \brief Set The location area the referenced Pokémon can be encountered in.
	 */
	void setLocationArea(LocationAreaSummary location_area);
	/*! \brief Get A list of versions and encounters with the referenced Pokémon that might happen.
	 */
	std::list<PokemonEncounterVersionDetailResponse> getVersionDetails();

	/*! \brief Set A list of versions and encounters with the referenced Pokémon that might happen.
	 */
	void setVersionDetails(std::list<PokemonEncounterVersionDetailResponse> version_details);


    private:
    LocationAreaSummary location_area;
    std::list<PokemonEncounterVersionDetailResponse> version_details;
};
}

#endif /* TINY_CPP_CLIENT_PokemonEncounterResponse_H_ */
