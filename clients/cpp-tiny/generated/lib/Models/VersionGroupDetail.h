
/*
 * VersionGroupDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_VersionGroupDetail_H_
#define TINY_CPP_CLIENT_VersionGroupDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "GenerationSummary.h"
#include "VersionSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class VersionGroupDetail{
public:

    /*! \brief Constructor.
	 */
    VersionGroupDetail();
    VersionGroupDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~VersionGroupDetail();


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
	int getOrder();

	/*! \brief Set 
	 */
	void setOrder(int order);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary generation);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getMoveLearnMethods();

	/*! \brief Set 
	 */
	void setMoveLearnMethods(std::list<AbilityDetail_pokemon_inner_pokemon> move_learn_methods);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getPokedexes();

	/*! \brief Set 
	 */
	void setPokedexes(std::list<AbilityDetail_pokemon_inner_pokemon> pokedexes);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getRegions();

	/*! \brief Set 
	 */
	void setRegions(std::list<AbilityDetail_pokemon_inner_pokemon> regions);
	/*! \brief Get 
	 */
	std::list<VersionSummary> getVersions();

	/*! \brief Set 
	 */
	void setVersions(std::list<VersionSummary> versions);


    private:
    int id{};
    std::string name{};
    int order{};
    GenerationSummary generation;
    std::list<AbilityDetail_pokemon_inner_pokemon> move_learn_methods;
    std::list<AbilityDetail_pokemon_inner_pokemon> pokedexes;
    std::list<AbilityDetail_pokemon_inner_pokemon> regions;
    std::list<VersionSummary> versions;
};
}

#endif /* TINY_CPP_CLIENT_VersionGroupDetail_H_ */
