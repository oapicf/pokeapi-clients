
/*
 * PalParkAreaDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PalParkAreaDetail_H_
#define TINY_CPP_CLIENT_PalParkAreaDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PalParkAreaName.h"
#include "PalParkEncounter.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PalParkAreaDetail{
public:

    /*! \brief Constructor.
	 */
    PalParkAreaDetail();
    PalParkAreaDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PalParkAreaDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PalParkAreaName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<PalParkAreaName> names);
	/*! \brief Get A list of Pokémon encountered in thi pal park area along with details.
	 */
	std::list<PalParkEncounter> getPokemonEncounters();

	/*! \brief Set A list of Pokémon encountered in thi pal park area along with details.
	 */
	void setPokemonEncounters(std::list<PalParkEncounter> pokemon_encounters);


    private:
    int id{};
    std::string name{};
    std::list<PalParkAreaName> names;
    std::list<PalParkEncounter> pokemon_encounters;
};
}

#endif /* TINY_CPP_CLIENT_PalParkAreaDetail_H_ */
