//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_detail_cries.dart';
import 'package:openapi/src/model/pokemon_game_index.dart';
import 'package:openapi/src/model/pokemon_detail_held_items.dart';
import 'package:openapi/src/model/pokemon_detail_moves_inner.dart';
import 'package:openapi/src/model/pokemon_stat.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_detail_sprites.dart';
import 'package:openapi/src/model/pokemon_detail_abilities_inner.dart';
import 'package:openapi/src/model/pokemon_detail_types_inner.dart';
import 'package:openapi/src/model/pokemon_form_summary.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:openapi/src/model/pokemon_detail_past_abilities_inner.dart';
import 'package:openapi/src/model/pokemon_detail_past_types_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail.g.dart';

/// PokemonDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [baseExperience] 
/// * [height] 
/// * [isDefault] 
/// * [order] 
/// * [weight] 
/// * [abilities] 
/// * [pastAbilities] 
/// * [forms] 
/// * [gameIndices] 
/// * [heldItems] 
/// * [locationAreaEncounters] 
/// * [moves] 
/// * [species] 
/// * [sprites] 
/// * [cries] 
/// * [stats] 
/// * [types] 
/// * [pastTypes] 
@BuiltValue()
abstract class PokemonDetail implements Built<PokemonDetail, PokemonDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'base_experience')
  int? get baseExperience;

  @BuiltValueField(wireName: r'height')
  int? get height;

  @BuiltValueField(wireName: r'is_default')
  bool? get isDefault;

  @BuiltValueField(wireName: r'order')
  int? get order;

  @BuiltValueField(wireName: r'weight')
  int? get weight;

  @BuiltValueField(wireName: r'abilities')
  BuiltList<PokemonDetailAbilitiesInner> get abilities;

  @BuiltValueField(wireName: r'past_abilities')
  BuiltList<PokemonDetailPastAbilitiesInner> get pastAbilities;

  @BuiltValueField(wireName: r'forms')
  BuiltList<PokemonFormSummary> get forms;

  @BuiltValueField(wireName: r'game_indices')
  BuiltList<PokemonGameIndex> get gameIndices;

  @BuiltValueField(wireName: r'held_items')
  PokemonDetailHeldItems get heldItems;

  @BuiltValueField(wireName: r'location_area_encounters')
  String get locationAreaEncounters;

  @BuiltValueField(wireName: r'moves')
  BuiltList<PokemonDetailMovesInner> get moves;

  @BuiltValueField(wireName: r'species')
  PokemonSpeciesSummary get species;

  @BuiltValueField(wireName: r'sprites')
  PokemonDetailSprites get sprites;

  @BuiltValueField(wireName: r'cries')
  PokemonDetailCries get cries;

  @BuiltValueField(wireName: r'stats')
  BuiltList<PokemonStat> get stats;

  @BuiltValueField(wireName: r'types')
  BuiltList<PokemonDetailTypesInner> get types;

  @BuiltValueField(wireName: r'past_types')
  BuiltList<PokemonDetailPastTypesInner> get pastTypes;

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
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailAbilitiesInner)]),
    );
    yield r'past_abilities';
    yield serializers.serialize(
      object.pastAbilities,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailPastAbilitiesInner)]),
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
      specifiedType: const FullType(PokemonDetailHeldItems),
    );
    yield r'location_area_encounters';
    yield serializers.serialize(
      object.locationAreaEncounters,
      specifiedType: const FullType(String),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailMovesInner)]),
    );
    yield r'species';
    yield serializers.serialize(
      object.species,
      specifiedType: const FullType(PokemonSpeciesSummary),
    );
    yield r'sprites';
    yield serializers.serialize(
      object.sprites,
      specifiedType: const FullType(PokemonDetailSprites),
    );
    yield r'cries';
    yield serializers.serialize(
      object.cries,
      specifiedType: const FullType(PokemonDetailCries),
    );
    yield r'stats';
    yield serializers.serialize(
      object.stats,
      specifiedType: const FullType(BuiltList, [FullType(PokemonStat)]),
    );
    yield r'types';
    yield serializers.serialize(
      object.types,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailTypesInner)]),
    );
    yield r'past_types';
    yield serializers.serialize(
      object.pastTypes,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailPastTypesInner)]),
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
            specifiedType: const FullType(bool),
          ) as bool;
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
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailAbilitiesInner)]),
          ) as BuiltList<PokemonDetailAbilitiesInner>;
          result.abilities.replace(valueDes);
          break;
        case r'past_abilities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailPastAbilitiesInner)]),
          ) as BuiltList<PokemonDetailPastAbilitiesInner>;
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
            specifiedType: const FullType(PokemonDetailHeldItems),
          ) as PokemonDetailHeldItems;
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
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailMovesInner)]),
          ) as BuiltList<PokemonDetailMovesInner>;
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
            specifiedType: const FullType(PokemonDetailSprites),
          ) as PokemonDetailSprites;
          result.sprites = valueDes;
          break;
        case r'cries':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonDetailCries),
          ) as PokemonDetailCries;
          result.cries.replace(valueDes);
          break;
        case r'stats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonStat)]),
          ) as BuiltList<PokemonStat>;
          result.stats.replace(valueDes);
          break;
        case r'types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailTypesInner)]),
          ) as BuiltList<PokemonDetailTypesInner>;
          result.types.replace(valueDes);
          break;
        case r'past_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailPastTypesInner)]),
          ) as BuiltList<PokemonDetailPastTypesInner>;
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

