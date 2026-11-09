
/*
 * LocationAreaEncounterVersionDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaEncounterVersionDetail_H_
#define TINY_CPP_CLIENT_LocationAreaEncounterVersionDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "VersionSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaEncounterVersionDetail{
public:

    /*! \brief Constructor.
	 */
    LocationAreaEncounterVersionDetail();
    LocationAreaEncounterVersionDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaEncounterVersionDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The chance of an encounter to occur.
	 */
	int getRate();

	/*! \brief Set The chance of an encounter to occur.
	 */
	void setRate(int rate);
	/*! \brief Get The version of the game in which the encounter can occur with the given chance.
	 */
	VersionSummary getVersion();

	/*! \brief Set The version of the game in which the encounter can occur with the given chance.
	 */
	void setVersion(VersionSummary version);


    private:
    int rate{};
    VersionSummary version;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaEncounterVersionDetail_H_ */
