package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.MoveDamageClassSummary;
import org.openapitools.server.model.MoveSummary;
import org.openapitools.server.model.TypeGameIndex;
import org.openapitools.server.model.TypeGameSprite;
import org.openapitools.server.model.TypeName;
import org.openapitools.server.model.TypePastRelationships;
import org.openapitools.server.model.TypePokemon;
import org.openapitools.server.model.TypeRelationships;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Serializer for the Type resource
 */
public class TypeDetail   {

    private Integer id;
    private String name;
    private TypeRelationships damageRelations;
    private List<@Valid TypePastRelationships> pastDamageRelations = new ArrayList<>();
    private List<@Valid TypeGameIndex> gameIndices = new ArrayList<>();
    private GenerationSummary generation;
    private MoveDamageClassSummary moveDamageClass;
    private List<@Valid TypeName> names = new ArrayList<>();
    private List<@Valid TypePokemon> pokemon = new ArrayList<>();
    private List<@Valid MoveSummary> moves = new ArrayList<>();
    private Map<String, Map<String, TypeGameSprite>> sprites = new HashMap<>();

    /**
     * Default constructor.
     */
    public TypeDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create TypeDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param damageRelations A detail of how effective this type is toward others and vice versa.
     * @param pastDamageRelations A list of details of how effective this type was toward others and vice versa in previous generations
     * @param gameIndices A list of game indices relevent to this item by generation.
     * @param generation The generation this type was introduced in.
     * @param moveDamageClass The class of damage inflicted by this type.
     * @param names The name of this resource listed in different languages.
     * @param pokemon A list of details of Pokémon that have this type.
     * @param moves A list of moves that have this type.
     * @param sprites Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
     */
    public TypeDetail(
        Integer id, 
        String name, 
        TypeRelationships damageRelations, 
        List<@Valid TypePastRelationships> pastDamageRelations, 
        List<@Valid TypeGameIndex> gameIndices, 
        GenerationSummary generation, 
        MoveDamageClassSummary moveDamageClass, 
        List<@Valid TypeName> names, 
        List<@Valid TypePokemon> pokemon, 
        List<@Valid MoveSummary> moves, 
        Map<String, Map<String, TypeGameSprite>> sprites
    ) {
        this.id = id;
        this.name = name;
        this.damageRelations = damageRelations;
        this.pastDamageRelations = pastDamageRelations;
        this.gameIndices = gameIndices;
        this.generation = generation;
        this.moveDamageClass = moveDamageClass;
        this.names = names;
        this.pokemon = pokemon;
        this.moves = moves;
        this.sprites = sprites;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A detail of how effective this type is toward others and vice versa.
     * @return damageRelations
     */
    public TypeRelationships getDamageRelations() {
        return damageRelations;
    }

    public void setDamageRelations(TypeRelationships damageRelations) {
        this.damageRelations = damageRelations;
    }

    /**
     * A list of details of how effective this type was toward others and vice versa in previous generations
     * @return pastDamageRelations
     */
    public List<@Valid TypePastRelationships> getPastDamageRelations() {
        return pastDamageRelations;
    }

    public void setPastDamageRelations(List<@Valid TypePastRelationships> pastDamageRelations) {
        this.pastDamageRelations = pastDamageRelations;
    }

    /**
     * A list of game indices relevent to this item by generation.
     * @return gameIndices
     */
    public List<@Valid TypeGameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(List<@Valid TypeGameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    /**
     * The generation this type was introduced in.
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * The class of damage inflicted by this type.
     * @return moveDamageClass
     */
    public MoveDamageClassSummary getMoveDamageClass() {
        return moveDamageClass;
    }

    public void setMoveDamageClass(MoveDamageClassSummary moveDamageClass) {
        this.moveDamageClass = moveDamageClass;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid TypeName> getNames() {
        return names;
    }

    public void setNames(List<@Valid TypeName> names) {
        this.names = names;
    }

    /**
     * A list of details of Pokémon that have this type.
     * @return pokemon
     */
    public List<@Valid TypePokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<@Valid TypePokemon> pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * A list of moves that have this type.
     * @return moves
     */
    public List<@Valid MoveSummary> getMoves() {
        return moves;
    }

    public void setMoves(List<@Valid MoveSummary> moves) {
        this.moves = moves;
    }

    /**
     * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
     * @return sprites
     */
    public Map<String, Map<String, TypeGameSprite>> getSprites() {
        return sprites;
    }

    public void setSprites(Map<String, Map<String, TypeGameSprite>> sprites) {
        this.sprites = sprites;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TypeDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    damageRelations: ").append(toIndentedString(damageRelations)).append("\n");
        sb.append("    pastDamageRelations: ").append(toIndentedString(pastDamageRelations)).append("\n");
        sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    moveDamageClass: ").append(toIndentedString(moveDamageClass)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
        sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
        sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

