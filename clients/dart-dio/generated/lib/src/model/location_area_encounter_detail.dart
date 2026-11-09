//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/encounter_method_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/encounter_condition_value_summary.dart';
import 'package:openapi/src/model/encounter_pokemon_detail.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_encounter_detail.g.dart';

/// LocationAreaEncounterDetail
///
/// Properties:
/// * [minLevel] - The lowest level the Pokémon could be encountered at.
/// * [maxLevel] - The highest level the Pokémon could be encountered at.
/// * [chance] - Percent chance that this encounter will occur.
/// * [method] - The method by which this encounter happens.
/// * [conditionValues] - A list of condition values that must be in effect for this encounter to occur.
/// * [pokemonDetails] - Additional properties of the encountered Pokémon, or null if unspecified.
@BuiltValue()
abstract class LocationAreaEncounterDetail implements Built<LocationAreaEncounterDetail, LocationAreaEncounterDetailBuilder> {
  /// The lowest level the Pokémon could be encountered at.
  @BuiltValueField(wireName: r'min_level')
  int get minLevel;

  /// The highest level the Pokémon could be encountered at.
  @BuiltValueField(wireName: r'max_level')
  int get maxLevel;

  /// Percent chance that this encounter will occur.
  @BuiltValueField(wireName: r'chance')
  int? get chance;

  /// The method by which this encounter happens.
  @BuiltValueField(wireName: r'method')
  EncounterMethodSummary? get method;

  /// A list of condition values that must be in effect for this encounter to occur.
  @BuiltValueField(wireName: r'condition_values')
  BuiltList<EncounterConditionValueSummary> get conditionValues;

  /// Additional properties of the encountered Pokémon, or null if unspecified.
  @BuiltValueField(wireName: r'pokemon_details')
  EncounterPokemonDetail? get pokemonDetails;

  LocationAreaEncounterDetail._();

  factory LocationAreaEncounterDetail([void updates(LocationAreaEncounterDetailBuilder b)]) = _$LocationAreaEncounterDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaEncounterDetailBuilder b) => b
      ..chance = 0;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaEncounterDetail> get serializer => _$LocationAreaEncounterDetailSerializer();
}

class _$LocationAreaEncounterDetailSerializer implements PrimitiveSerializer<LocationAreaEncounterDetail> {
  @override
  final Iterable<Type> types = const [LocationAreaEncounterDetail, _$LocationAreaEncounterDetail];

  @override
  final String wireName = r'LocationAreaEncounterDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaEncounterDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'min_level';
    yield serializers.serialize(
      object.minLevel,
      specifiedType: const FullType(int),
    );
    yield r'max_level';
    yield serializers.serialize(
      object.maxLevel,
      specifiedType: const FullType(int),
    );
    if (object.chance != null) {
      yield r'chance';
      yield serializers.serialize(
        object.chance,
        specifiedType: const FullType(int),
      );
    }
    if (object.method != null) {
      yield r'method';
      yield serializers.serialize(
        object.method,
        specifiedType: const FullType(EncounterMethodSummary),
      );
    }
    yield r'condition_values';
    yield serializers.serialize(
      object.conditionValues,
      specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueSummary)]),
    );
    yield r'pokemon_details';
    yield object.pokemonDetails == null ? null : serializers.serialize(
      object.pokemonDetails,
      specifiedType: const FullType.nullable(EncounterPokemonDetail),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaEncounterDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaEncounterDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'min_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.minLevel = valueDes;
          break;
        case r'max_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxLevel = valueDes;
          break;
        case r'chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.chance = valueDes;
          break;
        case r'method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EncounterMethodSummary),
          ) as EncounterMethodSummary?;
          if (valueDes == null) continue;
          result.method.replace(valueDes);
          break;
        case r'condition_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueSummary)]),
          ) as BuiltList<EncounterConditionValueSummary>;
          result.conditionValues.replace(valueDes);
          break;
        case r'pokemon_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(EncounterPokemonDetail),
          ) as EncounterPokemonDetail?;
          if (valueDes == null) continue;
          result.pokemonDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaEncounterDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaEncounterDetailBuilder();
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


