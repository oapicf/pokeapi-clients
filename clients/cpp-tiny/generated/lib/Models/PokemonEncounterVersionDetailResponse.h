
/*
 * PokemonEncounterVersionDetailResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonEncounterVersionDetailResponse_H_
#define TINY_CPP_CLIENT_PokemonEncounterVersionDetailResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonEncounterDetailResponse.h"
#include "VersionSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonEncounterVersionDetailResponse{
public:

    /*! \brief Constructor.
	 */
    PokemonEncounterVersionDetailResponse();
    PokemonEncounterVersionDetailResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonEncounterVersionDetailResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The game version this encounter happens in.
	 */
	VersionSummary getVersion();

	/*! \brief Set The game version this encounter happens in.
	 */
	void setVersion(VersionSummary version);
	/*! \brief Get The total percentage of all encounter potential.
	 */
	int getMaxChance();

	/*! \brief Set The total percentage of all encounter potential.
	 */
	void setMaxChance(int max_chance);
	/*! \brief Get A list of encounters and their specifics.
	 */
	std::list<PokemonEncounterDetailResponse> getEncounterDetails();

	/*! \brief Set A list of encounters and their specifics.
	 */
	void setEncounterDetails(std::list<PokemonEncounterDetailResponse> encounter_details);


    private:
    VersionSummary version;
    int max_chance{};
    std::list<PokemonEncounterDetailResponse> encounter_details;
};
}

#endif /* TINY_CPP_CLIENT_PokemonEncounterVersionDetailResponse_H_ */
