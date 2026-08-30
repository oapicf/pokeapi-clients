
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
#include "PalParkAreaDetail_pokemon_encounters_inner.h"
#include "PalParkAreaName.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<PalParkAreaName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<PalParkAreaName> names);
	/*! \brief Get 
	 */
	std::list<PalParkAreaDetail_pokemon_encounters_inner> getPokemonEncounters();

	/*! \brief Set 
	 */
	void setPokemonEncounters(std::list<PalParkAreaDetail_pokemon_encounters_inner> pokemon_encounters);


    private:
    int id{};
    std::string name{};
    std::list<PalParkAreaName> names;
    std::list<PalParkAreaDetail_pokemon_encounters_inner> pokemon_encounters;
};
}

#endif /* TINY_CPP_CLIENT_PalParkAreaDetail_H_ */
