
/*
 * SuperContestEffectDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SuperContestEffectDetail_H_
#define TINY_CPP_CLIENT_SuperContestEffectDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveSummary.h"
#include "SuperContestEffectFlavorText.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SuperContestEffectDetail{
public:

    /*! \brief Constructor.
	 */
    SuperContestEffectDetail();
    SuperContestEffectDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SuperContestEffectDetail();


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
	/*! \brief Get The level of appeal this super contest effect has.
	 */
	int getAppeal();

	/*! \brief Set The level of appeal this super contest effect has.
	 */
	void setAppeal(int appeal);
	/*! \brief Get The flavor text of this super contest effect listed in different languages.
	 */
	std::list<SuperContestEffectFlavorText> getFlavorTextEntries();

	/*! \brief Set The flavor text of this super contest effect listed in different languages.
	 */
	void setFlavorTextEntries(std::list<SuperContestEffectFlavorText> flavor_text_entries);
	/*! \brief Get A list of moves that have the effect when used in super contests.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that have the effect when used in super contests.
	 */
	void setMoves(std::list<MoveSummary> moves);


    private:
    int id{};
    int appeal{};
    std::list<SuperContestEffectFlavorText> flavor_text_entries;
    std::list<MoveSummary> moves;
};
}

#endif /* TINY_CPP_CLIENT_SuperContestEffectDetail_H_ */
