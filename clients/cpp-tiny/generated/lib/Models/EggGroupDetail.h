
/*
 * EggGroupDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EggGroupDetail_H_
#define TINY_CPP_CLIENT_EggGroupDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EggGroupDetail_pokemon_species_inner.h"
#include "EggGroupName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EggGroupDetail{
public:

    /*! \brief Constructor.
	 */
    EggGroupDetail();
    EggGroupDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EggGroupDetail();


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
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<EggGroupName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <EggGroupName> names);
	/*! \brief Get 
	 */
	std::list<EggGroupDetail_pokemon_species_inner> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list <EggGroupDetail_pokemon_species_inner> pokemon_species);


    private:
    int id{};
    std::string name{};
    std::list<EggGroupName> names;
    std::list<EggGroupDetail_pokemon_species_inner> pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_EggGroupDetail_H_ */
