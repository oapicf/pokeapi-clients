//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_past_stat.dart';
import 'package:openapi/src/model/pokemon_cries.dart';
import 'package:openapi/src/model/pokemon_held_item_summary.dart';
import 'package:openapi/src/model/pokemon_move.dart';
import 'package:openapi/src/model/pokemon_sprites.dart';
import 'package:openapi/src/model/pokemon_game_index.dart';
import 'package:openapi/src/model/pokemon_type.dart';
import 'package:openapi/src/model/pokemon_past_ability.dart';
import 'package:openapi/src/model/pokemon_stat.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_past_type.dart';
import 'package:openapi/src/model/pokemon_form_summary.dart';
import 'package:openapi/src/model/pokemon_ability.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail.g.dart';

/// PokemonDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [baseExperience] - The base experience gained for defeating this Pokémon.
/// * [height] - The height of this Pokémon in decimetres.
/// * [isDefault] - Set for exactly one Pokémon used as the default for each species.
/// * [order] - Order for sorting. Almost national order, except families are grouped together.
/// * [weight] - The weight of this Pokémon in hectograms.
/// * [abilities] - A list of abilities this Pokémon could potentially have.
/// * [pastAbilities] - A list of details showing abilities this pokémon had in previous generations
/// * [forms] - A list of forms this Pokémon can take on.
/// * [gameIndices] - A list of game indices relevent to Pokémon item by generation.
/// * [heldItems] - A list of items this Pokémon may be holding when encountered.
/// * [locationAreaEncounters] - A link to a list of location areas, as well as encounter details pertaining to specific versions.
/// * [moves] - A list of moves along with learn methods and level details pertaining to specific version groups.
/// * [species] - The species this Pokémon belongs to.
/// * [sprites] - A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
/// * [cries] - A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
/// * [stats] - A list of base stat values for this Pokémon.
/// * [pastStats] - A list of details showing stats this pokémon had in previous generations
/// * [types] - A list of details showing types this Pokémon has.
/// * [pastTypes] - A list of details showing types this pokémon had in previous generations
@BuiltValue()
abstract class PokemonDetail implements Built<PokemonDetail, PokemonDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The base experience gained for defeating this Pokémon.
  @BuiltValueField(wireName: r'base_experience')
  int? get baseExperience;

  /// The height of this Pokémon in decimetres.
  @BuiltValueField(wireName: r'height')
  int? get height;

  /// Set for exactly one Pokémon used as the default for each species.
  @BuiltValueField(wireName: r'is_default')
  bool? get isDefault;

  /// Order for sorting. Almost national order, except families are grouped together.
  @BuiltValueField(wireName: r'order')
  int? get order;

  /// The weight of this Pokémon in hectograms.
  @BuiltValueField(wireName: r'weight')
  int? get weight;

  /// A list of abilities this Pokémon could potentially have.
  @BuiltValueField(wireName: r'abilities')
  BuiltList<PokemonAbility> get abilities;

  /// A list of details showing abilities this pokémon had in previous generations
  @BuiltValueField(wireName: r'past_abilities')
  BuiltList<PokemonPastAbility> get pastAbilities;

  /// A list of forms this Pokémon can take on.
  @BuiltValueField(wireName: r'forms')
  BuiltList<PokemonFormSummary> get forms;

  /// A list of game indices relevent to Pokémon item by generation.
  @BuiltValueField(wireName: r'game_indices')
  BuiltList<PokemonGameIndex> get gameIndices;

  /// A list of items this Pokémon may be holding when encountered.
  @BuiltValueField(wireName: r'held_items')
  BuiltList<PokemonHeldItemSummary> get heldItems;

  /// A link to a list of location areas, as well as encounter details pertaining to specific versions.
  @BuiltValueField(wireName: r'location_area_encounters')
  String get locationAreaEncounters;

  /// A list of moves along with learn methods and level details pertaining to specific version groups.
  @BuiltValueField(wireName: r'moves')
  BuiltList<PokemonMove> get moves;

  /// The species this Pokémon belongs to.
  @BuiltValueField(wireName: r'species')
  PokemonSpeciesSummary get species;

  /// A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
  @BuiltValueField(wireName: r'sprites')
  PokemonSprites get sprites;

  /// A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
  @BuiltValueField(wireName: r'cries')
  PokemonCries get cries;

  /// A list of base stat values for this Pokémon.
  @BuiltValueField(wireName: r'stats')
  BuiltList<PokemonStat> get stats;

  /// A list of details showing stats this pokémon had in previous generations
  @BuiltValueField(wireName: r'past_stats')
  BuiltList<PokemonPastStat> get pastStats;

  /// A list of details showing types this Pokémon has.
  @BuiltValueField(wireName: r'types')
  BuiltList<PokemonType> get types;

  /// A list of details showing types this pokémon had in previous generations
  @BuiltValueField(wireName: r'past_types')
  BuiltList<PokemonPastType> get pastTypes;

  PokemonDetail._();

  factory PokemonDetail([void updates(PokemonDetailBuilder b)]) = _$PokemonDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetail> get serializer => _$PokemonDetailSerializer();
}

