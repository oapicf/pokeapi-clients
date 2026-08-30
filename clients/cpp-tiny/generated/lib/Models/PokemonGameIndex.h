
/*
 * PokemonGameIndex.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonGameIndex_H_
#define TINY_CPP_CLIENT_PokemonGameIndex_H_


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

class PokemonGameIndex{
public:

    /*! \brief Constructor.
	 */
    PokemonGameIndex();
    PokemonGameIndex(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonGameIndex();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getGameIndex();

	/*! \brief Set 
	 */
	void setGameIndex(int game_index);
	/*! \brief Get 
	 */
	VersionSummary getVersion();

	/*! \brief Set 
	 */
	void setVersion(VersionSummary version);


    private:
    int game_index{};
    VersionSummary version;
};
}

#endif /* TINY_CPP_CLIENT_PokemonGameIndex_H_ */
