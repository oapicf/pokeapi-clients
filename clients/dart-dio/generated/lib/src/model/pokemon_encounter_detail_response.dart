//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/encounter_method_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/encounter_condition_value_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_encounter_detail_response.g.dart';

/// PokemonEncounterDetailResponse
///
/// Properties:
/// * [chance] - Percent chance that this encounter will occur.
/// * [conditionValues] - A list of condition values that must be in effect for this encounter to occur.
/// * [maxLevel] - The highest level the Pokémon could be encountered at.
/// * [method] - The method by which this encounter happens.
/// * [minLevel] - The lowest level the Pokémon could be encountered at.
@BuiltValue()
abstract class PokemonEncounterDetailResponse implements Built<PokemonEncounterDetailResponse, PokemonEncounterDetailResponseBuilder> {
  /// Percent chance that this encounter will occur.
  @BuiltValueField(wireName: r'chance')
  int get chance;

  /// A list of condition values that must be in effect for this encounter to occur.
  @BuiltValueField(wireName: r'condition_values')
  BuiltList<EncounterConditionValueSummary> get conditionValues;

  /// The highest level the Pokémon could be encountered at.
  @BuiltValueField(wireName: r'max_level')
  int get maxLevel;

  /// The method by which this encounter happens.
  @BuiltValueField(wireName: r'method')
  EncounterMethodSummary get method;

  /// The lowest level the Pokémon could be encountered at.
  @BuiltValueField(wireName: r'min_level')
  int get minLevel;

  PokemonEncounterDetailResponse._();

  factory PokemonEncounterDetailResponse([void updates(PokemonEncounterDetailResponseBuilder b)]) = _$PokemonEncounterDetailResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonEncounterDetailResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonEncounterDetailResponse> get serializer => _$PokemonEncounterDetailResponseSerializer();
}

class _$PokemonEncounterDetailResponseSerializer implements PrimitiveSerializer<PokemonEncounterDetailResponse> {
  @override
  final Iterable<Type> types = const [PokemonEncounterDetailResponse, _$PokemonEncounterDetailResponse];

  @override
  final String wireName = r'PokemonEncounterDetailResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonEncounterDetailResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'chance';
    yield serializers.serialize(
      object.chance,
      specifiedType: const FullType(int),
    );
    yield r'condition_values';
    yield serializers.serialize(
      object.conditionValues,
      specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueSummary)]),
    );
    yield r'max_level';
    yield serializers.serialize(
      object.maxLevel,
      specifiedType: const FullType(int),
    );
    yield r'method';
    yield serializers.serialize(
      object.method,
      specifiedType: const FullType(EncounterMethodSummary),
    );
    yield r'min_level';
    yield serializers.serialize(
      object.minLevel,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonEncounterDetailResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonEncounterDetailResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.chance = valueDes;
          break;
        case r'condition_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueSummary)]),
          ) as BuiltList<EncounterConditionValueSummary>;
          result.conditionValues.replace(valueDes);
          break;
        case r'max_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxLevel = valueDes;
          break;
        case r'method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EncounterMethodSummary),
          ) as EncounterMethodSummary;
          result.method.replace(valueDes);
          break;
        case r'min_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.minLevel = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonEncounterDetailResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonEncounterDetailResponseBuilder();
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


