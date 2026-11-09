
/*
 * PokemonEvolution_known_move.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonEvolution_known_move_H_
#define TINY_CPP_CLIENT_PokemonEvolution_known_move_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonEvolution_known_move{
public:

    /*! \brief Constructor.
	 */
    PokemonEvolution_known_move();
    PokemonEvolution_known_move(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonEvolution_known_move();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonEvolution_known_move_H_ */