class _$PokemonDetailSerializer implements PrimitiveSerializer<PokemonDetail> {
  @override
  final Iterable<Type> types = const [PokemonDetail, _$PokemonDetail];

  @override
  final String wireName = r'PokemonDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    if (object.baseExperience != null) {
      yield r'base_experience';
      yield serializers.serialize(
        object.baseExperience,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.height != null) {
      yield r'height';
      yield serializers.serialize(
        object.height,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.isDefault != null) {
      yield r'is_default';
      yield serializers.serialize(
        object.isDefault,
        specifiedType: const FullType(bool),
      );
    }
    if (object.order != null) {
      yield r'order';
      yield serializers.serialize(
        object.order,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.weight != null) {
      yield r'weight';
      yield serializers.serialize(
        object.weight,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'abilities';
    yield serializers.serialize(
      object.abilities,
      specifiedType: const FullType(BuiltList, [FullType(PokemonAbility)]),
    );
    yield r'past_abilities';
    yield serializers.serialize(
      object.pastAbilities,
      specifiedType: const FullType(BuiltList, [FullType(PokemonPastAbility)]),
    );
    yield r'forms';
    yield serializers.serialize(
      object.forms,
      specifiedType: const FullType(BuiltList, [FullType(PokemonFormSummary)]),
    );
    yield r'game_indices';
    yield serializers.serialize(
      object.gameIndices,
      specifiedType: const FullType(BuiltList, [FullType(PokemonGameIndex)]),
    );
    yield r'held_items';
    yield serializers.serialize(
      object.heldItems,
      specifiedType: const FullType(BuiltList, [FullType(PokemonHeldItemSummary)]),
    );
    yield r'location_area_encounters';
    yield serializers.serialize(
      object.locationAreaEncounters,
      specifiedType: const FullType(String),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(PokemonMove)]),
    );
    yield r'species';
    yield serializers.serialize(
      object.species,
      specifiedType: const FullType(PokemonSpeciesSummary),
    );
    yield r'sprites';
    yield serializers.serialize(
      object.sprites,
      specifiedType: const FullType(PokemonSprites),
    );
    yield r'cries';
    yield serializers.serialize(
      object.cries,
      specifiedType: const FullType(PokemonCries),
    );
    yield r'stats';
    yield serializers.serialize(
      object.stats,
      specifiedType: const FullType(BuiltList, [FullType(PokemonStat)]),
    );
    yield r'past_stats';
    yield serializers.serialize(
      object.pastStats,
      specifiedType: const FullType(BuiltList, [FullType(PokemonPastStat)]),
    );
    yield r'types';
    yield serializers.serialize(
      object.types,
      specifiedType: const FullType(BuiltList, [FullType(PokemonType)]),
    );
    yield r'past_types';
    yield serializers.serialize(
      object.pastTypes,
      specifiedType: const FullType(BuiltList, [FullType(PokemonPastType)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'base_experience':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.baseExperience = valueDes;
          break;
        case r'height':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.height = valueDes;
          break;
        case r'is_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isDefault = valueDes;
          break;
        case r'order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.order = valueDes;
          break;
        case r'weight':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.weight = valueDes;
          break;
        case r'abilities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonAbility)]),
          ) as BuiltList<PokemonAbility>;
          result.abilities.replace(valueDes);
          break;
        case r'past_abilities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonPastAbility)]),
          ) as BuiltList<PokemonPastAbility>;
          result.pastAbilities.replace(valueDes);
          break;
        case r'forms':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonFormSummary)]),
          ) as BuiltList<PokemonFormSummary>;
          result.forms.replace(valueDes);
          break;
        case r'game_indices':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonGameIndex)]),
          ) as BuiltList<PokemonGameIndex>;
          result.gameIndices.replace(valueDes);
          break;
        case r'held_items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonHeldItemSummary)]),
          ) as BuiltList<PokemonHeldItemSummary>;
          result.heldItems.replace(valueDes);
          break;
        case r'location_area_encounters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.locationAreaEncounters = valueDes;
          break;
        case r'moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonMove)]),
          ) as BuiltList<PokemonMove>;
          result.moves.replace(valueDes);
          break;
        case r'species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary;
          result.species.replace(valueDes);
          break;
        case r'sprites':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSprites),
          ) as PokemonSprites;
          result.sprites.replace(valueDes);
          break;
        case r'cries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonCries),
          ) as PokemonCries;
          result.cries.replace(valueDes);
          break;
        case r'stats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonStat)]),
          ) as BuiltList<PokemonStat>;
          result.stats.replace(valueDes);
          break;
        case r'past_stats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonPastStat)]),
          ) as BuiltList<PokemonPastStat>;
          result.pastStats.replace(valueDes);
          break;
        case r'types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonType)]),
          ) as BuiltList<PokemonType>;
          result.types.replace(valueDes);
          break;
        case r'past_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonPastType)]),
          ) as BuiltList<PokemonPastType>;
          result.pastTypes.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


